package android.net.wifi;

public final class QosCharacteristics implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.QosCharacteristics> CREATOR = null;
    public static final int DELIVERY_RATIO_95 = 0;
    public static final int DELIVERY_RATIO_96 = 1;
    public static final int DELIVERY_RATIO_97 = 2;
    public static final int DELIVERY_RATIO_98 = 3;
    public static final int DELIVERY_RATIO_99 = 5;
    public static final int DELIVERY_RATIO_99_9 = 6;
    public static final int DELIVERY_RATIO_99_99 = 7;
    public static final int DELIVERY_RATIO_99_999 = 8;
    public static final int DELIVERY_RATIO_99_9999 = 9;
    QosCharacteristics() {}
    public int describeContents() { return 0; }
    public int getBurstSizeOctets() { return 0; }
    public int getCountExponent() { return 0; }
    public int getDelayBoundMicros() { return 0; }
    public int getDeliveryRatio() { return 0; }
    public int getMaxMsduSizeOctets() { return 0; }
    public int getMaxServiceIntervalMicros() { return 0; }
    public int getMeanDataRateKbps() { return 0; }
    public int getMinDataRateKbps() { return 0; }
    public int getMinServiceIntervalMicros() { return 0; }
    public int getMsduLifetimeMillis() { return 0; }
    public int getServiceStartTimeLinkId() { return 0; }
    public int getServiceStartTimeMicros() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0, int p1, int p2, int p3) {}
        @android.annotation.NonNull
        public android.net.wifi.QosCharacteristics build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.QosCharacteristics.Builder setBurstSizeOctets(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.QosCharacteristics.Builder setMaxMsduSizeOctets(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.QosCharacteristics.Builder setMeanDataRateKbps(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.QosCharacteristics.Builder setMsduDeliveryInfo(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.QosCharacteristics.Builder setMsduLifetimeMillis(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.QosCharacteristics.Builder setServiceStartTimeInfo(int p0, int p1) { return null; }
    }
}
