package android.frameworks.location.altitude;

public class AddMslAltitudeToLocationResponse implements android.os.Parcelable {
    public double mslAltitudeMeters;
    public float mslAltitudeAccuracyMeters;
    public boolean success;
    public static final android.os.Parcelable.Creator<android.frameworks.location.altitude.AddMslAltitudeToLocationResponse> CREATOR = null;
    public AddMslAltitudeToLocationResponse() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
