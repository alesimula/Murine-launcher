package android.location;

@android.annotation.SystemApi
public final class GnssSingleSatCorrection implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.location.GnssSingleSatCorrection> CREATOR = null;
    public int getSingleSatelliteCorrectionFlags() { return 0; }
    public int getConstellationType() { return 0; }
    public int getSatelliteId() { return 0; }
    public float getCarrierFrequencyHz() { return 0.0f; }
    public float getProbabilityLineOfSight() { return 0.0f; }
    public float getExcessPathLengthMeters() { return 0.0f; }
    public float getExcessPathLengthUncertaintyMeters() { return 0.0f; }
    public float getCombinedAttenuationDb() { return 0.0f; }
    @java.lang.Deprecated
    public android.location.GnssReflectingPlane getReflectingPlane() { return null; }
    public java.util.List<android.location.GnssExcessPathInfo> getGnssExcessPathInfoList() { return null; }
    public boolean hasValidSatelliteLineOfSight() { return false; }
    public boolean hasExcessPathLength() { return false; }
    public boolean hasExcessPathLengthUncertainty() { return false; }
    @java.lang.Deprecated
    public boolean hasReflectingPlane() { return false; }
    public boolean hasCombinedAttenuation() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        public android.location.GnssSingleSatCorrection.Builder setConstellationType(int p0) { return null; }
        public android.location.GnssSingleSatCorrection.Builder setSatelliteId(int p0) { return null; }
        public android.location.GnssSingleSatCorrection.Builder setCarrierFrequencyHz(float p0) { return null; }
        public android.location.GnssSingleSatCorrection.Builder setProbabilityLineOfSight(float p0) { return null; }
        public android.location.GnssSingleSatCorrection.Builder clearProbabilityLineOfSight() { return null; }
        public android.location.GnssSingleSatCorrection.Builder setExcessPathLengthMeters(float p0) { return null; }
        public android.location.GnssSingleSatCorrection.Builder clearExcessPathLengthMeters() { return null; }
        public android.location.GnssSingleSatCorrection.Builder setExcessPathLengthUncertaintyMeters(float p0) { return null; }
        public android.location.GnssSingleSatCorrection.Builder clearExcessPathLengthUncertaintyMeters() { return null; }
        public android.location.GnssSingleSatCorrection.Builder setCombinedAttenuationDb(float p0) { return null; }
        public android.location.GnssSingleSatCorrection.Builder clearCombinedAttenuationDb() { return null; }
        @java.lang.Deprecated
        public android.location.GnssSingleSatCorrection.Builder setReflectingPlane(android.location.GnssReflectingPlane p0) { return null; }
        public android.location.GnssSingleSatCorrection.Builder setGnssExcessPathInfoList(java.util.List<android.location.GnssExcessPathInfo> p0) { return null; }
        public android.location.GnssSingleSatCorrection build() { return null; }
    }
}
