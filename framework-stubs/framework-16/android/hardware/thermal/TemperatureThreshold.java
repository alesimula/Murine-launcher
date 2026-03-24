package android.hardware.thermal;

public class TemperatureThreshold implements android.os.Parcelable {
    public int type;
    public java.lang.String name;
    public float[] hotThrottlingThresholds;
    public float[] coldThrottlingThresholds;
    public static final android.os.Parcelable.Creator<android.hardware.thermal.TemperatureThreshold> CREATOR = null;
    public TemperatureThreshold() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
