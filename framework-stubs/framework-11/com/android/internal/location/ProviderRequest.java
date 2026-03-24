package com.android.internal.location;

public final class ProviderRequest implements android.os.Parcelable {
    public static final com.android.internal.location.ProviderRequest EMPTY_REQUEST = null;
    public final boolean reportLocation = false;
    public final long interval = 0L;
    public final boolean lowPowerMode = false;
    public final boolean locationSettingsIgnored = false;
    public final java.util.List<android.location.LocationRequest> locationRequests = null;
    public final android.os.WorkSource workSource = null;
    public static final android.os.Parcelable.Creator<com.android.internal.location.ProviderRequest> CREATOR = null;
    private ProviderRequest(boolean p0, long p1, boolean p2, boolean p3, java.util.List<android.location.LocationRequest> p4, android.os.WorkSource p5) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static class Builder {
        private long mInterval;
        private boolean mLowPowerMode;
        private boolean mLocationSettingsIgnored;
        private java.util.List<android.location.LocationRequest> mLocationRequests;
        private android.os.WorkSource mWorkSource;
        public Builder() {}
        public long getInterval() { return 0L; }
        public com.android.internal.location.ProviderRequest.Builder setInterval(long p0) { return null; }
        public boolean isLowPowerMode() { return false; }
        public com.android.internal.location.ProviderRequest.Builder setLowPowerMode(boolean p0) { return null; }
        public boolean isLocationSettingsIgnored() { return false; }
        public com.android.internal.location.ProviderRequest.Builder setLocationSettingsIgnored(boolean p0) { return null; }
        public java.util.List<android.location.LocationRequest> getLocationRequests() { return null; }
        public com.android.internal.location.ProviderRequest.Builder setLocationRequests(java.util.List<android.location.LocationRequest> p0) { return null; }
        public android.os.WorkSource getWorkSource() { return null; }
        public com.android.internal.location.ProviderRequest.Builder setWorkSource(android.os.WorkSource p0) { return null; }
        public com.android.internal.location.ProviderRequest build() { return null; }
    }
}
