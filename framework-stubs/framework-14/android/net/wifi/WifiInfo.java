package android.net.wifi;

public class WifiInfo implements android.net.TransportInfo, android.os.Parcelable {
    public static final java.lang.String DEFAULT_MAC_ADDRESS = "02:00:00:00:00:00";
    public static final java.lang.String FREQUENCY_UNITS = "MHz";
    public static final int INVALID_RSSI = -127;
    public static final java.lang.String LINK_SPEED_UNITS = "Mbps";
    public static final int LINK_SPEED_UNKNOWN = -1;
    public static final int SECURITY_TYPE_DPP = 13;
    public static final int SECURITY_TYPE_EAP = 3;
    public static final int SECURITY_TYPE_EAP_WPA3_ENTERPRISE = 9;
    public static final int SECURITY_TYPE_EAP_WPA3_ENTERPRISE_192_BIT = 5;
    public static final int SECURITY_TYPE_OPEN = 0;
    public static final int SECURITY_TYPE_OSEN = 10;
    public static final int SECURITY_TYPE_OWE = 6;
    public static final int SECURITY_TYPE_PASSPOINT_R1_R2 = 11;
    public static final int SECURITY_TYPE_PASSPOINT_R3 = 12;
    public static final int SECURITY_TYPE_PSK = 2;
    public static final int SECURITY_TYPE_SAE = 4;
    public static final int SECURITY_TYPE_UNKNOWN = -1;
    public static final int SECURITY_TYPE_WAPI_CERT = 8;
    public static final int SECURITY_TYPE_WAPI_PSK = 7;
    public static final int SECURITY_TYPE_WEP = 1;
    WifiInfo() {}
    public double getLostTxPacketsPerSecond() { return 0.0; }
    public double getRetriedTxPacketsPerSecond() { return 0.0; }
    public double getSuccessfulTxPacketsPerSecond() { return 0.0; }
    public double getSuccessfulRxPacketsPerSecond() { return 0.0; }
    public int getScore() { return 0; }
    public java.lang.String getSSID() { return null; }
    public java.lang.String getBSSID() { return null; }
    @android.annotation.Nullable
    public android.net.MacAddress getApMldMacAddress() { return null; }
    public int getApMloLinkId() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.MloLink> getAffiliatedMloLinks() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.MloLink> getAssociatedMloLinks() { return null; }
    public int getRssi() { return 0; }
    public int getWifiStandard() { return 0; }
    public int getLinkSpeed() { return 0; }
    public int getTxLinkSpeedMbps() { return 0; }
    public int getMaxSupportedTxLinkSpeedMbps() { return 0; }
    public int getRxLinkSpeedMbps() { return 0; }
    public int getMaxSupportedRxLinkSpeedMbps() { return 0; }
    public int getFrequency() { return 0; }
    public java.lang.String getMacAddress() { return null; }
    public boolean isEphemeral() { return false; }
    public boolean isTrusted() { return false; }
    public boolean isRestricted() { return false; }
    public boolean isOemPaid() { return false; }
    public boolean isOemPrivate() { return false; }
    public boolean isCarrierMerged() { return false; }
    public boolean isOsuAp() { return false; }
    public boolean isPasspointAp() { return false; }
    @android.annotation.Nullable
    public java.lang.String getPasspointFqdn() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPasspointProviderFriendlyName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getRequestingPackageName() { return null; }
    public int getSubscriptionId() { return 0; }
    public int getNetworkId() { return 0; }
    public android.net.wifi.SupplicantState getSupplicantState() { return null; }
    @java.lang.Deprecated
    public int getIpAddress() { return 0; }
    public boolean getHiddenSSID() { return false; }
    public static android.net.NetworkInfo.DetailedState getDetailedStateOf(android.net.wifi.SupplicantState p0) { return null; }
    @android.annotation.Nullable
    public static java.lang.String sanitizeSsid(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.Nullable
    public java.util.List<android.net.wifi.ScanResult.InformationElement> getInformationElements() { return null; }
    public boolean isPrimary() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public android.net.wifi.WifiInfo makeCopy(long p0) { return null; }
    public long getApplicableRedactions() { return 0L; }
    public int getCurrentSecurityType() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getNetworkKey() { return null; }
    public boolean isApTidToLinkMappingNegotiationSupported() { return false; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.net.wifi.WifiInfo.Builder setSsid(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiInfo.Builder setBssid(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiInfo.Builder setRssi(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiInfo.Builder setNetworkId(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiInfo.Builder setCurrentSecurityType(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.WifiInfo build() { return null; }
    }
}
