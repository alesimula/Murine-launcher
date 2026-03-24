package android.net;

@android.annotation.SystemApi
public final class CaptivePortalData implements android.os.Parcelable {
    private final long mRefreshTimeMillis = 0L;
    private final android.net.Uri mUserPortalUrl = null;
    private final android.net.Uri mVenueInfoUrl = null;
    private final boolean mIsSessionExtendable = false;
    private final long mByteLimit = 0L;
    private final long mExpiryTimeMillis = 0L;
    private final boolean mCaptive = false;
    public static final android.os.Parcelable.Creator<android.net.CaptivePortalData> CREATOR = null;
    private CaptivePortalData(long p0, android.net.Uri p1, android.net.Uri p2, boolean p3, long p4, long p5, boolean p6) {}
    private CaptivePortalData(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public long getRefreshTimeMillis() { return 0L; }
    public android.net.Uri getUserPortalUrl() { return null; }
    public android.net.Uri getVenueInfoUrl() { return null; }
    public boolean isSessionExtendable() { return false; }
    public long getByteLimit() { return 0L; }
    public long getExpiryTimeMillis() { return 0L; }
    public boolean isCaptive() { return false; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }

    public static class Builder {
        private long mRefreshTime;
        private android.net.Uri mUserPortalUrl;
        private android.net.Uri mVenueInfoUrl;
        private boolean mIsSessionExtendable;
        private long mBytesRemaining;
        private long mExpiryTime;
        private boolean mCaptive;
        public Builder() {}
        public Builder(android.net.CaptivePortalData p0) {}
        public android.net.CaptivePortalData.Builder setRefreshTime(long p0) { return null; }
        public android.net.CaptivePortalData.Builder setUserPortalUrl(android.net.Uri p0) { return null; }
        public android.net.CaptivePortalData.Builder setVenueInfoUrl(android.net.Uri p0) { return null; }
        public android.net.CaptivePortalData.Builder setSessionExtendable(boolean p0) { return null; }
        public android.net.CaptivePortalData.Builder setBytesRemaining(long p0) { return null; }
        public android.net.CaptivePortalData.Builder setExpiryTime(long p0) { return null; }
        public android.net.CaptivePortalData.Builder setCaptive(boolean p0) { return null; }
        public android.net.CaptivePortalData build() { return null; }
    }
}
