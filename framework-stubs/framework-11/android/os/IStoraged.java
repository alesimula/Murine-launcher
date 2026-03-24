package android.os;

public interface IStoraged extends android.os.IInterface {
    public void onUserStarted(int p0) throws android.os.RemoteException;
    public void onUserStopped(int p0) throws android.os.RemoteException;
    public int getRecentPerf() throws android.os.RemoteException;

    public static class Default implements android.os.IStoraged {
        public Default() {}
        public void onUserStarted(int p0) throws android.os.RemoteException {}
        public void onUserStopped(int p0) throws android.os.RemoteException {}
        public int getRecentPerf() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IStoraged {
        private static final java.lang.String DESCRIPTOR = "android.os.IStoraged";
        static final int TRANSACTION_onUserStarted = 1;
        static final int TRANSACTION_onUserStopped = 2;
        static final int TRANSACTION_getRecentPerf = 3;
        public Stub() { super(); }
        public static android.os.IStoraged asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IStoraged p0) { return false; }
        public static android.os.IStoraged getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IStoraged {
            private android.os.IBinder mRemote;
            public static android.os.IStoraged sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onUserStarted(int p0) throws android.os.RemoteException {}
            public void onUserStopped(int p0) throws android.os.RemoteException {}
            public int getRecentPerf() throws android.os.RemoteException { return 0; }
        }
    }
}
