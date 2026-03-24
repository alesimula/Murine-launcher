package android.os.image;

public interface IDynamicSystemService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.image.IDynamicSystemService";
    @android.annotation.EnforcePermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public boolean startInstallation(java.lang.String p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public int createPartition(java.lang.String p0, long p1, boolean p2) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public boolean closePartition() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public boolean finishInstallation() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public android.gsi.GsiProgress getInstallationProgress() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public boolean abort() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean isInUse() throws android.os.RemoteException;
    @android.annotation.RequiresNoPermission
    public boolean isInstalled() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public boolean isEnabled() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public boolean remove() throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public boolean setEnable(boolean p0, boolean p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public boolean setAshmem(android.os.ParcelFileDescriptor p0, long p1) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public boolean submitFromAshmem(long p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public boolean getAvbPublicKey(android.gsi.AvbPublicKey p0) throws android.os.RemoteException;
    @android.annotation.EnforcePermission("android.permission.MANAGE_DYNAMIC_SYSTEM")
    public long suggestScratchSize() throws android.os.RemoteException;

    public static class Default implements android.os.image.IDynamicSystemService {
        public Default() {}
        public boolean startInstallation(java.lang.String p0) throws android.os.RemoteException { return false; }
        public int createPartition(java.lang.String p0, long p1, boolean p2) throws android.os.RemoteException { return 0; }
        public boolean closePartition() throws android.os.RemoteException { return false; }
        public boolean finishInstallation() throws android.os.RemoteException { return false; }
        public android.gsi.GsiProgress getInstallationProgress() throws android.os.RemoteException { return null; }
        public boolean abort() throws android.os.RemoteException { return false; }
        public boolean isInUse() throws android.os.RemoteException { return false; }
        public boolean isInstalled() throws android.os.RemoteException { return false; }
        public boolean isEnabled() throws android.os.RemoteException { return false; }
        public boolean remove() throws android.os.RemoteException { return false; }
        public boolean setEnable(boolean p0, boolean p1) throws android.os.RemoteException { return false; }
        public boolean setAshmem(android.os.ParcelFileDescriptor p0, long p1) throws android.os.RemoteException { return false; }
        public boolean submitFromAshmem(long p0) throws android.os.RemoteException { return false; }
        public boolean getAvbPublicKey(android.gsi.AvbPublicKey p0) throws android.os.RemoteException { return false; }
        public long suggestScratchSize() throws android.os.RemoteException { return 0L; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.image.IDynamicSystemService {
        static final int TRANSACTION_startInstallation = 1;
        static final int TRANSACTION_createPartition = 2;
        static final int TRANSACTION_closePartition = 3;
        static final int TRANSACTION_finishInstallation = 4;
        static final int TRANSACTION_getInstallationProgress = 5;
        static final int TRANSACTION_abort = 6;
        static final int TRANSACTION_isInUse = 7;
        static final int TRANSACTION_isInstalled = 8;
        static final int TRANSACTION_isEnabled = 9;
        static final int TRANSACTION_remove = 10;
        static final int TRANSACTION_setEnable = 11;
        static final int TRANSACTION_setAshmem = 12;
        static final int TRANSACTION_submitFromAshmem = 13;
        static final int TRANSACTION_getAvbPublicKey = 14;
        static final int TRANSACTION_suggestScratchSize = 15;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static android.os.image.IDynamicSystemService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void startInstallation_enforcePermission() throws java.lang.SecurityException {}
        protected void createPartition_enforcePermission() throws java.lang.SecurityException {}
        protected void closePartition_enforcePermission() throws java.lang.SecurityException {}
        protected void finishInstallation_enforcePermission() throws java.lang.SecurityException {}
        protected void getInstallationProgress_enforcePermission() throws java.lang.SecurityException {}
        protected void abort_enforcePermission() throws java.lang.SecurityException {}
        protected void isEnabled_enforcePermission() throws java.lang.SecurityException {}
        protected void remove_enforcePermission() throws java.lang.SecurityException {}
        protected void setEnable_enforcePermission() throws java.lang.SecurityException {}
        protected void setAshmem_enforcePermission() throws java.lang.SecurityException {}
        protected void submitFromAshmem_enforcePermission() throws java.lang.SecurityException {}
        protected void getAvbPublicKey_enforcePermission() throws java.lang.SecurityException {}
        protected void suggestScratchSize_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.image.IDynamicSystemService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean startInstallation(java.lang.String p0) throws android.os.RemoteException { return false; }
            public int createPartition(java.lang.String p0, long p1, boolean p2) throws android.os.RemoteException { return 0; }
            public boolean closePartition() throws android.os.RemoteException { return false; }
            public boolean finishInstallation() throws android.os.RemoteException { return false; }
            public android.gsi.GsiProgress getInstallationProgress() throws android.os.RemoteException { return null; }
            public boolean abort() throws android.os.RemoteException { return false; }
            public boolean isInUse() throws android.os.RemoteException { return false; }
            public boolean isInstalled() throws android.os.RemoteException { return false; }
            public boolean isEnabled() throws android.os.RemoteException { return false; }
            public boolean remove() throws android.os.RemoteException { return false; }
            public boolean setEnable(boolean p0, boolean p1) throws android.os.RemoteException { return false; }
            public boolean setAshmem(android.os.ParcelFileDescriptor p0, long p1) throws android.os.RemoteException { return false; }
            public boolean submitFromAshmem(long p0) throws android.os.RemoteException { return false; }
            public boolean getAvbPublicKey(android.gsi.AvbPublicKey p0) throws android.os.RemoteException { return false; }
            public long suggestScratchSize() throws android.os.RemoteException { return 0L; }
        }
    }
}
