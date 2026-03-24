package android.location;

public final class Geofence implements android.os.Parcelable {
    public static final int TYPE_HORIZONTAL_CIRCLE = 1;
    private final int mType = 0;
    private final double mLatitude = 0.0;
    private final double mLongitude = 0.0;
    private final float mRadius = 0.0f;
    public static final android.os.Parcelable.Creator<android.location.Geofence> CREATOR = null;
    public static android.location.Geofence createCircle(double p0, double p1, float p2) { return null; }
    private Geofence(double p0, double p1, float p2) {}
    public int getType() { return 0; }
    public double getLatitude() { return 0.0; }
    public double getLongitude() { return 0.0; }
    public float getRadius() { return 0.0f; }
    private static void checkRadius(float p0) {}
    private static void checkLatLong(double p0, double p1) {}
    private static void checkType(int p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private static java.lang.String typeToString(int p0) { return null; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
}
