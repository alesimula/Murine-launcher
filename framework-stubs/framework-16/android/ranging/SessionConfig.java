package android.ranging;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class SessionConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.SessionConfig> CREATOR = null;
    SessionConfig() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.ranging.DataNotificationConfig getDataNotificationConfig() { return null; }
    public int getRangingMeasurementsLimit() { return 0; }
    @android.annotation.NonNull
    public android.ranging.SensorFusionParams getSensorFusionParams() { return null; }
    public boolean isAngleOfArrivalNeeded() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.ranging.SessionConfig build() { return null; }
        @android.annotation.NonNull
        public android.ranging.SessionConfig.Builder setAngleOfArrivalNeeded(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.SessionConfig.Builder setDataNotificationConfig(android.ranging.DataNotificationConfig p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.SessionConfig.Builder setRangingMeasurementsLimit(int p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.SessionConfig.Builder setSensorFusionParams(android.ranging.SensorFusionParams p0) { return null; }
    }
}
