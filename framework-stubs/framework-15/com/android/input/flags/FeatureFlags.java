package com.android.input.flags;

public interface FeatureFlags {
    public boolean a11yCrashOnInconsistentEventStream();
    public boolean deviceAssociations();
    public boolean disableRejectTouchOnStylusHover();
    public boolean enableGesturesLibraryTimerProvider();
    public boolean enableInboundEventVerification();
    public boolean enableInputEventTracing();
    public boolean enableInputFilterRustImpl();
    public boolean enableKeyboardClassifier();
    public boolean enableMultiDeviceInput();
    public boolean enableMultiDeviceSameWindowStream();
    public boolean enableNewMousePointerBallistics();
    public boolean enableOutboundEventVerification();
    public boolean enablePredictionPruningViaJerkThresholding();
    public boolean enableTouchpadFlingStop();
    public boolean enableTouchpadTypingPalmRejection();
    public boolean enableV2TouchpadTypingPalmRejection();
    public boolean hidePointerIndicatorsForSecureWindows();
    public boolean inputDeviceViewBehaviorApi();
    public boolean overrideKeyBehaviorPermissionApis();
    public boolean rateLimitUserActivityPokeInDispatcher();
    public boolean removePointerEventTrackingInWm();
    public boolean reportPalmsToGesturesLibrary();
}
