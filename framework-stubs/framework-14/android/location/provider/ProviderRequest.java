package android.location.provider;

@android.annotation.SystemApi
public final class ProviderRequest implements android.os.Parcelable {
    public static final long INTERVAL_DISABLED = 9223372036854775807L;
    public static final android.location.provider.ProviderRequest EMPTY_REQUEST = null;
    public static final android.os.Parcelable.Creator<android.location.provider.ProviderRequest> CREATOR = null;
    public boolean isActive() { return false; }
    public long getIntervalMillis() { return 0L; }
    public int getQuality() { return 0; }
    public long getMaxUpdateDelayMillis() { return 0L; }
    public boolean isLowPower() { return false; }
    public boolean isAdasGnssBypass() { return false; }
    public boolean isLocationSettingsIgnored() { return false; }
    public boolean isBypass() { return false; }
    public android.os.WorkSource getWorkSource() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        public android.location.provider.ProviderRequest.Builder setIntervalMillis(long p0) { return null; }
        public android.location.provider.ProviderRequest.Builder setQuality(int p0) { return null; }
        public android.location.provider.ProviderRequest.Builder setMaxUpdateDelayMillis(long p0) { return null; }
        public android.location.provider.ProviderRequest.Builder setLowPower(boolean p0) { return null; }
        public android.location.provider.ProviderRequest.Builder setAdasGnssBypass(boolean p0) { return null; }
        public android.location.provider.ProviderRequest.Builder setLocationSettingsIgnored(boolean p0) { return null; }
        public android.location.provider.ProviderRequest.Builder setWorkSource(android.os.WorkSource p0) { return null; }
        public android.location.provider.ProviderRequest build() { return null; }
    }

    public static interface ChangedListener {
        public void onProviderRequestChanged(java.lang.String p0, android.location.provider.ProviderRequest p1);
    }
}
