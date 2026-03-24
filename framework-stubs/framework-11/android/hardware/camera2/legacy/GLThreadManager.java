package android.hardware.camera2.legacy;

public class GLThreadManager {
    private final java.lang.String TAG = null;
    private static final boolean DEBUG = false;
    private static final int MSG_NEW_CONFIGURATION = 1;
    private static final int MSG_NEW_FRAME = 2;
    private static final int MSG_CLEANUP = 3;
    private static final int MSG_DROP_FRAMES = 4;
    private static final int MSG_ALLOW_FRAMES = 5;
    private android.hardware.camera2.legacy.CaptureCollector mCaptureCollector;
    private final android.hardware.camera2.legacy.CameraDeviceState mDeviceState = null;
    private final android.hardware.camera2.legacy.SurfaceTextureRenderer mTextureRenderer = null;
    private final android.hardware.camera2.legacy.RequestHandlerThread mGLHandlerThread = null;
    private final android.hardware.camera2.legacy.RequestThreadManager.FpsCounter mPrevCounter = null;
    private final android.os.Handler.Callback mGLHandlerCb = null;
    public GLThreadManager(int p0, int p1, android.hardware.camera2.legacy.CameraDeviceState p2) {}
    public void start() {}
    public void waitUntilStarted() {}
    public void quit() {}
    public void queueNewFrame() {}
    public void setConfigurationAndWait(java.util.Collection<android.util.Pair<android.view.Surface, android.util.Size>> p0, android.hardware.camera2.legacy.CaptureCollector p1) {}
    public android.graphics.SurfaceTexture getCurrentSurfaceTexture() { return null; }
    public void ignoreNewFrames() {}
    public void waitUntilIdle() {}
    public void allowNewFrames() {}

    private static class ConfigureHolder {
        public final android.os.ConditionVariable condition = null;
        public final java.util.Collection<android.util.Pair<android.view.Surface, android.util.Size>> surfaces = null;
        public final android.hardware.camera2.legacy.CaptureCollector collector = null;
        public ConfigureHolder(android.os.ConditionVariable p0, java.util.Collection<android.util.Pair<android.view.Surface, android.util.Size>> p1, android.hardware.camera2.legacy.CaptureCollector p2) {}
    }
}
