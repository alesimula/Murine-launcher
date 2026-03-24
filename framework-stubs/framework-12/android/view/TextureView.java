package android.view;

public class TextureView extends android.view.View {
    private static final java.lang.String LOG_TAG = "TextureView";
    private android.graphics.TextureLayer mLayer;
    private android.graphics.SurfaceTexture mSurface;
    private android.view.TextureView.SurfaceTextureListener mListener;
    private boolean mHadSurface;
    private boolean mOpaque;
    private final android.graphics.Matrix mMatrix = null;
    private boolean mMatrixChanged;
    private final java.lang.Object[] mLock = null;
    private boolean mUpdateLayer;
    private boolean mUpdateSurface;
    private android.graphics.Canvas mCanvas;
    private int mSaveCount;
    private final java.lang.Object[] mNativeWindowLock = null;
    private long mNativeWindow;
    private final android.graphics.SurfaceTexture.OnFrameAvailableListener mUpdateListener = null;
    public TextureView(android.content.Context p0) { super((android.content.Context)null); }
    public TextureView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TextureView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public TextureView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public boolean isOpaque() { return false; }
    public void setOpaque(boolean p0) {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindowInternal() {}
    protected void destroyHardwareResources() {}
    private void destroyHardwareLayer() {}
    private void releaseSurfaceTexture() {}
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
    private void updateLayer() {}
    private void updateLayerAndInvalidate() {}
    private void applyUpdate() {}
    public void setTransform(android.graphics.Matrix p0) {}
    public android.graphics.Matrix getTransform(android.graphics.Matrix p0) { return null; }
    private void applyTransformMatrix() {}
    public android.graphics.Bitmap getBitmap() { return null; }
    public android.graphics.Bitmap getBitmap(int p0, int p1) { return null; }
    public android.graphics.Bitmap getBitmap(android.graphics.Bitmap p0) { return null; }
    public boolean isAvailable() { return false; }
    public android.graphics.Canvas lockCanvas() { return null; }
    public android.graphics.Canvas lockCanvas(android.graphics.Rect p0) { return null; }
    public void unlockCanvasAndPost(android.graphics.Canvas p0) {}
    public android.graphics.SurfaceTexture getSurfaceTexture() { return null; }
    public void setSurfaceTexture(android.graphics.SurfaceTexture p0) {}
    public android.view.TextureView.SurfaceTextureListener getSurfaceTextureListener() { return null; }
    public void setSurfaceTextureListener(android.view.TextureView.SurfaceTextureListener p0) {}
    private native void nCreateNativeWindow(android.graphics.SurfaceTexture p0);
    private native void nDestroyNativeWindow();
    private static native boolean nLockCanvas(long p0, android.graphics.Canvas p1, android.graphics.Rect p2);
    private static native void nUnlockCanvasAndPost(long p0, android.graphics.Canvas p1);

    public static interface SurfaceTextureListener {
        public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture p0, int p1, int p2);
        public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture p0, int p1, int p2);
        public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture p0);
        public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture p0);
    }
}
