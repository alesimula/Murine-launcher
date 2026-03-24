package android.accessibilityservice;

public final class FingerprintGestureController {
    public static final int FINGERPRINT_GESTURE_SWIPE_RIGHT = 1;
    public static final int FINGERPRINT_GESTURE_SWIPE_LEFT = 2;
    public static final int FINGERPRINT_GESTURE_SWIPE_UP = 4;
    public static final int FINGERPRINT_GESTURE_SWIPE_DOWN = 8;
    private static final java.lang.String LOG_TAG = "FingerprintGestureController";
    private final java.lang.Object mLock = null;
    private final android.accessibilityservice.IAccessibilityServiceConnection mAccessibilityServiceConnection = null;
    private final android.util.ArrayMap<android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback, android.os.Handler> mCallbackHandlerMap = null;
    public FingerprintGestureController(android.accessibilityservice.IAccessibilityServiceConnection p0) {}
    public boolean isGestureDetectionAvailable() { return false; }
    public void registerFingerprintGestureCallback(android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback p0, android.os.Handler p1) {}
    public void unregisterFingerprintGestureCallback(android.accessibilityservice.FingerprintGestureController.FingerprintGestureCallback p0) {}
    public void onGestureDetectionActiveChanged(boolean p0) {}
    public void onGesture(int p0) {}

    public static abstract class FingerprintGestureCallback {
        public FingerprintGestureCallback() {}
        public void onGestureDetectionAvailabilityChanged(boolean p0) {}
        public void onGestureDetected(int p0) {}
    }
}
