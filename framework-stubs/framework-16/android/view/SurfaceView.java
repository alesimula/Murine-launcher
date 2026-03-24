package android.view;

public class SurfaceView extends android.view.View implements android.view.ViewRootImpl.SurfaceChangedCallback {
    public static final int SURFACE_LIFECYCLE_DEFAULT = 0;
    public static final int SURFACE_LIFECYCLE_FOLLOWS_VISIBILITY = 1;
    public static final int SURFACE_LIFECYCLE_FOLLOWS_ATTACHMENT = 2;
    final java.util.ArrayList<android.view.SurfaceHolder.Callback> mCallbacks = null;
    final int[] mLocation = null;
    final java.util.concurrent.locks.ReentrantLock mSurfaceLock = null;
    final android.view.Surface mSurface = null;
    boolean mDrawingStopped;
    boolean mDrawFinished;
    final android.graphics.Rect mScreenRect = null;
    android.view.SurfaceControl mSurfaceControl;
    android.view.SurfaceControl mBackgroundControl;
    final java.lang.Object mSurfaceControlLock = null;
    final android.graphics.Rect mTmpRect = null;
    android.graphics.Paint mRoundedViewportPaint;
    int mSubLayer;
    int mRequestedSubLayer;
    boolean mIsCreating;
    boolean mRequestedVisible;
    boolean mWindowVisibility;
    boolean mLastWindowVisibility;
    boolean mViewVisibility;
    boolean mWindowStopped;
    int mRequestedWidth;
    int mRequestedHeight;
    int mRequestedFormat;
    float mAlpha;
    boolean mClipSurfaceToBounds;
    int mBackgroundColor;
    boolean mHaveFrame;
    boolean mSurfaceCreated;
    long mLastLockTime;
    boolean mVisible;
    int mWindowSpaceLeft;
    int mWindowSpaceTop;
    int mSurfaceWidth;
    int mSurfaceHeight;
    float mCornerRadius;
    int mFormat;
    final android.graphics.Rect mSurfaceFrame = null;
    int mLastSurfaceWidth;
    int mLastSurfaceHeight;
    int mTransformHint;
    android.view.SurfaceControlViewHost.SurfacePackage mSurfacePackage;
    public SurfaceView(android.content.Context p0) { super((android.content.Context)null); }
    public SurfaceView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public SurfaceView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public SurfaceView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public SurfaceView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3, boolean p4) { super((android.content.Context)null); }
    public android.view.SurfaceHolder getHolder() { return null; }
    protected void onAttachedToWindow() {}
    protected void onWindowVisibilityChanged(int p0) {}
    public void setVisibility(int p0) {}
    public void setUseAlpha() {}
    public void setAlpha(float p0) {}
    protected boolean onSetAlpha(int p0) { return false; }
    protected void onDetachedFromWindow() {}
    protected void onMeasure(int p0, int p1) {}
    protected boolean setFrame(int p0, int p1, int p2, int p3) { return false; }
    public boolean gatherTransparentRegion(android.graphics.Region p0) { return false; }
    public void draw(android.graphics.Canvas p0) {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    public void setEnableSurfaceClipping(boolean p0) {}
    public void setClipBounds(android.graphics.Rect p0) {}
    public boolean hasOverlappingRendering() { return false; }
    public void setCornerRadius(float p0) {}
    public float getCornerRadius() { return 0.0f; }
    @android.annotation.FlaggedApi("android.view.flags.surface_view_set_composition_order")
    public void setCompositionOrder(int p0) {}
    @android.annotation.FlaggedApi("android.view.flags.surface_view_set_composition_order")
    public int getCompositionOrder() { return 0; }
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("android.view.flags.deprecate_surface_view_z_order_apis")
    public void setZOrderMediaOverlay(boolean p0) {}
    @java.lang.Deprecated
    @android.annotation.FlaggedApi("android.view.flags.deprecate_surface_view_z_order_apis")
    public void setZOrderOnTop(boolean p0) {}
    public boolean isZOrderedOnTop() { return false; }
    @java.lang.Deprecated
    public boolean setZOrderedOnTop(boolean p0, boolean p1) { return false; }
    public void setSecure(boolean p0) {}
    public void setSurfaceLifecycle(int p0) {}
    public void setDesiredHdrHeadroom(float p0) {}
    protected void updateSurface() {}
    public java.lang.String getName() { return null; }
    public void vriDrawStarted(boolean p0) {}
    protected void onSetSurfacePositionAndScale(android.view.SurfaceControl.Transaction p0, android.view.SurfaceControl p1, int p2, int p3, float p4, float p5) {}
    public void requestUpdateSurfacePositionAndScale() {}
    @android.annotation.NonNull
    public android.graphics.Rect getSurfaceRenderPosition() { return null; }
    public boolean isFixedSize() { return false; }
    public void setResizeBackgroundColor(int p0) {}
    public void setResizeBackgroundColor(android.view.SurfaceControl.Transaction p0, int p1) {}
    public android.view.SurfaceControl getSurfaceControl() { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public android.os.IBinder getHostToken() { return null; }
    public void surfaceCreated(android.view.SurfaceControl.Transaction p0) {}
    public void surfaceDestroyed() {}
    public void surfaceReplaced(android.view.SurfaceControl.Transaction p0) {}
    public void setChildSurfacePackage(android.view.SurfaceControlViewHost.SurfacePackage p0) {}
    @android.annotation.SuppressLint("GetterSetterNullability")
    @android.annotation.FlaggedApi("android.view.flags.surface_view_get_surface_package")
    @android.annotation.Nullable
    public android.view.SurfaceControlViewHost.SurfacePackage getChildSurfacePackage() { return null; }
    @android.annotation.FlaggedApi("android.view.flags.surface_view_get_surface_package")
    public void clearChildSurfacePackage() {}
    protected void onProvideStructure(android.view.ViewStructure p0, int p1, int p2) {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public int getImportantForAccessibility() { return 0; }
    void updateEmbeddedAccessibilityMatrix(boolean p0) {}
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    public void syncNextFrame(java.util.function.Consumer<android.view.SurfaceControl.Transaction> p0) {}
    public void applyTransactionToFrame(android.view.SurfaceControl.Transaction p0) {}
    void performCollectViewAttributes(android.view.View.AttachInfo p0, int p1) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }

    private static class SurfaceControlViewHostParent extends android.view.ISurfaceControlViewHostParent.Stub {
        void attach(android.view.SurfaceView p0) {}
        void detach() {}
        public void updateParams(android.view.WindowManager.LayoutParams[] p0) {}
        public void forwardBackKeyToParent(android.view.KeyEvent p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SurfaceLifecycleStrategy {
    }

    private class SurfaceViewPositionUpdateListener implements android.graphics.RenderNode.PositionUpdateListener {
        SurfaceViewPositionUpdateListener(android.view.SurfaceView p0, int p1, int p2) {}
        public void positionChanged(long p0, int p1, int p2, int p3, int p4) {}
        public void positionChanged(long p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10) {}
        public void applyStretch(long p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10) {}
        public void positionLost(long p0) {}
    }

    private static class SyncBufferTransactionCallback {
        android.view.SurfaceControl.Transaction waitForTransaction() { return null; }
        void onTransactionReady(android.view.SurfaceControl.Transaction p0) {}
    }
}
