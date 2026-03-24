package android.os.incremental;

public interface IIncrementalService extends android.os.IInterface {
    public static final int CREATE_MODE_TEMPORARY_BIND = 1;
    public static final int CREATE_MODE_PERMANENT_BIND = 2;
    public static final int CREATE_MODE_CREATE = 4;
    public static final int CREATE_MODE_OPEN_EXISTING = 8;
    public static final int BIND_TEMPORARY = 0;
    public static final int BIND_PERMANENT = 1;
    public int openStorage(java.lang.String p0) throws android.os.RemoteException;
    public int createStorage(java.lang.String p0, android.content.pm.DataLoaderParamsParcel p1, int p2, android.content.pm.IDataLoaderStatusListener p3, android.os.incremental.StorageHealthCheckParams p4, android.os.incremental.IStorageHealthListener p5) throws android.os.RemoteException;
    public int createLinkedStorage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException;
    public int makeBindMount(int p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException;
    public int deleteBindMount(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int makeDirectory(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int makeDirectories(int p0, java.lang.String p1) throws android.os.RemoteException;
    public int makeFile(int p0, java.lang.String p1, android.os.incremental.IncrementalNewFileParams p2) throws android.os.RemoteException;
    public int makeFileFromRange(int p0, java.lang.String p1, java.lang.String p2, long p3, long p4) throws android.os.RemoteException;
    public int makeLink(int p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public int unlink(int p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isFileRangeLoaded(int p0, java.lang.String p1, long p2, long p3) throws android.os.RemoteException;
    public byte[] getMetadataByPath(int p0, java.lang.String p1) throws android.os.RemoteException;
    public byte[] getMetadataById(int p0, byte[] p1) throws android.os.RemoteException;
    public boolean startLoading(int p0) throws android.os.RemoteException;
    public void deleteStorage(int p0) throws android.os.RemoteException;
    public void disableReadLogs(int p0) throws android.os.RemoteException;
    public boolean configureNativeBinaries(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException;
    public boolean waitForNativeBinariesExtraction(int p0) throws android.os.RemoteException;

    public static class Default implements android.os.incremental.IIncrementalService {
        public Default() {}
        public int openStorage(java.lang.String p0) throws android.os.RemoteException { return 0; }
        public int createStorage(java.lang.String p0, android.content.pm.DataLoaderParamsParcel p1, int p2, android.content.pm.IDataLoaderStatusListener p3, android.os.incremental.StorageHealthCheckParams p4, android.os.incremental.IStorageHealthListener p5) throws android.os.RemoteException { return 0; }
        public int createLinkedStorage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
        public int makeBindMount(int p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
        public int deleteBindMount(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int makeDirectory(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int makeDirectories(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public int makeFile(int p0, java.lang.String p1, android.os.incremental.IncrementalNewFileParams p2) throws android.os.RemoteException { return 0; }
        public int makeFileFromRange(int p0, java.lang.String p1, java.lang.String p2, long p3, long p4) throws android.os.RemoteException { return 0; }
        public int makeLink(int p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
        public int unlink(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
        public boolean isFileRangeLoaded(int p0, java.lang.String p1, long p2, long p3) throws android.os.RemoteException { return false; }
        public byte[] getMetadataByPath(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public byte[] getMetadataById(int p0, byte[] p1) throws android.os.RemoteException { return null; }
        public boolean startLoading(int p0) throws android.os.RemoteException { return false; }
        public void deleteStorage(int p0) throws android.os.RemoteException {}
        public void disableReadLogs(int p0) throws android.os.RemoteException {}
        public boolean configureNativeBinaries(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException { return false; }
        public boolean waitForNativeBinariesExtraction(int p0) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.incremental.IIncrementalService {
        private static final java.lang.String DESCRIPTOR = "android.os.incremental.IIncrementalService";
        static final int TRANSACTION_openStorage = 1;
        static final int TRANSACTION_createStorage = 2;
        static final int TRANSACTION_createLinkedStorage = 3;
        static final int TRANSACTION_makeBindMount = 4;
        static final int TRANSACTION_deleteBindMount = 5;
        static final int TRANSACTION_makeDirectory = 6;
        static final int TRANSACTION_makeDirectories = 7;
        static final int TRANSACTION_makeFile = 8;
        static final int TRANSACTION_makeFileFromRange = 9;
        static final int TRANSACTION_makeLink = 10;
        static final int TRANSACTION_unlink = 11;
        static final int TRANSACTION_isFileRangeLoaded = 12;
        static final int TRANSACTION_getMetadataByPath = 13;
        static final int TRANSACTION_getMetadataById = 14;
        static final int TRANSACTION_startLoading = 15;
        static final int TRANSACTION_deleteStorage = 16;
        static final int TRANSACTION_disableReadLogs = 17;
        static final int TRANSACTION_configureNativeBinaries = 18;
        static final int TRANSACTION_waitForNativeBinariesExtraction = 19;
        public Stub() { super(); }
        public static android.os.incremental.IIncrementalService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.os.incremental.IIncrementalService p0) { return false; }
        public static android.os.incremental.IIncrementalService getDefaultImpl() { return null; }

        private static class Proxy implements android.os.incremental.IIncrementalService {
            private android.os.IBinder mRemote;
            public static android.os.incremental.IIncrementalService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int openStorage(java.lang.String p0) throws android.os.RemoteException { return 0; }
            public int createStorage(java.lang.String p0, android.content.pm.DataLoaderParamsParcel p1, int p2, android.content.pm.IDataLoaderStatusListener p3, android.os.incremental.StorageHealthCheckParams p4, android.os.incremental.IStorageHealthListener p5) throws android.os.RemoteException { return 0; }
            public int createLinkedStorage(java.lang.String p0, int p1, int p2) throws android.os.RemoteException { return 0; }
            public int makeBindMount(int p0, java.lang.String p1, java.lang.String p2, int p3) throws android.os.RemoteException { return 0; }
            public int deleteBindMount(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int makeDirectory(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int makeDirectories(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public int makeFile(int p0, java.lang.String p1, android.os.incremental.IncrementalNewFileParams p2) throws android.os.RemoteException { return 0; }
            public int makeFileFromRange(int p0, java.lang.String p1, java.lang.String p2, long p3, long p4) throws android.os.RemoteException { return 0; }
            public int makeLink(int p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException { return 0; }
            public int unlink(int p0, java.lang.String p1) throws android.os.RemoteException { return 0; }
            public boolean isFileRangeLoaded(int p0, java.lang.String p1, long p2, long p3) throws android.os.RemoteException { return false; }
            public byte[] getMetadataByPath(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public byte[] getMetadataById(int p0, byte[] p1) throws android.os.RemoteException { return null; }
            public boolean startLoading(int p0) throws android.os.RemoteException { return false; }
            public void deleteStorage(int p0) throws android.os.RemoteException {}
            public void disableReadLogs(int p0) throws android.os.RemoteException {}
            public boolean configureNativeBinaries(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, boolean p4) throws android.os.RemoteException { return false; }
            public boolean waitForNativeBinariesExtraction(int p0) throws android.os.RemoteException { return false; }
        }
    }
}
