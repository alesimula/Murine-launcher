package android.view;

public interface SurfaceHolder {
    @java.lang.Deprecated
    public static final int SURFACE_TYPE_NORMAL = 0;
    @java.lang.Deprecated
    public static final int SURFACE_TYPE_HARDWARE = 1;
    @java.lang.Deprecated
    public static final int SURFACE_TYPE_GPU = 2;
    @java.lang.Deprecated
    public static final int SURFACE_TYPE_PUSH_BUFFERS = 3;
    public void addCallback(android.view.SurfaceHolder.Callback p0);
    public void removeCallback(android.view.SurfaceHolder.Callback p0);
    public boolean isCreating();
    @java.lang.Deprecated
    public void setType(int p0);
    public void setFixedSize(int p0, int p1);
    public void setSizeFromLayout();
    public void setFormat(int p0);
    public void setKeepScreenOn(boolean p0);
    public android.graphics.Canvas lockCanvas();
    public android.graphics.Canvas lockCanvas(android.graphics.Rect p0);
    default public android.graphics.Canvas lockHardwareCanvas() { return null; }
    public void unlockCanvasAndPost(android.graphics.Canvas p0);
    public android.graphics.Rect getSurfaceFrame();
    public android.view.Surface getSurface();

    public static interface Callback2 extends android.view.SurfaceHolder.Callback {
        public void surfaceRedrawNeeded(android.view.SurfaceHolder p0);
        default public void surfaceRedrawNeededAsync(android.view.SurfaceHolder p0, java.lang.Runnable p1) {}
    }

    public static interface Callback {
        public void surfaceCreated(android.view.SurfaceHolder p0);
        public void surfaceChanged(android.view.SurfaceHolder p0, int p1, int p2, int p3);
        public void surfaceDestroyed(android.view.SurfaceHolder p0);
    }

    public static class BadSurfaceTypeException extends java.lang.RuntimeException {
        public BadSurfaceTypeException() { super(); }
        public BadSurfaceTypeException(java.lang.String p0) { super(); }
    }
}
