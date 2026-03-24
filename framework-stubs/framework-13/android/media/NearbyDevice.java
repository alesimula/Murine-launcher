package android.media;

@android.annotation.SystemApi
public final class NearbyDevice implements android.os.Parcelable {
    public static final int RANGE_UNKNOWN = 0;
    public static final int RANGE_FAR = 1;
    public static final int RANGE_LONG = 2;
    public static final int RANGE_CLOSE = 3;
    public static final int RANGE_WITHIN_REACH = 4;
    public static final android.os.Parcelable.Creator<android.media.NearbyDevice> CREATOR = null;
    public static java.lang.String rangeZoneToString(int p0) { return null; }
    public NearbyDevice(java.lang.String p0, int p1) {}
    public static int compareRangeZones(int p0, int p1) { return 0; }
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String getMediaRoute2Id() { return null; }
    public int getRangeZone() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface RangeZone {
    }
}
