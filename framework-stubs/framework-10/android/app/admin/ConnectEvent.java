package android.app.admin;

public final class ConnectEvent extends android.app.admin.NetworkEvent implements android.os.Parcelable {
    private final java.lang.String mIpAddress = null;
    private final int mPort = 0;
    public static final android.os.Parcelable.Creator<android.app.admin.ConnectEvent> CREATOR = null;
    public ConnectEvent(java.lang.String p0, int p1, java.lang.String p2, long p3) { super(); }
    private ConnectEvent(android.os.Parcel p0) { super(); }
    public java.net.InetAddress getInetAddress() { return null; }
    public int getPort() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
