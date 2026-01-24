# Batch Texture Generator (btg) for TAoB

The Batch Texture Generator (`btg`) is a Python toolkit for automating Minecraft: Java Edition resource and data asset generation for the TAoB Fabric mod. It supports both command-line and GUI workflows, enabling efficient batch processing of textures, palettes, models, items, and language files.

## Features

- **Palette Extraction**: Extracts RGBA color palettes from PNG textures for use in data-driven asset generation.
- **Palette Validation & Normalization**: Validates palette JSONs against schemas and normalizes color formats for consistency.
- **Batch Recoloring**: Recolors textures using palette swaps, supporting alpha and exact-match options.
- **Template-Based Generation**: Generates new textures from template PNGs and palette combinations, supporting multi-material overlays.
- **AutoTemplate**: Heuristically generates template definitions from template PNGs and available palettes.
- **Asset Generation**: Automatically creates item, model, and language JSON files for all generated textures, with correct namespace and overlay logic for flasks.
- **GUI**: A Tkinter-based graphical interface for all major workflows, with live log output and easy path selection.

## CLI Usage

Run `python tools/btg_v3.py <command> [options]` or use the GUI (`python tools/btg_gui_v3.py`).

### Commands

- `validate` — Validate all palette JSON files against local schemas.
- `normalize` — Normalize palettes to #RRGGBBAA format and fix casing.
- `extract` — Extract RGBA palettes from textures/_.png into palettes/_.json.
- `recolor` — Batch recolor textures using palette swaps.
- `generate` — Generate all texture combinations from \*.btg-template.json files and palettes.
- `autotemplate` — Auto-generate template JSONs from template PNGs and palettes.
- `assets` — Generate item, model, and lang JSON files for all textures in a directory.

Run with `--help` for detailed options for each command.

## Asset Generation Details

- **Model JSONs for Flasks**: Automatically adds a `layer1` fluid overlay for flask items:
  - Small flasks: `taob:item/flasks/fluid/small_flask_fluid_overlay`
  - Medium flasks: `taob:item/flasks/fluid/medium_flask_fluid_overlay`
  - Large flasks: `taob:item/flasks/fluid/large_flask_fluid_overlay`
- **Other Items**: Use a single `layer0` texture reference.
- **Language Keys**: Generated as `item.taob.<subpath>` with humanized names.

## GUI Usage

Run `python tools/btg_gui_v3.py` to launch the graphical interface. All major workflows are available as tabs:

- **Validate**: Check palettes against schemas.
- **Normalize**: Fix palette color formats.
- **Extract**: Extract palettes from textures.
- **Recolor**: Batch recolor textures.
- **Generate**: Create textures from templates and palettes.
- **AutoTemplate**: Generate template JSONs from PNGs.
- **Assets**: Generate item/model/lang JSONs for all textures.

## File/Folder Conventions

- **Textures**: `src/main/resources/assets/taob/textures/` or `output/textures/item/`
- **Palettes**: `palettes/`
- **Templates**: `textures_input/` or custom
- **Items/Models/Lang**: `output/items/`, `output/models/item/`, `output/lang/en_us.json`

## Advanced

- All commands support `--dry-run` to preview actions without writing files.
- Overlay logic for flasks is automatic; other overlays can be added by customizing the code.
- The codebase is modular and can be extended for new asset types or workflows.

## Requirements

- Python 3.8+
- Pillow (PIL)
- jsonschema
- Tkinter (for GUI)

## License

See LICENSE in the repository root.

---

For more details, see the code in `tools/btg_v3.py` and `tools/btg_gui_v3.py`.
