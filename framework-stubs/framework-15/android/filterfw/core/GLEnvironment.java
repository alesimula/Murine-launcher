package android.filterfw.core;

public class GLEnvironment {
    public GLEnvironment() {}
    public synchronized void tearDown() {}
    protected void finalize() throws java.lang.Throwable {}
    public void initWithNewContext() {}
    public void initWithCurrentContext() {}
    public boolean isActive() { return false; }
    public boolean isContextActive() { return false; }
    public static boolean isAnyContextActive() { return false; }
    public void activate() {}
    public void deactivate() {}
    public void swapBuffers() {}
    public int registerSurface(android.view.Surface p0) { return 0; }
    public int registerSurfaceTexture(android.graphics.SurfaceTexture p0, int p1, int p2) { return 0; }
    public int registerSurfaceFromMediaRecorder(android.media.MediaRecorder p0) { return 0; }
    public void activateSurfaceWithId(int p0) {}
    public void unregisterSurfaceId(int p0) {}
    public void setSurfaceTimestamp(long p0) {}
}
