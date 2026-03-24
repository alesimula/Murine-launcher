package android.security.rkp;

public interface IGetKeyCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.rkp.IGetKeyCallback";
    public void onSuccess(android.security.rkp.RemotelyProvisionedKey p0) throws android.os.RemoteException;
    public void onCancel() throws android.os.RemoteException;
    public void onError(byte p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.security.rkp.IGetKeyCallback {
        public Default() {}
        public void onSuccess(android.security.rkp.RemotelyProvisionedKey p0) throws android.os.RemoteException {}
        public void onCancel() throws android.os.RemoteException {}
        public void onError(byte p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static @interface ErrorCode {
        public static final byte ERROR_UNKNOWN = 1;
        public static final byte ERROR_REQUIRES_SECURITY_PATCH = 2;
        public static final byte ERROR_PENDING_INTERNET_CONNECTIVITY = 3;
        public static final byte ERROR_PERMANENT = 5;
    }

    public static abstract class Stub extends android.os.Binder implements android.security.rkp.IGetKeyCallback {
        static final int TRANSACTION_onSuccess = 1;
        static final int TRANSACTION_onCancel = 2;
        static final int TRANSACTION_onError = 3;
        public Stub() { super(); }
        public static android.security.rkp.IGetKeyCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.security.rkp.IGetKeyCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSuccess(android.security.rkp.RemotelyProvisionedKey p0) throws android.os.RemoteException {}
            public void onCancel() throws android.os.RemoteException {}
            public void onError(byte p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }
}
