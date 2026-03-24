package android.content.pm;

public interface IPackageInstallerCallback extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public void onSessionCreated(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void onSessionBadgingChanged(int p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void onSessionActiveChanged(int p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void onSessionProgressChanged(int p0, float p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void onSessionFinished(int p0, boolean p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageInstallerCallback {
        private static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageInstallerCallback";
        static final int TRANSACTION_onSessionCreated = 1;
        static final int TRANSACTION_onSessionBadgingChanged = 2;
        static final int TRANSACTION_onSessionActiveChanged = 3;
        static final int TRANSACTION_onSessionProgressChanged = 4;
        static final int TRANSACTION_onSessionFinished = 5;
        public Stub() { super(); }
        public static android.content.pm.IPackageInstallerCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.IPackageInstallerCallback p0) { return false; }
        public static android.content.pm.IPackageInstallerCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.IPackageInstallerCallback {
            private android.os.IBinder mRemote;
            public static android.content.pm.IPackageInstallerCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSessionCreated(int p0) throws android.os.RemoteException {}
            public void onSessionBadgingChanged(int p0) throws android.os.RemoteException {}
            public void onSessionActiveChanged(int p0, boolean p1) throws android.os.RemoteException {}
            public void onSessionProgressChanged(int p0, float p1) throws android.os.RemoteException {}
            public void onSessionFinished(int p0, boolean p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.content.pm.IPackageInstallerCallback {
        public Default() {}
        public void onSessionCreated(int p0) throws android.os.RemoteException {}
        public void onSessionBadgingChanged(int p0) throws android.os.RemoteException {}
        public void onSessionActiveChanged(int p0, boolean p1) throws android.os.RemoteException {}
        public void onSessionProgressChanged(int p0, float p1) throws android.os.RemoteException {}
        public void onSessionFinished(int p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
