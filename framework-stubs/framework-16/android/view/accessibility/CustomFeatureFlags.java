package android.view.accessibility;

public class CustomFeatureFlags implements android.view.accessibility.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.view.accessibility.FeatureFlags>> p0) {}
    public boolean a11yCharacterInWindowApi() { return false; }
    public boolean a11yExpansionStateApi() { return false; }
    public boolean a11yIsRequiredApi() { return false; }
    public boolean a11yIsVisitedApi() { return false; }
    public boolean a11yOverlayCallbacks() { return false; }
    public boolean a11ySelectionApi() { return false; }
    public boolean a11ySequentialFocusStartingPoint() { return false; }
    public boolean a11ySortDirectionApi() { return false; }
    public boolean allowShortcutChooserOnLockscreen() { return false; }
    public boolean brailleDisplayHid() { return false; }
    public boolean cleanupAccessibilityWarningDialog() { return false; }
    public boolean collectionInfoItemCounts() { return false; }
    public boolean copyEventsForGestureDetection() { return false; }
    public boolean deprecateAccessibilityAnnouncementApis() { return false; }
    public boolean deprecateAniLabelForApis() { return false; }
    public boolean enableRefreshWindowInfo() { return false; }
    public boolean enableSystemPinchZoomGesture() { return false; }
    public boolean enableTrustedAccessibilityServiceApi() { return false; }
    public boolean enableTypeWindowControl() { return false; }
    public boolean flashNotificationSystemApi() { return false; }
    public boolean focusRectMinSize() { return false; }
    public boolean forceInvertColor() { return false; }
    public boolean globalActionMediaPlayPause() { return false; }
    public boolean globalActionMenu() { return false; }
    public boolean granularScrolling() { return false; }
    public boolean ignoreUnimportantRoot() { return false; }
    public boolean indeterminateRangeInfo() { return false; }
    public boolean motionEventObserving() { return false; }
    public boolean navbarFlipOrderOption() { return false; }
    public boolean preventA11yNontoolFromInjectingIntoSensitiveViews() { return false; }
    public boolean preventLeakingViewrootimpl() { return false; }
    public boolean reduceWindowContentChangedEventThrottle() { return false; }
    public boolean removeChildHoverCheckForTouchExploration() { return false; }
    public boolean requestRectangleWithSource() { return false; }
    public boolean restoreA11yShortcutTargetService() { return false; }
    public boolean skipAccessibilityWarningDialogForTrustedServices() { return false; }
    public boolean supplementalDescription() { return false; }
    public boolean supportMultipleLabeledby() { return false; }
    public boolean supportSystemPinchZoomOptOutApis() { return false; }
    public boolean textCursorBlinkInterval() { return false; }
    public boolean triStateChecked() { return false; }
    public boolean updateAlwaysOnA11yService() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.view.accessibility.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
