package android.net.wifi;

public class ScanResult implements android.os.Parcelable {
    public java.lang.String SSID;
    @android.annotation.UnsupportedAppUsage
    public android.net.wifi.WifiSsid wifiSsid;
    public java.lang.String BSSID;
    @android.annotation.UnsupportedAppUsage
    public long hessid;
    @android.annotation.UnsupportedAppUsage
    public int anqpDomainId;
    public java.lang.String capabilities;
    public static final int PROTOCOL_NONE = 0;
    public static final int PROTOCOL_WPA = 1;
    public static final int PROTOCOL_RSN = 2;
    public static final int PROTOCOL_OSEN = 3;
    public static final int KEY_MGMT_NONE = 0;
    public static final int KEY_MGMT_PSK = 1;
    public static final int KEY_MGMT_EAP = 2;
    public static final int KEY_MGMT_FT_PSK = 3;
    public static final int KEY_MGMT_FT_EAP = 4;
    public static final int KEY_MGMT_PSK_SHA256 = 5;
    public static final int KEY_MGMT_EAP_SHA256 = 6;
    public static final int KEY_MGMT_OSEN = 7;
    public static final int KEY_MGMT_SAE = 8;
    public static final int KEY_MGMT_OWE = 9;
    public static final int KEY_MGMT_EAP_SUITE_B_192 = 10;
    public static final int KEY_MGMT_FT_SAE = 11;
    public static final int KEY_MGMT_OWE_TRANSITION = 12;
    public static final int CIPHER_NONE = 0;
    public static final int CIPHER_NO_GROUP_ADDRESSED = 1;
    public static final int CIPHER_TKIP = 2;
    public static final int CIPHER_CCMP = 3;
    public static final int CIPHER_GCMP_256 = 4;
    public int level;
    public int frequency;
    public static final int CHANNEL_WIDTH_20MHZ = 0;
    public static final int CHANNEL_WIDTH_40MHZ = 1;
    public static final int CHANNEL_WIDTH_80MHZ = 2;
    public static final int CHANNEL_WIDTH_160MHZ = 3;
    public static final int CHANNEL_WIDTH_80MHZ_PLUS_MHZ = 4;
    public int channelWidth;
    public int centerFreq0;
    public int centerFreq1;
    @android.annotation.UnsupportedAppUsage
    public boolean is80211McRTTResponder;
    public long timestamp;
    @android.annotation.UnsupportedAppUsage
    public long seen;
    public android.net.wifi.ScanResult.RadioChainInfo[] radioChainInfos;
    @android.annotation.SystemApi
    public boolean untrusted;
    @android.annotation.UnsupportedAppUsage
    public int numUsage;
    @android.annotation.UnsupportedAppUsage
    public int distanceCm;
    @android.annotation.UnsupportedAppUsage
    public int distanceSdCm;
    public static final long FLAG_PASSPOINT_NETWORK = 1L;
    public static final long FLAG_80211mc_RESPONDER = 2L;
    @android.annotation.UnsupportedAppUsage
    public long flags;
    public java.lang.CharSequence venueName;
    public java.lang.CharSequence operatorFriendlyName;
    public static final int UNSPECIFIED = -1;
    @android.annotation.UnsupportedAppUsage
    public java.util.List<java.lang.String> anqpLines;
    @android.annotation.UnsupportedAppUsage
    public android.net.wifi.ScanResult.InformationElement[] informationElements;
    public android.net.wifi.AnqpInformationElement[] anqpElements;
    public boolean isCarrierAp;
    public int carrierApEapType;
    public java.lang.String carrierName;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.Parcelable.Creator<android.net.wifi.ScanResult> CREATOR = null;
    public void setFlag(long p0) {}
    public void clearFlag(long p0) {}
    public boolean is80211mcResponder() { return false; }
    public boolean isPasspointNetwork() { return false; }
    public boolean is24GHz() { return false; }
    public static boolean is24GHz(int p0) { return false; }
    public boolean is5GHz() { return false; }
    public static boolean is5GHz(int p0) { return false; }
    public ScanResult(android.net.wifi.WifiSsid p0, java.lang.String p1, long p2, int p3, byte[] p4, java.lang.String p5, int p6, int p7, long p8) {}
    public ScanResult(android.net.wifi.WifiSsid p0, java.lang.String p1, java.lang.String p2, int p3, int p4, long p5, int p6, int p7) {}
    public ScanResult(java.lang.String p0, java.lang.String p1, long p2, int p3, java.lang.String p4, int p5, int p6, long p7, int p8, int p9, int p10, int p11, int p12, boolean p13) {}
    public ScanResult(android.net.wifi.WifiSsid p0, java.lang.String p1, java.lang.String p2, long p3, int p4, java.lang.String p5, int p6, int p7, long p8, int p9, int p10, int p11, int p12, int p13, boolean p14) {}
    public ScanResult(android.net.wifi.ScanResult p0) {}
    public ScanResult() {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class RadioChainInfo {
        public int id;
        public int level;
        public RadioChainInfo() {}
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static class InformationElement {
        @android.annotation.UnsupportedAppUsage
        public static final int EID_SSID = 0;
        @android.annotation.UnsupportedAppUsage
        public static final int EID_SUPPORTED_RATES = 1;
        @android.annotation.UnsupportedAppUsage
        public static final int EID_TIM = 5;
        @android.annotation.UnsupportedAppUsage
        public static final int EID_BSS_LOAD = 11;
        @android.annotation.UnsupportedAppUsage
        public static final int EID_ERP = 42;
        public static final int EID_HT_CAPABILITIES = 45;
        @android.annotation.UnsupportedAppUsage
        public static final int EID_RSN = 48;
        @android.annotation.UnsupportedAppUsage
        public static final int EID_EXTENDED_SUPPORTED_RATES = 50;
        @android.annotation.UnsupportedAppUsage
        public static final int EID_HT_OPERATION = 61;
        @android.annotation.UnsupportedAppUsage
        public static final int EID_INTERWORKING = 107;
        @android.annotation.UnsupportedAppUsage
        public static final int EID_ROAMING_CONSORTIUM = 111;
        @android.annotation.UnsupportedAppUsage
        public static final int EID_EXTENDED_CAPS = 127;
        public static final int EID_VHT_CAPABILITIES = 191;
        @android.annotation.UnsupportedAppUsage
        public static final int EID_VHT_OPERATION = 192;
        @android.annotation.UnsupportedAppUsage
        public static final int EID_VSA = 221;
        @android.annotation.UnsupportedAppUsage
        public int id;
        @android.annotation.UnsupportedAppUsage
        public byte[] bytes;
        public InformationElement() {}
        public InformationElement(android.net.wifi.ScanResult.InformationElement p0) {}
    }
}
