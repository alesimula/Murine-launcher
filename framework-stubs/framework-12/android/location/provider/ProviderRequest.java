package android.location.provider;

@android.annotation.SystemApi
public final class ProviderRequest implements android.os.Parcelable {
    public static final long INTERVAL_DISABLED = 9223372036854775807L;
    public static final android.location.provider.ProviderRequest EMPTY_REQUEST = null;
    private final long mIntervalMillis = 0L;
    private final int mQuality = 0;
    private final long mMaxUpdateDelayMillis = 0L;
    private final boolean mLowPower = false;
    private final boolean mAdasGnssBypass = false;
    private final boolean mLocationSettingsIgnored = false;
    private final android.os.WorkSource mWorkSource = null;
    public static final android.os.Parcelable.Creator<android.location.provider.ProviderRequest> CREATOR = null;
    private ProviderRequest(long p0, int p1, long p2, boolean p3, boolean p4, boolean p5, android.os.WorkSource p6) {}
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
        private long mIntervalMillis;
        private int mQuality;
        private long mMaxUpdateDelayMillis;
        private boolean mLowPower;
        private boolean mAdasGnssBypass;
        private boolean mLocationSettingsIgnored;
        private android.os.WorkSource mWorkSource;
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
