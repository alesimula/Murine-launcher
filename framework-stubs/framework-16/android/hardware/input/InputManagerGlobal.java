package android.hardware.input;

public final class InputManagerGlobal {
    public InputManagerGlobal(android.hardware.input.IInputManager p0) {}
    public static android.hardware.input.InputManagerGlobal getInstance() { return null; }
    public android.hardware.input.IInputManager getInputManagerService() { return null; }
    public static android.hardware.input.InputManagerGlobal.TestSession createTestSession(android.hardware.input.IInputManager p0) { return null; }
    public java.lang.String getVelocityTrackerStrategy() { return null; }
    @android.annotation.Nullable
    public android.view.InputDevice getInputDevice(int p0) { return null; }
    public void registerInputDeviceListener(android.hardware.input.InputManager.InputDeviceListener p0, android.os.Handler p1) {}
    public void unregisterInputDeviceListener(android.hardware.input.InputManager.InputDeviceListener p0) {}
    public int[] getInputDeviceIds() { return null; }
    public void enableInputDevice(int p0) {}
    public void disableInputDevice(int p0) {}
    android.view.InputDevice getInputDeviceByDescriptor(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    android.hardware.input.HostUsiVersion getHostUsiVersion(android.view.Display p0) { return null; }
    void registerOnTabletModeChangedListener(android.hardware.input.InputManager.OnTabletModeChangedListener p0, android.os.Handler p1) {}
    void unregisterOnTabletModeChangedListener(android.hardware.input.InputManager.OnTabletModeChangedListener p0) {}
    public void addInputDeviceBatteryListener(int p0, java.util.concurrent.Executor p1, android.hardware.input.InputManager.InputDeviceBatteryListener p2) {}
    void removeInputDeviceBatteryListener(int p0, android.hardware.input.InputManager.InputDeviceBatteryListener p1) {}
    @android.annotation.NonNull
    public android.hardware.BatteryState getInputDeviceBatteryState(int p0, boolean p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.MONITOR_KEYBOARD_BACKLIGHT")
    void registerKeyboardBacklightListener(java.util.concurrent.Executor p0, android.hardware.input.InputManager.KeyboardBacklightListener p1) throws java.lang.IllegalArgumentException {}
    @android.annotation.RequiresPermission("android.permission.MONITOR_KEYBOARD_BACKLIGHT")
    void unregisterKeyboardBacklightListener(android.hardware.input.InputManager.KeyboardBacklightListener p0) {}
    @android.annotation.RequiresPermission("android.permission.MONITOR_STICKY_MODIFIER_STATE")
    void registerStickyModifierStateListener(java.util.concurrent.Executor p0, android.hardware.input.InputManager.StickyModifierStateListener p1) throws java.lang.IllegalArgumentException {}
    @android.annotation.RequiresPermission("android.permission.MONITOR_STICKY_MODIFIER_STATE")
    void unregisterStickyModifierStateListener(android.hardware.input.InputManager.StickyModifierStateListener p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_KEY_GESTURES")
    void registerKeyGestureEventListener(java.util.concurrent.Executor p0, android.hardware.input.InputManager.KeyGestureEventListener p1) throws java.lang.IllegalArgumentException {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_KEY_GESTURES")
    void unregisterKeyGestureEventListener(android.hardware.input.InputManager.KeyGestureEventListener p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_KEY_GESTURES")
    void registerKeyGestureEventHandler(java.util.List<java.lang.Integer> p0, android.hardware.input.InputManager.KeyGestureEventHandler p1) throws java.lang.IllegalArgumentException {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_KEY_GESTURES")
    void unregisterKeyGestureEventHandler(android.hardware.input.InputManager.KeyGestureEventHandler p0) {}
    boolean registerKeyEventActivityListener(android.hardware.input.InputManager.KeyEventActivityListener p0) { return false; }
    boolean unregisterKeyEventActivityListener(android.hardware.input.InputManager.KeyEventActivityListener p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.SET_KEYBOARD_LAYOUT")
    public void setKeyboardLayoutOverrideForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) {}
    @android.annotation.NonNull
    public android.hardware.input.KeyboardLayout[] getKeyboardLayoutsForInputDevice(android.hardware.input.InputDeviceIdentifier p0) { return null; }
    public void setCurrentKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) {}
    @android.annotation.NonNull
    public android.hardware.SensorManager getInputDeviceSensorManager(int p0) { return null; }
    android.hardware.input.InputSensorInfo[] getSensorList(int p0) { return null; }
    boolean enableSensor(int p0, int p1, int p2, int p3) { return false; }
    void disableSensor(int p0, int p1) {}
    boolean flushSensor(int p0, int p1) { return false; }
    boolean registerSensorListener(android.hardware.input.IInputSensorEventListener p0) { return false; }
    void unregisterSensorListener(android.hardware.input.IInputSensorEventListener p0) {}
    @android.annotation.NonNull
    public android.hardware.lights.LightsManager getInputDeviceLightsManager(int p0) { return null; }
    @android.annotation.NonNull
    java.util.List<android.hardware.lights.Light> getLights(int p0) { return null; }
    @android.annotation.NonNull
    android.hardware.lights.LightState getLightState(int p0, android.hardware.lights.Light p1) { return null; }
    void requestLights(int p0, android.hardware.lights.LightsRequest p1, android.os.IBinder p2) {}
    void openLightSession(int p0, java.lang.String p1, android.os.IBinder p2) {}
    void closeLightSession(int p0, android.os.IBinder p1) {}
    public android.os.Vibrator getInputDeviceVibrator(int p0, int p1) { return null; }
    @android.annotation.NonNull
    public android.os.VibratorManager getInputDeviceVibratorManager(int p0) { return null; }
    int[] getVibratorIds(int p0) { return null; }
    void vibrate(int p0, android.os.VibrationEffect p1, android.os.IBinder p2) {}
    void vibrate(int p0, android.os.CombinedVibration p1, android.os.IBinder p2) {}
    void cancelVibrate(int p0, android.os.IBinder p1) {}
    boolean isVibrating(int p0) { return false; }
    boolean registerVibratorStateListener(int p0, android.os.IVibratorStateListener p1) { return false; }
    boolean unregisterVibratorStateListener(int p0, android.os.IVibratorStateListener p1) { return false; }
    public boolean[] deviceHasKeys(int[] p0) { return null; }
    public boolean[] deviceHasKeys(int p0, int[] p1) { return null; }
    public int getKeyCodeForKeyLocation(int p0, int p1) { return 0; }
    public android.view.KeyCharacterMap getKeyCharacterMap(android.hardware.input.KeyboardLayout p0) { return null; }
    public boolean injectInputEvent(android.view.InputEvent p0, int p1, int p2) { return false; }
    public boolean injectInputEvent(android.view.InputEvent p0, int p1) { return false; }
    public boolean setPointerIcon(android.view.PointerIcon p0, int p1, int p2, int p3, android.os.IBinder p4) { return false; }
    public void requestPointerCapture(android.os.IBinder p0, boolean p1) {}
    public android.view.InputMonitor monitorGestureInput(java.lang.String p0, int p1) { return null; }
    public void addUniqueIdAssociationByPort(java.lang.String p0, java.lang.String p1) {}
    public void removeUniqueIdAssociationByPort(java.lang.String p0) {}
    public void addUniqueIdAssociationByDescriptor(java.lang.String p0, java.lang.String p1) {}
    public void removeUniqueIdAssociationByDescriptor(java.lang.String p0) {}
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH")
    @android.annotation.Nullable
    public java.lang.String getInputDeviceBluetoothAddress(int p0) { return null; }
    public void cancelCurrentTouch() {}
    @android.annotation.RequiresPermission("android.permission.MONITOR_INPUT")
    public void pilferPointers(android.os.IBinder p0) {}

    private static final class InputDeviceBatteryListenerDelegate {
        final android.hardware.input.InputManager.InputDeviceBatteryListener mListener = null;
        final java.util.concurrent.Executor mExecutor = null;
        InputDeviceBatteryListenerDelegate(android.hardware.input.InputManager.InputDeviceBatteryListener p0, java.util.concurrent.Executor p1) {}
        void notifyBatteryStateChanged(android.hardware.input.IInputDeviceBatteryState p0) {}
    }

    private static final class InputDeviceListenerDelegate extends android.os.Handler {
        public final android.hardware.input.InputManager.InputDeviceListener mListener = null;
        static final int MSG_DEVICE_ADDED = 1;
        static final int MSG_DEVICE_REMOVED = 2;
        static final int MSG_DEVICE_CHANGED = 3;
        InputDeviceListenerDelegate(android.hardware.input.InputManager.InputDeviceListener p0, android.os.Handler p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    private final class InputDevicesChangedListener extends android.hardware.input.IInputDevicesChangedListener.Stub {
        public void onInputDevicesChanged(int[] p0) throws android.os.RemoteException {}
    }

    private static final class KeyGestureEventListenerDelegate {
        final android.hardware.input.InputManager.KeyGestureEventListener mListener = null;
        final java.util.concurrent.Executor mExecutor = null;
        KeyGestureEventListenerDelegate(android.hardware.input.InputManager.KeyGestureEventListener p0, java.util.concurrent.Executor p1) {}
        void onKeyGestureEvent(android.hardware.input.KeyGestureEvent p0) {}
    }

    private static final class KeyboardBacklightListenerDelegate {
        final android.hardware.input.InputManager.KeyboardBacklightListener mListener = null;
        final java.util.concurrent.Executor mExecutor = null;
        KeyboardBacklightListenerDelegate(android.hardware.input.InputManager.KeyboardBacklightListener p0, java.util.concurrent.Executor p1) {}
        void notifyKeyboardBacklightChange(int p0, android.hardware.input.IKeyboardBacklightState p1, boolean p2) {}
    }

    private static final class LocalBatteryState extends android.hardware.BatteryState {
        LocalBatteryState() { super(); }
        LocalBatteryState(boolean p0, int p1, float p2) { super(); }
        public boolean isPresent() { return false; }
        public int getStatus() { return 0; }
        public float getCapacity() { return 0.0f; }
    }

    private class LocalInputDeviceBatteryListener extends android.hardware.input.IInputDeviceBatteryListener.Stub {
        public void onBatteryStateChanged(android.hardware.input.IInputDeviceBatteryState p0) {}
    }

    private class LocalKeyEventActivityListener extends android.hardware.input.IKeyEventActivityListener.Stub {
        public void onKeyEventActivity() {}
    }

    private class LocalKeyGestureEventListener extends android.hardware.input.IKeyGestureEventListener.Stub {
        public void onKeyGestureEvent(android.hardware.input.AidlKeyGestureEvent p0) {}
    }

    private class LocalKeyGestureHandler extends android.hardware.input.IKeyGestureHandler.Stub {
        public void handleKeyGesture(android.hardware.input.AidlKeyGestureEvent p0, android.os.IBinder p1) {}
    }

    private class LocalKeyboardBacklightListener extends android.hardware.input.IKeyboardBacklightListener.Stub {
        public void onBrightnessChanged(int p0, android.hardware.input.IKeyboardBacklightState p1, boolean p2) {}
    }

    private static final class LocalKeyboardBacklightState extends android.hardware.input.KeyboardBacklightState {
        LocalKeyboardBacklightState(int p0, int p1) { super(); }
        public int getBrightnessLevel() { return 0; }
        public int getMaxBrightnessLevel() { return 0; }
    }

    private static final class LocalStickyModifierState extends android.hardware.input.StickyModifierState {
        LocalStickyModifierState(int p0, int p1) { super(); }
        public boolean isShiftModifierOn() { return false; }
        public boolean isShiftModifierLocked() { return false; }
        public boolean isCtrlModifierOn() { return false; }
        public boolean isCtrlModifierLocked() { return false; }
        public boolean isMetaModifierOn() { return false; }
        public boolean isMetaModifierLocked() { return false; }
        public boolean isAltModifierOn() { return false; }
        public boolean isAltModifierLocked() { return false; }
        public boolean isAltGrModifierOn() { return false; }
        public boolean isAltGrModifierLocked() { return false; }
    }

    private class LocalStickyModifierStateListener extends android.hardware.input.IStickyModifierStateListener.Stub {
        public void onStickyModifierStateChanged(int p0, int p1) {}
    }

    private static final class OnTabletModeChangedListenerDelegate extends android.os.Handler {
        public final android.hardware.input.InputManager.OnTabletModeChangedListener mListener = null;
        OnTabletModeChangedListenerDelegate(android.hardware.input.InputManager.OnTabletModeChangedListener p0, android.os.Handler p1) { super(); }
        public void sendTabletModeChanged(long p0, boolean p1) {}
        public void handleMessage(android.os.Message p0) {}
    }

    private static final class RegisteredBatteryListeners {
        final java.util.List<android.hardware.input.InputManagerGlobal.InputDeviceBatteryListenerDelegate> mDelegates = null;
        android.hardware.input.IInputDeviceBatteryState mInputDeviceBatteryState;
    }

    private static final class StickyModifierStateListenerDelegate {
        final android.hardware.input.InputManager.StickyModifierStateListener mListener = null;
        final java.util.concurrent.Executor mExecutor = null;
        StickyModifierStateListenerDelegate(android.hardware.input.InputManager.StickyModifierStateListener p0, java.util.concurrent.Executor p1) {}
        void notifyStickyModifierStateChange(int p0, int p1) {}
    }

    private final class TabletModeChangedListener extends android.hardware.input.ITabletModeChangedListener.Stub {
        public void onTabletModeChanged(long p0, boolean p1) {}
    }

    public static interface TestSession extends java.lang.AutoCloseable {
        public void close();
    }
}
