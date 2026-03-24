package android.nearby;

public final class OffloadCapability implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.nearby.OffloadCapability> CREATOR = null;
    OffloadCapability() {}
    public int describeContents() { return 0; }
    public long getVersion() { return 0L; }
    public boolean isFastPairSupported() { return false; }
    public boolean isNearbyShareSupported() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.nearby.OffloadCapability build() { return null; }
        @android.annotation.NonNull
        public android.nearby.OffloadCapability.Builder setFastPairSupported(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.OffloadCapability.Builder setNearbyShareSupported(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.nearby.OffloadCapability.Builder setVersion(long p0) { return null; }
    }
}
