package android.net.ipsec.ike;

public final class ChildSessionConfiguration {
    ChildSessionConfiguration() {}
    @android.annotation.NonNull
    public java.util.List<android.net.ipsec.ike.IkeTrafficSelector> getInboundTrafficSelectors() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.ipsec.ike.IkeTrafficSelector> getOutboundTrafficSelectors() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.LinkAddress> getInternalAddresses() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.net.InetAddress> getInternalDhcpServers() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.net.InetAddress> getInternalDnsServers() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.IpPrefix> getInternalSubnets() { return null; }

    public static final class Builder {
        public Builder(java.util.List<android.net.ipsec.ike.IkeTrafficSelector> p0, java.util.List<android.net.ipsec.ike.IkeTrafficSelector> p1) {}
        @android.annotation.NonNull
        public android.net.ipsec.ike.ChildSessionConfiguration build() { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.ChildSessionConfiguration.Builder addInternalAddress(android.net.LinkAddress p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.ChildSessionConfiguration.Builder addInternalDhcpServer(java.net.InetAddress p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.ChildSessionConfiguration.Builder addInternalDnsServer(java.net.InetAddress p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.ChildSessionConfiguration.Builder addInternalSubnet(android.net.IpPrefix p0) { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.ChildSessionConfiguration.Builder clearInternalAddresses() { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.ChildSessionConfiguration.Builder clearInternalDhcpServers() { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.ChildSessionConfiguration.Builder clearInternalDnsServers() { return null; }
        @android.annotation.NonNull
        public android.net.ipsec.ike.ChildSessionConfiguration.Builder clearInternalSubnets() { return null; }
    }
}
