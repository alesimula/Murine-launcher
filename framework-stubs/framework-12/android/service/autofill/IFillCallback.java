package android.service.autofill;

public interface IFillCallback extends android.os.IInterface {
    public void onCancellable(android.os.ICancellationSignal p0) throws android.os.RemoteException;
    public void onSuccess(android.service.autofill.FillResponse p0) throws android.os.RemoteException;
    public void onFailure(int p0, java.lang.CharSequence p1) throws android.os.RemoteException;

    public static class Default implements android.service.autofill.IFillCallback {
        public Default() {}
        public void onCancellable(android.os.ICancellationSignal p0) throws android.os.RemoteException {}
        public void onSuccess(android.service.autofill.FillResponse p0) throws android.os.RemoteException {}
        public void onFailure(int p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.autofill.IFillCallback {
        public static final java.lang.String DESCRIPTOR = "android.service.autofill.IFillCallback";
        static final int TRANSACTION_onCancellable = 1;
        static final int TRANSACTION_onSuccess = 2;
        static final int TRANSACTION_onFailure = 3;
        public Stub() { super(); }
        public static android.service.autofill.IFillCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.autofill.IFillCallback p0) { return false; }
        public static android.service.autofill.IFillCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.service.autofill.IFillCallback {
            private android.os.IBinder mRemote;
            public static android.service.autofill.IFillCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCancellable(android.os.ICancellationSignal p0) throws android.os.RemoteException {}
            public void onSuccess(android.service.autofill.FillResponse p0) throws android.os.RemoteException {}
            public void onFailure(int p0, java.lang.CharSequence p1) throws android.os.RemoteException {}
        }
    }
}
