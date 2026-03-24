package android.ranging.wifi.rtt;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_rtt_enabled")
public final class RttRangingParams implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.wifi.rtt.RttRangingParams> CREATOR = null;
    RttRangingParams() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public byte[] getMatchFilter() { return null; }
    public int getRangingUpdateRate() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getServiceName() { return null; }
    public boolean isPeriodicRangingHwFeatureEnabled() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(java.lang.String p0) {}
        @android.annotation.NonNull
        public android.ranging.wifi.rtt.RttRangingParams build() { return null; }
        @android.annotation.NonNull
        public android.ranging.wifi.rtt.RttRangingParams.Builder setMatchFilter(byte[] p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.wifi.rtt.RttRangingParams.Builder setPeriodicRangingHwFeatureEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.wifi.rtt.RttRangingParams.Builder setRangingUpdateRate(int p0) { return null; }
    }
}
