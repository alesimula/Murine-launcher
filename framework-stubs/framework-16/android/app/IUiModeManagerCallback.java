package android.app;

public interface IUiModeManagerCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.IUiModeManagerCallback";
    public void notifyContrastChanged(float p0) throws android.os.RemoteException;
    public void notifyForceInvertStateChanged(int p0) throws android.os.RemoteException;

    public static class Default implements android.app.IUiModeManagerCallback {
        public Default() {}
        public void notifyContrastChanged(float p0) throws android.os.RemoteException {}
        public void notifyForceInvertStateChanged(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IUiModeManagerCallback {
        static final int TRANSACTION_notifyContrastChanged = 1;
        static final int TRANSACTION_notifyForceInvertStateChanged = 2;
        public Stub() { super(); }
        public static android.app.IUiModeManagerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.IUiModeManagerCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void notifyContrastChanged(float p0) throws android.os.RemoteException {}
            public void notifyForceInvertStateChanged(int p0) throws android.os.RemoteException {}
        }
    }
}
