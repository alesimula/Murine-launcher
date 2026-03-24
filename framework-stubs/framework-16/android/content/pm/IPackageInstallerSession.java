package android.content.pm;

public interface IPackageInstallerSession extends android.os.IInterface {
    public void setClientProgress(float p0) throws android.os.RemoteException;
    public void addClientProgress(float p0) throws android.os.RemoteException;
    public java.lang.String[] getNames() throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor openWrite(java.lang.String p0, long p1, long p2) throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor openRead(java.lang.String p0) throws android.os.RemoteException;
    public void write(java.lang.String p0, long p1, long p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException;
    public void stageViaHardLink(java.lang.String p0) throws android.os.RemoteException;
    public void setChecksums(java.lang.String p0, android.content.pm.Checksum[] p1, byte[] p2) throws android.os.RemoteException;
    public void requestChecksums(java.lang.String p0, int p1, int p2, java.util.List p3, android.content.pm.IOnChecksumsReadyListener p4) throws android.os.RemoteException;
    public void removeSplit(java.lang.String p0) throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;
    public void commit(android.content.IntentSender p0, boolean p1) throws android.os.RemoteException;
    public void transfer(java.lang.String p0) throws android.os.RemoteException;
    public void abandon() throws android.os.RemoteException;
    public void seal() throws android.os.RemoteException;
    public java.util.List<java.lang.String> fetchPackageNames() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("com.android.permission.USE_INSTALLER_V2")
    public android.content.pm.DataLoaderParamsParcel getDataLoaderParams() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("com.android.permission.USE_INSTALLER_V2")
    public void addFile(int p0, java.lang.String p1, long p2, byte[] p3, byte[] p4) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("com.android.permission.USE_INSTALLER_V2")
    public void removeFile(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isMultiPackage() throws android.os.RemoteException;
    public int[] getChildSessionIds() throws android.os.RemoteException;
    public void addChildSessionId(int p0) throws android.os.RemoteException;
    public void removeChildSessionId(int p0) throws android.os.RemoteException;
    public int getParentSessionId() throws android.os.RemoteException;
    public boolean isStaged() throws android.os.RemoteException;
    public int getInstallFlags() throws android.os.RemoteException;
    public void requestUserPreapproval(android.content.pm.PackageInstaller.PreapprovalDetails p0, android.content.IntentSender p1) throws android.os.RemoteException;
    public boolean isApplicationEnabledSettingPersistent() throws android.os.RemoteException;
    public boolean isRequestUpdateOwnership() throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor getAppMetadataFd() throws android.os.RemoteException;
    public android.os.ParcelFileDescriptor openWriteAppMetadata() throws android.os.RemoteException;
    public void removeAppMetadata() throws android.os.RemoteException;
    public void setPreVerifiedDomains(android.content.pm.verify.domain.DomainSet p0) throws android.os.RemoteException;
    public android.content.pm.verify.domain.DomainSet getPreVerifiedDomains() throws android.os.RemoteException;

    public static class Default implements android.content.pm.IPackageInstallerSession {
        public Default() {}
        public void setClientProgress(float p0) throws android.os.RemoteException {}
        public void addClientProgress(float p0) throws android.os.RemoteException {}
        public java.lang.String[] getNames() throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor openWrite(java.lang.String p0, long p1, long p2) throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor openRead(java.lang.String p0) throws android.os.RemoteException { return null; }
        public void write(java.lang.String p0, long p1, long p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException {}
        public void stageViaHardLink(java.lang.String p0) throws android.os.RemoteException {}
        public void setChecksums(java.lang.String p0, android.content.pm.Checksum[] p1, byte[] p2) throws android.os.RemoteException {}
        public void requestChecksums(java.lang.String p0, int p1, int p2, java.util.List p3, android.content.pm.IOnChecksumsReadyListener p4) throws android.os.RemoteException {}
        public void removeSplit(java.lang.String p0) throws android.os.RemoteException {}
        public void close() throws android.os.RemoteException {}
        public void commit(android.content.IntentSender p0, boolean p1) throws android.os.RemoteException {}
        public void transfer(java.lang.String p0) throws android.os.RemoteException {}
        public void abandon() throws android.os.RemoteException {}
        public void seal() throws android.os.RemoteException {}
        public java.util.List<java.lang.String> fetchPackageNames() throws android.os.RemoteException { return null; }
        public android.content.pm.DataLoaderParamsParcel getDataLoaderParams() throws android.os.RemoteException { return null; }
        public void addFile(int p0, java.lang.String p1, long p2, byte[] p3, byte[] p4) throws android.os.RemoteException {}
        public void removeFile(int p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean isMultiPackage() throws android.os.RemoteException { return false; }
        public int[] getChildSessionIds() throws android.os.RemoteException { return null; }
        public void addChildSessionId(int p0) throws android.os.RemoteException {}
        public void removeChildSessionId(int p0) throws android.os.RemoteException {}
        public int getParentSessionId() throws android.os.RemoteException { return 0; }
        public boolean isStaged() throws android.os.RemoteException { return false; }
        public int getInstallFlags() throws android.os.RemoteException { return 0; }
        public void requestUserPreapproval(android.content.pm.PackageInstaller.PreapprovalDetails p0, android.content.IntentSender p1) throws android.os.RemoteException {}
        public boolean isApplicationEnabledSettingPersistent() throws android.os.RemoteException { return false; }
        public boolean isRequestUpdateOwnership() throws android.os.RemoteException { return false; }
        public android.os.ParcelFileDescriptor getAppMetadataFd() throws android.os.RemoteException { return null; }
        public android.os.ParcelFileDescriptor openWriteAppMetadata() throws android.os.RemoteException { return null; }
        public void removeAppMetadata() throws android.os.RemoteException {}
        public void setPreVerifiedDomains(android.content.pm.verify.domain.DomainSet p0) throws android.os.RemoteException {}
        public android.content.pm.verify.domain.DomainSet getPreVerifiedDomains() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageInstallerSession {
        public static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageInstallerSession";
        static final int TRANSACTION_setClientProgress = 1;
        static final int TRANSACTION_addClientProgress = 2;
        static final int TRANSACTION_getNames = 3;
        static final int TRANSACTION_openWrite = 4;
        static final int TRANSACTION_openRead = 5;
        static final int TRANSACTION_write = 6;
        static final int TRANSACTION_stageViaHardLink = 7;
        static final int TRANSACTION_setChecksums = 8;
        static final int TRANSACTION_requestChecksums = 9;
        static final int TRANSACTION_removeSplit = 10;
        static final int TRANSACTION_close = 11;
        static final int TRANSACTION_commit = 12;
        static final int TRANSACTION_transfer = 13;
        static final int TRANSACTION_abandon = 14;
        static final int TRANSACTION_seal = 15;
        static final int TRANSACTION_fetchPackageNames = 16;
        static final int TRANSACTION_getDataLoaderParams = 17;
        static final int TRANSACTION_addFile = 18;
        static final int TRANSACTION_removeFile = 19;
        static final int TRANSACTION_isMultiPackage = 20;
        static final int TRANSACTION_getChildSessionIds = 21;
        static final int TRANSACTION_addChildSessionId = 22;
        static final int TRANSACTION_removeChildSessionId = 23;
        static final int TRANSACTION_getParentSessionId = 24;
        static final int TRANSACTION_isStaged = 25;
        static final int TRANSACTION_getInstallFlags = 26;
        static final int TRANSACTION_requestUserPreapproval = 27;
        static final int TRANSACTION_isApplicationEnabledSettingPersistent = 28;
        static final int TRANSACTION_isRequestUpdateOwnership = 29;
        static final int TRANSACTION_getAppMetadataFd = 30;
        static final int TRANSACTION_openWriteAppMetadata = 31;
        static final int TRANSACTION_removeAppMetadata = 32;
        static final int TRANSACTION_setPreVerifiedDomains = 33;
        static final int TRANSACTION_getPreVerifiedDomains = 34;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.content.pm.IPackageInstallerSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void getDataLoaderParams_enforcePermission() throws java.lang.SecurityException {}
        protected void addFile_enforcePermission() throws java.lang.SecurityException {}
        protected void removeFile_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.content.pm.IPackageInstallerSession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setClientProgress(float p0) throws android.os.RemoteException {}
            public void addClientProgress(float p0) throws android.os.RemoteException {}
            public java.lang.String[] getNames() throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor openWrite(java.lang.String p0, long p1, long p2) throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor openRead(java.lang.String p0) throws android.os.RemoteException { return null; }
            public void write(java.lang.String p0, long p1, long p2, android.os.ParcelFileDescriptor p3) throws android.os.RemoteException {}
            public void stageViaHardLink(java.lang.String p0) throws android.os.RemoteException {}
            public void setChecksums(java.lang.String p0, android.content.pm.Checksum[] p1, byte[] p2) throws android.os.RemoteException {}
            public void requestChecksums(java.lang.String p0, int p1, int p2, java.util.List p3, android.content.pm.IOnChecksumsReadyListener p4) throws android.os.RemoteException {}
            public void removeSplit(java.lang.String p0) throws android.os.RemoteException {}
            public void close() throws android.os.RemoteException {}
            public void commit(android.content.IntentSender p0, boolean p1) throws android.os.RemoteException {}
            public void transfer(java.lang.String p0) throws android.os.RemoteException {}
            public void abandon() throws android.os.RemoteException {}
            public void seal() throws android.os.RemoteException {}
            public java.util.List<java.lang.String> fetchPackageNames() throws android.os.RemoteException { return null; }
            public android.content.pm.DataLoaderParamsParcel getDataLoaderParams() throws android.os.RemoteException { return null; }
            public void addFile(int p0, java.lang.String p1, long p2, byte[] p3, byte[] p4) throws android.os.RemoteException {}
            public void removeFile(int p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean isMultiPackage() throws android.os.RemoteException { return false; }
            public int[] getChildSessionIds() throws android.os.RemoteException { return null; }
            public void addChildSessionId(int p0) throws android.os.RemoteException {}
            public void removeChildSessionId(int p0) throws android.os.RemoteException {}
            public int getParentSessionId() throws android.os.RemoteException { return 0; }
            public boolean isStaged() throws android.os.RemoteException { return false; }
            public int getInstallFlags() throws android.os.RemoteException { return 0; }
            public void requestUserPreapproval(android.content.pm.PackageInstaller.PreapprovalDetails p0, android.content.IntentSender p1) throws android.os.RemoteException {}
            public boolean isApplicationEnabledSettingPersistent() throws android.os.RemoteException { return false; }
            public boolean isRequestUpdateOwnership() throws android.os.RemoteException { return false; }
            public android.os.ParcelFileDescriptor getAppMetadataFd() throws android.os.RemoteException { return null; }
            public android.os.ParcelFileDescriptor openWriteAppMetadata() throws android.os.RemoteException { return null; }
            public void removeAppMetadata() throws android.os.RemoteException {}
            public void setPreVerifiedDomains(android.content.pm.verify.domain.DomainSet p0) throws android.os.RemoteException {}
            public android.content.pm.verify.domain.DomainSet getPreVerifiedDomains() throws android.os.RemoteException { return null; }
        }
    }
}
