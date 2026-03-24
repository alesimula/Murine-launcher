package android.graphics;

public class HardwareRenderer {
    private static final java.lang.String LOG_TAG = "HardwareRenderer";
    public static final int SYNC_OK = 0;
    public static final int SYNC_REDRAW_REQUESTED = 1;
    public static final int SYNC_LOST_SURFACE_REWARD_IF_FOUND = 2;
    public static final int SYNC_CONTEXT_IS_STOPPED = 4;
    public static final int SYNC_FRAME_DROPPED = 8;
    public static final int FLAG_DUMP_FRAMESTATS = 1;
    public static final int FLAG_DUMP_RESET = 2;
    public static final int FLAG_DUMP_ALL = 1;
    private static final java.lang.String CACHE_PATH_SHADERS = "com.android.opengl.shaders_cache";
    private static final java.lang.String CACHE_PATH_SKIASHADERS = "com.android.skia.shaders_cache";
    private static int sDensityDpi;
    private final long mNativeProxy = 0L;
    protected android.graphics.RenderNode mRootNode;
    private boolean mOpaque;
    private boolean mForceDark;
    private int mColorMode;
    private android.graphics.HardwareRenderer.FrameRenderRequest mRenderRequest;
    private android.graphics.HardwareRenderer.ASurfaceTransactionCallback mASurfaceTransactionCallback;
    private android.graphics.HardwareRenderer.PrepareSurfaceControlForWebviewCallback mAPrepareSurfaceControlForWebviewCallback;
    public HardwareRenderer() {}
    public void destroy() {}
    public void setName(java.lang.String p0) {}
    public void setLightSourceGeometry(float p0, float p1, float p2, float p3) {}
    public void setLightSourceAlpha(float p0, float p1) {}
    public void setContentRoot(android.graphics.RenderNode p0) {}
    public void setSurface(android.view.Surface p0) {}
    public void setSurface(android.view.Surface p0, boolean p1) {}
    public void setSurfaceControl(android.view.SurfaceControl p0) {}
    public android.graphics.HardwareRenderer.FrameRenderRequest createRenderRequest() { return null; }
    public int syncAndDrawFrame(android.graphics.FrameInfo p0) { return 0; }
    public boolean pause() { return false; }
    public void setStopped(boolean p0) {}
    public void stop() {}
    public void start() {}
    public void clearContent() {}
    public boolean setForceDark(boolean p0) { return false; }
    public void allocateBuffers() {}
    public void notifyFramePending() {}
    public void setOpaque(boolean p0) {}
    public boolean isOpaque() { return false; }
    public void setFrameCompleteCallback(android.graphics.HardwareRenderer.FrameCompleteCallback p0) {}
    public void addObserver(android.graphics.HardwareRendererObserver p0) {}
    public void removeObserver(android.graphics.HardwareRendererObserver p0) {}
    public void setColorMode(int p0) {}
    public void setColorMode(int p0, float p1) {}
    public void fence() {}
    public void registerAnimatingRenderNode(android.graphics.RenderNode p0) {}
    public void registerVectorDrawableAnimator(android.view.NativeVectorDrawableAnimator p0) {}
    public void stopDrawing() {}
    public android.graphics.TextureLayer createTextureLayer() { return null; }
    public void detachSurfaceTexture(long p0) {}
    public void buildLayer(android.graphics.RenderNode p0) {}
    public boolean copyLayerInto(android.graphics.TextureLayer p0, android.graphics.Bitmap p1) { return false; }
    public void pushLayerUpdate(android.graphics.TextureLayer p0) {}
    public void onLayerDestroyed(android.graphics.TextureLayer p0) {}
    public void setASurfaceTransactionCallback(android.graphics.HardwareRenderer.ASurfaceTransactionCallback p0) {}
    public void setPrepareSurfaceControlForWebviewCallback(android.graphics.HardwareRenderer.PrepareSurfaceControlForWebviewCallback p0) {}
    public void setFrameCallback(android.graphics.HardwareRenderer.FrameDrawingCallback p0) {}
    public void addRenderNode(android.graphics.RenderNode p0, boolean p1) {}
    public void removeRenderNode(android.graphics.RenderNode p0) {}
    public void drawRenderNode(android.graphics.RenderNode p0) {}
    public boolean loadSystemProperties() { return false; }
    public void dumpProfileInfo(java.io.FileDescriptor p0, int p1) {}
    public void setContentDrawBounds(int p0, int p1, int p2, int p3) {}
    public void setPictureCaptureCallback(android.graphics.HardwareRenderer.PictureCapturedCallback p0) {}
    static void invokePictureCapturedCallback(long p0, android.graphics.HardwareRenderer.PictureCapturedCallback p1) {}
    private static void validateAlpha(float p0, java.lang.String p1) {}
    private static void validatePositive(float p0, java.lang.String p1) {}
    private static void validateFinite(float p0, java.lang.String p1) {}
    public static void setFPSDivisor(int p0) {}
    public static void setContextPriority(int p0) {}
    public static void setHighContrastText(boolean p0) {}
    public static void setIsolatedProcess(boolean p0) {}
    public static void sendDeviceConfigurationForDebugging(android.content.res.Configuration p0) {}
    public static void setDebuggingEnabled(boolean p0) {}
    public static int copySurfaceInto(android.view.Surface p0, android.graphics.Rect p1, android.graphics.Bitmap p2) { return 0; }
    public static android.graphics.Bitmap createHardwareBitmap(android.graphics.RenderNode p0, int p1, int p2) { return null; }
    public static void trimMemory(int p0) {}
    public static void overrideProperty(java.lang.String p0, java.lang.String p1) {}
    public static void setupDiskCache(java.io.File p0) {}
    public static void setPackageName(java.lang.String p0) {}
    public static void setContextForInit(android.content.Context p0) {}
    public static native void disableVsync();
    public static native void preload();
    public static native boolean isWebViewOverlaysEnabled();
    protected static native void setupShadersDiskCache(java.lang.String p0, java.lang.String p1);
    private static native void nRotateProcessStatsBuffer();
    private static native void nSetProcessStatsBuffer(int p0);
    private static native int nGetRenderThreadTid(long p0);
    private static native long nCreateRootRenderNode();
    private static native long nCreateProxy(boolean p0, long p1);
    private static native void nDeleteProxy(long p0);
    private static native boolean nLoadSystemProperties(long p0);
    private static native void nSetName(long p0, java.lang.String p1);
    private static native void nSetSurface(long p0, android.view.Surface p1, boolean p2);
    private static native void nSetSurfaceControl(long p0, long p1);
    private static native boolean nPause(long p0);
    private static native void nSetStopped(long p0, boolean p1);
    private static native void nSetLightGeometry(long p0, float p1, float p2, float p3, float p4);
    private static native void nSetLightAlpha(long p0, float p1, float p2);
    private static native void nSetOpaque(long p0, boolean p1);
    private static native void nSetColorMode(long p0, int p1);
    private static native void nSetSdrWhitePoint(long p0, float p1);
    private static native void nSetIsHighEndGfx(boolean p0);
    private static native int nSyncAndDrawFrame(long p0, long[] p1, int p2);
    private static native void nDestroy(long p0, long p1);
    private static native void nRegisterAnimatingRenderNode(long p0, long p1);
    private static native void nRegisterVectorDrawableAnimator(long p0, long p1);
    private static native long nCreateTextureLayer(long p0);
    private static native void nBuildLayer(long p0, long p1);
    private static native boolean nCopyLayerInto(long p0, long p1, long p2);
    private static native void nPushLayerUpdate(long p0, long p1);
    private static native void nCancelLayerUpdate(long p0, long p1);
    private static native void nDetachSurfaceTexture(long p0, long p1);
    private static native void nDestroyHardwareResources(long p0);
    private static native void nTrimMemory(int p0);
    private static native void nOverrideProperty(java.lang.String p0, java.lang.String p1);
    private static native void nFence(long p0);
    private static native void nStopDrawing(long p0);
    private static native void nNotifyFramePending(long p0);
    private static native void nDumpProfileInfo(long p0, java.io.FileDescriptor p1, int p2);
    private static native void nAddRenderNode(long p0, long p1, boolean p2);
    private static native void nRemoveRenderNode(long p0, long p1);
    private static native void nDrawRenderNode(long p0, long p1);
    private static native void nSetContentDrawBounds(long p0, int p1, int p2, int p3, int p4);
    private static native void nSetPictureCaptureCallback(long p0, android.graphics.HardwareRenderer.PictureCapturedCallback p1);
    private static native void nSetASurfaceTransactionCallback(long p0, android.graphics.HardwareRenderer.ASurfaceTransactionCallback p1);
    private static native void nSetPrepareSurfaceControlForWebviewCallback(long p0, android.graphics.HardwareRenderer.PrepareSurfaceControlForWebviewCallback p1);
    private static native void nSetFrameCallback(long p0, android.graphics.HardwareRenderer.FrameDrawingCallback p1);
    private static native void nSetFrameCompleteCallback(long p0, android.graphics.HardwareRenderer.FrameCompleteCallback p1);
    private static native void nAddObserver(long p0, long p1);
    private static native void nRemoveObserver(long p0, long p1);
    private static native int nCopySurfaceInto(android.view.Surface p0, int p1, int p2, int p3, int p4, long p5);
    private static native android.graphics.Bitmap nCreateHardwareBitmap(long p0, int p1, int p2);
    private static native void nSetHighContrastText(boolean p0);
    private static native void nHackySetRTAnimationsEnabled(boolean p0);
    private static native void nSetDebuggingEnabled(boolean p0);
    private static native void nSetIsolatedProcess(boolean p0);
    private static native void nSetContextPriority(int p0);
    private static native void nAllocateBuffers(long p0);
    private static native void nSetForceDark(long p0, boolean p1);
    private static native void nSetDisplayDensityDpi(int p0);
    private static native void nInitDisplayInfo(int p0, int p1, float p2, int p3, long p4, long p5);

    public static interface ASurfaceTransactionCallback {
        public boolean onMergeTransaction(long p0, long p1, long p2);
    }

    private static final class DestroyContextRunnable implements java.lang.Runnable {
        private final long mNativeInstance = 0L;
        DestroyContextRunnable(long p0) {}
        public void run() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DumpFlags {
    }

    public static interface FrameCompleteCallback {
        public void onFrameComplete(long p0);
    }

    public static interface FrameDrawingCallback {
        public void onFrameDraw(long p0);
    }

    public final class FrameRenderRequest {
        private android.graphics.FrameInfo mFrameInfo;
        private boolean mWaitForPresent;
        private FrameRenderRequest(android.graphics.HardwareRenderer p0) {}
        private void reset() {}
        public void setFrameInfo(android.graphics.FrameInfo p0) {}
        public android.graphics.HardwareRenderer.FrameRenderRequest setVsyncTime(long p0) { return null; }
        public android.graphics.HardwareRenderer.FrameRenderRequest setFrameCommitCallback(java.util.concurrent.Executor p0, java.lang.Runnable p1) { return null; }
        public android.graphics.HardwareRenderer.FrameRenderRequest setWaitForPresent(boolean p0) { return null; }
        public int syncAndDraw() { return 0; }
    }

    public static interface PictureCapturedCallback {
        public void onPictureCaptured(android.graphics.Picture p0);
    }

    public static interface PrepareSurfaceControlForWebviewCallback {
        public void prepare();
    }

    private static class ProcessInitializer {
        static android.graphics.HardwareRenderer.ProcessInitializer sInstance;
        private static final int INTERNAL_DATASPACE_SRGB = 142671872;
        private static final int INTERNAL_DATASPACE_DISPLAY_P3 = 143261696;
        private static final int INTERNAL_DATASPACE_SCRGB = 411107328;
        private boolean mInitialized;
        private boolean mDisplayInitialized;
        private boolean mIsolated;
        private android.content.Context mContext;
        private java.lang.String mPackageName;
        private android.view.IGraphicsStats mGraphicsStatsService;
        private android.view.IGraphicsStatsCallback mGraphicsStatsCallback;
        private ProcessInitializer() {}
        synchronized void setPackageName(java.lang.String p0) {}
        synchronized void setIsolated(boolean p0) {}
        synchronized void setContext(android.content.Context p0) {}
        synchronized void init(long p0) {}
        private void initSched(long p0) {}
        private void initGraphicsStats() {}
        synchronized void initUsingContext() {}
        private void initDisplayInfo() {}
        private void rotateBuffer() {}
        private void requestBuffer() {}

        private static enum Dataspace {
            DISPLAY_P3,
            SCRGB,
            SRGB;
            private final android.graphics.ColorSpace.Named mColorSpace = null;
            private final int mNativeDataspace = 0;
            private Dataspace() {}
            static java.util.Optional<android.graphics.HardwareRenderer.ProcessInitializer.Dataspace> find(android.graphics.ColorSpace p0) { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SyncAndDrawResult {
    }
}
