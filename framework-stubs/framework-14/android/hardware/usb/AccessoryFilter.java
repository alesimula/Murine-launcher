package android.hardware.usb;

public class AccessoryFilter {
    public final java.lang.String mManufacturer = null;
    public final java.lang.String mModel = null;
    public final java.lang.String mVersion = null;
    public AccessoryFilter(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public AccessoryFilter(android.hardware.usb.UsbAccessory p0) {}
    public AccessoryFilter(android.hardware.usb.AccessoryFilter p0) {}
    public static android.hardware.usb.AccessoryFilter read(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { return null; }
    public void write(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
    public boolean matches(android.hardware.usb.UsbAccessory p0) { return false; }
    public boolean contains(android.hardware.usb.AccessoryFilter p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void dump(com.android.internal.util.dump.DualDumpOutputStream p0, java.lang.String p1, long p2) {}
}
