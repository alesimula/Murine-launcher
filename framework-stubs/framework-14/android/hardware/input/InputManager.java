package android.hardware.input;

public final class InputManager {
    public static final java.lang.String ACTION_QUERY_KEYBOARD_LAYOUTS = "android.hardware.input.action.QUERY_KEYBOARD_LAYOUTS";
    public static final java.lang.String META_DATA_KEYBOARD_LAYOUTS = "android.hardware.input.metadata.KEYBOARD_LAYOUTS";
    public static final long BLOCK_UNTRUSTED_TOUCHES = 158002302L;
    public static final int INJECT_INPUT_EVENT_MODE_ASYNC = 0;
    public static final int INJECT_INPUT_EVENT_MODE_WAIT_FOR_RESULT = 1;
    public static final int INJECT_INPUT_EVENT_MODE_WAIT_FOR_FINISH = 2;
    public static final int SWITCH_STATE_UNKNOWN = -1;
    public static final int SWITCH_STATE_OFF = 0;
    public static final int SWITCH_STATE_ON = 1;
    public InputManager(android.content.Context p0) {}
    @java.lang.Deprecated
    public static android.hardware.input.InputManager getInstance() { return null; }
    public java.lang.String getVelocityTrackerStrategy() { return null; }
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
    public java.lang.String getKeyboardLayoutTypeForLayoutDescriptor(java.lang.String p0) { return null; }
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
    @android.annotation.RequiresPermission("android.permission.REMAP_MODIFIER_KEYS")
    public void remapModifierKey(int p0, int p1) {}
    @android.annotation.RequiresPermission("android.permission.REMAP_MODIFIER_KEYS")
    public void clearAllModifierKeyRemappings() {}
    @android.annotation.RequiresPermission("android.permission.REMAP_MODIFIER_KEYS")
    public java.util.Map<java.lang.Integer, java.lang.Integer> getModifierKeyRemapping() { return null; }
    public android.hardware.input.TouchCalibration getTouchCalibration(java.lang.String p0, int p1) { return null; }
    public void setTouchCalibration(java.lang.String p0, int p1, android.hardware.input.TouchCalibration p2) {}
    public java.lang.String getKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3) { return null; }
    @android.annotation.RequiresPermission("android.permission.SET_KEYBOARD_LAYOUT")
    public void setKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3, java.lang.String p4) {}
    public android.hardware.input.KeyboardLayout[] getKeyboardLayoutListForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3) { return null; }
    public void tryPointerSpeed(int p0) {}
    public float getMaximumObscuringOpacityForTouch() { return 0.0f; }
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
    public boolean isStylusPointerIconEnabled() { return false; }
    public void requestPointerCapture(android.os.IBinder p0, boolean p1) {}
    public android.view.InputMonitor monitorGestureInput(java.lang.String p0, int p1) { return null; }
    public android.hardware.input.InputSensorInfo[] getSensorList(int p0) { return null; }
    public boolean enableSensor(int p0, int p1, int p2, int p3) { return false; }
    public void disableSensor(int p0, int p1) {}
    public boolean flushSensor(int p0, int p1) { return false; }
    public boolean registerSensorListener(android.hardware.input.IInputSensorEventListener p0) { return false; }
    public void unregisterSensorListener(android.hardware.input.IInputSensorEventListener p0) {}
    public void addPortAssociation(java.lang.String p0, int p1) {}
    public void removePortAssociation(java.lang.String p0) {}
    public void addUniqueIdAssociation(java.lang.String p0, java.lang.String p1) {}
    public void removeUniqueIdAssociation(java.lang.String p0) {}
    public android.hardware.input.HostUsiVersion getHostUsiVersion(android.view.Display p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH")
    public java.lang.String getInputDeviceBluetoothAddress(int p0) { return null; }
    public android.os.Vibrator getInputDeviceVibrator(int p0, int p1) { return null; }
    public void cancelCurrentTouch() {}
    @android.annotation.RequiresPermission("android.permission.MONITOR_INPUT")
    public void pilferPointers(android.os.IBinder p0) {}
    public void addInputDeviceBatteryListener(int p0, java.util.concurrent.Executor p1, android.hardware.input.InputManager.InputDeviceBatteryListener p2) {}
    public void removeInputDeviceBatteryListener(int p0, android.hardware.input.InputManager.InputDeviceBatteryListener p1) {}
    public boolean areTouchpadGesturesAvailable(android.content.Context p0) { return false; }
    @android.annotation.RequiresPermission("android.permission.MONITOR_KEYBOARD_BACKLIGHT")
    public void registerKeyboardBacklightListener(java.util.concurrent.Executor p0, android.hardware.input.InputManager.KeyboardBacklightListener p1) throws java.lang.IllegalArgumentException {}
    @android.annotation.RequiresPermission("android.permission.MONITOR_KEYBOARD_BACKLIGHT")
    public void unregisterKeyboardBacklightListener(android.hardware.input.InputManager.KeyboardBacklightListener p0) {}

    public static interface InputDeviceListener {
        public void onInputDeviceAdded(int p0);
        public void onInputDeviceRemoved(int p0);
        public void onInputDeviceChanged(int p0);
    }

    public static interface InputDeviceBatteryListener {
        public void onBatteryStateChanged(int p0, long p1, android.hardware.BatteryState p2);
    }

    public static interface KeyboardBacklightListener {
        public void onKeyboardBacklightChanged(int p0, android.hardware.input.KeyboardBacklightState p1, boolean p2);
    }

    public static interface OnTabletModeChangedListener {
        public void onTabletModeChanged(long p0, boolean p1);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RemappableModifierKey {
        public static final int REMAPPABLE_MODIFIER_KEY_CTRL_LEFT = 113;
        public static final int REMAPPABLE_MODIFIER_KEY_CTRL_RIGHT = 114;
        public static final int REMAPPABLE_MODIFIER_KEY_META_LEFT = 117;
        public static final int REMAPPABLE_MODIFIER_KEY_META_RIGHT = 118;
        public static final int REMAPPABLE_MODIFIER_KEY_ALT_LEFT = 57;
        public static final int REMAPPABLE_MODIFIER_KEY_ALT_RIGHT = 58;
        public static final int REMAPPABLE_MODIFIER_KEY_SHIFT_LEFT = 59;
        public static final int REMAPPABLE_MODIFIER_KEY_SHIFT_RIGHT = 60;
        public static final int REMAPPABLE_MODIFIER_KEY_CAPS_LOCK = 115;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SwitchState {
    }
}
