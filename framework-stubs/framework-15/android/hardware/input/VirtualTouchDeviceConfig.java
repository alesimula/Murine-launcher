package android.hardware.input;

abstract class VirtualTouchDeviceConfig extends android.hardware.input.VirtualInputDeviceConfig {
    VirtualTouchDeviceConfig(android.hardware.input.VirtualTouchDeviceConfig.Builder<? extends android.hardware.input.VirtualTouchDeviceConfig.Builder<?>> p0) { super((android.hardware.input.VirtualInputDeviceConfig.Builder)null); }
    VirtualTouchDeviceConfig(android.os.Parcel p0) { super((android.hardware.input.VirtualInputDeviceConfig.Builder)null); }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    java.lang.String additionalFieldsToString() { return null; }

    static abstract class Builder<T extends android.hardware.input.VirtualTouchDeviceConfig.Builder<T>> extends android.hardware.input.VirtualInputDeviceConfig.Builder<T> {
        Builder(int p0, int p1) { super(); }
    }
}
