package android.view;

public final class SurfaceControl implements android.os.Parcelable {
    private static final java.lang.String TAG = "SurfaceControl";
    private java.lang.String mName;
    long mNativeObject;
    private final java.lang.Object mSizeLock = null;
    private int mWidth;
    private int mHeight;
    static android.view.SurfaceControl.Transaction sGlobalTransaction;
    static long sTransactionNestCount;
    @android.annotation.UnsupportedAppUsage
    public static final int HIDDEN = 4;
    public static final int SECURE = 128;
    public static final int NON_PREMULTIPLIED = 256;
    public static final int OPAQUE = 1024;
    public static final int PROTECTED_APP = 2048;
    public static final int CURSOR_WINDOW = 8192;
    public static final int FX_SURFACE_NORMAL = 0;
    public static final int FX_SURFACE_DIM = 131072;
    public static final int FX_SURFACE_CONTAINER = 524288;
    public static final int FX_SURFACE_MASK = 983040;
    private static final int SURFACE_HIDDEN = 1;
    private static final int SURFACE_OPAQUE = 2;
    public static final int POWER_MODE_OFF = 0;
    public static final int POWER_MODE_DOZE = 1;
    public static final int POWER_MODE_NORMAL = 2;
    public static final int POWER_MODE_DOZE_SUSPEND = 3;
    public static final int POWER_MODE_ON_SUSPEND = 4;
    public static final int WINDOW_TYPE_DONT_SCREENSHOT = 441731;
    private static final int INTERNAL_DATASPACE_SRGB = 142671872;
    private static final int INTERNAL_DATASPACE_DISPLAY_P3 = 143261696;
    private static final int INTERNAL_DATASPACE_SCRGB = 411107328;
    public static final int METADATA_OWNER_UID = 1;
    public static final int METADATA_WINDOW_TYPE = 2;
    public static final int METADATA_TASK_ID = 3;
    public static final android.os.Parcelable.Creator<android.view.SurfaceControl> CREATOR = null;
    private static native long nativeCreate(android.view.SurfaceSession p0, java.lang.String p1, int p2, int p3, int p4, int p5, long p6, android.os.Parcel p7) throws android.view.Surface.OutOfResourcesException;
    private static native long nativeReadFromParcel(android.os.Parcel p0);
    private static native long nativeCopyFromSurfaceControl(long p0);
    private static native void nativeWriteToParcel(long p0, android.os.Parcel p1);
    private static native void nativeRelease(long p0);
    private static native void nativeDestroy(long p0);
    private static native void nativeDisconnect(long p0);
    private static native android.view.SurfaceControl.ScreenshotGraphicBuffer nativeScreenshot(android.os.IBinder p0, android.graphics.Rect p1, int p2, int p3, boolean p4, int p5, boolean p6);
    private static native android.view.SurfaceControl.ScreenshotGraphicBuffer nativeCaptureLayers(android.os.IBinder p0, android.os.IBinder p1, android.graphics.Rect p2, float p3, android.os.IBinder[] p4);
    private static native long nativeCreateTransaction();
    private static native long nativeGetNativeTransactionFinalizer();
    private static native void nativeApplyTransaction(long p0, boolean p1);
    private static native void nativeMergeTransaction(long p0, long p1);
    private static native void nativeSetAnimationTransaction(long p0);
    private static native void nativeSetEarlyWakeup(long p0);
    private static native void nativeSetLayer(long p0, long p1, int p2);
    private static native void nativeSetRelativeLayer(long p0, long p1, android.os.IBinder p2, int p3);
    private static native void nativeSetPosition(long p0, long p1, float p2, float p3);
    private static native void nativeSetGeometryAppliesWithResize(long p0, long p1);
    private static native void nativeSetSize(long p0, long p1, int p2, int p3);
    private static native void nativeSetTransparentRegionHint(long p0, long p1, android.graphics.Region p2);
    private static native void nativeSetAlpha(long p0, long p1, float p2);
    private static native void nativeSetMatrix(long p0, long p1, float p2, float p3, float p4, float p5);
    private static native void nativeSetColorTransform(long p0, long p1, float[] p2, float[] p3);
    private static native void nativeSetColorSpaceAgnostic(long p0, long p1, boolean p2);
    private static native void nativeSetGeometry(long p0, long p1, android.graphics.Rect p2, android.graphics.Rect p3, long p4);
    private static native void nativeSetColor(long p0, long p1, float[] p2);
    private static native void nativeSetFlags(long p0, long p1, int p2, int p3);
    private static native void nativeSetWindowCrop(long p0, long p1, int p2, int p3, int p4, int p5);
    private static native void nativeSetCornerRadius(long p0, long p1, float p2);
    private static native void nativeSetLayerStack(long p0, long p1, int p2);
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
    private static native android.view.SurfaceControl.PhysicalDisplayInfo[] nativeGetDisplayConfigs(android.os.IBinder p0);
    private static native android.hardware.display.DisplayedContentSamplingAttributes nativeGetDisplayedContentSamplingAttributes(android.os.IBinder p0);
    private static native boolean nativeSetDisplayedContentSamplingEnabled(android.os.IBinder p0, boolean p1, int p2, int p3);
    private static native android.hardware.display.DisplayedContentSample nativeGetDisplayedContentSample(android.os.IBinder p0, long p1, long p2);
    private static native int nativeGetActiveConfig(android.os.IBinder p0);
    private static native boolean nativeSetActiveConfig(android.os.IBinder p0, int p1);
    private static native boolean nativeSetAllowedDisplayConfigs(android.os.IBinder p0, int[] p1);
    private static native int[] nativeGetAllowedDisplayConfigs(android.os.IBinder p0);
    private static native int[] nativeGetDisplayColorModes(android.os.IBinder p0);
    private static native android.view.SurfaceControl.DisplayPrimaries nativeGetDisplayNativePrimaries(android.os.IBinder p0);
    private static native int[] nativeGetCompositionDataspaces();
    private static native int nativeGetActiveColorMode(android.os.IBinder p0);
    private static native boolean nativeSetActiveColorMode(android.os.IBinder p0, int p1);
    private static native void nativeSetDisplayPowerMode(android.os.IBinder p0, int p1);
    private static native void nativeDeferTransactionUntil(long p0, long p1, android.os.IBinder p2, long p3);
    private static native void nativeDeferTransactionUntilSurface(long p0, long p1, long p2, long p3);
    private static native void nativeReparentChildren(long p0, long p1, android.os.IBinder p2);
    private static native void nativeReparent(long p0, long p1, long p2);
    private static native void nativeSeverChildren(long p0, long p1);
    private static native void nativeSetOverrideScalingMode(long p0, long p1, int p2);
    private static native android.os.IBinder nativeGetHandle(long p0);
    private static native boolean nativeGetTransformToDisplayInverse(long p0);
    private static native android.view.Display.HdrCapabilities nativeGetHdrCapabilities(android.os.IBinder p0);
    private static native void nativeSetInputWindowInfo(long p0, long p1, android.view.InputWindowHandle p2);
    private static native void nativeTransferTouchFocus(long p0, android.os.IBinder p1, android.os.IBinder p2);
    private static native boolean nativeGetProtectedContentSupport();
    private static native void nativeSetMetadata(long p0, long p1, int p2, android.os.Parcel p3);
    private static native void nativeSyncInputWindows(long p0);
    private static native boolean nativeGetDisplayBrightnessSupport(android.os.IBinder p0);
    private static native boolean nativeSetDisplayBrightness(android.os.IBinder p0, float p1);
    private void assignNativeObject(long p0) {}
    public void copyFrom(android.view.SurfaceControl p0) {}
    private SurfaceControl(android.view.SurfaceSession p0, java.lang.String p1, int p2, int p3, int p4, int p5, android.view.SurfaceControl p6, android.util.SparseIntArray p7) throws android.view.Surface.OutOfResourcesException, java.lang.IllegalArgumentException {}
    public SurfaceControl(android.view.SurfaceControl p0) {}
    private SurfaceControl(android.os.Parcel p0) {}
    public SurfaceControl() {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1) {}
    protected void finalize() throws java.lang.Throwable {}
    public void release() {}
    public void remove() {}
    public void disconnect() {}
    private void checkNotReleased() {}
    public boolean isValid() { return false; }
    @android.annotation.UnsupportedAppUsage
    public static void openTransaction() {}
    @java.lang.Deprecated
    public static void mergeToGlobalTransaction(android.view.SurfaceControl.Transaction p0) {}
    @android.annotation.UnsupportedAppUsage
    public static void closeTransaction() {}
    public void deferTransactionUntil(android.os.IBinder p0, long p1) {}
    public void deferTransactionUntil(android.view.Surface p0, long p1) {}
    public void reparentChildren(android.os.IBinder p0) {}
    public void reparent(android.view.SurfaceControl p0) {}
    public void detachChildren() {}
    public void setOverrideScalingMode(int p0) {}
    public android.os.IBinder getHandle() { return null; }
    public static void setAnimationTransaction() {}
    @android.annotation.UnsupportedAppUsage
    public void setLayer(int p0) {}
    public void setRelativeLayer(android.view.SurfaceControl p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public void setPosition(float p0, float p1) {}
    public void setGeometryAppliesWithResize() {}
    public void setBufferSize(int p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public void hide() {}
    @android.annotation.UnsupportedAppUsage
    public void show() {}
    public void setTransparentRegionHint(android.graphics.Region p0) {}
    public boolean clearContentFrameStats() { return false; }
    public boolean getContentFrameStats(android.view.WindowContentFrameStats p0) { return false; }
    public static boolean clearAnimationFrameStats() { return false; }
    public static boolean getAnimationFrameStats(android.view.WindowAnimationFrameStats p0) { return false; }
    public void setAlpha(float p0) {}
    public void setColor(float[] p0) {}
    public void setMatrix(float p0, float p1, float p2, float p3) {}
    public void setMatrix(android.graphics.Matrix p0, float[] p1) {}
    public void setColorTransform(float[] p0, float[] p1) {}
    public void setColorSpaceAgnostic(boolean p0) {}
    public void setWindowCrop(android.graphics.Rect p0) {}
    public void setWindowCrop(int p0, int p1) {}
    public void setCornerRadius(float p0) {}
    public void setLayerStack(int p0) {}
    public void setOpaque(boolean p0) {}
    public void setSecure(boolean p0) {}
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public java.lang.String toString() { return null; }
    public static void setDisplayPowerMode(android.os.IBinder p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public static android.view.SurfaceControl.PhysicalDisplayInfo[] getDisplayConfigs(android.os.IBinder p0) { return null; }
    public static int getActiveConfig(android.os.IBinder p0) { return 0; }
    public static android.hardware.display.DisplayedContentSamplingAttributes getDisplayedContentSamplingAttributes(android.os.IBinder p0) { return null; }
    public static boolean setDisplayedContentSamplingEnabled(android.os.IBinder p0, boolean p1, int p2, int p3) { return false; }
    public static android.hardware.display.DisplayedContentSample getDisplayedContentSample(android.os.IBinder p0, long p1, long p2) { return null; }
    public static boolean setActiveConfig(android.os.IBinder p0, int p1) { return false; }
    public static boolean setAllowedDisplayConfigs(android.os.IBinder p0, int[] p1) { return false; }
    public static int[] getAllowedDisplayConfigs(android.os.IBinder p0) { return null; }
    public static int[] getDisplayColorModes(android.os.IBinder p0) { return null; }
    public static android.view.SurfaceControl.DisplayPrimaries getDisplayNativePrimaries(android.os.IBinder p0) { return null; }
    public static int getActiveColorMode(android.os.IBinder p0) { return 0; }
    public static boolean setActiveColorMode(android.os.IBinder p0, int p1) { return false; }
    public static android.graphics.ColorSpace[] getCompositionColorSpaces() { return null; }
    @android.annotation.UnsupportedAppUsage
    public static void setDisplayProjection(android.os.IBinder p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3) {}
    @android.annotation.UnsupportedAppUsage
    public static void setDisplayLayerStack(android.os.IBinder p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public static void setDisplaySurface(android.os.IBinder p0, android.view.Surface p1) {}
    public static void setDisplaySize(android.os.IBinder p0, int p1, int p2) {}
    public static android.view.Display.HdrCapabilities getHdrCapabilities(android.os.IBinder p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static android.os.IBinder createDisplay(java.lang.String p0, boolean p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static void destroyDisplay(android.os.IBinder p0) {}
    public static long[] getPhysicalDisplayIds() { return null; }
    public static android.os.IBinder getPhysicalDisplayToken(long p0) { return null; }
    public static android.os.IBinder getInternalDisplayToken() { return null; }
    public static void screenshot(android.os.IBinder p0, android.view.Surface p1) {}
    public static void screenshot(android.os.IBinder p0, android.view.Surface p1, android.graphics.Rect p2, int p3, int p4, boolean p5, int p6) {}
    @android.annotation.UnsupportedAppUsage
    public static android.graphics.Bitmap screenshot(android.graphics.Rect p0, int p1, int p2, int p3) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static android.graphics.Bitmap screenshot(android.graphics.Rect p0, int p1, int p2, boolean p3, int p4) { return null; }
    public static android.view.SurfaceControl.ScreenshotGraphicBuffer screenshotToBuffer(android.os.IBinder p0, android.graphics.Rect p1, int p2, int p3, boolean p4, int p5) { return null; }
    public static android.view.SurfaceControl.ScreenshotGraphicBuffer screenshotToBufferWithSecureLayersUnsafe(android.os.IBinder p0, android.graphics.Rect p1, int p2, int p3, boolean p4, int p5) { return null; }
    private static void rotateCropForSF(android.graphics.Rect p0, int p1) {}
    public static android.view.SurfaceControl.ScreenshotGraphicBuffer captureLayers(android.os.IBinder p0, android.graphics.Rect p1, float p2) { return null; }
    public static android.view.SurfaceControl.ScreenshotGraphicBuffer captureLayersExcluding(android.os.IBinder p0, android.graphics.Rect p1, float p2, android.os.IBinder[] p3) { return null; }
    public static boolean getProtectedContentSupport() { return false; }
    public static boolean getDisplayBrightnessSupport(android.os.IBinder p0) { return false; }
    public static boolean setDisplayBrightness(android.os.IBinder p0, float p1) { return false; }

    public static class Transaction implements java.io.Closeable {
        private long mNativeObject;
        private final android.util.ArrayMap<android.view.SurfaceControl, android.graphics.Point> mResizedSurfaces = null;
        java.lang.Runnable mFreeNativeResources;
        public Transaction() {}
        public void apply() {}
        public void close() {}
        public void apply(boolean p0) {}
        private void applyResizedSurfaces() {}
        public android.view.SurfaceControl.Transaction setVisibility(android.view.SurfaceControl p0, boolean p1) { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.view.SurfaceControl.Transaction show(android.view.SurfaceControl p0) { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.view.SurfaceControl.Transaction hide(android.view.SurfaceControl p0) { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.view.SurfaceControl.Transaction setPosition(android.view.SurfaceControl p0, float p1, float p2) { return null; }
        public android.view.SurfaceControl.Transaction setBufferSize(android.view.SurfaceControl p0, int p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setLayer(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setRelativeLayer(android.view.SurfaceControl p0, android.view.SurfaceControl p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setTransparentRegionHint(android.view.SurfaceControl p0, android.graphics.Region p1) { return null; }
        public android.view.SurfaceControl.Transaction setAlpha(android.view.SurfaceControl p0, float p1) { return null; }
        public android.view.SurfaceControl.Transaction setInputWindowInfo(android.view.SurfaceControl p0, android.view.InputWindowHandle p1) { return null; }
        public android.view.SurfaceControl.Transaction transferTouchFocus(android.os.IBinder p0, android.os.IBinder p1) { return null; }
        public android.view.SurfaceControl.Transaction syncInputWindows() { return null; }
        public android.view.SurfaceControl.Transaction setGeometry(android.view.SurfaceControl p0, android.graphics.Rect p1, android.graphics.Rect p2, int p3) { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.view.SurfaceControl.Transaction setMatrix(android.view.SurfaceControl p0, float p1, float p2, float p3, float p4) { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.view.SurfaceControl.Transaction setMatrix(android.view.SurfaceControl p0, android.graphics.Matrix p1, float[] p2) { return null; }
        public android.view.SurfaceControl.Transaction setColorTransform(android.view.SurfaceControl p0, float[] p1, float[] p2) { return null; }
        public android.view.SurfaceControl.Transaction setColorSpaceAgnostic(android.view.SurfaceControl p0, boolean p1) { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.view.SurfaceControl.Transaction setWindowCrop(android.view.SurfaceControl p0, android.graphics.Rect p1) { return null; }
        public android.view.SurfaceControl.Transaction setWindowCrop(android.view.SurfaceControl p0, int p1, int p2) { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.view.SurfaceControl.Transaction setCornerRadius(android.view.SurfaceControl p0, float p1) { return null; }
        @android.annotation.UnsupportedAppUsage(maxTargetSdk=26)
        public android.view.SurfaceControl.Transaction setLayerStack(android.view.SurfaceControl p0, int p1) { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.view.SurfaceControl.Transaction deferTransactionUntil(android.view.SurfaceControl p0, android.os.IBinder p1, long p2) { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.view.SurfaceControl.Transaction deferTransactionUntilSurface(android.view.SurfaceControl p0, android.view.Surface p1, long p2) { return null; }
        public android.view.SurfaceControl.Transaction reparentChildren(android.view.SurfaceControl p0, android.os.IBinder p1) { return null; }
        public android.view.SurfaceControl.Transaction reparent(android.view.SurfaceControl p0, android.view.SurfaceControl p1) { return null; }
        public android.view.SurfaceControl.Transaction detachChildren(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Transaction setOverrideScalingMode(android.view.SurfaceControl p0, int p1) { return null; }
        @android.annotation.UnsupportedAppUsage
        public android.view.SurfaceControl.Transaction setColor(android.view.SurfaceControl p0, float[] p1) { return null; }
        public android.view.SurfaceControl.Transaction setGeometryAppliesWithResize(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Transaction setSecure(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setOpaque(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplaySurface(android.os.IBinder p0, android.view.Surface p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplayLayerStack(android.os.IBinder p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplayProjection(android.os.IBinder p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3) { return null; }
        public android.view.SurfaceControl.Transaction setDisplaySize(android.os.IBinder p0, int p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setAnimationTransaction() { return null; }
        public android.view.SurfaceControl.Transaction setEarlyWakeup() { return null; }
        public android.view.SurfaceControl.Transaction setMetadata(android.view.SurfaceControl p0, int p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setMetadata(android.view.SurfaceControl p0, int p1, android.os.Parcel p2) { return null; }
        public android.view.SurfaceControl.Transaction merge(android.view.SurfaceControl.Transaction p0) { return null; }
        public android.view.SurfaceControl.Transaction remove(android.view.SurfaceControl p0) { return null; }
    }

    public static class ScreenshotGraphicBuffer {
        private final android.graphics.GraphicBuffer mGraphicBuffer = null;
        private final android.graphics.ColorSpace mColorSpace = null;
        private final boolean mContainsSecureLayers = false;
        public ScreenshotGraphicBuffer(android.graphics.GraphicBuffer p0, android.graphics.ColorSpace p1, boolean p2) {}
        private static android.view.SurfaceControl.ScreenshotGraphicBuffer createFromNative(int p0, int p1, int p2, int p3, long p4, int p5, boolean p6) { return null; }
        public android.graphics.ColorSpace getColorSpace() { return null; }
        public android.graphics.GraphicBuffer getGraphicBuffer() { return null; }
        public boolean containsSecureLayers() { return false; }
    }

    public static final class PhysicalDisplayInfo {
        @android.annotation.UnsupportedAppUsage
        public int width;
        @android.annotation.UnsupportedAppUsage
        public int height;
        @android.annotation.UnsupportedAppUsage
        public float refreshRate;
        @android.annotation.UnsupportedAppUsage
        public float density;
        @android.annotation.UnsupportedAppUsage
        public float xDpi;
        @android.annotation.UnsupportedAppUsage
        public float yDpi;
        @android.annotation.UnsupportedAppUsage
        public boolean secure;
        @android.annotation.UnsupportedAppUsage
        public long appVsyncOffsetNanos;
        @android.annotation.UnsupportedAppUsage
        public long presentationDeadlineNanos;
        @android.annotation.UnsupportedAppUsage
        public PhysicalDisplayInfo() {}
        public PhysicalDisplayInfo(android.view.SurfaceControl.PhysicalDisplayInfo p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public boolean equals(android.view.SurfaceControl.PhysicalDisplayInfo p0) { return false; }
        public int hashCode() { return 0; }
        public void copyFrom(android.view.SurfaceControl.PhysicalDisplayInfo p0) {}
        public java.lang.String toString() { return null; }
    }

    public static final class DisplayPrimaries {
        public android.view.SurfaceControl.CieXyz red;
        public android.view.SurfaceControl.CieXyz green;
        public android.view.SurfaceControl.CieXyz blue;
        public android.view.SurfaceControl.CieXyz white;
        public DisplayPrimaries() {}
    }

    public static final class CieXyz {
        public float X;
        public float Y;
        public float Z;
        public CieXyz() {}
    }

    public static class Builder {
        private android.view.SurfaceSession mSession;
        private int mFlags;
        private int mWidth;
        private int mHeight;
        private int mFormat;
        private java.lang.String mName;
        private android.view.SurfaceControl mParent;
        private android.util.SparseIntArray mMetadata;
        public Builder(android.view.SurfaceSession p0) {}
        public Builder() {}
        public android.view.SurfaceControl build() { return null; }
        public android.view.SurfaceControl.Builder setName(java.lang.String p0) { return null; }
        public android.view.SurfaceControl.Builder setBufferSize(int p0, int p1) { return null; }
        private void unsetBufferSize() {}
        public android.view.SurfaceControl.Builder setFormat(int p0) { return null; }
        public android.view.SurfaceControl.Builder setProtected(boolean p0) { return null; }
        public android.view.SurfaceControl.Builder setSecure(boolean p0) { return null; }
        public android.view.SurfaceControl.Builder setOpaque(boolean p0) { return null; }
        public android.view.SurfaceControl.Builder setParent(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Builder setMetadata(int p0, int p1) { return null; }
        public android.view.SurfaceControl.Builder setColorLayer() { return null; }
        private boolean isColorLayerSet() { return false; }
        public android.view.SurfaceControl.Builder setContainerLayer() { return null; }
        private boolean isContainerLayerSet() { return false; }
        public android.view.SurfaceControl.Builder setFlags(int p0) { return null; }
        private android.view.SurfaceControl.Builder setFlags(int p0, int p1) { return null; }
    }
}
