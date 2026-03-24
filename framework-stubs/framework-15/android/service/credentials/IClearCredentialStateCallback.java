package android.service.credentials;

public interface IClearCredentialStateCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.credentials.IClearCredentialStateCallback";
    public void onSuccess() throws android.os.RemoteException;
    public void onFailure(java.lang.String p0, java.lang.CharSequence p1) throws android.os.RemoteException;
    public void onCancellable(android.os.ICancellationSignal p0) throws android.os.RemoteException;

    public static class Default implements android.service.credentials.IClearCredentialStateCallback {
        public Default() {}
        public void onSuccess() throws android.os.RemoteException {}
        public void onFailure(java.lang.String p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        public void onCancellable(android.os.ICancellationSignal p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.credentials.IClearCredentialStateCallback {
        static final int TRANSACTION_onSuccess = 1;
        static final int TRANSACTION_onFailure = 2;
        static final int TRANSACTION_onCancellable = 3;
        public Stub() { super(); }
        public static android.service.credentials.IClearCredentialStateCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.credentials.IClearCredentialStateCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSuccess() throws android.os.RemoteException {}
            public void onFailure(java.lang.String p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
            public void onCancellable(android.os.ICancellationSignal p0) throws android.os.RemoteException {}
        }
    }
}
