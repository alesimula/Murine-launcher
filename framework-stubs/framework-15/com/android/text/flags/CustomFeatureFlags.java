package com.android.text.flags;

public class CustomFeatureFlags implements com.android.text.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.text.flags.FeatureFlags>> p0) {}
    public boolean completeFontLoadInSystemServicesReady() { return false; }
    public boolean deprecateUiFonts() { return false; }
    public boolean disableHandwritingInitiatorForIme() { return false; }
    public boolean escapeClearsFocus() { return false; }
    public boolean fixDoubleUnderline() { return false; }
    public boolean fixFontUpdateFailure() { return false; }
    public boolean fixLineHeightForLocale() { return false; }
    public boolean fixMisalignedContextMenu() { return false; }
    public boolean fixNullTypefaceBolding() { return false; }
    public boolean handwritingCursorPosition() { return false; }
    public boolean handwritingEndOfLineTap() { return false; }
    public boolean handwritingUnsupportedMessage() { return false; }
    public boolean icuBidiMigration() { return false; }
    public boolean insertModeCrashWhenDelete() { return false; }
    public boolean insertModeNotUpdateSelection() { return false; }
    public boolean lazyVariationInstance() { return false; }
    public boolean letterSpacingJustification() { return false; }
    public boolean missingGetterApis() { return false; }
    public boolean newFontsFallbackXml() { return false; }
    public boolean noBreakNoHyphenationSpan() { return false; }
    public boolean phraseStrictFallback() { return false; }
    public boolean rustHyphenator() { return false; }
    public boolean useBoundsForWidth() { return false; }
    public boolean useOptimizedBoottimeFontLoading() { return false; }
    public boolean vendorCustomLocaleFallback() { return false; }
    public boolean wordStyleAuto() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.text.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
