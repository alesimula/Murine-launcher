package android.ranging.raw;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class RawResponderRangingConfig extends android.ranging.RangingConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.raw.RawResponderRangingConfig> CREATOR = null;
    RawResponderRangingConfig() { super(); }
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.ranging.raw.RawRangingDevice getRawRangingDevice() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.ranging.raw.RawResponderRangingConfig build() { return null; }
        @android.annotation.NonNull
        public android.ranging.raw.RawResponderRangingConfig.Builder setRawRangingDevice(android.ranging.raw.RawRangingDevice p0) { return null; }
    }
}
