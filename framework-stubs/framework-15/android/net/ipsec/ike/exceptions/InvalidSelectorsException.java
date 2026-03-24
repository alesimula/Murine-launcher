package android.net.ipsec.ike.exceptions;

public final class InvalidSelectorsException extends android.net.ipsec.ike.exceptions.IkeProtocolException {
    public InvalidSelectorsException(int p0, byte[] p1) { super(); }
    @android.annotation.NonNull
    public byte[] getIpSecPacketInfo() { return null; }
    public int getIpSecSpi() { return 0; }
}
