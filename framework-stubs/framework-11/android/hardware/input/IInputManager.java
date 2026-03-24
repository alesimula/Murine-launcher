package android.hardware.input;

public interface IInputManager extends android.os.IInterface {
    public android.view.InputDevice getInputDevice(int p0) throws android.os.RemoteException;
    public int[] getInputDeviceIds() throws android.os.RemoteException;
    public boolean isInputDeviceEnabled(int p0) throws android.os.RemoteException;
    public void enableInputDevice(int p0) throws android.os.RemoteException;
    public void disableInputDevice(int p0) throws android.os.RemoteException;
    public boolean hasKeys(int p0, int p1, int[] p2, boolean[] p3) throws android.os.RemoteException;
    public void tryPointerSpeed(int p0) throws android.os.RemoteException;
    public boolean injectInputEvent(android.view.InputEvent p0, int p1) throws android.os.RemoteException;
    public android.view.VerifiedInputEvent verifyInputEvent(android.view.InputEvent p0) throws android.os.RemoteException;
    public android.hardware.input.TouchCalibration getTouchCalibrationForInputDevice(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void setTouchCalibrationForInputDevice(java.lang.String p0, int p1, android.hardware.input.TouchCalibration p2) throws android.os.RemoteException;
    public android.hardware.input.KeyboardLayout[] getKeyboardLayouts() throws android.os.RemoteException;
    public android.hardware.input.KeyboardLayout[] getKeyboardLayoutsForInputDevice(android.hardware.input.InputDeviceIdentifier p0) throws android.os.RemoteException;
    public android.hardware.input.KeyboardLayout getKeyboardLayout(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String getCurrentKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0) throws android.os.RemoteException;
    public void setCurrentKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) throws android.os.RemoteException;
    public java.lang.String[] getEnabledKeyboardLayoutsForInputDevice(android.hardware.input.InputDeviceIdentifier p0) throws android.os.RemoteException;
    public void addKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) throws android.os.RemoteException;
    public void removeKeyboardLayoutForInputDevice(android.hardware.input.InputDeviceIdentifier p0, java.lang.String p1) throws android.os.RemoteException;
    public void registerInputDevicesChangedListener(android.hardware.input.IInputDevicesChangedListener p0) throws android.os.RemoteException;
    public int isInTabletMode() throws android.os.RemoteException;
    public void registerTabletModeChangedListener(android.hardware.input.ITabletModeChangedListener p0) throws android.os.RemoteException;
    public int isMicMuted() throws android.os.RemoteException;
    public void vibrate(int p0, long[] p1, int p2, android.os.IBinder p3) throws android.os.RemoteException;
    public void cancelVibrate(int p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void setPointerIconType(int p0) throws android.os.RemoteException;
    public void setCustomPointerIcon(android.view.PointerIcon p0) throws android.os.RemoteException;
    public void requestPointerCapture(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public android.view.InputMonitor monitorGestureInput(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void addPortAssociation(java.lang.String p0, int p1) throws android.os.RemoteException;
    public void removePortAssociation(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.input.IInputManager {
        public Default() {}
        public android.view.InputDevice getInputDevice(int p0) throws android.os.RemoteException { return null; }
        public int[] getInputDeviceIds() throws android.os.RemoteException { return null; }
        public boolean isInputDeviceEnabled(int p0) throws android.os.RemoteException { return false; }
        public void enableInputDevice(int p0) throws android.os.RemoteException {}
        public void disableInputDevice(int p0) throws android.os.RemoteException {}
        public boolean hasKeys(int p0, int p1, int[] p2, boolean[] p3) throws android.os.RemoteException { return false; }
        public void tryPointerSpeed(int p0) throws android.os.RemoteException {}
        public boolean injectInputEvent(android.view.InputEvent p0, int p1) throws android.os.RemoteException { return false; }
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
        public void registerInputDevicesChangedListener(android.hardware.input.IInputDevicesChangedListener p0) throws android.os.RemoteException {}
        public int isInTabletMode() throws android.os.RemoteException { return 0; }
        public void registerTabletModeChangedListener(android.hardware.input.ITabletModeChangedListener p0) throws android.os.RemoteException {}
        public int isMicMuted() throws android.os.RemoteException { return 0; }
        public void vibrate(int p0, long[] p1, int p2, android.os.IBinder p3) throws android.os.RemoteException {}
        public void cancelVibrate(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void setPointerIconType(int p0) throws android.os.RemoteException {}
        public void setCustomPointerIcon(android.view.PointerIcon p0) throws android.os.RemoteException {}
        public void requestPointerCapture(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public android.view.InputMonitor monitorGestureInput(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public void addPortAssociation(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public void removePortAssociation(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.input.IInputManager {
        private static final java.lang.String DESCRIPTOR = "android.hardware.input.IInputManager";
        static final int TRANSACTION_getInputDevice = 1;
        static final int TRANSACTION_getInputDeviceIds = 2;
        static final int TRANSACTION_isInputDeviceEnabled = 3;
        static final int TRANSACTION_enableInputDevice = 4;
        static final int TRANSACTION_disableInputDevice = 5;
        static final int TRANSACTION_hasKeys = 6;
        static final int TRANSACTION_tryPointerSpeed = 7;
        static final int TRANSACTION_injectInputEvent = 8;
        static final int TRANSACTION_verifyInputEvent = 9;
        static final int TRANSACTION_getTouchCalibrationForInputDevice = 10;
        static final int TRANSACTION_setTouchCalibrationForInputDevice = 11;
        static final int TRANSACTION_getKeyboardLayouts = 12;
        static final int TRANSACTION_getKeyboardLayoutsForInputDevice = 13;
        static final int TRANSACTION_getKeyboardLayout = 14;
        static final int TRANSACTION_getCurrentKeyboardLayoutForInputDevice = 15;
        static final int TRANSACTION_setCurrentKeyboardLayoutForInputDevice = 16;
        static final int TRANSACTION_getEnabledKeyboardLayoutsForInputDevice = 17;
        static final int TRANSACTION_addKeyboardLayoutForInputDevice = 18;
        static final int TRANSACTION_removeKeyboardLayoutForInputDevice = 19;
        static final int TRANSACTION_registerInputDevicesChangedListener = 20;
        static final int TRANSACTION_isInTabletMode = 21;
        static final int TRANSACTION_registerTabletModeChangedListener = 22;
        static final int TRANSACTION_isMicMuted = 23;
        static final int TRANSACTION_vibrate = 24;
        static final int TRANSACTION_cancelVibrate = 25;
        static final int TRANSACTION_setPointerIconType = 26;
        static final int TRANSACTION_setCustomPointerIcon = 27;
        static final int TRANSACTION_requestPointerCapture = 28;
        static final int TRANSACTION_monitorGestureInput = 29;
        static final int TRANSACTION_addPortAssociation = 30;
        static final int TRANSACTION_removePortAssociation = 31;
        public Stub() { super(); }
        public static android.hardware.input.IInputManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.hardware.input.IInputManager p0) { return false; }
        public static android.hardware.input.IInputManager getDefaultImpl() { return null; }

        private static class Proxy implements android.hardware.input.IInputManager {
            private android.os.IBinder mRemote;
            public static android.hardware.input.IInputManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.view.InputDevice getInputDevice(int p0) throws android.os.RemoteException { return null; }
            public int[] getInputDeviceIds() throws android.os.RemoteException { return null; }
            public boolean isInputDeviceEnabled(int p0) throws android.os.RemoteException { return false; }
            public void enableInputDevice(int p0) throws android.os.RemoteException {}
            public void disableInputDevice(int p0) throws android.os.RemoteException {}
            public boolean hasKeys(int p0, int p1, int[] p2, boolean[] p3) throws android.os.RemoteException { return false; }
            public void tryPointerSpeed(int p0) throws android.os.RemoteException {}
            public boolean injectInputEvent(android.view.InputEvent p0, int p1) throws android.os.RemoteException { return false; }
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
            public void registerInputDevicesChangedListener(android.hardware.input.IInputDevicesChangedListener p0) throws android.os.RemoteException {}
            public int isInTabletMode() throws android.os.RemoteException { return 0; }
            public void registerTabletModeChangedListener(android.hardware.input.ITabletModeChangedListener p0) throws android.os.RemoteException {}
            public int isMicMuted() throws android.os.RemoteException { return 0; }
            public void vibrate(int p0, long[] p1, int p2, android.os.IBinder p3) throws android.os.RemoteException {}
            public void cancelVibrate(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void setPointerIconType(int p0) throws android.os.RemoteException {}
            public void setCustomPointerIcon(android.view.PointerIcon p0) throws android.os.RemoteException {}
            public void requestPointerCapture(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public android.view.InputMonitor monitorGestureInput(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public void addPortAssociation(java.lang.String p0, int p1) throws android.os.RemoteException {}
            public void removePortAssociation(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}
