package android.view;

public class SurfaceView extends android.view.View implements android.view.ViewRootImpl.SurfaceChangedCallback {
    private static final java.lang.String TAG = "SurfaceView";
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_POSITION = false;
    final java.util.ArrayList<android.view.SurfaceHolder.Callback> mCallbacks = null;
    final int[] mLocation = null;
    final java.util.concurrent.locks.ReentrantLock mSurfaceLock = null;
    final android.view.Surface mSurface = null;
    boolean mDrawingStopped;
    boolean mDrawFinished;
    final android.graphics.Rect mScreenRect = null;
    private final android.view.SurfaceSession mSurfaceSession = null;
    android.view.SurfaceControl mSurfaceControl;
    android.view.SurfaceControl mDeferredDestroySurfaceControl;
    android.view.SurfaceControl mBackgroundControl;
    private boolean mDisableBackgroundLayer;
    final java.lang.Object mSurfaceControlLock = null;
    final android.graphics.Rect mTmpRect = null;
    android.graphics.Paint mRoundedViewportPaint;
    int mSubLayer;
    boolean mIsCreating;
    private volatile boolean mRtHandlingPositionUpdates;
    private volatile boolean mRtReleaseSurfaces;
    private final android.view.ViewTreeObserver.OnScrollChangedListener mScrollChangedListener = null;
    private final android.view.ViewTreeObserver.OnPreDrawListener mDrawListener = null;
    boolean mRequestedVisible;
    boolean mWindowVisibility;
    boolean mLastWindowVisibility;
    boolean mViewVisibility;
    boolean mWindowStopped;
    int mRequestedWidth;
    int mRequestedHeight;
    int mRequestedFormat;
    boolean mUseAlpha;
    float mSurfaceAlpha;
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
    private boolean mGlobalListenersAdded;
    private boolean mAttachedToWindow;
    private int mSurfaceFlags;
    private int mPendingReportDraws;
    private final android.view.SurfaceControl.Transaction mRtTransaction = null;
    private final android.view.SurfaceControl.Transaction mFrameCallbackTransaction = null;
    private final android.view.SurfaceControl.Transaction mTmpTransaction = null;
    private int mParentSurfaceSequenceId;
    private android.view.RemoteAccessibilityController mRemoteAccessibilityController;
    private final android.graphics.Matrix mTmpMatrix = null;
    android.view.SurfaceControlViewHost.SurfacePackage mSurfacePackage;
    private final boolean mUseBlastSync = false;
    private final boolean mUseBlastAdapter = false;
    private android.view.SurfaceControl mBlastSurfaceControl;
    private android.graphics.BLASTBufferQueue mBlastBufferQueue;
    private android.graphics.Rect mRTLastReportedPosition;
    private android.graphics.Point mRTLastReportedSurfaceSize;
    private android.view.SurfaceView.SurfaceViewPositionUpdateListener mPositionListener;
    private final android.view.SurfaceHolder mSurfaceHolder = null;
    private static boolean useBlastAdapter(android.content.Context p0) { return false; }
    public SurfaceView(android.content.Context p0) { super((android.content.Context)null); }
    public SurfaceView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public SurfaceView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public SurfaceView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public SurfaceView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3, boolean p4) { super((android.content.Context)null); }
    public android.view.SurfaceHolder getHolder() { return null; }
    private void updateRequestedVisibility() {}
    private void setWindowStopped(boolean p0) {}
    protected void onAttachedToWindow() {}
    protected void onWindowVisibilityChanged(int p0) {}
    public void setVisibility(int p0) {}
    public void setUseAlpha() {}
    public void setAlpha(float p0) {}
    private float getFixedAlpha() { return 0.0f; }
    private void updateSurfaceAlpha() {}
    private void performDrawFinished() {}
    void notifyDrawFinished() {}
    protected void onDetachedFromWindow() {}
    protected void onMeasure(int p0, int p1) {}
    protected boolean setFrame(int p0, int p1, int p2, int p3) { return false; }
    public boolean gatherTransparentRegion(android.graphics.Region p0) { return false; }
    public void draw(android.graphics.Canvas p0) {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    public void setEnableSurfaceClipping(boolean p0) {}
    public void setClipBounds(android.graphics.Rect p0) {}
    private void clearSurfaceViewPort(android.graphics.Canvas p0) {}
    public void setCornerRadius(float p0) {}
    public float getCornerRadius() { return 0.0f; }
    public void setZOrderMediaOverlay(boolean p0) {}
    public void setZOrderOnTop(boolean p0) {}
    public boolean isZOrderedOnTop() { return false; }
    public boolean setZOrderedOnTop(boolean p0, boolean p1) { return false; }
    public void setSecure(boolean p0) {}
    private void updateOpaqueFlag() {}
    private void updateBackgroundVisibility(android.view.SurfaceControl.Transaction p0) {}
    private android.view.SurfaceControl.Transaction updateBackgroundColor(android.view.SurfaceControl.Transaction p0) { return null; }
    private void tryReleaseSurfaces() {}
    private void releaseSurfaces(android.view.SurfaceControl.Transaction p0) {}
    private void replacePositionUpdateListener(int p0, int p1, android.view.SurfaceControl.Transaction p2) {}
    private boolean performSurfaceTransaction(android.view.ViewRootImpl p0, android.content.res.CompatibilityInfo.Translator p1, boolean p2, boolean p3, boolean p4) { return false; }
    protected void updateSurface() {}
    private void copySurface(boolean p0, boolean p1) {}
    private void setBufferSize(android.view.SurfaceControl.Transaction p0) {}
    private android.view.SurfaceControl createSurfaceControls(android.view.ViewRootImpl p0, java.lang.String p1) { return null; }
    private android.view.SurfaceControl createBackgroundControl(java.lang.String p0) { return null; }
    private void createBlastSurfaceControls(android.view.ViewRootImpl p0, java.lang.String p1) {}
    private void onDrawFinished() {}
    protected void applyChildSurfaceTransaction_renderWorker(android.view.SurfaceControl.Transaction p0, android.view.Surface p1, long p2) {}
    protected void onSetSurfacePositionAndScaleRT(android.view.SurfaceControl.Transaction p0, android.view.SurfaceControl p1, int p2, int p3, float p4, float p5) {}
    public void requestUpdateSurfacePositionAndScale() {}
    public android.graphics.Rect getSurfaceRenderPosition() { return null; }
    private void applyOrMergeTransaction(android.view.SurfaceControl.Transaction p0, long p1) {}
    private android.view.SurfaceHolder.Callback[] getSurfaceCallbacks() { return null; }
    private void runOnUiThread(java.lang.Runnable p0) {}
    public boolean isFixedSize() { return false; }
    private boolean isAboveParent() { return false; }
    public void setResizeBackgroundColor(int p0) {}
    public android.view.SurfaceControl getSurfaceControl() { return null; }
    public android.os.IBinder getHostToken() { return null; }
    public void surfaceCreated(android.view.SurfaceControl.Transaction p0) {}
    public void surfaceDestroyed() {}
    public void surfaceReplaced(android.view.SurfaceControl.Transaction p0) {}
    private void updateRelativeZ(android.view.SurfaceControl.Transaction p0) {}
    public void setChildSurfacePackage(android.view.SurfaceControlViewHost.SurfacePackage p0) {}
    private void reparentSurfacePackage(android.view.SurfaceControl.Transaction p0, android.view.SurfaceControlViewHost.SurfacePackage p1) {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public int getImportantForAccessibility() { return 0; }
    private void initEmbeddedHierarchyForAccessibility(android.view.SurfaceControlViewHost.SurfacePackage p0) {}
    private void notifySurfaceDestroyed() {}
    void updateEmbeddedAccessibilityMatrix() {}
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    private boolean useBLASTSync(android.view.ViewRootImpl p0) { return false; }

    private class SurfaceViewPositionUpdateListener implements android.graphics.RenderNode.PositionUpdateListener {
        int mRtSurfaceWidth;
        int mRtSurfaceHeight;
        private final android.view.SurfaceControl.Transaction mPositionChangedTransaction = null;
        boolean mPendingTransaction;
        SurfaceViewPositionUpdateListener(android.view.SurfaceView p0, int p1, int p2, android.view.SurfaceControl.Transaction p3) {}
        public void positionChanged(long p0, int p1, int p2, int p3, int p4) {}
        public void applyStretch(long p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10) {}
        public void positionLost(long p0) {}
    }
}
