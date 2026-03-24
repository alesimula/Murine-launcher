package android.filterfw.core;

public class GLEnvironment {
    private int glEnvId;
    private boolean mManageContext;
    public GLEnvironment() {}
    private GLEnvironment(android.filterfw.core.NativeAllocatorTag p0) {}
    public synchronized void tearDown() {}
    protected void finalize() throws java.lang.Throwable {}
    public void initWithNewContext() {}
    public void initWithCurrentContext() {}
    @android.annotation.UnsupportedAppUsage
    public boolean isActive() { return false; }
    public boolean isContextActive() { return false; }
    public static boolean isAnyContextActive() { return false; }
    @android.annotation.UnsupportedAppUsage
    public void activate() {}
    @android.annotation.UnsupportedAppUsage
    public void deactivate() {}
    @android.annotation.UnsupportedAppUsage
    public void swapBuffers() {}
    public int registerSurface(android.view.Surface p0) { return 0; }
    public int registerSurfaceTexture(android.graphics.SurfaceTexture p0, int p1, int p2) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public int registerSurfaceFromMediaRecorder(android.media.MediaRecorder p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public void activateSurfaceWithId(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void unregisterSurfaceId(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setSurfaceTimestamp(long p0) {}
    private native boolean nativeInitWithNewContext();
    private native boolean nativeInitWithCurrentContext();
    private native boolean nativeIsActive();
    private native boolean nativeIsContextActive();
    private static native boolean nativeIsAnyContextActive();
    private native boolean nativeActivate();
    private native boolean nativeDeactivate();
    private native boolean nativeSwapBuffers();
    private native boolean nativeAllocate();
    private native boolean nativeDeallocate();
    private native int nativeAddSurface(android.view.Surface p0);
    private native int nativeAddSurfaceWidthHeight(android.view.Surface p0, int p1, int p2);
    private native int nativeAddSurfaceFromMediaRecorder(android.media.MediaRecorder p0);
    private native boolean nativeDisconnectSurfaceMediaSource(android.media.MediaRecorder p0);
    private native boolean nativeActivateSurfaceId(int p0);
    private native boolean nativeRemoveSurfaceId(int p0);
    private native boolean nativeSetSurfaceTimestamp(long p0);
}
