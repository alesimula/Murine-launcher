package android.companion.virtual;

public interface IVirtualDeviceActivityListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.virtual.IVirtualDeviceActivityListener";
    public void onTopActivityChanged(int p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException;
    public void onDisplayEmpty(int p0) throws android.os.RemoteException;

    public static class Default implements android.companion.virtual.IVirtualDeviceActivityListener {
        public Default() {}
        public void onTopActivityChanged(int p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException {}
        public void onDisplayEmpty(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.virtual.IVirtualDeviceActivityListener {
        static final int TRANSACTION_onTopActivityChanged = 1;
        static final int TRANSACTION_onDisplayEmpty = 2;
        public Stub() { super(); }
        public static android.companion.virtual.IVirtualDeviceActivityListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.companion.virtual.IVirtualDeviceActivityListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onTopActivityChanged(int p0, android.content.ComponentName p1, int p2) throws android.os.RemoteException {}
            public void onDisplayEmpty(int p0) throws android.os.RemoteException {}
        }
    }
}
