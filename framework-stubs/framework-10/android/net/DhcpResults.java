package android.net;

public final class DhcpResults implements android.os.Parcelable {
    private static final java.lang.String TAG = "DhcpResults";
    @android.annotation.UnsupportedAppUsage
    public android.net.LinkAddress ipAddress;
    @android.annotation.UnsupportedAppUsage
    public java.net.InetAddress gateway;
    @android.annotation.UnsupportedAppUsage
    public final java.util.ArrayList<java.net.InetAddress> dnsServers = null;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String domains;
    @android.annotation.UnsupportedAppUsage
    public java.net.Inet4Address serverAddress;
    @android.annotation.UnsupportedAppUsage
    public java.lang.String vendorInfo;
    @android.annotation.UnsupportedAppUsage
    public int leaseDuration;
    @android.annotation.UnsupportedAppUsage
    public int mtu;
    public java.lang.String serverHostName;
    public static final android.os.Parcelable.Creator<android.net.DhcpResults> CREATOR = null;
    public DhcpResults() {}
    public android.net.StaticIpConfiguration toStaticIpConfiguration() { return null; }
    public DhcpResults(android.net.StaticIpConfiguration p0) {}
    public DhcpResults(android.net.DhcpResults p0) {}
    public java.util.List<android.net.RouteInfo> getRoutes(java.lang.String p0) { return null; }
    public boolean hasMeteredHint() { return false; }
    public void clear() {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    private static android.net.DhcpResults readFromParcel(android.os.Parcel p0) { return null; }
    public boolean setIpAddress(java.lang.String p0, int p1) { return false; }
    public boolean setGateway(java.lang.String p0) { return false; }
    public boolean addDns(java.lang.String p0) { return false; }
    public android.net.LinkAddress getIpAddress() { return null; }
    public void setIpAddress(android.net.LinkAddress p0) {}
    public java.net.InetAddress getGateway() { return null; }
    public void setGateway(java.net.InetAddress p0) {}
    public java.util.List<java.net.InetAddress> getDnsServers() { return null; }
    public void addDnsServer(java.net.InetAddress p0) {}
    public java.lang.String getDomains() { return null; }
    public void setDomains(java.lang.String p0) {}
    public java.net.Inet4Address getServerAddress() { return null; }
    public void setServerAddress(java.net.Inet4Address p0) {}
    public int getLeaseDuration() { return 0; }
    public void setLeaseDuration(int p0) {}
    public java.lang.String getVendorInfo() { return null; }
    public void setVendorInfo(java.lang.String p0) {}
    public int getMtu() { return 0; }
    public void setMtu(int p0) {}
}
