package android.content.res;

public class CompatibilityInfo implements android.os.Parcelable {
    @android.annotation.UnsupportedAppUsage
    public static final android.content.res.CompatibilityInfo DEFAULT_COMPATIBILITY_INFO = null;
    public static final int DEFAULT_NORMAL_SHORT_DIMENSION = 320;
    public static final float MAXIMUM_ASPECT_RATIO = 1.7791666984558105f;
    private final int mCompatibilityFlags = 0;
    private static final int SCALING_REQUIRED = 1;
    private static final int ALWAYS_NEEDS_COMPAT = 2;
    private static final int NEVER_NEEDS_COMPAT = 4;
    private static final int NEEDS_SCREEN_COMPAT = 8;
    private static final int NEEDS_COMPAT_RES = 16;
    public final int applicationDensity = 0;
    @android.annotation.UnsupportedAppUsage
    public final float applicationScale = 0.0f;
    public final float applicationInvertedScale = 0.0f;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public static final android.os.Parcelable.Creator<android.content.res.CompatibilityInfo> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public CompatibilityInfo(android.content.pm.ApplicationInfo p0, int p1, int p2, boolean p3) {}
    private CompatibilityInfo(int p0, int p1, float p2, float p3) {}
    @android.annotation.UnsupportedAppUsage
    private CompatibilityInfo() {}
    @android.annotation.UnsupportedAppUsage
    public boolean isScalingRequired() { return false; }
    @android.annotation.UnsupportedAppUsage
    public boolean supportsScreen() { return false; }
    public boolean neverSupportsScreen() { return false; }
    public boolean alwaysSupportsScreen() { return false; }
    public boolean needsCompatResources() { return false; }
    @android.annotation.UnsupportedAppUsage
    public android.content.res.CompatibilityInfo.Translator getTranslator() { return null; }
    public void applyToDisplayMetrics(android.util.DisplayMetrics p0) {}
    public void applyToConfiguration(int p0, android.content.res.Configuration p1) {}
    @android.annotation.UnsupportedAppUsage
    public static float computeCompatibleScaling(android.util.DisplayMetrics p0, android.util.DisplayMetrics p1) { return 0.0f; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private CompatibilityInfo(android.os.Parcel p0) {}

    public class Translator {
        @android.annotation.UnsupportedAppUsage
        public final float applicationScale = 0.0f;
        @android.annotation.UnsupportedAppUsage
        public final float applicationInvertedScale = 0.0f;
        private android.graphics.Rect mContentInsetsBuffer;
        private android.graphics.Rect mVisibleInsetsBuffer;
        private android.graphics.Region mTouchableAreaBuffer;
        Translator(android.content.res.CompatibilityInfo p0, float p1, float p2) {}
        Translator(android.content.res.CompatibilityInfo p0) {}
        @android.annotation.UnsupportedAppUsage
        public void translateRectInScreenToAppWinFrame(android.graphics.Rect p0) {}
        @android.annotation.UnsupportedAppUsage
        public void translateRegionInWindowToScreen(android.graphics.Region p0) {}
        @android.annotation.UnsupportedAppUsage
        public void translateCanvas(android.graphics.Canvas p0) {}
        @android.annotation.UnsupportedAppUsage
        public void translateEventInScreenToAppWindow(android.view.MotionEvent p0) {}
        @android.annotation.UnsupportedAppUsage
        public void translateWindowLayout(android.view.WindowManager.LayoutParams p0) {}
        @android.annotation.UnsupportedAppUsage
        public void translateRectInAppWindowToScreen(android.graphics.Rect p0) {}
        @android.annotation.UnsupportedAppUsage
        public void translateRectInScreenToAppWindow(android.graphics.Rect p0) {}
        public void translatePointInScreenToAppWindow(android.graphics.PointF p0) {}
        public void translateLayoutParamsInAppWindowToScreen(android.view.WindowManager.LayoutParams p0) {}
        @android.annotation.UnsupportedAppUsage
        public android.graphics.Rect getTranslatedContentInsets(android.graphics.Rect p0) { return null; }
        public android.graphics.Rect getTranslatedVisibleInsets(android.graphics.Rect p0) { return null; }
        public android.graphics.Region getTranslatedTouchableArea(android.graphics.Region p0) { return null; }
    }
}
