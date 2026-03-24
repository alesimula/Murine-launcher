package android.net;

public final class TcpKeepalivePacketData extends android.net.KeepalivePacketData implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.TcpKeepalivePacketData> CREATOR = null;
    public TcpKeepalivePacketData(java.net.InetAddress p0, int p1, java.net.InetAddress p2, int p3, byte[] p4, int p5, int p6, int p7, int p8, int p9, int p10) throws android.net.InvalidPacketException { super(null, 0, null, 0, null); }
    public int describeContents() { return 0; }
    public int getIpTos() { return 0; }
    public int getIpTtl() { return 0; }
    public int getTcpAck() { return 0; }
    public int getTcpSeq() { return 0; }
    public int getTcpWindow() { return 0; }
    public int getTcpWindowScale() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
