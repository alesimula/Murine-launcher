package android.view;

public final class SurfaceControl implements android.os.Parcelable {
    public static final int BUFFER_TRANSFORM_IDENTITY = 0;
    public static final int BUFFER_TRANSFORM_MIRROR_HORIZONTAL = 1;
    public static final int BUFFER_TRANSFORM_MIRROR_VERTICAL = 2;
    public static final int BUFFER_TRANSFORM_ROTATE_90 = 4;
    public static final int BUFFER_TRANSFORM_ROTATE_180 = 3;
    public static final int BUFFER_TRANSFORM_ROTATE_270 = 7;
    @android.annotation.FlaggedApi("com.android.graphics.hwui.flags.add_surfacecontrol_constants")
    public static final int BUFFER_TRANSFORM_MIRROR_HORIZONTAL_ROTATE_90 = 5;
    @android.annotation.FlaggedApi("com.android.graphics.hwui.flags.add_surfacecontrol_constants")
    public static final int BUFFER_TRANSFORM_MIRROR_VERTICAL_ROTATE_90 = 6;
    public long mNativeObject;
    public static final int HIDDEN = 4;
    public static final int SKIP_SCREENSHOT = 64;
    public static final int SECURE = 128;
    public static final int ENABLE_BACKPRESSURE = 256;
    public static final int DISPLAY_DECORATION = 512;
    public static final int IGNORE_DESTINATION_FRAME = 1024;
    public static final int LAYER_IS_REFRESH_RATE_INDICATOR = 2048;
    public static final int CAN_OCCLUDE_PRESENTATION = 4096;
    public static final int RECOVERABLE_FROM_BUFFER_STUFFING = 8192;
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
    public static final int CACHING_DISABLED = 0;
    public static final int CACHING_ENABLED = 1;
    public static final int METADATA_OWNER_UID = 1;
    public static final int METADATA_WINDOW_TYPE = 2;
    public static final int METADATA_TASK_ID = 3;
    public static final int METADATA_MOUSE_CURSOR = 4;
    public static final int METADATA_ACCESSIBILITY_ID = 5;
    public static final int METADATA_OWNER_PID = 6;
    public static final int METADATA_GAME_MODE = 8;
    public static final int FRAME_RATE_SELECTION_STRATEGY_PROPAGATE = 0;
    public static final int FRAME_RATE_SELECTION_STRATEGY_OVERRIDE_CHILDREN = 1;
    public static final int FRAME_RATE_SELECTION_STRATEGY_SELF = 2;
    @android.annotation.NonNull
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
    public static void setDebugUsageAfterRelease(boolean p0) {}
    public void setUnreleasedWarningCallSite(java.lang.String p0) {}
    @android.annotation.Nullable
    java.lang.String getCallsite() { return null; }
    @android.annotation.NonNull
    java.lang.String getName() { return null; }
    public boolean isSameSurface(android.view.SurfaceControl p0) { return false; }
    @android.annotation.NonNull
    public android.view.Choreographer getChoreographer() { return null; }
    @android.annotation.NonNull
    public android.view.Choreographer getChoreographer(android.os.Looper p0) { return null; }
    public boolean hasChoreographer() { return false; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    protected void finalize() throws java.lang.Throwable {}
    public void release() {}
    public void disconnect() {}
    public boolean isValid() { return false; }
    @java.lang.Deprecated
    public static void openTransaction() {}
    @java.lang.Deprecated
    public static void closeTransaction() {}
    public boolean clearContentFrameStats() { return false; }
    public boolean getContentFrameStats(android.view.WindowContentFrameStats p0) { return false; }
    public static boolean clearAnimationFrameStats() { return false; }
    public static boolean getAnimationFrameStats(android.view.WindowAnimationFrameStats p0) { return false; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    @android.annotation.Nullable
    public android.view.View getLocalOwnerView() { return null; }
    public java.lang.String toString() { return null; }
    public static void setDisplayPowerMode(android.os.IBinder p0, int p1) {}
    public static android.view.SurfaceControl.StaticDisplayInfo getStaticDisplayInfo(long p0) { return null; }
    public static android.view.SurfaceControl.DynamicDisplayInfo getDynamicDisplayInfo(long p0) { return null; }
    public static android.hardware.display.DisplayedContentSamplingAttributes getDisplayedContentSamplingAttributes(android.os.IBinder p0) { return null; }
    public static boolean setDisplayedContentSamplingEnabled(android.os.IBinder p0, boolean p1, int p2, int p3) { return false; }
    public static android.hardware.display.DisplayedContentSample getDisplayedContentSample(android.os.IBinder p0, long p1, long p2) { return null; }
    public static boolean setDesiredDisplayModeSpecs(android.os.IBinder p0, android.view.SurfaceControl.DesiredDisplayModeSpecs p1) { return false; }
    public static android.view.SurfaceControl.DesiredDisplayModeSpecs getDesiredDisplayModeSpecs(android.os.IBinder p0) { return null; }
    public static android.view.SurfaceControl.DisplayPrimaries getDisplayNativePrimaries(android.os.IBinder p0) { return null; }
    public static boolean setActiveColorMode(android.os.IBinder p0, int p1) { return false; }
    public static android.graphics.ColorSpace[] getCompositionColorSpaces() { return null; }
    public static android.hardware.OverlayProperties getOverlaySupport() { return null; }
    public static boolean getBootDisplayModeSupport() { return false; }
    public static void setBootDisplayMode(android.os.IBinder p0, int p1) {}
    public static void clearBootDisplayMode(android.os.IBinder p0) {}
    public static void setAutoLowLatencyMode(android.os.IBinder p0, boolean p1) {}
    public static void setGameContentType(android.os.IBinder p0, boolean p1) {}
    public static boolean getProtectedContentSupport() { return false; }
    public static boolean getDisplayBrightnessSupport(android.os.IBinder p0) { return false; }
    public static boolean setDisplayBrightness(android.os.IBinder p0, float p1) { return false; }
    public static boolean setDisplayBrightness(android.os.IBinder p0, float p1, float p2, float p3, float p4) { return false; }
    public static android.view.SurfaceControl mirrorSurface(android.view.SurfaceControl p0) { return null; }
    public static android.view.SurfaceControl mirrorSurface(android.view.SurfaceControl p0, android.view.SurfaceControl p1) { return null; }
    public static void setGlobalShadowSettings(float[] p0, float[] p1, float p2, float p3, float p4) {}
    public static android.hardware.graphics.common.DisplayDecorationSupport getDisplayDecorationSupport(android.os.IBinder p0) { return null; }
    @android.annotation.NonNull
    public android.view.SurfaceControl.OnJankDataListenerRegistration addOnJankDataListener(android.view.SurfaceControl.OnJankDataListener p0) { return null; }
    public static int getGPUContextPriority() { return 0; }
    public static boolean bootFinished() { return false; }
    public static int getMaxPictureProfiles() { return 0; }
    public void resize(int p0, int p1) {}
    public int getTransformHint() { return 0; }
    public void setTransformHint(int p0) {}
    public int getLayerId() { return 0; }
    public static android.gui.StalledTransactionInfo getStalledTransactionInfo(int p0) { return null; }
    public static void notifyShutdown() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BufferTransform {
    }

    public static class Builder {
        public Builder(android.view.SurfaceSession p0) {}
        public Builder() {}
        @android.annotation.NonNull
        public android.view.SurfaceControl build() { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Builder setName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Builder setLocalOwnerView(android.view.View p0) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Builder setBufferSize(int p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Builder setFormat(int p0) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Builder setProtected(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Builder setSecure(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Builder setOpaque(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Builder setHidden(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Builder setParent(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Builder setMetadata(int p0, int p1) { return null; }
        public android.view.SurfaceControl.Builder setEffectLayer() { return null; }
        public android.view.SurfaceControl.Builder setColorLayer() { return null; }
        public android.view.SurfaceControl.Builder setBLASTLayer() { return null; }
        public android.view.SurfaceControl.Builder setContainerLayer() { return null; }
        public android.view.SurfaceControl.Builder setFlags(int p0) { return null; }
        public android.view.SurfaceControl.Builder setCallsite(java.lang.String p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CachingHint {
    }

    public static final class CieXyz {
        public float X;
        public float Y;
        public float Z;
        public CieXyz() {}
    }

    public static final class DesiredDisplayModeSpecs {
        public int defaultMode;
        public boolean allowGroupSwitching;
        public final android.view.SurfaceControl.RefreshRateRanges primaryRanges = null;
        public final android.view.SurfaceControl.RefreshRateRanges appRequestRanges = null;
        @android.annotation.Nullable
        public android.view.SurfaceControl.IdleScreenRefreshRateConfig idleScreenRefreshRateConfig;
        public DesiredDisplayModeSpecs() {}
        public DesiredDisplayModeSpecs(android.view.SurfaceControl.DesiredDisplayModeSpecs p0) {}
        public DesiredDisplayModeSpecs(int p0, boolean p1, android.view.SurfaceControl.RefreshRateRanges p2, android.view.SurfaceControl.RefreshRateRanges p3, android.view.SurfaceControl.IdleScreenRefreshRateConfig p4) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public boolean equals(android.view.SurfaceControl.DesiredDisplayModeSpecs p0) { return false; }
        public int hashCode() { return 0; }
        public void copyFrom(android.view.SurfaceControl.DesiredDisplayModeSpecs p0) {}
        public java.lang.String toString() { return null; }
    }

    public static final class DisplayMode {
        public int id;
        public int width;
        public int height;
        public float xDpi;
        public float yDpi;
        public float peakRefreshRate;
        public float vsyncRate;
        public long appVsyncOffsetNanos;
        public long presentationDeadlineNanos;
        public int[] supportedHdrTypes;
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
        public float renderFrameRate;
        public boolean hasArrSupport;
        public android.view.FrameRateCategoryRate frameRateCategoryRate;
        public float[] supportedRefreshRates;
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

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FrameRateSelectionStrategy {
    }

    public static final class IdleScreenRefreshRateConfig {
        public int timeoutMillis;
        public IdleScreenRefreshRateConfig() {}
        public IdleScreenRefreshRateConfig(int p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void copyFrom(android.view.SurfaceControl.IdleScreenRefreshRateConfig p0) {}
    }

    @android.annotation.FlaggedApi("com.android.window.flags.jank_api")
    public static class JankData {
        public static final int JANK_NONE = 0;
        public static final int JANK_COMPOSER = 1;
        public static final int JANK_APPLICATION = 2;
        public static final int JANK_OTHER = 4;
        public JankData(long p0, int p1, long p2, long p3, long p4) {}
        public long getVsyncId() { return 0L; }
        public int getJankType() { return 0; }
        public long getFrameIntervalNanos() { return 0L; }
        public long getScheduledAppFrameTimeNanos() { return 0L; }
        public long getActualAppFrameTimeNanos() { return 0L; }
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface JankType {
        }
    }

    public static class LockDebuggingTransaction extends android.view.SurfaceControl.Transaction {
        java.lang.Object mMonitor;
        public LockDebuggingTransaction(java.lang.Object p0) { super(); }
        protected void checkPreconditions(android.view.SurfaceControl p0) {}
    }

    @android.annotation.FlaggedApi("com.android.window.flags.jank_api")
    public static interface OnJankDataListener {
        public void onJankDataAvailable(java.util.List<android.view.SurfaceControl.JankData> p0);
    }

    @android.annotation.FlaggedApi("com.android.window.flags.jank_api")
    public static class OnJankDataListenerRegistration {
        public static final android.view.SurfaceControl.OnJankDataListenerRegistration NONE = null;
        OnJankDataListenerRegistration(android.view.SurfaceControl p0, android.view.SurfaceControl.OnJankDataListener p1) {}
        public void flush() {}
        public void removeAfter(long p0) {}
        public void release() {}
    }

    public static interface OnReparentListener {
        public void onReparent(android.view.SurfaceControl.Transaction p0, android.view.SurfaceControl p1);
    }

    public static final class RefreshRateRange implements android.os.Parcelable {
        public static final java.lang.String TAG = "RefreshRateRange";
        public static final float FLOAT_TOLERANCE = 0.009999999776482582f;
        public float min;
        public float max;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.view.SurfaceControl.RefreshRateRange> CREATOR = null;
        public RefreshRateRange() {}
        public RefreshRateRange(float p0, float p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void copyFrom(android.view.SurfaceControl.RefreshRateRange p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
    }

    public static final class RefreshRateRanges {
        public static final java.lang.String TAG = "RefreshRateRanges";
        public final android.view.SurfaceControl.RefreshRateRange physical = null;
        public final android.view.SurfaceControl.RefreshRateRange render = null;
        public RefreshRateRanges() {}
        public RefreshRateRanges(android.view.SurfaceControl.RefreshRateRange p0, android.view.SurfaceControl.RefreshRateRange p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public void copyFrom(android.view.SurfaceControl.RefreshRateRanges p0) {}
    }

    public static final class StaticDisplayInfo {
        public boolean isInternal;
        public float density;
        public boolean secure;
        public android.hardware.display.DeviceProductInfo deviceProductInfo;
        public int installOrientation;
        public int screenPartStatus;
        public StaticDisplayInfo() {}
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static class Transaction implements java.io.Closeable, android.os.Parcelable {
        public long mNativeObject;
        @android.annotation.Nullable
        java.util.ArrayList<java.lang.String> mCalls;
        java.lang.Runnable mFreeNativeResources;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.view.SurfaceControl.Transaction> CREATOR = null;
        protected void checkPreconditions(android.view.SurfaceControl p0) {}
        public Transaction() {}
        public static void setDefaultApplyToken(android.os.IBinder p0) {}
        public static android.os.IBinder getDefaultApplyToken() { return null; }
        public void apply() {}
        public void applyAsyncUnsafe() {}
        public void clear() {}
        public void close() {}
        public void apply(boolean p0) {}
        protected void applyResizedSurfaces() {}
        protected void notifyReparentedSurfaces() {}
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setVisibility(android.view.SurfaceControl p0, boolean p1) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setFrameRateSelectionPriority(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction show(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Transaction hide(android.view.SurfaceControl p0) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setPosition(android.view.SurfaceControl p0, float p1, float p2) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setScale(android.view.SurfaceControl p0, float p1, float p2) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setBufferSize(android.view.SurfaceControl p0, int p1, int p2) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setFixedTransformHint(android.view.SurfaceControl p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction unsetFixedTransformHint(android.view.SurfaceControl p0) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setLayer(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setRelativeLayer(android.view.SurfaceControl p0, android.view.SurfaceControl p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setTransparentRegionHint(android.view.SurfaceControl p0, android.graphics.Region p1) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setAlpha(android.view.SurfaceControl p0, float p1) { return null; }
        public android.view.SurfaceControl.Transaction setInputWindowInfo(android.view.SurfaceControl p0, android.view.InputWindowHandle p1) { return null; }
        public android.view.SurfaceControl.Transaction addWindowInfosReportedListener(java.lang.Runnable p0) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setGeometry(android.view.SurfaceControl p0, android.graphics.Rect p1, android.graphics.Rect p2, int p3) { return null; }
        public android.view.SurfaceControl.Transaction setMatrix(android.view.SurfaceControl p0, float p1, float p2, float p3, float p4) { return null; }
        public android.view.SurfaceControl.Transaction setMatrix(android.view.SurfaceControl p0, android.graphics.Matrix p1, float[] p2) { return null; }
        public android.view.SurfaceControl.Transaction setColorTransform(android.view.SurfaceControl p0, float[] p1, float[] p2) { return null; }
        public android.view.SurfaceControl.Transaction setColorSpaceAgnostic(android.view.SurfaceControl p0, boolean p1) { return null; }
        @java.lang.Deprecated
        public android.view.SurfaceControl.Transaction setWindowCrop(android.view.SurfaceControl p0, android.graphics.Rect p1) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setCrop(android.view.SurfaceControl p0, android.graphics.Rect p1) { return null; }
        public android.view.SurfaceControl.Transaction setWindowCrop(android.view.SurfaceControl p0, int p1, int p2) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setCrop(android.view.SurfaceControl p0, float p1, float p2, float p3, float p4) { return null; }
        public android.view.SurfaceControl.Transaction setCornerRadius(android.view.SurfaceControl p0, float p1) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setClientDrawnCornerRadius(android.view.SurfaceControl p0, float p1) { return null; }
        public android.view.SurfaceControl.Transaction setBackgroundBlurRadius(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setBackgroundBlurScale(android.view.SurfaceControl p0, float p1) { return null; }
        public android.view.SurfaceControl.Transaction setBlurRegions(android.view.SurfaceControl p0, float[][] p1) { return null; }
        public android.view.SurfaceControl.Transaction setStretchEffect(android.view.SurfaceControl p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10) { return null; }
        public android.view.SurfaceControl.Transaction setEdgeExtensionEffect(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setLayerStack(android.view.SurfaceControl p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction reparent(android.view.SurfaceControl p0, android.view.SurfaceControl p1) { return null; }
        public android.view.SurfaceControl.Transaction setColor(android.view.SurfaceControl p0, float[] p1) { return null; }
        public android.view.SurfaceControl.Transaction unsetColor(android.view.SurfaceControl p0) { return null; }
        public android.view.SurfaceControl.Transaction setSecure(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplayDecoration(android.view.SurfaceControl p0, boolean p1) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setOpaque(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplaySurface(android.os.IBinder p0, android.view.Surface p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplayLayerStack(android.os.IBinder p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplayFlags(android.os.IBinder p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setDisplayProjection(android.os.IBinder p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3) { return null; }
        public android.view.SurfaceControl.Transaction setDisplaySize(android.os.IBinder p0, int p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setAnimationTransaction() { return null; }
        @android.annotation.RequiresPermission("android.permission.WAKEUP_SURFACE_FLINGER")
        public android.view.SurfaceControl.Transaction setEarlyWakeupStart(android.gui.EarlyWakeupInfo p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.WAKEUP_SURFACE_FLINGER")
        public android.view.SurfaceControl.Transaction setEarlyWakeupEnd(android.gui.EarlyWakeupInfo p0) { return null; }
        public long getId() { return 0L; }
        public android.view.SurfaceControl.Transaction setMetadata(android.view.SurfaceControl p0, int p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction setMetadata(android.view.SurfaceControl p0, int p1, android.os.Parcel p2) { return null; }
        public android.view.SurfaceControl.Transaction setShadowRadius(android.view.SurfaceControl p0, float p1) { return null; }
        public android.view.SurfaceControl.Transaction setBoxShadowSettings(android.view.SurfaceControl p0, android.gui.BoxShadowSettings p1) { return null; }
        public android.view.SurfaceControl.Transaction setBorderSettings(android.view.SurfaceControl p0, android.gui.BorderSettings p1) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setFrameRate(android.view.SurfaceControl p0, float p1, int p2) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setFrameRate(android.view.SurfaceControl p0, float p1, int p2, int p3) { return null; }
        @android.annotation.NonNull
        @android.annotation.FlaggedApi("com.android.graphics.surfaceflinger.flags.arr_surfacecontrol_setframerate_api")
        public android.view.SurfaceControl.Transaction setFrameRate(android.view.SurfaceControl p0, android.view.Surface.FrameRateParams p1) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction clearFrameRate(android.view.SurfaceControl p0) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setDefaultFrameRateCompatibility(android.view.SurfaceControl p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setFrameRateCategory(android.view.SurfaceControl p0, int p1, boolean p2) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setFrameRateSelectionStrategy(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setFocusedWindow(android.os.IBinder p0, java.lang.String p1, int p2) { return null; }
        public android.view.SurfaceControl.Transaction removeCurrentInputFocus(int p0) { return null; }
        public android.view.SurfaceControl.Transaction setSkipScreenshot(android.view.SurfaceControl p0, boolean p1) { return null; }
        @java.lang.Deprecated
        public android.view.SurfaceControl.Transaction setBuffer(android.view.SurfaceControl p0, android.graphics.GraphicBuffer p1) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setBuffer(android.view.SurfaceControl p0, android.hardware.HardwareBuffer p1) { return null; }
        public android.view.SurfaceControl.Transaction unsetBuffer(android.view.SurfaceControl p0) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setBuffer(android.view.SurfaceControl p0, android.hardware.HardwareBuffer p1, android.hardware.SyncFence p2) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setBuffer(android.view.SurfaceControl p0, android.hardware.HardwareBuffer p1, android.hardware.SyncFence p2, java.util.function.Consumer<android.hardware.SyncFence> p3) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setBufferTransform(android.view.SurfaceControl p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setDamageRegion(android.view.SurfaceControl p0, android.graphics.Region p1) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setDimmingEnabled(android.view.SurfaceControl p0, boolean p1) { return null; }
        @java.lang.Deprecated
        public android.view.SurfaceControl.Transaction setColorSpace(android.view.SurfaceControl p0, android.graphics.ColorSpace p1) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setDataSpace(android.view.SurfaceControl p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setExtendedRangeBrightness(android.view.SurfaceControl p0, float p1, float p2) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setDesiredHdrHeadroom(android.view.SurfaceControl p0, float p1) { return null; }
        @android.annotation.FlaggedApi("android.hardware.flags.luts_api")
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setLuts(android.view.SurfaceControl p0, android.hardware.DisplayLuts p1) { return null; }
        @android.annotation.SystemApi
        @android.annotation.FlaggedApi("android.media.tv.flags.apply_picture_profiles")
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setPictureProfileHandle(android.view.SurfaceControl p0, android.media.quality.PictureProfileHandle p1) { return null; }
        @android.annotation.FlaggedApi("android.media.tv.flags.apply_picture_profiles")
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setContentPriority(android.view.SurfaceControl p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setCachingHint(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setTrustedOverlay(android.view.SurfaceControl p0, boolean p1) { return null; }
        public android.view.SurfaceControl.Transaction setTrustedOverlay(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setDropInputMode(android.view.SurfaceControl p0, int p1) { return null; }
        public android.view.SurfaceControl.Transaction setCanOccludePresentation(android.view.SurfaceControl p0, boolean p1) { return null; }
        public static void sendSurfaceFlushJankData(android.view.SurfaceControl p0) {}
        public void sanitize(int p0, int p1) {}
        public android.view.SurfaceControl.Transaction setDestinationFrame(android.view.SurfaceControl p0, android.graphics.Rect p1) { return null; }
        public android.view.SurfaceControl.Transaction setDestinationFrame(android.view.SurfaceControl p0, int p1, int p2) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction merge(android.view.SurfaceControl.Transaction p0) { return null; }
        void onMergeWithNextTransaction(java.lang.CharSequence p0) {}
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction remove(android.view.SurfaceControl p0) { return null; }
        @android.annotation.FlaggedApi("com.android.window.flags.sdk_desired_present_time")
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setFrameTimeline(long p0) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setFrameTimelineVsync(long p0) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction addTransactionCommittedListener(java.util.concurrent.Executor p0, android.view.SurfaceControl.TransactionCommittedListener p1) { return null; }
        @android.annotation.FlaggedApi("com.android.window.flags.sdk_desired_present_time")
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction addTransactionCompletedListener(java.util.concurrent.Executor p0, java.util.function.Consumer<android.view.SurfaceControl.TransactionStats> p1) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setTrustedPresentationCallback(android.view.SurfaceControl p0, android.view.SurfaceControl.TrustedPresentationThresholds p1, java.util.concurrent.Executor p2, java.util.function.Consumer<java.lang.Boolean> p3) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction clearTrustedPresentationCallback(android.view.SurfaceControl p0) { return null; }
        @android.annotation.FlaggedApi("com.android.window.flags.sdk_desired_present_time")
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setDesiredPresentTimeNanos(long p0) { return null; }
        @android.annotation.NonNull
        public android.view.SurfaceControl.Transaction setRecoverableFromBufferStuffing(android.view.SurfaceControl p0) { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
    }

    public static interface TransactionCommittedListener {
        public void onTransactionCommitted();
    }

    @android.annotation.FlaggedApi("com.android.window.flags.sdk_desired_present_time")
    public static final class TransactionStats {
        public void close() {}
        @android.annotation.FlaggedApi("com.android.window.flags.sdk_desired_present_time")
        public long getLatchTimeNanos() { return 0L; }
        @android.annotation.FlaggedApi("com.android.window.flags.sdk_desired_present_time")
        @android.annotation.NonNull
        public android.hardware.SyncFence getPresentFence() { return null; }
    }

    public static abstract class TrustedPresentationCallback {
        public abstract void onTrustedPresentationChanged(boolean p0);
    }

    @java.lang.Deprecated
    public static final class TrustedPresentationThresholds {
        public TrustedPresentationThresholds(float p0, float p1, int p2) {}
    }
}
