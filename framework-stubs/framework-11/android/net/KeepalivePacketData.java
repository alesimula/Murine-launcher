package android.net;

@android.annotation.SystemApi
public class KeepalivePacketData {
    private static final java.lang.String TAG = "KeepalivePacketData";
    private final java.net.InetAddress mSrcAddress = null;
    private final java.net.InetAddress mDstAddress = null;
    private final int mSrcPort = 0;
    private final int mDstPort = 0;
    private final byte[] mPacket = null;
    protected KeepalivePacketData(java.net.InetAddress p0, int p1, java.net.InetAddress p2, int p3, byte[] p4) throws android.net.InvalidPacketException {}
    public java.net.InetAddress getSrcAddress() { return null; }
    public java.net.InetAddress getDstAddress() { return null; }
    public int getSrcPort() { return 0; }
    public int getDstPort() { return 0; }
    public byte[] getPacket() { return null; }
}
