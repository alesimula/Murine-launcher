package android.media;

public interface INearbyMediaDevicesProvider extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.INearbyMediaDevicesProvider";
    public void registerNearbyDevicesCallback(android.media.INearbyMediaDevicesUpdateCallback p0) throws android.os.RemoteException;
    public void unregisterNearbyDevicesCallback(android.media.INearbyMediaDevicesUpdateCallback p0) throws android.os.RemoteException;

    public static class Default implements android.media.INearbyMediaDevicesProvider {
        public Default() {}
        public void registerNearbyDevicesCallback(android.media.INearbyMediaDevicesUpdateCallback p0) throws android.os.RemoteException {}
        public void unregisterNearbyDevicesCallback(android.media.INearbyMediaDevicesUpdateCallback p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.INearbyMediaDevicesProvider {
        static final int TRANSACTION_registerNearbyDevicesCallback = 3;
        static final int TRANSACTION_unregisterNearbyDevicesCallback = 4;
        public Stub() { super(); }
        public static android.media.INearbyMediaDevicesProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.INearbyMediaDevicesProvider {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerNearbyDevicesCallback(android.media.INearbyMediaDevicesUpdateCallback p0) throws android.os.RemoteException {}
            public void unregisterNearbyDevicesCallback(android.media.INearbyMediaDevicesUpdateCallback p0) throws android.os.RemoteException {}
        }
    }
}
