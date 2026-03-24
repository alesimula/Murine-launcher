package android.net.wifi.aware;

public final class PublishConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.aware.PublishConfig> CREATOR = null;
    public static final int PUBLISH_TYPE_SOLICITED = 1;
    public static final int PUBLISH_TYPE_UNSOLICITED = 0;
    PublishConfig() {}
    public int describeContents() { return 0; }
    public int getInstantCommunicationBand() { return 0; }
    @android.annotation.Nullable
    public android.net.wifi.aware.AwarePairingConfig getPairingConfig() { return null; }
    @android.annotation.Nullable
    public android.net.wifi.aware.WifiAwareDataPathSecurityConfig getSecurityConfig() { return null; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.OuiKeyedData> getVendorData() { return null; }
    public boolean isInstantCommunicationModeEnabled() { return false; }
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public boolean isPeriodicRangingResultsEnabled() { return false; }
    public boolean isSuspendable() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public android.net.wifi.aware.PublishConfig build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.PublishConfig.Builder setDataPathSecurityConfig(android.net.wifi.aware.WifiAwareDataPathSecurityConfig p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.PublishConfig.Builder setInstantCommunicationModeEnabled(boolean p0, int p1) { return null; }
        public android.net.wifi.aware.PublishConfig.Builder setMatchFilter(java.util.List<byte[]> p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.PublishConfig.Builder setPairingConfig(android.net.wifi.aware.AwarePairingConfig p0) { return null; }
        @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
        @android.annotation.NonNull
        public android.net.wifi.aware.PublishConfig.Builder setPeriodicRangingResultsEnabled(boolean p0) { return null; }
        public android.net.wifi.aware.PublishConfig.Builder setPublishType(int p0) { return null; }
        public android.net.wifi.aware.PublishConfig.Builder setRangingEnabled(boolean p0) { return null; }
        public android.net.wifi.aware.PublishConfig.Builder setServiceName(java.lang.String p0) { return null; }
        public android.net.wifi.aware.PublishConfig.Builder setServiceSpecificInfo(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.PublishConfig.Builder setSuspendable(boolean p0) { return null; }
        public android.net.wifi.aware.PublishConfig.Builder setTerminateNotificationEnabled(boolean p0) { return null; }
        public android.net.wifi.aware.PublishConfig.Builder setTtlSec(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.aware.PublishConfig.Builder setVendorData(java.util.List<android.net.wifi.OuiKeyedData> p0) { return null; }
    }
}
