package android.net.wifi;

public final class SoftApConfiguration implements android.os.Parcelable {
    public static final int BAND_2GHZ = 1;
    public static final int BAND_5GHZ = 2;
    public static final int BAND_6GHZ = 4;
    public static final int BAND_ANY = 7;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.SoftApConfiguration> CREATOR = null;
    public static final int SECURITY_TYPE_OPEN = 0;
    public static final int SECURITY_TYPE_WPA2_PSK = 1;
    public static final int SECURITY_TYPE_WPA3_SAE = 3;
    public static final int SECURITY_TYPE_WPA3_SAE_TRANSITION = 2;
    private SoftApConfiguration() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getSsid() { return null; }
    @android.annotation.Nullable
    public android.net.MacAddress getBssid() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPassphrase() { return null; }
    public boolean isHiddenSsid() { return false; }
    public int getBand() { return 0; }
    public int getChannel() { return 0; }
    public int getSecurityType() { return 0; }
    public int getMaxNumberOfClients() { return 0; }
    public boolean isAutoShutdownEnabled() { return false; }
    public long getShutdownTimeoutMillis() { return 0L; }
    public boolean isClientControlByUserEnabled() { return false; }
    @android.annotation.NonNull
    public java.util.List<android.net.MacAddress> getBlockedClientList() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.net.MacAddress> getAllowedClientList() { return null; }
    @android.annotation.Nullable
    public android.net.wifi.WifiConfiguration toWifiConfiguration() { return null; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.net.wifi.SoftApConfiguration p0) {}
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setSsid(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setBssid(android.net.MacAddress p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setPassphrase(java.lang.String p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setHiddenSsid(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setBand(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setChannel(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setMaxNumberOfClients(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setAutoShutdownEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setShutdownTimeoutMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setClientControlByUserEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setAllowedClientList(java.util.List<android.net.MacAddress> p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.SoftApConfiguration.Builder setBlockedClientList(java.util.List<android.net.MacAddress> p0) { return null; }
    }
}
