from __future__ import annotations

from tools.config import ensure_dirs, MOD, PATHS
from tools.utils.json_utils import write_json

def main() -> None:
    ensure_dirs()

    block_id = "fermenter"
    # You would also generate:
    # - models/block/fermenter.json
    # - models/block/fermenter_on.json
    # and textures, etc.

    blockstate = {
        "variants": {
            "activated=false": {"model": f"{MOD.mod_id}:block/{block_id}"},
            "activated=true":  {"model": f"{MOD.mod_id}:block/{block_id}_on"},
        }
    }

    write_json(PATHS.blockstates / f"{block_id}.json", blockstate)

if __name__ == "__main__":
    main()
