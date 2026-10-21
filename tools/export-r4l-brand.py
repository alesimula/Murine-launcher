#!/usr/bin/env python3
# Copyright 2026 r4l.launcher contributors. Licensed under Apache-2.0.
"""Export the launcher SVG as Android vectors and web/store PNGs.

Run from the repository root. Requires ImageMagick. Generated concept art is
kept separately; the SVG is the canonical, editable product icon.
"""
from pathlib import Path
import subprocess
import xml.etree.ElementTree as ET

ANDROID = 'http://schemas.android.com/apk/res/android'
SVG = 'http://www.w3.org/2000/svg'
ET.register_namespace('', SVG)
SOURCE = Path('image/brand/r4l-launcher-mark.svg')
paths = ET.parse(SOURCE).getroot().findall(f'{{{SVG}}}path')
attributes = {
    'd': 'pathData', 'fill': 'fillColor', 'stroke': 'strokeColor',
    'stroke-width': 'strokeWidth', 'stroke-linecap': 'strokeLineCap',
    'stroke-linejoin': 'strokeLineJoin',
}


def vector(monochrome=False, legacy=False):
    scale, offset = (0.84, 13.68) if legacy else (0.62, 24.24)
    content = []
    if legacy:
        content.append('<path android:fillColor="@color/ic_launcher_background" '
                       'android:pathData="M54,0 A54,54 0,1 1,54,108 A54,54 0,1 1,54,0"/>')
    content.append(f'<group android:scaleX="{scale}" android:scaleY="{scale}" '
                   f'android:translateX="{offset}" android:translateY="{offset}">')
    for path in paths:
        values = []
        for svg_name, android_name in attributes.items():
            if svg_name not in path.attrib:
                continue
            value = path.attrib[svg_name]
            if value == 'none':
                value = '#00000000'
            elif monochrome and svg_name in ('fill', 'stroke'):
                value = '#000000'
            values.append(f'android:{android_name}="{value}"')
        content.append('<path ' + ' '.join(values) + '/>')
    content.append('</group>')
    return ('<?xml version="1.0" encoding="utf-8"?>\n'
            '<!-- Source: image/brand/r4l-launcher-mark.svg -->\n'
            f'<vector xmlns:android="{ANDROID}" android:width="108dp" android:height="108dp" '
            'android:viewportWidth="108" android:viewportHeight="108">\n'
            + '\n'.join(content) + '\n</vector>\n')


for variant in ('foreground', 'monochrome', 'legacy'):
    Path(f'res/drawable/ic_launcher_{variant}.xml').write_text(
        vector(monochrome=variant == 'monochrome', legacy=variant == 'legacy'))
for path in paths:
    path.tail = None
svg_paths = '\n'.join(ET.tostring(path, encoding='unicode') for path in paths)
icon = ('<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 108 108">'
        '<rect width="108" height="108" rx="24" fill="#1D242B"/>'
        f'<g transform="translate(13.68 13.68) scale(.84)">{svg_paths}</g></svg>\n')
for folder, names, artwork in (
    ('image/app_icon', ('icon.svg', 'icon_browser_fullsize.svg'), icon),
    ('image/app_icon', ('icon_freeform.svg', 'foreground_57pt.svg'), SOURCE.read_text()),
    ('docs/assets/img', ('icon_adaptive_baked.svg', 'icon_adaptive_glow.svg'), icon),
    ('docs/assets/img', ('icon_freeform_baked.svg', 'icon_freeform_glow.svg'), SOURCE.read_text()),
):
    for name in names:
        Path(folder, name).write_text(artwork)
for target, source in (
    ('ic_default_foreground.xml', 'ic_launcher_foreground.xml'),
    ('ic_default_background.xml', 'ic_launcher_background.xml'),
    ('background_gradient_native.xml', 'ic_launcher_background.xml'),
    ('background_gradient_overscan.xml', 'ic_launcher_background.xml'),
):
    Path('image/app_icon', target).write_text(Path('res/drawable', source).read_text())
for source, target, size in (
    (SOURCE, 'image/brand/r4l-launcher-logo.png', '1024x1024'),
    ('image/app_icon/icon.svg', 'ic_launcher-playstore.png', '512x512'),
    ('image/app_icon/icon.svg', 'fastlane/metadata/android/en-US/images/icon.png', '512x512'),
):
    subprocess.run(['magick', '-background', 'none', '-density', '1536', str(source), '-resize', size, '-depth', '8', 'PNG32:' + target], check=True)
print('Exported launcher SVG, Android vectors, and PNG icons.')
