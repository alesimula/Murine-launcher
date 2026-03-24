package android.net;

public interface INetworkStatsSession extends android.os.IInterface {
    public android.net.NetworkStats getDeviceSummaryForNetwork(android.net.NetworkTemplate p0, long p1, long p2) throws android.os.RemoteException;
    public android.net.NetworkStats getSummaryForNetwork(android.net.NetworkTemplate p0, long p1, long p2) throws android.os.RemoteException;
    public android.net.NetworkStatsHistory getHistoryForNetwork(android.net.NetworkTemplate p0, int p1) throws android.os.RemoteException;
    public android.net.NetworkStats getSummaryForAllUid(android.net.NetworkTemplate p0, long p1, long p2, boolean p3) throws android.os.RemoteException;
    public android.net.NetworkStatsHistory getHistoryForUid(android.net.NetworkTemplate p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException;
    public android.net.NetworkStatsHistory getHistoryIntervalForUid(android.net.NetworkTemplate p0, int p1, int p2, int p3, int p4, long p5, long p6) throws android.os.RemoteException;
    public int[] getRelevantUids() throws android.os.RemoteException;
    public void close() throws android.os.RemoteException;

    public static class Default implements android.net.INetworkStatsSession {
        public Default() {}
        public android.net.NetworkStats getDeviceSummaryForNetwork(android.net.NetworkTemplate p0, long p1, long p2) throws android.os.RemoteException { return null; }
        public android.net.NetworkStats getSummaryForNetwork(android.net.NetworkTemplate p0, long p1, long p2) throws android.os.RemoteException { return null; }
        public android.net.NetworkStatsHistory getHistoryForNetwork(android.net.NetworkTemplate p0, int p1) throws android.os.RemoteException { return null; }
        public android.net.NetworkStats getSummaryForAllUid(android.net.NetworkTemplate p0, long p1, long p2, boolean p3) throws android.os.RemoteException { return null; }
        public android.net.NetworkStatsHistory getHistoryForUid(android.net.NetworkTemplate p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException { return null; }
        public android.net.NetworkStatsHistory getHistoryIntervalForUid(android.net.NetworkTemplate p0, int p1, int p2, int p3, int p4, long p5, long p6) throws android.os.RemoteException { return null; }
        public int[] getRelevantUids() throws android.os.RemoteException { return null; }
        public void close() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.INetworkStatsSession {
        private static final java.lang.String DESCRIPTOR = "android.net.INetworkStatsSession";
        static final int TRANSACTION_getDeviceSummaryForNetwork = 1;
        static final int TRANSACTION_getSummaryForNetwork = 2;
        static final int TRANSACTION_getHistoryForNetwork = 3;
        static final int TRANSACTION_getSummaryForAllUid = 4;
        static final int TRANSACTION_getHistoryForUid = 5;
        static final int TRANSACTION_getHistoryIntervalForUid = 6;
        static final int TRANSACTION_getRelevantUids = 7;
        static final int TRANSACTION_close = 8;
        public Stub() { super(); }
        public static android.net.INetworkStatsSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.INetworkStatsSession p0) { return false; }
        public static android.net.INetworkStatsSession getDefaultImpl() { return null; }

        private static class Proxy implements android.net.INetworkStatsSession {
            private android.os.IBinder mRemote;
            public static android.net.INetworkStatsSession sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.net.NetworkStats getDeviceSummaryForNetwork(android.net.NetworkTemplate p0, long p1, long p2) throws android.os.RemoteException { return null; }
            public android.net.NetworkStats getSummaryForNetwork(android.net.NetworkTemplate p0, long p1, long p2) throws android.os.RemoteException { return null; }
            public android.net.NetworkStatsHistory getHistoryForNetwork(android.net.NetworkTemplate p0, int p1) throws android.os.RemoteException { return null; }
            public android.net.NetworkStats getSummaryForAllUid(android.net.NetworkTemplate p0, long p1, long p2, boolean p3) throws android.os.RemoteException { return null; }
            public android.net.NetworkStatsHistory getHistoryForUid(android.net.NetworkTemplate p0, int p1, int p2, int p3, int p4) throws android.os.RemoteException { return null; }
            public android.net.NetworkStatsHistory getHistoryIntervalForUid(android.net.NetworkTemplate p0, int p1, int p2, int p3, int p4, long p5, long p6) throws android.os.RemoteException { return null; }
            public int[] getRelevantUids() throws android.os.RemoteException { return null; }
            public void close() throws android.os.RemoteException {}
        }
    }
}
