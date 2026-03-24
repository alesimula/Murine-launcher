package android.hardware.gnss;

public class SatelliteVelocityEcef implements android.os.Parcelable {
    public double velXMps;
    public double velYMps;
    public double velZMps;
    public double ureRateMps;
    public static final android.os.Parcelable.Creator<android.hardware.gnss.SatelliteVelocityEcef> CREATOR = null;
    public SatelliteVelocityEcef() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
