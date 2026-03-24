package android.os;

public interface IVoldMountCallback extends android.os.IInterface {
    public boolean onVolumeChecking(java.io.FileDescriptor p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException;

    public static class Default implements android.os.IVoldMountCallback {
        public Default() {}
        public boolean onVolumeChecking(java.io.FileDescriptor p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IVoldMountCallback {
        private static final java.lang.String DESCRIPTOR = "android.os.IVoldMountCallback";
        static final int TRANSACTION_onVolumeChecking = 1;
        public Stub() { super(); }
        public static android.os.IVoldMountCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.IVoldMountCallback p0) { return false; }
        public static android.os.IVoldMountCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.os.IVoldMountCallback {
            private android.os.IBinder mRemote;
            public static android.os.IVoldMountCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean onVolumeChecking(java.io.FileDescriptor p0, java.lang.String p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        }
    }
}
