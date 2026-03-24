package android.net.ipsec.ike;

public final class TunnelModeChildSessionParams extends android.net.ipsec.ike.ChildSessionParams {
    private TunnelModeChildSessionParams() { super(); }
    @android.annotation.NonNull
    public java.util.List<android.net.ipsec.ike.TunnelModeChildSessionParams.TunnelModeChildConfigRequest> getConfigurationRequests() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.net.ipsec.ike.TunnelModeChildSessionParams p0) {}
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.net.ipsec.ike.TunnelModeChildSessionParams.Builder addSaProposal(android.net.ipsec.ike.ChildSaProposal p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.TunnelModeChildSessionParams.Builder addChildSaProposal(android.net.ipsec.ike.ChildSaProposal p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.TunnelModeChildSessionParams.Builder addInboundTrafficSelectors(android.net.ipsec.ike.IkeTrafficSelector p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.TunnelModeChildSessionParams.Builder addOutboundTrafficSelectors(android.net.ipsec.ike.IkeTrafficSelector p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.TunnelModeChildSessionParams.Builder setLifetimeSeconds(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.TunnelModeChildSessionParams.Builder addInternalAddressRequest(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.TunnelModeChildSessionParams.Builder addInternalAddressRequest(java.net.Inet4Address p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.TunnelModeChildSessionParams.Builder addInternalAddressRequest(java.net.Inet6Address p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.TunnelModeChildSessionParams.Builder addInternalDnsServerRequest(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.TunnelModeChildSessionParams.Builder addInternalDhcpServerRequest(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.TunnelModeChildSessionParams build() { return null; }
    }

    public static interface ConfigRequestIpv4Address extends android.net.ipsec.ike.TunnelModeChildSessionParams.TunnelModeChildConfigRequest {
        @android.annotation.Nullable
        public java.net.Inet4Address getAddress();
    }

    public static interface ConfigRequestIpv4DhcpServer extends android.net.ipsec.ike.TunnelModeChildSessionParams.TunnelModeChildConfigRequest {
    }

    public static interface ConfigRequestIpv4DnsServer extends android.net.ipsec.ike.TunnelModeChildSessionParams.TunnelModeChildConfigRequest {
    }

    public static interface ConfigRequestIpv4Netmask extends android.net.ipsec.ike.TunnelModeChildSessionParams.TunnelModeChildConfigRequest {
    }

    public static interface ConfigRequestIpv6Address extends android.net.ipsec.ike.TunnelModeChildSessionParams.TunnelModeChildConfigRequest {
        @android.annotation.Nullable
        public java.net.Inet6Address getAddress();
        public int getPrefixLength();
    }

    public static interface ConfigRequestIpv6DnsServer extends android.net.ipsec.ike.TunnelModeChildSessionParams.TunnelModeChildConfigRequest {
    }

    public static interface TunnelModeChildConfigRequest {
    }
}
