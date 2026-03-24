package android.uwb;

@android.annotation.SystemApi
public final class RangingReport implements android.os.Parcelable {
    private final java.util.List<android.uwb.RangingMeasurement> mRangingMeasurements = null;
    public static final android.os.Parcelable.Creator<android.uwb.RangingReport> CREATOR = null;
    private RangingReport(java.util.List<android.uwb.RangingMeasurement> p0) {}
    public java.util.List<android.uwb.RangingMeasurement> getMeasurements() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        java.util.List<android.uwb.RangingMeasurement> mMeasurements;
        public Builder() {}
        public android.uwb.RangingReport.Builder addMeasurement(android.uwb.RangingMeasurement p0) { return null; }
        public android.uwb.RangingReport.Builder addMeasurements(java.util.List<android.uwb.RangingMeasurement> p0) { return null; }
        public android.uwb.RangingReport build() { return null; }
    }
}
