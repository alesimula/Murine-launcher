package android.net.vcn;

public final class VcnGatewayConnectionConfig {
    @android.annotation.FlaggedApi("android.net.vcn.mainline_vcn_module_api")
    public static final int MIN_UDP_PORT_4500_NAT_TIMEOUT_UNSET = -1;
    public static final int VCN_GATEWAY_OPTION_ENABLE_DATA_STALL_RECOVERY_WITH_MOBILITY = 0;
    VcnGatewayConnectionConfig() {}
    @android.annotation.NonNull
    public int[] getExposedCapabilities() { return null; }
    @android.annotation.NonNull
    public java.lang.String getGatewayConnectionName() { return null; }
    public int getMaxMtu() { return 0; }
    public int getMinUdpPort4500NatTimeoutSeconds() { return 0; }
    @android.annotation.NonNull
    public long[] getRetryIntervalsMillis() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.vcn.VcnUnderlyingNetworkTemplate> getVcnUnderlyingNetworkPriorities() { return null; }
    public boolean hasGatewayOption(int p0) { return false; }
    @android.annotation.FlaggedApi("android.net.vcn.safe_mode_config")
    public boolean isSafeModeEnabled() { return false; }

    public static final class Builder {
        public Builder(java.lang.String p0, android.net.ipsec.ike.IkeTunnelConnectionParams p1) {}
        @android.annotation.NonNull
        public android.net.vcn.VcnGatewayConnectionConfig.Builder addExposedCapability(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnGatewayConnectionConfig.Builder addGatewayOption(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnGatewayConnectionConfig build() { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnGatewayConnectionConfig.Builder removeExposedCapability(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnGatewayConnectionConfig.Builder removeGatewayOption(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnGatewayConnectionConfig.Builder setMaxMtu(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnGatewayConnectionConfig.Builder setMinUdpPort4500NatTimeoutSeconds(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnGatewayConnectionConfig.Builder setRetryIntervalsMillis(long[] p0) { return null; }
        @android.annotation.FlaggedApi("android.net.vcn.safe_mode_config")
        @android.annotation.NonNull
        public android.net.vcn.VcnGatewayConnectionConfig.Builder setSafeModeEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.vcn.VcnGatewayConnectionConfig.Builder setVcnUnderlyingNetworkPriorities(java.util.List<android.net.vcn.VcnUnderlyingNetworkTemplate> p0) { return null; }
    }
}
