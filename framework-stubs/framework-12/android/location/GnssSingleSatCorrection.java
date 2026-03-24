package android.location;

@android.annotation.SystemApi
public final class GnssSingleSatCorrection implements android.os.Parcelable {
    public static final int HAS_PROB_SAT_IS_LOS_MASK = 1;
    public static final int HAS_EXCESS_PATH_LENGTH_MASK = 2;
    public static final int HAS_EXCESS_PATH_LENGTH_UNC_MASK = 4;
    public static final int HAS_REFLECTING_PLANE_MASK = 8;
    private final int mSingleSatCorrectionFlags = 0;
    private final int mConstellationType = 0;
    private final int mSatId = 0;
    private final float mCarrierFrequencyHz = 0.0f;
    private final float mProbSatIsLos = 0.0f;
    private final float mExcessPathLengthMeters = 0.0f;
    private final float mExcessPathLengthUncertaintyMeters = 0.0f;
    private final android.location.GnssReflectingPlane mReflectingPlane = null;
    public static final android.os.Parcelable.Creator<android.location.GnssSingleSatCorrection> CREATOR = null;
    private GnssSingleSatCorrection(android.location.GnssSingleSatCorrection.Builder p0) {}
    public int getSingleSatelliteCorrectionFlags() { return 0; }
    public int getConstellationType() { return 0; }
    public int getSatelliteId() { return 0; }
    public float getCarrierFrequencyHz() { return 0.0f; }
    public float getProbabilityLineOfSight() { return 0.0f; }
    public float getExcessPathLengthMeters() { return 0.0f; }
    public float getExcessPathLengthUncertaintyMeters() { return 0.0f; }
    public android.location.GnssReflectingPlane getReflectingPlane() { return null; }
    public boolean hasValidSatelliteLineOfSight() { return false; }
    public boolean hasExcessPathLength() { return false; }
    public boolean hasExcessPathLengthUncertainty() { return false; }
    public boolean hasReflectingPlane() { return false; }
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private int mSingleSatCorrectionFlags;
        private int mConstellationType;
        private int mSatId;
        private float mCarrierFrequencyHz;
        private float mProbSatIsLos;
        private float mExcessPathLengthMeters;
        private float mExcessPathLengthUncertaintyMeters;
        private android.location.GnssReflectingPlane mReflectingPlane;
        public Builder() {}
        public android.location.GnssSingleSatCorrection.Builder setConstellationType(int p0) { return null; }
        public android.location.GnssSingleSatCorrection.Builder setSatelliteId(int p0) { return null; }
        public android.location.GnssSingleSatCorrection.Builder setCarrierFrequencyHz(float p0) { return null; }
        public android.location.GnssSingleSatCorrection.Builder setProbabilityLineOfSight(float p0) { return null; }
        public android.location.GnssSingleSatCorrection.Builder setExcessPathLengthMeters(float p0) { return null; }
        public android.location.GnssSingleSatCorrection.Builder setExcessPathLengthUncertaintyMeters(float p0) { return null; }
        public android.location.GnssSingleSatCorrection.Builder setReflectingPlane(android.location.GnssReflectingPlane p0) { return null; }
        public android.location.GnssSingleSatCorrection build() { return null; }
    }
}
