package android.hardware.hdmi;

@android.annotation.SystemApi
public final class HdmiHotplugEvent implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.hdmi.HdmiHotplugEvent> CREATOR = null;
    public HdmiHotplugEvent(int p0, boolean p1) {}
    public int getPort() { return 0; }
    public boolean isConnected() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
