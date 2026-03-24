package android.ranging.oob;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class OobInitiatorRangingConfig extends android.ranging.RangingConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.oob.OobInitiatorRangingConfig> CREATOR = null;
    public static final int RANGING_MODE_AUTO = 0;
    public static final int RANGING_MODE_FUSED = 3;
    public static final int RANGING_MODE_HIGH_ACCURACY = 1;
    public static final int RANGING_MODE_HIGH_ACCURACY_PREFERRED = 2;
    public static final int SECURITY_LEVEL_BASIC = 0;
    public static final int SECURITY_LEVEL_SECURE = 1;
    OobInitiatorRangingConfig() { super(); }
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.ranging.oob.DeviceHandle> getDeviceHandles() { return null; }
    @android.annotation.NonNull
    public java.time.Duration getFastestRangingInterval() { return null; }
    @android.annotation.NonNull
    public android.util.Range<java.time.Duration> getRangingIntervalRange() { return null; }
    public int getRangingMode() { return 0; }
    @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_updates_25q4")
    @android.annotation.NonNull
    public java.util.Set<java.lang.Integer> getRangingTechnologyFilter() { return null; }
    public int getSecurityLevel() { return 0; }
    @android.annotation.NonNull
    public java.time.Duration getSlowestRangingInterval() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.ranging.oob.OobInitiatorRangingConfig.Builder addDeviceHandle(android.ranging.oob.DeviceHandle p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.oob.OobInitiatorRangingConfig.Builder addDeviceHandles(java.util.List<android.ranging.oob.DeviceHandle> p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.oob.OobInitiatorRangingConfig build() { return null; }
        @android.annotation.NonNull
        public android.ranging.oob.OobInitiatorRangingConfig.Builder setFastestRangingInterval(java.time.Duration p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.oob.OobInitiatorRangingConfig.Builder setRangingMode(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_updates_25q4")
        @android.annotation.NonNull
        public android.ranging.oob.OobInitiatorRangingConfig.Builder setRangingTechnologyFilter(java.util.Set<java.lang.Integer> p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.oob.OobInitiatorRangingConfig.Builder setSecurityLevel(int p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.oob.OobInitiatorRangingConfig.Builder setSlowestRangingInterval(java.time.Duration p0) { return null; }
    }
}
