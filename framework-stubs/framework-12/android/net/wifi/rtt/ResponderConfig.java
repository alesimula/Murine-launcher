package android.net.wifi.rtt;

public final class ResponderConfig implements android.os.Parcelable {
    public static final int CHANNEL_WIDTH_160MHZ = 3;
    public static final int CHANNEL_WIDTH_20MHZ = 0;
    public static final int CHANNEL_WIDTH_40MHZ = 1;
    public static final int CHANNEL_WIDTH_80MHZ = 2;
    public static final int CHANNEL_WIDTH_80MHZ_PLUS_MHZ = 4;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.rtt.ResponderConfig> CREATOR = null;
    public static final int PREAMBLE_HE = 3;
    public static final int PREAMBLE_HT = 1;
    public static final int PREAMBLE_LEGACY = 0;
    public static final int PREAMBLE_VHT = 2;
    public static final int RESPONDER_AP = 0;
    public static final int RESPONDER_AWARE = 4;
    public static final int RESPONDER_P2P_CLIENT = 3;
    public static final int RESPONDER_P2P_GO = 2;
    public static final int RESPONDER_STA = 1;
    public final int centerFreq0 = 0;
    public final int centerFreq1 = 0;
    public final int channelWidth = 0;
    public final int frequency = 0;
    public final android.net.MacAddress macAddress = null;
    public final android.net.wifi.aware.PeerHandle peerHandle = null;
    public final int preamble = 0;
    public final int responderType = 0;
    public final boolean supports80211mc = false;
    public ResponderConfig(android.net.MacAddress p0, int p1, boolean p2, int p3, int p4, int p5, int p6, int p7) {}
    public ResponderConfig(android.net.wifi.aware.PeerHandle p0, int p1, boolean p2, int p3, int p4, int p5, int p6, int p7) {}
    public static android.net.wifi.rtt.ResponderConfig fromScanResult(android.net.wifi.ScanResult p0) { return null; }
    public static android.net.wifi.rtt.ResponderConfig fromWifiAwarePeerMacAddressWithDefaults(android.net.MacAddress p0) { return null; }
    public static android.net.wifi.rtt.ResponderConfig fromWifiAwarePeerHandleWithDefaults(android.net.wifi.aware.PeerHandle p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}
