package android.view;

public final class Display {
    private static final java.lang.String TAG = "Display";
    private static final boolean DEBUG = false;
    private final android.hardware.display.DisplayManagerGlobal mGlobal = null;
    private final int mDisplayId = 0;
    private final int mLayerStack = 0;
    private final int mFlags = 0;
    private final int mType = 0;
    private final android.view.DisplayAddress mAddress = null;
    private final int mOwnerUid = 0;
    private final java.lang.String mOwnerPackageName = null;
    private final android.content.res.Resources mResources = null;
    private android.view.DisplayAdjustments mDisplayAdjustments;
    @android.annotation.UnsupportedAppUsage
    private android.view.DisplayInfo mDisplayInfo;
    private boolean mIsValid;
    private final android.util.DisplayMetrics mTempMetrics = null;
    private static final int CACHED_APP_SIZE_DURATION_MILLIS = 20;
    private long mLastCachedAppSizeUpdate;
    private int mCachedAppWidthCompat;
    private int mCachedAppHeightCompat;
    public static final int DEFAULT_DISPLAY = 0;
    public static final int INVALID_DISPLAY = -1;
    public static final int FLAG_SUPPORTS_PROTECTED_BUFFERS = 1;
    public static final int FLAG_SECURE = 2;
    public static final int FLAG_PRIVATE = 4;
    public static final int FLAG_PRESENTATION = 8;
    public static final int FLAG_ROUND = 16;
    public static final int FLAG_CAN_SHOW_WITH_INSECURE_KEYGUARD = 32;
    public static final int FLAG_SHOULD_SHOW_SYSTEM_DECORATIONS = 64;
    public static final int FLAG_SCALING_DISABLED = 1073741824;
    @android.annotation.UnsupportedAppUsage
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_BUILT_IN = 1;
    @android.annotation.UnsupportedAppUsage
    public static final int TYPE_HDMI = 2;
    @android.annotation.UnsupportedAppUsage
    public static final int TYPE_WIFI = 3;
    public static final int TYPE_OVERLAY = 4;
    @android.annotation.UnsupportedAppUsage
    public static final int TYPE_VIRTUAL = 5;
    public static final int STATE_UNKNOWN = 0;
    public static final int STATE_OFF = 1;
    public static final int STATE_ON = 2;
    public static final int STATE_DOZE = 3;
    public static final int STATE_DOZE_SUSPEND = 4;
    public static final int STATE_VR = 5;
    public static final int STATE_ON_SUSPEND = 6;
    public static final int COLOR_MODE_INVALID = -1;
    public static final int COLOR_MODE_DEFAULT = 0;
    public static final int COLOR_MODE_BT601_625 = 1;
    public static final int COLOR_MODE_BT601_625_UNADJUSTED = 2;
    public static final int COLOR_MODE_BT601_525 = 3;
    public static final int COLOR_MODE_BT601_525_UNADJUSTED = 4;
    public static final int COLOR_MODE_BT709 = 5;
    public static final int COLOR_MODE_DCI_P3 = 6;
    public static final int COLOR_MODE_SRGB = 7;
    public static final int COLOR_MODE_ADOBE_RGB = 8;
    public static final int COLOR_MODE_DISPLAY_P3 = 9;
    public static final int REMOVE_MODE_MOVE_CONTENT_TO_PRIMARY = 0;
    public static final int REMOVE_MODE_DESTROY_CONTENT = 1;
    public Display(android.hardware.display.DisplayManagerGlobal p0, int p1, android.view.DisplayInfo p2, android.view.DisplayAdjustments p3) {}
    public Display(android.hardware.display.DisplayManagerGlobal p0, int p1, android.view.DisplayInfo p2, android.content.res.Resources p3) {}
    private Display(android.hardware.display.DisplayManagerGlobal p0, int p1, android.view.DisplayInfo p2, android.view.DisplayAdjustments p3, android.content.res.Resources p4) {}
    public int getDisplayId() { return 0; }
    public java.lang.String getUniqueId() { return null; }
    public boolean isValid() { return false; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public boolean getDisplayInfo(android.view.DisplayInfo p0) { return false; }
    public int getLayerStack() { return 0; }
    public int getFlags() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int getType() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public android.view.DisplayAddress getAddress() { return null; }
    public int getOwnerUid() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public java.lang.String getOwnerPackageName() { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.view.DisplayAdjustments getDisplayAdjustments() { return null; }
    public java.lang.String getName() { return null; }
    public void getSize(android.graphics.Point p0) {}
    public void getRectSize(android.graphics.Rect p0) {}
    public void getCurrentSizeRange(android.graphics.Point p0, android.graphics.Point p1) {}
    @android.annotation.UnsupportedAppUsage
    public int getMaximumSizeDimension() { return 0; }
    @java.lang.Deprecated
    public int getWidth() { return 0; }
    @java.lang.Deprecated
    public int getHeight() { return 0; }
    public void getOverscanInsets(android.graphics.Rect p0) {}
    public int getRotation() { return 0; }
    @java.lang.Deprecated
    public int getOrientation() { return 0; }
    public android.view.DisplayCutout getCutout() { return null; }
    @java.lang.Deprecated
    public int getPixelFormat() { return 0; }
    public float getRefreshRate() { return 0.0f; }
    @java.lang.Deprecated
    public float[] getSupportedRefreshRates() { return null; }
    public android.view.Display.Mode getMode() { return null; }
    public android.view.Display.Mode[] getSupportedModes() { return null; }
    public void requestColorMode(int p0) {}
    public int getColorMode() { return 0; }
    public int getRemoveMode() { return 0; }
    public android.view.Display.HdrCapabilities getHdrCapabilities() { return null; }
    public boolean isHdr() { return false; }
    public boolean isWideColorGamut() { return false; }
    public android.graphics.ColorSpace getPreferredWideGamutColorSpace() { return null; }
    public int[] getSupportedColorModes() { return null; }
    public long getAppVsyncOffsetNanos() { return 0L; }
    public long getPresentationDeadlineNanos() { return 0L; }
    public void getMetrics(android.util.DisplayMetrics p0) {}
    public void getRealSize(android.graphics.Point p0) {}
    public void getRealMetrics(android.util.DisplayMetrics p0) {}
    public int getState() { return 0; }
    public boolean hasAccess(int p0) { return false; }
    public static boolean hasAccess(int p0, int p1, int p2, int p3) { return false; }
    public boolean isPublicPresentation() { return false; }
    private void updateDisplayInfoLocked() {}
    private void updateCachedAppSizeIfNeededLocked() {}
    public java.lang.String toString() { return null; }
    public static java.lang.String typeToString(int p0) { return null; }
    public static java.lang.String stateToString(int p0) { return null; }
    public static boolean isSuspendedState(int p0) { return false; }
    public static boolean isDozeState(int p0) { return false; }

    public static final class Mode implements android.os.Parcelable {
        public static final android.view.Display.Mode[] EMPTY_ARRAY = null;
        private final int mModeId = 0;
        private final int mWidth = 0;
        private final int mHeight = 0;
        private final float mRefreshRate = 0.0f;
        public static final android.os.Parcelable.Creator<android.view.Display.Mode> CREATOR = null;
        @android.annotation.UnsupportedAppUsage
        public Mode(int p0, int p1, int p2, float p3) {}
        public int getModeId() { return 0; }
        public int getPhysicalWidth() { return 0; }
        public int getPhysicalHeight() { return 0; }
        public float getRefreshRate() { return 0.0f; }
        public boolean matches(int p0, int p1, float p2) { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        private Mode(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class HdrCapabilities implements android.os.Parcelable {
        public static final float INVALID_LUMINANCE = -1.0f;
        public static final int HDR_TYPE_DOLBY_VISION = 1;
        public static final int HDR_TYPE_HDR10 = 2;
        public static final int HDR_TYPE_HLG = 3;
        public static final int HDR_TYPE_HDR10_PLUS = 4;
        private int[] mSupportedHdrTypes;
        private float mMaxLuminance;
        private float mMaxAverageLuminance;
        private float mMinLuminance;
        public static final android.os.Parcelable.Creator<android.view.Display.HdrCapabilities> CREATOR = null;
        public HdrCapabilities() {}
        @android.annotation.UnsupportedAppUsage
        public HdrCapabilities(int[] p0, float p1, float p2, float p3) {}
        public int[] getSupportedHdrTypes() { return null; }
        public float getDesiredMaxLuminance() { return 0.0f; }
        public float getDesiredMaxAverageLuminance() { return 0.0f; }
        public float getDesiredMinLuminance() { return 0.0f; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        private HdrCapabilities(android.os.Parcel p0) {}
        public void readFromParcel(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface HdrType {
        }
    }
}
