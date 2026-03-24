package android.app;

public interface IOnProjectionStateChangedListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.IOnProjectionStateChangedListener";
    public void onProjectionStateChanged(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException;

    public static class Default implements android.app.IOnProjectionStateChangedListener {
        public Default() {}
        public void onProjectionStateChanged(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IOnProjectionStateChangedListener {
        static final int TRANSACTION_onProjectionStateChanged = 1;
        public Stub() { super(); }
        public static android.app.IOnProjectionStateChangedListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IOnProjectionStateChangedListener p0) { return false; }
        public static android.app.IOnProjectionStateChangedListener getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IOnProjectionStateChangedListener {
            private android.os.IBinder mRemote;
            public static android.app.IOnProjectionStateChangedListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onProjectionStateChanged(int p0, java.util.List<java.lang.String> p1) throws android.os.RemoteException {}
        }
    }
}
