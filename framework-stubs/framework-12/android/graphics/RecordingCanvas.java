package android.graphics;

public final class RecordingCanvas extends android.graphics.BaseRecordingCanvas {
    private static final int POOL_LIMIT = 25;
    public static final int MAX_BITMAP_SIZE = Integer.valueOf(0);
    private static final android.util.Pools.SynchronizedPool<android.graphics.RecordingCanvas> sPool = null;
    public android.graphics.RenderNode mNode;
    private int mWidth;
    private int mHeight;
    private static int getPanelFrameSize() { return 0; }
    static android.graphics.RecordingCanvas obtain(android.graphics.RenderNode p0, int p1, int p2) { return null; }
    void recycle() {}
    void finishRecording(android.graphics.RenderNode p0) {}
    private RecordingCanvas(android.graphics.RenderNode p0, int p1, int p2) { super(0L); }
    public void setDensity(int p0) {}
    public boolean isHardwareAccelerated() { return false; }
    public void setBitmap(android.graphics.Bitmap p0) {}
    public boolean isOpaque() { return false; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public int getMaximumBitmapWidth() { return 0; }
    public int getMaximumBitmapHeight() { return 0; }
    public void enableZ() {}
    public void disableZ() {}
    public void drawWebViewFunctor(int p0) {}
    public void drawRenderNode(android.graphics.RenderNode p0) {}
    public void drawTextureLayer(android.graphics.TextureLayer p0) {}
    public void drawCircle(android.graphics.CanvasProperty<java.lang.Float> p0, android.graphics.CanvasProperty<java.lang.Float> p1, android.graphics.CanvasProperty<java.lang.Float> p2, android.graphics.CanvasProperty<android.graphics.Paint> p3) {}
    public void drawRipple(android.graphics.CanvasProperty<java.lang.Float> p0, android.graphics.CanvasProperty<java.lang.Float> p1, android.graphics.CanvasProperty<java.lang.Float> p2, android.graphics.CanvasProperty<android.graphics.Paint> p3, android.graphics.CanvasProperty<java.lang.Float> p4, android.graphics.CanvasProperty<java.lang.Float> p5, int p6, android.graphics.RuntimeShader p7) {}
    public void drawRoundRect(android.graphics.CanvasProperty<java.lang.Float> p0, android.graphics.CanvasProperty<java.lang.Float> p1, android.graphics.CanvasProperty<java.lang.Float> p2, android.graphics.CanvasProperty<java.lang.Float> p3, android.graphics.CanvasProperty<java.lang.Float> p4, android.graphics.CanvasProperty<java.lang.Float> p5, android.graphics.CanvasProperty<android.graphics.Paint> p6) {}
    protected void throwIfCannotDraw(android.graphics.Bitmap p0) {}
    private static native long nCreateDisplayListCanvas(long p0, int p1, int p2);
    private static native void nResetDisplayListCanvas(long p0, long p1, int p2, int p3);
    private static native int nGetMaximumTextureWidth();
    private static native int nGetMaximumTextureHeight();
    private static native void nEnableZ(long p0, boolean p1);
    private static native void nFinishRecording(long p0, long p1);
    private static native void nDrawRenderNode(long p0, long p1);
    private static native void nDrawTextureLayer(long p0, long p1);
    private static native void nDrawCircle(long p0, long p1, long p2, long p3, long p4);
    private static native void nDrawRipple(long p0, long p1, long p2, long p3, long p4, long p5, long p6, int p7, long p8);
    private static native void nDrawRoundRect(long p0, long p1, long p2, long p3, long p4, long p5, long p6, long p7);
    private static native void nDrawWebViewFunctor(long p0, int p1);
}
