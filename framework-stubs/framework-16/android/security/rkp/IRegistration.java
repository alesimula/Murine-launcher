package android.security.rkp;

public interface IRegistration extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.rkp.IRegistration";
    public void getKey(int p0, android.security.rkp.IGetKeyCallback p1) throws android.os.RemoteException;
    public void cancelGetKey(android.security.rkp.IGetKeyCallback p0) throws android.os.RemoteException;
    public void storeUpgradedKeyAsync(byte[] p0, byte[] p1, android.security.rkp.IStoreUpgradedKeyCallback p2) throws android.os.RemoteException;

    public static class Default implements android.security.rkp.IRegistration {
        public Default() {}
        public void getKey(int p0, android.security.rkp.IGetKeyCallback p1) throws android.os.RemoteException {}
        public void cancelGetKey(android.security.rkp.IGetKeyCallback p0) throws android.os.RemoteException {}
        public void storeUpgradedKeyAsync(byte[] p0, byte[] p1, android.security.rkp.IStoreUpgradedKeyCallback p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.rkp.IRegistration {
        static final int TRANSACTION_getKey = 1;
        static final int TRANSACTION_cancelGetKey = 2;
        static final int TRANSACTION_storeUpgradedKeyAsync = 3;
        public Stub() { super(); }
        public static android.security.rkp.IRegistration asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.security.rkp.IRegistration {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getKey(int p0, android.security.rkp.IGetKeyCallback p1) throws android.os.RemoteException {}
            public void cancelGetKey(android.security.rkp.IGetKeyCallback p0) throws android.os.RemoteException {}
            public void storeUpgradedKeyAsync(byte[] p0, byte[] p1, android.security.rkp.IStoreUpgradedKeyCallback p2) throws android.os.RemoteException {}
        }
    }
}
