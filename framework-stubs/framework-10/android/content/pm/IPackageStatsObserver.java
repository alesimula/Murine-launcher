package android.content.pm;

public interface IPackageStatsObserver extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public void onGetStatsCompleted(android.content.pm.PackageStats p0, boolean p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageStatsObserver {
        private static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageStatsObserver";
        static final int TRANSACTION_onGetStatsCompleted = 1;
        public Stub() { super(); }
        public static android.content.pm.IPackageStatsObserver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.IPackageStatsObserver p0) { return false; }
        public static android.content.pm.IPackageStatsObserver getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.IPackageStatsObserver {
            private android.os.IBinder mRemote;
            public static android.content.pm.IPackageStatsObserver sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onGetStatsCompleted(android.content.pm.PackageStats p0, boolean p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.content.pm.IPackageStatsObserver {
        public Default() {}
        public void onGetStatsCompleted(android.content.pm.PackageStats p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
