package android.hardware.input;

public interface IInputManager extends android.os.IInterface {
    public java.lang.String getVelocityTrackerStrategy() throws android.os.RemoteException;
    public android.view.InputDevice getInputDevice(int p0) throws android.os.RemoteException;
    public int[] getInputDeviceIds() throws android.os.RemoteException;
    public boolean isInputDeviceEnabled(int p0) throws android.os.RemoteException;
    public void enableInputDevice(int p0) throws android.os.RemoteException;
    public void disableInputDevice(int p0) throws android.os.RemoteException;
    public boolean hasKeys(int p0, int p1, int[] p2, boolean[] p3) throws android.os.RemoteException;
    public int getKeyCodeForKeyLocation(int p0, int p1) throws android.os.RemoteException;
    public void tryPointerSpeed(int p0) throws android.os.RemoteException;
    public boolean injectInputEvent(android.view.InputEvent p0, int p1) throws android.os.RemoteException;
    public boolean injectInputEventToTarget(android.view.InputEvent p0, int p1, int p2) throws android.os.RemoteException;
    public android.view.VerifiedInputEvent verifyInputEvent(android.view.InputEvent p0) throws android.os.RemoteException;
    public android.hardware.input.TouchCalibration getTouchCalibrationForInputDevice(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setTouchCalibrationForInputDevice(java.lang.String p0, int p1, android.hardware.input.TouchCalibration p2) throws android.os.RemoteException;
    public android.hardware.input.KeyboardLayout[] getKeyboardLayouts() throws android.os.RemoteException;
    public android.hardware.input.KeyboardLayout[] getKeyboardLayoutsForInputDevice(android.hardware.input.InputDeviceIdentifier p0) throws android.os.RemoteException;
    public android.hardware.input.KeyboardLayout getKeyboardLayout(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getCurrentKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SET_KEYBOARD_LAYOUT")
    @android.annotation.EnforcePermission("android.permission.SET_KEYBOARD_LAYOUT")
    public void setCurrentKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String[] getEnabledKeyboardLayoutsForInputDevice(android.hardware.input.InputDeviceIdentifier p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SET_KEYBOARD_LAYOUT")
    @android.annotation.EnforcePermission("android.permission.SET_KEYBOARD_LAYOUT")
    public void addKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SET_KEYBOARD_LAYOUT")
    @android.annotation.EnforcePermission("android.permission.SET_KEYBOARD_LAYOUT")
    public void removeKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String getKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SET_KEYBOARD_LAYOUT")
    @android.annotation.EnforcePermission("android.permission.SET_KEYBOARD_LAYOUT")
    public void setKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3, java.lang.String p4) throws android.os.RemoteException;
    public android.hardware.input.KeyboardLayout[] getKeyboardLayoutListForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.REMAP_MODIFIER_KEYS")
    @android.annotation.EnforcePermission("android.permission.REMAP_MODIFIER_KEYS")
    public void remapModifierKey(int p0, int p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.REMAP_MODIFIER_KEYS")
    @android.annotation.EnforcePermission("android.permission.REMAP_MODIFIER_KEYS")
    public void clearAllModifierKeyRemappings() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.REMAP_MODIFIER_KEYS")
    @android.annotation.EnforcePermission("android.permission.REMAP_MODIFIER_KEYS")
    public java.util.Map getModifierKeyRemapping() throws android.os.RemoteException;
    public void registerInputDevicesChangedListener(android.hardware.input.IInputDevicesChangedListener p0) throws android.os.RemoteException;
    public int isInTabletMode() throws android.os.RemoteException;
    public void registerTabletModeChangedListener(android.hardware.input.ITabletModeChangedListener p0) throws android.os.RemoteException;
    public int isMicMuted() throws android.os.RemoteException;
    public void vibrate(int p0, android.os.VibrationEffect p1, android.os.IBinder p2) throws android.os.RemoteException;
    public void vibrateCombined(int p0, android.os.CombinedVibration p1, android.os.IBinder p2) throws android.os.RemoteException;
    public void cancelVibrate(int p0, android.os.IBinder p1) throws android.os.RemoteException;
    public int[] getVibratorIds(int p0) throws android.os.RemoteException;
    public boolean isVibrating(int p0) throws android.os.RemoteException;
    public boolean registerVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException;
    public boolean unregisterVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException;
    public android.hardware.input.IInputDeviceBatteryState getBatteryState(int p0) throws android.os.RemoteException;
    public void setPointerIconType(int p0) throws android.os.RemoteException;
    public void setCustomPointerIcon(android.view.PointerIcon p0) throws android.os.RemoteException;
    public void requestPointerCapture(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public android.view.InputMonitor monitorGestureInput(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void addPortAssociation(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void removePortAssociation(java.lang.String p0) throws android.os.RemoteException;
    public void addUniqueIdAssociation(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void removeUniqueIdAssociation(java.lang.String p0) throws android.os.RemoteException;
    public android.hardware.input.InputSensorInfo[] getSensorList(int p0) throws android.os.RemoteException;
    public boolean registerSensorListener(android.hardware.input.IInputSensorEventListener p0) throws android.os.RemoteException;
    public void unregisterSensorListener(android.hardware.input.IInputSensorEventListener p0) throws android.os.RemoteException;
    public boolean enableSensor(int p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void disableSensor(int p0, int p1) throws android.os.RemoteException;
    public boolean flushSensor(int p0, int p1) throws android.os.RemoteException;
    public java.util.List<android.hardware.lights.Light> getLights(int p0) throws android.os.RemoteException;
    public android.hardware.lights.LightState getLightState(int p0, int p1) throws android.os.RemoteException;
    public void setLightStates(int p0, int[] p1, android.hardware.lights.LightState[] p2, android.os.IBinder p3) throws android.os.RemoteException;
    public void openLightSession(int p0, java.lang.String p1, android.os.IBinder p2) throws android.os.RemoteException;
    public void closeLightSession(int p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void cancelCurrentTouch() throws android.os.RemoteException;
    public void registerBatteryListener(int p0, android.hardware.input.IInputDeviceBatteryListener p1) throws android.os.RemoteException;
    public void unregisterBatteryListener(int p0, android.hardware.input.IInputDeviceBatteryListener p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.BLUETOOTH")
    @android.annotation.EnforcePermission("android.permission.BLUETOOTH")
    public java.lang.String getInputDeviceBluetoothAddress(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MONITOR_INPUT")
    @android.annotation.EnforcePermission("android.permission.MONITOR_INPUT")
    public void pilferPointers(android.os.IBinder p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MONITOR_KEYBOARD_BACKLIGHT")
    @android.annotation.EnforcePermission("android.permission.MONITOR_KEYBOARD_BACKLIGHT")
    public void registerKeyboardBacklightListener(android.hardware.input.IKeyboardBacklightListener p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MONITOR_KEYBOARD_BACKLIGHT")
    @android.annotation.EnforcePermission("android.permission.MONITOR_KEYBOARD_BACKLIGHT")
    public void unregisterKeyboardBacklightListener(android.hardware.input.IKeyboardBacklightListener p0) throws android.os.RemoteException;
    public android.hardware.input.HostUsiVersion getHostUsiVersionFromDisplayConfig(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.input.IInputManager {
        public Default() {}
        public java.lang.String getVelocityTrackerStrategy() throws android.os.RemoteException { return null; }
        public android.view.InputDevice getInputDevice(int p0) throws android.os.RemoteException { return null; }
        public int[] getInputDeviceIds() throws android.os.RemoteException { return null; }
        public boolean isInputDeviceEnabled(int p0) throws android.os.RemoteException { return false; }
        public void enableInputDevice(int p0) throws android.os.RemoteException {}
        public void disableInputDevice(int p0) throws android.os.RemoteException {}
        public boolean hasKeys(int p0, int p1, int[] p2, boolean[] p3) throws android.os.RemoteException { return false; }
        public int getKeyCodeForKeyLocation(int p0, int p1) throws android.os.RemoteException { return 0; }
        public void tryPointerSpeed(int p0) throws android.os.RemoteException {}
        public boolean injectInputEvent(android.view.InputEvent p0, int p1) throws android.os.RemoteException { return false; }
        public boolean injectInputEventToTarget(android.view.InputEvent p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public android.view.VerifiedInputEvent verifyInputEvent(android.view.InputEvent p0) throws android.os.RemoteException { return null; }
        public android.hardware.input.TouchCalibration getTouchCalibrationForInputDevice(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void setTouchCalibrationForInputDevice(java.lang.String p0, int p1, android.hardware.input.TouchCalibration p2) throws android.os.RemoteException {}
        public android.hardware.input.KeyboardLayout[] getKeyboardLayouts() throws android.os.RemoteException { return null; }
        public android.hardware.input.KeyboardLayout[] getKeyboardLayoutsForInputDevice(android.hardware.input.InputDeviceIdentifier p0) throws android.os.RemoteException { return null; }
        public android.hardware.input.KeyboardLayout getKeyboardLayout(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String getCurrentKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0) throws android.os.RemoteException { return null; }
        public void setCurrentKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) throws android.os.RemoteException {}
        public java.lang.String[] getEnabledKeyboardLayoutsForInputDevice(android.hardware.input.InputDeviceIdentifier p0) throws android.os.RemoteException { return null; }
        public void addKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) throws android.os.RemoteException {}
        public void removeKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) throws android.os.RemoteException {}
        public java.lang.String getKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3) throws android.os.RemoteException { return null; }
        public void setKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3, java.lang.String p4) throws android.os.RemoteException {}
        public android.hardware.input.KeyboardLayout[] getKeyboardLayoutListForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3) throws android.os.RemoteException { return null; }
        public void remapModifierKey(int p0, int p1) throws android.os.RemoteException {}
        public void clearAllModifierKeyRemappings() throws android.os.RemoteException {}
        public java.util.Map getModifierKeyRemapping() throws android.os.RemoteException { return null; }
        public void registerInputDevicesChangedListener(android.hardware.input.IInputDevicesChangedListener p0) throws android.os.RemoteException {}
        public int isInTabletMode() throws android.os.RemoteException { return 0; }
        public void registerTabletModeChangedListener(android.hardware.input.ITabletModeChangedListener p0) throws android.os.RemoteException {}
        public int isMicMuted() throws android.os.RemoteException { return 0; }
        public void vibrate(int p0, android.os.VibrationEffect p1, android.os.IBinder p2) throws android.os.RemoteException {}
        public void vibrateCombined(int p0, android.os.CombinedVibration p1, android.os.IBinder p2) throws android.os.RemoteException {}
        public void cancelVibrate(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public int[] getVibratorIds(int p0) throws android.os.RemoteException { return null; }
        public boolean isVibrating(int p0) throws android.os.RemoteException { return false; }
        public boolean registerVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
        public boolean unregisterVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
        public android.hardware.input.IInputDeviceBatteryState getBatteryState(int p0) throws android.os.RemoteException { return null; }
        public void setPointerIconType(int p0) throws android.os.RemoteException {}
        public void setCustomPointerIcon(android.view.PointerIcon p0) throws android.os.RemoteException {}
        public void requestPointerCapture(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public android.view.InputMonitor monitorGestureInput(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public void addPortAssociation(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void removePortAssociation(java.lang.String p0) throws android.os.RemoteException {}
        public void addUniqueIdAssociation(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void removeUniqueIdAssociation(java.lang.String p0) throws android.os.RemoteException {}
        public android.hardware.input.InputSensorInfo[] getSensorList(int p0) throws android.os.RemoteException { return null; }
        public boolean registerSensorListener(android.hardware.input.IInputSensorEventListener p0) throws android.os.RemoteException { return false; }
        public void unregisterSensorListener(android.hardware.input.IInputSensorEventListener p0) throws android.os.RemoteException {}
        public boolean enableSensor(int p0, int p1, int p2, int p3) throws android.os.RemoteException { return false; }
        public void disableSensor(int p0, int p1) throws android.os.RemoteException {}
        public boolean flushSensor(int p0, int p1) throws android.os.RemoteException { return false; }
        public java.util.List<android.hardware.lights.Light> getLights(int p0) throws android.os.RemoteException { return null; }
        public android.hardware.lights.LightState getLightState(int p0, int p1) throws android.os.RemoteException { return null; }
        public void setLightStates(int p0, int[] p1, android.hardware.lights.LightState[] p2, android.os.IBinder p3) throws android.os.RemoteException {}
        public void openLightSession(int p0, java.lang.String p1, android.os.IBinder p2) throws android.os.RemoteException {}
        public void closeLightSession(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void cancelCurrentTouch() throws android.os.RemoteException {}
        public void registerBatteryListener(int p0, android.hardware.input.IInputDeviceBatteryListener p1) throws android.os.RemoteException {}
        public void unregisterBatteryListener(int p0, android.hardware.input.IInputDeviceBatteryListener p1) throws android.os.RemoteException {}
        public java.lang.String getInputDeviceBluetoothAddress(int p0) throws android.os.RemoteException { return null; }
        public void pilferPointers(android.os.IBinder p0) throws android.os.RemoteException {}
        public void registerKeyboardBacklightListener(android.hardware.input.IKeyboardBacklightListener p0) throws android.os.RemoteException {}
        public void unregisterKeyboardBacklightListener(android.hardware.input.IKeyboardBacklightListener p0) throws android.os.RemoteException {}
        public android.hardware.input.HostUsiVersion getHostUsiVersionFromDisplayConfig(int p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.input.IInputManager {
        public static final java.lang.String DESCRIPTOR = "android.hardware.input.IInputManager";
        static final int TRANSACTION_getVelocityTrackerStrategy = 1;
        static final int TRANSACTION_getInputDevice = 2;
        static final int TRANSACTION_getInputDeviceIds = 3;
        static final int TRANSACTION_isInputDeviceEnabled = 4;
        static final int TRANSACTION_enableInputDevice = 5;
        static final int TRANSACTION_disableInputDevice = 6;
        static final int TRANSACTION_hasKeys = 7;
        static final int TRANSACTION_getKeyCodeForKeyLocation = 8;
        static final int TRANSACTION_tryPointerSpeed = 9;
        static final int TRANSACTION_injectInputEvent = 10;
        static final int TRANSACTION_injectInputEventToTarget = 11;
        static final int TRANSACTION_verifyInputEvent = 12;
        static final int TRANSACTION_getTouchCalibrationForInputDevice = 13;
        static final int TRANSACTION_setTouchCalibrationForInputDevice = 14;
        static final int TRANSACTION_getKeyboardLayouts = 15;
        static final int TRANSACTION_getKeyboardLayoutsForInputDevice = 16;
        static final int TRANSACTION_getKeyboardLayout = 17;
        static final int TRANSACTION_getCurrentKeyboardLayoutForInputDevice = 18;
        static final int TRANSACTION_setCurrentKeyboardLayoutForInputDevice = 19;
        static final int TRANSACTION_getEnabledKeyboardLayoutsForInputDevice = 20;
        static final int TRANSACTION_addKeyboardLayoutForInputDevice = 21;
        static final int TRANSACTION_removeKeyboardLayoutForInputDevice = 22;
        static final int TRANSACTION_getKeyboardLayoutForInputDevice = 23;
        static final int TRANSACTION_setKeyboardLayoutForInputDevice = 24;
        static final int TRANSACTION_getKeyboardLayoutListForInputDevice = 25;
        static final int TRANSACTION_remapModifierKey = 26;
        static final int TRANSACTION_clearAllModifierKeyRemappings = 27;
        static final int TRANSACTION_getModifierKeyRemapping = 28;
        static final int TRANSACTION_registerInputDevicesChangedListener = 29;
        static final int TRANSACTION_isInTabletMode = 30;
        static final int TRANSACTION_registerTabletModeChangedListener = 31;
        static final int TRANSACTION_isMicMuted = 32;
        static final int TRANSACTION_vibrate = 33;
        static final int TRANSACTION_vibrateCombined = 34;
        static final int TRANSACTION_cancelVibrate = 35;
        static final int TRANSACTION_getVibratorIds = 36;
        static final int TRANSACTION_isVibrating = 37;
        static final int TRANSACTION_registerVibratorStateListener = 38;
        static final int TRANSACTION_unregisterVibratorStateListener = 39;
        static final int TRANSACTION_getBatteryState = 40;
        static final int TRANSACTION_setPointerIconType = 41;
        static final int TRANSACTION_setCustomPointerIcon = 42;
        static final int TRANSACTION_requestPointerCapture = 43;
        static final int TRANSACTION_monitorGestureInput = 44;
        static final int TRANSACTION_addPortAssociation = 45;
        static final int TRANSACTION_removePortAssociation = 46;
        static final int TRANSACTION_addUniqueIdAssociation = 47;
        static final int TRANSACTION_removeUniqueIdAssociation = 48;
        static final int TRANSACTION_getSensorList = 49;
        static final int TRANSACTION_registerSensorListener = 50;
        static final int TRANSACTION_unregisterSensorListener = 51;
        static final int TRANSACTION_enableSensor = 52;
        static final int TRANSACTION_disableSensor = 53;
        static final int TRANSACTION_flushSensor = 54;
        static final int TRANSACTION_getLights = 55;
        static final int TRANSACTION_getLightState = 56;
        static final int TRANSACTION_setLightStates = 57;
        static final int TRANSACTION_openLightSession = 58;
        static final int TRANSACTION_closeLightSession = 59;
        static final int TRANSACTION_cancelCurrentTouch = 60;
        static final int TRANSACTION_registerBatteryListener = 61;
        static final int TRANSACTION_unregisterBatteryListener = 62;
        static final int TRANSACTION_getInputDeviceBluetoothAddress = 63;
        static final int TRANSACTION_pilferPointers = 64;
        static final int TRANSACTION_registerKeyboardBacklightListener = 65;
        static final int TRANSACTION_unregisterKeyboardBacklightListener = 66;
        static final int TRANSACTION_getHostUsiVersionFromDisplayConfig = 67;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.hardware.input.IInputManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setCurrentKeyboardLayoutForInputDevice_enforcePermission() throws java.lang.SecurityException {}
        protected void addKeyboardLayoutForInputDevice_enforcePermission() throws java.lang.SecurityException {}
        protected void removeKeyboardLayoutForInputDevice_enforcePermission() throws java.lang.SecurityException {}
        protected void setKeyboardLayoutForInputDevice_enforcePermission() throws java.lang.SecurityException {}
        protected void remapModifierKey_enforcePermission() throws java.lang.SecurityException {}
        protected void clearAllModifierKeyRemappings_enforcePermission() throws java.lang.SecurityException {}
        protected void getModifierKeyRemapping_enforcePermission() throws java.lang.SecurityException {}
        protected void getInputDeviceBluetoothAddress_enforcePermission() throws java.lang.SecurityException {}
        protected void pilferPointers_enforcePermission() throws java.lang.SecurityException {}
        protected void registerKeyboardBacklightListener_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterKeyboardBacklightListener_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.input.IInputManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getVelocityTrackerStrategy() throws android.os.RemoteException { return null; }
            public android.view.InputDevice getInputDevice(int p0) throws android.os.RemoteException { return null; }
            public int[] getInputDeviceIds() throws android.os.RemoteException { return null; }
            public boolean isInputDeviceEnabled(int p0) throws android.os.RemoteException { return false; }
            public void enableInputDevice(int p0) throws android.os.RemoteException {}
            public void disableInputDevice(int p0) throws android.os.RemoteException {}
            public boolean hasKeys(int p0, int p1, int[] p2, boolean[] p3) throws android.os.RemoteException { return false; }
            public int getKeyCodeForKeyLocation(int p0, int p1) throws android.os.RemoteException { return 0; }
            public void tryPointerSpeed(int p0) throws android.os.RemoteException {}
            public boolean injectInputEvent(android.view.InputEvent p0, int p1) throws android.os.RemoteException { return false; }
            public boolean injectInputEventToTarget(android.view.InputEvent p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public android.view.VerifiedInputEvent verifyInputEvent(android.view.InputEvent p0) throws android.os.RemoteException { return null; }
            public android.hardware.input.TouchCalibration getTouchCalibrationForInputDevice(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void setTouchCalibrationForInputDevice(java.lang.String p0, int p1, android.hardware.input.TouchCalibration p2) throws android.os.RemoteException {}
            public android.hardware.input.KeyboardLayout[] getKeyboardLayouts() throws android.os.RemoteException { return null; }
            public android.hardware.input.KeyboardLayout[] getKeyboardLayoutsForInputDevice(android.hardware.input.InputDeviceIdentifier p0) throws android.os.RemoteException { return null; }
            public android.hardware.input.KeyboardLayout getKeyboardLayout(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String getCurrentKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0) throws android.os.RemoteException { return null; }
            public void setCurrentKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) throws android.os.RemoteException {}
            public java.lang.String[] getEnabledKeyboardLayoutsForInputDevice(android.hardware.input.InputDeviceIdentifier p0) throws android.os.RemoteException { return null; }
            public void addKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) throws android.os.RemoteException {}
            public void removeKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) throws android.os.RemoteException {}
            public java.lang.String getKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3) throws android.os.RemoteException { return null; }
            public void setKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3, java.lang.String p4) throws android.os.RemoteException {}
            public android.hardware.input.KeyboardLayout[] getKeyboardLayoutListForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3) throws android.os.RemoteException { return null; }
            public void remapModifierKey(int p0, int p1) throws android.os.RemoteException {}
            public void clearAllModifierKeyRemappings() throws android.os.RemoteException {}
            public java.util.Map getModifierKeyRemapping() throws android.os.RemoteException { return null; }
            public void registerInputDevicesChangedListener(android.hardware.input.IInputDevicesChangedListener p0) throws android.os.RemoteException {}
            public int isInTabletMode() throws android.os.RemoteException { return 0; }
            public void registerTabletModeChangedListener(android.hardware.input.ITabletModeChangedListener p0) throws android.os.RemoteException {}
            public int isMicMuted() throws android.os.RemoteException { return 0; }
            public void vibrate(int p0, android.os.VibrationEffect p1, android.os.IBinder p2) throws android.os.RemoteException {}
            public void vibrateCombined(int p0, android.os.CombinedVibration p1, android.os.IBinder p2) throws android.os.RemoteException {}
            public void cancelVibrate(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public int[] getVibratorIds(int p0) throws android.os.RemoteException { return null; }
            public boolean isVibrating(int p0) throws android.os.RemoteException { return false; }
            public boolean registerVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
            public boolean unregisterVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
            public android.hardware.input.IInputDeviceBatteryState getBatteryState(int p0) throws android.os.RemoteException { return null; }
            public void setPointerIconType(int p0) throws android.os.RemoteException {}
            public void setCustomPointerIcon(android.view.PointerIcon p0) throws android.os.RemoteException {}
            public void requestPointerCapture(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public android.view.InputMonitor monitorGestureInput(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public void addPortAssociation(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void removePortAssociation(java.lang.String p0) throws android.os.RemoteException {}
            public void addUniqueIdAssociation(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void removeUniqueIdAssociation(java.lang.String p0) throws android.os.RemoteException {}
            public android.hardware.input.InputSensorInfo[] getSensorList(int p0) throws android.os.RemoteException { return null; }
            public boolean registerSensorListener(android.hardware.input.IInputSensorEventListener p0) throws android.os.RemoteException { return false; }
            public void unregisterSensorListener(android.hardware.input.IInputSensorEventListener p0) throws android.os.RemoteException {}
            public boolean enableSensor(int p0, int p1, int p2, int p3) throws android.os.RemoteException { return false; }
            public void disableSensor(int p0, int p1) throws android.os.RemoteException {}
            public boolean flushSensor(int p0, int p1) throws android.os.RemoteException { return false; }
            public java.util.List<android.hardware.lights.Light> getLights(int p0) throws android.os.RemoteException { return null; }
            public android.hardware.lights.LightState getLightState(int p0, int p1) throws android.os.RemoteException { return null; }
            public void setLightStates(int p0, int[] p1, android.hardware.lights.LightState[] p2, android.os.IBinder p3) throws android.os.RemoteException {}
            public void openLightSession(int p0, java.lang.String p1, android.os.IBinder p2) throws android.os.RemoteException {}
            public void closeLightSession(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void cancelCurrentTouch() throws android.os.RemoteException {}
            public void registerBatteryListener(int p0, android.hardware.input.IInputDeviceBatteryListener p1) throws android.os.RemoteException {}
            public void unregisterBatteryListener(int p0, android.hardware.input.IInputDeviceBatteryListener p1) throws android.os.RemoteException {}
            public java.lang.String getInputDeviceBluetoothAddress(int p0) throws android.os.RemoteException { return null; }
            public void pilferPointers(android.os.IBinder p0) throws android.os.RemoteException {}
            public void registerKeyboardBacklightListener(android.hardware.input.IKeyboardBacklightListener p0) throws android.os.RemoteException {}
            public void unregisterKeyboardBacklightListener(android.hardware.input.IKeyboardBacklightListener p0) throws android.os.RemoteException {}
            public android.hardware.input.HostUsiVersion getHostUsiVersionFromDisplayConfig(int p0) throws android.os.RemoteException { return null; }
        }
    }
}
