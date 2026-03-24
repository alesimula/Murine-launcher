package android.net;

public final class CaptivePortalData implements android.os.Parcelable {
    public static final int CAPTIVE_PORTAL_DATA_SOURCE_OTHER = 0;
    public static final int CAPTIVE_PORTAL_DATA_SOURCE_PASSPOINT = 1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.CaptivePortalData> CREATOR = null;
    CaptivePortalData() {}
    public int describeContents() { return 0; }
    public long getByteLimit() { return 0L; }
    public long getExpiryTimeMillis() { return 0L; }
    public long getRefreshTimeMillis() { return 0L; }
    @android.annotation.Nullable
    public android.net.Uri getUserPortalUrl() { return null; }
    public int getUserPortalUrlSource() { return 0; }
    @android.annotation.Nullable
    public java.lang.CharSequence getVenueFriendlyName() { return null; }
    @android.annotation.Nullable
    public android.net.Uri getVenueInfoUrl() { return null; }
    public int getVenueInfoUrlSource() { return 0; }
    public boolean isCaptive() { return false; }
    public boolean isSessionExtendable() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        public Builder() {}
        public Builder(android.net.CaptivePortalData p0) {}
        @android.annotation.NonNull
        public android.net.CaptivePortalData build() { return null; }
        @android.annotation.NonNull
        public android.net.CaptivePortalData.Builder setBytesRemaining(long p0) { return null; }
        @android.annotation.NonNull
        public android.net.CaptivePortalData.Builder setCaptive(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.CaptivePortalData.Builder setExpiryTime(long p0) { return null; }
        @android.annotation.NonNull
        public android.net.CaptivePortalData.Builder setRefreshTime(long p0) { return null; }
        @android.annotation.NonNull
        public android.net.CaptivePortalData.Builder setSessionExtendable(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.CaptivePortalData.Builder setUserPortalUrl(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.net.CaptivePortalData.Builder setUserPortalUrl(android.net.Uri p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.net.CaptivePortalData.Builder setVenueFriendlyName(java.lang.CharSequence p0) { return null; }
        @android.annotation.NonNull
        public android.net.CaptivePortalData.Builder setVenueInfoUrl(android.net.Uri p0) { return null; }
        @android.annotation.NonNull
        public android.net.CaptivePortalData.Builder setVenueInfoUrl(android.net.Uri p0, int p1) { return null; }
    }
}
