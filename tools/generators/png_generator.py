from __future__ import annotations

from dataclasses import dataclass
from pathlib import Path
from typing import Tuple

from tools.logger_setup import setup_logger

log = setup_logger(__name__)

try:
	from PIL import Image  # type: ignore
except Exception:  # pragma: no cover
	Image = None  # type: ignore

@dataclass(frozen=True, slots=True)
class PngRules:
	max_bytes: int = 100_000
	allowed_sizes: Tuple[Tuple[int, int], ...] = ((16, 16), (32, 32), (64, 64), (128, 128))
	allowed_modes: Tuple[str, ...] = ("RGB", "RGBA")

RULES = PngRules()

def validate_png(path: Path) -> bool:
	if Image is None:
		raise RuntimeError("Pillow is not installed. Install with: pip install pillow")

	if not path.exists():
		log.error("PNG missing: %s", path.as_posix())
		return False

	if path.suffix.lower() != ".png":
		log.error("Not a PNG: %s", path.as_posix())
		return False

	size_bytes = path.stat().st_size
	if size_bytes > RULES.max_bytes:
		log.error("PNG too large (%d bytes): %s", size_bytes, path.as_posix())
		return False

	img = Image.open(path)
	if img.mode not in RULES.allowed_modes:
		log.error("Bad PNG mode (%s): %s", img.mode, path.as_posix())
		return False

	if img.size not in RULES.allowed_sizes:
		log.error("Bad PNG size (%s): %s", img.size, path.as_posix())
		return False

	return True

def write_solid_png(path: Path, size: Tuple[int, int], rgba: Tuple[int, int, int, int]) -> None:
	if Image is None:
		raise RuntimeError("Pillow is not installed. Install with: pip install pillow")

	path.parent.mkdir(parents=True, exist_ok=True)
	img = Image.new("RGBA", size, rgba)
	img.save(path, "PNG", optimize=True)
	log.info("Wrote PNG: %s", path.as_posix())
