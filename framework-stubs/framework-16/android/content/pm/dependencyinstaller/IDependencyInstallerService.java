package android.content.pm.dependencyinstaller;

public interface IDependencyInstallerService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.content.pm.dependencyinstaller.IDependencyInstallerService";
    public void onDependenciesRequired(java.util.List<android.content.pm.SharedLibraryInfo> p0, android.content.pm.dependencyinstaller.DependencyInstallerCallback p1) throws android.os.RemoteException;

    public static class Default implements android.content.pm.dependencyinstaller.IDependencyInstallerService {
        public Default() {}
        public void onDependenciesRequired(java.util.List<android.content.pm.SharedLibraryInfo> p0, android.content.pm.dependencyinstaller.DependencyInstallerCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.dependencyinstaller.IDependencyInstallerService {
        static final int TRANSACTION_onDependenciesRequired = 1;
        public Stub() { super(); }
        public static android.content.pm.dependencyinstaller.IDependencyInstallerService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.content.pm.dependencyinstaller.IDependencyInstallerService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDependenciesRequired(java.util.List<android.content.pm.SharedLibraryInfo> p0, android.content.pm.dependencyinstaller.DependencyInstallerCallback p1) throws android.os.RemoteException {}
        }
    }
}
