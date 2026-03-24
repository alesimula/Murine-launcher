package android.location;

public final class GnssMeasurementRequest implements android.os.Parcelable {
    public static final int PASSIVE_INTERVAL = 2147483647;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.GnssMeasurementRequest> CREATOR = null;
    @android.annotation.SystemApi
    public boolean isCorrelationVectorOutputsEnabled() { return false; }
    public boolean isFullTracking() { return false; }
    public int getIntervalMillis() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.location.flags.gnss_api_measurement_request_work_source")
    @android.annotation.NonNull
    public android.os.WorkSource getWorkSource() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.location.GnssMeasurementRequest p0) {}
        @android.annotation.SystemApi
        @android.annotation.NonNull
        public android.location.GnssMeasurementRequest.Builder setCorrelationVectorOutputsEnabled(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssMeasurementRequest.Builder setFullTracking(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssMeasurementRequest.Builder setIntervalMillis(int p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.FlaggedApi("android.location.flags.gnss_api_measurement_request_work_source")
        @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
        @android.annotation.NonNull
        public android.location.GnssMeasurementRequest.Builder setWorkSource(android.os.WorkSource p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssMeasurementRequest build() { return null; }
    }
}
