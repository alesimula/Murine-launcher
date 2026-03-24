package android.graphics;

public class SurfaceTexture {
    private final android.os.Looper mCreatorLooper = null;
    @android.annotation.UnsupportedAppUsage
    private android.os.Handler mOnFrameAvailableHandler;
    @android.annotation.UnsupportedAppUsage
    private long mSurfaceTexture;
    @android.annotation.UnsupportedAppUsage
    private long mProducer;
    @android.annotation.UnsupportedAppUsage
    private long mFrameAvailableListener;
    private boolean mIsSingleBuffered;
    public SurfaceTexture(int p0) {}
    public SurfaceTexture(int p0, boolean p1) {}
    public SurfaceTexture(boolean p0) {}
    public void setOnFrameAvailableListener(android.graphics.SurfaceTexture.OnFrameAvailableListener p0) {}
    public void setOnFrameAvailableListener(android.graphics.SurfaceTexture.OnFrameAvailableListener p0, android.os.Handler p1) {}
    public void setDefaultBufferSize(int p0, int p1) {}
    public void updateTexImage() {}
    public void releaseTexImage() {}
    public void detachFromGLContext() {}
    public void attachToGLContext(int p0) {}
    public void getTransformMatrix(float[] p0) {}
    public long getTimestamp() { return 0L; }
    public void release() {}
    public boolean isReleased() { return false; }
    protected void finalize() throws java.lang.Throwable {}
    @android.annotation.UnsupportedAppUsage
    private static void postEventFromNative(java.lang.ref.WeakReference<android.graphics.SurfaceTexture> p0) {}
    public boolean isSingleBuffered() { return false; }
    private native void nativeInit(boolean p0, int p1, boolean p2, java.lang.ref.WeakReference<android.graphics.SurfaceTexture> p3) throws android.view.Surface.OutOfResourcesException;
    private native void nativeFinalize();
    private native void nativeGetTransformMatrix(float[] p0);
    private native long nativeGetTimestamp();
    private native void nativeSetDefaultBufferSize(int p0, int p1);
    private native void nativeUpdateTexImage();
    private native void nativeReleaseTexImage();
    @android.annotation.UnsupportedAppUsage
    private native int nativeDetachFromGLContext();
    private native int nativeAttachToGLContext(int p0);
    private native void nativeRelease();
    private native boolean nativeIsReleased();

    @java.lang.Deprecated
    public static class OutOfResourcesException extends java.lang.Exception {
        public OutOfResourcesException() { super(); }
        public OutOfResourcesException(java.lang.String p0) { super(); }
    }

    public static interface OnFrameAvailableListener {
        public void onFrameAvailable(android.graphics.SurfaceTexture p0);
    }
}
