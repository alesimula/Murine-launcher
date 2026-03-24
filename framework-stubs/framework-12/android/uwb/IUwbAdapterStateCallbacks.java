package android.uwb;

public interface IUwbAdapterStateCallbacks extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.uwb.IUwbAdapterStateCallbacks";
    public void onAdapterStateChanged(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.uwb.IUwbAdapterStateCallbacks {
        public Default() {}
        public void onAdapterStateChanged(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.uwb.IUwbAdapterStateCallbacks {
        static final int TRANSACTION_onAdapterStateChanged = 1;
        public Stub() { super(); }
        public static android.uwb.IUwbAdapterStateCallbacks asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.uwb.IUwbAdapterStateCallbacks p0) { return false; }
        public static android.uwb.IUwbAdapterStateCallbacks getDefaultImpl() { return null; }

        private static class Proxy implements android.uwb.IUwbAdapterStateCallbacks {
            private android.os.IBinder mRemote;
            public static android.uwb.IUwbAdapterStateCallbacks sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAdapterStateChanged(int p0, int p1) throws android.os.RemoteException {}
        }
    }
}
