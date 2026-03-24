package android.hardware.thermal;

public class CoolingDevice implements android.os.Parcelable {
    public int type;
    public java.lang.String name;
    public long value;
    public static final android.os.Parcelable.Creator<android.hardware.thermal.CoolingDevice> CREATOR = null;
    public CoolingDevice() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
