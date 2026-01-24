from __future__ import annotations

import re

_VALID_ID = re.compile(r"^[a-z0-9_]+$")

def normalize_id(value: str) -> str:
	"""
	Convert arbitrary string into a valid Minecraft identifier:
	- lower-case
	- spaces/dashes -> underscores
	- strip invalid characters
	- collapse multiple underscores
	"""
	v = value.strip().lower()
	v = v.replace("-", "_").replace(" ", "_")
	v = re.sub(r"[^a-z0-9_]", "", v)
	v = re.sub(r"_+", "_", v)
	v = v.strip("_")
	return v

def assert_valid_id(value: str) -> None:
	"""
	Raise ValueError if not a valid Minecraft identifier.
	"""
	if not value or not _VALID_ID.match(value):
		raise ValueError(f"Invalid Minecraft id: {value!r}")

def namespaced(mod_id: str, path: str) -> str:
	assert_valid_id(mod_id)
	assert_valid_id(path)
	return f"{mod_id}:{path}"
