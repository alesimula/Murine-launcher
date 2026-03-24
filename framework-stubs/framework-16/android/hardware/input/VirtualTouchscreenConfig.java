package android.hardware.input;

@android.annotation.SystemApi
public final class VirtualTouchscreenConfig extends android.hardware.input.VirtualTouchDeviceConfig implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualTouchscreenConfig> CREATOR = null;
    VirtualTouchscreenConfig() { super((android.hardware.input.VirtualTouchDeviceConfig.Builder)null); }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder extends android.hardware.input.VirtualTouchDeviceConfig.Builder<android.hardware.input.VirtualTouchscreenConfig.Builder> {
        public Builder(int p0, int p1) { super(0, 0); }
        @android.annotation.NonNull
        public android.hardware.input.VirtualTouchscreenConfig build() { return null; }
    }
}
