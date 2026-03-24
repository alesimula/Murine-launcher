package com.android.text.flags;

public interface FeatureFlags {
    public boolean clearFontVariationSettings();
    public boolean completeFontLoadInSystemServicesReady();
    public boolean contextMenuHideUnavailableItems();
    public boolean deprecateElegantTextHeightApi();
    public boolean disableHandwritingInitiatorForIme();
    public boolean escapeClearsFocus();
    public boolean fixLineHeightForLocale();
    public boolean fixNullTypefaceBolding();
    public boolean handwritingCursorPosition();
    public boolean handwritingEndOfLineTap();
    public boolean handwritingGestureWithTransformation();
    public boolean handwritingTrackDisabled();
    public boolean handwritingUnsupportedMessage();
    public boolean handwritingUnsupportedShowSoftInputFix();
    public boolean insertModeCrashUpdateLayoutSpan();
    public boolean insertModeCrashWhenDelete();
    public boolean insertModeHighlightRange();
    public boolean insertModeNotUpdateSelection();
    public boolean languageSpecificExtent();
    public boolean letterSpacingJustification();
    public boolean missingGetterApis();
    public boolean newFontsFallbackXml();
    public boolean noBreakNoHyphenationSpan();
    public boolean rustHyphenator();
    public boolean ttsSpanDuration();
    public boolean typefaceCacheForVarSettings();
    public boolean typefaceRedesignReadonly();
    public boolean useBoundsForWidth();
    public boolean useFontationByDefault();
    public boolean useOptimizedBoottimeFontLoading();
    public boolean verticalTextLayout();
    public boolean wordStyleAuto();
}
