package android.app;

public interface ISearchManagerCallback extends android.os.IInterface {
    public void onDismiss() throws android.os.RemoteException;
    public void onCancel() throws android.os.RemoteException;

    public static class Default implements android.app.ISearchManagerCallback {
        public Default() {}
        public void onDismiss() throws android.os.RemoteException {}
        public void onCancel() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.ISearchManagerCallback {
        public static final java.lang.String DESCRIPTOR = "android.app.ISearchManagerCallback";
        static final int TRANSACTION_onDismiss = 1;
        static final int TRANSACTION_onCancel = 2;
        public Stub() { super(); }
        public static android.app.ISearchManagerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.ISearchManagerCallback p0) { return false; }
        public static android.app.ISearchManagerCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.app.ISearchManagerCallback {
            private android.os.IBinder mRemote;
            public static android.app.ISearchManagerCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDismiss() throws android.os.RemoteException {}
            public void onCancel() throws android.os.RemoteException {}
        }
    }
}
