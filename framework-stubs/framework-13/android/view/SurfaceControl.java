package android.view;

public final class SurfaceControl implements android.os.Parcelable {
    public static final int BUFFER_TRANSFORM_IDENTITY = 0;
    public static final int BUFFER_TRANSFORM_MIRROR_HORIZONTAL = 1;
    public static final int BUFFER_TRANSFORM_MIRROR_VERTICAL = 2;
    public static final int BUFFER_TRANSFORM_ROTATE_90 = 4;
    public static final int BUFFER_TRANSFORM_ROTATE_180 = 3;
    public static final int BUFFER_TRANSFORM_ROTATE_270 = 7;
    public long mNativeObject;
    static android.view.SurfaceControl.GlobalTransactionWrapper sGlobalTransaction;
    static long sTransactionNestCount;
    public static final int HIDDEN = 4;
    public static final int SKIP_SCREENSHOT = 64;
    public static final int SECURE = 128;
    public static final int ENABLE_BACKPRESSURE = 256;
    public static final int DISPLAY_DECORATION = 512;
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
    public static final int DISPLAY_RECEIVES_INPUT = 1;
    public static final int POWER_MODE_OFF = 0;
    public static final int POWER_MODE_DOZE = 1;
    public static final int POWER_MODE_NORMAL = 2;
    public static final int POWER_MODE_DOZE_SUSPEND = 3;
    public static final int POWER_MODE_ON_SUSPEND = 4;
    public static final int METADATA_OWNER_UID = 1;
    public static final int METADATA_WINDOW_TYPE = 2;
    public static final int METADATA_TASK_ID = 3;
    public static final int METADATA_MOUSE_CURSOR = 4;
    public static final int METADATA_ACCESSIBILITY_ID = 5;
    public static final int METADATA_OWNER_PID = 6;
    public static final int METADATA_GAME_MODE = 8;
    public static final android.os.Parcelable.Creator<android.view.SurfaceControl> CREATOR = null;
    public static int rotationToBufferTransform(int p0) { return 0; }
    public boolean addOnReparentListener(android.view.SurfaceControl.OnReparentListener p0) { return false; }
    public boolean removeOnReparentListener(android.view.SurfaceControl.OnReparentListener p0) { return false; }
    public void copyFrom(android.view.SurfaceControl p0, java.lang.String p1) {}
    public SurfaceControl(android.view.SurfaceControl p0, java.lang.String p1) {}
    public SurfaceControl() {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean isSameSurface(android.view.SurfaceControl p0) { return false; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    protected void finalize() throws java.lang.Throwable {}
    public void release() {}
    public void disconnect() {}
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
    public static boolean getBootDisplayModeSupport() { return false; }
    public static void setBootDisplayMode(android.os.IBinder p0, int p1) {}
    public static void clearBootDisplayMode(android.os.IBinder p0) {}
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
    public static long getPrimaryPhysicalDisplayId() { return 0L; }
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
    public static void setGlobalShadowSettings(float[] p0, float[] p1, float p2, float p3, float p4) {}
    public static android.hardware.graphics.common.DisplayDecorationSupport getDisplayDecorationSupport(android.os.IBinder p0) { return null; }
    public static void addJankDataListener(android.view.SurfaceControl.OnJankDataListener p0, android.view.SurfaceControl p1) {}
    public static void removeJankDataListener(android.view.SurfaceControl.OnJankDataListener p0) {}
    public static int getGPUContextPriority() { return 0; }
    public static android.view.SurfaceControl.Transaction getGlobalTransaction() { return null; }
    public void resize(int p0, int p1) {}
    public int getTransformHint() { return 0; }
    public void setTransformHint(int p0) {}
    public int getLayerId() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BufferTransform {
    }

    public static class Builder {
        public Builder(android.view.SurfaceSession p0) {}
        public Builder() {}
        public android.view.SurfaceControl build() { return null; }
        public android.view.SurfaceControl.Builder setName(java.lang.String p0) { return null; }
        public android.view.SurfaceControl.Builder setLocalOwnerView(android.view.View p0) { return null; }
        public android.view.SurfaceControl.Builder setBufferSize(int p0, int p1) { return null; }
        public android.view.SurfaceControl.Builder setFormat(int p0) { return null; }
        public android.view.SurfaceControl.Builder setProtected(boolean p0) { return null; }
        public android.view.SurfaceControl.Builder setSecure(boolean p0) { return null; }
        public android.view.SurfaceControl.Builder setOpaque(boolean p0) { return null; }
        public android.view.SurfaceControl.Builder setHidden(boolean p0) { return null; }
        public android.view.SurfaceControl.Builder setParent(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Builder setMetadata(int p0, int p1) { return null; }
        public android.view.SurfaceControl.Builder setEffectLayer() { return null; }
        public android.view.SurfaceControl.Builder setColorLayer() { return null; }
        public android.view.SurfaceControl.Builder setBLASTLayer() { return null; }
        public android.view.SurfaceControl.Builder setContainerLayer() { return null; }
        public android.view.SurfaceControl.Builder setFlags(int p0) { return null; }
        public android.view.SurfaceControl.Builder setCallsite(java.lang.String p0) { return null; }
    }

    private static abstract class CaptureArgs {

        static abstract class Builder<T extends android.view.SurfaceControl.CaptureArgs.Builder<T>> {
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

        public static class Builder extends android.view.SurfaceControl.CaptureArgs.Builder<android.view.SurfaceControl.DisplayCaptureArgs.Builder> {
            public android.view.SurfaceControl.DisplayCaptureArgs build() { return null; }
            public Builder(android.os.IBinder p0) { super(); }
            public android.view.SurfaceControl.DisplayCaptureArgs.Builder setDisplayToken(android.os.IBinder p0) { return null; }
            public android.view.SurfaceControl.DisplayCaptureArgs.Builder setSize(int p0, int p1) { return null; }
            public android.view.SurfaceControl.DisplayCaptureArgs.Builder setUseIdentityTransform(boolean p0) { return null; }
            android.view.SurfaceControl.DisplayCaptureArgs.Builder getThis() { return null; }
        }
    }

    public static final class DisplayMode {
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
        public int preferredBootDisplayMode;
        public DynamicDisplayInfo() {}
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private static class GlobalTransactionWrapper extends android.view.SurfaceControl.Transaction {
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

        public static class Builder extends android.view.SurfaceControl.CaptureArgs.Builder<android.view.SurfaceControl.LayerCaptureArgs.Builder> {
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
        public ScreenshotHardwareBuffer(android.hardware.HardwareBuffer p0, android.graphics.ColorSpace p1, boolean p2, boolean p3) {}
        public android.graphics.ColorSpace getColorSpace() { return null; }
        public android.hardware.HardwareBuffer getHardwareBuffer() { return null; }
        public boolean containsSecureLayers() { return false; }
        public boolean containsHdrLayers() { return false; }
        public android.graphics.Bitmap asBitmap() { return null; }
    }

    public static final class StaticDisplayInfo {
        public boolean isInternal;
        public float density;
        public boolean secure;
        public android.hardware.display.DeviceProductInfo deviceProductInfo;
        public int installOrientation;
        public StaticDisplayInfo() {}
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    private static class SyncScreenCaptureListener implements android.view.SurfaceControl.ScreenCaptureListener {
        public void onScreenCaptureComplete(android.view.SurfaceControl.ScreenshotHardwareBuffer p0) {}
    }

    public static class Transaction implements java.io.Closeable, android.os.Parcelable {
        public long mNativeObject;
        java.lang.Runnable mFreeNativeResources;
        public static final android.os.Parcelable.Creator<android.view.SurfaceControl.Transaction> CREATOR = null;
        protected void checkPreconditions(android.view.SurfaceControl p0) {}
        public Transaction() {}
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
        public android.view.SurfaceControl.Transaction setScale(android.view.SurfaceControl p0, float p1, float p2) { return null; }
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
        @java.lang.Deprecated
        public android.view.SurfaceControl.Transaction setWindowCrop(android.view.SurfaceControl p0, android.graphics.Rect p1) { return null; }
        public android.view.SurfaceControl.Transaction setCrop(android.view.SurfaceControl p0, android.graphics.Rect p1) { return null; }
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
        public android.view.SurfaceControl.Transaction setDisplayDecoration(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setOpaque(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplaySurface(android.os.IBinder p0, android.view.Surface p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplayLayerStack(android.os.IBinder p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplayFlags(android.os.IBinder p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplayProjection(android.os.IBinder p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3) { return null; }
        public android.view.SurfaceControl.Transaction setDisplaySize(android.os.IBinder p0, int p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setAnimationTransaction() { return null; }
        public android.view.SurfaceControl.Transaction setEarlyWakeupStart() { return null; }
        public android.view.SurfaceControl.Transaction setEarlyWakeupEnd() { return null; }
        public long getId() { return 0L; }
        public android.view.SurfaceControl.Transaction setMetadata(android.view.SurfaceControl p0, int p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setMetadata(android.view.SurfaceControl p0, int p1, android.os.Parcel p2) { return null; }
        public android.view.SurfaceControl.Transaction setShadowRadius(android.view.SurfaceControl p0, float p1) { return null; }
        public android.view.SurfaceControl.Transaction setFrameRate(android.view.SurfaceControl p0, float p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setFrameRate(android.view.SurfaceControl p0, float p1, int p2, int p3) { return null; }
        public android.view.SurfaceControl.Transaction setFocusedWindow(android.os.IBinder p0, java.lang.String p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction requestFocusTransfer(android.os.IBinder p0, java.lang.String p1, android.os.IBinder p2, java.lang.String p3, int p4) { return null; }
        public android.view.SurfaceControl.Transaction removeCurrentInputFocus(int p0) { return null; }
        public android.view.SurfaceControl.Transaction setSkipScreenshot(android.view.SurfaceControl p0, boolean p1) { return null; }
        @java.lang.Deprecated
        public android.view.SurfaceControl.Transaction setBuffer(android.view.SurfaceControl p0, android.graphics.GraphicBuffer p1) { return null; }
        public android.view.SurfaceControl.Transaction setBuffer(android.view.SurfaceControl p0, android.hardware.HardwareBuffer p1) { return null; }
        public android.view.SurfaceControl.Transaction setBuffer(android.view.SurfaceControl p0, android.hardware.HardwareBuffer p1, android.hardware.SyncFence p2) { return null; }
        public android.view.SurfaceControl.Transaction setBuffer(android.view.SurfaceControl p0, android.hardware.HardwareBuffer p1, android.hardware.SyncFence p2, java.util.function.Consumer<android.hardware.SyncFence> p3) { return null; }
        public android.view.SurfaceControl.Transaction setBufferTransform(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setDamageRegion(android.view.SurfaceControl p0, android.graphics.Region p1) { return null; }
        public android.view.SurfaceControl.Transaction setDimmingEnabled(android.view.SurfaceControl p0, boolean p1) { return null; }
        @java.lang.Deprecated
        public android.view.SurfaceControl.Transaction setColorSpace(android.view.SurfaceControl p0, android.graphics.ColorSpace p1) { return null; }
        public android.view.SurfaceControl.Transaction setDataSpace(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setTrustedOverlay(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setDropInputMode(android.view.SurfaceControl p0, int p1) { return null; }
        public void sanitize() {}
        public android.view.SurfaceControl.Transaction setDesintationFrame(android.view.SurfaceControl p0, android.graphics.Rect p1) { return null; }
        public android.view.SurfaceControl.Transaction setDesintationFrame(android.view.SurfaceControl p0, int p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction merge(android.view.SurfaceControl.Transaction p0) { return null; }
        public android.view.SurfaceControl.Transaction remove(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Transaction setFrameTimelineVsync(long p0) { return null; }
        public android.view.SurfaceControl.Transaction addTransactionCommittedListener(java.util.concurrent.Executor p0, android.view.SurfaceControl.TransactionCommittedListener p1) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
    }

    public static interface TransactionCommittedListener {
        public void onTransactionCommitted();
    }
}
