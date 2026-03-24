package android.hardware.display;

@android.annotation.SystemApi
public final class AmbientBrightnessDayStats implements android.os.Parcelable {
    private final java.time.LocalDate mLocalDate = null;
    private final float[] mBucketBoundaries = null;
    private final float[] mStats = null;
    public static final android.os.Parcelable.Creator<android.hardware.display.AmbientBrightnessDayStats> CREATOR = null;
    public AmbientBrightnessDayStats(java.time.LocalDate p0, float[] p1) {}
    public AmbientBrightnessDayStats(java.time.LocalDate p0, float[] p1, float[] p2) {}
    public java.time.LocalDate getLocalDate() { return null; }
    public float[] getStats() { return null; }
    public float[] getBucketBoundaries() { return null; }
    private AmbientBrightnessDayStats(android.os.Parcel p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void log(float p0, float p1) {}
    private int getBucketIndex(float p0) { return 0; }
    private static void checkSorted(float[] p0) {}
}
