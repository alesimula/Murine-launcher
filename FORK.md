# Murine Categories

This fork adds optional category tabs and bottom app-drawer search to Murine Launcher.
It starts from upstream commit `1c0d0d3` on `main`. It keeps Murine's home-screen,
widget, icon, drawer styling, and gesture settings.

## Install and configure

The standard build is `aospWithoutQuickstepDebug`. It needs no root access and installs
as **Murine Categories**, package `io.github.rafaeltj13.murine.debug`, alongside Murine.
Installing it does not change your default launcher or import another launcher's data.
Use Android's default Home app settings when you are ready to switch.

In launcher settings, open **App drawer**:

- **Category tabs** enables editable groups with a fixed, horizontally scrollable bottom
  icon row with 48 dp touch targets. Category names remain available to accessibility
  services. It replaces the ordinary app list with one category at a time. There is no
  All apps category. With this option off, the original drawer remains available.
- **Bottom drawer search** moves the existing app search to the bottom. It is independent
  of categories and works with the original app list too.
- **Manage categories** creates, renames, reorders, and deletes categories, and lets you choose each
  category's icon. Long-pressing
  a category tab also opens its editing actions. The final tab button opens the manager.
- Long-press an app in the drawer or app-search results and choose **Move to category**.
  Select a group to pin its assignment, or **Use automatic category** to clear the correction.

Deleting a category moves its explicitly assigned apps to the fallback category. Apps
automatically mapped to a deleted category also fall back there. The fallback can be
renamed and moved but not deleted. Its tab is hidden when it has no visible apps.

Dense phone grids keep the requested column count and icon-size preference, but cap the
drawn icons to the cell width with a 12 dp horizontal gap. This prevents icons from
overlapping at eight columns without changing the home-screen icon size. Bottom search
also removes the unused top-search gutter when no profile tabs or floating header rows
need that space.

## Sorting and search

Sorting runs locally. Explicit assignments take priority over bundled exact-package rules,
then Android's coarse `ApplicationInfo.category` value is used. Unrecognized apps go to
Other. The initial groups are Games, Communication, Media, Productivity, News, Maps,
Tools, and Other. Apps are alphabetized within each group. No store scraping, network
classification, or new permission is involved. The bundled rule list is deliberately small;
manual corrections are expected for some apps.

Search uses Murine's existing app-search algorithm over all eligible apps, regardless of
the selected category. It preserves the existing hidden-app and Private Space behavior.
Search autofocus stays off by default and remains configurable. With bottom search on,
the search field stays above the keyboard; tabs hide while the keyboard/search is active.
Leaving search restores the category list. The last selected category is saved across
process restarts. Per-category scroll positions are held only in memory.

Personal and Work remain Android profile tabs, separate from user categories. Categories
filter those profile lists without merging them. Private Space remains Murine's protected
section rather than being redistributed into ordinary categories. This behavior needs
separate on-device validation before relying on it for a managed or private profile.

## Backup

Definitions, explicit assignments, both feature switches, and the last category use
`LauncherPrefs` entries in the preference file already included by Murine's `.rat` backup
and Android backup. Category ids are stable across renames and reordering. Personal-app
assignments use a portable package key. Non-personal profile assignments additionally use
an installation-local random id and profile serial, so a cross-device restore cannot
silently assign a correction to an unrelated profile. Those profiles reclassify automatically
in a different installation or device and can be corrected again.

## Build

Use JDK 21 and Android SDK platform `android-37.2`. The wrapper pins Gradle 9.7.1 with
a SHA-256 checksum. Wrapper scripts and the wrapper jar were regenerated together. Set `ANDROID_HOME` or write `sdk.dir` to an untracked `local.properties`.

```sh
./gradlew :testAospWithoutQuickstepDebugUnitTest :assembleAospWithoutQuickstepDebug
```

The APK is under `build/outputs/apk/aospWithoutQuickstep/debug/`. Debug builds use your
local Android debug key; keep that key if you want future local builds to update the same
installation. Build artifacts from another machine may need a different signing setup.

The unit tests cover assignment precedence, profile separation, deleting groups, unknown
apps, invalid backup data, and persistence of custom names, order, and assignments.
Runtime layout checks use an isolated Android 16 emulator and the connected Moto Edge 60 Pro.
Physical-phone widget migration remains untested.

## Validation on 2026-10-20

- `:assembleAospWithoutQuickstepDebug` passed and produced a signed debug APK.
- `:testAospWithoutQuickstepDebugUnitTest` passed all 13 tests, including category-icon
  persistence and older backups.
- Android 16 / API 36 emulator checks passed with gesture navigation at 1080 x 2400:
  all four combinations of the two switches, the original alphabetical drawer with both
  off, global app search from another category, search above the keyboard, hidden tabs
  during search, opening the drawer by swipe with normal animations, manual app
  reassignment, creating a custom category, and retaining the
  category and assignment after a process restart. Cold starts wait for Murine's app model
  to load before evaluating the app list.
- Moto Edge 60 Pro checks confirmed eight-column spacing, icon tabs, global app search,
  search above the Portuguese keyboard, and hiding tabs while typing.
- The emulator icon chooser saved a custom icon for an existing custom category.
- Model tests exercise rename/reorder/delete and category-state backup round trips.
  Actual `.rat` archive export/restore and physical-phone widget migration were not exercised.
- Full-project lint reported 615 errors and 835 warnings, including inherited wallpaper
  permissions, translations, format strings, and API checks. The one new warning, drawable
  compatibility loading in the icon picker, was fixed with `AppCompatResources`; a focused
  lint recheck found no remaining compatibility-loading warnings in the new drawer code.
  The remaining 615 errors and 834 warnings are inherited and are not suppressed globally.
  The detailed report is generated at
  `build/reports/lint-results-aospWithoutQuickstepDebug.html`.

## Maintain

The local Git remotes are `origin` for this fork and `upstream` for alesimula/Murine-launcher.
Keep the feature work on `feat/category-drawer` while it is being tested. Update from
upstream on a separate branch, then re-run the unit tests, build, and drawer checks before
using it as your daily launcher.

The model, classifier, persistence adapter, category dialogs, and tab controller live in
`src/app/murinelauncher/drawer/`. Changes in inherited code are limited to preferences,
the app metadata field, drawer layout/filtering, IME handling, and app shortcut registration.
New strings are in the English and Italian `strings_murine.xml` files; other locales fall
back to English for these strings. Missing-translation lint is suppressed only for these
new entries, following the upstream English-and-Italian-first localization policy.

This derivative retains the original Apache-2.0 license and NOTICE, including the component
attributions. Modified inherited files carry a fork notice. This project is independent of
upstream Murine and Smart Launcher.
