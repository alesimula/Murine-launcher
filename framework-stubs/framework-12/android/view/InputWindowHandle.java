package android.view;

public final class InputWindowHandle {
    private long ptr;
    public android.view.InputApplicationHandle inputApplicationHandle;
    public android.os.IBinder token;
    public java.lang.String name;
    public int layoutParamsFlags;
    public int layoutParamsType;
    public long dispatchingTimeoutMillis;
    public int frameLeft;
    public int frameTop;
    public int frameRight;
    public int frameBottom;
    public int surfaceInset;
    public float scaleFactor;
    public final android.graphics.Region touchableRegion = null;
    public boolean visible;
    public boolean focusable;
    public boolean hasWallpaper;
    public boolean paused;
    public boolean trustedOverlay;
    public int touchOcclusionMode;
    public int ownerPid;
    public int ownerUid;
    public java.lang.String packageName;
    public int inputFeatures;
    public int displayId;
    public int portalToDisplayId;
    public java.lang.ref.WeakReference<android.view.SurfaceControl> touchableRegionSurfaceControl;
    public boolean replaceTouchableRegionWithCrop;
    private native void nativeDispose();
    public InputWindowHandle(android.view.InputApplicationHandle p0, int p1) {}
    public java.lang.String toString() { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public void replaceTouchableRegionWithCrop(android.view.SurfaceControl p0) {}
    public void setTouchableRegionCrop(android.view.SurfaceControl p0) {}
}
