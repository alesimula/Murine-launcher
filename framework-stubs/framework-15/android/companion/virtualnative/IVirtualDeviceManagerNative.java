package android.companion.virtualnative;

public interface IVirtualDeviceManagerNative extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.companion.virtualnative.IVirtualDeviceManagerNative";
    public static final int DEVICE_POLICY_DEFAULT = 0;
    public static final int DEVICE_POLICY_CUSTOM = 1;
    public static final int POLICY_TYPE_SENSORS = 0;
    public static final int POLICY_TYPE_AUDIO = 1;
    public static final int POLICY_TYPE_RECENTS = 2;
    public static final int POLICY_TYPE_ACTIVITY = 3;
    public static final int POLICY_TYPE_CLIPBOARD = 4;
    public static final int POLICY_TYPE_CAMERA = 5;
    public int[] getDeviceIdsForUid(int p0) throws android.os.RemoteException;
    public int getDevicePolicy(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.companion.virtualnative.IVirtualDeviceManagerNative {
        public Default() {}
        public int[] getDeviceIdsForUid(int p0) throws android.os.RemoteException { return null; }
        public int getDevicePolicy(int p0, int p1) throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.companion.virtualnative.IVirtualDeviceManagerNative {
        static final int TRANSACTION_getDeviceIdsForUid = 1;
        static final int TRANSACTION_getDevicePolicy = 2;
        public Stub() { super(); }
        public static android.companion.virtualnative.IVirtualDeviceManagerNative asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.companion.virtualnative.IVirtualDeviceManagerNative {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int[] getDeviceIdsForUid(int p0) throws android.os.RemoteException { return null; }
            public int getDevicePolicy(int p0, int p1) throws android.os.RemoteException { return 0; }
        }
    }
}
