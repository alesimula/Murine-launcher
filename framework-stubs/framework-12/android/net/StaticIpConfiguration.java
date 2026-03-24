package android.net;

public final class StaticIpConfiguration implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.StaticIpConfiguration> CREATOR = null;
    public StaticIpConfiguration() {}
    public StaticIpConfiguration(android.net.StaticIpConfiguration p0) {}
    public void clear() {}
    @android.annotation.Nullable
    public android.net.LinkAddress getIpAddress() { return null; }
    @android.annotation.Nullable
    public java.net.InetAddress getGateway() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.net.InetAddress> getDnsServers() { return null; }
    @android.annotation.Nullable
    public java.lang.String getDomains() { return null; }
    public void addDnsServer(java.net.InetAddress p0) {}
    @android.annotation.NonNull
    public java.util.List<android.net.RouteInfo> getRoutes(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.StaticIpConfiguration.Builder setIpAddress(android.net.LinkAddress p0) { return null; }
        @android.annotation.NonNull
        public android.net.StaticIpConfiguration.Builder setGateway(java.net.InetAddress p0) { return null; }
        @android.annotation.NonNull
        public android.net.StaticIpConfiguration.Builder setDnsServers(java.lang.Iterable<java.net.InetAddress> p0) { return null; }
        @android.annotation.NonNull
        public android.net.StaticIpConfiguration.Builder setDomains(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.StaticIpConfiguration build() { return null; }
    }
}
