package android.graphics;

public final class TextureLayer implements java.lang.AutoCloseable {
    public void setLayerPaint(android.graphics.Paint p0) {}
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
}
