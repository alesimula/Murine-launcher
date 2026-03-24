package android.net;

public final class LinkProperties implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.LinkProperties> CREATOR = null;
    public LinkProperties() {}
    public LinkProperties(android.net.LinkProperties p0) {}
    public LinkProperties(android.net.LinkProperties p0, boolean p1) {}
    public boolean addRoute(android.net.RouteInfo p0) { return false; }
    public void clear() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public java.net.Inet4Address getDhcpServerAddress() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.net.InetAddress> getDnsServers() { return null; }
    @android.annotation.Nullable
    public java.lang.String getDomains() { return null; }
    @android.annotation.Nullable
    public android.net.ProxyInfo getHttpProxy() { return null; }
    @android.annotation.Nullable
    public java.lang.String getInterfaceName() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.LinkAddress> getLinkAddresses() { return null; }
    public int getMtu() { return 0; }
    @android.annotation.Nullable
    public android.net.IpPrefix getNat64Prefix() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPrivateDnsServerName() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.RouteInfo> getRoutes() { return null; }
    public boolean isPrivateDnsActive() { return false; }
    public boolean isWakeOnLanSupported() { return false; }
    public void setDhcpServerAddress(java.net.Inet4Address p0) {}
    public void setDnsServers(java.util.Collection<java.net.InetAddress> p0) {}
    public void setDomains(java.lang.String p0) {}
    public void setHttpProxy(android.net.ProxyInfo p0) {}
    public void setInterfaceName(java.lang.String p0) {}
    public void setLinkAddresses(java.util.Collection<android.net.LinkAddress> p0) {}
    public void setMtu(int p0) {}
    public void setNat64Prefix(android.net.IpPrefix p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean addDnsServer(java.net.InetAddress p0) { return false; }
    public boolean addLinkAddress(android.net.LinkAddress p0) { return false; }
    public boolean addPcscfServer(java.net.InetAddress p0) { return false; }
    @android.annotation.NonNull
    public java.util.List<java.net.InetAddress> getAddresses() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getAllInterfaceNames() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.LinkAddress> getAllLinkAddresses() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.RouteInfo> getAllRoutes() { return null; }
    @android.annotation.Nullable
    public android.net.Uri getCaptivePortalApiUrl() { return null; }
    @android.annotation.Nullable
    public android.net.CaptivePortalData getCaptivePortalData() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.net.InetAddress> getPcscfServers() { return null; }
    @android.annotation.Nullable
    public java.lang.String getTcpBufferSizes() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.net.InetAddress> getValidatedPrivateDnsServers() { return null; }
    public boolean hasGlobalIpv6Address() { return false; }
    public boolean hasIpv4Address() { return false; }
    public boolean hasIpv4DefaultRoute() { return false; }
    public boolean hasIpv4DnsServer() { return false; }
    public boolean hasIpv6DefaultRoute() { return false; }
    public boolean hasIpv6DnsServer() { return false; }
    public boolean isIpv4Provisioned() { return false; }
    public boolean isIpv6Provisioned() { return false; }
    public boolean isProvisioned() { return false; }
    public boolean isReachable(java.net.InetAddress p0) { return false; }
    public boolean removeDnsServer(java.net.InetAddress p0) { return false; }
    public boolean removeLinkAddress(android.net.LinkAddress p0) { return false; }
    public boolean removeRoute(android.net.RouteInfo p0) { return false; }
    public void setCaptivePortalApiUrl(android.net.Uri p0) {}
    public void setCaptivePortalData(android.net.CaptivePortalData p0) {}
    public void setPcscfServers(java.util.Collection<java.net.InetAddress> p0) {}
    public void setPrivateDnsServerName(java.lang.String p0) {}
    public void setTcpBufferSizes(java.lang.String p0) {}
    public void setUsePrivateDns(boolean p0) {}
    public void setValidatedPrivateDnsServers(java.util.Collection<java.net.InetAddress> p0) {}
}
