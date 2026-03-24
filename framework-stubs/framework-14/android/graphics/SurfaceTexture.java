package android.graphics;

public class SurfaceTexture {
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
    @android.annotation.SuppressLint("MethodNameUnits")
    public int getDataSpace() { return 0; }
    public void release() {}
    public boolean isReleased() { return false; }
    protected void finalize() throws java.lang.Throwable {}
    public boolean isSingleBuffered() { return false; }

    public static interface OnFrameAvailableListener {
        public void onFrameAvailable(android.graphics.SurfaceTexture p0);
    }

    @java.lang.Deprecated
    public static class OutOfResourcesException extends java.lang.Exception {
        public OutOfResourcesException() { super(); }
        public OutOfResourcesException(java.lang.String p0) { super(); }
    }
}
