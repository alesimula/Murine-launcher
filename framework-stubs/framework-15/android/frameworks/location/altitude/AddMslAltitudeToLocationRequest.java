package android.frameworks.location.altitude;

public class AddMslAltitudeToLocationRequest implements android.os.Parcelable {
    public double latitudeDegrees;
    public double longitudeDegrees;
    public double altitudeMeters;
    public float verticalAccuracyMeters;
    public static final android.os.Parcelable.Creator<android.frameworks.location.altitude.AddMslAltitudeToLocationRequest> CREATOR = null;
    public AddMslAltitudeToLocationRequest() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
