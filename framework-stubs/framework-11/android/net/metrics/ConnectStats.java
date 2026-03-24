package android.net.metrics;

public class ConnectStats {
    private static final int EALREADY = Integer.valueOf(0);
    private static final int EINPROGRESS = Integer.valueOf(0);
    public final int netId = 0;
    public final long transports = 0L;
    public final android.util.SparseIntArray errnos = null;
    public final android.util.IntArray latencies = null;
    public final com.android.internal.util.TokenBucket mLatencyTb = null;
    public final int mMaxLatencyRecords = 0;
    public int eventCount;
    public int connectCount;
    public int connectBlockingCount;
    public int ipv6ConnectCount;
    public ConnectStats(int p0, long p1, com.android.internal.util.TokenBucket p2, int p3) {}
    boolean addEvent(int p0, int p1, java.lang.String p2) { return false; }
    private void countConnect(int p0, java.lang.String p1) {}
    private void countLatency(int p0, int p1) {}
    private void countError(int p0) {}
    private static boolean isSuccess(int p0) { return false; }
    static boolean isNonBlocking(int p0) { return false; }
    private static boolean isIPv6(java.lang.String p0) { return false; }
    public java.lang.String toString() { return null; }
}
