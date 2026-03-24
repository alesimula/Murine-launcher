package android.view;

public class RoundedCorners implements android.os.Parcelable {
    public static final android.view.RoundedCorners NO_ROUNDED_CORNERS = null;
    public static final int ROUNDED_CORNER_POSITION_LENGTH = 4;
    private static final java.lang.Object CACHE_LOCK = null;
    private static int sCachedDisplayWidth;
    private static int sCachedDisplayHeight;
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> sCachedRadii;
    private static android.view.RoundedCorners sCachedRoundedCorners;
    public final android.view.RoundedCorner[] mRoundedCorners = null;
    public static final android.os.Parcelable.Creator<android.view.RoundedCorners> CREATOR = null;
    public RoundedCorners(android.view.RoundedCorner[] p0) {}
    public RoundedCorners(android.view.RoundedCorner p0, android.view.RoundedCorner p1, android.view.RoundedCorner p2, android.view.RoundedCorner p3) {}
    public RoundedCorners(android.view.RoundedCorners p0) {}
    public static android.view.RoundedCorners fromResources(android.content.res.Resources p0, int p1, int p2) { return null; }
    public static android.view.RoundedCorners fromRadii(android.util.Pair<java.lang.Integer, java.lang.Integer> p0, int p1, int p2) { return null; }
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> loadRoundedCornerRadii(android.content.res.Resources p0) { return null; }
    public android.view.RoundedCorners inset(int p0, int p1, int p2, int p3) { return null; }
    private android.view.RoundedCorner insetRoundedCorner(int p0, int p1, int p2, int p3, int p4) { return null; }
    public android.view.RoundedCorner getRoundedCorner(int p0) { return null; }
    public void setRoundedCorner(int p0, android.view.RoundedCorner p1) {}
    public android.view.RoundedCorner[] getAllRoundedCorners() { return null; }
    public android.view.RoundedCorners scale(float p0) { return null; }
    public android.view.RoundedCorners rotate(int p0, int p1, int p2) { return null; }
    private static android.view.RoundedCorner createRoundedCorner(int p0, int p1, int p2, int p3) { return null; }
    private static int getRotatedIndex(int p0, int p1) { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
