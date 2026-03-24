package android.net;

public final class RouteInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.RouteInfo> CREATOR = null;
    public static final int RTN_THROW = 9;
    public static final int RTN_UNICAST = 1;
    public static final int RTN_UNREACHABLE = 7;
    public RouteInfo(android.net.IpPrefix p0, java.net.InetAddress p1, java.lang.String p2, int p3) {}
    public RouteInfo(android.net.IpPrefix p0, java.net.InetAddress p1, java.lang.String p2, int p3, int p4) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.net.IpPrefix getDestination() { return null; }
    @android.annotation.Nullable
    public java.net.InetAddress getGateway() { return null; }
    @android.annotation.Nullable
    public java.lang.String getInterface() { return null; }
    public int getType() { return 0; }
    public boolean hasGateway() { return false; }
    public boolean isDefaultRoute() { return false; }
    public boolean matches(java.net.InetAddress p0) { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getMtu() { return 0; }
}
