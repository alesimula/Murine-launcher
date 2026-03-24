package android.content.pm;

public interface IOnAppsChangedListener extends android.os.IInterface {
    public void onPackageRemoved(android.os.UserHandle p0, java.lang.String p1) throws android.os.RemoteException;
    public void onPackageAdded(android.os.UserHandle p0, java.lang.String p1) throws android.os.RemoteException;
    public void onPackageChanged(android.os.UserHandle p0, java.lang.String p1) throws android.os.RemoteException;
    public void onPackagesAvailable(android.os.UserHandle p0, java.lang.String[] p1, boolean p2) throws android.os.RemoteException;
    public void onPackagesUnavailable(android.os.UserHandle p0, java.lang.String[] p1, boolean p2) throws android.os.RemoteException;
    public void onPackagesSuspended(android.os.UserHandle p0, java.lang.String[] p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void onPackagesUnsuspended(android.os.UserHandle p0, java.lang.String[] p1) throws android.os.RemoteException;
    public void onShortcutChanged(android.os.UserHandle p0, java.lang.String p1, android.content.pm.ParceledListSlice p2) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IOnAppsChangedListener {
        private static final java.lang.String DESCRIPTOR = "android.content.pm.IOnAppsChangedListener";
        static final int TRANSACTION_onPackageRemoved = 1;
        static final int TRANSACTION_onPackageAdded = 2;
        static final int TRANSACTION_onPackageChanged = 3;
        static final int TRANSACTION_onPackagesAvailable = 4;
        static final int TRANSACTION_onPackagesUnavailable = 5;
        static final int TRANSACTION_onPackagesSuspended = 6;
        static final int TRANSACTION_onPackagesUnsuspended = 7;
        static final int TRANSACTION_onShortcutChanged = 8;
        public Stub() { super(); }
        public static android.content.pm.IOnAppsChangedListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.pm.IOnAppsChangedListener p0) { return false; }
        public static android.content.pm.IOnAppsChangedListener getDefaultImpl() { return null; }

        private static class Proxy implements android.content.pm.IOnAppsChangedListener {
            private android.os.IBinder mRemote;
            public static android.content.pm.IOnAppsChangedListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onPackageRemoved(android.os.UserHandle p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onPackageAdded(android.os.UserHandle p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onPackageChanged(android.os.UserHandle p0, java.lang.String p1) throws android.os.RemoteException {}
            public void onPackagesAvailable(android.os.UserHandle p0, java.lang.String[] p1, boolean p2) throws android.os.RemoteException {}
            public void onPackagesUnavailable(android.os.UserHandle p0, java.lang.String[] p1, boolean p2) throws android.os.RemoteException {}
            public void onPackagesSuspended(android.os.UserHandle p0, java.lang.String[] p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void onPackagesUnsuspended(android.os.UserHandle p0, java.lang.String[] p1) throws android.os.RemoteException {}
            public void onShortcutChanged(android.os.UserHandle p0, java.lang.String p1, android.content.pm.ParceledListSlice p2) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.content.pm.IOnAppsChangedListener {
        public Default() {}
        public void onPackageRemoved(android.os.UserHandle p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onPackageAdded(android.os.UserHandle p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onPackageChanged(android.os.UserHandle p0, java.lang.String p1) throws android.os.RemoteException {}
        public void onPackagesAvailable(android.os.UserHandle p0, java.lang.String[] p1, boolean p2) throws android.os.RemoteException {}
        public void onPackagesUnavailable(android.os.UserHandle p0, java.lang.String[] p1, boolean p2) throws android.os.RemoteException {}
        public void onPackagesSuspended(android.os.UserHandle p0, java.lang.String[] p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void onPackagesUnsuspended(android.os.UserHandle p0, java.lang.String[] p1) throws android.os.RemoteException {}
        public void onShortcutChanged(android.os.UserHandle p0, java.lang.String p1, android.content.pm.ParceledListSlice p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}
