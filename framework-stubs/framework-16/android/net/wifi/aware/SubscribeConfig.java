package android.net.wifi.aware;

public final class SubscribeConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.aware.SubscribeConfig> CREATOR = null;
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public static final int PERIODIC_RANGING_INTERVAL_1024TU = 1024;
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public static final int PERIODIC_RANGING_INTERVAL_128TU = 128;
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public static final int PERIODIC_RANGING_INTERVAL_2048TU = 2048;
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public static final int PERIODIC_RANGING_INTERVAL_256TU = 256;
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public static final int PERIODIC_RANGING_INTERVAL_4096TU = 4096;
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public static final int PERIODIC_RANGING_INTERVAL_512TU = 512;
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public static final int PERIODIC_RANGING_INTERVAL_8192TU = 8192;
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public static final int PERIODIC_RANGING_INTERVAL_NONE = 0;
    public static final int SUBSCRIBE_TYPE_ACTIVE = 1;
    public static final int SUBSCRIBE_TYPE_PASSIVE = 0;
    SubscribeConfig() {}
    public int describeContents() { return 0; }
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public int getCenterFreq0Mhz() { return 0; }
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public int getCenterFreq1Mhz() { return 0; }
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public int getChannelWidth() { return 0; }
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public int getFrequencyMhz() { return 0; }
    public int getInstantCommunicationBand() { return 0; }
    @android.annotation.Nullable
    public android.net.wifi.aware.AwarePairingConfig getPairingConfig() { return null; }
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public int getPeriodicRangingInterval() { return 0; }
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public int getPreamble() { return 0; }
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public int getRttBurstSize() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.OuiKeyedData> getVendorData() { return null; }
    public boolean isInstantCommunicationModeEnabled() { return false; }
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
    public boolean isPeriodicRangingEnabled() { return false; }
    public boolean isSuspendable() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public android.net.wifi.aware.SubscribeConfig build() { return null; }
        @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
        @android.annotation.NonNull
        public android.net.wifi.aware.SubscribeConfig.Builder setCenterFreq0Mhz(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
        @android.annotation.NonNull
        public android.net.wifi.aware.SubscribeConfig.Builder setCenterFreq1Mhz(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
        @android.annotation.NonNull
        public android.net.wifi.aware.SubscribeConfig.Builder setChannelWidth(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
        @android.annotation.NonNull
        public android.net.wifi.aware.SubscribeConfig.Builder setFrequencyMhz(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.SubscribeConfig.Builder setInstantCommunicationModeEnabled(boolean p0, int p1) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setMatchFilter(java.util.List<byte[]> p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setMaxDistanceMm(int p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setMinDistanceMm(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.SubscribeConfig.Builder setPairingConfig(android.net.wifi.aware.AwarePairingConfig p0) { return null; }
        @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
        @android.annotation.NonNull
        public android.net.wifi.aware.SubscribeConfig.Builder setPeriodicRangingEnabled(boolean p0) { return null; }
        @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
        @android.annotation.NonNull
        public android.net.wifi.aware.SubscribeConfig.Builder setPeriodicRangingInterval(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
        @android.annotation.NonNull
        public android.net.wifi.aware.SubscribeConfig.Builder setPreamble(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
        @android.annotation.NonNull
        public android.net.wifi.aware.SubscribeConfig.Builder setRttBurstSize(int p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setServiceName(java.lang.String p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setServiceSpecificInfo(byte[] p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setSubscribeType(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.SubscribeConfig.Builder setSuspendable(boolean p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setTerminateNotificationEnabled(boolean p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setTtlSec(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.aware.SubscribeConfig.Builder setVendorData(java.util.List<android.net.wifi.OuiKeyedData> p0) { return null; }
    }
}
