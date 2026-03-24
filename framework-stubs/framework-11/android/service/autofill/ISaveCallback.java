package android.service.autofill;

public interface ISaveCallback extends android.os.IInterface {
    public void onSuccess(android.content.IntentSender p0) throws android.os.RemoteException;
    public void onFailure(java.lang.CharSequence p0) throws android.os.RemoteException;

    public static class Default implements android.service.autofill.ISaveCallback {
        public Default() {}
        public void onSuccess(android.content.IntentSender p0) throws android.os.RemoteException {}
        public void onFailure(java.lang.CharSequence p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.autofill.ISaveCallback {
        private static final java.lang.String DESCRIPTOR = "android.service.autofill.ISaveCallback";
        static final int TRANSACTION_onSuccess = 1;
        static final int TRANSACTION_onFailure = 2;
        public Stub() { super(); }
        public static android.service.autofill.ISaveCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.autofill.ISaveCallback p0) { return false; }
        public static android.service.autofill.ISaveCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.service.autofill.ISaveCallback {
            private android.os.IBinder mRemote;
            public static android.service.autofill.ISaveCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSuccess(android.content.IntentSender p0) throws android.os.RemoteException {}
            public void onFailure(java.lang.CharSequence p0) throws android.os.RemoteException {}
        }
    }
}
