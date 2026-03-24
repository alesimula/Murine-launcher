package android.view;

public class DisplayAdjustments {
    public static final android.view.DisplayAdjustments DEFAULT_DISPLAY_ADJUSTMENTS = null;
    private volatile android.content.res.CompatibilityInfo mCompatInfo;
    private final android.content.res.Configuration mConfiguration = null;
    private android.view.DisplayAdjustments.FixedRotationAdjustments mFixedRotationAdjustments;
    public DisplayAdjustments() {}
    public DisplayAdjustments(android.content.res.Configuration p0) {}
    public DisplayAdjustments(android.view.DisplayAdjustments p0) {}
    public void setCompatibilityInfo(android.content.res.CompatibilityInfo p0) {}
    public android.content.res.CompatibilityInfo getCompatibilityInfo() { return null; }
    public void setConfiguration(android.content.res.Configuration p0) {}
    public android.content.res.Configuration getConfiguration() { return null; }
    public void setFixedRotationAdjustments(android.view.DisplayAdjustments.FixedRotationAdjustments p0) {}
    public android.view.DisplayAdjustments.FixedRotationAdjustments getFixedRotationAdjustments() { return null; }
    private boolean noFlip(int p0) { return false; }
    public void adjustSize(android.graphics.Point p0, int p1) {}
    public void adjustMetrics(android.util.DisplayMetrics p0, int p1) {}
    public void adjustGlobalAppMetrics(android.util.DisplayMetrics p0) {}
    public android.view.DisplayCutout getDisplayCutout(android.view.DisplayCutout p0) { return null; }
    public int getRotation(int p0) { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }

    public static class FixedRotationAdjustments implements android.os.Parcelable {
        final int mRotation = 0;
        final int mAppWidth = 0;
        final int mAppHeight = 0;
        final android.view.DisplayCutout mRotatedDisplayCutout = null;
        public static final android.os.Parcelable.Creator<android.view.DisplayAdjustments.FixedRotationAdjustments> CREATOR = null;
        public FixedRotationAdjustments(int p0, int p1, int p2, android.view.DisplayCutout p3) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        private FixedRotationAdjustments(android.os.Parcel p0) {}
    }
}
