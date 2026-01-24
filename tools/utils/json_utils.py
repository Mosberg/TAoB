from __future__ import annotations

import json
from pathlib import Path
from typing import Any

from tools.logger_setup import setup_logger

log = setup_logger(__name__)

def write_json(path: Path, data: Any) -> None:
	"""
	Deterministic JSON writer:
	- UTF-8
	- indent=2
	- sort_keys=True
	- newline at EOF
	"""
	path.parent.mkdir(parents=True, exist_ok=True)
	encoded = json.dumps(data, ensure_ascii=False, indent=2, sort_keys=True)
	path.write_text(encoded + "\n", encoding="utf-8")
	log.info("Wrote JSON: %s", path.as_posix())

def read_json(path: Path) -> Any:
	return json.loads(path.read_text(encoding="utf-8"))

def is_valid_json(path: Path) -> bool:
	try:
		read_json(path)
		return True
	except Exception:
		return False
