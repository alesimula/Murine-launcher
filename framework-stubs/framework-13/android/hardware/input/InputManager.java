package android.hardware.input;

public final class InputManager {
    public static final int[] BLOCK_UNTRUSTED_TOUCHES_MODES = null;
    public static final java.lang.String ACTION_QUERY_KEYBOARD_LAYOUTS = "android.hardware.input.action.QUERY_KEYBOARD_LAYOUTS";
    public static final java.lang.String META_DATA_KEYBOARD_LAYOUTS = "android.hardware.input.metadata.KEYBOARD_LAYOUTS";
    public static final int MIN_POINTER_SPEED = -7;
    public static final int MAX_POINTER_SPEED = 7;
    public static final int DEFAULT_POINTER_SPEED = 0;
    public static final float DEFAULT_MAXIMUM_OBSCURING_OPACITY_FOR_TOUCH = 0.800000011920929f;
    @android.os.BlockUntrustedTouchesMode
    public static final int DEFAULT_BLOCK_UNTRUSTED_TOUCHES_MODE = 2;
    public static final long BLOCK_UNTRUSTED_TOUCHES = 158002302L;
    public static final int INJECT_INPUT_EVENT_MODE_ASYNC = 0;
    public static final int INJECT_INPUT_EVENT_MODE_WAIT_FOR_RESULT = 1;
    public static final int INJECT_INPUT_EVENT_MODE_WAIT_FOR_FINISH = 2;
    public static final int SWITCH_STATE_UNKNOWN = -1;
    public static final int SWITCH_STATE_OFF = 0;
    public static final int SWITCH_STATE_ON = 1;
    public static android.hardware.input.InputManager resetInstance(android.hardware.input.IInputManager p0) { return null; }
    public static void clearInstance() {}
    public static android.hardware.input.InputManager getInstance() { return null; }
    public android.view.InputDevice getInputDevice(int p0) { return null; }
    public android.view.InputDevice getInputDeviceByDescriptor(java.lang.String p0) { return null; }
    public int[] getInputDeviceIds() { return null; }
    public boolean isInputDeviceEnabled(int p0) { return false; }
    public void enableInputDevice(int p0) {}
    public void disableInputDevice(int p0) {}
    public void registerInputDeviceListener(android.hardware.input.InputManager.InputDeviceListener p0, android.os.Handler p1) {}
    public void unregisterInputDeviceListener(android.hardware.input.InputManager.InputDeviceListener p0) {}
    public int isInTabletMode() { return 0; }
    public void registerOnTabletModeChangedListener(android.hardware.input.InputManager.OnTabletModeChangedListener p0, android.os.Handler p1) {}
    public void unregisterOnTabletModeChangedListener(android.hardware.input.InputManager.OnTabletModeChangedListener p0) {}
    public int isMicMuted() { return 0; }
    public android.hardware.input.KeyboardLayout[] getKeyboardLayouts() { return null; }
    public java.util.List<java.lang.String> getKeyboardLayoutDescriptorsForInputDevice(android.view.InputDevice p0) { return null; }
    public android.hardware.input.KeyboardLayout[] getKeyboardLayoutsForInputDevice(android.hardware.input.InputDeviceIdentifier p0) { return null; }
    public android.hardware.input.KeyboardLayout getKeyboardLayout(java.lang.String p0) { return null; }
    public java.lang.String getCurrentKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.SET_KEYBOARD_LAYOUT")
    public void setCurrentKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) {}
    public java.lang.String[] getEnabledKeyboardLayoutsForInputDevice(android.hardware.input.InputDeviceIdentifier p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.SET_KEYBOARD_LAYOUT")
    public void addKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) {}
    @android.annotation.RequiresPermission("android.permission.SET_KEYBOARD_LAYOUT")
    public void removeKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) {}
    public android.hardware.input.TouchCalibration getTouchCalibration(java.lang.String p0, int p1) { return null; }
    public void setTouchCalibration(java.lang.String p0, int p1, android.hardware.input.TouchCalibration p2) {}
    public int getPointerSpeed(android.content.Context p0) { return 0; }
    public void setPointerSpeed(android.content.Context p0, int p1) {}
    public void tryPointerSpeed(int p0) {}
    public float getMaximumObscuringOpacityForTouch() { return 0.0f; }
    @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
    public void setMaximumObscuringOpacityForTouch(float p0) {}
    @android.os.BlockUntrustedTouchesMode
    public int getBlockUntrustedTouchesMode(android.content.Context p0) { return 0; }
    @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
    public void setBlockUntrustedTouchesMode(android.content.Context p0, int p1) {}
    public boolean[] deviceHasKeys(int[] p0) { return null; }
    public boolean[] deviceHasKeys(int p0, int[] p1) { return null; }
    public int getKeyCodeForKeyLocation(int p0, int p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.INJECT_EVENTS")
    public boolean injectInputEvent(android.view.InputEvent p0, int p1, int p2) { return false; }
    @android.annotation.RequiresPermission("android.permission.INJECT_EVENTS")
    public boolean injectInputEvent(android.view.InputEvent p0, int p1) { return false; }
    public android.view.VerifiedInputEvent verifyInputEvent(android.view.InputEvent p0) { return null; }
    public void setPointerIconType(int p0) {}
    public void setCustomPointerIcon(android.view.PointerIcon p0) {}
    public void requestPointerCapture(android.os.IBinder p0, boolean p1) {}
    public android.view.InputMonitor monitorGestureInput(java.lang.String p0, int p1) { return null; }
    public android.hardware.input.InputSensorInfo[] getSensorList(int p0) { return null; }
    public boolean enableSensor(int p0, int p1, int p2, int p3) { return false; }
    public void disableSensor(int p0, int p1) {}
    public boolean flushSensor(int p0, int p1) { return false; }
    public boolean registerSensorListener(android.hardware.input.IInputSensorEventListener p0) { return false; }
    public void unregisterSensorListener(android.hardware.input.IInputSensorEventListener p0) {}
    public int getBatteryStatus(int p0) { return 0; }
    public int getBatteryCapacity(int p0) { return 0; }
    public void addPortAssociation(java.lang.String p0, int p1) {}
    public void removePortAssociation(java.lang.String p0) {}
    public void addUniqueIdAssociation(java.lang.String p0, java.lang.String p1) {}
    public void removeUniqueIdAssociation(java.lang.String p0) {}
    public android.os.Vibrator getInputDeviceVibrator(int p0, int p1) { return null; }
    public android.os.VibratorManager getInputDeviceVibratorManager(int p0) { return null; }
    int[] getVibratorIds(int p0) { return null; }
    void vibrate(int p0, android.os.VibrationEffect p1, android.os.IBinder p2) {}
    void vibrate(int p0, android.os.CombinedVibration p1, android.os.IBinder p2) {}
    void cancelVibrate(int p0, android.os.IBinder p1) {}
    boolean isVibrating(int p0) { return false; }
    boolean registerVibratorStateListener(int p0, android.os.IVibratorStateListener p1) { return false; }
    boolean unregisterVibratorStateListener(int p0, android.os.IVibratorStateListener p1) { return false; }
    public android.hardware.SensorManager getInputDeviceSensorManager(int p0) { return null; }
    public android.hardware.input.InputDeviceBatteryState getInputDeviceBatteryState(int p0, boolean p1) { return null; }
    public android.hardware.lights.LightsManager getInputDeviceLightsManager(int p0) { return null; }
    java.util.List<android.hardware.lights.Light> getLights(int p0) { return null; }
    android.hardware.lights.LightState getLightState(int p0, android.hardware.lights.Light p1) { return null; }
    void requestLights(int p0, android.hardware.lights.LightsRequest p1, android.os.IBinder p2) {}
    void openLightSession(int p0, java.lang.String p1, android.os.IBinder p2) {}
    void closeLightSession(int p0, android.os.IBinder p1) {}
    public void cancelCurrentTouch() {}
    public void addInputDeviceBatteryListener(int p0, java.util.concurrent.Executor p1, android.hardware.input.InputManager.InputDeviceBatteryListener p2) {}
    @android.annotation.RequiresPermission("android.permission.MONITOR_INPUT")
    public void pilferPointers(android.os.IBinder p0) {}
    public void removeInputDeviceBatteryListener(int p0, android.hardware.input.InputManager.InputDeviceBatteryListener p1) {}
    public boolean isStylusEverUsed(android.content.Context p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
    public void setStylusEverUsed(android.content.Context p0, boolean p1) {}

    public static interface InputDeviceBatteryListener {
        public void onBatteryStateChanged(int p0, long p1, android.hardware.BatteryState p2);
    }

    private static final class InputDeviceBatteryListenerDelegate {
        final android.hardware.input.InputManager.InputDeviceBatteryListener mListener = null;
        final java.util.concurrent.Executor mExecutor = null;
        InputDeviceBatteryListenerDelegate(android.hardware.input.InputManager.InputDeviceBatteryListener p0, java.util.concurrent.Executor p1) {}
        void notifyBatteryStateChanged(android.hardware.input.InputManager.LocalBatteryState p0) {}
    }

    public static interface InputDeviceListener {
        public void onInputDeviceAdded(int p0);
        public void onInputDeviceRemoved(int p0);
        public void onInputDeviceChanged(int p0);
    }

    private static final class InputDeviceListenerDelegate extends android.os.Handler {
        public final android.hardware.input.InputManager.InputDeviceListener mListener = null;
        public InputDeviceListenerDelegate(android.hardware.input.InputManager.InputDeviceListener p0, android.os.Handler p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private final class InputDevicesChangedListener extends android.hardware.input.IInputDevicesChangedListener.Stub {
        public void onInputDevicesChanged(int[] p0) throws android.os.RemoteException {}
    }

    private static final class LocalBatteryState extends android.hardware.BatteryState {
        final int mDeviceId = 0;
        final boolean mIsPresent = false;
        final int mStatus = 0;
        final float mCapacity = 0.0f;
        final long mEventTime = 0L;
        LocalBatteryState(int p0, boolean p1, int p2, float p3, long p4) { super(); }
        public boolean isPresent() { return false; }
        public int getStatus() { return 0; }
        public float getCapacity() { return 0.0f; }
    }

    private class LocalInputDeviceBatteryListener extends android.hardware.input.IInputDeviceBatteryListener.Stub {
        public void onBatteryStateChanged(int p0, boolean p1, int p2, float p3, long p4) {}
    }

    public static interface OnTabletModeChangedListener {
        public void onTabletModeChanged(long p0, boolean p1);
    }

    private static final class OnTabletModeChangedListenerDelegate extends android.os.Handler {
        public final android.hardware.input.InputManager.OnTabletModeChangedListener mListener = null;
        public OnTabletModeChangedListenerDelegate(android.hardware.input.InputManager.OnTabletModeChangedListener p0, android.os.Handler p1) { super(); }
        public void sendTabletModeChanged(long p0, boolean p1) {}
        public void handleMessage(android.os.Message p0) {}
    }

    private static final class RegisteredBatteryListeners {
        final java.util.List<android.hardware.input.InputManager.InputDeviceBatteryListenerDelegate> mDelegates = null;
        android.hardware.input.InputManager.LocalBatteryState mLatestBatteryState;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SwitchState {
    }

    private final class TabletModeChangedListener extends android.hardware.input.ITabletModeChangedListener.Stub {
        public void onTabletModeChanged(long p0, boolean p1) {}
    }
}
