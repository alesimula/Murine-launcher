package android.ranging.oob;

@android.annotation.FlaggedApi("com.android.ranging.flags.ranging_stack_enabled")
public final class OobResponderRangingConfig extends android.ranging.RangingConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.ranging.oob.OobResponderRangingConfig> CREATOR = null;
    OobResponderRangingConfig() { super(); }
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.ranging.oob.DeviceHandle getDeviceHandle() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(android.ranging.oob.DeviceHandle p0) {}
        @android.annotation.NonNull
        public android.ranging.oob.OobResponderRangingConfig build() { return null; }
    }
}
