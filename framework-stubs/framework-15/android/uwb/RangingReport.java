package android.uwb;

public final class RangingReport implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.uwb.RangingReport> CREATOR = null;
    RangingReport() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.uwb.RangingMeasurement> getMeasurements() { return null; }
    @android.annotation.NonNull
    public android.os.PersistableBundle getRangingReportMetadata() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.uwb.RangingReport.Builder addMeasurement(android.uwb.RangingMeasurement p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.RangingReport.Builder addMeasurements(java.util.List<android.uwb.RangingMeasurement> p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.RangingReport.Builder addRangingReportMetadata(android.os.PersistableBundle p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.RangingReport build() { return null; }
    }
}
