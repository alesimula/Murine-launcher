package android.net;

public final class NattKeepalivePacketData extends android.net.KeepalivePacketData implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.net.NattKeepalivePacketData> CREATOR = null;
    private NattKeepalivePacketData(java.net.InetAddress p0, int p1, java.net.InetAddress p2, int p3, byte[] p4) throws android.net.SocketKeepalive.InvalidPacketException { super((android.os.Parcel)null); }
    public static android.net.NattKeepalivePacketData nattKeepalivePacket(java.net.InetAddress p0, int p1, java.net.InetAddress p2, int p3) throws android.net.SocketKeepalive.InvalidPacketException { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
