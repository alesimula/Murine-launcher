package android.location;

@android.annotation.SystemApi
public final class GnssReflectingPlane implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.location.GnssReflectingPlane> CREATOR = null;
    public double getLatitudeDegrees() { return 0.0; }
    public double getLongitudeDegrees() { return 0.0; }
    public double getAltitudeMeters() { return 0.0; }
    public double getAzimuthDegrees() { return 0.0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.GnssReflectingPlane.Builder setLatitudeDegrees(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssReflectingPlane.Builder setLongitudeDegrees(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssReflectingPlane.Builder setAltitudeMeters(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssReflectingPlane.Builder setAzimuthDegrees(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssReflectingPlane build() { return null; }
    }
}
