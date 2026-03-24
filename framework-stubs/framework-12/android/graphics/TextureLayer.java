package android.graphics;

public final class TextureLayer implements java.lang.AutoCloseable {
    private android.graphics.HardwareRenderer mRenderer;
    private com.android.internal.util.VirtualRefBasePtr mFinalizer;
    private TextureLayer(android.graphics.HardwareRenderer p0, long p1) {}
    public void setLayerPaint(android.graphics.Paint p0) {}
    private boolean isValid() { return false; }
    public void close() {}
    long getDeferredLayerUpdater() { return 0L; }
    public boolean copyInto(android.graphics.Bitmap p0) { return false; }
    public boolean prepare(int p0, int p1, boolean p2) { return false; }
    public void setTransform(android.graphics.Matrix p0) {}
    public void detachSurfaceTexture() {}
    long getLayerHandle() { return 0L; }
    public void setSurfaceTexture(android.graphics.SurfaceTexture p0) {}
    public void updateSurfaceTexture() {}
    static android.graphics.TextureLayer adoptTextureLayer(android.graphics.HardwareRenderer p0, long p1) { return null; }
    private static native boolean nPrepare(long p0, int p1, int p2, boolean p3);
    private static native void nSetLayerPaint(long p0, long p1);
    private static native void nSetTransform(long p0, long p1);
    private static native void nSetSurfaceTexture(long p0, android.graphics.SurfaceTexture p1);
    private static native void nUpdateSurfaceTexture(long p0);
}
