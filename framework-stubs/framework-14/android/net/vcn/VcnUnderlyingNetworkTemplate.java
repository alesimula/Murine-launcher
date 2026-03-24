package android.net.vcn;

public abstract class VcnUnderlyingNetworkTemplate {
    static final int NETWORK_PRIORITY_TYPE_WIFI = 1;
    static final int NETWORK_PRIORITY_TYPE_CELL = 2;
    public static final int MATCH_ANY = 0;
    public static final int MATCH_REQUIRED = 1;
    public static final int MATCH_FORBIDDEN = 2;
    static final java.lang.String METERED_MATCH_KEY = "mMeteredMatchCriteria";
    static final int DEFAULT_METERED_MATCH_CRITERIA = 0;
    public static final int DEFAULT_MIN_BANDWIDTH_KBPS = 0;
    static final java.lang.String MIN_ENTRY_UPSTREAM_BANDWIDTH_KBPS_KEY = "mMinEntryUpstreamBandwidthKbps";
    static final java.lang.String MIN_EXIT_UPSTREAM_BANDWIDTH_KBPS_KEY = "mMinExitUpstreamBandwidthKbps";
    static final java.lang.String MIN_ENTRY_DOWNSTREAM_BANDWIDTH_KBPS_KEY = "mMinEntryDownstreamBandwidthKbps";
    static final java.lang.String MIN_EXIT_DOWNSTREAM_BANDWIDTH_KBPS_KEY = "mMinExitDownstreamBandwidthKbps";
    VcnUnderlyingNetworkTemplate(int p0, int p1, int p2, int p3, int p4, int p5) {}
    static void validateMatchCriteria(int p0, java.lang.String p1) {}
    static void validateMinBandwidthKbps(int p0, int p1) {}
    protected void validate() {}
    public static android.net.vcn.VcnUnderlyingNetworkTemplate fromPersistableBundle(android.os.PersistableBundle p0) { return null; }
    android.os.PersistableBundle toPersistableBundle() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    static java.lang.String getNameString(android.util.SparseArray<java.lang.String> p0, int p1) { return null; }
    static java.lang.String getMatchCriteriaString(int p0) { return null; }
    abstract void dumpTransportSpecificFields(com.android.internal.util.IndentingPrintWriter p0);
    public void dump(com.android.internal.util.IndentingPrintWriter p0) {}
    public int getMetered() { return 0; }
    public int getMinEntryUpstreamBandwidthKbps() { return 0; }
    public int getMinExitUpstreamBandwidthKbps() { return 0; }
    public int getMinEntryDownstreamBandwidthKbps() { return 0; }
    public int getMinExitDownstreamBandwidthKbps() { return 0; }
    public abstract java.util.Map<java.lang.Integer, java.lang.Integer> getCapabilitiesMatchCriteria();

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MatchCriteria {
    }
}
