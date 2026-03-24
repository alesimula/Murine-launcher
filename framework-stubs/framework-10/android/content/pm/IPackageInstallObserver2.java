package android.content.pm;

public interface IPackageInstallObserver2 extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public void onUserActionRequired(android.content.Intent p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void onPackageInstalled(java.lang.String p0, int p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageInstallObserver2 {
        private static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageInstallObserver2";
        static final int TRANSACTION_onUserActionRequired = 1;
        static final int TRANSACTION_onPackageInstalled = 2;
        public Stub() { super(); }
        public static android.content.pm.IPackageInstallObserver2 asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.IPackageInstallObserver2 p0) { return false; }
        public static android.content.pm.IPackageInstallObserver2 getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.IPackageInstallObserver2 {
            private android.os.IBinder mRemote;
            public static android.content.pm.IPackageInstallObserver2 sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onUserActionRequired(android.content.Intent p0) throws android.os.RemoteException {}
            public void onPackageInstalled(java.lang.String p0, int p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.content.pm.IPackageInstallObserver2 {
        public Default() {}
        public void onUserActionRequired(android.content.Intent p0) throws android.os.RemoteException {}
        public void onPackageInstalled(java.lang.String p0, int p1, java.lang.String p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
