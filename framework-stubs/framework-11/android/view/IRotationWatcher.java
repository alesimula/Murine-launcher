package android.view;

public interface IRotationWatcher extends android.os.IInterface {
    public void onRotationChanged(int p0) throws android.os.RemoteException;

    public static class Default implements android.view.IRotationWatcher {
        public Default() {}
        public void onRotationChanged(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IRotationWatcher {
        private static final java.lang.String DESCRIPTOR = "android.view.IRotationWatcher";
        static final int TRANSACTION_onRotationChanged = 1;
        public Stub() { super(); }
        public static android.view.IRotationWatcher asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IRotationWatcher p0) { return false; }
        public static android.view.IRotationWatcher getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IRotationWatcher {
            private android.os.IBinder mRemote;
            public static android.view.IRotationWatcher sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onRotationChanged(int p0) throws android.os.RemoteException {}
        }
    }
}
