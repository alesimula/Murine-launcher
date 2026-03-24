package android.uwb;

public final class DistanceMeasurement implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.uwb.DistanceMeasurement> CREATOR = null;
    DistanceMeasurement() {}
    public int describeContents() { return 0; }
    public double getConfidenceLevel() { return 0.0; }
    public double getErrorMeters() { return 0.0; }
    public double getMeters() { return 0.0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.uwb.DistanceMeasurement build() { return null; }
        @android.annotation.NonNull
        public android.uwb.DistanceMeasurement.Builder setConfidenceLevel(double p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.DistanceMeasurement.Builder setErrorMeters(double p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.DistanceMeasurement.Builder setMeters(double p0) { return null; }
    }
}
