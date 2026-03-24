package android.location;

@android.annotation.SystemApi
public final class LocationRequest implements android.os.Parcelable {
    public static final int ACCURACY_FINE = 100;
    public static final int ACCURACY_BLOCK = 102;
    public static final int ACCURACY_CITY = 104;
    public static final int POWER_NONE = 200;
    public static final int POWER_LOW = 201;
    public static final int POWER_HIGH = 203;
    private static final long DEFAULT_INTERVAL_MS = 3600000L;
    private static final double FASTEST_INTERVAL_FACTOR = 6.0;
    private java.lang.String mProvider;
    private int mQuality;
    private long mInterval;
    private long mFastestInterval;
    private boolean mExplicitFastestInterval;
    private long mExpireAt;
    private long mExpireIn;
    private int mNumUpdates;
    private float mSmallestDisplacement;
    private boolean mHideFromAppOps;
    private boolean mLocationSettingsIgnored;
    private boolean mLowPowerMode;
    private android.os.WorkSource mWorkSource;
    public static final android.os.Parcelable.Creator<android.location.LocationRequest> CREATOR = null;
    public static android.location.LocationRequest create() { return null; }
    @android.annotation.SystemApi
    public static android.location.LocationRequest createFromDeprecatedProvider(java.lang.String p0, long p1, float p2, boolean p3) { return null; }
    @android.annotation.SystemApi
    public static android.location.LocationRequest createFromDeprecatedCriteria(android.location.Criteria p0, long p1, float p2, boolean p3) { return null; }
    public LocationRequest() {}
    public LocationRequest(android.location.LocationRequest p0) {}
    private LocationRequest(java.lang.String p0, int p1, long p2, long p3, boolean p4, long p5, long p6, int p7, float p8, boolean p9, boolean p10, boolean p11, android.os.WorkSource p12) {}
    public android.location.LocationRequest setQuality(int p0) { return null; }
    public int getQuality() { return 0; }
    public android.location.LocationRequest setInterval(long p0) { return null; }
    public long getInterval() { return 0L; }
    public android.location.LocationRequest setLowPowerMode(boolean p0) { return null; }
    public boolean isLowPowerMode() { return false; }
    public android.location.LocationRequest setLocationSettingsIgnored(boolean p0) { return null; }
    public boolean isLocationSettingsIgnored() { return false; }
    public android.location.LocationRequest setFastestInterval(long p0) { return null; }
    public long getFastestInterval() { return 0L; }
    @java.lang.Deprecated
    public android.location.LocationRequest setExpireAt(long p0) { return null; }
    @java.lang.Deprecated
    public long getExpireAt() { return 0L; }
    public android.location.LocationRequest setExpireIn(long p0) { return null; }
    public long getExpireIn() { return 0L; }
    public long getExpirationRealtimeMs(long p0) { return 0L; }
    public android.location.LocationRequest setNumUpdates(int p0) { return null; }
    public int getNumUpdates() { return 0; }
    public void decrementNumUpdates() {}
    public android.location.LocationRequest setProvider(java.lang.String p0) { return null; }
    @android.annotation.SystemApi
    public java.lang.String getProvider() { return null; }
    @android.annotation.SystemApi
    public android.location.LocationRequest setSmallestDisplacement(float p0) { return null; }
    @android.annotation.SystemApi
    public float getSmallestDisplacement() { return 0.0f; }
    @android.annotation.SystemApi
    public void setWorkSource(android.os.WorkSource p0) {}
    @android.annotation.SystemApi
    public android.os.WorkSource getWorkSource() { return null; }
    @android.annotation.SystemApi
    public void setHideFromAppOps(boolean p0) {}
    @android.annotation.SystemApi
    public boolean getHideFromAppOps() { return false; }
    private static void checkQuality(int p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static java.lang.String qualityToString(int p0) { return null; }
    public java.lang.String toString() { return null; }
}
