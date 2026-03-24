package android.window;

public final class SizeConfigurationBuckets implements android.os.Parcelable {
    private final int[] mHorizontal = null;
    private final int[] mVertical = null;
    private final int[] mSmallest = null;
    public static final android.os.Parcelable.Creator<android.window.SizeConfigurationBuckets> CREATOR = null;
    public SizeConfigurationBuckets(android.content.res.Configuration[] p0) {}
    public static int filterDiff(int p0, android.content.res.Configuration p1, android.content.res.Configuration p2, android.window.SizeConfigurationBuckets p3) { return 0; }
    private boolean crossesHorizontalSizeThreshold(int p0, int p1) { return false; }
    private boolean crossesVerticalSizeThreshold(int p0, int p1) { return false; }
    private boolean crossesSmallestSizeThreshold(int p0, int p1) { return false; }
    private static boolean crossesSizeThreshold(int[] p0, int p1, int p2) { return false; }
    public java.lang.String toString() { return null; }
    public SizeConfigurationBuckets(int[] p0, int[] p1, int[] p2) {}
    public int[] getHorizontal() { return null; }
    public int[] getVertical() { return null; }
    public int[] getSmallest() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    SizeConfigurationBuckets(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
}
