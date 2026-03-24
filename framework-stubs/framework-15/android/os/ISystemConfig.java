package android.os;

public interface ISystemConfig extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.ISystemConfig";
    public java.util.List<java.lang.String> getDisabledUntilUsedPreinstalledCarrierApps() throws android.os.RemoteException;
    public java.util.Map getDisabledUntilUsedPreinstalledCarrierAssociatedApps() throws android.os.RemoteException;
    public java.util.Map getDisabledUntilUsedPreinstalledCarrierAssociatedAppEntries() throws android.os.RemoteException;
    public int[] getSystemPermissionUids(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<android.content.ComponentName> getEnabledComponentOverrides(java.lang.String p0) throws android.os.RemoteException;
    public java.util.List<android.content.ComponentName> getDefaultVrComponents() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getPreventUserDisablePackages() throws android.os.RemoteException;
    public java.util.List<android.content.pm.SignedPackageParcel> getEnhancedConfirmationTrustedPackages() throws android.os.RemoteException;
    public java.util.List<android.content.pm.SignedPackageParcel> getEnhancedConfirmationTrustedInstallers() throws android.os.RemoteException;

    public static class Default implements android.os.ISystemConfig {
        public Default() {}
        public java.util.List<java.lang.String> getDisabledUntilUsedPreinstalledCarrierApps() throws android.os.RemoteException { return null; }
        public java.util.Map getDisabledUntilUsedPreinstalledCarrierAssociatedApps() throws android.os.RemoteException { return null; }
        public java.util.Map getDisabledUntilUsedPreinstalledCarrierAssociatedAppEntries() throws android.os.RemoteException { return null; }
        public int[] getSystemPermissionUids(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.content.ComponentName> getEnabledComponentOverrides(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.content.ComponentName> getDefaultVrComponents() throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getPreventUserDisablePackages() throws android.os.RemoteException { return null; }
        public java.util.List<android.content.pm.SignedPackageParcel> getEnhancedConfirmationTrustedPackages() throws android.os.RemoteException { return null; }
        public java.util.List<android.content.pm.SignedPackageParcel> getEnhancedConfirmationTrustedInstallers() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.ISystemConfig {
        static final int TRANSACTION_getDisabledUntilUsedPreinstalledCarrierApps = 1;
        static final int TRANSACTION_getDisabledUntilUsedPreinstalledCarrierAssociatedApps = 2;
        static final int TRANSACTION_getDisabledUntilUsedPreinstalledCarrierAssociatedAppEntries = 3;
        static final int TRANSACTION_getSystemPermissionUids = 4;
        static final int TRANSACTION_getEnabledComponentOverrides = 5;
        static final int TRANSACTION_getDefaultVrComponents = 6;
        static final int TRANSACTION_getPreventUserDisablePackages = 7;
        static final int TRANSACTION_getEnhancedConfirmationTrustedPackages = 8;
        static final int TRANSACTION_getEnhancedConfirmationTrustedInstallers = 9;
        public Stub() { super(); }
        public static android.os.ISystemConfig asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.ISystemConfig {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<java.lang.String> getDisabledUntilUsedPreinstalledCarrierApps() throws android.os.RemoteException { return null; }
            public java.util.Map getDisabledUntilUsedPreinstalledCarrierAssociatedApps() throws android.os.RemoteException { return null; }
            public java.util.Map getDisabledUntilUsedPreinstalledCarrierAssociatedAppEntries() throws android.os.RemoteException { return null; }
            public int[] getSystemPermissionUids(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.content.ComponentName> getEnabledComponentOverrides(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.content.ComponentName> getDefaultVrComponents() throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getPreventUserDisablePackages() throws android.os.RemoteException { return null; }
            public java.util.List<android.content.pm.SignedPackageParcel> getEnhancedConfirmationTrustedPackages() throws android.os.RemoteException { return null; }
            public java.util.List<android.content.pm.SignedPackageParcel> getEnhancedConfirmationTrustedInstallers() throws android.os.RemoteException { return null; }
        }
    }
}
