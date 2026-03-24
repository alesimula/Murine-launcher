package android.hardware.usb;

public class UsbDevice implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.usb.UsbDevice> CREATOR = null;
    @android.annotation.NonNull
    public java.lang.String getDeviceName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getManufacturerName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getProductName() { return null; }
    @android.annotation.NonNull
    public java.lang.String getVersion() { return null; }
    @android.annotation.Nullable
    public java.lang.String getSerialNumber() { return null; }
    public int getDeviceId() { return 0; }
    public int getVendorId() { return 0; }
    public int getProductId() { return 0; }
    public int getDeviceClass() { return 0; }
    public int getDeviceSubclass() { return 0; }
    public int getDeviceProtocol() { return 0; }
    public int getConfigurationCount() { return 0; }
    public boolean getHasAudioPlayback() { return false; }
    public boolean getHasAudioCapture() { return false; }
    public boolean getHasMidi() { return false; }
    public boolean getHasVideoPlayback() { return false; }
    public boolean getHasVideoCapture() { return false; }
    @android.annotation.NonNull
    public android.hardware.usb.UsbConfiguration getConfiguration(int p0) { return null; }
    public int getInterfaceCount() { return 0; }
    @android.annotation.NonNull
    public android.hardware.usb.UsbInterface getInterface(int p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static int getDeviceId(java.lang.String p0) { return 0; }
    public static java.lang.String getDeviceName(int p0) { return null; }

    public static class Builder {
        @android.annotation.Nullable
        public final java.lang.String serialNumber = null;
        public Builder(java.lang.String p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, android.hardware.usb.UsbConfiguration[] p9, java.lang.String p10, boolean p11, boolean p12, boolean p13, boolean p14, boolean p15) {}
        public android.hardware.usb.UsbDevice build(android.hardware.usb.IUsbSerialReader p0) { return null; }
    }
}
