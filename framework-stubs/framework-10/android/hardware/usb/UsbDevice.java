package android.hardware.usb;

public class UsbDevice implements android.os.Parcelable {
    private static final java.lang.String TAG = "UsbDevice";
    private static final boolean DEBUG = false;
    private final java.lang.String mName = null;
    private final java.lang.String mManufacturerName = null;
    private final java.lang.String mProductName = null;
    private final java.lang.String mVersion = null;
    private final android.hardware.usb.UsbConfiguration[] mConfigurations = null;
    private final android.hardware.usb.IUsbSerialReader mSerialNumberReader = null;
    private final int mVendorId = 0;
    private final int mProductId = 0;
    private final int mClass = 0;
    private final int mSubclass = 0;
    private final int mProtocol = 0;
    @android.annotation.UnsupportedAppUsage
    private android.hardware.usb.UsbInterface[] mInterfaces;
    public static final android.os.Parcelable.Creator<android.hardware.usb.UsbDevice> CREATOR = null;
    private UsbDevice(java.lang.String p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, android.hardware.usb.UsbConfiguration[] p9, android.hardware.usb.IUsbSerialReader p10) {}
    public java.lang.String getDeviceName() { return null; }
    public java.lang.String getManufacturerName() { return null; }
    public java.lang.String getProductName() { return null; }
    public java.lang.String getVersion() { return null; }
    public java.lang.String getSerialNumber() { return null; }
    public int getDeviceId() { return 0; }
    public int getVendorId() { return 0; }
    public int getProductId() { return 0; }
    public int getDeviceClass() { return 0; }
    public int getDeviceSubclass() { return 0; }
    public int getDeviceProtocol() { return 0; }
    public int getConfigurationCount() { return 0; }
    public android.hardware.usb.UsbConfiguration getConfiguration(int p0) { return null; }
    private android.hardware.usb.UsbInterface[] getInterfaceList() { return null; }
    public int getInterfaceCount() { return 0; }
    public android.hardware.usb.UsbInterface getInterface(int p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static int getDeviceId(java.lang.String p0) { return 0; }
    public static java.lang.String getDeviceName(int p0) { return null; }
    private static native int native_get_device_id(java.lang.String p0);
    private static native java.lang.String native_get_device_name(int p0);

    public static class Builder {
        private final java.lang.String mName = null;
        private final int mVendorId = 0;
        private final int mProductId = 0;
        private final int mClass = 0;
        private final int mSubclass = 0;
        private final int mProtocol = 0;
        private final java.lang.String mManufacturerName = null;
        private final java.lang.String mProductName = null;
        private final java.lang.String mVersion = null;
        private final android.hardware.usb.UsbConfiguration[] mConfigurations = null;
        public final java.lang.String serialNumber = null;
        public Builder(java.lang.String p0, int p1, int p2, int p3, int p4, int p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, android.hardware.usb.UsbConfiguration[] p9, java.lang.String p10) {}
        public android.hardware.usb.UsbDevice build(android.hardware.usb.IUsbSerialReader p0) { return null; }
    }
}
