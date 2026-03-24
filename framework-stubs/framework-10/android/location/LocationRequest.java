package android.location;

@android.annotation.SystemApi
public final class LocationRequest implements android.os.Parcelable {
    public static final int ACCURACY_FINE = 100;
    public static final int ACCURACY_BLOCK = 102;
    public static final int ACCURACY_CITY = 104;
    public static final int POWER_NONE = 200;
    public static final int POWER_LOW = 201;
    public static final int POWER_HIGH = 203;
    private static final double FASTEST_INTERVAL_FACTOR = 6.0;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private int mQuality;
    @android.annotation.UnsupportedAppUsage
    private long mInterval;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private long mFastestInterval;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private boolean mExplicitFastestInterval;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private long mExpireAt;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private int mNumUpdates;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private float mSmallestDisplacement;
    @android.annotation.UnsupportedAppUsage
    private android.os.WorkSource mWorkSource;
    @android.annotation.UnsupportedAppUsage
    private boolean mHideFromAppOps;
    private boolean mLocationSettingsIgnored;
    @android.annotation.UnsupportedAppUsage
    private java.lang.String mProvider;
    private boolean mLowPowerMode;
    public static final android.os.Parcelable.Creator<android.location.LocationRequest> CREATOR = null;
    public static android.location.LocationRequest create() { return null; }
    @android.annotation.SystemApi
    public static android.location.LocationRequest createFromDeprecatedProvider(java.lang.String p0, long p1, float p2, boolean p3) { return null; }
    @android.annotation.SystemApi
    public static android.location.LocationRequest createFromDeprecatedCriteria(android.location.Criteria p0, long p1, float p2, boolean p3) { return null; }
    public LocationRequest() {}
    public LocationRequest(android.location.LocationRequest p0) {}
    public android.location.LocationRequest setQuality(int p0) { return null; }
    public int getQuality() { return 0; }
    public android.location.LocationRequest setInterval(long p0) { return null; }
    public long getInterval() { return 0L; }
    @android.annotation.SystemApi
    public android.location.LocationRequest setLowPowerMode(boolean p0) { return null; }
    @android.annotation.SystemApi
    public boolean isLowPowerMode() { return false; }
    public android.location.LocationRequest setLocationSettingsIgnored(boolean p0) { return null; }
    public boolean isLocationSettingsIgnored() { return false; }
    public android.location.LocationRequest setFastestInterval(long p0) { return null; }
    public long getFastestInterval() { return 0L; }
    public android.location.LocationRequest setExpireIn(long p0) { return null; }
    public android.location.LocationRequest setExpireAt(long p0) { return null; }
    public long getExpireAt() { return 0L; }
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
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private static void checkInterval(long p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private static void checkQuality(int p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private static void checkDisplacement(float p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private static void checkProvider(java.lang.String p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static java.lang.String qualityToString(int p0) { return null; }
    public java.lang.String toString() { return null; }
}
