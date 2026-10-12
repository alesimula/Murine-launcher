# Murine Launcher (Launcher :3)

<img width="380" src="/image/app_icon/icon_browser_fullsize.svg"/>

## About

A lightweight FOSS Android launcher forked from AOSP's Launcher3, using [yuchuangu85's repo](https://github.com/yuchuangu85/Launcher3) as a base.

It offers minimalistic but modern and clean custom looks and feel, and essential customization options without bloat.

## Compatibility

Murine Launcher currently supports Androd 8 and above

Blur effects are supported on Android 12 and above.<br/>
Some OEM/ROMs may hide or disable window-level blurs; if that's your case try to check for an &quot;Allow window-level blurs&quot; option in Display Options or Developer Options.<br/>
Alternatively, try enabling <a href="https://github.com/Magisk-Modules-Alt-Repo/enable-blurs">this Magisk module</a> on rooted devices

## Screenshots
<img width="320" src="/fastlane/metadata/android/en-US/images/phoneScreenshots/1.png"/>    <img width="320" src="/fastlane/metadata/android/en-US/images/phoneScreenshots/2.png"/>
<img width="320" src="/fastlane/metadata/android/en-US/images/phoneScreenshots/3.png"/>    <img width="320" src="/fastlane/metadata/android/en-US/images/phoneScreenshots/4.png"/>
<img width="320" src="/fastlane/metadata/android/en-US/images/phoneScreenshots/5.png"/>    <img width="320" src="/fastlane/metadata/android/en-US/images/phoneScreenshots/6.png"/>
<img width="320" src="/fastlane/metadata/android/en-US/images/phoneScreenshots/7.png"/>

## Translations

The launcher's own strings are translated separately from the locales it inherits from AOSP.

[See which languages are covered, how complete each one is, and how to help](https://www.murinelauncher.app/localization-status/)

## Download

Check [the website](https://www.murinelauncher.app/) or download it from:

<p align="left">
  <a href="https://f-droid.org/en/packages/app.murinelauncher">
    <picture>
      <source media="(prefers-color-scheme: dark)" srcset="image/github/badge-fdroid.webp" height="60">
      <img alt="Get it on F-Droid" src="image/github/badge-fdroid.webp" height="60">
    </picture>
  </a>
  <a href="https://apt.izzysoft.de/fdroid/index/apk/app.murinelauncher">
    <picture>
      <source media="(prefers-color-scheme: dark)" srcset="image/github/badge-izzyondroid.webp" height="60">
      <img alt="Get it on IzzyOnDroid" src="image/github/badge-izzyondroid.webp" height="60">
    </picture>
  </a>
  <a href="https://play.google.com/store/apps/details?id=app.murinelauncher">
    <picture>
      <source media="(prefers-color-scheme: dark)" srcset="image/github/badge-google-play.webp" height="60">
      <img alt="Get it on Google Play" src="image/github/badge-google-play.webp" height="60">
    </picture>
  </a>
  <a href="https://github.com/alesimula/Murine-launcher/releases">
    <picture>
      <source media="(prefers-color-scheme: dark)" srcset="image/github/badge-github.webp" height="60">
      <img alt="Get it on GitHub" src="image/github/badge-github.webp" height="60">
    </picture>
  </a>
</p>

## Building

Last tested on:

 - Android Studio: Quail 4 (2026.1.4)
 - Gradle: 9.7.1 (bundled)

## Local backup and recovery

Local restores validate the archive, preference XML, active grid and SQLite integrity before
restarting. Both `.rat` archives and legacy ZIP backups are supported, up to 128 MiB unpacked.
Backups from a newer database schema need a matching or newer launcher version; imported
downgrade SQL is never executed.

The first startup preserves the previous databases (including WAL/journal files), preferences
and widget references until the restored workspace has loaded successfully. If installation or
that initial load fails or is interrupted, the next startup restores the previous files and
shows a failure message. Recovery files are retained if recovery itself fails. Do not clear
launcher storage or delete these files to work around a restore failure.

An irreparable existing database or failed grid migration is not replaced with a default layout.
The launcher reports the failure and keeps its data; settings remain available to import a valid
backup or select a working grid. A database requiring an unsupported downgrade needs a compatible
launcher build. Ordinary fresh installations still initialize their default layout.

Off-device restore regressions use Robolectric with native SQLite:
`testAospWithoutQuickstepDebugUnitTest --tests '*RestoreReliabilityTest' --tests '*LayoutFailureTest'`.
They use only disposable test data; no device installation is needed.

## Buy me a beer

<a href="https://www.paypal.com/donate/?hosted_button_id=3HRAWU9KVYKKS">
  <img src="https://raw.githubusercontent.com/stefan-niedermann/paypal-donate-button/master/paypal-donate-button.png" alt="Donate with PayPal" />
</a>

## Credits

- [Preview art by Miikrowelle](https://miikrowelle.straw.page)
- [Contains some icons from Lets Icons by sadik sajid](https://www.figma.com/community/plugin/1551156216287797438)

## Extra resources

 - [Recovery: User-initiated, offline crash log sharing with zero permissions](https://github.com/alesimula/Recovery)
 - [murine-aircompressor: full-Java zstd, lz4, snappy and lzo implementations](https://github.com/alesimula/murine-aircompressor)
 - [Old resources: just some trash I don't want to clutter my main repo](https://github.com/alesimula/old-resources-m-launcher)