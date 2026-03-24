package com.android.input.flags;

public interface FeatureFlags {
    public boolean a11yCrashOnInconsistentEventStream();
    public boolean allowTransferOfEntireGesture();
    public boolean collectPalmRejectionQualityMetrics();
    public boolean connectedDisplaysAssociatedDisplayCursorBugfix();
    public boolean connectedDisplaysCursor();
    public boolean deprecateSplitTouchApis();
    public boolean deviceAssociations();
    public boolean disableRejectTouchOnStylusHover();
    public boolean disableTouchInputMapperPointerUsage();
    public boolean enableAlphabeticKeyboardWake();
    public boolean enableButtonStateVerification();
    public boolean enableDisplayTopologyValidation();
    public boolean enableInboundEventVerification();
    public boolean enableInputEventTracing();
    public boolean enableInputPolicyProfile();
    public boolean enableMultiDeviceInput();
    public boolean enableMultiDeviceSameWindowStream();
    public boolean enableOutboundEventVerification();
    public boolean enablePerDeviceInputLatencyMetrics();
    public boolean enablePredictionPruningViaJerkThresholding();
    public boolean enableV2TouchpadTypingPalmRejection();
    public boolean inputDeviceViewBehaviorApi();
    public boolean keyboardRepeatKeys();
    public boolean overrideKeyBehaviorPermissionApis();
    public boolean preventMergingInputPointerDevices();
    public boolean rateLimitUserActivityPokeInDispatcher();
    public boolean rotaryInputTelemetry();
    public boolean scaleCursorSpeedWithDpi();
    public boolean setInputDeviceKernelWake();
    public boolean showPointersForPartialScreenshare();
    public boolean useClonedScreenCoordinatesAsRaw();
    public boolean useTopologyAwareFlag();
}
