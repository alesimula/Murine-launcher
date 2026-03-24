package android.os;

public interface IVoldMountCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IVoldMountCallback";
    public boolean onVolumeChecking(java.io.FileDescriptor p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;

    public static class Default implements android.os.IVoldMountCallback {
        public Default() {}
        public boolean onVolumeChecking(java.io.FileDescriptor p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IVoldMountCallback {
        static final int TRANSACTION_onVolumeChecking = 1;
        public Stub() { super(); }
        public static android.os.IVoldMountCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IVoldMountCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean onVolumeChecking(java.io.FileDescriptor p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        }
    }
}
