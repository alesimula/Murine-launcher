package android.net.wifi;

@android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
public final class QosCharacteristics implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.QosCharacteristics> CREATOR = null;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int DELIVERY_RATIO_95 = 0;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int DELIVERY_RATIO_96 = 1;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int DELIVERY_RATIO_97 = 2;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int DELIVERY_RATIO_98 = 3;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int DELIVERY_RATIO_99 = 5;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int DELIVERY_RATIO_99_9 = 6;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int DELIVERY_RATIO_99_99 = 7;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int DELIVERY_RATIO_99_999 = 8;
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final int DELIVERY_RATIO_99_9999 = 9;
    QosCharacteristics() {}
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int describeContents() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getBurstSizeOctets() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getCountExponent() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getDelayBoundMicros() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getDeliveryRatio() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getMaxMsduSizeOctets() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getMaxServiceIntervalMicros() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getMeanDataRateKbps() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getMinDataRateKbps() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getMinServiceIntervalMicros() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getMsduLifetimeMillis() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getServiceStartTimeLinkId() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public int getServiceStartTimeMicros() { return 0; }
    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
    public static final class Builder {
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        public Builder(int p0, int p1, int p2, int p3) {}
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.QosCharacteristics build() { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.QosCharacteristics.Builder setBurstSizeOctets(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.QosCharacteristics.Builder setMaxMsduSizeOctets(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.QosCharacteristics.Builder setMeanDataRateKbps(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.QosCharacteristics.Builder setMsduDeliveryInfo(int p0, int p1) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.QosCharacteristics.Builder setMsduLifetimeMillis(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.wifi.flags.android_v_wifi_api")
        @android.annotation.NonNull
        public android.net.wifi.QosCharacteristics.Builder setServiceStartTimeInfo(int p0, int p1) { return null; }
    }
}
