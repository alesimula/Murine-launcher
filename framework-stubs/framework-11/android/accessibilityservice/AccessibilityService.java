package android.accessibilityservice;

public abstract class AccessibilityService extends android.app.Service {
    public static final int GESTURE_SWIPE_UP = 1;
    public static final int GESTURE_SWIPE_DOWN = 2;
    public static final int GESTURE_SWIPE_LEFT = 3;
    public static final int GESTURE_SWIPE_RIGHT = 4;
    public static final int GESTURE_SWIPE_LEFT_AND_RIGHT = 5;
    public static final int GESTURE_SWIPE_RIGHT_AND_LEFT = 6;
    public static final int GESTURE_SWIPE_UP_AND_DOWN = 7;
    public static final int GESTURE_SWIPE_DOWN_AND_UP = 8;
    public static final int GESTURE_SWIPE_LEFT_AND_UP = 9;
    public static final int GESTURE_SWIPE_LEFT_AND_DOWN = 10;
    public static final int GESTURE_SWIPE_RIGHT_AND_UP = 11;
    public static final int GESTURE_SWIPE_RIGHT_AND_DOWN = 12;
    public static final int GESTURE_SWIPE_UP_AND_LEFT = 13;
    public static final int GESTURE_SWIPE_UP_AND_RIGHT = 14;
    public static final int GESTURE_SWIPE_DOWN_AND_LEFT = 15;
    public static final int GESTURE_SWIPE_DOWN_AND_RIGHT = 16;
    public static final int GESTURE_DOUBLE_TAP = 17;
    public static final int GESTURE_DOUBLE_TAP_AND_HOLD = 18;
    public static final int GESTURE_2_FINGER_SINGLE_TAP = 19;
    public static final int GESTURE_2_FINGER_DOUBLE_TAP = 20;
    public static final int GESTURE_2_FINGER_TRIPLE_TAP = 21;
    public static final int GESTURE_3_FINGER_SINGLE_TAP = 22;
    public static final int GESTURE_3_FINGER_DOUBLE_TAP = 23;
    public static final int GESTURE_3_FINGER_TRIPLE_TAP = 24;
    public static final int GESTURE_2_FINGER_SWIPE_UP = 25;
    public static final int GESTURE_2_FINGER_SWIPE_DOWN = 26;
    public static final int GESTURE_2_FINGER_SWIPE_LEFT = 27;
    public static final int GESTURE_2_FINGER_SWIPE_RIGHT = 28;
    public static final int GESTURE_3_FINGER_SWIPE_UP = 29;
    public static final int GESTURE_3_FINGER_SWIPE_DOWN = 30;
    public static final int GESTURE_3_FINGER_SWIPE_LEFT = 31;
    public static final int GESTURE_3_FINGER_SWIPE_RIGHT = 32;
    public static final int GESTURE_4_FINGER_SWIPE_UP = 33;
    public static final int GESTURE_4_FINGER_SWIPE_DOWN = 34;
    public static final int GESTURE_4_FINGER_SWIPE_LEFT = 35;
    public static final int GESTURE_4_FINGER_SWIPE_RIGHT = 36;
    public static final int GESTURE_4_FINGER_SINGLE_TAP = 37;
    public static final int GESTURE_4_FINGER_DOUBLE_TAP = 38;
    public static final int GESTURE_4_FINGER_TRIPLE_TAP = 39;
    public static final int GESTURE_2_FINGER_DOUBLE_TAP_AND_HOLD = 40;
    public static final int GESTURE_3_FINGER_DOUBLE_TAP_AND_HOLD = 41;
    public static final int GESTURE_4_FINGER_DOUBLE_TAP_AND_HOLD = 42;
    public static final java.lang.String SERVICE_INTERFACE = "android.accessibilityservice.AccessibilityService";
    public static final java.lang.String SERVICE_META_DATA = "android.accessibilityservice";
    public static final int GLOBAL_ACTION_BACK = 1;
    public static final int GLOBAL_ACTION_HOME = 2;
    public static final int GLOBAL_ACTION_RECENTS = 3;
    public static final int GLOBAL_ACTION_NOTIFICATIONS = 4;
    public static final int GLOBAL_ACTION_QUICK_SETTINGS = 5;
    public static final int GLOBAL_ACTION_POWER_DIALOG = 6;
    public static final int GLOBAL_ACTION_TOGGLE_SPLIT_SCREEN = 7;
    public static final int GLOBAL_ACTION_LOCK_SCREEN = 8;
    public static final int GLOBAL_ACTION_TAKE_SCREENSHOT = 9;
    public static final int GLOBAL_ACTION_KEYCODE_HEADSETHOOK = 10;
    public static final int GLOBAL_ACTION_ACCESSIBILITY_BUTTON = 11;
    public static final int GLOBAL_ACTION_ACCESSIBILITY_BUTTON_CHOOSER = 12;
    public static final int GLOBAL_ACTION_ACCESSIBILITY_SHORTCUT = 13;
    public static final int GLOBAL_ACTION_ACCESSIBILITY_ALL_APPS = 14;
    private static final java.lang.String LOG_TAG = "AccessibilityService";
    public static final int SHOW_MODE_AUTO = 0;
    public static final int SHOW_MODE_HIDDEN = 1;
    public static final int SHOW_MODE_IGNORE_HARD_KEYBOARD = 2;
    public static final int SHOW_MODE_MASK = 3;
    public static final int SHOW_MODE_HARD_KEYBOARD_ORIGINAL_VALUE = 536870912;
    public static final int SHOW_MODE_HARD_KEYBOARD_OVERRIDDEN = 1073741824;
    public static final int TAKE_SCREENSHOT_SUCCESS = 0;
    public static final int ERROR_TAKE_SCREENSHOT_INTERNAL_ERROR = 1;
    public static final int ERROR_TAKE_SCREENSHOT_NO_ACCESSIBILITY_ACCESS = 2;
    public static final int ERROR_TAKE_SCREENSHOT_INTERVAL_TIME_SHORT = 3;
    public static final int ERROR_TAKE_SCREENSHOT_INVALID_DISPLAY = 4;
    public static final int ACCESSIBILITY_TAKE_SCREENSHOT_REQUEST_INTERVAL_TIMES_MS = 1000;
    public static final java.lang.String KEY_ACCESSIBILITY_SCREENSHOT_STATUS = "screenshot_status";
    public static final java.lang.String KEY_ACCESSIBILITY_SCREENSHOT_HARDWAREBUFFER = "screenshot_hardwareBuffer";
    public static final java.lang.String KEY_ACCESSIBILITY_SCREENSHOT_COLORSPACE = "screenshot_colorSpace";
    public static final java.lang.String KEY_ACCESSIBILITY_SCREENSHOT_TIMESTAMP = "screenshot_timestamp";
    private int mConnectionId;
    private android.accessibilityservice.AccessibilityServiceInfo mInfo;
    private android.os.IBinder mWindowToken;
    private android.view.WindowManager mWindowManager;
    private final android.util.SparseArray<android.accessibilityservice.AccessibilityService.MagnificationController> mMagnificationControllers = null;
    private android.accessibilityservice.AccessibilityService.SoftKeyboardController mSoftKeyboardController;
    private final android.util.SparseArray<android.accessibilityservice.AccessibilityButtonController> mAccessibilityButtonControllers = null;
    private int mGestureStatusCallbackSequence;
    private android.util.SparseArray<android.accessibilityservice.AccessibilityService.GestureResultCallbackInfo> mGestureStatusCallbackInfos;
    private final java.lang.Object mLock = null;
    private android.accessibilityservice.FingerprintGestureController mFingerprintGestureController;
    public AccessibilityService() { super(); }
    public abstract void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0);
    public abstract void onInterrupt();
    private void dispatchServiceConnected() {}
    protected void onServiceConnected() {}
    @java.lang.Deprecated
    protected boolean onGesture(int p0) { return false; }
    public boolean onGesture(android.accessibilityservice.AccessibilityGestureEvent p0) { return false; }
    protected boolean onKeyEvent(android.view.KeyEvent p0) { return false; }
    public java.util.List<android.view.accessibility.AccessibilityWindowInfo> getWindows() { return null; }
    public final android.util.SparseArray<java.util.List<android.view.accessibility.AccessibilityWindowInfo>> getWindowsOnAllDisplays() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getRootInActiveWindow() { return null; }
    public final void disableSelf() {}
    public android.content.Context createDisplayContext(android.view.Display p0) { return null; }
    private void setDefaultTokenInternal(android.content.Context p0, int p1) {}
    public final android.accessibilityservice.AccessibilityService.MagnificationController getMagnificationController() { return null; }
    public final android.accessibilityservice.AccessibilityService.MagnificationController getMagnificationController(int p0) { return null; }
    public final android.accessibilityservice.FingerprintGestureController getFingerprintGestureController() { return null; }
    public final boolean dispatchGesture(android.accessibilityservice.GestureDescription p0, android.accessibilityservice.AccessibilityService.GestureResultCallback p1, android.os.Handler p2) { return false; }
    void onPerformGestureResult(int p0, boolean p1) {}
    private void onMagnificationChanged(int p0, android.graphics.Region p1, float p2, float p3, float p4) {}
    private void onFingerprintCapturingGesturesChanged(boolean p0) {}
    private void onFingerprintGesture(int p0) {}
    public final android.accessibilityservice.AccessibilityService.SoftKeyboardController getSoftKeyboardController() { return null; }
    private void onSoftKeyboardShowModeChanged(int p0) {}
    public final android.accessibilityservice.AccessibilityButtonController getAccessibilityButtonController() { return null; }
    public final android.accessibilityservice.AccessibilityButtonController getAccessibilityButtonController(int p0) { return null; }
    private void onAccessibilityButtonClicked(int p0) {}
    private void onAccessibilityButtonAvailabilityChanged(boolean p0) {}
    public void onSystemActionsChanged() {}
    public final java.util.List<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> getSystemActions() { return null; }
    public final boolean performGlobalAction(int p0) { return false; }
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int p0) { return null; }
    public final android.accessibilityservice.AccessibilityServiceInfo getServiceInfo() { return null; }
    public final void setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo p0) {}
    private void sendServiceInfo() {}
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    public void takeScreenshot(int p0, java.util.concurrent.Executor p1, android.accessibilityservice.AccessibilityService.TakeScreenshotCallback p2) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    private void sendScreenshotSuccess(android.accessibilityservice.AccessibilityService.ScreenshotResult p0, java.util.concurrent.Executor p1, android.accessibilityservice.AccessibilityService.TakeScreenshotCallback p2) {}
    private void sendScreenshotFailure(int p0, java.util.concurrent.Executor p1, android.accessibilityservice.AccessibilityService.TakeScreenshotCallback p2) {}
    public void setGestureDetectionPassthroughRegion(int p0, android.graphics.Region p1) {}
    public void setTouchExplorationPassthroughRegion(int p0, android.graphics.Region p1) {}

    public static interface Callbacks {
        public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0);
        public void onInterrupt();
        public void onServiceConnected();
        public void init(int p0, android.os.IBinder p1);
        public boolean onGesture(android.accessibilityservice.AccessibilityGestureEvent p0);
        public boolean onKeyEvent(android.view.KeyEvent p0);
        public void onMagnificationChanged(int p0, android.graphics.Region p1, float p2, float p3, float p4);
        public void onSoftKeyboardShowModeChanged(int p0);
        public void onPerformGestureResult(int p0, boolean p1);
        public void onFingerprintCapturingGesturesChanged(boolean p0);
        public void onFingerprintGesture(int p0);
        public void onAccessibilityButtonClicked(int p0);
        public void onAccessibilityButtonAvailabilityChanged(boolean p0);
        public void onSystemActionsChanged();
    }

    public static abstract class GestureResultCallback {
        public GestureResultCallback() {}
        public void onCompleted(android.accessibilityservice.GestureDescription p0) {}
        public void onCancelled(android.accessibilityservice.GestureDescription p0) {}
    }

    private static class GestureResultCallbackInfo {
        android.accessibilityservice.GestureDescription gestureDescription;
        android.accessibilityservice.AccessibilityService.GestureResultCallback callback;
        android.os.Handler handler;
        GestureResultCallbackInfo(android.accessibilityservice.GestureDescription p0, android.accessibilityservice.AccessibilityService.GestureResultCallback p1, android.os.Handler p2) {}
    }

    public static class IAccessibilityServiceClientWrapper extends android.accessibilityservice.IAccessibilityServiceClient.Stub implements com.android.internal.os.HandlerCaller.Callback {
        private static final int DO_INIT = 1;
        private static final int DO_ON_INTERRUPT = 2;
        private static final int DO_ON_ACCESSIBILITY_EVENT = 3;
        private static final int DO_ON_GESTURE = 4;
        private static final int DO_CLEAR_ACCESSIBILITY_CACHE = 5;
        private static final int DO_ON_KEY_EVENT = 6;
        private static final int DO_ON_MAGNIFICATION_CHANGED = 7;
        private static final int DO_ON_SOFT_KEYBOARD_SHOW_MODE_CHANGED = 8;
        private static final int DO_GESTURE_COMPLETE = 9;
        private static final int DO_ON_FINGERPRINT_ACTIVE_CHANGED = 10;
        private static final int DO_ON_FINGERPRINT_GESTURE = 11;
        private static final int DO_ACCESSIBILITY_BUTTON_CLICKED = 12;
        private static final int DO_ACCESSIBILITY_BUTTON_AVAILABILITY_CHANGED = 13;
        private static final int DO_ON_SYSTEM_ACTIONS_CHANGED = 14;
        private final com.android.internal.os.HandlerCaller mCaller = null;
        private final android.accessibilityservice.AccessibilityService.Callbacks mCallback = null;
        private int mConnectionId;
        public IAccessibilityServiceClientWrapper(android.content.Context p0, android.os.Looper p1, android.accessibilityservice.AccessibilityService.Callbacks p2) { super(); }
        public void init(android.accessibilityservice.IAccessibilityServiceConnection p0, int p1, android.os.IBinder p2) {}
        public void onInterrupt() {}
        public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0, boolean p1) {}
        public void onGesture(android.accessibilityservice.AccessibilityGestureEvent p0) {}
        public void clearAccessibilityCache() {}
        public void onKeyEvent(android.view.KeyEvent p0, int p1) {}
        public void onMagnificationChanged(int p0, android.graphics.Region p1, float p2, float p3, float p4) {}
        public void onSoftKeyboardShowModeChanged(int p0) {}
        public void onPerformGestureResult(int p0, boolean p1) {}
        public void onFingerprintCapturingGesturesChanged(boolean p0) {}
        public void onFingerprintGesture(int p0) {}
        public void onAccessibilityButtonClicked(int p0) {}
        public void onAccessibilityButtonAvailabilityChanged(boolean p0) {}
        public void onSystemActionsChanged() {}
        public void executeMessage(android.os.Message p0) {}
    }

    public static final class MagnificationController {
        private final android.accessibilityservice.AccessibilityService mService = null;
        private final int mDisplayId = 0;
        private android.util.ArrayMap<android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener, android.os.Handler> mListeners;
        private final java.lang.Object mLock = null;
        MagnificationController(android.accessibilityservice.AccessibilityService p0, java.lang.Object p1, int p2) {}
        void onServiceConnectedLocked() {}
        public void addListener(android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener p0) {}
        public void addListener(android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener p0, android.os.Handler p1) {}
        public boolean removeListener(android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener p0) { return false; }
        private void setMagnificationCallbackEnabled(boolean p0) {}
        void dispatchMagnificationChanged(android.graphics.Region p0, float p1, float p2, float p3) {}
        public float getScale() { return 0.0f; }
        public float getCenterX() { return 0.0f; }
        public float getCenterY() { return 0.0f; }
        public android.graphics.Region getMagnificationRegion() { return null; }
        public boolean reset(boolean p0) { return false; }
        public boolean setScale(float p0, boolean p1) { return false; }
        public boolean setCenter(float p0, float p1, boolean p2) { return false; }

        public static interface OnMagnificationChangedListener {
            public void onMagnificationChanged(android.accessibilityservice.AccessibilityService.MagnificationController p0, android.graphics.Region p1, float p2, float p3, float p4);
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScreenshotErrorCode {
    }

    public static final class ScreenshotResult {
        private final android.hardware.HardwareBuffer mHardwareBuffer = null;
        private final android.graphics.ColorSpace mColorSpace = null;
        private final long mTimestamp = 0L;
        private ScreenshotResult(android.hardware.HardwareBuffer p0, android.graphics.ColorSpace p1, long p2) {}
        public android.graphics.ColorSpace getColorSpace() { return null; }
        public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
        public long getTimestamp() { return 0L; }
    }

    public static final class SoftKeyboardController {
        private final android.accessibilityservice.AccessibilityService mService = null;
        private android.util.ArrayMap<android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener, android.os.Handler> mListeners;
        private final java.lang.Object mLock = null;
        SoftKeyboardController(android.accessibilityservice.AccessibilityService p0, java.lang.Object p1) {}
        void onServiceConnected() {}
        public void addOnShowModeChangedListener(android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener p0) {}
        public void addOnShowModeChangedListener(android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener p0, android.os.Handler p1) {}
        public boolean removeOnShowModeChangedListener(android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener p0) { return false; }
        private void setSoftKeyboardCallbackEnabled(boolean p0) {}
        void dispatchSoftKeyboardShowModeChanged(int p0) {}
        public int getShowMode() { return 0; }
        public boolean setShowMode(int p0) { return false; }
        public boolean switchToInputMethod(java.lang.String p0) { return false; }

        public static interface OnShowModeChangedListener {
            public void onShowModeChanged(android.accessibilityservice.AccessibilityService.SoftKeyboardController p0, int p1);
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SoftKeyboardShowMode {
    }

    public static interface TakeScreenshotCallback {
        public void onSuccess(android.accessibilityservice.AccessibilityService.ScreenshotResult p0);
        public void onFailure(int p0);
    }
}
