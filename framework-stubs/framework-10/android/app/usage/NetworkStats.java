package android.app.usage;

public final class NetworkStats implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "NetworkStats";
    private final long mStartTimeStamp = 0L;
    private final long mEndTimeStamp = 0L;
    private int[] mUids;
    private int mUidOrUidIndex;
    private int mTag;
    private int mState;
    private android.net.INetworkStatsSession mSession;
    private android.net.NetworkTemplate mTemplate;
    private android.net.NetworkStats mSummary;
    private android.net.NetworkStatsHistory mHistory;
    private int mEnumerationIndex;
    private android.net.NetworkStats.Entry mRecycledSummaryEntry;
    private android.net.NetworkStatsHistory.Entry mRecycledHistoryEntry;
    NetworkStats(android.content.Context p0, android.net.NetworkTemplate p1, int p2, long p3, long p4, android.net.INetworkStatsService p5) throws android.os.RemoteException, java.lang.SecurityException {}
    protected void finalize() throws java.lang.Throwable {}
    public boolean getNextBucket(android.app.usage.NetworkStats.Bucket p0) { return false; }
    public boolean hasNextBucket() { return false; }
    public void close() {}
    android.app.usage.NetworkStats.Bucket getDeviceSummaryForNetwork() throws android.os.RemoteException { return null; }
    void startSummaryEnumeration() throws android.os.RemoteException {}
    void startHistoryEnumeration(int p0, int p1, int p2) {}
    void startUserUidEnumeration() throws android.os.RemoteException {}
    private void stepHistory() {}
    private void fillBucketFromSummaryEntry(android.app.usage.NetworkStats.Bucket p0) {}
    private boolean getNextSummaryBucket(android.app.usage.NetworkStats.Bucket p0) { return false; }
    android.app.usage.NetworkStats.Bucket getSummaryAggregate() { return null; }
    private boolean getNextHistoryBucket(android.app.usage.NetworkStats.Bucket p0) { return false; }
    private boolean isUidEnumeration() { return false; }
    private boolean hasNextUid() { return false; }
    private int getUid() { return 0; }
    private void setSingleUidTagState(int p0, int p1, int p2) {}
    private void stepUid() {}

    public static class Bucket {
        public static final int STATE_ALL = -1;
        public static final int STATE_DEFAULT = 1;
        public static final int STATE_FOREGROUND = 2;
        public static final int UID_ALL = -1;
        public static final int UID_REMOVED = -4;
        public static final int UID_TETHERING = -5;
        public static final int METERED_ALL = -1;
        public static final int METERED_NO = 1;
        public static final int METERED_YES = 2;
        public static final int ROAMING_ALL = -1;
        public static final int ROAMING_NO = 1;
        public static final int ROAMING_YES = 2;
        public static final int DEFAULT_NETWORK_ALL = -1;
        public static final int DEFAULT_NETWORK_NO = 1;
        public static final int DEFAULT_NETWORK_YES = 2;
        public static final int TAG_NONE = 0;
        private int mUid;
        private int mTag;
        private int mState;
        private int mDefaultNetworkStatus;
        private int mMetered;
        private int mRoaming;
        private long mBeginTimeStamp;
        private long mEndTimeStamp;
        private long mRxBytes;
        private long mRxPackets;
        private long mTxBytes;
        private long mTxPackets;
        private static int convertSet(int p0) { return 0; }
        private static int convertState(int p0) { return 0; }
        private static int convertUid(int p0) { return 0; }
        private static int convertTag(int p0) { return 0; }
        private static int convertMetered(int p0) { return 0; }
        private static int convertRoaming(int p0) { return 0; }
        private static int convertDefaultNetworkStatus(int p0) { return 0; }
        public Bucket() {}
        public int getUid() { return 0; }
        public int getTag() { return 0; }
        public int getState() { return 0; }
        public int getMetered() { return 0; }
        public int getRoaming() { return 0; }
        public int getDefaultNetworkStatus() { return 0; }
        public long getStartTimeStamp() { return 0L; }
        public long getEndTimeStamp() { return 0L; }
        public long getRxBytes() { return 0L; }
        public long getTxBytes() { return 0L; }
        public long getRxPackets() { return 0L; }
        public long getTxPackets() { return 0L; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface State {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Roaming {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Metered {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface DefaultNetworkStatus {
        }
    }
}
