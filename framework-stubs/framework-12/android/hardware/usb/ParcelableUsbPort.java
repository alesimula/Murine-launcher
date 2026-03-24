package android.hardware.usb;

public final class ParcelableUsbPort implements android.os.Parcelable {
    private final java.lang.String mId = null;
    private final int mSupportedModes = 0;
    private final int mSupportedContaminantProtectionModes = 0;
    private final boolean mSupportsEnableContaminantPresenceProtection = false;
    private final boolean mSupportsEnableContaminantPresenceDetection = false;
    public static final android.os.Parcelable.Creator<android.hardware.usb.ParcelableUsbPort> CREATOR = null;
    private ParcelableUsbPort(java.lang.String p0, int p1, int p2, boolean p3, boolean p4) {}
    public static android.hardware.usb.ParcelableUsbPort of(android.hardware.usb.UsbPort p0) { return null; }
    public android.hardware.usb.UsbPort getUsbPort(android.hardware.usb.UsbManager p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
