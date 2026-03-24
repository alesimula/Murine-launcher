package android.net;

@android.annotation.SystemApi
public final class NattKeepalivePacketData extends android.net.KeepalivePacketData implements android.os.Parcelable {
    private static final int IPV4_HEADER_LENGTH = 20;
    private static final int UDP_HEADER_LENGTH = 8;
    public static final android.os.Parcelable.Creator<android.net.NattKeepalivePacketData> CREATOR = null;
    public NattKeepalivePacketData(java.net.InetAddress p0, int p1, java.net.InetAddress p2, int p3, byte[] p4) throws android.net.InvalidPacketException { super(null, 0, null, 0, null); }
    public static android.net.NattKeepalivePacketData nattKeepalivePacket(java.net.InetAddress p0, int p1, java.net.InetAddress p2, int p3) throws android.net.InvalidPacketException { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
