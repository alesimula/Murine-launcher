package android.hardware.security.keymint;

public class DeviceInfo implements android.os.Parcelable {
    public byte[] deviceInfo;
    public static final android.os.Parcelable.Creator<android.hardware.security.keymint.DeviceInfo> CREATOR = null;
    public DeviceInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
