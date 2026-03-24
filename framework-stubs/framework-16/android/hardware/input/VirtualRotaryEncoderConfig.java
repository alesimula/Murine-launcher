package android.hardware.input;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.companion.virtualdevice.flags.virtual_rotary")
public final class VirtualRotaryEncoderConfig extends android.hardware.input.VirtualInputDeviceConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualRotaryEncoderConfig> CREATOR = null;
    VirtualRotaryEncoderConfig() { super((android.hardware.input.VirtualInputDeviceConfig.Builder)null); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder extends android.hardware.input.VirtualInputDeviceConfig.Builder<android.hardware.input.VirtualRotaryEncoderConfig.Builder> {
        public Builder() { super(); }
        @android.annotation.NonNull
        public android.hardware.input.VirtualRotaryEncoderConfig build() { return null; }
    }
}
