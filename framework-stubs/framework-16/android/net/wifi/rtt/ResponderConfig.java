package android.net.wifi.rtt;

public final class ResponderConfig implements android.os.Parcelable {
    public static final int CHANNEL_WIDTH_160MHZ = 3;
    public static final int CHANNEL_WIDTH_20MHZ = 0;
    public static final int CHANNEL_WIDTH_320MHZ = 5;
    public static final int CHANNEL_WIDTH_40MHZ = 1;
    public static final int CHANNEL_WIDTH_80MHZ = 2;
    public static final int CHANNEL_WIDTH_80MHZ_PLUS_MHZ = 4;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.rtt.ResponderConfig> CREATOR = null;
    public static final int PREAMBLE_EHT = 4;
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
    @android.annotation.Nullable
    public final android.net.MacAddress macAddress = null;
    @android.annotation.Nullable
    public final android.net.wifi.aware.PeerHandle peerHandle = null;
    public final int preamble = 0;
    public final int responderType = 0;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public final boolean supports80211azNtb = false;
    public final boolean supports80211mc = false;
    public ResponderConfig(android.net.MacAddress p0, int p1, boolean p2, int p3, int p4, int p5, int p6, int p7) {}
    public ResponderConfig(android.net.wifi.aware.PeerHandle p0, int p1, boolean p2, int p3, int p4, int p5, int p6, int p7) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public static android.net.wifi.rtt.ResponderConfig fromScanResult(android.net.wifi.ScanResult p0) { return null; }
    @android.annotation.NonNull
    public static android.net.wifi.rtt.ResponderConfig fromWifiAwarePeerHandleWithDefaults(android.net.wifi.aware.PeerHandle p0) { return null; }
    @android.annotation.NonNull
    public static android.net.wifi.rtt.ResponderConfig fromWifiAwarePeerMacAddressWithDefaults(android.net.MacAddress p0) { return null; }
    public int getCenterFreq0Mhz() { return 0; }
    public int getCenterFreq1Mhz() { return 0; }
    public int getChannelWidth() { return 0; }
    public int getFrequencyMhz() { return 0; }
    @android.annotation.Nullable
    public android.net.MacAddress getMacAddress() { return null; }
    public int getPreamble() { return 0; }
    public int getResponderType() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    @android.annotation.Nullable
    public android.net.wifi.rtt.SecureRangingConfig getSecureRangingConfig() { return null; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public boolean is80211azNtbSupported() { return false; }
    public boolean is80211mcSupported() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.wifi.rtt.ResponderConfig build() { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.ResponderConfig.Builder set80211azNtbSupported(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.rtt.ResponderConfig.Builder set80211mcSupported(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.rtt.ResponderConfig.Builder setCenterFreq0Mhz(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.rtt.ResponderConfig.Builder setCenterFreq1Mhz(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.rtt.ResponderConfig.Builder setChannelWidth(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.rtt.ResponderConfig.Builder setFrequencyMhz(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.rtt.ResponderConfig.Builder setMacAddress(android.net.MacAddress p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.rtt.ResponderConfig.Builder setPreamble(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.rtt.ResponderConfig.Builder setResponderType(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
        @android.annotation.NonNull
        public android.net.wifi.rtt.ResponderConfig.Builder setSecureRangingConfig(android.net.wifi.rtt.SecureRangingConfig p0) { return null; }
    }
}
