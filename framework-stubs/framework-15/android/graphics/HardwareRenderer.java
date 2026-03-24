package android.graphics;

public class HardwareRenderer {
    public static final int SYNC_OK = 0;
    public static final int SYNC_REDRAW_REQUESTED = 1;
    public static final int SYNC_LOST_SURFACE_REWARD_IF_FOUND = 2;
    public static final int SYNC_CONTEXT_IS_STOPPED = 4;
    public static final int SYNC_FRAME_DROPPED = 8;
    public static final int FLAG_DUMP_FRAMESTATS = 1;
    public static final int FLAG_DUMP_RESET = 2;
    public static final int FLAG_DUMP_ALL = 1;
    public static final int CACHE_TRIM_ALL = 0;
    public static final int CACHE_TRIM_FONT = 1;
    public static final int CACHE_TRIM_RESOURCES = 2;
    protected android.graphics.RenderNode mRootNode;
    public HardwareRenderer() {}
    public void destroy() {}
    public void setName(java.lang.String p0) {}
    public void setLightSourceGeometry(float p0, float p1, float p2, float p3) {}
    public void setLightSourceAlpha(float p0, float p1) {}
    public void setContentRoot(android.graphics.RenderNode p0) {}
    public void setSurface(android.view.Surface p0) {}
    public void setSurface(android.view.Surface p0, boolean p1) {}
    public void setSurfaceControl(android.view.SurfaceControl p0, android.graphics.BLASTBufferQueue p1) {}
    @android.annotation.NonNull
    public android.graphics.HardwareRenderer.FrameRenderRequest createRenderRequest() { return null; }
    public int syncAndDrawFrame(android.graphics.FrameInfo p0) { return 0; }
    public boolean pause() { return false; }
    public void setStopped(boolean p0) {}
    public void stop() {}
    public void start() {}
    public void clearContent() {}
    public boolean setForceDark(int p0) { return false; }
    public void allocateBuffers() {}
    public void notifyFramePending() {}
    public void setOpaque(boolean p0) {}
    public boolean isOpaque() { return false; }
    public void setFrameCommitCallback(android.graphics.HardwareRenderer.FrameCommitCallback p0) {}
    public void setFrameCompleteCallback(android.graphics.HardwareRenderer.FrameCompleteCallback p0) {}
    public void addObserver(android.graphics.HardwareRendererObserver p0) {}
    public void removeObserver(android.graphics.HardwareRendererObserver p0) {}
    public float setColorMode(int p0) { return 0.0f; }
    public void setColorMode(int p0, float p1) {}
    public void setTargetHdrSdrRatio(float p0) {}
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
    protected void setASurfaceTransactionCallback(android.graphics.HardwareRenderer.ASurfaceTransactionCallback p0) {}
    protected void setPrepareSurfaceControlForWebviewCallback(android.graphics.HardwareRenderer.PrepareSurfaceControlForWebviewCallback p0) {}
    public void setFrameCallback(android.graphics.HardwareRenderer.FrameDrawingCallback p0) {}
    public void addRenderNode(android.graphics.RenderNode p0, boolean p1) {}
    public void removeRenderNode(android.graphics.RenderNode p0) {}
    public void drawRenderNode(android.graphics.RenderNode p0) {}
    public boolean loadSystemProperties() { return false; }
    public static void dumpGlobalProfileInfo(java.io.FileDescriptor p0, int p1) {}
    public void dumpProfileInfo(java.io.FileDescriptor p0, int p1) {}
    public void setContentDrawBounds(int p0, int p1, int p2, int p3) {}
    public void forceDrawNextFrame() {}
    public void setPictureCaptureCallback(android.graphics.HardwareRenderer.PictureCapturedCallback p0) {}
    static void invokePictureCapturedCallback(long p0, android.graphics.HardwareRenderer.PictureCapturedCallback p1) {}
    public void notifyCallbackPending() {}
    public void notifyExpensiveFrame() {}
    public static void setFPSDivisor(int p0) {}
    public static void setContextPriority(int p0) {}
    public static void setHighContrastText(boolean p0) {}
    public static void setIsolatedProcess(boolean p0) {}
    public static void sendDeviceConfigurationForDebugging(android.content.res.Configuration p0) {}
    public static void setDebuggingEnabled(boolean p0) {}
    public static void copySurfaceInto(android.view.Surface p0, android.graphics.HardwareRenderer.CopyRequest p1) {}
    public static android.graphics.Bitmap createHardwareBitmap(android.graphics.RenderNode p0, int p1, int p2) { return null; }
    public static void trimMemory(int p0) {}
    public static void trimCaches(int p0) {}
    public static void overrideProperty(java.lang.String p0, java.lang.String p1) {}
    public static void setupDiskCache(java.io.File p0) {}
    public static void setPackageName(java.lang.String p0) {}
    public static void setContextForInit(android.content.Context p0) {}
    public static void setIsSystemOrPersistent() {}
    public static boolean isDrawingEnabled() { return false; }
    public static void setDrawingEnabled(boolean p0) {}
    public static void setRtAnimationsEnabled(boolean p0) {}
    public static native void disableVsync();
    public static native void preload();
    protected static native boolean isWebViewOverlaysEnabled();
    protected static native void setupShadersDiskCache(java.lang.String p0, java.lang.String p1);

    public static interface ASurfaceTransactionCallback {
        public boolean onMergeTransaction(long p0, long p1, long p2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CacheTrimLevel {
    }

    public static abstract class CopyRequest {
        protected android.graphics.Bitmap mDestinationBitmap;
        final android.graphics.Rect mSrcRect = null;
        protected CopyRequest(android.graphics.Rect p0, android.graphics.Bitmap p1) {}
        public long getDestinationBitmap(int p0, int p1) { return 0L; }
        public abstract void onCopyFinished(int p0);
    }

    private static final class DestroyContextRunnable implements java.lang.Runnable {
        DestroyContextRunnable(long p0) {}
        public void run() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DumpFlags {
    }

    public static interface FrameCommitCallback {
        public void onFrameCommit(boolean p0);
    }

    public static interface FrameCompleteCallback {
        public void onFrameComplete();
    }

    public static interface FrameDrawingCallback {
        public void onFrameDraw(long p0);
        default public android.graphics.HardwareRenderer.FrameCommitCallback onFrameDraw(int p0, long p1) { return null; }
    }

    public final class FrameRenderRequest {
        public void setFrameInfo(android.graphics.FrameInfo p0) {}
        @android.annotation.NonNull
        public android.graphics.HardwareRenderer.FrameRenderRequest setVsyncTime(long p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.HardwareRenderer.FrameRenderRequest setFrameCommitCallback(java.util.concurrent.Executor p0, java.lang.Runnable p1) { return null; }
        @android.annotation.NonNull
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
        synchronized void setPackageName(java.lang.String p0) {}
        synchronized void setIsolated(boolean p0) {}
        synchronized void setContext(android.content.Context p0) {}
        synchronized void init(long p0) {}
        synchronized void initUsingContext() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SyncAndDrawResult {
    }
}
