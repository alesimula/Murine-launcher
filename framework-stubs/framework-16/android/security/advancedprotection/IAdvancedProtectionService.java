package android.security.advancedprotection;

public interface IAdvancedProtectionService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.security.advancedprotection.IAdvancedProtectionService";
    @android.annotation.EnforcePermission("android.permission.QUERY_ADVANCED_PROTECTION_MODE")
    public boolean isAdvancedProtectionEnabled() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.QUERY_ADVANCED_PROTECTION_MODE")
    public void registerAdvancedProtectionCallback(android.security.advancedprotection.IAdvancedProtectionCallback p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.QUERY_ADVANCED_PROTECTION_MODE")
    public void unregisterAdvancedProtectionCallback(android.security.advancedprotection.IAdvancedProtectionCallback p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_ADVANCED_PROTECTION_MODE")
    public void setAdvancedProtectionEnabled(boolean p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_ADVANCED_PROTECTION_MODE")
    public java.util.List<android.security.advancedprotection.AdvancedProtectionFeature> getAdvancedProtectionFeatures() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_ADVANCED_PROTECTION_MODE")
    public void logDialogShown(int p0, int p1, boolean p2) throws android.os.RemoteException;

    public static class Default implements android.security.advancedprotection.IAdvancedProtectionService {
        public Default() {}
        public boolean isAdvancedProtectionEnabled() throws android.os.RemoteException { return false; }
        public void registerAdvancedProtectionCallback(android.security.advancedprotection.IAdvancedProtectionCallback p0) throws android.os.RemoteException {}
        public void unregisterAdvancedProtectionCallback(android.security.advancedprotection.IAdvancedProtectionCallback p0) throws android.os.RemoteException {}
        public void setAdvancedProtectionEnabled(boolean p0) throws android.os.RemoteException {}
        public java.util.List<android.security.advancedprotection.AdvancedProtectionFeature> getAdvancedProtectionFeatures() throws android.os.RemoteException { return null; }
        public void logDialogShown(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.security.advancedprotection.IAdvancedProtectionService {
        static final int TRANSACTION_isAdvancedProtectionEnabled = 1;
        static final int TRANSACTION_registerAdvancedProtectionCallback = 2;
        static final int TRANSACTION_unregisterAdvancedProtectionCallback = 3;
        static final int TRANSACTION_setAdvancedProtectionEnabled = 4;
        static final int TRANSACTION_getAdvancedProtectionFeatures = 5;
        static final int TRANSACTION_logDialogShown = 6;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.security.advancedprotection.IAdvancedProtectionService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void isAdvancedProtectionEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void registerAdvancedProtectionCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void unregisterAdvancedProtectionCallback_enforcePermission() throws java.lang.SecurityException {}
        protected void setAdvancedProtectionEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void getAdvancedProtectionFeatures_enforcePermission() throws java.lang.SecurityException {}
        protected void logDialogShown_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.security.advancedprotection.IAdvancedProtectionService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isAdvancedProtectionEnabled() throws android.os.RemoteException { return false; }
            public void registerAdvancedProtectionCallback(android.security.advancedprotection.IAdvancedProtectionCallback p0) throws android.os.RemoteException {}
            public void unregisterAdvancedProtectionCallback(android.security.advancedprotection.IAdvancedProtectionCallback p0) throws android.os.RemoteException {}
            public void setAdvancedProtectionEnabled(boolean p0) throws android.os.RemoteException {}
            public java.util.List<android.security.advancedprotection.AdvancedProtectionFeature> getAdvancedProtectionFeatures() throws android.os.RemoteException { return null; }
            public void logDialogShown(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        }
    }
}
