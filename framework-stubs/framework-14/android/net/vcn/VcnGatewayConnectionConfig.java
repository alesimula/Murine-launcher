package android.net.vcn;

public final class VcnGatewayConnectionConfig {
    public static final int MIN_UDP_PORT_4500_NAT_TIMEOUT_UNSET = -1;
    public static final int MIN_UDP_PORT_4500_NAT_TIMEOUT_SECONDS = 120;
    static final int MIN_MTU_V6 = 1280;
    public static final java.util.Set<java.lang.Integer> ALLOWED_CAPABILITIES = null;
    public static final int VCN_GATEWAY_OPTION_ENABLE_DATA_STALL_RECOVERY_WITH_MOBILITY = 0;
    public static final java.util.List<android.net.vcn.VcnUnderlyingNetworkTemplate> DEFAULT_UNDERLYING_NETWORK_TEMPLATES = null;
    public static final java.lang.String UNDERLYING_NETWORK_TEMPLATES_KEY = "mUnderlyingNetworkTemplates";
    public VcnGatewayConnectionConfig(android.os.PersistableBundle p0) {}
    public java.lang.String getGatewayConnectionName() { return null; }
    public android.net.ipsec.ike.IkeTunnelConnectionParams getTunnelConnectionParams() { return null; }
    public int[] getExposedCapabilities() { return null; }
    @java.lang.Deprecated
    public java.util.Set<java.lang.Integer> getAllExposedCapabilities() { return null; }
    public java.util.List<android.net.vcn.VcnUnderlyingNetworkTemplate> getVcnUnderlyingNetworkPriorities() { return null; }
    public long[] getRetryIntervalsMillis() { return null; }
    public int getMaxMtu() { return 0; }
    public int getMinUdpPort4500NatTimeoutSeconds() { return 0; }
    public boolean hasGatewayOption(int p0) { return false; }
    public android.os.PersistableBundle toPersistableBundle() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }

    public static final class Builder {
        public Builder(java.lang.String p0, android.net.ipsec.ike.IkeTunnelConnectionParams p1) {}
        public android.net.vcn.VcnGatewayConnectionConfig.Builder addExposedCapability(int p0) { return null; }
        @android.annotation.SuppressLint("BuilderSetStyle")
        public android.net.vcn.VcnGatewayConnectionConfig.Builder removeExposedCapability(int p0) { return null; }
        public android.net.vcn.VcnGatewayConnectionConfig.Builder setVcnUnderlyingNetworkPriorities(java.util.List<android.net.vcn.VcnUnderlyingNetworkTemplate> p0) { return null; }
        public android.net.vcn.VcnGatewayConnectionConfig.Builder setRetryIntervalsMillis(long[] p0) { return null; }
        public android.net.vcn.VcnGatewayConnectionConfig.Builder setMaxMtu(int p0) { return null; }
        public android.net.vcn.VcnGatewayConnectionConfig.Builder setMinUdpPort4500NatTimeoutSeconds(int p0) { return null; }
        public android.net.vcn.VcnGatewayConnectionConfig.Builder addGatewayOption(int p0) { return null; }
        public android.net.vcn.VcnGatewayConnectionConfig.Builder removeGatewayOption(int p0) { return null; }
        public android.net.vcn.VcnGatewayConnectionConfig build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VcnGatewayOption {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VcnSupportedCapability {
    }
}
