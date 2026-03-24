package android.view;

public final class DisplayCutout {
    private static final java.lang.String TAG = "DisplayCutout";
    private static final java.lang.String BOTTOM_MARKER = "@bottom";
    private static final java.lang.String DP_MARKER = "@dp";
    private static final java.lang.String RIGHT_MARKER = "@right";
    public static final java.lang.String EMULATION_OVERLAY_CATEGORY = "com.android.internal.display_cutout_emulation";
    private static final android.graphics.Rect ZERO_RECT = null;
    public static final android.view.DisplayCutout NO_CUTOUT = null;
    private static final android.util.Pair<android.graphics.Path, android.view.DisplayCutout> NULL_PAIR = null;
    private static final java.lang.Object CACHE_LOCK = null;
    private static java.lang.String sCachedSpec;
    private static int sCachedDisplayWidth;
    private static int sCachedDisplayHeight;
    private static float sCachedDensity;
    private static android.util.Pair<android.graphics.Path, android.view.DisplayCutout> sCachedCutout;
    private final android.graphics.Rect mSafeInsets = null;
    public static final int BOUNDS_POSITION_LEFT = 0;
    public static final int BOUNDS_POSITION_TOP = 1;
    public static final int BOUNDS_POSITION_RIGHT = 2;
    public static final int BOUNDS_POSITION_BOTTOM = 3;
    public static final int BOUNDS_POSITION_LENGTH = 4;
    private final android.view.DisplayCutout.Bounds mBounds = null;
    public DisplayCutout(android.graphics.Insets p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4) {}
    @java.lang.Deprecated
    public DisplayCutout(android.graphics.Rect p0, java.util.List<android.graphics.Rect> p1) {}
    private DisplayCutout(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4, boolean p5) {}
    private DisplayCutout(android.graphics.Rect p0, android.graphics.Rect[] p1, boolean p2) {}
    private DisplayCutout(android.graphics.Rect p0, android.view.DisplayCutout.Bounds p1) {}
    private static android.graphics.Rect getCopyOrRef(android.graphics.Rect p0, boolean p1) { return null; }
    public static android.graphics.Rect[] extractBoundsFromList(android.graphics.Rect p0, java.util.List<android.graphics.Rect> p1) { return null; }
    public boolean isBoundsEmpty() { return false; }
    public boolean isEmpty() { return false; }
    public int getSafeInsetTop() { return 0; }
    public int getSafeInsetBottom() { return 0; }
    public int getSafeInsetLeft() { return 0; }
    public int getSafeInsetRight() { return 0; }
    public android.graphics.Rect getSafeInsets() { return null; }
    public java.util.List<android.graphics.Rect> getBoundingRects() { return null; }
    public android.graphics.Rect[] getBoundingRectsAll() { return null; }
    public android.graphics.Rect getBoundingRectLeft() { return null; }
    public android.graphics.Rect getBoundingRectTop() { return null; }
    public android.graphics.Rect getBoundingRectRight() { return null; }
    public android.graphics.Rect getBoundingRectBottom() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1) {}
    public android.view.DisplayCutout inset(int p0, int p1, int p2, int p3) { return null; }
    public android.view.DisplayCutout replaceSafeInsets(android.graphics.Rect p0) { return null; }
    private static int atLeastZero(int p0) { return 0; }
    public static android.view.DisplayCutout fromBoundingRect(int p0, int p1, int p2, int p3, int p4) { return null; }
    public static android.view.DisplayCutout fromBounds(android.graphics.Rect[] p0) { return null; }
    public static android.view.DisplayCutout fromResourcesRectApproximation(android.content.res.Resources p0, int p1, int p2) { return null; }
    public static android.graphics.Path pathFromResources(android.content.res.Resources p0, int p1, int p2) { return null; }
    public static android.view.DisplayCutout fromSpec(java.lang.String p0, int p1, int p2, float p3) { return null; }
    private static android.util.Pair<android.graphics.Path, android.view.DisplayCutout> pathAndDisplayCutoutFromSpec(java.lang.String p0, int p1, int p2, float p3) { return null; }
    private static void toRectAndAddToRegion(android.graphics.Path p0, android.graphics.Region p1, android.graphics.Rect p2) {}

    public static final class ParcelableWrapper implements android.os.Parcelable {
        private android.view.DisplayCutout mInner;
        public static final android.os.Parcelable.Creator<android.view.DisplayCutout.ParcelableWrapper> CREATOR = null;
        public ParcelableWrapper() {}
        public ParcelableWrapper(android.view.DisplayCutout p0) {}
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public static void writeCutoutToParcel(android.view.DisplayCutout p0, android.os.Parcel p1, int p2) {}
        public void readFromParcel(android.os.Parcel p0) {}
        public static android.view.DisplayCutout readCutoutFromParcel(android.os.Parcel p0) { return null; }
        public android.view.DisplayCutout get() { return null; }
        public void set(android.view.DisplayCutout.ParcelableWrapper p0) {}
        public void set(android.view.DisplayCutout p0) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BoundsPosition {
    }

    private static class Bounds {
        private final android.graphics.Rect[] mRects = null;
        private Bounds(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, boolean p4) {}
        private Bounds(android.graphics.Rect[] p0, boolean p1) {}
        private boolean isEmpty() { return false; }
        private android.graphics.Rect getRect(int p0) { return null; }
        private android.graphics.Rect[] getRects() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }
}
