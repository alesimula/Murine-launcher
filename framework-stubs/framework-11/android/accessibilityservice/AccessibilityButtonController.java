package android.accessibilityservice;

public final class AccessibilityButtonController {
    private static final java.lang.String LOG_TAG = "A11yButtonController";
    private final android.accessibilityservice.IAccessibilityServiceConnection mServiceConnection = null;
    private final java.lang.Object mLock = null;
    private android.util.ArrayMap<android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback, android.os.Handler> mCallbacks;
    AccessibilityButtonController(android.accessibilityservice.IAccessibilityServiceConnection p0) {}
    public boolean isAccessibilityButtonAvailable() { return false; }
    public void registerAccessibilityButtonCallback(android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback p0) {}
    public void registerAccessibilityButtonCallback(android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback p0, android.os.Handler p1) {}
    public void unregisterAccessibilityButtonCallback(android.accessibilityservice.AccessibilityButtonController.AccessibilityButtonCallback p0) {}
    void dispatchAccessibilityButtonClicked() {}
    void dispatchAccessibilityButtonAvailabilityChanged(boolean p0) {}

    public static abstract class AccessibilityButtonCallback {
        public AccessibilityButtonCallback() {}
        public void onClicked(android.accessibilityservice.AccessibilityButtonController p0) {}
        public void onAvailabilityChanged(android.accessibilityservice.AccessibilityButtonController p0, boolean p1) {}
    }
}
