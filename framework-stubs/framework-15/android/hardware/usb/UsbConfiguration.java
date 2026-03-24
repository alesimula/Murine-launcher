package android.hardware.usb;

public class UsbConfiguration implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.usb.UsbConfiguration> CREATOR = null;
    public UsbConfiguration(int p0, java.lang.String p1, int p2, int p3) {}
    public int getId() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getName() { return null; }
    public boolean isSelfPowered() { return false; }
    public boolean isRemoteWakeup() { return false; }
    public int getAttributes() { return 0; }
    public int getMaxPower() { return 0; }
    public int getInterfaceCount() { return 0; }
    @android.annotation.NonNull
    public android.hardware.usb.UsbInterface getInterface(int p0) { return null; }
    public void setInterfaces(android.os.Parcelable[] p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
