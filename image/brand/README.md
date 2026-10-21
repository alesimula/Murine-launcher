# r4l.launcher brand assets

The launcher uses a dedicated home-and-app-grid symbol. A violet roof sits above four rounded app tiles. It shares the charcoal, off-white, and violet palette of [R4L Blog v2](https://r4l-blog-v2.vercel.app/), while having its own product icon.

## Files

- `r4l-launcher-mark.svg`: canonical editable icon, built with five geometric paths.
- `r4l-launcher-logo.png`: clean 1024 × 1024 transparent export of the SVG.
- `r4l-launcher-icon-concept.png`: original imagegen concept. Production exports use the clean SVG geometry.
- `r4l-launcher-cover.png`: generated project cover updated with the launcher symbol.
- `../app_icon/icon.svg`: square web/store icon.
- `../../ic_launcher-playstore.png`: 512 × 512 store icon.
- Android adaptive foreground, legacy, and monochrome vectors live in `res/drawable/ic_launcher_*.xml`.
- `archive/`: previous monogram artwork and its generation prompts, retained for reference.

Palette: charcoal `#1D242B`, off-white `#EDF7FF`, violet `#6554F4`. Debug builds use a darker violet background. Android themed icons use the same roof-and-grid shape in one color. Android settings continue using Material dynamic colors.

## Generation and production

The concept and updated cover were created with the built-in image generation tool. The icon concept was rebuilt as simple SVG paths for exact corners, spacing, and sharp output at small sizes. The SVG is the source for both the Android vectors and PNG exports.

Icon concept prompt:

> Use case: logo-brand.
> Asset type: final Android launcher app icon foreground for r4l.launcher.
> Create a new product symbol that communicates a customizable Android home screen and app drawer. A bold, softly rounded violet roof / upward home chevron above a compact 2 by 2 grid of four off-white rounded square app tiles. The roof and tiles should form one balanced, memorable home-shaped silhouette, with generous consistent charcoal/transparent gaps. One upper tile may be violet to relate the roof to the app grid. Primary concept is HOME + APP GRID. Use a clear simple geometry with substantial shapes, clean edges, and consistent rounded corners, readable at 24 px. Palette only electric violet #6554F4 and off-white #EDF7FF. Transparent background. Center one isolated symbol with generous margin, square canvas, frontal flat vector-like graphic design.
> No lettering, no R4L monogram, no letters or numbers, no website logo, no rocket, no Android robot, no phone mockup, no outer icon container, no shadow, no gradient, no texture, no 3D, no tiny details, no presentation sheet. This should look like a polished dedicated Android launcher icon, belonging to a charcoal-and-violet personal software brand through color alone.

Cover edit prompt:

> Edit image 1, the r4l.launcher project cover. Replace only the large angular R4L monogram on the left with the dedicated Android launcher product symbol in image 2: a rounded violet roof above a 2 by 2 grid of rounded app tiles, three off-white tiles and the upper-right tile violet. Keep this new symbol flat and clean, exactly matching image 2 geometry and colors, no R4L letters. Place it with comfortable margins in the same left-hand area, optically balanced with the text. Preserve the original landscape dimensions, all background charcoal grid and violet diagonal details, all category illustrations on bottom right, the exact 'r4l.launcher' wordmark, and exact 'Your home. Your categories.' caption. Remove the old monogram completely without ghosting or residue. No other changes.

## Exports

Run `python3 tools/export-r4l-brand.py` from the repository root with ImageMagick installed. This exports native Android vectors, matching web icons, the transparent logo PNG, and 512 px store icons. It leaves the original generated concept and cover untouched.

Refresh the store feature graphic after a cover edit:

```sh
magick image/brand/r4l-launcher-cover.png -resize 1024x500 -background '#1D242B' -gravity center -extent 1024x500 -depth 8 fastlane/metadata/android/en-US/images/featureGraphic.png
```

## Compatibility

The public project name is `r4l.launcher`. The existing `io.github.rafaeltj13.murine` application ID, implementation packages, preference keys, backup format, and `murine-home` import scheme remain unchanged. A build signed with the existing key can update the installed launcher and retain its data. Original upstream copyright notices and dependency names remain intact.

