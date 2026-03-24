package android.filterfw.core;

public class FilterSurfaceView extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback {
    private static int STATE_ALLOCATED;
    private static int STATE_CREATED;
    private static int STATE_INITIALIZED;
    private int mState;
    private android.view.SurfaceHolder.Callback mListener;
    private android.filterfw.core.GLEnvironment mGLEnv;
    private int mFormat;
    private int mWidth;
    private int mHeight;
    private int mSurfaceId;
    public FilterSurfaceView(android.content.Context p0) { super((android.content.Context)null); }
    public FilterSurfaceView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public synchronized void bindToListener(android.view.SurfaceHolder.Callback p0, android.filterfw.core.GLEnvironment p1) {}
    public synchronized void unbind() {}
    public synchronized int getSurfaceId() { return 0; }
    public synchronized android.filterfw.core.GLEnvironment getGLEnv() { return null; }
    public synchronized void surfaceCreated(android.view.SurfaceHolder p0) {}
    public synchronized void surfaceChanged(android.view.SurfaceHolder p0, int p1, int p2, int p3) {}
    public synchronized void surfaceDestroyed(android.view.SurfaceHolder p0) {}
    private void registerSurface() {}
    private void unregisterSurface() {}
}
