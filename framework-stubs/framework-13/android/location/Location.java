package android.location;

public class Location implements android.os.Parcelable {
    public static final int FORMAT_DEGREES = 0;
    public static final int FORMAT_MINUTES = 1;
    public static final int FORMAT_SECONDS = 2;
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public static final java.lang.String EXTRA_NO_GPS_LOCATION = "noGPSLocation";
    public static final android.os.Parcelable.Creator<android.location.Location> CREATOR = null;
    public Location(java.lang.String p0) {}
    public Location(android.location.Location p0) {}
    public void set(android.location.Location p0) {}
    public void reset() {}
    public float distanceTo(android.location.Location p0) { return 0.0f; }
    public float bearingTo(android.location.Location p0) { return 0.0f; }
    public java.lang.String getProvider() { return null; }
    public void setProvider(java.lang.String p0) {}
    public long getTime() { return 0L; }
    public void setTime(long p0) {}
    public long getElapsedRealtimeNanos() { return 0L; }
    public long getElapsedRealtimeMillis() { return 0L; }
    public long getElapsedRealtimeAgeMillis() { return 0L; }
    public long getElapsedRealtimeAgeMillis(long p0) { return 0L; }
    public void setElapsedRealtimeNanos(long p0) {}
    public double getElapsedRealtimeUncertaintyNanos() { return 0.0; }
    public void setElapsedRealtimeUncertaintyNanos(double p0) {}
    public boolean hasElapsedRealtimeUncertaintyNanos() { return false; }
    public void removeElapsedRealtimeUncertaintyNanos() {}
    public double getLatitude() { return 0.0; }
    public void setLatitude(double p0) {}
    public double getLongitude() { return 0.0; }
    public void setLongitude(double p0) {}
    public float getAccuracy() { return 0.0f; }
    public void setAccuracy(float p0) {}
    public boolean hasAccuracy() { return false; }
    public void removeAccuracy() {}
    public double getAltitude() { return 0.0; }
    public void setAltitude(double p0) {}
    public boolean hasAltitude() { return false; }
    public void removeAltitude() {}
    public float getVerticalAccuracyMeters() { return 0.0f; }
    public void setVerticalAccuracyMeters(float p0) {}
    public boolean hasVerticalAccuracy() { return false; }
    public void removeVerticalAccuracy() {}
    public float getSpeed() { return 0.0f; }
    public void setSpeed(float p0) {}
    public boolean hasSpeed() { return false; }
    public void removeSpeed() {}
    public float getSpeedAccuracyMetersPerSecond() { return 0.0f; }
    public void setSpeedAccuracyMetersPerSecond(float p0) {}
    public boolean hasSpeedAccuracy() { return false; }
    public void removeSpeedAccuracy() {}
    public float getBearing() { return 0.0f; }
    public void setBearing(float p0) {}
    public boolean hasBearing() { return false; }
    public void removeBearing() {}
    public float getBearingAccuracyDegrees() { return 0.0f; }
    public void setBearingAccuracyDegrees(float p0) {}
    public boolean hasBearingAccuracy() { return false; }
    public void removeBearingAccuracy() {}
    @java.lang.Deprecated
    public boolean isFromMockProvider() { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public void setIsFromMockProvider(boolean p0) {}
    public boolean isMock() { return false; }
    public void setMock(boolean p0) {}
    public android.os.Bundle getExtras() { return null; }
    public void setExtras(android.os.Bundle p0) {}
    public boolean isComplete() { return false; }
    @android.annotation.SystemApi
    public void makeComplete() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    @java.lang.Deprecated
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static java.lang.String convert(double p0, int p1) { return null; }
    public static double convert(java.lang.String p0) { return 0.0; }
    public static void distanceBetween(double p0, double p1, double p2, double p3, float[] p4) {}

    private static class BearingDistanceCache {
        double mLat1;
        double mLon1;
        double mLat2;
        double mLon2;
        float mDistance;
        float mInitialBearing;
        float mFinalBearing;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Format {
    }
}
