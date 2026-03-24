package android.hardware.thermal;

public class Temperature implements android.os.Parcelable {
    public int type;
    public java.lang.String name;
    public float value;
    public int throttlingStatus;
    public static final android.os.Parcelable.Creator<android.hardware.thermal.Temperature> CREATOR = null;
    public Temperature() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
