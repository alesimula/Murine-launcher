package android.net.wifi.rtt;

public final class RangingResult implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.rtt.RangingResult> CREATOR = null;
    public static final int STATUS_FAIL = 1;
    public static final int STATUS_RESPONDER_DOES_NOT_SUPPORT_IEEE80211MC = 2;
    public static final int STATUS_SUCCESS = 0;
    public static final int UNSPECIFIED = -1;
    RangingResult() {}
    public int describeContents() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int get80211azInitiatorTxLtfRepetitionsCount() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int get80211azNumberOfRxSpatialStreams() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int get80211azNumberOfTxSpatialStreams() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int get80211azResponderTxLtfRepetitionsCount() { return 0; }
    public int getDistanceMm() { return 0; }
    public int getDistanceStdDevMm() { return 0; }
    @android.annotation.NonNull
    public byte[] getLci() { return null; }
    @android.annotation.NonNull
    public byte[] getLcr() { return null; }
    @android.annotation.Nullable
    public android.net.MacAddress getMacAddress() { return null; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public long getMaxTimeBetweenNtbMeasurementsMicros() { return 0L; }
    public int getMeasurementBandwidth() { return 0; }
    public int getMeasurementChannelFrequencyMHz() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public long getMinTimeBetweenNtbMeasurementsMicros() { return 0L; }
    public int getNumAttemptedMeasurements() { return 0; }
    public int getNumSuccessfulMeasurements() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    public long getPasnComebackAfterMillis() { return 0L; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    @android.annotation.Nullable
    public byte[] getPasnComebackCookie() { return null; }
    @android.annotation.Nullable
    public android.net.wifi.aware.PeerHandle getPeerHandle() { return null; }
    public long getRangingTimestampMillis() { return 0L; }
    public int getRssi() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    public int getSecureHeLtfProtocolVersion() { return 0; }
    public int getStatus() { return 0; }
    @android.annotation.Nullable
    public android.net.wifi.rtt.ResponderLocation getUnverifiedResponderLocation() { return null; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.NonNull
    public java.util.List<android.net.wifi.OuiKeyedData> getVendorData() { return null; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public boolean is80211azNtbMeasurement() { return false; }
    public boolean is80211mcMeasurement() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    public boolean isRangingAuthenticated() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    public boolean isRangingFrameProtected() { return false; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
    public boolean isSecureHeLtfEnabled() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final class Builder {
        public Builder() {}
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult build() { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder set80211azInitiatorTxLtfRepetitionsCount(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder set80211azNtbMeasurement(boolean p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder set80211azNumberOfRxSpatialStreams(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder set80211azNumberOfTxSpatialStreams(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder set80211azResponderTxLtfRepetitionsCount(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder set80211mcMeasurement(boolean p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setDistanceMm(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setDistanceStdDevMm(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setLci(byte[] p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setLcr(byte[] p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setMacAddress(android.net.MacAddress p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setMaxTimeBetweenNtbMeasurementsMicros(long p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setMeasurementBandwidth(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setMeasurementChannelFrequencyMHz(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setMinTimeBetweenNtbMeasurementsMicros(long p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setNumAttemptedMeasurements(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setNumSuccessfulMeasurements(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setPasnComebackAfterMillis(long p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setPasnComebackCookie(byte[] p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setPeerHandle(android.net.wifi.aware.PeerHandle p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setRangingAuthenticated(boolean p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setRangingFrameProtected(boolean p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setRangingTimestampMillis(long p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setRssi(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setSecureHeLtfEnabled(boolean p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.secure_ranging")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setSecureHeLtfProtocolVersion(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setStatus(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setUnverifiedResponderLocation(android.net.wifi.rtt.ResponderLocation p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.rtt.RangingResult.Builder setVendorData(java.util.List<android.net.wifi.OuiKeyedData> p0) { return null; }
    }
}
