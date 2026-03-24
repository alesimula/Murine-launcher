package android.uwb;

@android.annotation.SystemApi
public final class DistanceMeasurement implements android.os.Parcelable {
    private final double mMeters = 0.0;
    private final double mErrorMeters = 0.0;
    private final double mConfidenceLevel = 0.0;
    public static final android.os.Parcelable.Creator<android.uwb.DistanceMeasurement> CREATOR = null;
    private DistanceMeasurement(double p0, double p1, double p2) {}
    public double getMeters() { return 0.0; }
    public double getErrorMeters() { return 0.0; }
    public double getConfidenceLevel() { return 0.0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private double mMeters;
        private double mErrorMeters;
        private double mConfidenceLevel;
        public Builder() {}
        public android.uwb.DistanceMeasurement.Builder setMeters(double p0) { return null; }
        public android.uwb.DistanceMeasurement.Builder setErrorMeters(double p0) { return null; }
        public android.uwb.DistanceMeasurement.Builder setConfidenceLevel(double p0) { return null; }
        public android.uwb.DistanceMeasurement build() { return null; }
    }
}
