package android.net;

public interface INetworkStatsService extends android.os.IInterface {
    @android.annotation.UnsupportedAppUsage
    public android.net.INetworkStatsSession openSession() throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.net.INetworkStatsSession openSessionForUsageStats(int p0, java.lang.String p1) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public android.net.NetworkStats getDataLayerSnapshotForUid(int p0) throws android.os.RemoteException;
    public android.net.NetworkStats getDetailedUidStats(java.lang.String[] p0) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String[] getMobileIfaces() throws android.os.RemoteException;
    public void incrementOperationCount(int p0, int p1, int p2) throws android.os.RemoteException;
    public void forceUpdateIfaces(android.net.Network[] p0, android.net.NetworkState[] p1, java.lang.String p2) throws android.os.RemoteException;
    @android.annotation.UnsupportedAppUsage
    public void forceUpdate() throws android.os.RemoteException;
    public android.net.DataUsageRequest registerUsageCallback(java.lang.String p0, android.net.DataUsageRequest p1, android.os.Messenger p2, android.os.IBinder p3) throws android.os.RemoteException;
    public void unregisterUsageRequest(android.net.DataUsageRequest p0) throws android.os.RemoteException;
    public long getUidStats(int p0, int p1) throws android.os.RemoteException;
    public long getIfaceStats(java.lang.String p0, int p1) throws android.os.RemoteException;
    public long getTotalStats(int p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.net.INetworkStatsService {
        private static final java.lang.String DESCRIPTOR = "android.net.INetworkStatsService";
        static final int TRANSACTION_openSession = 1;
        static final int TRANSACTION_openSessionForUsageStats = 2;
        static final int TRANSACTION_getDataLayerSnapshotForUid = 3;
        static final int TRANSACTION_getDetailedUidStats = 4;
        static final int TRANSACTION_getMobileIfaces = 5;
        static final int TRANSACTION_incrementOperationCount = 6;
        static final int TRANSACTION_forceUpdateIfaces = 7;
        static final int TRANSACTION_forceUpdate = 8;
        static final int TRANSACTION_registerUsageCallback = 9;
        static final int TRANSACTION_unregisterUsageRequest = 10;
        static final int TRANSACTION_getUidStats = 11;
        static final int TRANSACTION_getIfaceStats = 12;
        static final int TRANSACTION_getTotalStats = 13;
        public Stub() { super(); }
        public static android.net.INetworkStatsService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.INetworkStatsService p0) { return false; }
        public static android.net.INetworkStatsService getDefaultImpl() { return null; }

        private static class Proxy implements android.net.INetworkStatsService {
            private android.os.IBinder mRemote;
            public static android.net.INetworkStatsService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.net.INetworkStatsSession openSession() throws android.os.RemoteException { return null; }
            public android.net.INetworkStatsSession openSessionForUsageStats(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
            public android.net.NetworkStats getDataLayerSnapshotForUid(int p0) throws android.os.RemoteException { return null; }
            public android.net.NetworkStats getDetailedUidStats(java.lang.String[] p0) throws android.os.RemoteException { return null; }
            public java.lang.String[] getMobileIfaces() throws android.os.RemoteException { return null; }
            public void incrementOperationCount(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void forceUpdateIfaces(android.net.Network[] p0, android.net.NetworkState[] p1, java.lang.String p2) throws android.os.RemoteException {}
            public void forceUpdate() throws android.os.RemoteException {}
            public android.net.DataUsageRequest registerUsageCallback(java.lang.String p0, android.net.DataUsageRequest p1, android.os.Messenger p2, android.os.IBinder p3) throws android.os.RemoteException { return null; }
            public void unregisterUsageRequest(android.net.DataUsageRequest p0) throws android.os.RemoteException {}
            public long getUidStats(int p0, int p1) throws android.os.RemoteException { return 0L; }
            public long getIfaceStats(java.lang.String p0, int p1) throws android.os.RemoteException { return 0L; }
            public long getTotalStats(int p0) throws android.os.RemoteException { return 0L; }
        }
    }

    public static class Default implements android.net.INetworkStatsService {
        public Default() {}
        public android.net.INetworkStatsSession openSession() throws android.os.RemoteException { return null; }
        public android.net.INetworkStatsSession openSessionForUsageStats(int p0, java.lang.String p1) throws android.os.RemoteException { return null; }
        public android.net.NetworkStats getDataLayerSnapshotForUid(int p0) throws android.os.RemoteException { return null; }
        public android.net.NetworkStats getDetailedUidStats(java.lang.String[] p0) throws android.os.RemoteException { return null; }
        public java.lang.String[] getMobileIfaces() throws android.os.RemoteException { return null; }
        public void incrementOperationCount(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void forceUpdateIfaces(android.net.Network[] p0, android.net.NetworkState[] p1, java.lang.String p2) throws android.os.RemoteException {}
        public void forceUpdate() throws android.os.RemoteException {}
        public android.net.DataUsageRequest registerUsageCallback(java.lang.String p0, android.net.DataUsageRequest p1, android.os.Messenger p2, android.os.IBinder p3) throws android.os.RemoteException { return null; }
        public void unregisterUsageRequest(android.net.DataUsageRequest p0) throws android.os.RemoteException {}
        public long getUidStats(int p0, int p1) throws android.os.RemoteException { return 0L; }
        public long getIfaceStats(java.lang.String p0, int p1) throws android.os.RemoteException { return 0L; }
        public long getTotalStats(int p0) throws android.os.RemoteException { return 0L; }
        public android.os.IBinder asBinder() { return null; }
    }
}
