package android.gsi;

public interface IGsiService extends android.os.IInterface {
    public static final int STATUS_NO_OPERATION = 0;
    public static final int STATUS_WORKING = 1;
    public static final int STATUS_COMPLETE = 2;
    public static final int INSTALL_OK = 0;
    public static final int INSTALL_ERROR_GENERIC = 1;
    public static final int INSTALL_ERROR_NO_SPACE = 2;
    public static final int INSTALL_ERROR_FILE_SYSTEM_CLUTTERED = 3;
    public static final int BOOT_STATUS_NOT_INSTALLED = 0;
    public static final int BOOT_STATUS_DISABLED = 1;
    public static final int BOOT_STATUS_SINGLE_BOOT = 2;
    public static final int BOOT_STATUS_ENABLED = 3;
    public static final int BOOT_STATUS_WILL_WIPE = 4;
    public int startGsiInstall(long p0, long p1, boolean p2) throws android.os.RemoteException;
    public boolean commitGsiChunkFromStream(android.os.ParcelFileDescriptor p0, long p1) throws android.os.RemoteException;
    public android.gsi.GsiProgress getInstallProgress() throws android.os.RemoteException;
    public boolean commitGsiChunkFromMemory(byte[] p0) throws android.os.RemoteException;
    public int setGsiBootable(boolean p0) throws android.os.RemoteException;
    public boolean isGsiEnabled() throws android.os.RemoteException;
    public boolean cancelGsiInstall() throws android.os.RemoteException;
    public boolean isGsiInstallInProgress() throws android.os.RemoteException;
    public boolean removeGsiInstall() throws android.os.RemoteException;
    public boolean disableGsiInstall() throws android.os.RemoteException;
    public long getUserdataImageSize() throws android.os.RemoteException;
    public boolean isGsiRunning() throws android.os.RemoteException;
    public boolean isGsiInstalled() throws android.os.RemoteException;
    public int getGsiBootStatus() throws android.os.RemoteException;
    public java.lang.String getInstalledGsiImageDir() throws android.os.RemoteException;
    public int beginGsiInstall(android.gsi.GsiInstallParams p0) throws android.os.RemoteException;
    public int wipeGsiUserdata() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.gsi.IGsiService {
        private static final java.lang.String DESCRIPTOR = "android.gsi.IGsiService";
        static final int TRANSACTION_startGsiInstall = 1;
        static final int TRANSACTION_commitGsiChunkFromStream = 2;
        static final int TRANSACTION_getInstallProgress = 3;
        static final int TRANSACTION_commitGsiChunkFromMemory = 4;
        static final int TRANSACTION_setGsiBootable = 5;
        static final int TRANSACTION_isGsiEnabled = 6;
        static final int TRANSACTION_cancelGsiInstall = 7;
        static final int TRANSACTION_isGsiInstallInProgress = 8;
        static final int TRANSACTION_removeGsiInstall = 9;
        static final int TRANSACTION_disableGsiInstall = 10;
        static final int TRANSACTION_getUserdataImageSize = 11;
        static final int TRANSACTION_isGsiRunning = 12;
        static final int TRANSACTION_isGsiInstalled = 13;
        static final int TRANSACTION_getGsiBootStatus = 14;
        static final int TRANSACTION_getInstalledGsiImageDir = 15;
        static final int TRANSACTION_beginGsiInstall = 16;
        static final int TRANSACTION_wipeGsiUserdata = 17;
        public Stub() { super(); }
        public static android.gsi.IGsiService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.gsi.IGsiService p0) { return false; }
        public static android.gsi.IGsiService getDefaultImpl() { return null; }

        private static class Proxy implements android.gsi.IGsiService {
            private android.os.IBinder mRemote;
            public static android.gsi.IGsiService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int startGsiInstall(long p0, long p1, boolean p2) throws android.os.RemoteException { return 0; }
            public boolean commitGsiChunkFromStream(android.os.ParcelFileDescriptor p0, long p1) throws android.os.RemoteException { return false; }
            public android.gsi.GsiProgress getInstallProgress() throws android.os.RemoteException { return null; }
            public boolean commitGsiChunkFromMemory(byte[] p0) throws android.os.RemoteException { return false; }
            public int setGsiBootable(boolean p0) throws android.os.RemoteException { return 0; }
            public boolean isGsiEnabled() throws android.os.RemoteException { return false; }
            public boolean cancelGsiInstall() throws android.os.RemoteException { return false; }
            public boolean isGsiInstallInProgress() throws android.os.RemoteException { return false; }
            public boolean removeGsiInstall() throws android.os.RemoteException { return false; }
            public boolean disableGsiInstall() throws android.os.RemoteException { return false; }
            public long getUserdataImageSize() throws android.os.RemoteException { return 0L; }
            public boolean isGsiRunning() throws android.os.RemoteException { return false; }
            public boolean isGsiInstalled() throws android.os.RemoteException { return false; }
            public int getGsiBootStatus() throws android.os.RemoteException { return 0; }
            public java.lang.String getInstalledGsiImageDir() throws android.os.RemoteException { return null; }
            public int beginGsiInstall(android.gsi.GsiInstallParams p0) throws android.os.RemoteException { return 0; }
            public int wipeGsiUserdata() throws android.os.RemoteException { return 0; }
        }
    }

    public static class Default implements android.gsi.IGsiService {
        public Default() {}
        public int startGsiInstall(long p0, long p1, boolean p2) throws android.os.RemoteException { return 0; }
        public boolean commitGsiChunkFromStream(android.os.ParcelFileDescriptor p0, long p1) throws android.os.RemoteException { return false; }
        public android.gsi.GsiProgress getInstallProgress() throws android.os.RemoteException { return null; }
        public boolean commitGsiChunkFromMemory(byte[] p0) throws android.os.RemoteException { return false; }
        public int setGsiBootable(boolean p0) throws android.os.RemoteException { return 0; }
        public boolean isGsiEnabled() throws android.os.RemoteException { return false; }
        public boolean cancelGsiInstall() throws android.os.RemoteException { return false; }
        public boolean isGsiInstallInProgress() throws android.os.RemoteException { return false; }
        public boolean removeGsiInstall() throws android.os.RemoteException { return false; }
        public boolean disableGsiInstall() throws android.os.RemoteException { return false; }
        public long getUserdataImageSize() throws android.os.RemoteException { return 0L; }
        public boolean isGsiRunning() throws android.os.RemoteException { return false; }
        public boolean isGsiInstalled() throws android.os.RemoteException { return false; }
        public int getGsiBootStatus() throws android.os.RemoteException { return 0; }
        public java.lang.String getInstalledGsiImageDir() throws android.os.RemoteException { return null; }
        public int beginGsiInstall(android.gsi.GsiInstallParams p0) throws android.os.RemoteException { return 0; }
        public int wipeGsiUserdata() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }
}
