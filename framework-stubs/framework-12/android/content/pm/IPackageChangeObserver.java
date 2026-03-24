package android.content.pm;

public interface IPackageChangeObserver extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageChangeObserver";
    public void onPackageChanged(android.content.pm.PackageChangeEvent p0) throws android.os.RemoteException;

    public static class Default implements android.content.pm.IPackageChangeObserver {
        public Default() {}
        public void onPackageChanged(android.content.pm.PackageChangeEvent p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageChangeObserver {
        static final int TRANSACTION_onPackageChanged = 1;
        public Stub() { super(); }
        public static android.content.pm.IPackageChangeObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.IPackageChangeObserver p0) { return false; }
        public static android.content.pm.IPackageChangeObserver getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.IPackageChangeObserver {
            private android.os.IBinder mRemote;
            public static android.content.pm.IPackageChangeObserver sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onPackageChanged(android.content.pm.PackageChangeEvent p0) throws android.os.RemoteException {}
        }
    }
}
