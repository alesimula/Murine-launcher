package android.ranging.raw;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class RawInitiatorRangingConfig extends android.ranging.RangingConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.raw.RawInitiatorRangingConfig> CREATOR = null;
    RawInitiatorRangingConfig() { super(); }
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.ranging.raw.RawRangingDevice> getRawRangingDevices() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.ranging.raw.RawInitiatorRangingConfig.Builder addRawRangingDevice(android.ranging.raw.RawRangingDevice p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.raw.RawInitiatorRangingConfig.Builder addRawRangingDevices(java.util.List<android.ranging.raw.RawRangingDevice> p0) { return null; }
        @android.annotation.NonNull
        public android.ranging.raw.RawInitiatorRangingConfig build() { return null; }
    }
}
