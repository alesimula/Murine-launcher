package android.hardware.usb;

public class UsbAccessory implements android.os.Parcelable {
    public static final int MANUFACTURER_STRING = 0;
    public static final int MODEL_STRING = 1;
    public static final int DESCRIPTION_STRING = 2;
    public static final int VERSION_STRING = 3;
    public static final int URI_STRING = 4;
    public static final int SERIAL_STRING = 5;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.usb.UsbAccessory> CREATOR = null;
    public UsbAccessory(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, android.hardware.usb.IUsbSerialReader p5) {}
    @java.lang.Deprecated
    public UsbAccessory(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5) {}
    @android.annotation.NonNull
    public java.lang.String getManufacturer() { return null; }
    @android.annotation.NonNull
    public java.lang.String getModel() { return null; }
    @android.annotation.Nullable
    public java.lang.String getDescription() { return null; }
    @android.annotation.Nullable
    public java.lang.String getVersion() { return null; }
    @android.annotation.Nullable
    public java.lang.String getUri() { return null; }
    @android.annotation.Nullable
    public java.lang.String getSerial() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
