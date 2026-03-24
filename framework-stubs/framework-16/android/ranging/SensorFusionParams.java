package android.ranging;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class SensorFusionParams implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.SensorFusionParams> CREATOR = null;
    SensorFusionParams() {}
    public int describeContents() { return 0; }
    public boolean isSensorFusionEnabled() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.ranging.SensorFusionParams build() { return null; }
        @android.annotation.NonNull
        public android.ranging.SensorFusionParams.Builder setSensorFusionEnabled(boolean p0) { return null; }
    }
}
