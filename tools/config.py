from __future__ import annotations

from dataclasses import dataclass
from pathlib import Path
from typing import Final

# ============================================================================
# Core mod metadata
# ============================================================================


@dataclass(frozen=True, slots=True)
class ModMeta:
    mod_id: str = "taob"
    mod_name: str = "The Art of Brewing"
    minecraft_version: str = "1.21.11"
    java_version: int = 21


MOD: Final[ModMeta] = ModMeta()

# ============================================================================
# Paths (repo-root relative)
# ============================================================================


def repo_root() -> Path:
    """
    Resolve repository root by walking up from tools/ directory.
    Assumes this file lives at: <repo>/tools/config.py
    """
    return Path(__file__).resolve().parents[1]


@dataclass(frozen=True, slots=True)
class Paths:
    root: Path
    # sources
    src_main: Path
    src_client: Path
    # resources
    res_main: Path
    res_client: Path
    # canonical output roots
    assets_root: Path
    data_root: Path
    # assets/<modid>
    assets_mod: Path
    textures: Path
    textures_item: Path
    textures_block: Path
    models: Path
    models_item: Path
    models_block: Path
    blockstates: Path
    lang: Path
    # data/<modid>
    data_mod: Path
    recipes: Path
    tags: Path
    tags_items: Path
    tags_blocks: Path
    loot_tables: Path
    advancements: Path
    # tools
    tools_dir: Path
    logs_dir: Path
    tmp_dir: Path


def compute_paths(root: Path, mod_id: str) -> Paths:
    src_main = root / "src" / "main"
    src_client = root / "src" / "client"
    res_main = src_main / "resources"
    res_client = src_client / "resources"
    assets_root = res_main / "assets"
    data_root = res_main / "data"
    assets_mod = assets_root / mod_id
    textures = assets_mod / "textures"
    models = assets_mod / "models"
    data_mod = data_root / mod_id
    tools_dir = root / "tools"
    logs_dir = tools_dir / "logs"
    tmp_dir = tools_dir / "tmp"
    return Paths(
        root=root,
        src_main=src_main,
        src_client=src_client,
        res_main=res_main,
        res_client=res_client,
        assets_root=assets_root,
        data_root=data_root,
        assets_mod=assets_mod,
        textures=textures,
        textures_item=textures / "item",
        textures_block=textures / "block",
        models=models,
        models_item=models / "item",
        models_block=models / "block",
        blockstates=assets_mod / "blockstates",
        lang=assets_mod / "lang",
        data_mod=data_mod,
        recipes=data_mod / "recipes",
        tags=data_mod / "tags",
        tags_items=data_mod / "tags" / "items",
        tags_blocks=data_mod / "tags" / "blocks",
        loot_tables=data_mod / "loot_tables",
        advancements=data_mod / "advancements",
        tools_dir=tools_dir,
        logs_dir=logs_dir,
        tmp_dir=tmp_dir,
    )


PATHS: Final[Paths] = compute_paths(repo_root(), MOD.mod_id)


def ensure_dirs() -> None:
    """
    Create all directories required for generation.
    Safe to call multiple times.
    """
    dirs = [
        PATHS.assets_mod,
        PATHS.textures_item,
        PATHS.textures_block,
        PATHS.models_item,
        PATHS.models_block,
        PATHS.blockstates,
        PATHS.lang,
        PATHS.data_mod,
        PATHS.recipes,
        PATHS.tags_items,
        PATHS.tags_blocks,
        PATHS.loot_tables,
        PATHS.advancements,
        PATHS.logs_dir,
        PATHS.tmp_dir,
    ]
    for d in dirs:
        d.mkdir(parents=True, exist_ok=True)
