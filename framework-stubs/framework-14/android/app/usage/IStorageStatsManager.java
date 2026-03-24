package android.app.usage;

public interface IStorageStatsManager extends android.os.IInterface {
    public boolean isQuotaSupported(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isReservedSupported(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public long getTotalBytes(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public long getFreeBytes(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public long getCacheBytes(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException;
    public long getCacheQuotaBytes(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.app.usage.StorageStats queryStatsForPackage(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public android.app.usage.StorageStats queryStatsForUid(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.app.usage.StorageStats queryStatsForUser(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.app.usage.ExternalStorageStats queryExternalStatsForUser(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryCratesForPackage(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryCratesForUid(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice queryCratesForUser(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;

    public static class Default implements android.app.usage.IStorageStatsManager {
        public Default() {}
        public boolean isQuotaSupported(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public boolean isReservedSupported(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
        public long getTotalBytes(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
        public long getFreeBytes(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
        public long getCacheBytes(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
        public long getCacheQuotaBytes(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0L; }
        public android.app.usage.StorageStats queryStatsForPackage(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public android.app.usage.StorageStats queryStatsForUid(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.app.usage.StorageStats queryStatsForUser(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.app.usage.ExternalStorageStats queryExternalStatsForUser(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryCratesForPackage(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryCratesForUid(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice queryCratesForUser(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.usage.IStorageStatsManager {
        public static final java.lang.String DESCRIPTOR = "android.app.usage.IStorageStatsManager";
        static final int TRANSACTION_isQuotaSupported = 1;
        static final int TRANSACTION_isReservedSupported = 2;
        static final int TRANSACTION_getTotalBytes = 3;
        static final int TRANSACTION_getFreeBytes = 4;
        static final int TRANSACTION_getCacheBytes = 5;
        static final int TRANSACTION_getCacheQuotaBytes = 6;
        static final int TRANSACTION_queryStatsForPackage = 7;
        static final int TRANSACTION_queryStatsForUid = 8;
        static final int TRANSACTION_queryStatsForUser = 9;
        static final int TRANSACTION_queryExternalStatsForUser = 10;
        static final int TRANSACTION_queryCratesForPackage = 11;
        static final int TRANSACTION_queryCratesForUid = 12;
        static final int TRANSACTION_queryCratesForUser = 13;
        public Stub() { super(); }
        public static android.app.usage.IStorageStatsManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.usage.IStorageStatsManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public boolean isQuotaSupported(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public boolean isReservedSupported(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return false; }
            public long getTotalBytes(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
            public long getFreeBytes(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
            public long getCacheBytes(java.lang.String p0, java.lang.String p1) throws android.os.RemoteException { return 0L; }
            public long getCacheQuotaBytes(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0L; }
            public android.app.usage.StorageStats queryStatsForPackage(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public android.app.usage.StorageStats queryStatsForUid(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.app.usage.StorageStats queryStatsForUser(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.app.usage.ExternalStorageStats queryExternalStatsForUser(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryCratesForPackage(java.lang.String p0, java.lang.String p1, int p2, java.lang.String p3) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryCratesForUid(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice queryCratesForUser(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        }
    }
}
