package android.os;

public interface IVibratorManagerService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IVibratorManagerService";
    public int[] getVibratorIds() throws android.os.RemoteException;
    public int getCapabilities() throws android.os.RemoteException;
    public android.os.VibratorInfo getVibratorInfo(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_VIBRATOR_STATE")
    public boolean isVibrating(int p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_VIBRATOR_STATE")
    public boolean registerVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.ACCESS_VIBRATOR_STATE")
    public boolean unregisterVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException;
    public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4) throws android.os.RemoteException;
    public void vibrate(int p0, int p1, java.lang.String p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4, java.lang.String p5, android.os.IBinder p6) throws android.os.RemoteException;
    public void cancelVibrate(int p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void performHapticFeedback(int p0, int p1, java.lang.String p2, int p3, int p4, java.lang.String p5, int p6, int p7) throws android.os.RemoteException;
    public void performHapticFeedbackForInputDevice(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, java.lang.String p6, int p7, int p8) throws android.os.RemoteException;
    @android.annotation.EnforcePermission(allOf={"android.permission.VIBRATE", "android.permission.VIBRATE_VENDOR_EFFECTS", "android.permission.START_VIBRATION_SESSIONS"})
    public android.os.ICancellationSignal startVendorVibrationSession(int p0, int p1, java.lang.String p2, int[] p3, android.os.VibrationAttributes p4, java.lang.String p5, android.os.vibrator.IVibrationSessionCallback p6) throws android.os.RemoteException;

    public static class Default implements android.os.IVibratorManagerService {
        public Default() {}
        public int[] getVibratorIds() throws android.os.RemoteException { return null; }
        public int getCapabilities() throws android.os.RemoteException { return 0; }
        public android.os.VibratorInfo getVibratorInfo(int p0) throws android.os.RemoteException { return null; }
        public boolean isVibrating(int p0) throws android.os.RemoteException { return false; }
        public boolean registerVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
        public boolean unregisterVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
        public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4) throws android.os.RemoteException { return false; }
        public void vibrate(int p0, int p1, java.lang.String p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4, java.lang.String p5, android.os.IBinder p6) throws android.os.RemoteException {}
        public void cancelVibrate(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void performHapticFeedback(int p0, int p1, java.lang.String p2, int p3, int p4, java.lang.String p5, int p6, int p7) throws android.os.RemoteException {}
        public void performHapticFeedbackForInputDevice(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, java.lang.String p6, int p7, int p8) throws android.os.RemoteException {}
        public android.os.ICancellationSignal startVendorVibrationSession(int p0, int p1, java.lang.String p2, int[] p3, android.os.VibrationAttributes p4, java.lang.String p5, android.os.vibrator.IVibrationSessionCallback p6) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IVibratorManagerService {
        static final int TRANSACTION_getVibratorIds = 1;
        static final int TRANSACTION_getCapabilities = 2;
        static final int TRANSACTION_getVibratorInfo = 3;
        static final int TRANSACTION_isVibrating = 4;
        static final int TRANSACTION_registerVibratorStateListener = 5;
        static final int TRANSACTION_unregisterVibratorStateListener = 6;
        static final int TRANSACTION_setAlwaysOnEffect = 7;
        static final int TRANSACTION_vibrate = 8;
        static final int TRANSACTION_cancelVibrate = 9;
        static final int TRANSACTION_performHapticFeedback = 10;
        static final int TRANSACTION_performHapticFeedbackForInputDevice = 11;
        static final int TRANSACTION_startVendorVibrationSession = 12;
        static final java.lang.String[] PERMISSIONS_startVendorVibrationSession = null;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.os.IVibratorManagerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void isVibrating_enforcePermission() throws java.lang.SecurityException {}
        protected void registerVibratorStateListener_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterVibratorStateListener_enforcePermission() throws java.lang.SecurityException {}
        protected void startVendorVibrationSession_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IVibratorManagerService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int[] getVibratorIds() throws android.os.RemoteException { return null; }
            public int getCapabilities() throws android.os.RemoteException { return 0; }
            public android.os.VibratorInfo getVibratorInfo(int p0) throws android.os.RemoteException { return null; }
            public boolean isVibrating(int p0) throws android.os.RemoteException { return false; }
            public boolean registerVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
            public boolean unregisterVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
            public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4) throws android.os.RemoteException { return false; }
            public void vibrate(int p0, int p1, java.lang.String p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4, java.lang.String p5, android.os.IBinder p6) throws android.os.RemoteException {}
            public void cancelVibrate(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void performHapticFeedback(int p0, int p1, java.lang.String p2, int p3, int p4, java.lang.String p5, int p6, int p7) throws android.os.RemoteException {}
            public void performHapticFeedbackForInputDevice(int p0, int p1, java.lang.String p2, int p3, int p4, int p5, java.lang.String p6, int p7, int p8) throws android.os.RemoteException {}
            public android.os.ICancellationSignal startVendorVibrationSession(int p0, int p1, java.lang.String p2, int[] p3, android.os.VibrationAttributes p4, java.lang.String p5, android.os.vibrator.IVibrationSessionCallback p6) throws android.os.RemoteException { return null; }
        }
    }
}
