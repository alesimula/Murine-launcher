package android.location;

@android.annotation.SystemApi
public final class GnssReflectingPlane implements android.os.Parcelable {
    private final double mLatitudeDegrees = 0.0;
    private final double mLongitudeDegrees = 0.0;
    private final double mAltitudeMeters = 0.0;
    private final double mAzimuthDegrees = 0.0;
    public static final android.os.Parcelable.Creator<android.location.GnssReflectingPlane> CREATOR = null;
    private GnssReflectingPlane(android.location.GnssReflectingPlane.Builder p0) {}
    public double getLatitudeDegrees() { return 0.0; }
    public double getLongitudeDegrees() { return 0.0; }
    public double getAltitudeMeters() { return 0.0; }
    public double getAzimuthDegrees() { return 0.0; }
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private double mLatitudeDegrees;
        private double mLongitudeDegrees;
        private double mAltitudeMeters;
        private double mAzimuthDegrees;
        public Builder() {}
        public android.location.GnssReflectingPlane.Builder setLatitudeDegrees(double p0) { return null; }
        public android.location.GnssReflectingPlane.Builder setLongitudeDegrees(double p0) { return null; }
        public android.location.GnssReflectingPlane.Builder setAltitudeMeters(double p0) { return null; }
        public android.location.GnssReflectingPlane.Builder setAzimuthDegrees(double p0) { return null; }
        public android.location.GnssReflectingPlane build() { return null; }
    }
}
