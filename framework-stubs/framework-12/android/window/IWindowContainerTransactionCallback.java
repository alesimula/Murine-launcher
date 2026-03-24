package android.window;

public interface IWindowContainerTransactionCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.IWindowContainerTransactionCallback";
    public void onTransactionReady(int p0, android.view.SurfaceControl.Transaction p1) throws android.os.RemoteException;

    public static class Default implements android.window.IWindowContainerTransactionCallback {
        public Default() {}
        public void onTransactionReady(int p0, android.view.SurfaceControl.Transaction p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.IWindowContainerTransactionCallback {
        static final int TRANSACTION_onTransactionReady = 1;
        public Stub() { super(); }
        public static android.window.IWindowContainerTransactionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.window.IWindowContainerTransactionCallback p0) { return false; }
        public static android.window.IWindowContainerTransactionCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.window.IWindowContainerTransactionCallback {
            private android.os.IBinder mRemote;
            public static android.window.IWindowContainerTransactionCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onTransactionReady(int p0, android.view.SurfaceControl.Transaction p1) throws android.os.RemoteException {}
        }
    }
}
