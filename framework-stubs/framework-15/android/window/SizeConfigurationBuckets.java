package android.window;

public final class SizeConfigurationBuckets implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.window.SizeConfigurationBuckets> CREATOR = null;
    public SizeConfigurationBuckets(android.content.res.Configuration[] p0) {}
    public static int filterDiff(int p0, android.content.res.Configuration p1, android.content.res.Configuration p2, android.window.SizeConfigurationBuckets p3) { return 0; }
    public boolean crossesScreenLayoutSizeThreshold(android.content.res.Configuration p0, android.content.res.Configuration p1) { return false; }
    public static boolean areNonSizeLayoutFieldsUnchanged(int p0, int p1) { return false; }
    public static boolean crossesSizeThreshold(int[] p0, int p1, int p2) { return false; }
    public java.lang.String toString() { return null; }
    public SizeConfigurationBuckets(int[] p0, int[] p1, int[] p2, int[] p3, boolean p4) {}
    @android.annotation.Nullable
    public int[] getHorizontal() { return null; }
    @android.annotation.Nullable
    public int[] getVertical() { return null; }
    @android.annotation.Nullable
    public int[] getSmallest() { return null; }
    @android.annotation.Nullable
    public int[] getScreenLayoutSize() { return null; }
    public boolean isScreenLayoutLongSet() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    SizeConfigurationBuckets(android.os.Parcel p0) {}
}
