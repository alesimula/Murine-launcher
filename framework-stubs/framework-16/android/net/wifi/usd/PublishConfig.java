package android.net.wifi.usd;

@android.annotation.FlaggedApi("android.net.wifi.flags.usd")
public final class PublishConfig extends android.net.wifi.usd.Config implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.usd.PublishConfig> CREATOR = null;
    PublishConfig() { super(); }
    public int describeContents() { return 0; }
    public int getAnnouncementPeriodMillis() { return 0; }
    public int getSolicitedTransmissionType() { return 0; }
    public boolean isEventsEnabled() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.net.wifi.usd.PublishConfig build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.PublishConfig.Builder setAnnouncementPeriodMillis(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.PublishConfig.Builder setEventsEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.PublishConfig.Builder setOperatingFrequenciesMhz(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.PublishConfig.Builder setRxMatchFilter(java.util.List<byte[]> p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.PublishConfig.Builder setServiceProtoType(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.PublishConfig.Builder setServiceSpecificInfo(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.PublishConfig.Builder setSolicitedTransmissionType(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.PublishConfig.Builder setTtlSeconds(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.PublishConfig.Builder setTxMatchFilter(java.util.List<byte[]> p0) { return null; }
    }
}
