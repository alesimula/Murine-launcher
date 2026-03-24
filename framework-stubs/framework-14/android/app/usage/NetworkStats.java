package android.app.usage;

public final class NetworkStats implements java.lang.AutoCloseable {
    NetworkStats() {}
    protected void finalize() throws java.lang.Throwable {}
    public boolean getNextBucket(android.app.usage.NetworkStats.Bucket p0) { return false; }
    public boolean hasNextBucket() { return false; }
    public void close() {}

    public static class Bucket {
        public static final int DEFAULT_NETWORK_ALL = -1;
        public static final int DEFAULT_NETWORK_NO = 1;
        public static final int DEFAULT_NETWORK_YES = 2;
        public static final int METERED_ALL = -1;
        public static final int METERED_NO = 1;
        public static final int METERED_YES = 2;
        public static final int ROAMING_ALL = -1;
        public static final int ROAMING_NO = 1;
        public static final int ROAMING_YES = 2;
        public static final int STATE_ALL = -1;
        public static final int STATE_DEFAULT = 1;
        public static final int STATE_FOREGROUND = 2;
        public static final int TAG_NONE = 0;
        public static final int UID_ALL = -1;
        public static final int UID_REMOVED = -4;
        public static final int UID_TETHERING = -5;
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
    }
}
