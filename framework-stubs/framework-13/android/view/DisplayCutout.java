package android.view;

public final class DisplayCutout {
    public static final java.lang.String EMULATION_OVERLAY_CATEGORY = "com.android.internal.display_cutout_emulation";
    public static final android.view.DisplayCutout NO_CUTOUT = null;
    public static final int BOUNDS_POSITION_LEFT = 0;
    public static final int BOUNDS_POSITION_TOP = 1;
    public static final int BOUNDS_POSITION_RIGHT = 2;
    public static final int BOUNDS_POSITION_BOTTOM = 3;
    public static final int BOUNDS_POSITION_LENGTH = 4;
    public DisplayCutout(android.graphics.Insets p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4) {}
    public DisplayCutout(android.graphics.Insets p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4, android.graphics.Insets p5, android.view.DisplayCutout.CutoutPathParserInfo p6) {}
    public DisplayCutout(android.graphics.Insets p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, android.graphics.Rect p4, android.graphics.Insets p5) {}
    @java.lang.Deprecated
    public DisplayCutout(android.graphics.Rect p0, java.util.List<android.graphics.Rect> p1) {}
    public android.graphics.Insets getWaterfallInsets() { return null; }
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
    public android.graphics.Path getCutoutPath() { return null; }
    public android.view.DisplayCutout.CutoutPathParserInfo getCutoutPathParserInfo() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public android.view.DisplayCutout inset(int p0, int p1, int p2, int p3) { return null; }
    public android.view.DisplayCutout replaceSafeInsets(android.graphics.Rect p0) { return null; }
    public static android.view.DisplayCutout fromBoundingRect(int p0, int p1, int p2, int p3, int p4) { return null; }
    public static android.view.DisplayCutout constructDisplayCutout(android.graphics.Rect[] p0, android.graphics.Insets p1, android.view.DisplayCutout.CutoutPathParserInfo p2) { return null; }
    public static android.view.DisplayCutout fromBounds(android.graphics.Rect[] p0) { return null; }
    public static boolean getMaskBuiltInDisplayCutout(android.content.res.Resources p0, java.lang.String p1) { return false; }
    public static boolean getFillBuiltInDisplayCutout(android.content.res.Resources p0, java.lang.String p1) { return false; }
    public static android.view.DisplayCutout fromResourcesRectApproximation(android.content.res.Resources p0, java.lang.String p1, int p2, int p3, int p4, int p5) { return null; }
    public static android.view.DisplayCutout fromSpec(java.lang.String p0, int p1, int p2, float p3, android.graphics.Insets p4) { return null; }
    public android.view.DisplayCutout getRotated(int p0, int p1, int p2, int p3) { return null; }
    public static android.graphics.Rect computeSafeInsets(int p0, int p1, android.view.DisplayCutout p2) { return null; }

    private static class Bounds {
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BoundsPosition {
    }

    public static final class Builder {
        public Builder() {}
        public android.view.DisplayCutout build() { return null; }
        public android.view.DisplayCutout.Builder setSafeInsets(android.graphics.Insets p0) { return null; }
        public android.view.DisplayCutout.Builder setWaterfallInsets(android.graphics.Insets p0) { return null; }
        public android.view.DisplayCutout.Builder setBoundingRectLeft(android.graphics.Rect p0) { return null; }
        public android.view.DisplayCutout.Builder setBoundingRectTop(android.graphics.Rect p0) { return null; }
        public android.view.DisplayCutout.Builder setBoundingRectRight(android.graphics.Rect p0) { return null; }
        public android.view.DisplayCutout.Builder setBoundingRectBottom(android.graphics.Rect p0) { return null; }
        public android.view.DisplayCutout.Builder setCutoutPath(android.graphics.Path p0) { return null; }
    }

    public static class CutoutPathParserInfo {
        public CutoutPathParserInfo(int p0, int p1, int p2, int p3, float p4, java.lang.String p5, int p6, float p7, float p8) {}
        public CutoutPathParserInfo(android.view.DisplayCutout.CutoutPathParserInfo p0) {}
        public int getDisplayWidth() { return 0; }
        public int getDisplayHeight() { return 0; }
        public int getPhysicalDisplayWidth() { return 0; }
        public int getPhysicalDisplayHeight() { return 0; }
        public float getDensity() { return 0.0f; }
        public java.lang.String getCutoutSpec() { return null; }
        public int getRotation() { return 0; }
        public float getScale() { return 0.0f; }
        public float getPhysicalPixelDisplaySizeRatio() { return 0.0f; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }

    public static final class ParcelableWrapper implements android.os.Parcelable {
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
        public void scale(float p0) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }
}
