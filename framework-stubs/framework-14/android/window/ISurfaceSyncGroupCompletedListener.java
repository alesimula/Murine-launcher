package android.window;

public interface ISurfaceSyncGroupCompletedListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.ISurfaceSyncGroupCompletedListener";
    public void onSurfaceSyncGroupComplete() throws android.os.RemoteException;

    public static class Default implements android.window.ISurfaceSyncGroupCompletedListener {
        public Default() {}
        public void onSurfaceSyncGroupComplete() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.ISurfaceSyncGroupCompletedListener {
        static final int TRANSACTION_onSurfaceSyncGroupComplete = 1;
        public Stub() { super(); }
        public static android.window.ISurfaceSyncGroupCompletedListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.window.ISurfaceSyncGroupCompletedListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSurfaceSyncGroupComplete() throws android.os.RemoteException {}
        }
    }
}
