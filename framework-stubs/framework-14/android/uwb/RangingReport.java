package android.uwb;

public final class RangingReport implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.uwb.RangingReport> CREATOR = null;
    RangingReport() {}
    @android.annotation.NonNull
    public java.util.List<android.uwb.RangingMeasurement> getMeasurements() { return null; }
    @android.annotation.NonNull
    public android.os.PersistableBundle getRangingReportMetadata() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

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
