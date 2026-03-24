package android.net.wifi;

public final class ScanResult implements android.os.Parcelable {
    public java.lang.String BSSID;
    public static final int CHANNEL_WIDTH_160MHZ = 3;
    public static final int CHANNEL_WIDTH_20MHZ = 0;
    public static final int CHANNEL_WIDTH_320MHZ = 5;
    public static final int CHANNEL_WIDTH_40MHZ = 1;
    public static final int CHANNEL_WIDTH_80MHZ = 2;
    public static final int CHANNEL_WIDTH_80MHZ_PLUS_MHZ = 4;
    public static final int CIPHER_BIP_CMAC_256 = 9;
    public static final int CIPHER_BIP_GMAC_128 = 7;
    public static final int CIPHER_BIP_GMAC_256 = 8;
    public static final int CIPHER_CCMP = 3;
    public static final int CIPHER_GCMP_128 = 6;
    public static final int CIPHER_GCMP_256 = 4;
    public static final int CIPHER_NONE = 0;
    public static final int CIPHER_NO_GROUP_ADDRESSED = 1;
    public static final int CIPHER_SMS4 = 5;
    public static final int CIPHER_TKIP = 2;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.ScanResult> CREATOR = null;
    public static final int KEY_MGMT_EAP = 2;
    public static final int KEY_MGMT_EAP_SHA256 = 6;
    public static final int KEY_MGMT_EAP_SUITE_B_192 = 10;
    public static final int KEY_MGMT_FT_EAP = 4;
    public static final int KEY_MGMT_FT_PSK = 3;
    public static final int KEY_MGMT_FT_SAE = 11;
    public static final int KEY_MGMT_NONE = 0;
    public static final int KEY_MGMT_OSEN = 7;
    public static final int KEY_MGMT_OWE = 9;
    public static final int KEY_MGMT_OWE_TRANSITION = 12;
    public static final int KEY_MGMT_PSK = 1;
    public static final int KEY_MGMT_PSK_SHA256 = 5;
    public static final int KEY_MGMT_SAE = 8;
    public static final int KEY_MGMT_WAPI_CERT = 14;
    public static final int KEY_MGMT_WAPI_PSK = 13;
    public static final int PREAMBLE_EHT = 4;
    public static final int PREAMBLE_HE = 3;
    public static final int PREAMBLE_HT = 1;
    public static final int PREAMBLE_LEGACY = 0;
    public static final int PREAMBLE_VHT = 2;
    public static final int PROTOCOL_NONE = 0;
    public static final int PROTOCOL_OSEN = 3;
    public static final int PROTOCOL_RSN = 2;
    public static final int PROTOCOL_WAPI = 4;
    public static final int PROTOCOL_WPA = 1;
    @java.lang.Deprecated
    public java.lang.String SSID;
    public static final int UNSPECIFIED = -1;
    public static final int WIFI_BAND_24_GHZ = 1;
    public static final int WIFI_BAND_5_GHZ = 2;
    public static final int WIFI_BAND_60_GHZ = 16;
    public static final int WIFI_BAND_6_GHZ = 8;
    public static final int WIFI_STANDARD_11AC = 5;
    public static final int WIFI_STANDARD_11AD = 7;
    public static final int WIFI_STANDARD_11AX = 6;
    public static final int WIFI_STANDARD_11BE = 8;
    public static final int WIFI_STANDARD_11N = 4;
    public static final int WIFI_STANDARD_LEGACY = 1;
    public static final int WIFI_STANDARD_UNKNOWN = 0;
    public java.lang.String capabilities;
    public int centerFreq0;
    public int centerFreq1;
    public int channelWidth;
    public int frequency;
    public int level;
    @java.lang.Deprecated
    public java.lang.CharSequence operatorFriendlyName;
    public long timestamp;
    @java.lang.Deprecated
    public java.lang.CharSequence venueName;
    public ScanResult(android.net.wifi.ScanResult p0) {}
    public ScanResult() {}
    public void setWifiSsid(android.net.wifi.WifiSsid p0) {}
    @android.annotation.Nullable
    public android.net.wifi.WifiSsid getWifiSsid() { return null; }
    @android.annotation.Nullable
    public android.net.MacAddress getApMldMacAddress() { return null; }
    public int getApMloLinkId() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.MloLink> getAffiliatedMloLinks() { return null; }
    public int getWifiStandard() { return 0; }
    public boolean is80211mcResponder() { return false; }
    public boolean isPasspointNetwork() { return false; }
    public static int convertChannelToFrequencyMhzIfSupported(int p0, int p1) { return 0; }
    public static int convertFrequencyMhzToChannelIfSupported(int p0) { return 0; }
    public int getBand() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.ScanResult.InformationElement> getInformationElements() { return null; }
    @android.annotation.NonNull
    public int[] getSecurityTypes() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class InformationElement implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.net.wifi.ScanResult.InformationElement> CREATOR = null;
        public InformationElement(int p0, int p1, byte[] p2) {}
        public InformationElement(android.net.wifi.ScanResult.InformationElement p0) {}
        public int getId() { return 0; }
        public int getIdExt() { return 0; }
        @android.annotation.NonNull
        public java.nio.ByteBuffer getBytes() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}
