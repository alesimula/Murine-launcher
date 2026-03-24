package android.net;

public class KeepalivePacketData implements android.os.Parcelable {
    private static final java.lang.String TAG = "KeepalivePacketData";
    public final java.net.InetAddress srcAddress = null;
    public final java.net.InetAddress dstAddress = null;
    public final int srcPort = 0;
    public final int dstPort = 0;
    private final byte[] mPacket = null;
    protected static final int IPV4_HEADER_LENGTH = 20;
    protected static final int UDP_HEADER_LENGTH = 8;
    public static final android.os.Parcelable.Creator<android.net.KeepalivePacketData> CREATOR = null;
    protected KeepalivePacketData(java.net.InetAddress p0, int p1, java.net.InetAddress p2, int p3, byte[] p4) throws android.net.SocketKeepalive.InvalidPacketException {}
    public byte[] getPacket() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected KeepalivePacketData(android.os.Parcel p0) {}
}
