package android.net.wifi;

public class WifiInfo implements android.os.Parcelable {
    public static final java.lang.String DEFAULT_MAC_ADDRESS = "02:00:00:00:00:00";
    public static final java.lang.String FREQUENCY_UNITS = "MHz";
    public static final int INVALID_RSSI = -127;
    public static final java.lang.String LINK_SPEED_UNITS = "Mbps";
    public static final int LINK_SPEED_UNKNOWN = -1;
    WifiInfo() {}
    public double getLostTxPacketsPerSecond() { return 0.0; }
    public double getRetriedTxPacketsPerSecond() { return 0.0; }
    public double getSuccessfulTxPacketsPerSecond() { return 0.0; }
    public double getSuccessfulRxPacketsPerSecond() { return 0.0; }
    public int getScore() { return 0; }
    public java.lang.String getSSID() { return null; }
    public java.lang.String getBSSID() { return null; }
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
    public boolean isOsuAp() { return false; }
    public boolean isPasspointAp() { return false; }
    @android.annotation.Nullable
    public java.lang.String getPasspointFqdn() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPasspointProviderFriendlyName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getRequestingPackageName() { return null; }
    public int getNetworkId() { return 0; }
    public android.net.wifi.SupplicantState getSupplicantState() { return null; }
    public int getIpAddress() { return 0; }
    public boolean getHiddenSSID() { return false; }
    public static android.net.NetworkInfo.DetailedState getDetailedStateOf(android.net.wifi.SupplicantState p0) { return null; }
    @android.annotation.Nullable
    public static java.lang.String sanitizeSsid(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

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
        public android.net.wifi.WifiInfo build() { return null; }
    }
}
