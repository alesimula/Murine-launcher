package android.net.wifi;

public final class SoftApConfiguration implements android.os.Parcelable {
    public static final int BAND_2GHZ = 1;
    public static final int BAND_5GHZ = 2;
    public static final int BAND_60GHZ = 8;
    public static final int BAND_6GHZ = 4;
    @java.lang.Deprecated
    public static final int BAND_ANY = 7;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.SoftApConfiguration> CREATOR = null;
    public static final long DEFAULT_TIMEOUT = -1L;
    public static final int RANDOMIZATION_NONE = 0;
    public static final int RANDOMIZATION_NON_PERSISTENT = 2;
    public static final int RANDOMIZATION_PERSISTENT = 1;
    public static final int SECURITY_TYPE_OPEN = 0;
    public static final int SECURITY_TYPE_WPA2_PSK = 1;
    public static final int SECURITY_TYPE_WPA3_OWE = 5;
    public static final int SECURITY_TYPE_WPA3_OWE_TRANSITION = 4;
    public static final int SECURITY_TYPE_WPA3_SAE = 3;
    public static final int SECURITY_TYPE_WPA3_SAE_TRANSITION = 2;
    SoftApConfiguration() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public java.lang.String getSsid() { return null; }
    @android.annotation.Nullable
    public android.net.wifi.WifiSsid getWifiSsid() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.ScanResult.InformationElement> getVendorElements() { return null; }
    @android.annotation.Nullable
    public android.net.MacAddress getBssid() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPassphrase() { return null; }
    public boolean isHiddenSsid() { return false; }
    @java.lang.Deprecated
    public int getBand() { return 0; }
    @java.lang.Deprecated
    public int getChannel() { return 0; }
    @android.annotation.NonNull
    public android.util.SparseIntArray getChannels() { return null; }
    public int getSecurityType() { return 0; }
    public int getMaxNumberOfClients() { return 0; }
    public boolean isAutoShutdownEnabled() { return false; }
    public long getShutdownTimeoutMillis() { return 0L; }
    public boolean isClientControlByUserEnabled() { return false; }
    @android.annotation.NonNull
    public java.util.List<android.net.MacAddress> getBlockedClientList() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.MacAddress> getAllowedClientList() { return null; }
    public int getMacRandomizationSetting() { return 0; }
    public boolean isBridgedModeOpportunisticShutdownEnabled() { return false; }
    public boolean isIeee80211axEnabled() { return false; }
    public boolean isIeee80211beEnabled() { return false; }
    @android.annotation.NonNull
    public int[] getAllowedAcsChannels(int p0) { return null; }
    public int getMaxChannelBandwidth() { return 0; }
    public boolean isUserConfiguration() { return false; }
    @android.annotation.NonNull
    public android.net.MacAddress getPersistentRandomizedMacAddress() { return null; }
    public long getBridgedModeOpportunisticShutdownTimeoutMillis() { return 0L; }
    @android.annotation.Nullable
    public android.net.wifi.WifiConfiguration toWifiConfiguration() { return null; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.net.wifi.SoftApConfiguration p0) {}
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration build() { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setSsid(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setWifiSsid(android.net.wifi.WifiSsid p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setVendorElements(java.util.List<android.net.wifi.ScanResult.InformationElement> p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setBssid(android.net.MacAddress p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setPassphrase(java.lang.String p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setHiddenSsid(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setBand(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setBands(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setChannel(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setChannels(android.util.SparseIntArray p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setMaxNumberOfClients(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setAutoShutdownEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setShutdownTimeoutMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setClientControlByUserEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setAllowedAcsChannels(int p0, int[] p1) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setMaxChannelBandwidth(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setAllowedClientList(java.util.List<android.net.MacAddress> p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setBlockedClientList(java.util.List<android.net.MacAddress> p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setMacRandomizationSetting(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setBridgedModeOpportunisticShutdownEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setIeee80211axEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setIeee80211beEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setBridgedModeOpportunisticShutdownTimeoutMillis(long p0) { return null; }
    }
}
