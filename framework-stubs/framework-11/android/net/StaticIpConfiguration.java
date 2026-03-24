package android.net;

@android.annotation.SystemApi
public final class StaticIpConfiguration implements android.os.Parcelable {
    public android.net.LinkAddress ipAddress;
    public java.net.InetAddress gateway;
    public final java.util.ArrayList<java.net.InetAddress> dnsServers = null;
    public java.lang.String domains;
    public static final android.os.Parcelable.Creator<android.net.StaticIpConfiguration> CREATOR = null;
    public StaticIpConfiguration() {}
    public StaticIpConfiguration(android.net.StaticIpConfiguration p0) {}
    public void clear() {}
    public android.net.LinkAddress getIpAddress() { return null; }
    public java.net.InetAddress getGateway() { return null; }
    public java.util.List<java.net.InetAddress> getDnsServers() { return null; }
    public java.lang.String getDomains() { return null; }
    public void addDnsServer(java.net.InetAddress p0) {}
    public java.util.List<android.net.RouteInfo> getRoutes(java.lang.String p0) { return null; }
    public android.net.LinkProperties toLinkProperties(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static android.net.StaticIpConfiguration readFromParcel(android.os.Parcel p0) { return null; }

    public static final class Builder {
        private android.net.LinkAddress mIpAddress;
        private java.net.InetAddress mGateway;
        private java.lang.Iterable<java.net.InetAddress> mDnsServers;
        private java.lang.String mDomains;
        public Builder() {}
        public android.net.StaticIpConfiguration.Builder setIpAddress(android.net.LinkAddress p0) { return null; }
        public android.net.StaticIpConfiguration.Builder setGateway(java.net.InetAddress p0) { return null; }
        public android.net.StaticIpConfiguration.Builder setDnsServers(java.lang.Iterable<java.net.InetAddress> p0) { return null; }
        public android.net.StaticIpConfiguration.Builder setDomains(java.lang.String p0) { return null; }
        public android.net.StaticIpConfiguration build() { return null; }
    }
}
