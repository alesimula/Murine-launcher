package android.location;

@android.annotation.SystemApi
public final class GnssRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.GnssRequest> CREATOR = null;
    public boolean isFullTracking() { return false; }
    @android.annotation.NonNull
    public android.location.GnssMeasurementRequest toGnssMeasurementRequest() { return null; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public Builder(android.location.GnssRequest p0) {}
        @android.annotation.NonNull
        public android.location.GnssRequest.Builder setFullTracking(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.location.GnssRequest build() { return null; }
    }
}
