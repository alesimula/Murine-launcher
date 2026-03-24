package android.hardware.usb;

public class UsbInterface implements android.os.Parcelable {
    private final int mId = 0;
    private final int mAlternateSetting = 0;
    private final java.lang.String mName = null;
    private final int mClass = 0;
    private final int mSubclass = 0;
    private final int mProtocol = 0;
    private android.os.Parcelable[] mEndpoints;
    public static final android.os.Parcelable.Creator<android.hardware.usb.UsbInterface> CREATOR = null;
    public UsbInterface(int p0, int p1, java.lang.String p2, int p3, int p4, int p5) {}
    public int getId() { return 0; }
    public int getAlternateSetting() { return 0; }
    public java.lang.String getName() { return null; }
    public int getInterfaceClass() { return 0; }
    public int getInterfaceSubclass() { return 0; }
    public int getInterfaceProtocol() { return 0; }
    public int getEndpointCount() { return 0; }
    public android.hardware.usb.UsbEndpoint getEndpoint(int p0) { return null; }
    public void setEndpoints(android.os.Parcelable[] p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
