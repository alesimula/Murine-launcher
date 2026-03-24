package android.hardware.gnss;

public class GnssLocation implements android.os.Parcelable {
    public int gnssLocationFlags;
    public double latitudeDegrees;
    public double longitudeDegrees;
    public double altitudeMeters;
    public double speedMetersPerSec;
    public double bearingDegrees;
    public double horizontalAccuracyMeters;
    public double verticalAccuracyMeters;
    public double speedAccuracyMetersPerSecond;
    public double bearingAccuracyDegrees;
    public long timestampMillis;
    public android.hardware.gnss.ElapsedRealtime elapsedRealtime;
    public static final android.os.Parcelable.Creator<android.hardware.gnss.GnssLocation> CREATOR = null;
    public static final int HAS_LAT_LONG = 1;
    public static final int HAS_ALTITUDE = 2;
    public static final int HAS_SPEED = 4;
    public static final int HAS_BEARING = 8;
    public static final int HAS_HORIZONTAL_ACCURACY = 16;
    public static final int HAS_VERTICAL_ACCURACY = 32;
    public static final int HAS_SPEED_ACCURACY = 64;
    public static final int HAS_BEARING_ACCURACY = 128;
    public GnssLocation() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
