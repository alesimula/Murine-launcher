package android.content.pm.dependencyinstaller;

public interface IDependencyInstallerCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.content.pm.dependencyinstaller.IDependencyInstallerCallback";
    public void onAllDependenciesResolved(int[] p0) throws android.os.RemoteException;
    public void onFailureToResolveAllDependencies() throws android.os.RemoteException;

    public static class Default implements android.content.pm.dependencyinstaller.IDependencyInstallerCallback {
        public Default() {}
        public void onAllDependenciesResolved(int[] p0) throws android.os.RemoteException {}
        public void onFailureToResolveAllDependencies() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.dependencyinstaller.IDependencyInstallerCallback {
        static final int TRANSACTION_onAllDependenciesResolved = 1;
        static final int TRANSACTION_onFailureToResolveAllDependencies = 2;
        public Stub() { super(); }
        public static android.content.pm.dependencyinstaller.IDependencyInstallerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.content.pm.dependencyinstaller.IDependencyInstallerCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAllDependenciesResolved(int[] p0) throws android.os.RemoteException {}
            public void onFailureToResolveAllDependencies() throws android.os.RemoteException {}
        }
    }
}
