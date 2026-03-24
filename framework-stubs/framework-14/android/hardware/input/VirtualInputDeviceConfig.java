package android.hardware.input;

@android.annotation.SystemApi
public abstract class VirtualInputDeviceConfig {
    protected VirtualInputDeviceConfig(android.hardware.input.VirtualInputDeviceConfig.Builder<? extends android.hardware.input.VirtualInputDeviceConfig.Builder<?>> p0) {}
    protected VirtualInputDeviceConfig(android.os.Parcel p0) {}
    public int getVendorId() { return 0; }
    public int getProductId() { return 0; }
    public int getAssociatedDisplayId() { return 0; }
    public java.lang.String getInputDeviceName() { return null; }
    void writeToParcel(android.os.Parcel p0, int p1) {}

    public static abstract class Builder<T extends android.hardware.input.VirtualInputDeviceConfig.Builder<T>> {
        public Builder() {}
        public T setVendorId(int p0) { return null; }
        public T setProductId(int p0) { return null; }
        public T setAssociatedDisplayId(int p0) { return null; }
        public T setInputDeviceName(java.lang.String p0) { return null; }
        T self() { return null; }
    }
}
