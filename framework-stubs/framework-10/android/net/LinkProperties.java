package android.net;

public final class LinkProperties implements android.os.Parcelable {
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private java.lang.String mIfaceName;
    private final java.util.ArrayList<android.net.LinkAddress> mLinkAddresses = null;
    private final java.util.ArrayList<java.net.InetAddress> mDnses = null;
    private final java.util.ArrayList<java.net.InetAddress> mPcscfs = null;
    private final java.util.ArrayList<java.net.InetAddress> mValidatedPrivateDnses = null;
    private boolean mUsePrivateDns;
    private java.lang.String mPrivateDnsServerName;
    private java.lang.String mDomains;
    private java.util.ArrayList<android.net.RouteInfo> mRoutes;
    private android.net.ProxyInfo mHttpProxy;
    private int mMtu;
    private java.lang.String mTcpBufferSizes;
    private android.net.IpPrefix mNat64Prefix;
    private static final int MIN_MTU = 68;
    private static final int MIN_MTU_V6 = 1280;
    private static final int MAX_MTU = 10000;
    private java.util.Hashtable<java.lang.String, android.net.LinkProperties> mStackedLinks;
    public static final android.os.Parcelable.Creator<android.net.LinkProperties> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public static android.net.LinkProperties.ProvisioningChange compareProvisioning(android.net.LinkProperties p0, android.net.LinkProperties p1) { return null; }
    public LinkProperties() {}
    @android.annotation.SystemApi
    public LinkProperties(android.net.LinkProperties p0) {}
    public void setInterfaceName(java.lang.String p0) {}
    public java.lang.String getInterfaceName() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.util.List<java.lang.String> getAllInterfaceNames() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.util.List<java.net.InetAddress> getAddresses() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.util.List<java.net.InetAddress> getAllAddresses() { return null; }
    private int findLinkAddressIndex(android.net.LinkAddress p0) { return 0; }
    @android.annotation.SystemApi
    public boolean addLinkAddress(android.net.LinkAddress p0) { return false; }
    @android.annotation.SystemApi
    public boolean removeLinkAddress(android.net.LinkAddress p0) { return false; }
    public java.util.List<android.net.LinkAddress> getLinkAddresses() { return null; }
    @android.annotation.UnsupportedAppUsage
    public java.util.List<android.net.LinkAddress> getAllLinkAddresses() { return null; }
    public void setLinkAddresses(java.util.Collection<android.net.LinkAddress> p0) {}
    @android.annotation.SystemApi
    public boolean addDnsServer(java.net.InetAddress p0) { return false; }
    @android.annotation.SystemApi
    public boolean removeDnsServer(java.net.InetAddress p0) { return false; }
    public void setDnsServers(java.util.Collection<java.net.InetAddress> p0) {}
    public java.util.List<java.net.InetAddress> getDnsServers() { return null; }
    @android.annotation.SystemApi
    public void setUsePrivateDns(boolean p0) {}
    public boolean isPrivateDnsActive() { return false; }
    @android.annotation.SystemApi
    public void setPrivateDnsServerName(java.lang.String p0) {}
    public java.lang.String getPrivateDnsServerName() { return null; }
    public boolean addValidatedPrivateDnsServer(java.net.InetAddress p0) { return false; }
    public boolean removeValidatedPrivateDnsServer(java.net.InetAddress p0) { return false; }
    @android.annotation.SystemApi
    public void setValidatedPrivateDnsServers(java.util.Collection<java.net.InetAddress> p0) {}
    @android.annotation.SystemApi
    public java.util.List<java.net.InetAddress> getValidatedPrivateDnsServers() { return null; }
    public boolean addPcscfServer(java.net.InetAddress p0) { return false; }
    public boolean removePcscfServer(java.net.InetAddress p0) { return false; }
    @android.annotation.SystemApi
    public void setPcscfServers(java.util.Collection<java.net.InetAddress> p0) {}
    @android.annotation.SystemApi
    public java.util.List<java.net.InetAddress> getPcscfServers() { return null; }
    public void setDomains(java.lang.String p0) {}
    public java.lang.String getDomains() { return null; }
    public void setMtu(int p0) {}
    public int getMtu() { return 0; }
    @android.annotation.SystemApi
    public void setTcpBufferSizes(java.lang.String p0) {}
    @android.annotation.SystemApi
    public java.lang.String getTcpBufferSizes() { return null; }
    private android.net.RouteInfo routeWithInterface(android.net.RouteInfo p0) { return null; }
    public boolean addRoute(android.net.RouteInfo p0) { return false; }
    @android.annotation.SystemApi
    public boolean removeRoute(android.net.RouteInfo p0) { return false; }
    public java.util.List<android.net.RouteInfo> getRoutes() { return null; }
    public void ensureDirectlyConnectedRoutes() {}
    @android.annotation.UnsupportedAppUsage
    public java.util.List<android.net.RouteInfo> getAllRoutes() { return null; }
    public void setHttpProxy(android.net.ProxyInfo p0) {}
    public android.net.ProxyInfo getHttpProxy() { return null; }
    @android.annotation.SystemApi
    public android.net.IpPrefix getNat64Prefix() { return null; }
    @android.annotation.SystemApi
    public void setNat64Prefix(android.net.IpPrefix p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean addStackedLink(android.net.LinkProperties p0) { return false; }
    public boolean removeStackedLink(java.lang.String p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public java.util.List<android.net.LinkProperties> getStackedLinks() { return null; }
    public void clear() {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    @android.annotation.SystemApi
    public boolean hasIpv4Address() { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public boolean hasIPv4Address() { return false; }
    private boolean hasIpv4AddressOnInterface(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    public boolean hasGlobalIpv6Address() { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public boolean hasGlobalIPv6Address() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean hasIpv4DefaultRoute() { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public boolean hasIPv4DefaultRoute() { return false; }
    @android.annotation.SystemApi
    public boolean hasIpv6DefaultRoute() { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public boolean hasIPv6DefaultRoute() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean hasIpv4DnsServer() { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public boolean hasIPv4DnsServer() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean hasIpv6DnsServer() { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public boolean hasIPv6DnsServer() { return false; }
    public boolean hasIpv4PcscfServer() { return false; }
    public boolean hasIpv6PcscfServer() { return false; }
    @android.annotation.SystemApi
    public boolean isIpv4Provisioned() { return false; }
    @android.annotation.SystemApi
    public boolean isIpv6Provisioned() { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public boolean isIPv6Provisioned() { return false; }
    @android.annotation.SystemApi
    public boolean isProvisioned() { return false; }
    @android.annotation.SystemApi
    public boolean isReachable(java.net.InetAddress p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isIdenticalInterfaceName(android.net.LinkProperties p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isIdenticalAddresses(android.net.LinkProperties p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isIdenticalDnses(android.net.LinkProperties p0) { return false; }
    public boolean isIdenticalPrivateDns(android.net.LinkProperties p0) { return false; }
    public boolean isIdenticalValidatedPrivateDnses(android.net.LinkProperties p0) { return false; }
    public boolean isIdenticalPcscfs(android.net.LinkProperties p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isIdenticalRoutes(android.net.LinkProperties p0) { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public boolean isIdenticalHttpProxy(android.net.LinkProperties p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean isIdenticalStackedLinks(android.net.LinkProperties p0) { return false; }
    public boolean isIdenticalMtu(android.net.LinkProperties p0) { return false; }
    public boolean isIdenticalTcpBufferSizes(android.net.LinkProperties p0) { return false; }
    public boolean isIdenticalNat64Prefix(android.net.LinkProperties p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.net.LinkProperties.CompareResult<android.net.LinkAddress> compareAddresses(android.net.LinkProperties p0) { return null; }
    public android.net.LinkProperties.CompareResult<java.net.InetAddress> compareDnses(android.net.LinkProperties p0) { return null; }
    public android.net.LinkProperties.CompareResult<java.net.InetAddress> compareValidatedPrivateDnses(android.net.LinkProperties p0) { return null; }
    public android.net.LinkProperties.CompareResult<android.net.RouteInfo> compareAllRoutes(android.net.LinkProperties p0) { return null; }
    public android.net.LinkProperties.CompareResult<java.lang.String> compareAllInterfaceNames(android.net.LinkProperties p0) { return null; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static boolean isValidMtu(int p0, boolean p1) { return false; }

    public static enum ProvisioningChange {
        STILL_NOT_PROVISIONED,
        LOST_PROVISIONING,
        GAINED_PROVISIONING,
        STILL_PROVISIONED;
        private ProvisioningChange() {}
    }

    public static class CompareResult<T extends java.lang.Object> {
        public final java.util.List<T> removed = null;
        public final java.util.List<T> added = null;
        public CompareResult() {}
        public CompareResult(java.util.Collection<T> p0, java.util.Collection<T> p1) {}
        public java.lang.String toString() { return null; }
    }
}
