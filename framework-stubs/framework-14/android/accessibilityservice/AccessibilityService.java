package android.accessibilityservice;

public abstract class AccessibilityService extends android.app.Service {
    public static final int GESTURE_TOUCH_EXPLORATION = -2;
    public static final int GESTURE_PASSTHROUGH = -1;
    public static final int GESTURE_UNKNOWN = 0;
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
    public static final int GESTURE_2_FINGER_TRIPLE_TAP_AND_HOLD = 43;
    public static final int GESTURE_3_FINGER_SINGLE_TAP_AND_HOLD = 44;
    public static final int GESTURE_3_FINGER_TRIPLE_TAP_AND_HOLD = 45;
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
    public static final int GLOBAL_ACTION_DISMISS_NOTIFICATION_SHADE = 15;
    public static final int GLOBAL_ACTION_DPAD_UP = 16;
    public static final int GLOBAL_ACTION_DPAD_DOWN = 17;
    public static final int GLOBAL_ACTION_DPAD_LEFT = 18;
    public static final int GLOBAL_ACTION_DPAD_RIGHT = 19;
    public static final int GLOBAL_ACTION_DPAD_CENTER = 20;
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
    public static final int ERROR_TAKE_SCREENSHOT_INVALID_WINDOW = 5;
    public static final int ERROR_TAKE_SCREENSHOT_SECURE_WINDOW = 6;
    public static final int ACCESSIBILITY_TAKE_SCREENSHOT_REQUEST_INTERVAL_TIMES_MS = 333;
    public static final java.lang.String KEY_ACCESSIBILITY_SCREENSHOT_STATUS = "screenshot_status";
    public static final java.lang.String KEY_ACCESSIBILITY_SCREENSHOT_HARDWAREBUFFER = "screenshot_hardwareBuffer";
    public static final java.lang.String KEY_ACCESSIBILITY_SCREENSHOT_COLORSPACE = "screenshot_colorSpace";
    public static final java.lang.String KEY_ACCESSIBILITY_SCREENSHOT_TIMESTAMP = "screenshot_timestamp";
    public AccessibilityService() { super(); }
    public abstract void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0);
    public abstract void onInterrupt();
    protected void onServiceConnected() {}
    @java.lang.Deprecated
    protected boolean onGesture(int p0) { return false; }
    public boolean onGesture(android.accessibilityservice.AccessibilityGestureEvent p0) { return false; }
    protected boolean onKeyEvent(android.view.KeyEvent p0) { return false; }
    public void onMotionEvent(android.view.MotionEvent p0) {}
    public java.util.List<android.view.accessibility.AccessibilityWindowInfo> getWindows() { return null; }
    public final android.util.SparseArray<java.util.List<android.view.accessibility.AccessibilityWindowInfo>> getWindowsOnAllDisplays() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getRootInActiveWindow() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getRootInActiveWindow(int p0) { return null; }
    public final void disableSelf() {}
    public android.content.Context createDisplayContext(android.view.Display p0) { return null; }
    public android.content.Context createWindowContext(int p0, android.os.Bundle p1) { return null; }
    public android.content.Context createWindowContext(android.view.Display p0, int p1, android.os.Bundle p2) { return null; }
    public final android.accessibilityservice.AccessibilityService.MagnificationController getMagnificationController() { return null; }
    public final android.accessibilityservice.AccessibilityService.MagnificationController getMagnificationController(int p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.USE_FINGERPRINT")
    public final android.accessibilityservice.FingerprintGestureController getFingerprintGestureController() { return null; }
    public final boolean dispatchGesture(android.accessibilityservice.GestureDescription p0, android.accessibilityservice.AccessibilityService.GestureResultCallback p1, android.os.Handler p2) { return false; }
    void onPerformGestureResult(int p0, boolean p1) {}
    int getConnectionId() { return 0; }
    public final android.accessibilityservice.AccessibilityService.SoftKeyboardController getSoftKeyboardController() { return null; }
    public android.accessibilityservice.InputMethod onCreateInputMethod() { return null; }
    public final android.accessibilityservice.InputMethod getInputMethod() { return null; }
    public final android.accessibilityservice.AccessibilityButtonController getAccessibilityButtonController() { return null; }
    public final android.accessibilityservice.AccessibilityButtonController getAccessibilityButtonController(int p0) { return null; }
    public boolean setCacheEnabled(boolean p0) { return false; }
    public boolean clearCachedSubtree(android.view.accessibility.AccessibilityNodeInfo p0) { return false; }
    public boolean clearCache() { return false; }
    public boolean isNodeInCache(android.view.accessibility.AccessibilityNodeInfo p0) { return false; }
    public boolean isCacheEnabled() { return false; }
    public void onSystemActionsChanged() {}
    public final java.util.List<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> getSystemActions() { return null; }
    public final boolean performGlobalAction(int p0) { return false; }
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int p0) { return null; }
    public final android.accessibilityservice.AccessibilityServiceInfo getServiceInfo() { return null; }
    public final void setServiceInfo(android.accessibilityservice.AccessibilityServiceInfo p0) {}
    public java.lang.Object getSystemService(java.lang.String p0) { return null; }
    public void takeScreenshot(int p0, java.util.concurrent.Executor p1, android.accessibilityservice.AccessibilityService.TakeScreenshotCallback p2) {}
    public void takeScreenshotOfWindow(int p0, java.util.concurrent.Executor p1, android.accessibilityservice.AccessibilityService.TakeScreenshotCallback p2) {}
    public void setAccessibilityFocusAppearance(int p0, int p1) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public void setGestureDetectionPassthroughRegion(int p0, android.graphics.Region p1) {}
    public void setTouchExplorationPassthroughRegion(int p0, android.graphics.Region p1) {}
    public void setAnimationScale(float p0) {}
    public final android.accessibilityservice.TouchInteractionController getTouchInteractionController(int p0) { return null; }
    void sendMotionEventToCallback(android.view.MotionEvent p0) {}
    void onTouchStateChanged(int p0, int p1) {}
    public void attachAccessibilityOverlayToDisplay(int p0, android.view.SurfaceControl p1) {}
    public void attachAccessibilityOverlayToWindow(int p0, android.view.SurfaceControl p1) {}

    public static final class SoftKeyboardController {
        public static final int ENABLE_IME_SUCCESS = 0;
        public static final int ENABLE_IME_FAIL_BY_ADMIN = 1;
        public static final int ENABLE_IME_FAIL_UNKNOWN = 2;
        SoftKeyboardController(android.accessibilityservice.AccessibilityService p0, java.lang.Object p1) {}
        void onServiceConnected() {}
        public void addOnShowModeChangedListener(android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener p0) {}
        public void addOnShowModeChangedListener(android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener p0, android.os.Handler p1) {}
        public boolean removeOnShowModeChangedListener(android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener p0) { return false; }
        void dispatchSoftKeyboardShowModeChanged(int p0) {}
        public int getShowMode() { return 0; }
        public boolean setShowMode(int p0) { return false; }
        public boolean switchToInputMethod(java.lang.String p0) { return false; }
        public int setInputMethodEnabled(java.lang.String p0, boolean p1) throws java.lang.SecurityException { return 0; }

        public static interface OnShowModeChangedListener {
            public void onShowModeChanged(android.accessibilityservice.AccessibilityService.SoftKeyboardController p0, int p1);
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface EnableImeResult {
        }
    }

    public static abstract class GestureResultCallback {
        public GestureResultCallback() {}
        public void onCompleted(android.accessibilityservice.GestureDescription p0) {}
        public void onCancelled(android.accessibilityservice.GestureDescription p0) {}
    }

    public static final class ScreenshotResult {
        public ScreenshotResult(android.hardware.HardwareBuffer p0, android.graphics.ColorSpace p1, long p2) {}
        public android.graphics.ColorSpace getColorSpace() { return null; }
        public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
        public long getTimestamp() { return 0L; }
    }

    public static interface TakeScreenshotCallback {
        public void onSuccess(android.accessibilityservice.AccessibilityService.ScreenshotResult p0);
        public void onFailure(int p0);
    }

    public static final class MagnificationController {
        MagnificationController(android.accessibilityservice.AccessibilityService p0, java.lang.Object p1, int p2) {}
        void onServiceConnectedLocked() {}
        public void addListener(android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener p0) {}
        public void addListener(android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener p0, android.os.Handler p1) {}
        public boolean removeListener(android.accessibilityservice.AccessibilityService.MagnificationController.OnMagnificationChangedListener p0) { return false; }
        void dispatchMagnificationChanged(android.graphics.Region p0, android.accessibilityservice.MagnificationConfig p1) {}
        public android.accessibilityservice.MagnificationConfig getMagnificationConfig() { return null; }
        @java.lang.Deprecated
        public float getScale() { return 0.0f; }
        @java.lang.Deprecated
        public float getCenterX() { return 0.0f; }
        @java.lang.Deprecated
        public float getCenterY() { return 0.0f; }
        @java.lang.Deprecated
        public android.graphics.Region getMagnificationRegion() { return null; }
        public android.graphics.Region getCurrentMagnificationRegion() { return null; }
        public boolean reset(boolean p0) { return false; }
        public boolean resetCurrentMagnification(boolean p0) { return false; }
        public boolean setMagnificationConfig(android.accessibilityservice.MagnificationConfig p0, boolean p1) { return false; }
        @java.lang.Deprecated
        public boolean setScale(float p0, boolean p1) { return false; }
        @java.lang.Deprecated
        public boolean setCenter(float p0, float p1, boolean p2) { return false; }

        public static interface OnMagnificationChangedListener {
            @java.lang.Deprecated
            public void onMagnificationChanged(android.accessibilityservice.AccessibilityService.MagnificationController p0, android.graphics.Region p1, float p2, float p3, float p4);
            default public void onMagnificationChanged(android.accessibilityservice.AccessibilityService.MagnificationController p0, android.graphics.Region p1, android.accessibilityservice.MagnificationConfig p2) {}
        }
    }

    private static class AccessibilityContext extends android.content.ContextWrapper {
        AccessibilityContext() { super(null); }
        public android.content.Context createDisplayContext(android.view.Display p0) { return null; }
        public android.content.Context createWindowContext(int p0, android.os.Bundle p1) { return null; }
        public android.content.Context createWindowContext(android.view.Display p0, int p1, android.os.Bundle p2) { return null; }
    }

    public static interface Callbacks {
        public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0);
        public void onInterrupt();
        public void onServiceConnected();
        public void init(int p0, android.os.IBinder p1);
        public boolean onGesture(android.accessibilityservice.AccessibilityGestureEvent p0);
        public boolean onKeyEvent(android.view.KeyEvent p0);
        public void onMagnificationChanged(int p0, android.graphics.Region p1, android.accessibilityservice.MagnificationConfig p2);
        public void onMotionEvent(android.view.MotionEvent p0);
        public void onTouchStateChanged(int p0, int p1);
        public void onSoftKeyboardShowModeChanged(int p0);
        public void onPerformGestureResult(int p0, boolean p1);
        public void onFingerprintCapturingGesturesChanged(boolean p0);
        public void onFingerprintGesture(int p0);
        public void onAccessibilityButtonClicked(int p0);
        public void onAccessibilityButtonAvailabilityChanged(boolean p0);
        public void onSystemActionsChanged();
        public void createImeSession(com.android.internal.inputmethod.IAccessibilityInputMethodSessionCallback p0);
        public void startInput(com.android.internal.inputmethod.RemoteAccessibilityInputConnection p0, android.view.inputmethod.EditorInfo p1, boolean p2);
    }

    private static class GestureResultCallbackInfo {
        android.accessibilityservice.GestureDescription gestureDescription;
        android.accessibilityservice.AccessibilityService.GestureResultCallback callback;
        android.os.Handler handler;
        GestureResultCallbackInfo(android.accessibilityservice.GestureDescription p0, android.accessibilityservice.AccessibilityService.GestureResultCallback p1, android.os.Handler p2) {}
    }

    public static class IAccessibilityServiceClientWrapper extends android.accessibilityservice.IAccessibilityServiceClient.Stub {
        com.android.internal.inputmethod.CancellationGroup mCancellationGroup;
        public IAccessibilityServiceClientWrapper(android.content.Context p0, java.util.concurrent.Executor p1, android.accessibilityservice.AccessibilityService.Callbacks p2) { super(); }
        public IAccessibilityServiceClientWrapper(android.content.Context p0, android.os.Looper p1, android.accessibilityservice.AccessibilityService.Callbacks p2) { super(); }
        public void init(android.accessibilityservice.IAccessibilityServiceConnection p0, int p1, android.os.IBinder p2) {}
        public void onInterrupt() {}
        public void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0, boolean p1) {}
        public void onGesture(android.accessibilityservice.AccessibilityGestureEvent p0) {}
        public void clearAccessibilityCache() {}
        public void onKeyEvent(android.view.KeyEvent p0, int p1) {}
        public void onMagnificationChanged(int p0, android.graphics.Region p1, android.accessibilityservice.MagnificationConfig p2) {}
        public void onSoftKeyboardShowModeChanged(int p0) {}
        public void onPerformGestureResult(int p0, boolean p1) {}
        public void onFingerprintCapturingGesturesChanged(boolean p0) {}
        public void onFingerprintGesture(int p0) {}
        public void onAccessibilityButtonClicked(int p0) {}
        public void onAccessibilityButtonAvailabilityChanged(boolean p0) {}
        public void onSystemActionsChanged() {}
        public void createImeSession(com.android.internal.inputmethod.IAccessibilityInputMethodSessionCallback p0) {}
        public void setImeSessionEnabled(com.android.internal.inputmethod.IAccessibilityInputMethodSession p0, boolean p1) {}
        public void bindInput() {}
        public void unbindInput() {}
        public void startInput(com.android.internal.inputmethod.IRemoteAccessibilityInputConnection p0, android.view.inputmethod.EditorInfo p1, boolean p2) {}
        public void onMotionEvent(android.view.MotionEvent p0) {}
        public void onTouchStateChanged(int p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ScreenshotErrorCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SoftKeyboardShowMode {
    }
}
