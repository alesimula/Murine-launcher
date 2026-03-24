package android.content;

public interface ISyncStatusObserver extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public void onStatusChanged(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.content.ISyncStatusObserver {
        private static final java.lang.String DESCRIPTOR = "android.content.ISyncStatusObserver";
        static final int TRANSACTION_onStatusChanged = 1;
        public Stub() { super(); }
        public static android.content.ISyncStatusObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.ISyncStatusObserver p0) { return false; }
        public static android.content.ISyncStatusObserver getDefaultImpl() { return null; }

        private static class Proxy implements android.content.ISyncStatusObserver {
            private android.os.IBinder mRemote;
            public static android.content.ISyncStatusObserver sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStatusChanged(int p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.content.ISyncStatusObserver {
        public Default() {}
        public void onStatusChanged(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
