package android.location;

public class Location implements android.os.Parcelable {
    public static final int FORMAT_DEGREES = 0;
    public static final int FORMAT_MINUTES = 1;
    public static final int FORMAT_SECONDS = 2;
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_NO_GPS_LOCATION = "noGPSLocation";
    private static final int HAS_ALTITUDE_MASK = 1;
    private static final int HAS_SPEED_MASK = 2;
    private static final int HAS_BEARING_MASK = 4;
    private static final int HAS_HORIZONTAL_ACCURACY_MASK = 8;
    private static final int HAS_MOCK_PROVIDER_MASK = 16;
    private static final int HAS_VERTICAL_ACCURACY_MASK = 32;
    private static final int HAS_SPEED_ACCURACY_MASK = 64;
    private static final int HAS_BEARING_ACCURACY_MASK = 128;
    private static final int HAS_ELAPSED_REALTIME_UNCERTAINTY_MASK = 256;
    private static java.lang.ThreadLocal<android.location.Location.BearingDistanceCache> sBearingDistanceCache;
    private java.lang.String mProvider;
    private long mTime;
    private long mElapsedRealtimeNanos;
    private double mElapsedRealtimeUncertaintyNanos;
    private double mLatitude;
    private double mLongitude;
    private double mAltitude;
    private float mSpeed;
    private float mBearing;
    private float mHorizontalAccuracyMeters;
    private float mVerticalAccuracyMeters;
    private float mSpeedAccuracyMetersPerSecond;
    private float mBearingAccuracyDegrees;
    private android.os.Bundle mExtras;
    private int mFieldsMask;
    public static final android.os.Parcelable.Creator<android.location.Location> CREATOR = null;
    public Location(java.lang.String p0) {}
    public Location(android.location.Location p0) {}
    public void set(android.location.Location p0) {}
    public void reset() {}
    public static java.lang.String convert(double p0, int p1) { return null; }
    public static double convert(java.lang.String p0) { return 0.0; }
    private static void computeDistanceAndBearing(double p0, double p1, double p2, double p3, android.location.Location.BearingDistanceCache p4) {}
    public static void distanceBetween(double p0, double p1, double p2, double p3, float[] p4) {}
    public float distanceTo(android.location.Location p0) { return 0.0f; }
    public float bearingTo(android.location.Location p0) { return 0.0f; }
    public java.lang.String getProvider() { return null; }
    public void setProvider(java.lang.String p0) {}
    public long getTime() { return 0L; }
    public void setTime(long p0) {}
    public long getElapsedRealtimeNanos() { return 0L; }
    public long getElapsedRealtimeAgeNanos(long p0) { return 0L; }
    public long getElapsedRealtimeAgeNanos() { return 0L; }
    public void setElapsedRealtimeNanos(long p0) {}
    public double getElapsedRealtimeUncertaintyNanos() { return 0.0; }
    public void setElapsedRealtimeUncertaintyNanos(double p0) {}
    public boolean hasElapsedRealtimeUncertaintyNanos() { return false; }
    public double getLatitude() { return 0.0; }
    public void setLatitude(double p0) {}
    public double getLongitude() { return 0.0; }
    public void setLongitude(double p0) {}
    public boolean hasAltitude() { return false; }
    public double getAltitude() { return 0.0; }
    public void setAltitude(double p0) {}
    @java.lang.Deprecated
    public void removeAltitude() {}
    public boolean hasSpeed() { return false; }
    public float getSpeed() { return 0.0f; }
    public void setSpeed(float p0) {}
    @java.lang.Deprecated
    public void removeSpeed() {}
    public boolean hasBearing() { return false; }
    public float getBearing() { return 0.0f; }
    public void setBearing(float p0) {}
    @java.lang.Deprecated
    public void removeBearing() {}
    public boolean hasAccuracy() { return false; }
    public float getAccuracy() { return 0.0f; }
    public void setAccuracy(float p0) {}
    @java.lang.Deprecated
    public void removeAccuracy() {}
    public boolean hasVerticalAccuracy() { return false; }
    public float getVerticalAccuracyMeters() { return 0.0f; }
    public void setVerticalAccuracyMeters(float p0) {}
    @java.lang.Deprecated
    public void removeVerticalAccuracy() {}
    public boolean hasSpeedAccuracy() { return false; }
    public float getSpeedAccuracyMetersPerSecond() { return 0.0f; }
    public void setSpeedAccuracyMetersPerSecond(float p0) {}
    @java.lang.Deprecated
    public void removeSpeedAccuracy() {}
    public boolean hasBearingAccuracy() { return false; }
    public float getBearingAccuracyDegrees() { return 0.0f; }
    public void setBearingAccuracyDegrees(float p0) {}
    @java.lang.Deprecated
    public void removeBearingAccuracy() {}
    @android.annotation.SystemApi
    public boolean isComplete() { return false; }
    @android.annotation.SystemApi
    public void makeComplete() {}
    public android.os.Bundle getExtras() { return null; }
    public void setExtras(android.os.Bundle p0) {}
    public java.lang.String toString() { return null; }
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public android.location.Location getExtraLocation(java.lang.String p0) { return null; }
    public boolean isFromMockProvider() { return false; }
    @android.annotation.SystemApi
    public void setIsFromMockProvider(boolean p0) {}

    private static class BearingDistanceCache {
        private double mLat1;
        private double mLon1;
        private double mLat2;
        private double mLon2;
        private float mDistance;
        private float mInitialBearing;
        private float mFinalBearing;
        private BearingDistanceCache() {}
    }
}
