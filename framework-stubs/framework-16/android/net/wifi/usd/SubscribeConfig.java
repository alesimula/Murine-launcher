package android.net.wifi.usd;

@android.annotation.FlaggedApi("android.net.wifi.flags.usd")
public final class SubscribeConfig extends android.net.wifi.usd.Config implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.usd.SubscribeConfig> CREATOR = null;
    SubscribeConfig() { super(); }
    public int describeContents() { return 0; }
    public int getQueryPeriodMillis() { return 0; }
    @android.annotation.Nullable
    public int[] getRecommendedOperatingFrequenciesMhz() { return null; }
    public int getSubscribeType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("android.net.wifi.flags.usd")
    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.net.wifi.usd.SubscribeConfig build() { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.SubscribeConfig.Builder setOperatingFrequenciesMhz(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.SubscribeConfig.Builder setQueryPeriodMillis(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.SubscribeConfig.Builder setRecommendedOperatingFrequenciesMhz(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.SubscribeConfig.Builder setRxMatchFilter(java.util.List<byte[]> p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.SubscribeConfig.Builder setServiceProtoType(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.SubscribeConfig.Builder setServiceSpecificInfo(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.SubscribeConfig.Builder setSubscribeType(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.SubscribeConfig.Builder setTtlSeconds(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.usd.SubscribeConfig.Builder setTxMatchFilter(java.util.List<byte[]> p0) { return null; }
    }
}
