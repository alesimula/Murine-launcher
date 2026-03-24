package android.view;

public final class SurfaceControl implements android.os.Parcelable {
    private static final java.lang.String TAG = "SurfaceControl";
    private java.util.ArrayList<android.view.SurfaceControl.OnReparentListener> mReparentListeners;
    private java.lang.String mName;
    public long mNativeObject;
    private long mNativeHandle;
    private final java.lang.Object mLock = null;
    private int mWidth;
    private int mHeight;
    private int mTransformHint;
    private java.lang.ref.WeakReference<android.view.View> mLocalOwnerView;
    static android.view.SurfaceControl.GlobalTransactionWrapper sGlobalTransaction;
    static long sTransactionNestCount;
    public static final int HIDDEN = 4;
    public static final int SKIP_SCREENSHOT = 64;
    public static final int SECURE = 128;
    public static final int ENABLE_BACKPRESSURE = 256;
    public static final int NON_PREMULTIPLIED = 256;
    public static final int OPAQUE = 1024;
    public static final int PROTECTED_APP = 2048;
    public static final int CURSOR_WINDOW = 8192;
    public static final int NO_COLOR_FILL = 16384;
    public static final int FX_SURFACE_NORMAL = 0;
    public static final int FX_SURFACE_EFFECT = 131072;
    public static final int FX_SURFACE_CONTAINER = 524288;
    public static final int FX_SURFACE_BLAST = 262144;
    public static final int FX_SURFACE_MASK = 983040;
    private static final int SURFACE_HIDDEN = 1;
    private static final int SURFACE_OPAQUE = 2;
    public static final int POWER_MODE_OFF = 0;
    public static final int POWER_MODE_DOZE = 1;
    public static final int POWER_MODE_NORMAL = 2;
    public static final int POWER_MODE_DOZE_SUSPEND = 3;
    public static final int POWER_MODE_ON_SUSPEND = 4;
    private static final int INTERNAL_DATASPACE_SRGB = 142671872;
    private static final int INTERNAL_DATASPACE_DISPLAY_P3 = 143261696;
    private static final int INTERNAL_DATASPACE_SCRGB = 411107328;
    public static final int METADATA_OWNER_UID = 1;
    public static final int METADATA_WINDOW_TYPE = 2;
    public static final int METADATA_TASK_ID = 3;
    public static final int METADATA_MOUSE_CURSOR = 4;
    public static final int METADATA_ACCESSIBILITY_ID = 5;
    public static final int METADATA_OWNER_PID = 6;
    public static final int METADATA_GAME_MODE = 8;
    public static final android.os.Parcelable.Creator<android.view.SurfaceControl> CREATOR = null;
    private static native long nativeCreate(android.view.SurfaceSession p0, java.lang.String p1, int p2, int p3, int p4, int p5, long p6, android.os.Parcel p7) throws android.view.Surface.OutOfResourcesException;
    private static native long nativeReadFromParcel(android.os.Parcel p0);
    private static native long nativeCopyFromSurfaceControl(long p0);
    private static native void nativeWriteToParcel(long p0, android.os.Parcel p1);
    private static native void nativeRelease(long p0);
    private static native void nativeDisconnect(long p0);
    private static native void nativeUpdateDefaultBufferSize(long p0, int p1, int p2);
    private static native int nativeCaptureDisplay(android.view.SurfaceControl.DisplayCaptureArgs p0, android.view.SurfaceControl.ScreenCaptureListener p1);
    private static native int nativeCaptureLayers(android.view.SurfaceControl.LayerCaptureArgs p0, android.view.SurfaceControl.ScreenCaptureListener p1);
    private static native long nativeMirrorSurface(long p0);
    private static native long nativeCreateTransaction();
    private static native long nativeGetNativeTransactionFinalizer();
    private static native void nativeApplyTransaction(long p0, boolean p1);
    private static native void nativeMergeTransaction(long p0, long p1);
    private static native void nativeClearTransaction(long p0);
    private static native void nativeSetAnimationTransaction(long p0);
    private static native void nativeSetEarlyWakeupStart(long p0);
    private static native void nativeSetEarlyWakeupEnd(long p0);
    private static native void nativeSetLayer(long p0, long p1, int p2);
    private static native void nativeSetRelativeLayer(long p0, long p1, long p2, int p3);
    private static native void nativeSetPosition(long p0, long p1, float p2, float p3);
    private static native void nativeSetSize(long p0, long p1, int p2, int p3);
    private static native void nativeSetTransparentRegionHint(long p0, long p1, android.graphics.Region p2);
    private static native void nativeSetAlpha(long p0, long p1, float p2);
    private static native void nativeSetMatrix(long p0, long p1, float p2, float p3, float p4, float p5);
    private static native void nativeSetColorTransform(long p0, long p1, float[] p2, float[] p3);
    private static native void nativeSetColorSpaceAgnostic(long p0, long p1, boolean p2);
    private static native void nativeSetGeometry(long p0, long p1, android.graphics.Rect p2, android.graphics.Rect p3, long p4);
    private static native void nativeSetColor(long p0, long p1, float[] p2);
    private static native void nativeSetFlags(long p0, long p1, int p2, int p3);
    private static native void nativeSetFrameRateSelectionPriority(long p0, long p1, int p2);
    private static native void nativeSetWindowCrop(long p0, long p1, int p2, int p3, int p4, int p5);
    private static native void nativeSetCornerRadius(long p0, long p1, float p2);
    private static native void nativeSetBackgroundBlurRadius(long p0, long p1, int p2);
    private static native void nativeSetLayerStack(long p0, long p1, int p2);
    private static native void nativeSetBlurRegions(long p0, long p1, float[][] p2, int p3);
    private static native void nativeSetStretchEffect(long p0, long p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10, float p11);
    private static native void nativeSetTrustedOverlay(long p0, long p1, boolean p2);
    private static native boolean nativeClearContentFrameStats(long p0);
    private static native boolean nativeGetContentFrameStats(long p0, android.view.WindowContentFrameStats p1);
    private static native boolean nativeClearAnimationFrameStats();
    private static native boolean nativeGetAnimationFrameStats(android.view.WindowAnimationFrameStats p0);
    private static native long[] nativeGetPhysicalDisplayIds();
    private static native android.os.IBinder nativeGetPhysicalDisplayToken(long p0);
    private static native android.os.IBinder nativeCreateDisplay(java.lang.String p0, boolean p1);
    private static native void nativeDestroyDisplay(android.os.IBinder p0);
    private static native void nativeSetDisplaySurface(long p0, android.os.IBinder p1, long p2);
    private static native void nativeSetDisplayLayerStack(long p0, android.os.IBinder p1, int p2);
    private static native void nativeSetDisplayProjection(long p0, android.os.IBinder p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10);
    private static native void nativeSetDisplaySize(long p0, android.os.IBinder p1, int p2, int p3);
    private static native android.view.SurfaceControl.StaticDisplayInfo nativeGetStaticDisplayInfo(android.os.IBinder p0);
    private static native android.view.SurfaceControl.DynamicDisplayInfo nativeGetDynamicDisplayInfo(android.os.IBinder p0);
    private static native android.hardware.display.DisplayedContentSamplingAttributes nativeGetDisplayedContentSamplingAttributes(android.os.IBinder p0);
    private static native boolean nativeSetDisplayedContentSamplingEnabled(android.os.IBinder p0, boolean p1, int p2, int p3);
    private static native android.hardware.display.DisplayedContentSample nativeGetDisplayedContentSample(android.os.IBinder p0, long p1, long p2);
    private static native boolean nativeSetDesiredDisplayModeSpecs(android.os.IBinder p0, android.view.SurfaceControl.DesiredDisplayModeSpecs p1);
    private static native android.view.SurfaceControl.DesiredDisplayModeSpecs nativeGetDesiredDisplayModeSpecs(android.os.IBinder p0);
    private static native android.view.SurfaceControl.DisplayPrimaries nativeGetDisplayNativePrimaries(android.os.IBinder p0);
    private static native int[] nativeGetCompositionDataspaces();
    private static native boolean nativeSetActiveColorMode(android.os.IBinder p0, int p1);
    private static native void nativeSetAutoLowLatencyMode(android.os.IBinder p0, boolean p1);
    private static native void nativeSetGameContentType(android.os.IBinder p0, boolean p1);
    private static native void nativeSetDisplayPowerMode(android.os.IBinder p0, int p1);
    private static native void nativeReparent(long p0, long p1, long p2);
    private static native void nativeSetBuffer(long p0, long p1, android.graphics.GraphicBuffer p2);
    private static native void nativeSetColorSpace(long p0, long p1, int p2);
    private static native void nativeOverrideHdrTypes(android.os.IBinder p0, int[] p1);
    private static native void nativeSetInputWindowInfo(long p0, long p1, android.view.InputWindowHandle p2);
    private static native boolean nativeGetProtectedContentSupport();
    private static native void nativeSetMetadata(long p0, long p1, int p2, android.os.Parcel p3);
    private static native void nativeSyncInputWindows(long p0);
    private static native boolean nativeGetDisplayBrightnessSupport(android.os.IBinder p0);
    private static native boolean nativeSetDisplayBrightness(android.os.IBinder p0, float p1, float p2, float p3, float p4);
    private static native long nativeReadTransactionFromParcel(android.os.Parcel p0);
    private static native void nativeWriteTransactionToParcel(long p0, android.os.Parcel p1);
    private static native void nativeSetShadowRadius(long p0, long p1, float p2);
    private static native void nativeSetGlobalShadowSettings(float[] p0, float[] p1, float p2, float p3, float p4);
    private static native void nativeSetFrameRate(long p0, long p1, float p2, int p3, int p4);
    private static native long nativeGetHandle(long p0);
    private static native long nativeAcquireFrameRateFlexibilityToken();
    private static native void nativeReleaseFrameRateFlexibilityToken(long p0);
    private static native void nativeSetFixedTransformHint(long p0, long p1, int p2);
    private static native void nativeSetFocusedWindow(long p0, android.os.IBinder p1, java.lang.String p2, android.os.IBinder p3, java.lang.String p4, int p5);
    private static native void nativeSetFrameTimelineVsync(long p0, long p1);
    private static native void nativeAddJankDataListener(long p0, long p1);
    private static native void nativeRemoveJankDataListener(long p0);
    private static native long nativeCreateJankDataListenerWrapper(android.view.SurfaceControl.OnJankDataListener p0);
    private static native int nativeGetGPUContextPriority();
    private static native void nativeSetTransformHint(long p0, int p1);
    private static native int nativeGetTransformHint(long p0);
    public boolean addOnReparentListener(android.view.SurfaceControl.OnReparentListener p0) { return false; }
    public boolean removeOnReparentListener(android.view.SurfaceControl.OnReparentListener p0) { return false; }
    private void assignNativeObject(long p0, java.lang.String p1) {}
    public void copyFrom(android.view.SurfaceControl p0, java.lang.String p1) {}
    private SurfaceControl(android.view.SurfaceSession p0, java.lang.String p1, int p2, int p3, int p4, int p5, android.view.SurfaceControl p6, android.util.SparseIntArray p7, java.lang.ref.WeakReference<android.view.View> p8, java.lang.String p9) throws android.view.Surface.OutOfResourcesException, java.lang.IllegalArgumentException {}
    public SurfaceControl(android.view.SurfaceControl p0, java.lang.String p1) {}
    private SurfaceControl(android.os.Parcel p0) {}
    public SurfaceControl() {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean isSameSurface(android.view.SurfaceControl p0) { return false; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    protected void finalize() throws java.lang.Throwable {}
    public void release() {}
    public void disconnect() {}
    private void checkNotReleased() {}
    public boolean isValid() { return false; }
    public static void openTransaction() {}
    @java.lang.Deprecated
    public static void mergeToGlobalTransaction(android.view.SurfaceControl.Transaction p0) {}
    public static void closeTransaction() {}
    public boolean clearContentFrameStats() { return false; }
    public boolean getContentFrameStats(android.view.WindowContentFrameStats p0) { return false; }
    public static boolean clearAnimationFrameStats() { return false; }
    public static boolean getAnimationFrameStats(android.view.WindowAnimationFrameStats p0) { return false; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public android.view.View getLocalOwnerView() { return null; }
    public java.lang.String toString() { return null; }
    public static void setDisplayPowerMode(android.os.IBinder p0, int p1) {}
    public static android.view.SurfaceControl.StaticDisplayInfo getStaticDisplayInfo(android.os.IBinder p0) { return null; }
    public static android.view.SurfaceControl.DynamicDisplayInfo getDynamicDisplayInfo(android.os.IBinder p0) { return null; }
    public static android.hardware.display.DisplayedContentSamplingAttributes getDisplayedContentSamplingAttributes(android.os.IBinder p0) { return null; }
    public static boolean setDisplayedContentSamplingEnabled(android.os.IBinder p0, boolean p1, int p2, int p3) { return false; }
    public static android.hardware.display.DisplayedContentSample getDisplayedContentSample(android.os.IBinder p0, long p1, long p2) { return null; }
    public static boolean setDesiredDisplayModeSpecs(android.os.IBinder p0, android.view.SurfaceControl.DesiredDisplayModeSpecs p1) { return false; }
    public static android.view.SurfaceControl.DesiredDisplayModeSpecs getDesiredDisplayModeSpecs(android.os.IBinder p0) { return null; }
    public static android.view.SurfaceControl.DisplayPrimaries getDisplayNativePrimaries(android.os.IBinder p0) { return null; }
    public static boolean setActiveColorMode(android.os.IBinder p0, int p1) { return false; }
    public static android.graphics.ColorSpace[] getCompositionColorSpaces() { return null; }
    public static void setAutoLowLatencyMode(android.os.IBinder p0, boolean p1) {}
    public static void setGameContentType(android.os.IBinder p0, boolean p1) {}
    public static void setDisplayProjection(android.os.IBinder p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3) {}
    public static void setDisplayLayerStack(android.os.IBinder p0, int p1) {}
    public static void setDisplaySurface(android.os.IBinder p0, android.view.Surface p1) {}
    public static void setDisplaySize(android.os.IBinder p0, int p1, int p2) {}
    public static void overrideHdrTypes(android.os.IBinder p0, int[] p1) {}
    public static android.os.IBinder createDisplay(java.lang.String p0, boolean p1) { return null; }
    public static void destroyDisplay(android.os.IBinder p0) {}
    public static long[] getPhysicalDisplayIds() { return null; }
    public static android.os.IBinder getPhysicalDisplayToken(long p0) { return null; }
    public static android.os.IBinder getInternalDisplayToken() { return null; }
    public static int captureDisplay(android.view.SurfaceControl.DisplayCaptureArgs p0, android.view.SurfaceControl.ScreenCaptureListener p1) { return 0; }
    public static android.view.SurfaceControl.ScreenshotHardwareBuffer captureDisplay(android.view.SurfaceControl.DisplayCaptureArgs p0) { return null; }
    public static android.view.SurfaceControl.ScreenshotHardwareBuffer captureLayers(android.view.SurfaceControl p0, android.graphics.Rect p1, float p2) { return null; }
    public static android.view.SurfaceControl.ScreenshotHardwareBuffer captureLayers(android.view.SurfaceControl p0, android.graphics.Rect p1, float p2, int p3) { return null; }
    public static android.view.SurfaceControl.ScreenshotHardwareBuffer captureLayers(android.view.SurfaceControl.LayerCaptureArgs p0) { return null; }
    public static android.view.SurfaceControl.ScreenshotHardwareBuffer captureLayersExcluding(android.view.SurfaceControl p0, android.graphics.Rect p1, float p2, int p3, android.view.SurfaceControl[] p4) { return null; }
    public static int captureLayers(android.view.SurfaceControl.LayerCaptureArgs p0, android.view.SurfaceControl.ScreenCaptureListener p1) { return 0; }
    public static boolean getProtectedContentSupport() { return false; }
    public static boolean getDisplayBrightnessSupport(android.os.IBinder p0) { return false; }
    public static boolean setDisplayBrightness(android.os.IBinder p0, float p1) { return false; }
    public static boolean setDisplayBrightness(android.os.IBinder p0, float p1, float p2, float p3, float p4) { return false; }
    public static android.view.SurfaceControl mirrorSurface(android.view.SurfaceControl p0) { return null; }
    private static void validateColorArg(float[] p0) {}
    public static void setGlobalShadowSettings(float[] p0, float[] p1, float p2, float p3, float p4) {}
    public static void addJankDataListener(android.view.SurfaceControl.OnJankDataListener p0, android.view.SurfaceControl p1) {}
    public static void removeJankDataListener(android.view.SurfaceControl.OnJankDataListener p0) {}
    public static int getGPUContextPriority() { return 0; }
    public static long acquireFrameRateFlexibilityToken() { return 0L; }
    public static void releaseFrameRateFlexibilityToken(long p0) {}
    public static android.view.SurfaceControl.Transaction getGlobalTransaction() { return null; }
    public void resize(int p0, int p1) {}
    public int getTransformHint() { return 0; }
    public void setTransformHint(int p0) {}

    public static class Builder {
        private android.view.SurfaceSession mSession;
        private int mFlags;
        private int mWidth;
        private int mHeight;
        private int mFormat;
        private java.lang.String mName;
        private java.lang.ref.WeakReference<android.view.View> mLocalOwnerView;
        private android.view.SurfaceControl mParent;
        private android.util.SparseIntArray mMetadata;
        private java.lang.String mCallsite;
        public Builder(android.view.SurfaceSession p0) {}
        public Builder() {}
        public android.view.SurfaceControl build() { return null; }
        public android.view.SurfaceControl.Builder setName(java.lang.String p0) { return null; }
        public android.view.SurfaceControl.Builder setLocalOwnerView(android.view.View p0) { return null; }
        public android.view.SurfaceControl.Builder setBufferSize(int p0, int p1) { return null; }
        private void unsetBufferSize() {}
        public android.view.SurfaceControl.Builder setFormat(int p0) { return null; }
        public android.view.SurfaceControl.Builder setProtected(boolean p0) { return null; }
        public android.view.SurfaceControl.Builder setSecure(boolean p0) { return null; }
        public android.view.SurfaceControl.Builder setOpaque(boolean p0) { return null; }
        public android.view.SurfaceControl.Builder setHidden(boolean p0) { return null; }
        public android.view.SurfaceControl.Builder setParent(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Builder setMetadata(int p0, int p1) { return null; }
        public android.view.SurfaceControl.Builder setEffectLayer() { return null; }
        public android.view.SurfaceControl.Builder setColorLayer() { return null; }
        private boolean isEffectLayer() { return false; }
        public android.view.SurfaceControl.Builder setBLASTLayer() { return null; }
        public android.view.SurfaceControl.Builder setContainerLayer() { return null; }
        private boolean isContainerLayer() { return false; }
        public android.view.SurfaceControl.Builder setFlags(int p0) { return null; }
        public android.view.SurfaceControl.Builder setCallsite(java.lang.String p0) { return null; }
        private android.view.SurfaceControl.Builder setFlags(int p0, int p1) { return null; }
    }

    private static abstract class CaptureArgs {
        private final int mPixelFormat = 0;
        private final android.graphics.Rect mSourceCrop = null;
        private final float mFrameScaleX = 0.0f;
        private final float mFrameScaleY = 0.0f;
        private final boolean mCaptureSecureLayers = false;
        private final boolean mAllowProtected = false;
        private final long mUid = 0L;
        private final boolean mGrayscale = false;
        private CaptureArgs(android.view.SurfaceControl.CaptureArgs.Builder<? extends android.view.SurfaceControl.CaptureArgs.Builder<?>> p0) {}

        static abstract class Builder<T extends android.view.SurfaceControl.CaptureArgs.Builder<T>> {
            private int mPixelFormat;
            private final android.graphics.Rect mSourceCrop = null;
            private float mFrameScaleX;
            private float mFrameScaleY;
            private boolean mCaptureSecureLayers;
            private boolean mAllowProtected;
            private long mUid;
            private boolean mGrayscale;
            Builder() {}
            public T setPixelFormat(int p0) { return null; }
            public T setSourceCrop(android.graphics.Rect p0) { return null; }
            public T setFrameScale(float p0) { return null; }
            public T setFrameScale(float p0, float p1) { return null; }
            public T setCaptureSecureLayers(boolean p0) { return null; }
            public T setAllowProtected(boolean p0) { return null; }
            public T setUid(long p0) { return null; }
            public T setGrayscale(boolean p0) { return null; }
            abstract T getThis();
        }
    }

    public static final class CieXyz {
        public float X;
        public float Y;
        public float Z;
        public CieXyz() {}
    }

    public static final class DesiredDisplayModeSpecs {
        public int defaultMode;
        public float primaryRefreshRateMin;
        public float primaryRefreshRateMax;
        public float appRequestRefreshRateMin;
        public float appRequestRefreshRateMax;
        public boolean allowGroupSwitching;
        public DesiredDisplayModeSpecs() {}
        public DesiredDisplayModeSpecs(android.view.SurfaceControl.DesiredDisplayModeSpecs p0) {}
        public DesiredDisplayModeSpecs(int p0, boolean p1, float p2, float p3, float p4, float p5) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public boolean equals(android.view.SurfaceControl.DesiredDisplayModeSpecs p0) { return false; }
        public int hashCode() { return 0; }
        public void copyFrom(android.view.SurfaceControl.DesiredDisplayModeSpecs p0) {}
        public java.lang.String toString() { return null; }
    }

    public static class DisplayCaptureArgs extends android.view.SurfaceControl.CaptureArgs {
        private final android.os.IBinder mDisplayToken = null;
        private final int mWidth = 0;
        private final int mHeight = 0;
        private final boolean mUseIdentityTransform = false;
        private DisplayCaptureArgs(android.view.SurfaceControl.DisplayCaptureArgs.Builder p0) { super(null); }

        public static class Builder extends android.view.SurfaceControl.CaptureArgs.Builder<android.view.SurfaceControl.DisplayCaptureArgs.Builder> {
            private android.os.IBinder mDisplayToken;
            private int mWidth;
            private int mHeight;
            private boolean mUseIdentityTransform;
            public android.view.SurfaceControl.DisplayCaptureArgs build() { return null; }
            public Builder(android.os.IBinder p0) { super(); }
            public android.view.SurfaceControl.DisplayCaptureArgs.Builder setDisplayToken(android.os.IBinder p0) { return null; }
            public android.view.SurfaceControl.DisplayCaptureArgs.Builder setSize(int p0, int p1) { return null; }
            public android.view.SurfaceControl.DisplayCaptureArgs.Builder setUseIdentityTransform(boolean p0) { return null; }
            android.view.SurfaceControl.DisplayCaptureArgs.Builder getThis() { return null; }
        }
    }

    public static final class DisplayMode {
        public static final int INVALID_DISPLAY_MODE_ID = -1;
        public int id;
        public int width;
        public int height;
        public float xDpi;
        public float yDpi;
        public float refreshRate;
        public long appVsyncOffsetNanos;
        public long presentationDeadlineNanos;
        public int group;
        public DisplayMode() {}
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static final class DisplayPrimaries {
        public android.view.SurfaceControl.CieXyz red;
        public android.view.SurfaceControl.CieXyz green;
        public android.view.SurfaceControl.CieXyz blue;
        public android.view.SurfaceControl.CieXyz white;
        public DisplayPrimaries() {}
    }

    public static final class DynamicDisplayInfo {
        public android.view.SurfaceControl.DisplayMode[] supportedDisplayModes;
        public int activeDisplayModeId;
        public int[] supportedColorModes;
        public int activeColorMode;
        public android.view.Display.HdrCapabilities hdrCapabilities;
        public boolean autoLowLatencyModeSupported;
        public boolean gameContentTypeSupported;
        public DynamicDisplayInfo() {}
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private static class GlobalTransactionWrapper extends android.view.SurfaceControl.Transaction {
        private GlobalTransactionWrapper() { super(); }
        void applyGlobalTransaction(boolean p0) {}
        public void apply(boolean p0) {}
    }

    public static class JankData {
        public static final int JANK_NONE = 0;
        public static final int DISPLAY_HAL = 1;
        public static final int JANK_SURFACEFLINGER_DEADLINE_MISSED = 2;
        public static final int JANK_SURFACEFLINGER_GPU_DEADLINE_MISSED = 4;
        public static final int JANK_APP_DEADLINE_MISSED = 8;
        public static final int PREDICTION_ERROR = 16;
        public static final int SURFACE_FLINGER_SCHEDULING = 32;
        public static final int BUFFER_STUFFING = 64;
        public static final int UNKNOWN = 128;
        public final long frameVsyncId = 0L;
        public final int jankType = 0;
        public JankData(long p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface JankType {
        }
    }

    public static class LayerCaptureArgs extends android.view.SurfaceControl.CaptureArgs {
        private final long mNativeLayer = 0L;
        private final long[] mNativeExcludeLayers = null;
        private final boolean mChildrenOnly = false;
        private LayerCaptureArgs(android.view.SurfaceControl.LayerCaptureArgs.Builder p0) { super(null); }

        public static class Builder extends android.view.SurfaceControl.CaptureArgs.Builder<android.view.SurfaceControl.LayerCaptureArgs.Builder> {
            private android.view.SurfaceControl mLayer;
            private android.view.SurfaceControl[] mExcludeLayers;
            private boolean mChildrenOnly;
            public android.view.SurfaceControl.LayerCaptureArgs build() { return null; }
            public Builder(android.view.SurfaceControl p0) { super(); }
            public android.view.SurfaceControl.LayerCaptureArgs.Builder setLayer(android.view.SurfaceControl p0) { return null; }
            public android.view.SurfaceControl.LayerCaptureArgs.Builder setExcludeLayers(android.view.SurfaceControl[] p0) { return null; }
            public android.view.SurfaceControl.LayerCaptureArgs.Builder setChildrenOnly(boolean p0) { return null; }
            android.view.SurfaceControl.LayerCaptureArgs.Builder getThis() { return null; }
        }
    }

    public static class LockDebuggingTransaction extends android.view.SurfaceControl.Transaction {
        java.lang.Object mMonitor;
        public LockDebuggingTransaction(java.lang.Object p0) { super(); }
        protected void checkPreconditions(android.view.SurfaceControl p0) {}
    }

    public static abstract class OnJankDataListener {
        private final com.android.internal.util.VirtualRefBasePtr mNativePtr = null;
        public OnJankDataListener() {}
        public abstract void onJankDataAvailable(android.view.SurfaceControl.JankData[] p0);
    }

    public static interface OnReparentListener {
        public void onReparent(android.view.SurfaceControl.Transaction p0, android.view.SurfaceControl p1);
    }

    public static interface ScreenCaptureListener {
        public void onScreenCaptureComplete(android.view.SurfaceControl.ScreenshotHardwareBuffer p0);
    }

    public static class ScreenshotHardwareBuffer {
        private final android.hardware.HardwareBuffer mHardwareBuffer = null;
        private final android.graphics.ColorSpace mColorSpace = null;
        private final boolean mContainsSecureLayers = false;
        public ScreenshotHardwareBuffer(android.hardware.HardwareBuffer p0, android.graphics.ColorSpace p1, boolean p2) {}
        private static android.view.SurfaceControl.ScreenshotHardwareBuffer createFromNative(android.hardware.HardwareBuffer p0, int p1, boolean p2) { return null; }
        public android.graphics.ColorSpace getColorSpace() { return null; }
        public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
        public boolean containsSecureLayers() { return false; }
        public android.graphics.Bitmap asBitmap() { return null; }
    }

    public static final class StaticDisplayInfo {
        public boolean isInternal;
        public float density;
        public boolean secure;
        public android.hardware.display.DeviceProductInfo deviceProductInfo;
        public StaticDisplayInfo() {}
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private static class SyncScreenCaptureListener implements android.view.SurfaceControl.ScreenCaptureListener {
        private static final int SCREENSHOT_WAIT_TIME_S = 1;
        private android.view.SurfaceControl.ScreenshotHardwareBuffer mScreenshotHardwareBuffer;
        private final java.util.concurrent.CountDownLatch mCountDownLatch = null;
        private SyncScreenCaptureListener() {}
        public void onScreenCaptureComplete(android.view.SurfaceControl.ScreenshotHardwareBuffer p0) {}
        private android.view.SurfaceControl.ScreenshotHardwareBuffer waitForScreenshot() { return null; }
    }

    public static class Transaction implements java.io.Closeable, android.os.Parcelable {
        public long mNativeObject;
        private final android.util.ArrayMap<android.view.SurfaceControl, android.graphics.Point> mResizedSurfaces = null;
        private final android.util.ArrayMap<android.view.SurfaceControl, android.view.SurfaceControl> mReparentedSurfaces = null;
        java.lang.Runnable mFreeNativeResources;
        private static final float[] INVALID_COLOR = null;
        public static final android.os.Parcelable.Creator<android.view.SurfaceControl.Transaction> CREATOR = null;
        protected void checkPreconditions(android.view.SurfaceControl p0) {}
        public Transaction() {}
        private Transaction(android.os.Parcel p0) {}
        public void apply() {}
        public void clear() {}
        public void close() {}
        public void apply(boolean p0) {}
        protected void applyResizedSurfaces() {}
        protected void notifyReparentedSurfaces() {}
        public android.view.SurfaceControl.Transaction setVisibility(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setFrameRateSelectionPriority(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction show(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Transaction hide(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Transaction setPosition(android.view.SurfaceControl p0, float p1, float p2) { return null; }
        public android.view.SurfaceControl.Transaction setBufferSize(android.view.SurfaceControl p0, int p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setFixedTransformHint(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction unsetFixedTransformHint(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Transaction setLayer(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setRelativeLayer(android.view.SurfaceControl p0, android.view.SurfaceControl p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setTransparentRegionHint(android.view.SurfaceControl p0, android.graphics.Region p1) { return null; }
        public android.view.SurfaceControl.Transaction setAlpha(android.view.SurfaceControl p0, float p1) { return null; }
        public android.view.SurfaceControl.Transaction setInputWindowInfo(android.view.SurfaceControl p0, android.view.InputWindowHandle p1) { return null; }
        public android.view.SurfaceControl.Transaction syncInputWindows() { return null; }
        public android.view.SurfaceControl.Transaction setGeometry(android.view.SurfaceControl p0, android.graphics.Rect p1, android.graphics.Rect p2, int p3) { return null; }
        public android.view.SurfaceControl.Transaction setMatrix(android.view.SurfaceControl p0, float p1, float p2, float p3, float p4) { return null; }
        public android.view.SurfaceControl.Transaction setMatrix(android.view.SurfaceControl p0, android.graphics.Matrix p1, float[] p2) { return null; }
        public android.view.SurfaceControl.Transaction setColorTransform(android.view.SurfaceControl p0, float[] p1, float[] p2) { return null; }
        public android.view.SurfaceControl.Transaction setColorSpaceAgnostic(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setWindowCrop(android.view.SurfaceControl p0, android.graphics.Rect p1) { return null; }
        public android.view.SurfaceControl.Transaction setWindowCrop(android.view.SurfaceControl p0, int p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setCornerRadius(android.view.SurfaceControl p0, float p1) { return null; }
        public android.view.SurfaceControl.Transaction setBackgroundBlurRadius(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setBlurRegions(android.view.SurfaceControl p0, float[][] p1) { return null; }
        public android.view.SurfaceControl.Transaction setStretchEffect(android.view.SurfaceControl p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10) { return null; }
        public android.view.SurfaceControl.Transaction setLayerStack(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction reparent(android.view.SurfaceControl p0, android.view.SurfaceControl p1) { return null; }
        public android.view.SurfaceControl.Transaction setColor(android.view.SurfaceControl p0, float[] p1) { return null; }
        public android.view.SurfaceControl.Transaction unsetColor(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Transaction setSecure(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setOpaque(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplaySurface(android.os.IBinder p0, android.view.Surface p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplayLayerStack(android.os.IBinder p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplayProjection(android.os.IBinder p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3) { return null; }
        public android.view.SurfaceControl.Transaction setDisplaySize(android.os.IBinder p0, int p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setAnimationTransaction() { return null; }
        public android.view.SurfaceControl.Transaction setEarlyWakeupStart() { return null; }
        public android.view.SurfaceControl.Transaction setEarlyWakeupEnd() { return null; }
        public android.view.SurfaceControl.Transaction setMetadata(android.view.SurfaceControl p0, int p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setMetadata(android.view.SurfaceControl p0, int p1, android.os.Parcel p2) { return null; }
        public android.view.SurfaceControl.Transaction setShadowRadius(android.view.SurfaceControl p0, float p1) { return null; }
        public android.view.SurfaceControl.Transaction setFrameRate(android.view.SurfaceControl p0, float p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setFrameRate(android.view.SurfaceControl p0, float p1, int p2, int p3) { return null; }
        public android.view.SurfaceControl.Transaction setFocusedWindow(android.os.IBinder p0, java.lang.String p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction requestFocusTransfer(android.os.IBinder p0, java.lang.String p1, android.os.IBinder p2, java.lang.String p3, int p4) { return null; }
        public android.view.SurfaceControl.Transaction setSkipScreenshot(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setBuffer(android.view.SurfaceControl p0, android.graphics.GraphicBuffer p1) { return null; }
        public android.view.SurfaceControl.Transaction setColorSpace(android.view.SurfaceControl p0, android.graphics.ColorSpace p1) { return null; }
        public android.view.SurfaceControl.Transaction setTrustedOverlay(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction merge(android.view.SurfaceControl.Transaction p0) { return null; }
        public android.view.SurfaceControl.Transaction remove(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Transaction setFrameTimelineVsync(long p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        private void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }
}
