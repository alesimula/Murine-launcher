package android.net.wifi.aware;

public final class SubscribeConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.wifi.aware.SubscribeConfig> CREATOR = null;
    public static final int SUBSCRIBE_TYPE_ACTIVE = 1;
    public static final int SUBSCRIBE_TYPE_PASSIVE = 0;
    SubscribeConfig() {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isInstantCommunicationModeEnabled() { return false; }
    public int getInstantCommunicationBand() { return 0; }
    @android.annotation.Nullable
    public android.net.wifi.aware.AwarePairingConfig getPairingConfig() { return null; }
    public boolean isSuspendable() { return false; }

    public static final class Builder {
        public Builder() {}
        public android.net.wifi.aware.SubscribeConfig.Builder setServiceName(java.lang.String p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setServiceSpecificInfo(byte[] p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setMatchFilter(java.util.List<byte[]> p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setSubscribeType(int p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setTtlSec(int p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setTerminateNotificationEnabled(boolean p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setMinDistanceMm(int p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig.Builder setMaxDistanceMm(int p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.SubscribeConfig.Builder setInstantCommunicationModeEnabled(boolean p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.SubscribeConfig.Builder setPairingConfig(android.net.wifi.aware.AwarePairingConfig p0) { return null; }
        @android.annotation.NonNull
        public android.net.wifi.aware.SubscribeConfig.Builder setSuspendable(boolean p0) { return null; }
        public android.net.wifi.aware.SubscribeConfig build() { return null; }
    }
}
