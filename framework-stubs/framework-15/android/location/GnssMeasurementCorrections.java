package android.location;

@android.annotation.SystemApi
public final class GnssMeasurementCorrections implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.location.GnssMeasurementCorrections> CREATOR = null;
    public double getLatitudeDegrees() { return 0.0; }
    public double getLongitudeDegrees() { return 0.0; }
    public double getAltitudeMeters() { return 0.0; }
    public double getHorizontalPositionUncertaintyMeters() { return 0.0; }
    public double getVerticalPositionUncertaintyMeters() { return 0.0; }
    public long getToaGpsNanosecondsOfWeek() { return 0L; }
    @android.annotation.NonNull
    public java.util.List<android.location.GnssSingleSatCorrection> getSingleSatelliteCorrectionList() { return null; }
    public boolean hasEnvironmentBearing() { return false; }
    public float getEnvironmentBearingDegrees() { return 0.0f; }
    public float getEnvironmentBearingUncertaintyDegrees() { return 0.0f; }
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.location.GnssMeasurementCorrections.Builder setLatitudeDegrees(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssMeasurementCorrections.Builder setLongitudeDegrees(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssMeasurementCorrections.Builder setAltitudeMeters(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssMeasurementCorrections.Builder setHorizontalPositionUncertaintyMeters(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssMeasurementCorrections.Builder setVerticalPositionUncertaintyMeters(double p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssMeasurementCorrections.Builder setToaGpsNanosecondsOfWeek(long p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssMeasurementCorrections.Builder setSingleSatelliteCorrectionList(java.util.List<android.location.GnssSingleSatCorrection> p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssMeasurementCorrections.Builder setEnvironmentBearingDegrees(float p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssMeasurementCorrections.Builder setEnvironmentBearingUncertaintyDegrees(float p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssMeasurementCorrections build() { return null; }
    }
}
