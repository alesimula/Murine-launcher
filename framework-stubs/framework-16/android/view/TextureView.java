package android.view;

public class TextureView extends android.view.View {
    public TextureView(android.content.Context p0) { super((android.content.Context)null); }
    public TextureView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TextureView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public TextureView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public boolean isOpaque() { return false; }
    public void setOpaque(boolean p0) {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindowInternal() {}
    protected void destroyHardwareResources() {}
    public void setLayerType(int p0, android.graphics.Paint p1) {}
    public void setLayerPaint(android.graphics.Paint p0) {}
    public int getLayerType() { return 0; }
    public void buildLayer() {}
    public void setForeground(android.graphics.drawable.Drawable p0) {}
    public void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public final void draw(android.graphics.Canvas p0) {}
    protected final void onDraw(android.graphics.Canvas p0) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    android.graphics.TextureLayer getTextureLayer() { return null; }
    protected void onVisibilityChanged(android.view.View p0, int p1) {}
    public void setTransform(android.graphics.Matrix p0) {}
    @android.annotation.NonNull
    public android.graphics.Matrix getTransform(android.graphics.Matrix p0) { return null; }
    @android.annotation.Nullable
    public android.graphics.Bitmap getBitmap() { return null; }
    @android.annotation.Nullable
    public android.graphics.Bitmap getBitmap(int p0, int p1) { return null; }
    @android.annotation.NonNull
    public android.graphics.Bitmap getBitmap(android.graphics.Bitmap p0) { return null; }
    public boolean isAvailable() { return false; }
    @android.annotation.Nullable
    public android.graphics.Canvas lockCanvas() { return null; }
    @android.annotation.Nullable
    public android.graphics.Canvas lockCanvas(android.graphics.Rect p0) { return null; }
    public void unlockCanvasAndPost(android.graphics.Canvas p0) {}
    @android.annotation.Nullable
    public android.graphics.SurfaceTexture getSurfaceTexture() { return null; }
    public void setSurfaceTexture(android.graphics.SurfaceTexture p0) {}
    @android.annotation.Nullable
    public android.view.TextureView.SurfaceTextureListener getSurfaceTextureListener() { return null; }
    public void setSurfaceTextureListener(android.view.TextureView.SurfaceTextureListener p0) {}
    protected int calculateFrameRateCategory() { return 0; }
    protected void votePreferredFrameRate() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }

    public static interface SurfaceTextureListener {
        public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture p0, int p1, int p2);
        public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture p0, int p1, int p2);
        public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture p0);
        public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture p0);
    }
}
