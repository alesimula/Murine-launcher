package android.graphics;

public final class RecordingCanvas extends android.graphics.BaseRecordingCanvas {
    public static final int MAX_BITMAP_SIZE = Integer.valueOf(0);
    public android.graphics.RenderNode mNode;
    RecordingCanvas() { super(0L); }
    static android.graphics.RecordingCanvas obtain(android.graphics.RenderNode p0, int p1, int p2) { return null; }
    void recycle() {}
    void finishRecording(android.graphics.RenderNode p0) {}
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
}
