package com.android.text.flags;

public interface FeatureFlags {
    public boolean completeFontLoadInSystemServicesReady();
    public boolean deprecateUiFonts();
    public boolean disableHandwritingInitiatorForIme();
    public boolean escapeClearsFocus();
    public boolean fixDoubleUnderline();
    public boolean fixFontUpdateFailure();
    public boolean fixLineHeightForLocale();
    public boolean fixMisalignedContextMenu();
    public boolean fixNullTypefaceBolding();
    public boolean handwritingCursorPosition();
    public boolean handwritingEndOfLineTap();
    public boolean handwritingUnsupportedMessage();
    public boolean icuBidiMigration();
    public boolean insertModeCrashWhenDelete();
    public boolean insertModeNotUpdateSelection();
    public boolean lazyVariationInstance();
    public boolean letterSpacingJustification();
    public boolean missingGetterApis();
    public boolean newFontsFallbackXml();
    public boolean noBreakNoHyphenationSpan();
    public boolean phraseStrictFallback();
    public boolean rustHyphenator();
    public boolean useBoundsForWidth();
    public boolean useOptimizedBoottimeFontLoading();
    public boolean vendorCustomLocaleFallback();
    public boolean wordStyleAuto();
}
