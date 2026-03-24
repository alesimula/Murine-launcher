package android.security;

public interface IGenerateRkpKeyService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.IGenerateRkpKeyService";
    public void notifyKeyGenerated(int p0) throws android.os.RemoteException;
    public void generateKey(int p0) throws android.os.RemoteException;

    public static class Default implements android.security.IGenerateRkpKeyService {
        public Default() {}
        public void notifyKeyGenerated(int p0) throws android.os.RemoteException {}
        public void generateKey(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.IGenerateRkpKeyService {
        static final int TRANSACTION_notifyKeyGenerated = 1;
        static final int TRANSACTION_generateKey = 2;
        public Stub() { super(); }
        public static android.security.IGenerateRkpKeyService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.security.IGenerateRkpKeyService p0) { return false; }
        public static android.security.IGenerateRkpKeyService getDefaultImpl() { return null; }

        private static class Proxy implements android.security.IGenerateRkpKeyService {
            private android.os.IBinder mRemote;
            public static android.security.IGenerateRkpKeyService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void notifyKeyGenerated(int p0) throws android.os.RemoteException {}
            public void generateKey(int p0) throws android.os.RemoteException {}
        }
    }
}
