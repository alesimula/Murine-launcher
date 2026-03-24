package android.view;

public class SurfaceView extends android.view.View implements android.view.ViewRootImpl.WindowStoppedCallback {
    private static final java.lang.String TAG = "SurfaceView";
    private static final boolean DEBUG = false;
    @android.annotation.UnsupportedAppUsage
    final java.util.ArrayList<android.view.SurfaceHolder.Callback> mCallbacks = null;
    final int[] mLocation = null;
    @android.annotation.UnsupportedAppUsage
    final java.util.concurrent.locks.ReentrantLock mSurfaceLock = null;
    @android.annotation.UnsupportedAppUsage
    final android.view.Surface mSurface = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    boolean mDrawingStopped;
    boolean mDrawFinished;
    final android.graphics.Rect mScreenRect = null;
    android.view.SurfaceSession mSurfaceSession;
    android.view.SurfaceControl mSurfaceControl;
    android.view.SurfaceControl mDeferredDestroySurfaceControl;
    android.view.SurfaceControl mBackgroundControl;
    final android.graphics.Rect mTmpRect = null;
    final android.content.res.Configuration mConfiguration = null;
    android.graphics.Paint mRoundedViewportPaint;
    int mSubLayer;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    boolean mIsCreating;
    private volatile boolean mRtHandlingPositionUpdates;
    private final android.view.ViewTreeObserver.OnScrollChangedListener mScrollChangedListener = null;
    @android.annotation.UnsupportedAppUsage
    private final android.view.ViewTreeObserver.OnPreDrawListener mDrawListener = null;
    boolean mRequestedVisible;
    boolean mWindowVisibility;
    boolean mLastWindowVisibility;
    boolean mViewVisibility;
    boolean mWindowStopped;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    int mRequestedWidth;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    int mRequestedHeight;
    @android.annotation.UnsupportedAppUsage
    int mRequestedFormat;
    @android.annotation.UnsupportedAppUsage
    boolean mHaveFrame;
    boolean mSurfaceCreated;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    long mLastLockTime;
    boolean mVisible;
    int mWindowSpaceLeft;
    int mWindowSpaceTop;
    int mSurfaceWidth;
    int mSurfaceHeight;
    float mCornerRadius;
    @android.annotation.UnsupportedAppUsage
    int mFormat;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    final android.graphics.Rect mSurfaceFrame = null;
    int mLastSurfaceWidth;
    int mLastSurfaceHeight;
    private android.content.res.CompatibilityInfo.Translator mTranslator;
    private boolean mGlobalListenersAdded;
    private boolean mAttachedToWindow;
    private int mSurfaceFlags;
    private int mPendingReportDraws;
    private android.view.SurfaceControl.Transaction mRtTransaction;
    private android.graphics.Rect mRTLastReportedPosition;
    private android.graphics.RenderNode.PositionUpdateListener mPositionListener;
    @android.annotation.UnsupportedAppUsage
    private final android.view.SurfaceHolder mSurfaceHolder = null;
    public SurfaceView(android.content.Context p0) { super((android.content.Context)null); }
    public SurfaceView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public SurfaceView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public SurfaceView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public android.view.SurfaceHolder getHolder() { return null; }
    private void updateRequestedVisibility() {}
    public void windowStopped(boolean p0) {}
    protected void onAttachedToWindow() {}
    protected void onWindowVisibilityChanged(int p0) {}
    public void setVisibility(int p0) {}
    private void performDrawFinished() {}
    void notifyDrawFinished() {}
    protected void onDetachedFromWindow() {}
    protected void onMeasure(int p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    protected boolean setFrame(int p0, int p1, int p2, int p3) { return false; }
    public boolean gatherTransparentRegion(android.graphics.Region p0) { return false; }
    public void draw(android.graphics.Canvas p0) {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    private void clearSurfaceViewPort(android.graphics.Canvas p0) {}
    public void setCornerRadius(float p0) {}
    public void setZOrderMediaOverlay(boolean p0) {}
    public void setZOrderOnTop(boolean p0) {}
    public void setSecure(boolean p0) {}
    private void updateOpaqueFlag() {}
    private android.graphics.Rect getParentSurfaceInsets() { return null; }
    private void updateBackgroundVisibilityInTransaction(android.view.SurfaceControl p0) {}
    private void releaseSurfaces() {}
    protected void updateSurface() {}
    private void onDrawFinished() {}
    protected void applyChildSurfaceTransaction_renderWorker(android.view.SurfaceControl.Transaction p0, android.view.Surface p1, long p2) {}
    private void applySurfaceTransforms(android.view.SurfaceControl p0, android.graphics.Rect p1, long p2) {}
    private void setParentSpaceRectangle(android.graphics.Rect p0, long p1) {}
    private android.view.SurfaceHolder.Callback[] getSurfaceCallbacks() { return null; }
    private void runOnUiThread(java.lang.Runnable p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isFixedSize() { return false; }
    private boolean isAboveParent() { return false; }
    public void setResizeBackgroundColor(int p0) {}
    public android.view.SurfaceControl getSurfaceControl() { return null; }
}
