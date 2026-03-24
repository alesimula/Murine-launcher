package android.net;

@android.annotation.SystemApi
public final class NetworkStats implements android.os.Parcelable {
    private static final java.lang.String TAG = "NetworkStats";
    public static final java.lang.String IFACE_ALL = null;
    public static final java.lang.String IFACE_VT = "vt_data0";
    public static final int UID_ALL = -1;
    public static final int UID_TETHERING = -5;
    public static final int TAG_ALL = -1;
    public static final int SET_ALL = -1;
    public static final int SET_DEFAULT = 0;
    public static final int SET_FOREGROUND = 1;
    public static final int SET_DEBUG_START = 1000;
    public static final int SET_DBG_VPN_IN = 1001;
    public static final int SET_DBG_VPN_OUT = 1002;
    public static final java.lang.String[] INTERFACES_ALL = null;
    public static final int TAG_NONE = 0;
    public static final int METERED_ALL = -1;
    public static final int METERED_NO = 0;
    public static final int METERED_YES = 1;
    public static final int ROAMING_ALL = -1;
    public static final int ROAMING_NO = 0;
    public static final int ROAMING_YES = 1;
    public static final int DEFAULT_NETWORK_ALL = -1;
    public static final int DEFAULT_NETWORK_NO = 0;
    public static final int DEFAULT_NETWORK_YES = 1;
    public static final int STATS_PER_IFACE = 0;
    public static final int STATS_PER_UID = 1;
    private static final java.lang.String CLATD_INTERFACE_PREFIX = "v4-";
    private static final int IPV4V6_HEADER_DELTA = 20;
    private long elapsedRealtime;
    private int size;
    private int capacity;
    private java.lang.String[] iface;
    private int[] uid;
    private int[] set;
    private int[] tag;
    private int[] metered;
    private int[] roaming;
    private int[] defaultNetwork;
    private long[] rxBytes;
    private long[] rxPackets;
    private long[] txBytes;
    private long[] txPackets;
    private long[] operations;
    public static final android.os.Parcelable.Creator<android.net.NetworkStats> CREATOR = null;
    public NetworkStats(long p0, int p1) {}
    public NetworkStats(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public android.net.NetworkStats clone() { return null; }
    public void clear() {}
    public android.net.NetworkStats insertEntry(java.lang.String p0, long p1, long p2, long p3, long p4) { return null; }
    public android.net.NetworkStats insertEntry(java.lang.String p0, int p1, int p2, int p3, long p4, long p5, long p6, long p7, long p8) { return null; }
    public android.net.NetworkStats insertEntry(java.lang.String p0, int p1, int p2, int p3, int p4, int p5, int p6, long p7, long p8, long p9, long p10, long p11) { return null; }
    public android.net.NetworkStats insertEntry(android.net.NetworkStats.Entry p0) { return null; }
    private void setValues(int p0, android.net.NetworkStats.Entry p1) {}
    public android.net.NetworkStats.Entry getValues(int p0, android.net.NetworkStats.Entry p1) { return null; }
    private void maybeCopyEntry(int p0, int p1) {}
    public long getElapsedRealtime() { return 0L; }
    public void setElapsedRealtime(long p0) {}
    public long getElapsedRealtimeAge() { return 0L; }
    public int size() { return 0; }
    public int internalSize() { return 0; }
    @java.lang.Deprecated
    public android.net.NetworkStats combineValues(java.lang.String p0, int p1, int p2, long p3, long p4, long p5, long p6, long p7) { return null; }
    public android.net.NetworkStats combineValues(java.lang.String p0, int p1, int p2, int p3, long p4, long p5, long p6, long p7, long p8) { return null; }
    public android.net.NetworkStats combineValues(android.net.NetworkStats.Entry p0) { return null; }
    public android.net.NetworkStats addEntry(android.net.NetworkStats.Entry p0) { return null; }
    public android.net.NetworkStats add(android.net.NetworkStats p0) { return null; }
    public void combineAllValues(android.net.NetworkStats p0) {}
    public int findIndex(java.lang.String p0, int p1, int p2, int p3, int p4, int p5, int p6) { return 0; }
    public int findIndexHinted(java.lang.String p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) { return 0; }
    public void spliceOperationsFrom(android.net.NetworkStats p0) {}
    public java.lang.String[] getUniqueIfaces() { return null; }
    public int[] getUniqueUids() { return null; }
    public long getTotalBytes() { return 0L; }
    public android.net.NetworkStats.Entry getTotal(android.net.NetworkStats.Entry p0) { return null; }
    public android.net.NetworkStats.Entry getTotal(android.net.NetworkStats.Entry p0, int p1) { return null; }
    public android.net.NetworkStats.Entry getTotal(android.net.NetworkStats.Entry p0, java.util.HashSet<java.lang.String> p1) { return null; }
    public android.net.NetworkStats.Entry getTotalIncludingTags(android.net.NetworkStats.Entry p0) { return null; }
    private android.net.NetworkStats.Entry getTotal(android.net.NetworkStats.Entry p0, java.util.HashSet<java.lang.String> p1, int p2, boolean p3) { return null; }
    public long getTotalPackets() { return 0L; }
    public android.net.NetworkStats subtract(android.net.NetworkStats p0) { return null; }
    public static <C extends java.lang.Object> android.net.NetworkStats subtract(android.net.NetworkStats p0, android.net.NetworkStats p1, android.net.NetworkStats.NonMonotonicObserver<C> p2, C p3) { return null; }
    public static <C extends java.lang.Object> android.net.NetworkStats subtract(android.net.NetworkStats p0, android.net.NetworkStats p1, android.net.NetworkStats.NonMonotonicObserver<C> p2, C p3, android.net.NetworkStats p4) { return null; }
    public static void apply464xlatAdjustments(android.net.NetworkStats p0, android.net.NetworkStats p1, java.util.Map<java.lang.String, java.lang.String> p2) {}
    public void apply464xlatAdjustments(java.util.Map<java.lang.String, java.lang.String> p0) {}
    public android.net.NetworkStats groupedByIface() { return null; }
    public android.net.NetworkStats groupedByUid() { return null; }
    public void removeUids(int[] p0) {}
    public android.net.NetworkStats removeEmptyEntries() { return null; }
    public void filter(int p0, java.lang.String[] p1, int p2) {}
    public void filterDebugEntries() {}
    private void filter(java.util.function.Predicate<android.net.NetworkStats.Entry> p0) {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public static java.lang.String setToString(int p0) { return null; }
    public static java.lang.String setToCheckinString(int p0) { return null; }
    public static boolean setMatches(int p0, int p1) { return false; }
    public static java.lang.String tagToString(int p0) { return null; }
    public static java.lang.String meteredToString(int p0) { return null; }
    public static java.lang.String roamingToString(int p0) { return null; }
    public static java.lang.String defaultNetworkToString(int p0) { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void migrateTun(int p0, java.lang.String p1, java.lang.String[] p2) {}
    private void tunAdjustmentInit(int p0, java.lang.String p1, java.lang.String[] p2, android.net.NetworkStats.Entry p3, android.net.NetworkStats.Entry[] p4, android.net.NetworkStats.Entry p5) {}
    private android.net.NetworkStats.Entry[] addTrafficToApplications(int p0, java.lang.String p1, java.lang.String[] p2, android.net.NetworkStats.Entry p3, android.net.NetworkStats.Entry[] p4, android.net.NetworkStats.Entry p5) { return null; }
    private void deductTrafficFromVpnApp(int p0, java.lang.String[] p1, android.net.NetworkStats.Entry[] p2) {}
    private static void tunSubtract(int p0, android.net.NetworkStats p1, android.net.NetworkStats.Entry p2) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DefaultNetwork {
    }

    @android.annotation.SystemApi
    public static class Entry {
        public java.lang.String iface;
        public int uid;
        public int set;
        public int tag;
        public int metered;
        public int roaming;
        public int defaultNetwork;
        public long rxBytes;
        public long rxPackets;
        public long txBytes;
        public long txPackets;
        public long operations;
        public Entry() {}
        public Entry(long p0, long p1, long p2, long p3, long p4) {}
        public Entry(java.lang.String p0, int p1, int p2, int p3, long p4, long p5, long p6, long p7, long p8) {}
        public Entry(java.lang.String p0, int p1, int p2, int p3, int p4, int p5, int p6, long p7, long p8, long p9, long p10, long p11) {}
        public boolean isNegative() { return false; }
        public boolean isEmpty() { return false; }
        public void add(android.net.NetworkStats.Entry p0) {}
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Meteredness {
    }

    public static interface NonMonotonicObserver<C extends java.lang.Object> {
        public void foundNonMonotonic(android.net.NetworkStats p0, int p1, android.net.NetworkStats p2, int p3, C p4);
        public void foundNonMonotonic(android.net.NetworkStats p0, int p1, C p2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Roaming {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StatsType {
    }
}
