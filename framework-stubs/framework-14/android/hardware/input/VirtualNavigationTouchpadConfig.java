package android.hardware.input;

@android.annotation.SystemApi
public final class VirtualNavigationTouchpadConfig extends android.hardware.input.VirtualInputDeviceConfig implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualNavigationTouchpadConfig> CREATOR = null;
    VirtualNavigationTouchpadConfig() { super((android.hardware.input.VirtualInputDeviceConfig.Builder)null); }
    public int getHeight() { return 0; }
    public int getWidth() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder extends android.hardware.input.VirtualInputDeviceConfig.Builder<android.hardware.input.VirtualNavigationTouchpadConfig.Builder> {
        public Builder(int p0, int p1) { super(); }
        public android.hardware.input.VirtualNavigationTouchpadConfig build() { return null; }
    }
}
