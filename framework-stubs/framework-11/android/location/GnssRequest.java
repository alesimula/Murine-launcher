package android.location;

@android.annotation.SystemApi
public final class GnssRequest implements android.os.Parcelable {
    private final boolean mFullTracking = false;
    public static final android.os.Parcelable.Creator<android.location.GnssRequest> CREATOR = null;
    private GnssRequest(boolean p0) {}
    public boolean isFullTracking() { return false; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private boolean mFullTracking;
        public Builder() {}
        public Builder(android.location.GnssRequest p0) {}
        public android.location.GnssRequest.Builder setFullTracking(boolean p0) { return null; }
        public android.location.GnssRequest build() { return null; }
    }
}
