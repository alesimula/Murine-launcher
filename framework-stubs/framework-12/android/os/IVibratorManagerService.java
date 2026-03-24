package android.os;

public interface IVibratorManagerService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IVibratorManagerService";
    public int[] getVibratorIds() throws android.os.RemoteException;
    public android.os.VibratorInfo getVibratorInfo(int p0) throws android.os.RemoteException;
    public boolean isVibrating(int p0) throws android.os.RemoteException;
    public boolean registerVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException;
    public boolean unregisterVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException;
    public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4) throws android.os.RemoteException;
    public void vibrate(int p0, java.lang.String p1, android.os.CombinedVibration p2, android.os.VibrationAttributes p3, java.lang.String p4, android.os.IBinder p5) throws android.os.RemoteException;
    public void cancelVibrate(int p0, android.os.IBinder p1) throws android.os.RemoteException;

    public static class Default implements android.os.IVibratorManagerService {
        public Default() {}
        public int[] getVibratorIds() throws android.os.RemoteException { return null; }
        public android.os.VibratorInfo getVibratorInfo(int p0) throws android.os.RemoteException { return null; }
        public boolean isVibrating(int p0) throws android.os.RemoteException { return false; }
        public boolean registerVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
        public boolean unregisterVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
        public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4) throws android.os.RemoteException { return false; }
        public void vibrate(int p0, java.lang.String p1, android.os.CombinedVibration p2, android.os.VibrationAttributes p3, java.lang.String p4, android.os.IBinder p5) throws android.os.RemoteException {}
        public void cancelVibrate(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IVibratorManagerService {
        static final int TRANSACTION_getVibratorIds = 1;
        static final int TRANSACTION_getVibratorInfo = 2;
        static final int TRANSACTION_isVibrating = 3;
        static final int TRANSACTION_registerVibratorStateListener = 4;
        static final int TRANSACTION_unregisterVibratorStateListener = 5;
        static final int TRANSACTION_setAlwaysOnEffect = 6;
        static final int TRANSACTION_vibrate = 7;
        static final int TRANSACTION_cancelVibrate = 8;
        public Stub() { super(); }
        public static android.os.IVibratorManagerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IVibratorManagerService p0) { return false; }
        public static android.os.IVibratorManagerService getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IVibratorManagerService {
            private android.os.IBinder mRemote;
            public static android.os.IVibratorManagerService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int[] getVibratorIds() throws android.os.RemoteException { return null; }
            public android.os.VibratorInfo getVibratorInfo(int p0) throws android.os.RemoteException { return null; }
            public boolean isVibrating(int p0) throws android.os.RemoteException { return false; }
            public boolean registerVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
            public boolean unregisterVibratorStateListener(int p0, android.os.IVibratorStateListener p1) throws android.os.RemoteException { return false; }
            public boolean setAlwaysOnEffect(int p0, java.lang.String p1, int p2, android.os.CombinedVibration p3, android.os.VibrationAttributes p4) throws android.os.RemoteException { return false; }
            public void vibrate(int p0, java.lang.String p1, android.os.CombinedVibration p2, android.os.VibrationAttributes p3, java.lang.String p4, android.os.IBinder p5) throws android.os.RemoteException {}
            public void cancelVibrate(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
        }
    }
}
