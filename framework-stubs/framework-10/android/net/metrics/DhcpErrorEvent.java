package android.net.metrics;

@android.annotation.SystemApi
public final class DhcpErrorEvent implements android.net.metrics.IpConnectivityLog.Event {
    public static final int L2_ERROR = 1;
    public static final int L3_ERROR = 2;
    public static final int L4_ERROR = 3;
    public static final int DHCP_ERROR = 4;
    public static final int MISC_ERROR = 5;
    public final int errorCode = 0;
    private static final int L2_ERROR_TYPE = 256;
    private static final int L3_ERROR_TYPE = 512;
    private static final int L4_ERROR_TYPE = 768;
    private static final int DHCP_ERROR_TYPE = 1024;
    private static final int MISC_ERROR_TYPE = 1280;
    public static final int L2_TOO_SHORT = 16842752;
    public static final int L2_WRONG_ETH_TYPE = 16908288;
    public static final int L3_TOO_SHORT = 33619968;
    public static final int L3_NOT_IPV4 = 33685504;
    public static final int L3_INVALID_IP = 33751040;
    public static final int L4_NOT_UDP = 50397184;
    public static final int L4_WRONG_PORT = 50462720;
    public static final int BOOTP_TOO_SHORT = 67174400;
    public static final int DHCP_BAD_MAGIC_COOKIE = 67239936;
    public static final int DHCP_INVALID_OPTION_LENGTH = 67305472;
    public static final int DHCP_NO_MSG_TYPE = 67371008;
    public static final int DHCP_UNKNOWN_MSG_TYPE = 67436544;
    public static final int DHCP_NO_COOKIE = 67502080;
    public static final int BUFFER_UNDERFLOW = 83951616;
    public static final int RECEIVE_ERROR = 84017152;
    public static final int PARSING_ERROR = 84082688;
    public static final android.os.Parcelable.Creator<android.net.metrics.DhcpErrorEvent> CREATOR = null;
    public DhcpErrorEvent(int p0) {}
    private DhcpErrorEvent(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public static int errorCodeWithOption(int p0, int p1) { return 0; }
    public java.lang.String toString() { return null; }

    static final class Decoder {
        static final android.util.SparseArray<java.lang.String> constants = null;
        Decoder() {}
    }
}
