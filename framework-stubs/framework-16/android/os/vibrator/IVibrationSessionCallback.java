package android.os.vibrator;

public interface IVibrationSessionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.vibrator.IVibrationSessionCallback";
    public void onStarted(android.os.vibrator.IVibrationSession p0) throws android.os.RemoteException;
    public void onFinishing() throws android.os.RemoteException;
    public void onFinished(int p0) throws android.os.RemoteException;

    public static class Default implements android.os.vibrator.IVibrationSessionCallback {
        public Default() {}
        public void onStarted(android.os.vibrator.IVibrationSession p0) throws android.os.RemoteException {}
        public void onFinishing() throws android.os.RemoteException {}
        public void onFinished(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.vibrator.IVibrationSessionCallback {
        static final int TRANSACTION_onStarted = 1;
        static final int TRANSACTION_onFinishing = 2;
        static final int TRANSACTION_onFinished = 3;
        public Stub() { super(); }
        public static android.os.vibrator.IVibrationSessionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.vibrator.IVibrationSessionCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStarted(android.os.vibrator.IVibrationSession p0) throws android.os.RemoteException {}
            public void onFinishing() throws android.os.RemoteException {}
            public void onFinished(int p0) throws android.os.RemoteException {}
        }
    }
}
