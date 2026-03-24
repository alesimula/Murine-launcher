package android.os.vibrator;

public interface IVibrationSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.vibrator.IVibrationSession";
    public static final int STATUS_UNKNOWN = 0;
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_IGNORED = 2;
    public static final int STATUS_UNSUPPORTED = 3;
    public static final int STATUS_CANCELED = 4;
    public static final int STATUS_UNKNOWN_ERROR = 5;
    public void vibrate(android.os.CombinedVibration p0, java.lang.String p1) throws android.os.RemoteException;
    public void finishSession() throws android.os.RemoteException;
    public void cancelSession() throws android.os.RemoteException;

    public static class Default implements android.os.vibrator.IVibrationSession {
        public Default() {}
        public void vibrate(android.os.CombinedVibration p0, java.lang.String p1) throws android.os.RemoteException {}
        public void finishSession() throws android.os.RemoteException {}
        public void cancelSession() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.vibrator.IVibrationSession {
        static final int TRANSACTION_vibrate = 1;
        static final int TRANSACTION_finishSession = 2;
        static final int TRANSACTION_cancelSession = 3;
        public Stub() { super(); }
        public static android.os.vibrator.IVibrationSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.vibrator.IVibrationSession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void vibrate(android.os.CombinedVibration p0, java.lang.String p1) throws android.os.RemoteException {}
            public void finishSession() throws android.os.RemoteException {}
            public void cancelSession() throws android.os.RemoteException {}
        }
    }
}
