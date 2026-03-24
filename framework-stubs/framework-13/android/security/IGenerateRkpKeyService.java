package android.security;

public interface IGenerateRkpKeyService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.IGenerateRkpKeyService";
    public void notifyKeyGenerated(int p0) throws android.os.RemoteException;
    public int generateKey(int p0) throws android.os.RemoteException;

    public static class Default implements android.security.IGenerateRkpKeyService {
        public Default() {}
        public void notifyKeyGenerated(int p0) throws android.os.RemoteException {}
        public int generateKey(int p0) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static @interface Status {
        public static final int OK = 0;
        public static final int NO_NETWORK_CONNECTIVITY = 1;
        public static final int NETWORK_COMMUNICATION_ERROR = 2;
        public static final int DEVICE_NOT_REGISTERED = 4;
        public static final int HTTP_CLIENT_ERROR = 5;
        public static final int HTTP_SERVER_ERROR = 6;
        public static final int HTTP_UNKNOWN_ERROR = 7;
        public static final int INTERNAL_ERROR = 8;
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
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.security.IGenerateRkpKeyService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void notifyKeyGenerated(int p0) throws android.os.RemoteException {}
            public int generateKey(int p0) throws android.os.RemoteException { return 0; }
        }
    }
}
