package android.net;

public final class RouteInfo implements android.os.Parcelable {
    private final android.net.IpPrefix mDestination = null;
    private final java.net.InetAddress mGateway = null;
    private final java.lang.String mInterface = null;
    @android.annotation.SystemApi
    public static final int RTN_UNICAST = 1;
    @android.annotation.SystemApi
    public static final int RTN_UNREACHABLE = 7;
    @android.annotation.SystemApi
    public static final int RTN_THROW = 9;
    private final int mType = 0;
    private final int mMtu = 0;
    private final boolean mIsHost = false;
    private final boolean mHasGateway = false;
    public static final android.os.Parcelable.Creator<android.net.RouteInfo> CREATOR = null;
    @android.annotation.SystemApi
    public RouteInfo(android.net.IpPrefix p0, java.net.InetAddress p1, java.lang.String p2, int p3) {}
    @android.annotation.SystemApi
    public RouteInfo(android.net.IpPrefix p0, java.net.InetAddress p1, java.lang.String p2, int p3, int p4) {}
    public RouteInfo(android.net.IpPrefix p0, java.net.InetAddress p1, java.lang.String p2) {}
    public RouteInfo(android.net.LinkAddress p0, java.net.InetAddress p1, java.lang.String p2) {}
    public RouteInfo(android.net.IpPrefix p0, java.net.InetAddress p1) {}
    public RouteInfo(android.net.LinkAddress p0, java.net.InetAddress p1) {}
    public RouteInfo(java.net.InetAddress p0) {}
    public RouteInfo(android.net.IpPrefix p0) {}
    public RouteInfo(android.net.LinkAddress p0) {}
    public RouteInfo(android.net.IpPrefix p0, int p1) {}
    public static android.net.RouteInfo makeHostRoute(java.net.InetAddress p0, java.lang.String p1) { return null; }
    public static android.net.RouteInfo makeHostRoute(java.net.InetAddress p0, java.net.InetAddress p1, java.lang.String p2) { return null; }
    private boolean isHost() { return false; }
    public android.net.IpPrefix getDestination() { return null; }
    public android.net.LinkAddress getDestinationLinkAddress() { return null; }
    public java.net.InetAddress getGateway() { return null; }
    public java.lang.String getInterface() { return null; }
    @android.annotation.SystemApi
    public int getType() { return 0; }
    @android.annotation.SystemApi
    public int getMtu() { return 0; }
    public boolean isDefaultRoute() { return false; }
    private boolean isUnreachableDefaultRoute() { return false; }
    public boolean isIPv4Default() { return false; }
    public boolean isIPv4UnreachableDefault() { return false; }
    public boolean isIPv6Default() { return false; }
    public boolean isIPv6UnreachableDefault() { return false; }
    public boolean isHostRoute() { return false; }
    public boolean hasGateway() { return false; }
    public boolean matches(java.net.InetAddress p0) { return false; }
    public static android.net.RouteInfo selectBestRoute(java.util.Collection<android.net.RouteInfo> p0, java.net.InetAddress p1) { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public android.net.RouteInfo.RouteKey getRouteKey() { return null; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class RouteKey {
        private final android.net.IpPrefix mDestination = null;
        private final java.net.InetAddress mGateway = null;
        private final java.lang.String mInterface = null;
        RouteKey(android.net.IpPrefix p0, java.net.InetAddress p1, java.lang.String p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RouteType {
    }
}
