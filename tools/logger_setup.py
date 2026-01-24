from __future__ import annotations

import logging
from logging.handlers import RotatingFileHandler
from pathlib import Path

from tools.config import PATHS

def setup_logger(name: str, level: int = logging.INFO) -> logging.Logger:
	"""
	Consistent console + rotating file logging.
	"""
	logger = logging.getLogger(name)

	# Avoid double handlers if re-imported
	if logger.handlers:
		return logger

	logger.setLevel(level)

	fmt = logging.Formatter(
		fmt="%(asctime)s | %(levelname)s | %(name)s | %(message)s",
		datefmt="%Y-%m-%d %H:%M:%S",
	)

	console = logging.StreamHandler()
	console.setLevel(level)
	console.setFormatter(fmt)
	logger.addHandler(console)

	log_file: Path = PATHS.logs_dir / "tools.log"
	log_file.parent.mkdir(parents=True, exist_ok=True)

	file_handler = RotatingFileHandler(
		log_file,
		maxBytes=2_000_000,
		backupCount=5,
		encoding="utf-8",
	)
	file_handler.setLevel(logging.DEBUG)
	file_handler.setFormatter(fmt)
	logger.addHandler(file_handler)

	return logger
