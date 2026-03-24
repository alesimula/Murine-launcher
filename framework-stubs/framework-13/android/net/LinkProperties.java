package android.net;

public final class LinkProperties implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.LinkProperties> CREATOR = null;
    public LinkProperties() {}
    public LinkProperties(android.net.LinkProperties p0) {}
    public LinkProperties(android.net.LinkProperties p0, boolean p1) {}
    public void setInterfaceName(java.lang.String p0) {}
    @android.annotation.Nullable
    public java.lang.String getInterfaceName() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getAllInterfaceNames() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.net.InetAddress> getAddresses() { return null; }
    public boolean addLinkAddress(android.net.LinkAddress p0) { return false; }
    public boolean removeLinkAddress(android.net.LinkAddress p0) { return false; }
    @android.annotation.NonNull
    public java.util.List<android.net.LinkAddress> getLinkAddresses() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.LinkAddress> getAllLinkAddresses() { return null; }
    public void setLinkAddresses(java.util.Collection<android.net.LinkAddress> p0) {}
    public boolean addDnsServer(java.net.InetAddress p0) { return false; }
    public boolean removeDnsServer(java.net.InetAddress p0) { return false; }
    public void setDnsServers(java.util.Collection<java.net.InetAddress> p0) {}
    @android.annotation.NonNull
    public java.util.List<java.net.InetAddress> getDnsServers() { return null; }
    public void setUsePrivateDns(boolean p0) {}
    public boolean isPrivateDnsActive() { return false; }
    public void setPrivateDnsServerName(java.lang.String p0) {}
    public void setDhcpServerAddress(java.net.Inet4Address p0) {}
    @android.annotation.Nullable
    public java.net.Inet4Address getDhcpServerAddress() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPrivateDnsServerName() { return null; }
    public void setValidatedPrivateDnsServers(java.util.Collection<java.net.InetAddress> p0) {}
    @android.annotation.NonNull
    public java.util.List<java.net.InetAddress> getValidatedPrivateDnsServers() { return null; }
    public boolean addPcscfServer(java.net.InetAddress p0) { return false; }
    public void setPcscfServers(java.util.Collection<java.net.InetAddress> p0) {}
    @android.annotation.NonNull
    public java.util.List<java.net.InetAddress> getPcscfServers() { return null; }
    public void setDomains(java.lang.String p0) {}
    @android.annotation.Nullable
    public java.lang.String getDomains() { return null; }
    public void setMtu(int p0) {}
    public int getMtu() { return 0; }
    public void setTcpBufferSizes(java.lang.String p0) {}
    @android.annotation.Nullable
    public java.lang.String getTcpBufferSizes() { return null; }
    public boolean addRoute(android.net.RouteInfo p0) { return false; }
    public boolean removeRoute(android.net.RouteInfo p0) { return false; }
    @android.annotation.NonNull
    public java.util.List<android.net.RouteInfo> getRoutes() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.RouteInfo> getAllRoutes() { return null; }
    public void setHttpProxy(android.net.ProxyInfo p0) {}
    @android.annotation.Nullable
    public android.net.ProxyInfo getHttpProxy() { return null; }
    @android.annotation.Nullable
    public android.net.IpPrefix getNat64Prefix() { return null; }
    public void setNat64Prefix(android.net.IpPrefix p0) {}
    public void clear() {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean hasIpv4Address() { return false; }
    public boolean hasGlobalIpv6Address() { return false; }
    public boolean hasIpv4DefaultRoute() { return false; }
    public boolean hasIpv6DefaultRoute() { return false; }
    public boolean hasIpv4DnsServer() { return false; }
    public boolean hasIpv6DnsServer() { return false; }
    public boolean isIpv4Provisioned() { return false; }
    public boolean isIpv6Provisioned() { return false; }
    public boolean isProvisioned() { return false; }
    public boolean isReachable(java.net.InetAddress p0) { return false; }
    public boolean isWakeOnLanSupported() { return false; }
    public void setCaptivePortalApiUrl(android.net.Uri p0) {}
    @android.annotation.Nullable
    public android.net.Uri getCaptivePortalApiUrl() { return null; }
    public void setCaptivePortalData(android.net.CaptivePortalData p0) {}
    @android.annotation.Nullable
    public android.net.CaptivePortalData getCaptivePortalData() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
