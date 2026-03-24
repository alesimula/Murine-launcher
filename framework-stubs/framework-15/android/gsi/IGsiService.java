package android.gsi;

public interface IGsiService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.gsi.IGsiService";
    public static final int STATUS_NO_OPERATION = 0;
    public static final int STATUS_WORKING = 1;
    public static final int STATUS_COMPLETE = 2;
    public static final int INSTALL_OK = 0;
    public static final int INSTALL_ERROR_GENERIC = 1;
    public static final int INSTALL_ERROR_NO_SPACE = 2;
    public static final int INSTALL_ERROR_FILE_SYSTEM_CLUTTERED = 3;
    public boolean commitGsiChunkFromStream(android.os.ParcelFileDescriptor p0, long p1) throws android.os.RemoteException;
    public android.gsi.GsiProgress getInstallProgress() throws android.os.RemoteException;
    public boolean setGsiAshmem(android.os.ParcelFileDescriptor p0, long p1) throws android.os.RemoteException;
    public boolean commitGsiChunkFromAshmem(long p0) throws android.os.RemoteException;
    public int enableGsi(boolean p0, java.lang.String p1) throws android.os.RemoteException;
    public void enableGsiAsync(boolean p0, java.lang.String p1, android.gsi.IGsiServiceCallback p2) throws android.os.RemoteException;
    public boolean isGsiEnabled() throws android.os.RemoteException;
    public boolean cancelGsiInstall() throws android.os.RemoteException;
    public boolean isGsiInstallInProgress() throws android.os.RemoteException;
    public boolean removeGsi() throws android.os.RemoteException;
    public void removeGsiAsync(android.gsi.IGsiServiceCallback p0) throws android.os.RemoteException;
    public boolean disableGsi() throws android.os.RemoteException;
    public boolean isGsiInstalled() throws android.os.RemoteException;
    public boolean isGsiRunning() throws android.os.RemoteException;
    public java.lang.String getActiveDsuSlot() throws android.os.RemoteException;
    public java.lang.String getInstalledGsiImageDir() throws android.os.RemoteException;
    public java.util.List<java.lang.String> getInstalledDsuSlots() throws android.os.RemoteException;
    public int openInstall(java.lang.String p0) throws android.os.RemoteException;
    public int closeInstall() throws android.os.RemoteException;
    public int createPartition(java.lang.String p0, long p1, boolean p2) throws android.os.RemoteException;
    public int closePartition() throws android.os.RemoteException;
    public int zeroPartition(java.lang.String p0) throws android.os.RemoteException;
    public android.gsi.IImageService openImageService(java.lang.String p0) throws android.os.RemoteException;
    public java.lang.String dumpDeviceMapperDevices() throws android.os.RemoteException;
    public int getAvbPublicKey(android.gsi.AvbPublicKey p0) throws android.os.RemoteException;
    public long suggestScratchSize() throws android.os.RemoteException;

    public static class Default implements android.gsi.IGsiService {
        public Default() {}
        public boolean commitGsiChunkFromStream(android.os.ParcelFileDescriptor p0, long p1) throws android.os.RemoteException { return false; }
        public android.gsi.GsiProgress getInstallProgress() throws android.os.RemoteException { return null; }
        public boolean setGsiAshmem(android.os.ParcelFileDescriptor p0, long p1) throws android.os.RemoteException { return false; }
        public boolean commitGsiChunkFromAshmem(long p0) throws android.os.RemoteException { return false; }
        public int enableGsi(boolean p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public void enableGsiAsync(boolean p0, java.lang.String p1, android.gsi.IGsiServiceCallback p2) throws android.os.RemoteException {}
        public boolean isGsiEnabled() throws android.os.RemoteException { return false; }
        public boolean cancelGsiInstall() throws android.os.RemoteException { return false; }
        public boolean isGsiInstallInProgress() throws android.os.RemoteException { return false; }
        public boolean removeGsi() throws android.os.RemoteException { return false; }
        public void removeGsiAsync(android.gsi.IGsiServiceCallback p0) throws android.os.RemoteException {}
        public boolean disableGsi() throws android.os.RemoteException { return false; }
        public boolean isGsiInstalled() throws android.os.RemoteException { return false; }
        public boolean isGsiRunning() throws android.os.RemoteException { return false; }
        public java.lang.String getActiveDsuSlot() throws android.os.RemoteException { return null; }
        public java.lang.String getInstalledGsiImageDir() throws android.os.RemoteException { return null; }
        public java.util.List<java.lang.String> getInstalledDsuSlots() throws android.os.RemoteException { return null; }
        public int openInstall(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int closeInstall() throws android.os.RemoteException { return 0; }
        public int createPartition(java.lang.String p0, long p1, boolean p2) throws android.os.RemoteException { return 0; }
        public int closePartition() throws android.os.RemoteException { return 0; }
        public int zeroPartition(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public android.gsi.IImageService openImageService(java.lang.String p0) throws android.os.RemoteException { return null; }
        public java.lang.String dumpDeviceMapperDevices() throws android.os.RemoteException { return null; }
        public int getAvbPublicKey(android.gsi.AvbPublicKey p0) throws android.os.RemoteException { return 0; }
        public long suggestScratchSize() throws android.os.RemoteException { return 0L; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.gsi.IGsiService {
        static final int TRANSACTION_commitGsiChunkFromStream = 1;
        static final int TRANSACTION_getInstallProgress = 2;
        static final int TRANSACTION_setGsiAshmem = 3;
        static final int TRANSACTION_commitGsiChunkFromAshmem = 4;
        static final int TRANSACTION_enableGsi = 5;
        static final int TRANSACTION_enableGsiAsync = 6;
        static final int TRANSACTION_isGsiEnabled = 7;
        static final int TRANSACTION_cancelGsiInstall = 8;
        static final int TRANSACTION_isGsiInstallInProgress = 9;
        static final int TRANSACTION_removeGsi = 10;
        static final int TRANSACTION_removeGsiAsync = 11;
        static final int TRANSACTION_disableGsi = 12;
        static final int TRANSACTION_isGsiInstalled = 13;
        static final int TRANSACTION_isGsiRunning = 14;
        static final int TRANSACTION_getActiveDsuSlot = 15;
        static final int TRANSACTION_getInstalledGsiImageDir = 16;
        static final int TRANSACTION_getInstalledDsuSlots = 17;
        static final int TRANSACTION_openInstall = 18;
        static final int TRANSACTION_closeInstall = 19;
        static final int TRANSACTION_createPartition = 20;
        static final int TRANSACTION_closePartition = 21;
        static final int TRANSACTION_zeroPartition = 22;
        static final int TRANSACTION_openImageService = 23;
        static final int TRANSACTION_dumpDeviceMapperDevices = 24;
        static final int TRANSACTION_getAvbPublicKey = 25;
        static final int TRANSACTION_suggestScratchSize = 26;
        public Stub() { super(); }
        public static android.gsi.IGsiService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.gsi.IGsiService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean commitGsiChunkFromStream(android.os.ParcelFileDescriptor p0, long p1) throws android.os.RemoteException { return false; }
            public android.gsi.GsiProgress getInstallProgress() throws android.os.RemoteException { return null; }
            public boolean setGsiAshmem(android.os.ParcelFileDescriptor p0, long p1) throws android.os.RemoteException { return false; }
            public boolean commitGsiChunkFromAshmem(long p0) throws android.os.RemoteException { return false; }
            public int enableGsi(boolean p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public void enableGsiAsync(boolean p0, java.lang.String p1, android.gsi.IGsiServiceCallback p2) throws android.os.RemoteException {}
            public boolean isGsiEnabled() throws android.os.RemoteException { return false; }
            public boolean cancelGsiInstall() throws android.os.RemoteException { return false; }
            public boolean isGsiInstallInProgress() throws android.os.RemoteException { return false; }
            public boolean removeGsi() throws android.os.RemoteException { return false; }
            public void removeGsiAsync(android.gsi.IGsiServiceCallback p0) throws android.os.RemoteException {}
            public boolean disableGsi() throws android.os.RemoteException { return false; }
            public boolean isGsiInstalled() throws android.os.RemoteException { return false; }
            public boolean isGsiRunning() throws android.os.RemoteException { return false; }
            public java.lang.String getActiveDsuSlot() throws android.os.RemoteException { return null; }
            public java.lang.String getInstalledGsiImageDir() throws android.os.RemoteException { return null; }
            public java.util.List<java.lang.String> getInstalledDsuSlots() throws android.os.RemoteException { return null; }
            public int openInstall(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int closeInstall() throws android.os.RemoteException { return 0; }
            public int createPartition(java.lang.String p0, long p1, boolean p2) throws android.os.RemoteException { return 0; }
            public int closePartition() throws android.os.RemoteException { return 0; }
            public int zeroPartition(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public android.gsi.IImageService openImageService(java.lang.String p0) throws android.os.RemoteException { return null; }
            public java.lang.String dumpDeviceMapperDevices() throws android.os.RemoteException { return null; }
            public int getAvbPublicKey(android.gsi.AvbPublicKey p0) throws android.os.RemoteException { return 0; }
            public long suggestScratchSize() throws android.os.RemoteException { return 0L; }
        }
    }
}
