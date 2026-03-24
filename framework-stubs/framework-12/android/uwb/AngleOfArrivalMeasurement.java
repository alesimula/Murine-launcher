package android.uwb;

@android.annotation.SystemApi
public final class AngleOfArrivalMeasurement implements android.os.Parcelable {
    private final android.uwb.AngleMeasurement mAzimuthAngleMeasurement = null;
    private final android.uwb.AngleMeasurement mAltitudeAngleMeasurement = null;
    public static final android.os.Parcelable.Creator<android.uwb.AngleOfArrivalMeasurement> CREATOR = null;
    private AngleOfArrivalMeasurement(android.uwb.AngleMeasurement p0, android.uwb.AngleMeasurement p1) {}
    public android.uwb.AngleMeasurement getAzimuth() { return null; }
    public android.uwb.AngleMeasurement getAltitude() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final android.uwb.AngleMeasurement mAzimuthAngleMeasurement = null;
        private android.uwb.AngleMeasurement mAltitudeAngleMeasurement;
        public Builder(android.uwb.AngleMeasurement p0) {}
        public android.uwb.AngleOfArrivalMeasurement.Builder setAltitude(android.uwb.AngleMeasurement p0) { return null; }
        public android.uwb.AngleOfArrivalMeasurement build() { return null; }
    }
}
