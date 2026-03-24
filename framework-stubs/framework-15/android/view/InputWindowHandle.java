package android.view;

public final class InputWindowHandle {
    public android.view.InputApplicationHandle inputApplicationHandle;
    public android.os.IBinder token;
    public java.lang.String name;
    public int layoutParamsFlags;
    public int layoutParamsType;
    public long dispatchingTimeoutMillis;
    public final android.graphics.Rect frame = null;
    public android.util.Size contentSize;
    public int surfaceInset;
    public float scaleFactor;
    public final android.graphics.Region touchableRegion = null;
    public int inputConfig;
    public int touchOcclusionMode;
    public int ownerPid;
    public int ownerUid;
    public java.lang.String packageName;
    public int displayId;
    public java.lang.ref.WeakReference<android.view.SurfaceControl> touchableRegionSurfaceControl;
    public boolean replaceTouchableRegionWithCrop;
    public android.graphics.Matrix transform;
    public float alpha;
    public boolean canOccludePresentation;
    @android.annotation.Nullable
    public android.os.IBinder focusTransferTarget;
    public InputWindowHandle(android.view.InputApplicationHandle p0, int p1) {}
    public InputWindowHandle(android.view.InputWindowHandle p0) {}
    public java.lang.String toString() { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public void replaceTouchableRegionWithCrop(android.view.SurfaceControl p0) {}
    public void setTouchableRegionCrop(android.view.SurfaceControl p0) {}
    public void setWindowToken(android.os.IBinder p0) {}
    @android.annotation.Nullable
    public android.os.IBinder getWindowToken() { return null; }
    public void setInputConfig(int p0, boolean p1) {}
    public void setTrustedOverlay(android.view.SurfaceControl.Transaction p0, android.view.SurfaceControl p1, boolean p2) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InputConfigFlags {
    }
}
