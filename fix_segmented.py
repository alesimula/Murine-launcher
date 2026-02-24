import os

path = r"C:\Users\Alex\StudioProjects\Murine-launcher\src\app\murinelauncher\settings\SettingsHomeFragment.kt"

with open(path, "r", encoding="utf-8") as f:
    content = f.read()

old = "                    // Explicitly hide the remaining unused slots in the layout"
new = """                    // Make configured buttons visible (all start as gone in layout)
                    setButtonVisibility(0, true)
                    setButtonVisibility(1, true)

                    // Explicitly hide the remaining unused slots in the layout"""

if old in content:
    content = content.replace(old, new)
    with open(path, "w", encoding="utf-8") as f:
        f.write(content)
    print("SUCCESS: File updated.")
else:
    print("ERROR: Target string not found in file.")
    # Debug: print surrounding context
    idx = content.find("Explicitly")
    if idx >= 0:
        print(f"Found 'Explicitly' at index {idx}")
        print(repr(content[idx-50:idx+80]))
    else:
        print("'Explicitly' not found at all")
