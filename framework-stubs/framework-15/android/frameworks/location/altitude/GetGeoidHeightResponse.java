package android.frameworks.location.altitude;

public class GetGeoidHeightResponse implements android.os.Parcelable {
    public double geoidHeightMeters;
    public float geoidHeightErrorMeters;
    public double expirationDistanceMeters;
    public float additionalGeoidHeightErrorMeters;
    public boolean success;
    public static final android.os.Parcelable.Creator<android.frameworks.location.altitude.GetGeoidHeightResponse> CREATOR = null;
    public GetGeoidHeightResponse() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
