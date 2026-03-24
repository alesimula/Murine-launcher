package android.net.vcn;

public final class VcnGatewayConnectionConfig {
    static final int MIN_MTU_V6 = 1280;
    public static final java.util.Set<java.lang.Integer> ALLOWED_CAPABILITIES = null;
    private static final int DEFAULT_MAX_MTU = 1500;
    private static final int MAX_RETRY_INTERVAL_COUNT = 10;
    private static final long MINIMUM_REPEATING_RETRY_INTERVAL_MS = Long.valueOf(0L);
    private static final long[] DEFAULT_RETRY_INTERVALS_MS = null;
    private static final java.lang.String GATEWAY_CONNECTION_NAME_KEY = "mGatewayConnectionName";
    private final java.lang.String mGatewayConnectionName = null;
    private static final java.lang.String TUNNEL_CONNECTION_PARAMS_KEY = "mTunnelConnectionParams";
    private android.net.ipsec.ike.IkeTunnelConnectionParams mTunnelConnectionParams;
    private static final java.lang.String EXPOSED_CAPABILITIES_KEY = "mExposedCapabilities";
    private final java.util.SortedSet<java.lang.Integer> mExposedCapabilities = null;
    private static final java.lang.String MAX_MTU_KEY = "mMaxMtu";
    private final int mMaxMtu = 0;
    private static final java.lang.String RETRY_INTERVAL_MS_KEY = "mRetryIntervalsMs";
    private final long[] mRetryIntervalsMs = null;
    private VcnGatewayConnectionConfig(java.lang.String p0, android.net.ipsec.ike.IkeTunnelConnectionParams p1, java.util.Set<java.lang.Integer> p2, long[] p3, int p4) {}
    public VcnGatewayConnectionConfig(android.os.PersistableBundle p0) {}
    private void validate() {}
    private static void checkValidCapability(int p0) {}
    private static void validateRetryInterval(long[] p0) {}
    public java.lang.String getGatewayConnectionName() { return null; }
    public android.net.ipsec.ike.IkeTunnelConnectionParams getTunnelConnectionParams() { return null; }
    public int[] getExposedCapabilities() { return null; }
    @java.lang.Deprecated
    public java.util.Set<java.lang.Integer> getAllExposedCapabilities() { return null; }
    public long[] getRetryIntervalsMillis() { return null; }
    public int getMaxMtu() { return 0; }
    public android.os.PersistableBundle toPersistableBundle() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }

    public static final class Builder {
        private final java.lang.String mGatewayConnectionName = null;
        private final android.net.ipsec.ike.IkeTunnelConnectionParams mTunnelConnectionParams = null;
        private final java.util.Set<java.lang.Integer> mExposedCapabilities = null;
        private long[] mRetryIntervalsMs;
        private int mMaxMtu;
        public Builder(java.lang.String p0, android.net.ipsec.ike.IkeTunnelConnectionParams p1) {}
        public android.net.vcn.VcnGatewayConnectionConfig.Builder addExposedCapability(int p0) { return null; }
        @android.annotation.SuppressLint("BuilderSetStyle")
        public android.net.vcn.VcnGatewayConnectionConfig.Builder removeExposedCapability(int p0) { return null; }
        public android.net.vcn.VcnGatewayConnectionConfig.Builder setRetryIntervalsMillis(long[] p0) { return null; }
        public android.net.vcn.VcnGatewayConnectionConfig.Builder setMaxMtu(int p0) { return null; }
        public android.net.vcn.VcnGatewayConnectionConfig build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VcnSupportedCapability {
    }
}
