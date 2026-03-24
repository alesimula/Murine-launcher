package com.android.input.flags;

public class CustomFeatureFlags implements com.android.input.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.input.flags.FeatureFlags>> p0) {}
    public boolean a11yCrashOnInconsistentEventStream() { return false; }
    public boolean allowTransferOfEntireGesture() { return false; }
    public boolean collectPalmRejectionQualityMetrics() { return false; }
    public boolean connectedDisplaysAssociatedDisplayCursorBugfix() { return false; }
    public boolean connectedDisplaysCursor() { return false; }
    public boolean deprecateSplitTouchApis() { return false; }
    public boolean deviceAssociations() { return false; }
    public boolean disableRejectTouchOnStylusHover() { return false; }
    public boolean disableTouchInputMapperPointerUsage() { return false; }
    public boolean enableAlphabeticKeyboardWake() { return false; }
    public boolean enableButtonStateVerification() { return false; }
    public boolean enableDisplayTopologyValidation() { return false; }
    public boolean enableInboundEventVerification() { return false; }
    public boolean enableInputEventTracing() { return false; }
    public boolean enableInputPolicyProfile() { return false; }
    public boolean enableMultiDeviceInput() { return false; }
    public boolean enableMultiDeviceSameWindowStream() { return false; }
    public boolean enableOutboundEventVerification() { return false; }
    public boolean enablePerDeviceInputLatencyMetrics() { return false; }
    public boolean enablePredictionPruningViaJerkThresholding() { return false; }
    public boolean enableV2TouchpadTypingPalmRejection() { return false; }
    public boolean inputDeviceViewBehaviorApi() { return false; }
    public boolean keyboardRepeatKeys() { return false; }
    public boolean overrideKeyBehaviorPermissionApis() { return false; }
    public boolean preventMergingInputPointerDevices() { return false; }
    public boolean rateLimitUserActivityPokeInDispatcher() { return false; }
    public boolean rotaryInputTelemetry() { return false; }
    public boolean scaleCursorSpeedWithDpi() { return false; }
    public boolean setInputDeviceKernelWake() { return false; }
    public boolean showPointersForPartialScreenshare() { return false; }
    public boolean useClonedScreenCoordinatesAsRaw() { return false; }
    public boolean useTopologyAwareFlag() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.input.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
