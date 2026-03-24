package android.app;

public interface ITransientNotificationCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.ITransientNotificationCallback";
    public void onToastShown() throws android.os.RemoteException;
    public void onToastHidden() throws android.os.RemoteException;

    public static class Default implements android.app.ITransientNotificationCallback {
        public Default() {}
        public void onToastShown() throws android.os.RemoteException {}
        public void onToastHidden() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.ITransientNotificationCallback {
        static final int TRANSACTION_onToastShown = 1;
        static final int TRANSACTION_onToastHidden = 2;
        public Stub() { super(); }
        public static android.app.ITransientNotificationCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.ITransientNotificationCallback p0) { return false; }
        public static android.app.ITransientNotificationCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.app.ITransientNotificationCallback {
            private android.os.IBinder mRemote;
            public static android.app.ITransientNotificationCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onToastShown() throws android.os.RemoteException {}
            public void onToastHidden() throws android.os.RemoteException {}
        }
    }
}
