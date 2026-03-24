package android.nearby;

public final class OffloadCapability implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.nearby.OffloadCapability> CREATOR = null;
    OffloadCapability() {}
    public boolean isFastPairSupported() { return false; }
    public boolean isNearbyShareSupported() { return false; }
    public long getVersion() { return 0L; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.nearby.OffloadCapability.Builder setFastPairSupported(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.OffloadCapability.Builder setNearbyShareSupported(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.OffloadCapability.Builder setVersion(long p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.OffloadCapability build() { return null; }
    }
}
