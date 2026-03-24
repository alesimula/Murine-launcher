package android.content.pm;

public interface IPackageInstaller extends android.os.IInterface {
    public int createSession(android.content.pm.PackageInstaller.SessionParams p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void updateSessionAppIcon(int p0, android.graphics.Bitmap p1) throws android.os.RemoteException;
    public void updateSessionAppLabel(int p0, java.lang.String p1) throws android.os.RemoteException;
    public void abandonSession(int p0) throws android.os.RemoteException;
    public android.content.pm.IPackageInstallerSession openSession(int p0) throws android.os.RemoteException;
    public android.content.pm.PackageInstaller.SessionInfo getSessionInfo(int p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getAllSessions(int p0) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getMySessions(java.lang.String p0, int p1) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getStagedSessions() throws android.os.RemoteException;
    public void registerCallback(android.content.pm.IPackageInstallerCallback p0, int p1) throws android.os.RemoteException;
    public void unregisterCallback(android.content.pm.IPackageInstallerCallback p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void uninstall(android.content.pm.VersionedPackage p0, java.lang.String p1, int p2, android.content.IntentSender p3, int p4) throws android.os.RemoteException;
    public void installExistingPackage(java.lang.String p0, int p1, int p2, android.content.IntentSender p3, int p4, java.util.List<java.lang.String> p5) throws android.os.RemoteException;
    public void setPermissionsResult(int p0, boolean p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageInstaller {
        private static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageInstaller";
        static final int TRANSACTION_createSession = 1;
        static final int TRANSACTION_updateSessionAppIcon = 2;
        static final int TRANSACTION_updateSessionAppLabel = 3;
        static final int TRANSACTION_abandonSession = 4;
        static final int TRANSACTION_openSession = 5;
        static final int TRANSACTION_getSessionInfo = 6;
        static final int TRANSACTION_getAllSessions = 7;
        static final int TRANSACTION_getMySessions = 8;
        static final int TRANSACTION_getStagedSessions = 9;
        static final int TRANSACTION_registerCallback = 10;
        static final int TRANSACTION_unregisterCallback = 11;
        static final int TRANSACTION_uninstall = 12;
        static final int TRANSACTION_installExistingPackage = 13;
        static final int TRANSACTION_setPermissionsResult = 14;
        public Stub() { super(); }
        public static android.content.pm.IPackageInstaller asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.IPackageInstaller p0) { return false; }
        public static android.content.pm.IPackageInstaller getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.IPackageInstaller {
            private android.os.IBinder mRemote;
            public static android.content.pm.IPackageInstaller sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int createSession(android.content.pm.PackageInstaller.SessionParams p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
            public void updateSessionAppIcon(int p0, android.graphics.Bitmap p1) throws android.os.RemoteException {}
            public void updateSessionAppLabel(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public void abandonSession(int p0) throws android.os.RemoteException {}
            public android.content.pm.IPackageInstallerSession openSession(int p0) throws android.os.RemoteException { return null; }
            public android.content.pm.PackageInstaller.SessionInfo getSessionInfo(int p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getAllSessions(int p0) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getMySessions(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getStagedSessions() throws android.os.RemoteException { return null; }
            public void registerCallback(android.content.pm.IPackageInstallerCallback p0, int p1) throws android.os.RemoteException {}
            public void unregisterCallback(android.content.pm.IPackageInstallerCallback p0) throws android.os.RemoteException {}
            public void uninstall(android.content.pm.VersionedPackage p0, java.lang.String p1, int p2, android.content.IntentSender p3, int p4) throws android.os.RemoteException {}
            public void installExistingPackage(java.lang.String p0, int p1, int p2, android.content.IntentSender p3, int p4, java.util.List<java.lang.String> p5) throws android.os.RemoteException {}
            public void setPermissionsResult(int p0, boolean p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.content.pm.IPackageInstaller {
        public Default() {}
        public int createSession(android.content.pm.PackageInstaller.SessionParams p0, java.lang.String p1, int p2) throws android.os.RemoteException { return 0; }
        public void updateSessionAppIcon(int p0, android.graphics.Bitmap p1) throws android.os.RemoteException {}
        public void updateSessionAppLabel(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public void abandonSession(int p0) throws android.os.RemoteException {}
        public android.content.pm.IPackageInstallerSession openSession(int p0) throws android.os.RemoteException { return null; }
        public android.content.pm.PackageInstaller.SessionInfo getSessionInfo(int p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getAllSessions(int p0) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getMySessions(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getStagedSessions() throws android.os.RemoteException { return null; }
        public void registerCallback(android.content.pm.IPackageInstallerCallback p0, int p1) throws android.os.RemoteException {}
        public void unregisterCallback(android.content.pm.IPackageInstallerCallback p0) throws android.os.RemoteException {}
        public void uninstall(android.content.pm.VersionedPackage p0, java.lang.String p1, int p2, android.content.IntentSender p3, int p4) throws android.os.RemoteException {}
        public void installExistingPackage(java.lang.String p0, int p1, int p2, android.content.IntentSender p3, int p4, java.util.List<java.lang.String> p5) throws android.os.RemoteException {}
        public void setPermissionsResult(int p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
