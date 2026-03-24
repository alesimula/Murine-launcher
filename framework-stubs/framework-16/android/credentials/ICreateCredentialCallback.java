package android.credentials;

public interface ICreateCredentialCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.credentials.ICreateCredentialCallback";
    public void onPendingIntent(android.app.PendingIntent p0) throws android.os.RemoteException;
    public void onResponse(android.credentials.CreateCredentialResponse p0) throws android.os.RemoteException;
    public void onError(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements android.credentials.ICreateCredentialCallback {
        public Default() {}
        public void onPendingIntent(android.app.PendingIntent p0) throws android.os.RemoteException {}
        public void onResponse(android.credentials.CreateCredentialResponse p0) throws android.os.RemoteException {}
        public void onError(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.credentials.ICreateCredentialCallback {
        static final int TRANSACTION_onPendingIntent = 1;
        static final int TRANSACTION_onResponse = 2;
        static final int TRANSACTION_onError = 3;
        public Stub() { super(); }
        public static android.credentials.ICreateCredentialCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.credentials.ICreateCredentialCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onPendingIntent(android.app.PendingIntent p0) throws android.os.RemoteException {}
            public void onResponse(android.credentials.CreateCredentialResponse p0) throws android.os.RemoteException {}
            public void onError(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }
}
