package android.widget;

public final class Magnifier {
    private static final java.lang.String TAG = "Magnifier";
    private static final int NONEXISTENT_PREVIOUS_CONFIG_VALUE = -1;
    private static final android.os.HandlerThread sPixelCopyHandlerThread = null;
    private static final float FISHEYE_RAMP_WIDTH = 12.0f;
    private final android.view.View mView = null;
    private final int[] mViewCoordinatesInSurface = null;
    private android.widget.Magnifier.InternalPopupWindow mWindow;
    private final int mWindowWidth = 0;
    private int mWindowHeight;
    private float mZoom;
    private int mSourceWidth;
    private int mSourceHeight;
    private boolean mDirtyState;
    private final float mWindowElevation = 0.0f;
    private final float mWindowCornerRadius = 0.0f;
    private final android.graphics.drawable.Drawable mOverlay = null;
    private final int mDefaultHorizontalSourceToMagnifierOffset = 0;
    private final int mDefaultVerticalSourceToMagnifierOffset = 0;
    private final boolean mClippingEnabled = false;
    private int mLeftContentBound;
    private int mTopContentBound;
    private int mRightContentBound;
    private int mBottomContentBound;
    private android.widget.Magnifier.SurfaceInfo mParentSurface;
    private android.widget.Magnifier.SurfaceInfo mContentCopySurface;
    private final android.graphics.Point mWindowCoords = null;
    private final android.graphics.Point mClampedCenterZoomCoords = null;
    private final android.graphics.Point mPrevStartCoordsInSurface = null;
    private final android.graphics.PointF mPrevShowSourceCoords = null;
    private final android.graphics.PointF mPrevShowWindowCoords = null;
    private final android.graphics.Rect mPixelCopyRequestRect = null;
    private final java.lang.Object mLock = null;
    private boolean mIsFishEyeStyle;
    private int mLeftCutWidth;
    private int mRightCutWidth;
    private final int mRamp = 0;
    private android.graphics.drawable.Drawable mCursorDrawable;
    private boolean mDrawCursorEnabled;
    public static final int SOURCE_BOUND_MAX_IN_SURFACE = 0;
    public static final int SOURCE_BOUND_MAX_VISIBLE = 1;
    private android.widget.Magnifier.Callback mCallback;
    @java.lang.Deprecated
    public Magnifier(android.view.View p0) {}
    static android.widget.Magnifier.Builder createBuilderWithOldMagnifierDefaults(android.view.View p0) { return null; }
    private static float getDeviceDefaultDialogCornerRadius(android.content.Context p0) { return 0.0f; }
    private Magnifier(android.widget.Magnifier.Builder p0) {}
    public void show(float p0, float p1) {}
    void setDrawCursor(boolean p0, android.graphics.drawable.Drawable p1) {}
    public void show(float p0, float p1, float p2, float p3) {}
    public void dismiss() {}
    public void update() {}
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public int getSourceWidth() { return 0; }
    public int getSourceHeight() { return 0; }
    public void setZoom(float p0) {}
    void updateSourceFactors(int p0, float p1) {}
    public float getZoom() { return 0.0f; }
    public float getElevation() { return 0.0f; }
    public float getCornerRadius() { return 0.0f; }
    public int getDefaultHorizontalSourceToMagnifierOffset() { return 0; }
    public int getDefaultVerticalSourceToMagnifierOffset() { return 0; }
    public android.graphics.drawable.Drawable getOverlay() { return null; }
    public boolean isClippingEnabled() { return false; }
    public android.graphics.Point getPosition() { return null; }
    public android.graphics.Point getSourcePosition() { return null; }
    private void obtainSurfaces() {}
    private void obtainContentCoordinates(float p0, float p1) {}
    private void obtainWindowCoordinates(float p0, float p1) {}
    private void maybeDrawCursor(android.graphics.Canvas p0) {}
    private void performPixelCopy(int p0, int p1, boolean p2) {}
    private void onPixelCopyFailed() {}
    private android.graphics.Point getCurrentClampedWindowCoordinates() { return null; }
    public void setOnOperationCompleteCallback(android.widget.Magnifier.Callback p0) {}
    public android.graphics.Bitmap getContent() { return null; }
    public android.graphics.Bitmap getOriginalContent() { return null; }
    public static android.graphics.PointF getMagnifierDefaultSize() { return null; }

    public static final class Builder {
        private android.view.View mView;
        private int mWidth;
        private int mHeight;
        private float mZoom;
        private float mElevation;
        private float mCornerRadius;
        private android.graphics.drawable.Drawable mOverlay;
        private int mHorizontalDefaultSourceToMagnifierOffset;
        private int mVerticalDefaultSourceToMagnifierOffset;
        private boolean mClippingEnabled;
        private int mLeftContentBound;
        private int mTopContentBound;
        private int mRightContentBound;
        private int mBottomContentBound;
        private boolean mIsFishEyeStyle;
        private int mSourceWidth;
        private int mSourceHeight;
        public Builder(android.view.View p0) {}
        private void applyDefaults() {}
        public android.widget.Magnifier.Builder setSize(int p0, int p1) { return null; }
        public android.widget.Magnifier.Builder setInitialZoom(float p0) { return null; }
        public android.widget.Magnifier.Builder setElevation(float p0) { return null; }
        public android.widget.Magnifier.Builder setCornerRadius(float p0) { return null; }
        public android.widget.Magnifier.Builder setOverlay(android.graphics.drawable.Drawable p0) { return null; }
        public android.widget.Magnifier.Builder setDefaultSourceToMagnifierOffset(int p0, int p1) { return null; }
        public android.widget.Magnifier.Builder setClippingEnabled(boolean p0) { return null; }
        public android.widget.Magnifier.Builder setSourceBounds(int p0, int p1, int p2, int p3) { return null; }
        android.widget.Magnifier.Builder setSourceSize(int p0, int p1) { return null; }
        android.widget.Magnifier.Builder setFishEyeStyle() { return null; }
        public android.widget.Magnifier build() { return null; }
    }

    public static interface Callback {
        public void onOperationComplete();
    }

    private static class InternalPopupWindow {
        private static final int SURFACE_Z = 5;
        private final android.view.Display mDisplay = null;
        private final int mContentWidth = 0;
        private int mContentHeight;
        private final int mOffsetX = 0;
        private final int mOffsetY = 0;
        private final android.graphics.drawable.Drawable mOverlay = null;
        private final android.view.SurfaceSession mSurfaceSession = null;
        private final android.view.SurfaceControl mSurfaceControl = null;
        private final android.view.SurfaceControl mBbqSurfaceControl = null;
        private final android.graphics.BLASTBufferQueue mBBQ = null;
        private final android.view.SurfaceControl.Transaction mTransaction = null;
        private final android.view.Surface mSurface = null;
        private final android.view.ThreadedRenderer.SimpleRenderer mRenderer = null;
        private final android.graphics.RenderNode mBitmapRenderNode = null;
        private final android.graphics.RenderNode mOverlayRenderNode = null;
        private final java.lang.Runnable mMagnifierUpdater = null;
        private final android.os.Handler mHandler = null;
        private android.widget.Magnifier.Callback mCallback;
        private final java.lang.Object mLock = null;
        private boolean mFrameDrawScheduled;
        private android.graphics.Bitmap mBitmap;
        private boolean mFirstDraw;
        private int mWindowPositionX;
        private int mWindowPositionY;
        private boolean mPendingWindowPositionUpdate;
        private android.graphics.Bitmap mCurrentContent;
        private float mZoom;
        private final int mRamp = 0;
        private boolean mIsFishEyeStyle;
        private float[] mMeshLeft;
        private float[] mMeshRight;
        private int mMeshWidth;
        private int mMeshHeight;
        InternalPopupWindow(android.content.Context p0, android.view.Display p1, android.view.SurfaceControl p2, int p3, int p4, float p5, int p6, float p7, float p8, android.graphics.drawable.Drawable p9, android.os.Handler p10, java.lang.Object p11, android.widget.Magnifier.Callback p12, boolean p13) {}
        private void updateContentFactors(int p0, float p1) {}
        private void createMeshMatrixForFishEyeEffect() {}
        private void fillMeshMatrix() {}
        private android.graphics.RenderNode createRenderNodeForBitmap(java.lang.String p0, float p1, float p2) { return null; }
        private android.graphics.RenderNode createRenderNodeForOverlay(java.lang.String p0, float p1) { return null; }
        private void setupOverlay() {}
        private void drawOverlay() {}
        public void setContentPositionForNextDraw(int p0, int p1) {}
        public void updateContent(android.graphics.Bitmap p0) {}
        private void requestUpdate() {}
        public void destroy() {}
        private void doDraw() {}
        private void updateCurrentContentForTesting() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SourceBound {
    }

    private static class SurfaceInfo {
        public static final android.widget.Magnifier.SurfaceInfo NULL = null;
        private android.view.Surface mSurface;
        private android.view.SurfaceControl mSurfaceControl;
        private int mWidth;
        private int mHeight;
        private android.graphics.Rect mInsets;
        private boolean mIsMainWindowSurface;
        SurfaceInfo(android.view.SurfaceControl p0, android.view.Surface p1, int p2, int p3, android.graphics.Rect p4, boolean p5) {}
    }
}
