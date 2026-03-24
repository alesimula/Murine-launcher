package android.os;

public interface IUpdateLock extends android.os.IInterface {
    public void acquireUpdateLock(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException;
    public void releaseUpdateLock(android.os.IBinder p0) throws android.os.RemoteException;

    public static class Default implements android.os.IUpdateLock {
        public Default() {}
        public void acquireUpdateLock(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
        public void releaseUpdateLock(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IUpdateLock {
        public static final java.lang.String DESCRIPTOR = "android.os.IUpdateLock";
        static final int TRANSACTION_acquireUpdateLock = 1;
        static final int TRANSACTION_releaseUpdateLock = 2;
        public Stub() { super(); }
        public static android.os.IUpdateLock asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IUpdateLock {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void acquireUpdateLock(android.os.IBinder p0, java.lang.String p1) throws android.os.RemoteException {}
            public void releaseUpdateLock(android.os.IBinder p0) throws android.os.RemoteException {}
        }
    }
}
