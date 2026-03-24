package android.content.res;

public class CompatibilityInfo implements android.os.Parcelable {
    public static final android.content.res.CompatibilityInfo DEFAULT_COMPATIBILITY_INFO = null;
    public static final int DEFAULT_NORMAL_SHORT_DIMENSION = 320;
    public static final float MAXIMUM_ASPECT_RATIO = 1.7791666984558105f;
    public final int applicationDensity = 0;
    public final float applicationScale = 0.0f;
    public final float applicationInvertedScale = 0.0f;
    public static final android.os.Parcelable.Creator<android.content.res.CompatibilityInfo> CREATOR = null;
    @java.lang.Deprecated
    public CompatibilityInfo(android.content.pm.ApplicationInfo p0, int p1, int p2, boolean p3) {}
    public CompatibilityInfo(android.content.pm.ApplicationInfo p0, int p1, int p2, boolean p3, float p4) {}
    public boolean isScalingRequired() { return false; }
    public boolean hasOverrideScaling() { return false; }
    public boolean supportsScreen() { return false; }
    public boolean neverSupportsScreen() { return false; }
    public boolean alwaysSupportsScreen() { return false; }
    public boolean needsCompatResources() { return false; }
    public android.content.res.CompatibilityInfo.Translator getTranslator() { return null; }
    public void applyDisplayMetricsIfNeeded(android.util.DisplayMetrics p0, boolean p1) {}
    public void applyToDisplayMetrics(android.util.DisplayMetrics p0) {}
    public void applyToConfiguration(int p0, android.content.res.Configuration p1) {}
    public static void scaleConfiguration(float p0, android.content.res.Configuration p1) {}
    public static void applyOverrideScaleIfNeeded(android.content.res.Configuration p0) {}
    public static void applyOverrideScaleIfNeeded(android.util.MergedConfiguration p0) {}
    public static void setOverrideInvertedScale(float p0) {}
    public static float getOverrideInvertedScale() { return 0.0f; }
    public static float computeCompatibleScaling(android.util.DisplayMetrics p0, android.util.DisplayMetrics p1) { return 0.0f; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public class Translator {
        public final float applicationScale = 0.0f;
        public final float applicationInvertedScale = 0.0f;
        Translator(android.content.res.CompatibilityInfo p0, float p1, float p2) {}
        Translator(android.content.res.CompatibilityInfo p0) {}
        public void translateRegionInWindowToScreen(android.graphics.Region p0) {}
        public void translateCanvas(android.graphics.Canvas p0) {}
        public void translateEventInScreenToAppWindow(android.view.MotionEvent p0) {}
        public void translateWindowLayout(android.view.WindowManager.LayoutParams p0) {}
        public float translateLengthInAppWindowToScreen(float p0) { return 0.0f; }
        public void translateRectInAppWindowToScreen(android.graphics.Rect p0) {}
        public void translateRectInScreenToAppWindow(android.graphics.Rect p0) {}
        public void translateInsetsStateInScreenToAppWindow(android.view.InsetsState p0) {}
        public void translateSourceControlsInScreenToAppWindow(android.view.InsetsSourceControl[] p0) {}
        public void translatePointInScreenToAppWindow(android.graphics.PointF p0) {}
        public void translateLayoutParamsInAppWindowToScreen(android.view.WindowManager.LayoutParams p0) {}
        public android.graphics.Rect getTranslatedContentInsets(android.graphics.Rect p0) { return null; }
        public android.graphics.Rect getTranslatedVisibleInsets(android.graphics.Rect p0) { return null; }
        public android.graphics.Region getTranslatedTouchableArea(android.graphics.Region p0) { return null; }
    }
}
