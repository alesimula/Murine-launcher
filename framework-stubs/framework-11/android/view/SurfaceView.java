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
    private boolean mGlobalListenersAdded;
    private boolean mAttachedToWindow;
    private int mSurfaceFlags;
    private int mPendingReportDraws;
    private android.view.SurfaceControl.Transaction mRtTransaction;
    private android.view.SurfaceControl.Transaction mTmpTransaction;
    private int mParentSurfaceGenerationId;
    private android.view.SurfaceView.RemoteAccessibilityEmbeddedConnection mRemoteAccessibilityEmbeddedConnection;
    private final android.graphics.Matrix mScreenMatrixForEmbeddedHierarchy = null;
    private final android.graphics.Matrix mTmpMatrix = null;
    private final float[] mMatrixValues = null;
    android.view.SurfaceControlViewHost.SurfacePackage mSurfacePackage;
    private android.graphics.Rect mRTLastReportedPosition;
    private android.graphics.RenderNode.PositionUpdateListener mPositionListener;
    private final android.view.SurfaceHolder mSurfaceHolder = null;
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
    private void releaseSurfaces() {}
    protected void updateSurface() {}
    private void onDrawFinished() {}
    protected void applyChildSurfaceTransaction_renderWorker(android.view.SurfaceControl.Transaction p0, android.view.Surface p1, long p2) {}
    protected void onSetSurfacePositionAndScaleRT(android.view.SurfaceControl.Transaction p0, android.view.SurfaceControl p1, int p2, int p3, float p4, float p5) {}
    public void requestUpdateSurfacePositionAndScale() {}
    private void applySurfaceTransforms(android.view.SurfaceControl p0, android.view.SurfaceControl.Transaction p1, android.graphics.Rect p2, long p3) {}
    public android.graphics.Rect getSurfaceRenderPosition() { return null; }
    private void setParentSpaceRectangle(android.graphics.Rect p0, long p1) {}
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
    private void setRemoteAccessibilityEmbeddedConnection(android.view.accessibility.IAccessibilityEmbeddedConnection p0, android.os.IBinder p1) {}
    private android.view.SurfaceView.RemoteAccessibilityEmbeddedConnection getRemoteAccessibilityEmbeddedConnection() { return null; }
    private void updateScreenMatrixForEmbeddedHierarchy() {}
    private void notifySurfaceDestroyed() {}

    private final class RemoteAccessibilityEmbeddedConnection implements android.os.IBinder.DeathRecipient {
        private final android.view.accessibility.IAccessibilityEmbeddedConnection mConnection = null;
        private final android.os.IBinder mLeashToken = null;
        RemoteAccessibilityEmbeddedConnection(android.view.SurfaceView p0, android.view.accessibility.IAccessibilityEmbeddedConnection p1, android.os.IBinder p2) {}
        android.view.accessibility.IAccessibilityEmbeddedConnection getConnection() { return null; }
        android.os.IBinder getLeashToken() { return null; }
        void linkToDeath() throws android.os.RemoteException {}
        void unlinkToDeath() {}
        public void binderDied() {}
    }
}
