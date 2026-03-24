package android.content.pm;

public interface IPackageDeleteObserver extends android.os.IInterface {
    public void packageDeleted(java.lang.String p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.content.pm.IPackageDeleteObserver {
        public Default() {}
        public void packageDeleted(java.lang.String p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageDeleteObserver {
        public static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageDeleteObserver";
        static final int TRANSACTION_packageDeleted = 1;
        public Stub() { super(); }
        public static android.content.pm.IPackageDeleteObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.IPackageDeleteObserver p0) { return false; }
        public static android.content.pm.IPackageDeleteObserver getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.IPackageDeleteObserver {
            private android.os.IBinder mRemote;
            public static android.content.pm.IPackageDeleteObserver sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void packageDeleted(java.lang.String p0, int p1) throws android.os.RemoteException {}
        }
    }
}
