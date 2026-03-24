package android.hardware.input;

public interface IInputManager extends android.os.IInterface {
    public java.lang.String getVelocityTrackerStrategy() throws android.os.RemoteException;
    public android.view.InputDevice getInputDevice(int p0) throws android.os.RemoteException;
    public int[] getInputDeviceIds() throws android.os.RemoteException;
    public void enableInputDevice(int p0) throws android.os.RemoteException;
    public void disableInputDevice(int p0) throws android.os.RemoteException;
    public boolean hasKeys(int p0, int p1, int[] p2, boolean[] p3) throws android.os.RemoteException;
    public int getKeyCodeForKeyLocation(int p0, int p1) throws android.os.RemoteException;
    public android.view.KeyCharacterMap getKeyCharacterMap(java.lang.String p0) throws android.os.RemoteException;
    public int getMousePointerSpeed() throws android.os.RemoteException;
    public void tryPointerSpeed(int p0) throws android.os.RemoteException;
    public boolean injectInputEvent(android.view.InputEvent p0, int p1) throws android.os.RemoteException;
    public boolean injectInputEventToTarget(android.view.InputEvent p0, int p1, int p2) throws android.os.RemoteException;
    public android.view.VerifiedInputEvent verifyInputEvent(android.view.InputEvent p0) throws android.os.RemoteException;
    public android.hardware.input.TouchCalibration getTouchCalibrationForInputDevice(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setTouchCalibrationForInputDevice(java.lang.String p0, int p1, android.hardware.input.TouchCalibration p2) throws android.os.RemoteException;
    public android.hardware.input.KeyboardLayout[] getKeyboardLayouts() throws android.os.RemoteException;
    public android.hardware.input.KeyboardLayout getKeyboardLayout(java.lang.String p0) throws android.os.RemoteException;
    public android.hardware.input.KeyboardLayoutSelectionResult getKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.SET_KEYBOARD_LAYOUT")
    @android.annotation.EnforcePermission("android.permission.SET_KEYBOARD_LAYOUT")
    public void setKeyboardLayoutOverrideForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) throws android.os.RemoteException;
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
    public boolean setPointerIcon(android.view.PointerIcon p0, int p1, int p2, int p3, android.os.IBinder p4) throws android.os.RemoteException;
    public void requestPointerCapture(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public android.view.InputMonitor monitorGestureInput(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void addPortAssociation(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void removePortAssociation(java.lang.String p0) throws android.os.RemoteException;
    public void addUniqueIdAssociationByDescriptor(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void removeUniqueIdAssociationByDescriptor(java.lang.String p0) throws android.os.RemoteException;
    public void addUniqueIdAssociationByPort(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public void removeUniqueIdAssociationByPort(java.lang.String p0) throws android.os.RemoteException;
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
    @android.annotation.RequiresPermission("android.permission.LISTEN_FOR_KEY_ACTIVITY")
    @android.annotation.EnforcePermission("android.permission.LISTEN_FOR_KEY_ACTIVITY")
    public boolean registerKeyEventActivityListener(android.hardware.input.IKeyEventActivityListener p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.LISTEN_FOR_KEY_ACTIVITY")
    @android.annotation.EnforcePermission("android.permission.LISTEN_FOR_KEY_ACTIVITY")
    public boolean unregisterKeyEventActivityListener(android.hardware.input.IKeyEventActivityListener p0) throws android.os.RemoteException;
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
    @android.annotation.RequiresPermission("android.permission.MONITOR_STICKY_MODIFIER_STATE")
    @android.annotation.EnforcePermission("android.permission.MONITOR_STICKY_MODIFIER_STATE")
    public void registerStickyModifierStateListener(android.hardware.input.IStickyModifierStateListener p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MONITOR_STICKY_MODIFIER_STATE")
    @android.annotation.EnforcePermission("android.permission.MONITOR_STICKY_MODIFIER_STATE")
    public void unregisterStickyModifierStateListener(android.hardware.input.IStickyModifierStateListener p0) throws android.os.RemoteException;
    public android.hardware.input.KeyGlyphMap getKeyGlyphMap(int p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_KEY_GESTURES")
    @android.annotation.EnforcePermission("android.permission.MANAGE_KEY_GESTURES")
    public void registerKeyGestureEventListener(android.hardware.input.IKeyGestureEventListener p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_KEY_GESTURES")
    @android.annotation.EnforcePermission("android.permission.MANAGE_KEY_GESTURES")
    public void unregisterKeyGestureEventListener(android.hardware.input.IKeyGestureEventListener p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_KEY_GESTURES")
    @android.annotation.EnforcePermission("android.permission.MANAGE_KEY_GESTURES")
    public void registerKeyGestureHandler(int[] p0, android.hardware.input.IKeyGestureHandler p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_KEY_GESTURES")
    @android.annotation.EnforcePermission("android.permission.MANAGE_KEY_GESTURES")
    public void unregisterKeyGestureHandler(android.hardware.input.IKeyGestureHandler p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_KEY_GESTURES")
    @android.annotation.EnforcePermission("android.permission.MANAGE_KEY_GESTURES")
    public android.hardware.input.AidlInputGestureData getInputGesture(int p0, android.hardware.input.AidlInputGestureData.Trigger p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_KEY_GESTURES")
    @android.annotation.EnforcePermission("android.permission.MANAGE_KEY_GESTURES")
    public int addCustomInputGesture(int p0, android.hardware.input.AidlInputGestureData p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_KEY_GESTURES")
    @android.annotation.EnforcePermission("android.permission.MANAGE_KEY_GESTURES")
    public int removeCustomInputGesture(int p0, android.hardware.input.AidlInputGestureData p1) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.MANAGE_KEY_GESTURES")
    @android.annotation.EnforcePermission("android.permission.MANAGE_KEY_GESTURES")
    public void removeAllCustomInputGestures(int p0, int p1) throws android.os.RemoteException;
    public android.hardware.input.AidlInputGestureData[] getCustomInputGestures(int p0, int p1) throws android.os.RemoteException;
    public android.hardware.input.AidlInputGestureData[] getAppLaunchBookmarks() throws android.os.RemoteException;
    public void resetLockedModifierState() throws android.os.RemoteException;
    public void setMouseScalingEnabled(boolean p0, int p1) throws android.os.RemoteException;
    public android.graphics.PointF getCursorPosition(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.input.IInputManager {
        public Default() {}
        public java.lang.String getVelocityTrackerStrategy() throws android.os.RemoteException { return null; }
        public android.view.InputDevice getInputDevice(int p0) throws android.os.RemoteException { return null; }
        public int[] getInputDeviceIds() throws android.os.RemoteException { return null; }
        public void enableInputDevice(int p0) throws android.os.RemoteException {}
        public void disableInputDevice(int p0) throws android.os.RemoteException {}
        public boolean hasKeys(int p0, int p1, int[] p2, boolean[] p3) throws android.os.RemoteException { return false; }
        public int getKeyCodeForKeyLocation(int p0, int p1) throws android.os.RemoteException { return 0; }
        public android.view.KeyCharacterMap getKeyCharacterMap(java.lang.String p0) throws android.os.RemoteException { return null; }
        public int getMousePointerSpeed() throws android.os.RemoteException { return 0; }
        public void tryPointerSpeed(int p0) throws android.os.RemoteException {}
        public boolean injectInputEvent(android.view.InputEvent p0, int p1) throws android.os.RemoteException { return false; }
        public boolean injectInputEventToTarget(android.view.InputEvent p0, int p1, int p2) throws android.os.RemoteException { return false; }
        public android.view.VerifiedInputEvent verifyInputEvent(android.view.InputEvent p0) throws android.os.RemoteException { return null; }
        public android.hardware.input.TouchCalibration getTouchCalibrationForInputDevice(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void setTouchCalibrationForInputDevice(java.lang.String p0, int p1, android.hardware.input.TouchCalibration p2) throws android.os.RemoteException {}
        public android.hardware.input.KeyboardLayout[] getKeyboardLayouts() throws android.os.RemoteException { return null; }
        public android.hardware.input.KeyboardLayout getKeyboardLayout(java.lang.String p0) throws android.os.RemoteException { return null; }
        public android.hardware.input.KeyboardLayoutSelectionResult getKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3) throws android.os.RemoteException { return null; }
        public void setKeyboardLayoutOverrideForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) throws android.os.RemoteException {}
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
        public boolean setPointerIcon(android.view.PointerIcon p0, int p1, int p2, int p3, android.os.IBinder p4) throws android.os.RemoteException { return false; }
        public void requestPointerCapture(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public android.view.InputMonitor monitorGestureInput(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
        public void addPortAssociation(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void removePortAssociation(java.lang.String p0) throws android.os.RemoteException {}
        public void addUniqueIdAssociationByDescriptor(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void removeUniqueIdAssociationByDescriptor(java.lang.String p0) throws android.os.RemoteException {}
        public void addUniqueIdAssociationByPort(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public void removeUniqueIdAssociationByPort(java.lang.String p0) throws android.os.RemoteException {}
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
        public boolean registerKeyEventActivityListener(android.hardware.input.IKeyEventActivityListener p0) throws android.os.RemoteException { return false; }
        public boolean unregisterKeyEventActivityListener(android.hardware.input.IKeyEventActivityListener p0) throws android.os.RemoteException { return false; }
        public java.lang.String getInputDeviceBluetoothAddress(int p0) throws android.os.RemoteException { return null; }
        public void pilferPointers(android.os.IBinder p0) throws android.os.RemoteException {}
        public void registerKeyboardBacklightListener(android.hardware.input.IKeyboardBacklightListener p0) throws android.os.RemoteException {}
        public void unregisterKeyboardBacklightListener(android.hardware.input.IKeyboardBacklightListener p0) throws android.os.RemoteException {}
        public android.hardware.input.HostUsiVersion getHostUsiVersionFromDisplayConfig(int p0) throws android.os.RemoteException { return null; }
        public void registerStickyModifierStateListener(android.hardware.input.IStickyModifierStateListener p0) throws android.os.RemoteException {}
        public void unregisterStickyModifierStateListener(android.hardware.input.IStickyModifierStateListener p0) throws android.os.RemoteException {}
        public android.hardware.input.KeyGlyphMap getKeyGlyphMap(int p0) throws android.os.RemoteException { return null; }
        public void registerKeyGestureEventListener(android.hardware.input.IKeyGestureEventListener p0) throws android.os.RemoteException {}
        public void unregisterKeyGestureEventListener(android.hardware.input.IKeyGestureEventListener p0) throws android.os.RemoteException {}
        public void registerKeyGestureHandler(int[] p0, android.hardware.input.IKeyGestureHandler p1) throws android.os.RemoteException {}
        public void unregisterKeyGestureHandler(android.hardware.input.IKeyGestureHandler p0) throws android.os.RemoteException {}
        public android.hardware.input.AidlInputGestureData getInputGesture(int p0, android.hardware.input.AidlInputGestureData.Trigger p1) throws android.os.RemoteException { return null; }
        public int addCustomInputGesture(int p0, android.hardware.input.AidlInputGestureData p1) throws android.os.RemoteException { return 0; }
        public int removeCustomInputGesture(int p0, android.hardware.input.AidlInputGestureData p1) throws android.os.RemoteException { return 0; }
        public void removeAllCustomInputGestures(int p0, int p1) throws android.os.RemoteException {}
        public android.hardware.input.AidlInputGestureData[] getCustomInputGestures(int p0, int p1) throws android.os.RemoteException { return null; }
        public android.hardware.input.AidlInputGestureData[] getAppLaunchBookmarks() throws android.os.RemoteException { return null; }
        public void resetLockedModifierState() throws android.os.RemoteException {}
        public void setMouseScalingEnabled(boolean p0, int p1) throws android.os.RemoteException {}
        public android.graphics.PointF getCursorPosition(int p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.input.IInputManager {
        public static final java.lang.String DESCRIPTOR = "android.hardware.input.IInputManager";
        static final int TRANSACTION_getVelocityTrackerStrategy = 1;
        static final int TRANSACTION_getInputDevice = 2;
        static final int TRANSACTION_getInputDeviceIds = 3;
        static final int TRANSACTION_enableInputDevice = 4;
        static final int TRANSACTION_disableInputDevice = 5;
        static final int TRANSACTION_hasKeys = 6;
        static final int TRANSACTION_getKeyCodeForKeyLocation = 7;
        static final int TRANSACTION_getKeyCharacterMap = 8;
        static final int TRANSACTION_getMousePointerSpeed = 9;
        static final int TRANSACTION_tryPointerSpeed = 10;
        static final int TRANSACTION_injectInputEvent = 11;
        static final int TRANSACTION_injectInputEventToTarget = 12;
        static final int TRANSACTION_verifyInputEvent = 13;
        static final int TRANSACTION_getTouchCalibrationForInputDevice = 14;
        static final int TRANSACTION_setTouchCalibrationForInputDevice = 15;
        static final int TRANSACTION_getKeyboardLayouts = 16;
        static final int TRANSACTION_getKeyboardLayout = 17;
        static final int TRANSACTION_getKeyboardLayoutForInputDevice = 18;
        static final int TRANSACTION_setKeyboardLayoutOverrideForInputDevice = 19;
        static final int TRANSACTION_setKeyboardLayoutForInputDevice = 20;
        static final int TRANSACTION_getKeyboardLayoutListForInputDevice = 21;
        static final int TRANSACTION_remapModifierKey = 22;
        static final int TRANSACTION_clearAllModifierKeyRemappings = 23;
        static final int TRANSACTION_getModifierKeyRemapping = 24;
        static final int TRANSACTION_registerInputDevicesChangedListener = 25;
        static final int TRANSACTION_isInTabletMode = 26;
        static final int TRANSACTION_registerTabletModeChangedListener = 27;
        static final int TRANSACTION_isMicMuted = 28;
        static final int TRANSACTION_vibrate = 29;
        static final int TRANSACTION_vibrateCombined = 30;
        static final int TRANSACTION_cancelVibrate = 31;
        static final int TRANSACTION_getVibratorIds = 32;
        static final int TRANSACTION_isVibrating = 33;
        static final int TRANSACTION_registerVibratorStateListener = 34;
        static final int TRANSACTION_unregisterVibratorStateListener = 35;
        static final int TRANSACTION_getBatteryState = 36;
        static final int TRANSACTION_setPointerIcon = 37;
        static final int TRANSACTION_requestPointerCapture = 38;
        static final int TRANSACTION_monitorGestureInput = 39;
        static final int TRANSACTION_addPortAssociation = 40;
        static final int TRANSACTION_removePortAssociation = 41;
        static final int TRANSACTION_addUniqueIdAssociationByDescriptor = 42;
        static final int TRANSACTION_removeUniqueIdAssociationByDescriptor = 43;
        static final int TRANSACTION_addUniqueIdAssociationByPort = 44;
        static final int TRANSACTION_removeUniqueIdAssociationByPort = 45;
        static final int TRANSACTION_getSensorList = 46;
        static final int TRANSACTION_registerSensorListener = 47;
        static final int TRANSACTION_unregisterSensorListener = 48;
        static final int TRANSACTION_enableSensor = 49;
        static final int TRANSACTION_disableSensor = 50;
        static final int TRANSACTION_flushSensor = 51;
        static final int TRANSACTION_getLights = 52;
        static final int TRANSACTION_getLightState = 53;
        static final int TRANSACTION_setLightStates = 54;
        static final int TRANSACTION_openLightSession = 55;
        static final int TRANSACTION_closeLightSession = 56;
        static final int TRANSACTION_cancelCurrentTouch = 57;
        static final int TRANSACTION_registerBatteryListener = 58;
        static final int TRANSACTION_unregisterBatteryListener = 59;
        static final int TRANSACTION_registerKeyEventActivityListener = 60;
        static final int TRANSACTION_unregisterKeyEventActivityListener = 61;
        static final int TRANSACTION_getInputDeviceBluetoothAddress = 62;
        static final int TRANSACTION_pilferPointers = 63;
        static final int TRANSACTION_registerKeyboardBacklightListener = 64;
        static final int TRANSACTION_unregisterKeyboardBacklightListener = 65;
        static final int TRANSACTION_getHostUsiVersionFromDisplayConfig = 66;
        static final int TRANSACTION_registerStickyModifierStateListener = 67;
        static final int TRANSACTION_unregisterStickyModifierStateListener = 68;
        static final int TRANSACTION_getKeyGlyphMap = 69;
        static final int TRANSACTION_registerKeyGestureEventListener = 70;
        static final int TRANSACTION_unregisterKeyGestureEventListener = 71;
        static final int TRANSACTION_registerKeyGestureHandler = 72;
        static final int TRANSACTION_unregisterKeyGestureHandler = 73;
        static final int TRANSACTION_getInputGesture = 74;
        static final int TRANSACTION_addCustomInputGesture = 75;
        static final int TRANSACTION_removeCustomInputGesture = 76;
        static final int TRANSACTION_removeAllCustomInputGestures = 77;
        static final int TRANSACTION_getCustomInputGestures = 78;
        static final int TRANSACTION_getAppLaunchBookmarks = 79;
        static final int TRANSACTION_resetLockedModifierState = 80;
        static final int TRANSACTION_setMouseScalingEnabled = 81;
        static final int TRANSACTION_getCursorPosition = 82;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.hardware.input.IInputManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void setKeyboardLayoutOverrideForInputDevice_enforcePermission() throws java.lang.SecurityException {}
        protected void setKeyboardLayoutForInputDevice_enforcePermission() throws java.lang.SecurityException {}
        protected void remapModifierKey_enforcePermission() throws java.lang.SecurityException {}
        protected void clearAllModifierKeyRemappings_enforcePermission() throws java.lang.SecurityException {}
        protected void getModifierKeyRemapping_enforcePermission() throws java.lang.SecurityException {}
        protected void registerKeyEventActivityListener_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterKeyEventActivityListener_enforcePermission() throws java.lang.SecurityException {}
        protected void getInputDeviceBluetoothAddress_enforcePermission() throws java.lang.SecurityException {}
        protected void pilferPointers_enforcePermission() throws java.lang.SecurityException {}
        protected void registerKeyboardBacklightListener_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterKeyboardBacklightListener_enforcePermission() throws java.lang.SecurityException {}
        protected void registerStickyModifierStateListener_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterStickyModifierStateListener_enforcePermission() throws java.lang.SecurityException {}
        protected void registerKeyGestureEventListener_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterKeyGestureEventListener_enforcePermission() throws java.lang.SecurityException {}
        protected void registerKeyGestureHandler_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterKeyGestureHandler_enforcePermission() throws java.lang.SecurityException {}
        protected void getInputGesture_enforcePermission() throws java.lang.SecurityException {}
        protected void addCustomInputGesture_enforcePermission() throws java.lang.SecurityException {}
        protected void removeCustomInputGesture_enforcePermission() throws java.lang.SecurityException {}
        protected void removeAllCustomInputGestures_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.input.IInputManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String getVelocityTrackerStrategy() throws android.os.RemoteException { return null; }
            public android.view.InputDevice getInputDevice(int p0) throws android.os.RemoteException { return null; }
            public int[] getInputDeviceIds() throws android.os.RemoteException { return null; }
            public void enableInputDevice(int p0) throws android.os.RemoteException {}
            public void disableInputDevice(int p0) throws android.os.RemoteException {}
            public boolean hasKeys(int p0, int p1, int[] p2, boolean[] p3) throws android.os.RemoteException { return false; }
            public int getKeyCodeForKeyLocation(int p0, int p1) throws android.os.RemoteException { return 0; }
            public android.view.KeyCharacterMap getKeyCharacterMap(java.lang.String p0) throws android.os.RemoteException { return null; }
            public int getMousePointerSpeed() throws android.os.RemoteException { return 0; }
            public void tryPointerSpeed(int p0) throws android.os.RemoteException {}
            public boolean injectInputEvent(android.view.InputEvent p0, int p1) throws android.os.RemoteException { return false; }
            public boolean injectInputEventToTarget(android.view.InputEvent p0, int p1, int p2) throws android.os.RemoteException { return false; }
            public android.view.VerifiedInputEvent verifyInputEvent(android.view.InputEvent p0) throws android.os.RemoteException { return null; }
            public android.hardware.input.TouchCalibration getTouchCalibrationForInputDevice(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void setTouchCalibrationForInputDevice(java.lang.String p0, int p1, android.hardware.input.TouchCalibration p2) throws android.os.RemoteException {}
            public android.hardware.input.KeyboardLayout[] getKeyboardLayouts() throws android.os.RemoteException { return null; }
            public android.hardware.input.KeyboardLayout getKeyboardLayout(java.lang.String p0) throws android.os.RemoteException { return null; }
            public android.hardware.input.KeyboardLayoutSelectionResult getKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, int p1, android.view.inputmethod.InputMethodInfo p2, android.view.inputmethod.InputMethodSubtype p3) throws android.os.RemoteException { return null; }
            public void setKeyboardLayoutOverrideForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) throws android.os.RemoteException {}
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
            public boolean setPointerIcon(android.view.PointerIcon p0, int p1, int p2, int p3, android.os.IBinder p4) throws android.os.RemoteException { return false; }
            public void requestPointerCapture(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public android.view.InputMonitor monitorGestureInput(android.os.IBinder p0, java.lang.String p1, int p2) throws android.os.RemoteException { return null; }
            public void addPortAssociation(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void removePortAssociation(java.lang.String p0) throws android.os.RemoteException {}
            public void addUniqueIdAssociationByDescriptor(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void removeUniqueIdAssociationByDescriptor(java.lang.String p0) throws android.os.RemoteException {}
            public void addUniqueIdAssociationByPort(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
            public void removeUniqueIdAssociationByPort(java.lang.String p0) throws android.os.RemoteException {}
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
            public boolean registerKeyEventActivityListener(android.hardware.input.IKeyEventActivityListener p0) throws android.os.RemoteException { return false; }
            public boolean unregisterKeyEventActivityListener(android.hardware.input.IKeyEventActivityListener p0) throws android.os.RemoteException { return false; }
            public java.lang.String getInputDeviceBluetoothAddress(int p0) throws android.os.RemoteException { return null; }
            public void pilferPointers(android.os.IBinder p0) throws android.os.RemoteException {}
            public void registerKeyboardBacklightListener(android.hardware.input.IKeyboardBacklightListener p0) throws android.os.RemoteException {}
            public void unregisterKeyboardBacklightListener(android.hardware.input.IKeyboardBacklightListener p0) throws android.os.RemoteException {}
            public android.hardware.input.HostUsiVersion getHostUsiVersionFromDisplayConfig(int p0) throws android.os.RemoteException { return null; }
            public void registerStickyModifierStateListener(android.hardware.input.IStickyModifierStateListener p0) throws android.os.RemoteException {}
            public void unregisterStickyModifierStateListener(android.hardware.input.IStickyModifierStateListener p0) throws android.os.RemoteException {}
            public android.hardware.input.KeyGlyphMap getKeyGlyphMap(int p0) throws android.os.RemoteException { return null; }
            public void registerKeyGestureEventListener(android.hardware.input.IKeyGestureEventListener p0) throws android.os.RemoteException {}
            public void unregisterKeyGestureEventListener(android.hardware.input.IKeyGestureEventListener p0) throws android.os.RemoteException {}
            public void registerKeyGestureHandler(int[] p0, android.hardware.input.IKeyGestureHandler p1) throws android.os.RemoteException {}
            public void unregisterKeyGestureHandler(android.hardware.input.IKeyGestureHandler p0) throws android.os.RemoteException {}
            public android.hardware.input.AidlInputGestureData getInputGesture(int p0, android.hardware.input.AidlInputGestureData.Trigger p1) throws android.os.RemoteException { return null; }
            public int addCustomInputGesture(int p0, android.hardware.input.AidlInputGestureData p1) throws android.os.RemoteException { return 0; }
            public int removeCustomInputGesture(int p0, android.hardware.input.AidlInputGestureData p1) throws android.os.RemoteException { return 0; }
            public void removeAllCustomInputGestures(int p0, int p1) throws android.os.RemoteException {}
            public android.hardware.input.AidlInputGestureData[] getCustomInputGestures(int p0, int p1) throws android.os.RemoteException { return null; }
            public android.hardware.input.AidlInputGestureData[] getAppLaunchBookmarks() throws android.os.RemoteException { return null; }
            public void resetLockedModifierState() throws android.os.RemoteException {}
            public void setMouseScalingEnabled(boolean p0, int p1) throws android.os.RemoteException {}
            public android.graphics.PointF getCursorPosition(int p0) throws android.os.RemoteException { return null; }
        }
    }
}
