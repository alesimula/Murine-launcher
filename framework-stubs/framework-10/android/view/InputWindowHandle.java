package android.view;

public final class InputWindowHandle {
    private long ptr;
    public final android.view.InputApplicationHandle inputApplicationHandle = null;
    public final android.view.IWindow clientWindow = null;
    public android.os.IBinder token;
    public java.lang.String name;
    public int layoutParamsFlags;
    public int layoutParamsType;
    public long dispatchingTimeoutNanos;
    public int frameLeft;
    public int frameTop;
    public int frameRight;
    public int frameBottom;
    public int surfaceInset;
    public float scaleFactor;
    public final android.graphics.Region touchableRegion = null;
    public boolean visible;
    public boolean canReceiveKeys;
    public boolean hasFocus;
    public boolean hasWallpaper;
    public boolean paused;
    public int layer;
    public int ownerPid;
    public int ownerUid;
    public int inputFeatures;
    public int displayId;
    public int portalToDisplayId;
    public java.lang.ref.WeakReference<android.os.IBinder> touchableRegionCropHandle;
    public boolean replaceTouchableRegionWithCrop;
    private native void nativeDispose();
    public InputWindowHandle(android.view.InputApplicationHandle p0, android.view.IWindow p1, int p2) {}
    public java.lang.String toString() { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public void replaceTouchableRegionWithCrop(android.view.SurfaceControl p0) {}
    public void setTouchableRegionCrop(android.view.SurfaceControl p0) {}
}
