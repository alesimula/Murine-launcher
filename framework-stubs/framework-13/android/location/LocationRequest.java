package android.location;

public final class LocationRequest implements android.os.Parcelable {
    public static final long LOW_POWER_EXCEPTIONS = 168936375L;
    public static final long PASSIVE_INTERVAL = 9223372036854775807L;
    public static final int QUALITY_HIGH_ACCURACY = 100;
    public static final int QUALITY_BALANCED_POWER_ACCURACY = 102;
    public static final int QUALITY_LOW_POWER = 104;
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final int ACCURACY_FINE = 100;
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final int ACCURACY_BLOCK = 102;
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final int ACCURACY_CITY = 104;
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final int POWER_NONE = 200;
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final int POWER_LOW = 201;
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public static final int POWER_HIGH = 203;
    public static final android.os.Parcelable.Creator<android.location.LocationRequest> CREATOR = null;
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static android.location.LocationRequest create() { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static android.location.LocationRequest createFromDeprecatedProvider(java.lang.String p0, long p1, float p2, boolean p3) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static android.location.LocationRequest createFromDeprecatedCriteria(android.location.Criteria p0, long p1, float p2, boolean p3) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public android.location.LocationRequest setProvider(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public java.lang.String getProvider() { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public android.location.LocationRequest setQuality(int p0) { return null; }
    public int getQuality() { return 0; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public android.location.LocationRequest setInterval(long p0) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public long getInterval() { return 0L; }
    public long getIntervalMillis() { return 0L; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public android.location.LocationRequest setFastestInterval(long p0) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public long getFastestInterval() { return 0L; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public android.location.LocationRequest setExpireAt(long p0) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public long getExpireAt() { return 0L; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public android.location.LocationRequest setExpireIn(long p0) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public long getExpireIn() { return 0L; }
    public long getDurationMillis() { return 0L; }
    public long getExpirationRealtimeMs(long p0) { return 0L; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public android.location.LocationRequest setNumUpdates(int p0) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public int getNumUpdates() { return 0; }
    public int getMaxUpdates() { return 0; }
    public long getMinUpdateIntervalMillis() { return 0L; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public android.location.LocationRequest setSmallestDisplacement(float p0) { return null; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public float getSmallestDisplacement() { return 0.0f; }
    public float getMinUpdateDistanceMeters() { return 0.0f; }
    public long getMaxUpdateDelayMillis() { return 0L; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void setHideFromAppOps(boolean p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public boolean getHideFromAppOps() { return false; }
    @android.annotation.SystemApi
    public boolean isHiddenFromAppOps() { return false; }
    @android.annotation.SystemApi
    public boolean isAdasGnssBypass() { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.LOCATION_BYPASS")
    public android.location.LocationRequest setLocationSettingsIgnored(boolean p0) { return null; }
    @android.annotation.SystemApi
    public boolean isLocationSettingsIgnored() { return false; }
    public boolean isBypass() { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public android.location.LocationRequest setLowPowerMode(boolean p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public boolean isLowPowerMode() { return false; }
    @android.annotation.SystemApi
    public boolean isLowPower() { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void setWorkSource(android.os.WorkSource p0) {}
    @android.annotation.SystemApi
    public android.os.WorkSource getWorkSource() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(long p0) {}
        public Builder(android.location.LocationRequest p0) {}
        public android.location.LocationRequest.Builder setIntervalMillis(long p0) { return null; }
        public android.location.LocationRequest.Builder setQuality(int p0) { return null; }
        public android.location.LocationRequest.Builder setQuality(android.location.Criteria p0) { return null; }
        public android.location.LocationRequest.Builder setDurationMillis(long p0) { return null; }
        public android.location.LocationRequest.Builder setMaxUpdates(int p0) { return null; }
        public android.location.LocationRequest.Builder setMinUpdateIntervalMillis(long p0) { return null; }
        public android.location.LocationRequest.Builder clearMinUpdateIntervalMillis() { return null; }
        public android.location.LocationRequest.Builder setMinUpdateDistanceMeters(float p0) { return null; }
        public android.location.LocationRequest.Builder setMaxUpdateDelayMillis(long p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.UPDATE_APP_OPS_STATS")
        public android.location.LocationRequest.Builder setHiddenFromAppOps(boolean p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.LOCATION_BYPASS")
        public android.location.LocationRequest.Builder setAdasGnssBypass(boolean p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.LOCATION_BYPASS")
        public android.location.LocationRequest.Builder setLocationSettingsIgnored(boolean p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.LOCATION_HARDWARE")
        public android.location.LocationRequest.Builder setLowPower(boolean p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
        public android.location.LocationRequest.Builder setWorkSource(android.os.WorkSource p0) { return null; }
        public android.location.LocationRequest build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Quality {
    }
}
