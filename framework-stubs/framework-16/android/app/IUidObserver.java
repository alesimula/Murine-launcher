package android.app;

public interface IUidObserver extends android.os.IInterface {
    public void onUidGone(int p0, boolean p1) throws android.os.RemoteException;
    public void onUidActive(int p0) throws android.os.RemoteException;
    public void onUidIdle(int p0, boolean p1) throws android.os.RemoteException;
    public void onUidStateChanged(int p0, int p1, long p2, int p3) throws android.os.RemoteException;
    public void onUidProcAdjChanged(int p0, int p1) throws android.os.RemoteException;
    public void onUidCachedChanged(int p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.app.IUidObserver {
        public Default() {}
        public void onUidGone(int p0, boolean p1) throws android.os.RemoteException {}
        public void onUidActive(int p0) throws android.os.RemoteException {}
        public void onUidIdle(int p0, boolean p1) throws android.os.RemoteException {}
        public void onUidStateChanged(int p0, int p1, long p2, int p3) throws android.os.RemoteException {}
        public void onUidProcAdjChanged(int p0, int p1) throws android.os.RemoteException {}
        public void onUidCachedChanged(int p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IUidObserver {
        public static final java.lang.String DESCRIPTOR = "android.app.IUidObserver";
        static final int TRANSACTION_onUidGone = 1;
        static final int TRANSACTION_onUidActive = 2;
        static final int TRANSACTION_onUidIdle = 3;
        static final int TRANSACTION_onUidStateChanged = 4;
        static final int TRANSACTION_onUidProcAdjChanged = 5;
        static final int TRANSACTION_onUidCachedChanged = 6;
        public Stub() { super(); }
        public static android.app.IUidObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.IUidObserver {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onUidGone(int p0, boolean p1) throws android.os.RemoteException {}
            public void onUidActive(int p0) throws android.os.RemoteException {}
            public void onUidIdle(int p0, boolean p1) throws android.os.RemoteException {}
            public void onUidStateChanged(int p0, int p1, long p2, int p3) throws android.os.RemoteException {}
            public void onUidProcAdjChanged(int p0, int p1) throws android.os.RemoteException {}
            public void onUidCachedChanged(int p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
