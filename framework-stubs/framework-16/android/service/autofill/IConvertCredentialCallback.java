package android.service.autofill;

public interface IConvertCredentialCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.autofill.IConvertCredentialCallback";
    public void onSuccess(android.service.autofill.ConvertCredentialResponse p0) throws android.os.RemoteException;
    public void onFailure(java.lang.CharSequence p0) throws android.os.RemoteException;

    public static class Default implements android.service.autofill.IConvertCredentialCallback {
        public Default() {}
        public void onSuccess(android.service.autofill.ConvertCredentialResponse p0) throws android.os.RemoteException {}
        public void onFailure(java.lang.CharSequence p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.autofill.IConvertCredentialCallback {
        static final int TRANSACTION_onSuccess = 1;
        static final int TRANSACTION_onFailure = 2;
        public Stub() { super(); }
        public static android.service.autofill.IConvertCredentialCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.autofill.IConvertCredentialCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSuccess(android.service.autofill.ConvertCredentialResponse p0) throws android.os.RemoteException {}
            public void onFailure(java.lang.CharSequence p0) throws android.os.RemoteException {}
        }
    }
}
