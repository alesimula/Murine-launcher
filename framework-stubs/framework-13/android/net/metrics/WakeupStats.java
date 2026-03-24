package android.net.metrics;

public class WakeupStats {
    public final long creationTimeMs = 0L;
    public final java.lang.String iface = null;
    public long totalWakeups;
    public long rootWakeups;
    public long systemWakeups;
    public long nonApplicationWakeups;
    public long applicationWakeups;
    public long noUidWakeups;
    public long durationSec;
    public long l2UnicastCount;
    public long l2MulticastCount;
    public long l2BroadcastCount;
    public final android.util.SparseIntArray ethertypes = null;
    public final android.util.SparseIntArray ipNextHeaders = null;
    public WakeupStats(java.lang.String p0) {}
    public void updateDuration() {}
    public void countEvent(android.net.metrics.WakeupEvent p0) {}
    public java.lang.String toString() { return null; }
}
