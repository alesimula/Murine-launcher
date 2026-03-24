package android.service.vr;

public interface IPersistentVrStateCallbacks extends android.os.IInterface {
    public void onPersistentVrStateChanged(boolean p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.service.vr.IPersistentVrStateCallbacks {
        private static final java.lang.String DESCRIPTOR = "android.service.vr.IPersistentVrStateCallbacks";
        static final int TRANSACTION_onPersistentVrStateChanged = 1;
        public Stub() { super(); }
        public static android.service.vr.IPersistentVrStateCallbacks asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.vr.IPersistentVrStateCallbacks p0) { return false; }
        public static android.service.vr.IPersistentVrStateCallbacks getDefaultImpl() { return null; }

        private static class Proxy implements android.service.vr.IPersistentVrStateCallbacks {
            private android.os.IBinder mRemote;
            public static android.service.vr.IPersistentVrStateCallbacks sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onPersistentVrStateChanged(boolean p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.service.vr.IPersistentVrStateCallbacks {
        public Default() {}
        public void onPersistentVrStateChanged(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
