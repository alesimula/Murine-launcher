# r4l.launcher

This fork adds optional category tabs and bottom app-drawer search to Murine Launcher.
It starts from upstream commit `1c0d0d3` on `main`. It keeps Murine's home-screen,
widget, icon, drawer styling, and gesture settings.

## Branding and update compatibility

The project and GitHub fork are named **r4l.launcher**. The local checkout is
`/home/rafaelm/Documents/code/r4l.launcher`, and `origin` points to
`https://github.com/rafaeltj13/r4l.launcher.git`.

App labels, adaptive/legacy/themed icons, store artwork, README, and the bundled website
use the R4L identity. See [brand assets and generation prompts](image/brand/README.md).
The existing application ID, implementation packages, stored keys, and `.rat` backup
format are retained. A build signed with the same key can update Murine Categories while
preserving categories, home-screen layout, widgets, and settings. The `murine-home` icon
shape scheme remains compatible with the inherited editor. The crash screen no longer
points users at the upstream developer's email.

## Install and configure

The standard build is `aospWithoutQuickstepDebug`. It needs no root access and installs
as **r4l.launcher**, package `io.github.rafaeltj13.murine.debug`, alongside Murine.
Installing it does not change your default launcher or import another launcher's data.
Use Android's default Home app settings when you are ready to switch.

In launcher settings, open **App drawer**:

- **Category tabs** enables editable groups with the selected category's title directly above
  its app rows and a Material 3 category bar at the bottom. The bar measures its available
  width and fits whole 48 dp touch targets on each page.
  Swipe horizontally for more categories; dots indicate the current page. Category names
  remain available to accessibility services. It shows one category at a time. There is no
  All apps category. With this option off, the original drawer remains available.
- **Bottom drawer search** moves the existing app search to the bottom. With category tabs
  enabled, a fixed center search button opens the input over the category bar itself.
  With categories off, it remains a standalone search field above the original app list.
- **Manage categories** creates, renames, reorders, and deletes categories, and lets you
  choose each category's icon. Hold any category button to open Manage categories,
  then select a category to edit it or create a new one. It is also available in settings.
- Long-press an app in the drawer or app-search results and choose **Move to category**.
  Select a group to pin its assignment, or **Use automatic category** to clear the correction.

Deleting a category moves its explicitly assigned apps to the fallback category. Apps
automatically mapped to a deleted category also fall back there. The drawer immediately
selects that destination so the moved apps remain visible. A cold start retains a saved
fallback selection while the app model loads. The fallback can be renamed and moved but
not deleted. All empty categories are hidden from drawer navigation. Their definitions
remain in Manage categories and their tabs return when they have visible apps. Loading
the app model preserves the saved selection without temporarily showing empty tabs.

Dense phone grids keep the requested column count and icon-size preference, but cap the
drawn icons to the cell width with a 12 dp horizontal gap. This prevents icons from
overlapping at eight columns without changing the home-screen icon size. Bottom search
also removes the unused top-search gutter when no profile tabs or floating header rows
need that space.

Short category grids and their titles align together at the bottom above the drawer
controls, so the title stays just above the first app row. Grids that fill the available
height keep their title at the top of the grid and retain normal vertical scrolling.
The original drawer and search results keep their top alignment. Profile education cards
and Private Space sections retain their existing layout.

The category title uses bold Material 3 Title Large typography. The bar and category dialogs
use a scoped Material 3 dynamic-color theme, tonal selection, rounded icon buttons, and
ripples. The 40 dp visible icon-button shape sits inside a 48 dp touch target; reducing
visual padding does not reduce the touch target. Launcher3's activity theme stays intact.
The heading hides during search and grows with long names or larger system text.
Floating drawer controls follow **Drawer type**: search and categories share one surface,
a frosted pane with an edge highlight for Frosted, an opaque wallpaper-tinted surface for
MICA, or flat neutral grey for Translucent. They stay readable over scrolling apps and
update when the type changes. In the combined mode they also share the
same side margins, aligned with the app grid's horizontal padding. Search expands from
the center action while the category icons fade and contract; closing reverses the motion.
The existing input moves above the keyboard with an 8 dp gap. While search is open,
the app list ends 8 dp above the input so rows cannot scroll underneath it.
A separate 48 dp Back action closes search, clears the query, and restores the current
category. Motion respects Android's animator scale, including disabled animations.
Turning categories off restores the original search padding, alignment, and sizing;
bottom search keeps the drawer-type surface and the category bar's side margins. Turning both options off restores the
original search background and colors. Categories with top search retain their separate original field.

## Category gestures

Swipe left or right across the app grid to move to the next or previous category. Tapping
a category icon uses the same directional slide/fade transition for the title and grid. Motion
uses Material 3 shared-axis distance, emphasized easing, and the theme's medium duration,
and respects Android's animation scale. The first and last categories stop at the edge.
Category order follows reading direction in RTL layouts.

Horizontal intent must win before a category swipe takes ownership. Vertical scrolling,
app taps, long presses, back-edge gestures, the fast scroller, and search keep their own
handling. Short or cancelled horizontal drags settle back. The bottom icon bar continues
to page independently, and category scroll positions are preserved when switching.

## Sorting and search

Sorting runs locally. Explicit assignments take priority over bundled exact-package rules,
then Android's coarse `ApplicationInfo.category` value is used. Unrecognized apps go to
Other. The initial groups are Games, Communication, Media, Productivity, News, Maps,
Tools, and Other. Apps are alphabetized within each group. No store scraping, network
classification, or new permission is involved. The bundled rule list is deliberately small;
manual corrections are expected for some apps.

Search uses the inherited app-search algorithm over all eligible apps, regardless of
the selected category. It preserves the existing hidden-app and Private Space behavior.
Search autofocus stays off by default and remains configurable. With bottom search on,
the search field stays above the keyboard. In the combined mode it replaces the category
controls in the same bar, including for an empty focused query. Back and the close action
restore the category controls. Keyboard-dismissal events are handled after the IME
animation settles, so transient hidden insets while opening do not close the input.
Leaving search restores the category list. The last selected category is saved across
process restarts. Per-category scroll positions are held only in memory.

Personal and Work remain Android profile tabs, separate from user categories. Categories
filter those profile lists without merging them. Private Space remains the launcher's protected
section rather than being redistributed into ordinary categories. This behavior needs
separate on-device validation before relying on it for a managed or private profile.

## Backup

Definitions, explicit assignments, both feature switches, and the last category use
`LauncherPrefs` entries in the preference file already included by the launcher's `.rat` backup
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

## Version 1.2.6 phone update on 2026-10-21

Version `1.2.6`, code `10206`, was built and installed as an in-place update on the
Moto Edge 60 Pro. The signing certificate matched the previous installation. A private
local app-data backup was saved before installation. Drawer preferences, category state,
and home-screen database records matched before and after installation; drawer preferences
also matched after startup. The launcher remained the default Home app.

`:testAospWithoutQuickstepDebugUnitTest` passed all 33 tests, and
`:assembleAospWithoutQuickstepDebug` passed for this version.

## Dedicated launcher icon on 2026-10-21

The R4L monogram was replaced with a dedicated rounded roof and four app tiles.
The editable SVG produces matching native adaptive, legacy, and monochrome vectors,
store icons, and project-site artwork. The cover and store feature graphic use the same
symbol. Previous monogram masters are kept under `image/brand/archive/`.

`:assembleAospWithoutQuickstepDebug` passed after the icon update. AAPT2 verified the
new roof path in each of the three compiled icon variants. App identity and stored data
are unchanged. The 33 unit tests recorded below cover the earlier rebrand; this icon-only
revision was verified with the APK build and artwork inspection.

## Integrated search validation on 2026-10-21

- `:testAospWithoutQuickstepDebugUnitTest` passed all 35 tests with no failures or errors.
- `:assembleAospWithoutQuickstepDebug` produced the debug APK.
- Android 16 / API 36 emulator checks passed for opening the center action, keeping
  the focused input above the keyboard, searching globally from another category,
  and restoring the selected category with Back or the close action.
- All four combinations of category tabs and bottom search, search autofocus, and
  disabled animations passed. At 320 dp and 685 dp widths, the search action stays
  centered and retains a 48 dp touch target; the input opens and closes correctly.
- After removing the drawer's manage button, emulator checks confirmed that holding
  active or inactive category buttons opens full management, including create and edit
  actions. Normal category taps, centered search, and paging at 320 dp still work.
  Hold-to-manage also works with top search. The app was closed before installation
  and testing in a fresh emulator session.
- Search spacing checks measured an 8 dp gap above the keyboard and between the app
  list or search results and the input. Screenshots confirmed that the category surface
  fades away behind search instead of filling the keyboard gap. Closing search restores
  the category bar's original position.
- The final APK was installed on the Moto Edge 60 Pro and its hash matched the local
  build. Preferences and launcher databases were preserved byte-for-byte during the
  update. The original 30-second screen timeout was restored, and the updated UI was
  confirmed on the phone.

## Branding validation on 2026-10-21

- `:testAospWithoutQuickstepDebugUnitTest` passed all 33 tests with no failures or errors.
- `:assembleAospWithoutQuickstepDebug` produced `r4l.launcher-aosp-withoutQuickstep-debug.apk`.
- Compiled APK metadata retains `io.github.rafaeltj13.murine.debug`, min SDK 26, and target SDK 37.
- All 81 localized app-name resources, the main application label, and the Quickstep label use `r4l.launcher`.
- AAPT2 verified the final APK label and decoded the compiled adaptive foreground, monochrome, and legacy vectors.
- A full debug assemble also passed after moving the checkout to `r4l.launcher`.
- Store icon, generated cover, and website layout were visually inspected. No device was connected for runtime checks.

## Validation on 2026-10-20

- `:assembleAospWithoutQuickstepDebug` passed and produced a signed debug APK.
- `:testAospWithoutQuickstepDebugUnitTest` passed all 33 tests, including category-icon
  persistence, older backups, responsive page sizing, category selection while loading,
  gesture ownership/direction, and hiding/revealing empty categories.
- Android 16 / API 36 emulator checks passed with gesture navigation at 1080 x 2400:
  all four combinations of the two switches, the original alphabetical drawer with both
  off, global app search from another category, search above the keyboard, hidden tabs
  during search, opening the drawer by swipe with normal animations, manual app
  reassignment, creating a custom category, and retaining the
  category and assignment after a process restart. Cold starts wait for the app model
  to load before evaluating the app list.
- Moto Edge 60 Pro checks confirmed eight-column spacing, icon tabs, global app search,
  search above the Portuguese keyboard, and hiding tabs while typing.
- The emulator icon chooser saved a custom icon for an existing custom category.
- The animated category-swipe revision was installed on the Moto.
  Device checks passed for left/right navigation, first/last boundaries, short drags,
  app long presses, global search, and vertical scrolling with categories enabled.
  Scrolling used a temporary four-column grid; the original eight-column setting and
  selected category were restored. Category definitions and assignments stayed unchanged.
- Deletion checks cover custom manual assignments and automatic categories. Removed
  categories lead to Other with the moved apps visible, including after a process restart.
- Responsive M3 checks passed at 360 dp and 411 dp phone widths and a wider 685 dp layout,
  with whole category buttons, snapping pages, a pinned manage action, and correct heading
  placement. Long titles at 150% system text and both light/dark themes were checked.
- The bottom-aligned grid revision passed emulator checks for sparse and scrolling
  categories, both search placements, the original drawer, category swipes, global search,
  and retaining empty definitions for editing and later assignment. The same APK was
  then installed on the Moto. Device checks confirmed the bold title, bottom-aligned
  short grids with an 8 dp gap above search, hidden empty News, and both swipe directions.
  The final rows of longer categories remain reachable above search. Category definitions,
  assignments, the user's five-column setting, selection, and default Home app were preserved.
- The title-and-search revision is installed and checked on the Moto. Games and
  Communication keep the title 8 dp above the app cells; search and category controls
  have identical measured side edges and sampled surface colors. Category swipes,
  global search, keyboard placement, and returning from search pass. Category state,
  the chosen grid, selection, and default Home app stay unchanged. Emulator checks also
  cover top search, long-list scrolling, light/dark surfaces, and restoring the original
  search appearance by disabling categories and re-enabling it in the live launcher.
- Model tests exercise rename/reorder/delete and category-state backup round trips.
  Actual `.rat` archive export/restore and physical-phone widget migration were not exercised.
- Full-project lint reported 615 errors and 836 warnings. The two new warnings were
  addressed: page updates now use specific adapter range notifications, and the
  callback-constructed bar has a local, documented `ViewConstructor` exemption because
  it is never inflated from XML. A focused recheck passed with no new drawer findings
  for those two rules. The remaining
  615 errors and 834 warnings are inherited and are not suppressed globally.
  The detailed report is generated at
  `build/reports/lint-results-aospWithoutQuickstepDebug.html`. A focused lint pass for
  touch accessibility, recycled objects, and animator bindings also passed with no new
  drawer findings after adding swipes.

## Maintain

The local Git remotes are `origin` for this fork and `upstream` for alesimula/Murine-launcher.
Keep the feature work on `feat/category-drawer` while it is being tested. Update from
upstream on a separate branch, then re-run the unit tests, build, and drawer checks before
using it as your daily launcher.

The model, classifier, persistence adapter, category dialogs, and tab controller live in
`src/app/murinelauncher/drawer/`. Feature changes in inherited code cover preferences, drawer layout/filtering, IME handling,
and app shortcuts. Branding changes also update labels, icons, backup filenames, crash
contact display, build naming, store metadata, and the bundled website.
New strings are in the English and Italian `strings_murine.xml` files; other locales fall
back to English for these strings. Missing-translation lint is suppressed only for these
new entries, following the upstream English-and-Italian-first localization policy.

This derivative retains the original Apache-2.0 license and NOTICE, including the component
attributions. Modified inherited files carry a fork notice. This project is independent of
upstream Murine and Smart Launcher.
