package android.location;

public final class GnssMeasurementRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.location.GnssMeasurementRequest> CREATOR = null;
    @android.annotation.SystemApi
    public boolean isCorrelationVectorOutputsEnabled() { return false; }
    public boolean isFullTracking() { return false; }
    public int getIntervalMillis() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.location.GnssMeasurementRequest p0) {}
        @android.annotation.SystemApi
        public android.location.GnssMeasurementRequest.Builder setCorrelationVectorOutputsEnabled(boolean p0) { return null; }
        public android.location.GnssMeasurementRequest.Builder setFullTracking(boolean p0) { return null; }
        public android.location.GnssMeasurementRequest.Builder setIntervalMillis(int p0) { return null; }
        public android.location.GnssMeasurementRequest build() { return null; }
    }
}
