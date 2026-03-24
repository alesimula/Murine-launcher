package android.net;

public final class QosSocketInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.QosSocketInfo> CREATOR = null;
    public QosSocketInfo(android.net.Network p0, java.net.Socket p1) throws java.io.IOException {}
    public QosSocketInfo(android.net.Network p0, java.net.DatagramSocket p1) throws java.io.IOException {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.net.InetSocketAddress getLocalSocketAddress() { return null; }
    @android.annotation.NonNull
    public android.net.Network getNetwork() { return null; }
    @android.annotation.Nullable
    public java.net.InetSocketAddress getRemoteSocketAddress() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
