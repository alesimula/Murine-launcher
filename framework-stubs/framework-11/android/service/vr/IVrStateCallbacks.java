package android.service.vr;

public interface IVrStateCallbacks extends android.os.IInterface {
    public void onVrStateChanged(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.service.vr.IVrStateCallbacks {
        public Default() {}
        public void onVrStateChanged(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.vr.IVrStateCallbacks {
        private static final java.lang.String DESCRIPTOR = "android.service.vr.IVrStateCallbacks";
        static final int TRANSACTION_onVrStateChanged = 1;
        public Stub() { super(); }
        public static android.service.vr.IVrStateCallbacks asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.vr.IVrStateCallbacks p0) { return false; }
        public static android.service.vr.IVrStateCallbacks getDefaultImpl() { return null; }

        private static class Proxy implements android.service.vr.IVrStateCallbacks {
            private android.os.IBinder mRemote;
            public static android.service.vr.IVrStateCallbacks sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onVrStateChanged(boolean p0) throws android.os.RemoteException {}
        }
    }
}
