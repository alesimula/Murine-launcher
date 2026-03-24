package android.hardware.usb;

public class DeviceFilter {
    public final int mVendorId = 0;
    public final int mProductId = 0;
    public final int mClass = 0;
    public final int mSubclass = 0;
    public final int mProtocol = 0;
    public final java.lang.String mManufacturerName = null;
    public final java.lang.String mProductName = null;
    public final java.lang.String mSerialNumber = null;
    public final java.lang.String mInterfaceName = null;
    public DeviceFilter(int p0, int p1, int p2, int p3, int p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8) {}
    public DeviceFilter(android.hardware.usb.UsbDevice p0) {}
    public DeviceFilter(android.hardware.usb.DeviceFilter p0) {}
    public static android.hardware.usb.DeviceFilter read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public void write(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
    public boolean matches(android.hardware.usb.UsbDevice p0) { return false; }
    public boolean contains(android.hardware.usb.DeviceFilter p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void dump(com.android.internal.util.dump.DualDumpOutputStream p0, java.lang.String p1, long p2) {}
}
