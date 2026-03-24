package android.view;

public interface IDisplayFoldListener extends android.os.IInterface {
    public void onDisplayFoldChanged(int p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.view.IDisplayFoldListener {
        public Default() {}
        public void onDisplayFoldChanged(int p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IDisplayFoldListener {
        private static final java.lang.String DESCRIPTOR = "android.view.IDisplayFoldListener";
        static final int TRANSACTION_onDisplayFoldChanged = 1;
        public Stub() { super(); }
        public static android.view.IDisplayFoldListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IDisplayFoldListener p0) { return false; }
        public static android.view.IDisplayFoldListener getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IDisplayFoldListener {
            private android.os.IBinder mRemote;
            public static android.view.IDisplayFoldListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDisplayFoldChanged(int p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}
