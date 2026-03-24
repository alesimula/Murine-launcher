package android.hardware.input;

public class IInputDeviceBatteryState implements android.os.Parcelable {
    public int deviceId;
    public long updateTime;
    public boolean isPresent;
    public int status;
    public float capacity;
    public static final android.os.Parcelable.Creator<android.hardware.input.IInputDeviceBatteryState> CREATOR = null;
    public IInputDeviceBatteryState() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
}
