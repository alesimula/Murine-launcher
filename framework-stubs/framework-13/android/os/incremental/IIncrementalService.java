package android.os.incremental;

public interface IIncrementalService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.incremental.IIncrementalService";
    public static final int CREATE_MODE_TEMPORARY_BIND = 1;
    public static final int CREATE_MODE_PERMANENT_BIND = 2;
    public static final int CREATE_MODE_CREATE = 4;
    public static final int CREATE_MODE_OPEN_EXISTING = 8;
    public static final int BIND_TEMPORARY = 0;
    public static final int BIND_PERMANENT = 1;
    public static final java.lang.String METRICS_MILLIS_SINCE_OLDEST_PENDING_READ = "millisSinceOldestPendingRead";
    public static final java.lang.String METRICS_READ_LOGS_ENABLED = "readLogsEnabled";
    public static final java.lang.String METRICS_STORAGE_HEALTH_STATUS_CODE = "storageHealthStatusCode";
    public static final java.lang.String METRICS_DATA_LOADER_STATUS_CODE = "dataLoaderStatusCode";
    public static final java.lang.String METRICS_MILLIS_SINCE_LAST_DATA_LOADER_BIND = "millisSinceLastDataLoaderBind";
    public static final java.lang.String METRICS_DATA_LOADER_BIND_DELAY_MILLIS = "dataLoaderBindDelayMillis";
    public static final java.lang.String METRICS_TOTAL_DELAYED_READS = "totalDelayedReads";
    public static final java.lang.String METRICS_TOTAL_DELAYED_READS_MILLIS = "totalDelayedReadsMillis";
    public static final java.lang.String METRICS_TOTAL_FAILED_READS = "totalFailedReads";
    public static final java.lang.String METRICS_LAST_READ_ERROR_UID = "lastReadErrorUid";
    public static final java.lang.String METRICS_MILLIS_SINCE_LAST_READ_ERROR = "millisSinceLastReadError";
    public static final java.lang.String METRICS_LAST_READ_ERROR_NUMBER = "lastReadErrorNo";
    public int openStorage(java.lang.String p0) throws android.os.RemoteException;
    public int createStorage(java.lang.String p0, android.content.pm.DataLoaderParamsParcel p1, int p2) throws android.os.RemoteException;
    public int createLinkedStorage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public boolean startLoading(int p0, android.content.pm.DataLoaderParamsParcel p1, android.content.pm.IDataLoaderStatusListener p2, android.os.incremental.StorageHealthCheckParams p3, android.os.incremental.IStorageHealthListener p4, android.os.incremental.PerUidReadTimeouts[] p5) throws android.os.RemoteException;
    public void onInstallationComplete(int p0) throws android.os.RemoteException;
    public int makeBindMount(int p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public int deleteBindMount(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int makeDirectory(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int makeDirectories(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int makeFile(int p0, java.lang.String p1, android.os.incremental.IncrementalNewFileParams p2, byte[] p3) throws android.os.RemoteException;
    public int makeFileFromRange(int p0, java.lang.String p1, java.lang.String p2, long p3, long p4) throws android.os.RemoteException;
    public int makeLink(int p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public int unlink(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int isFileFullyLoaded(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int isFullyLoaded(int p0) throws android.os.RemoteException;
    public float getLoadingProgress(int p0) throws android.os.RemoteException;
    public byte[] getMetadataByPath(int p0, java.lang.String p1) throws android.os.RemoteException;
    public byte[] getMetadataById(int p0, byte[] p1) throws android.os.RemoteException;
    public void deleteStorage(int p0) throws android.os.RemoteException;
    public void disallowReadLogs(int p0) throws android.os.RemoteException;
    public boolean configureNativeBinaries(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException;
    public boolean waitForNativeBinariesExtraction(int p0) throws android.os.RemoteException;
    public boolean registerLoadingProgressListener(int p0, android.os.incremental.IStorageLoadingProgressListener p1) throws android.os.RemoteException;
    public boolean unregisterLoadingProgressListener(int p0) throws android.os.RemoteException;
    public android.os.PersistableBundle getMetrics(int p0) throws android.os.RemoteException;

    public static class Default implements android.os.incremental.IIncrementalService {
        public Default() {}
        public int openStorage(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int createStorage(java.lang.String p0, android.content.pm.DataLoaderParamsParcel p1, int p2) throws android.os.RemoteException { return 0; }
        public int createLinkedStorage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public boolean startLoading(int p0, android.content.pm.DataLoaderParamsParcel p1, android.content.pm.IDataLoaderStatusListener p2, android.os.incremental.StorageHealthCheckParams p3, android.os.incremental.IStorageHealthListener p4, android.os.incremental.PerUidReadTimeouts[] p5) throws android.os.RemoteException { return false; }
        public void onInstallationComplete(int p0) throws android.os.RemoteException {}
        public int makeBindMount(int p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
        public int deleteBindMount(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int makeDirectory(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int makeDirectories(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int makeFile(int p0, java.lang.String p1, android.os.incremental.IncrementalNewFileParams p2, byte[] p3) throws android.os.RemoteException { return 0; }
        public int makeFileFromRange(int p0, java.lang.String p1, java.lang.String p2, long p3, long p4) throws android.os.RemoteException { return 0; }
        public int makeLink(int p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public int unlink(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int isFileFullyLoaded(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int isFullyLoaded(int p0) throws android.os.RemoteException { return 0; }
        public float getLoadingProgress(int p0) throws android.os.RemoteException { return 0.0f; }
        public byte[] getMetadataByPath(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public byte[] getMetadataById(int p0, byte[] p1) throws android.os.RemoteException { return null; }
        public void deleteStorage(int p0) throws android.os.RemoteException {}
        public void disallowReadLogs(int p0) throws android.os.RemoteException {}
        public boolean configureNativeBinaries(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException { return false; }
        public boolean waitForNativeBinariesExtraction(int p0) throws android.os.RemoteException { return false; }
        public boolean registerLoadingProgressListener(int p0, android.os.incremental.IStorageLoadingProgressListener p1) throws android.os.RemoteException { return false; }
        public boolean unregisterLoadingProgressListener(int p0) throws android.os.RemoteException { return false; }
        public android.os.PersistableBundle getMetrics(int p0) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.incremental.IIncrementalService {
        static final int TRANSACTION_openStorage = 1;
        static final int TRANSACTION_createStorage = 2;
        static final int TRANSACTION_createLinkedStorage = 3;
        static final int TRANSACTION_startLoading = 4;
        static final int TRANSACTION_onInstallationComplete = 5;
        static final int TRANSACTION_makeBindMount = 6;
        static final int TRANSACTION_deleteBindMount = 7;
        static final int TRANSACTION_makeDirectory = 8;
        static final int TRANSACTION_makeDirectories = 9;
        static final int TRANSACTION_makeFile = 10;
        static final int TRANSACTION_makeFileFromRange = 11;
        static final int TRANSACTION_makeLink = 12;
        static final int TRANSACTION_unlink = 13;
        static final int TRANSACTION_isFileFullyLoaded = 14;
        static final int TRANSACTION_isFullyLoaded = 15;
        static final int TRANSACTION_getLoadingProgress = 16;
        static final int TRANSACTION_getMetadataByPath = 17;
        static final int TRANSACTION_getMetadataById = 18;
        static final int TRANSACTION_deleteStorage = 19;
        static final int TRANSACTION_disallowReadLogs = 20;
        static final int TRANSACTION_configureNativeBinaries = 21;
        static final int TRANSACTION_waitForNativeBinariesExtraction = 22;
        static final int TRANSACTION_registerLoadingProgressListener = 23;
        static final int TRANSACTION_unregisterLoadingProgressListener = 24;
        static final int TRANSACTION_getMetrics = 25;
        public Stub() { super(); }
        public static android.os.incremental.IIncrementalService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.incremental.IIncrementalService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int openStorage(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int createStorage(java.lang.String p0, android.content.pm.DataLoaderParamsParcel p1, int p2) throws android.os.RemoteException { return 0; }
            public int createLinkedStorage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
            public boolean startLoading(int p0, android.content.pm.DataLoaderParamsParcel p1, android.content.pm.IDataLoaderStatusListener p2, android.os.incremental.StorageHealthCheckParams p3, android.os.incremental.IStorageHealthListener p4, android.os.incremental.PerUidReadTimeouts[] p5) throws android.os.RemoteException { return false; }
            public void onInstallationComplete(int p0) throws android.os.RemoteException {}
            public int makeBindMount(int p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
            public int deleteBindMount(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int makeDirectory(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int makeDirectories(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int makeFile(int p0, java.lang.String p1, android.os.incremental.IncrementalNewFileParams p2, byte[] p3) throws android.os.RemoteException { return 0; }
            public int makeFileFromRange(int p0, java.lang.String p1, java.lang.String p2, long p3, long p4) throws android.os.RemoteException { return 0; }
            public int makeLink(int p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public int unlink(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int isFileFullyLoaded(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int isFullyLoaded(int p0) throws android.os.RemoteException { return 0; }
            public float getLoadingProgress(int p0) throws android.os.RemoteException { return 0.0f; }
            public byte[] getMetadataByPath(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public byte[] getMetadataById(int p0, byte[] p1) throws android.os.RemoteException { return null; }
            public void deleteStorage(int p0) throws android.os.RemoteException {}
            public void disallowReadLogs(int p0) throws android.os.RemoteException {}
            public boolean configureNativeBinaries(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException { return false; }
            public boolean waitForNativeBinariesExtraction(int p0) throws android.os.RemoteException { return false; }
            public boolean registerLoadingProgressListener(int p0, android.os.incremental.IStorageLoadingProgressListener p1) throws android.os.RemoteException { return false; }
            public boolean unregisterLoadingProgressListener(int p0) throws android.os.RemoteException { return false; }
            public android.os.PersistableBundle getMetrics(int p0) throws android.os.RemoteException { return null; }
        }
    }
}
