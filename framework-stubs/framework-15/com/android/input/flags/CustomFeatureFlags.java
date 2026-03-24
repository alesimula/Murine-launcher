package com.android.input.flags;

public class CustomFeatureFlags implements com.android.input.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.input.flags.FeatureFlags>> p0) {}
    public boolean a11yCrashOnInconsistentEventStream() { return false; }
    public boolean deviceAssociations() { return false; }
    public boolean disableRejectTouchOnStylusHover() { return false; }
    public boolean enableGesturesLibraryTimerProvider() { return false; }
    public boolean enableInboundEventVerification() { return false; }
    public boolean enableInputEventTracing() { return false; }
    public boolean enableInputFilterRustImpl() { return false; }
    public boolean enableKeyboardClassifier() { return false; }
    public boolean enableMultiDeviceInput() { return false; }
    public boolean enableMultiDeviceSameWindowStream() { return false; }
    public boolean enableNewMousePointerBallistics() { return false; }
    public boolean enableOutboundEventVerification() { return false; }
    public boolean enablePredictionPruningViaJerkThresholding() { return false; }
    public boolean enableTouchpadFlingStop() { return false; }
    public boolean enableTouchpadTypingPalmRejection() { return false; }
    public boolean enableV2TouchpadTypingPalmRejection() { return false; }
    public boolean hidePointerIndicatorsForSecureWindows() { return false; }
    public boolean inputDeviceViewBehaviorApi() { return false; }
    public boolean overrideKeyBehaviorPermissionApis() { return false; }
    public boolean rateLimitUserActivityPokeInDispatcher() { return false; }
    public boolean removePointerEventTrackingInWm() { return false; }
    public boolean reportPalmsToGesturesLibrary() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.input.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
