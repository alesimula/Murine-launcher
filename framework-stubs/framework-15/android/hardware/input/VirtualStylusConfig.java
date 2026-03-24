package android.hardware.input;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.companion.virtual.flags.virtual_stylus")
public final class VirtualStylusConfig extends android.hardware.input.VirtualTouchDeviceConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualStylusConfig> CREATOR = null;
    VirtualStylusConfig() { super((android.hardware.input.VirtualTouchDeviceConfig.Builder)null); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("android.companion.virtual.flags.virtual_stylus")
    public static final class Builder extends android.hardware.input.VirtualTouchDeviceConfig.Builder<android.hardware.input.VirtualStylusConfig.Builder> {
        public Builder(int p0, int p1) { super(0, 0); }
        @android.annotation.NonNull
        public android.hardware.input.VirtualStylusConfig build() { return null; }
    }
}
