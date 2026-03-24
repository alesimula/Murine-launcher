package android.location;

@android.annotation.SystemApi
public final class GnssMeasurementCorrections implements android.os.Parcelable {
    private final double mLatitudeDegrees = 0.0;
    private final double mLongitudeDegrees = 0.0;
    private final double mAltitudeMeters = 0.0;
    private final double mHorizontalPositionUncertaintyMeters = 0.0;
    private final double mVerticalPositionUncertaintyMeters = 0.0;
    private final long mToaGpsNanosecondsOfWeek = 0L;
    private final java.util.List<android.location.GnssSingleSatCorrection> mSingleSatCorrectionList = null;
    private final boolean mHasEnvironmentBearing = false;
    private final float mEnvironmentBearingDegrees = 0.0f;
    private final float mEnvironmentBearingUncertaintyDegrees = 0.0f;
    public static final android.os.Parcelable.Creator<android.location.GnssMeasurementCorrections> CREATOR = null;
    private GnssMeasurementCorrections(android.location.GnssMeasurementCorrections.Builder p0) {}
    public double getLatitudeDegrees() { return 0.0; }
    public double getLongitudeDegrees() { return 0.0; }
    public double getAltitudeMeters() { return 0.0; }
    public double getHorizontalPositionUncertaintyMeters() { return 0.0; }
    public double getVerticalPositionUncertaintyMeters() { return 0.0; }
    public long getToaGpsNanosecondsOfWeek() { return 0L; }
    public java.util.List<android.location.GnssSingleSatCorrection> getSingleSatelliteCorrectionList() { return null; }
    public boolean hasEnvironmentBearing() { return false; }
    public float getEnvironmentBearingDegrees() { return 0.0f; }
    public float getEnvironmentBearingUncertaintyDegrees() { return 0.0f; }
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private double mLatitudeDegrees;
        private double mLongitudeDegrees;
        private double mAltitudeMeters;
        private double mHorizontalPositionUncertaintyMeters;
        private double mVerticalPositionUncertaintyMeters;
        private long mToaGpsNanosecondsOfWeek;
        private java.util.List<android.location.GnssSingleSatCorrection> mSingleSatCorrectionList;
        private float mEnvironmentBearingDegrees;
        private boolean mEnvironmentBearingIsSet;
        private float mEnvironmentBearingUncertaintyDegrees;
        private boolean mEnvironmentBearingUncertaintyIsSet;
        public Builder() {}
        public android.location.GnssMeasurementCorrections.Builder setLatitudeDegrees(double p0) { return null; }
        public android.location.GnssMeasurementCorrections.Builder setLongitudeDegrees(double p0) { return null; }
        public android.location.GnssMeasurementCorrections.Builder setAltitudeMeters(double p0) { return null; }
        public android.location.GnssMeasurementCorrections.Builder setHorizontalPositionUncertaintyMeters(double p0) { return null; }
        public android.location.GnssMeasurementCorrections.Builder setVerticalPositionUncertaintyMeters(double p0) { return null; }
        public android.location.GnssMeasurementCorrections.Builder setToaGpsNanosecondsOfWeek(long p0) { return null; }
        public android.location.GnssMeasurementCorrections.Builder setSingleSatelliteCorrectionList(java.util.List<android.location.GnssSingleSatCorrection> p0) { return null; }
        public android.location.GnssMeasurementCorrections.Builder setEnvironmentBearingDegrees(float p0) { return null; }
        public android.location.GnssMeasurementCorrections.Builder setEnvironmentBearingUncertaintyDegrees(float p0) { return null; }
        public android.location.GnssMeasurementCorrections build() { return null; }
    }
}
