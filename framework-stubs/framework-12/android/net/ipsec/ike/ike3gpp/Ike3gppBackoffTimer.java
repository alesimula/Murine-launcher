package android.net.ipsec.ike.ike3gpp;

public final class Ike3gppBackoffTimer extends android.net.ipsec.ike.ike3gpp.Ike3gppData {
    public static final int ERROR_TYPE_NETWORK_FAILURE = 10500;
    public static final int ERROR_TYPE_NO_APN_SUBSCRIPTION = 9002;
    public Ike3gppBackoffTimer(byte p0, int p1) { super(); }
    public int getDataType() { return 0; }
    public byte getBackoffTimer() { return 0; }
    public int getBackoffCause() { return 0; }
}
