# TAoB Alcohol Brewing Guide (Design Doc)

This document defines **suggested** brewing recipes and methods for each TAoB alcohol type, using Minecraft items as ingredient proxies plus a schema-driven pipeline (ferment → optional distill → optional age → optional infuse).
Real-world references are used only to justify the general production _method families_ (beer brewing steps, mead fermentation, absinthe botanicals, barrel aging of spirits). [web:72][web:76][web:83][web:77]

---

## Common brewing pipeline

### Fermented beverages (beer styles, cider, wine, mead)

Typical brewing/winemaking is: prepare sugars → add yeast → ferment → condition/age. [web:72][web:76]

### Distilled spirits (vodka, gin, rum, whiskey, brandy, absinthe)

These generally start with a fermented “wash,” then distillation concentrates alcohol, and many styles are optionally aged in barrels for flavor development. [web:77]

### Aging

Barrel aging is widely used for spirits like whiskey/rum/brandy and also appears in modern experiments for gin/absinthe; oak contact plus oxygen exchange changes flavor over time. [web:77]

---

## Ingredient categories used in TAoB

- Alcohol types: `taob:alcohol_types/*` (absinthe, ale, beer, brandy, cider, gin, lager, mead, rum, stout, vodka, whiskey, wine).
- Food items (fermentable base candidates): Apple, Beetroot, Carrot, Chorus Fruit, Dried Kelp, Glow Berries, Honey Bottle, Melon Slice, Potato, Sweet Berries.
- Seeds (grain/plant starters): Wheat Seeds, Beetroot Seeds, Pumpkin Seeds, Melon Seeds, Torchflower Seeds, Pitcher Pod.
- Base ingredients (brewing catalysts/modifiers): Nether wart, Redstone dust, Glowstone dust, Fermented spider eye, Gunpowder, Dragon’s breath. [web:56]
- Effect ingredients (optional “modifier” ingredients): Sugar, Golden Carrot, Glistering Melon Slice, Spider Eye, Blaze Powder, Ghast Tear, Pufferfish, Magma Cream, Rabbit’s Foot, Phantom Membrane, Turtle Shell. [web:56]
- Botanicals (flavor layer): Leaves, small flowers, tall flowers, and “other flowers” lists from your curated ingredient set.

---

## Alcohol types

### Absinthe

**Flavor intent:** herbal + aromatic, traditionally built on wormwood/anise/fennel-style botanicals. [web:83]

**Suggested TAoB ingredients**

- Fermentable base: Honey Bottle (clean sweetness) or Sweet Berries (herbal-fruit).
- Botanicals: Dandelion (herbal), Wither Rose (bitter “wormwood” proxy), any green leaves (Oak Leaves / Jungle Leaves).
- Optional modifiers: Sugar (sweeten), Glowstone dust (intensity/potency).

**Method**

1. Ferment base into a strong herbal wash.
2. Distill once to concentrate.
3. Optional: Age briefly in an Oak-barrel phase for complexity (experimental but plausible). [web:77]
4. Infuse botanicals post-distillation (or during distillation, depending on your system rules).

---

### Ale

**Flavor intent:** malt-forward beer.

**Suggested TAoB ingredients**

- Fermentable base: Wheat Seeds (+ optional Potato for extra fermentables).
- Botanicals: small flowers (e.g., Cornflower, Azure Bluet) as “hop/spice proxies.”
- Optional modifiers: Redstone dust (extended fermentation/conditioning), Glowstone dust (stronger brew).

**Method**

1. Mash/steep grain-derived fermentables, then boil and ferment. [web:72]
2. Condition (short aging) to smooth the profile. [web:72]

---

### Beer

**Flavor intent:** general beer baseline.

**Suggested TAoB ingredients**

- Fermentable base: Wheat Seeds.
- Botanicals: Torchflower Seeds (bitter/aromatic “hop proxy”) or small flowers.
- Optional modifiers: Redstone dust (longer conditioning), Glowstone dust (strength).

**Method**

1. Grain to wort (mash), boil, ferment, then condition. [web:72]

---

### Brandy

**Flavor intent:** distilled fruit spirit, often aged.

**Suggested TAoB ingredients**

- Fermentable base: Apple or Melon Slice (fruit wine base).
- Botanicals: minimal (keep clean), optional Rose Bush / Peony for “fruit-floral” notes.
- Optional modifiers: Glowstone dust (spirit strength), Redstone dust (aging duration).

**Method**

1. Ferment fruit base into “wine.”
2. Distill into brandy-style spirit.
3. Age in barrel (recommended) to add complexity. [web:77]

---

### Cider

**Flavor intent:** fermented fruit beverage.

**Suggested TAoB ingredients**

- Fermentable base: Apple (primary), optional Sweet Berries for variation.
- Botanicals: minimal; optional Dandelion for a drier, herbal edge.
- Optional modifiers: Redstone dust (condition longer).

**Method**

1. Press/steep fruit sugars and ferment.
2. Condition briefly before serving (or keg/bottle in your system).

---

### Gin

**Flavor intent:** neutral spirit flavored by botanicals (juniper-like profile).

**Suggested TAoB ingredients**

- Fermentable base: Potato (neutral-ish), optionally Carrot (light sweetness).
- Botanicals: Spruce Leaves (juniper proxy), Blue Orchid / Allium (aromatics).
- Optional modifiers: Blaze Powder (sharp “dry” punch), Sugar (balance).

**Method**

1. Ferment into a neutral wash.
2. Distill into a clean spirit.
3. Infuse botanicals to create gin character; optional barrel aging if you support it. [web:77]

---

### Lager

**Flavor intent:** clean, crisp beer (cold-conditioned concept).

**Suggested TAoB ingredients**

- Fermentable base: Wheat Seeds.
- Botanicals: very light (e.g., Azure Bluet) or none.
- Optional modifiers: Redstone dust (longer conditioning to simulate lagering).

**Method**

1. Brew like beer (mash/boil/ferment). [web:72]
2. Extend conditioning time to represent lager-style finishing. [web:72]

---

### Mead

**Flavor intent:** honey wine; honey + water + yeast fermentation. [web:76]

**Suggested TAoB ingredients**

- Fermentable base: Honey Bottle (primary).
- Botanicals: Allium (spice), Dandelion (herbal), Spore Blossom (wild floral).
- Optional modifiers: Glowstone dust (strong mead), Redstone dust (aged mead).

**Method**

1. Dilute honey base and ferment with yeast; mead is fundamentally honey fermented with yeast. [web:76]
2. Condition/age to smooth (optional, but recommended). [web:72]

---

### Rum

**Flavor intent:** sugar-derived spirit, often aged.

**Suggested TAoB ingredients**

- Fermentable base: Sugar (effect ingredient) + Potato (bulk fermentables) or Sweet Berries.
- Botanicals: optional (keep minimal), or use Mangrove Leaves for earthy notes.
- Optional modifiers: Blaze Powder (punch), Redstone dust (aging).

**Method**

1. Ferment a sugar-heavy wash.
2. Distill into rum.
3. Age in barrel for depth (recommended). [web:77]

---

### Stout

**Flavor intent:** dark, rich beer.

**Suggested TAoB ingredients**

- Fermentable base: Wheat Seeds + Beetroot (color/body proxy).
- Botanicals: Wither Rose (bitter), Dark Oak Leaves (roasty/earthy vibe).
- Optional modifiers: Glowstone dust (imperial stout), Redstone dust (conditioning).

**Method**

1. Brew like beer (mash/boil/ferment/condition). [web:72]
2. Emphasize darker ingredients as your TAoB “roast” substitute.

---

### Vodka

**Flavor intent:** very neutral distilled spirit.

**Suggested TAoB ingredients**

- Fermentable base: Potato (classic neutral proxy).
- Botanicals: none (or _very_ minimal, e.g., one leaf type).
- Optional modifiers: Glowstone dust (proof), Dragon’s breath (premium/“refined” batch marker).

**Method**

1. Ferment neutral wash.
2. Distill (potentially multiple passes in your system) for cleanliness.
3. Optional: no barrel aging (keep neutral), unless you support special variants.

---

### Whiskey

**Flavor intent:** grain spirit + barrel aging.

**Suggested TAoB ingredients**

- Fermentable base: Wheat Seeds (grain proxy).
- Botanicals: none (or minimal), let aging do the work.
- Optional modifiers: Redstone dust (age longer), Glowstone dust (stronger).

**Method**

1. Ferment grain wash.
2. Distill into whiskey new-make.
3. Age in barrel; barrel aging is a key driver of whiskey-like complexity. [web:77]

---

### Wine

**Flavor intent:** fermented fruit beverage.

**Suggested TAoB ingredients**

- Fermentable base: Sweet Berries (red wine proxy), Glow Berries (white/golden proxy), Melon Slice (light wine proxy).
- Botanicals: optional Rose Bush / Lilac (aroma).
- Optional modifiers: Redstone dust (aging), Sugar (back-sweeten).

**Method**

1. Ferment fruit sugars into wine.
2. Condition/age to round it out. [web:72]
