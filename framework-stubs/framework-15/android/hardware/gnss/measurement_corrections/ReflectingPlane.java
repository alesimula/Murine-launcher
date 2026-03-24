package android.hardware.gnss.measurement_corrections;

public class ReflectingPlane implements android.os.Parcelable {
    public double latitudeDegrees;
    public double longitudeDegrees;
    public double altitudeMeters;
    public double reflectingPlaneAzimuthDegrees;
    public static final android.os.Parcelable.Creator<android.hardware.gnss.measurement_corrections.ReflectingPlane> CREATOR = null;
    public ReflectingPlane() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
