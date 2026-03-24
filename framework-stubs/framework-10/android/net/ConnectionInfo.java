package android.net;

public final class ConnectionInfo implements android.os.Parcelable {
    public final int protocol = 0;
    public final java.net.InetSocketAddress local = null;
    public final java.net.InetSocketAddress remote = null;
    public static final android.os.Parcelable.Creator<android.net.ConnectionInfo> CREATOR = null;
    public int describeContents() { return 0; }
    public ConnectionInfo(int p0, java.net.InetSocketAddress p1, java.net.InetSocketAddress p2) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
