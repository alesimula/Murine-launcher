package android.view;

public final class ViewRootImpl implements android.view.ViewParent, android.view.View.AttachInfo.Callbacks, android.view.ThreadedRenderer.DrawCallbacks, android.view.AttachedSurfaceControl {
    public static final boolean CAPTION_ON_SHELL = Boolean.valueOf(false);
    public static final boolean CLIENT_TRANSIENT = Boolean.valueOf(false);
    public static final boolean LOCAL_LAYOUT = Boolean.valueOf(false);
    static final int MAX_TRACKBALL_DELAY = 250;
    static final java.lang.ThreadLocal<android.view.HandlerActionQueue> sRunQueues = null;
    static final java.util.ArrayList<java.lang.Runnable> sFirstDrawHandlers = null;
    static boolean sFirstDrawComplete;
    final java.util.ArrayList<android.view.WindowCallbacks> mWindowCallbacks = null;
    public final android.content.Context mContext = null;
    final android.view.IWindowSession mWindowSession = null;
    android.view.Display mDisplay;
    final java.lang.String mBasePackageName = null;
    final int[] mTmpLocation = null;
    final android.util.TypedValue mTmpValue = null;
    final java.lang.Thread mThread = null;
    final android.view.WindowLeaked mLocation = null;
    public final android.view.WindowManager.LayoutParams mWindowAttributes = null;
    final android.view.ViewRootImpl.W mWindow = null;
    final android.os.IBinder mLeashToken = null;
    final int mTargetSdkVersion = 0;
    android.view.View mView;
    android.view.View mAccessibilityFocusedHost;
    android.view.accessibility.AccessibilityNodeInfo mAccessibilityFocusedVirtualView;
    boolean mPointerCapture;
    int mViewVisibility;
    boolean mAppVisible;
    int mOrigWindowType;
    boolean mStopped;
    boolean mIsAmbientMode;
    boolean mPausedForTransition;
    boolean mLastInCompatMode;
    android.view.SurfaceHolder.Callback2 mSurfaceHolderCallback;
    com.android.internal.view.BaseSurfaceHolder mSurfaceHolder;
    boolean mIsCreating;
    boolean mDrawingAllowed;
    final android.graphics.Region mTransparentRegion = null;
    final android.graphics.Region mPreviousTransparentRegion = null;
    android.graphics.Region mTouchableRegion;
    android.graphics.Region mPreviousTouchableRegion;
    int mWidth;
    int mHeight;
    public boolean mIsAnimating;
    android.content.res.CompatibilityInfo.Translator mTranslator;
    final android.view.View.AttachInfo mAttachInfo = null;
    final android.view.ViewRootImpl.SystemUiVisibilityInfo mCompatibleVisibilityInfo = null;
    int mDispatchedSystemUiVisibility;
    int mDispatchedSystemBarAppearance;
    android.view.InputQueue.Callback mInputQueueCallback;
    android.view.InputQueue mInputQueue;
    android.view.FallbackEventHandler mFallbackEventHandler;
    final android.view.Choreographer mChoreographer = null;
    protected final android.view.ViewFrameInfo mViewFrameInfo = null;
    boolean mDisplayDecorationCached;
    boolean mWindowFocusChanged;
    boolean mUpcomingWindowFocus;
    boolean mUpcomingInTouchMode;
    public boolean mTraversalScheduled;
    int mTraversalBarrier;
    boolean mWillDrawSoon;
    boolean mIsInTraversal;
    boolean mApplyInsetsRequested;
    boolean mLayoutRequested;
    boolean mFirst;
    int mContentCaptureEnabled;
    boolean mPerformContentCapture;
    boolean mReportNextDraw;
    java.lang.String mLastReportNextDrawReason;
    java.lang.String mLastPerformDrawSkippedReason;
    java.lang.String mLastPerformTraversalsSkipDrawReason;
    int mWmsRequestSyncGroupState;
    int mSyncSeqId;
    int mLastSyncSeqId;
    boolean mFullRedrawNeeded;
    boolean mNewSurfaceNeeded;
    boolean mForceNextWindowRelayout;
    java.util.concurrent.CountDownLatch mWindowDrawCountDown;
    boolean mHasPendingTransactions;
    boolean mIsDrawing;
    int mLastSystemUiVisibility;
    int mClientWindowLayoutFlags;
    android.view.ViewRootImpl.QueuedInputEvent mPendingInputEventHead;
    android.view.ViewRootImpl.QueuedInputEvent mPendingInputEventTail;
    int mPendingInputEventCount;
    boolean mProcessInputEventsScheduled;
    boolean mUnbufferedInputDispatch;
    int mUnbufferedInputSource;
    java.lang.String mPendingInputEventQueueLengthCounterName;
    android.view.ViewRootImpl.InputStage mFirstInputStage;
    android.view.ViewRootImpl.InputStage mFirstPostImeInputStage;
    android.view.ViewRootImpl.InputStage mSyntheticInputStage;
    boolean mWindowAttributesChanged;
    public final android.view.Surface mSurface = null;
    boolean mAdded;
    boolean mAddedTouchMode;
    final android.graphics.Rect mWinFrame = null;
    android.graphics.Rect mOverrideInsetsFrame;
    final android.graphics.Rect mPendingBackDropFrame = null;
    boolean mPendingAlwaysConsumeSystemBars;
    final android.view.ViewTreeObserver.InternalInsetsInfo mLastGivenInsets = null;
    boolean mScrollMayChange;
    int mSoftInputMode;
    java.lang.ref.WeakReference<android.view.View> mLastScrolledFocus;
    int mScrollY;
    int mCurScrollY;
    android.widget.Scroller mScroller;
    static final android.view.animation.Interpolator mResizeInterpolator = null;
    final android.view.ViewConfiguration mViewConfiguration = null;
    android.content.ClipDescription mDragDescription;
    android.view.View mCurrentDragView;
    android.view.View mStartedDragViewForA11y;
    volatile java.lang.Object mLocalDragState;
    final android.graphics.PointF mDragPoint = null;
    final android.graphics.PointF mLastTouchPoint = null;
    int mLastTouchSource;
    android.media.AudioManager mAudioManager;
    final android.view.accessibility.AccessibilityManager mAccessibilityManager = null;
    android.view.AccessibilityInteractionController mAccessibilityInteractionController;
    final android.view.ViewRootImpl.AccessibilityInteractionConnectionManager mAccessibilityInteractionConnectionManager = null;
    final android.view.ViewRootImpl.HighContrastTextManager mHighContrastTextManager = null;
    android.view.ViewRootImpl.SendWindowContentChangedAccessibilityEvent mSendWindowContentChangedAccessibilityEvent;
    java.util.HashSet<android.view.View> mTempHashSet;
    java.util.ArrayList<android.view.View> mLayoutRequesters;
    boolean mHandlingLayoutInLayoutRequest;
    protected final android.view.InputEventConsistencyVerifier mInputEventConsistencyVerifier = null;
    static android.graphics.BLASTBufferQueue.TransactionHangCallback sTransactionHangCallback;
    int mHardwareXOffset;
    int mHardwareYOffset;
    final android.view.ViewRootImpl.ViewRootHandler mHandler = null;
    final android.view.ViewRootImpl.TraversalRunnable mTraversalRunnable = null;
    android.graphics.HardwareRendererObserver mHardwareRendererObserver;
    final android.view.ViewRootImpl.ConsumeBatchedInputRunnable mConsumedBatchedInputRunnable = null;
    boolean mConsumeBatchedInputScheduled;
    final android.view.ViewRootImpl.ConsumeBatchedInputImmediatelyRunnable mConsumeBatchedInputImmediatelyRunnable = null;
    boolean mConsumeBatchedInputImmediatelyScheduled;
    final android.view.ViewRootImpl.InvalidateOnAnimationRunnable mInvalidateOnAnimationRunnable = null;
    protected android.graphics.FrameInfo getUpdatedFrameInfo() { return null; }
    public android.view.ImeFocusController getImeFocusController() { return null; }
    public android.view.HandwritingInitiator getHandwritingInitiator() { return null; }
    public ViewRootImpl(android.content.Context p0, android.view.Display p1) {}
    public ViewRootImpl(android.content.Context p0, android.view.Display p1, android.view.IWindowSession p2, android.view.WindowLayout p3) {}
    public static void addFirstDrawHandler(java.lang.Runnable p0) {}
    public static void addConfigCallback(android.view.ViewRootImpl.ConfigChangedCallback p0) {}
    public static void removeConfigCallback(android.view.ViewRootImpl.ConfigChangedCallback p0) {}
    public void setActivityConfigCallback(android.view.ViewRootImpl.ActivityConfigCallback p0) {}
    public void setOnContentApplyWindowInsetsListener(android.view.Window.OnContentApplyWindowInsetsListener p0) {}
    public void addWindowCallbacks(android.view.WindowCallbacks p0) {}
    public void removeWindowCallbacks(android.view.WindowCallbacks p0) {}
    public void reportDrawFinish() {}
    public void profile() {}
    public void notifyChildRebuilt() {}
    public void setView(android.view.View p0, android.view.WindowManager.LayoutParams p1, android.view.View p2) {}
    public void setView(android.view.View p0, android.view.WindowManager.LayoutParams p1, android.view.View p2, int p3) {}
    public int getWindowFlags() { return 0; }
    public int getDisplayId() { return 0; }
    public java.lang.CharSequence getTitle() { return null; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    void destroyHardwareResources() {}
    public void detachFunctor(long p0) {}
    public static void invokeFunctor(long p0, boolean p1) {}
    public void registerAnimatingRenderNode(android.graphics.RenderNode p0) {}
    public void registerVectorDrawableAnimator(android.view.NativeVectorDrawableAnimator p0) {}
    public void registerRtFrameCallback(android.graphics.HardwareRenderer.FrameDrawingCallback p0) {}
    public android.view.View getView() { return null; }
    final android.view.WindowLeaked getLocation() { return null; }
    public void setLayoutParams(android.view.WindowManager.LayoutParams p0, boolean p1) {}
    void handleAppVisibility(boolean p0) {}
    void handleGetNewSurface() {}
    public void onMovedToDisplay(int p0, android.content.res.Configuration p1) {}
    void pokeDrawLockIfNeeded() {}
    public void requestFitSystemWindows() {}
    void notifyInsetsChanged() {}
    public void requestLayout() {}
    public boolean isLayoutRequested() { return false; }
    public void onDescendantInvalidated(android.view.View p0, android.view.View p1) {}
    void invalidate() {}
    void invalidateWorld(android.view.View p0) {}
    public void invalidateChild(android.view.View p0, android.graphics.Rect p1) {}
    public android.view.ViewParent invalidateChildInParent(int[] p0, android.graphics.Rect p1) { return null; }
    public void setIsAmbientMode(boolean p0) {}
    void setWindowStopped(boolean p0) {}
    public void addSurfaceChangedCallback(android.view.ViewRootImpl.SurfaceChangedCallback p0) {}
    public void removeSurfaceChangedCallback(android.view.ViewRootImpl.SurfaceChangedCallback p0) {}
    public android.view.SurfaceControl getBoundsLayer() { return null; }
    void updateBlastSurfaceIfNeeded() {}
    public void setPausedForTransition(boolean p0) {}
    public android.view.ViewParent getParent() { return null; }
    public boolean getChildVisibleRect(android.view.View p0, android.graphics.Rect p1, android.graphics.Point p2) { return false; }
    public void bringChildToFront(android.view.View p0) {}
    int getHostVisibility() { return 0; }
    public void requestTransitionStart(android.animation.LayoutTransition p0) {}
    void notifyRendererOfFramePending() {}
    public void notifyRendererOfExpensiveFrame() {}
    void scheduleTraversals() {}
    void unscheduleTraversals() {}
    void doTraversal() {}
    void updateCompatSysUiVisibility(int p0, int p1, int p2) {}
    public static void adjustLayoutParamsForCompatibility(android.view.WindowManager.LayoutParams p0) {}
    void transformMatrixToGlobal(android.graphics.Matrix p0) {}
    void transformMatrixToLocal(android.graphics.Matrix p0) {}
    android.view.WindowInsets getWindowInsets(boolean p0) { return null; }
    public void dispatchApplyInsets(android.view.View p0) {}
    public android.view.InsetsController getInsetsController() { return null; }
    int dipToPx(int p0) { return 0; }
    public void dispatchCompatFakeFocus() {}
    boolean isInLayout() { return false; }
    boolean requestLayoutDuringLayout(android.view.View p0) { return false; }
    public void requestTransparentRegion(android.view.View p0) {}
    public void onPreDraw(android.graphics.RecordingCanvas p0) {}
    public void onPostDraw(android.graphics.RecordingCanvas p0) {}
    void outputDisplayList(android.view.View p0) {}
    public boolean isHardwareEnabled() { return false; }
    public boolean isInWMSRequestedSync() { return false; }
    void updateSystemGestureExclusionRectsForView(android.view.View p0) {}
    void systemGestureExclusionChanged() {}
    public void setRootSystemGestureExclusionRects(java.util.List<android.graphics.Rect> p0) {}
    public java.util.List<android.graphics.Rect> getRootSystemGestureExclusionRects() { return null; }
    void updateKeepClearRectsForView(android.view.View p0) {}
    void keepClearRectsChanged(boolean p0) {}
    void reportKeepClearAreasChanged() {}
    public void requestInvalidateRootRenderNode() {}
    boolean scrollToRectOrFocus(android.graphics.Rect p0, boolean p1) { return false; }
    public android.view.View getAccessibilityFocusedHost() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getAccessibilityFocusedVirtualView() { return null; }
    void setAccessibilityFocus(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
    boolean hasPointerCapture() { return false; }
    void requestPointerCapture(boolean p0) {}
    public void requestChildFocus(android.view.View p0, android.view.View p1) {}
    public void clearChildFocus(android.view.View p0) {}
    public android.view.ViewParent getParentForAccessibility() { return null; }
    public void focusableViewAvailable(android.view.View p0) {}
    public void recomputeViewAttributes(android.view.View p0) {}
    void dispatchDetachedFromWindow() {}
    public void updateConfiguration(int p0) {}
    public static boolean isViewDescendantOf(android.view.View p0, android.view.View p1) { return false; }
    boolean ensureTouchMode(boolean p0) { return false; }
    void setLocalDragState(java.lang.Object p0) {}
    public void onWindowTitleChanged() {}
    public void handleDispatchWindowShown() {}
    public void handleRequestKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) {}
    public void getLastTouchPoint(android.graphics.Point p0) {}
    public int getLastTouchSource() { return 0; }
    public int getLastClickToolType() { return 0; }
    public void setDragFocus(android.view.View p0, android.view.DragEvent p1) {}
    void setDragStartedViewForAccessibility(android.view.View p0) {}
    public android.view.AccessibilityInteractionController getAccessibilityInteractionController() { return null; }
    void setOverrideInsetsFrame(android.graphics.Rect p0) {}
    void getDisplayFrame(android.graphics.Rect p0) {}
    void getWindowVisibleDisplayFrame(android.graphics.Rect p0) {}
    void applyViewBoundsSandboxingIfNeeded(android.graphics.Rect p0) {}
    public void applyViewLocationSandboxingIfNeeded(int[] p0) {}
    public void playSoundEffect(int p0) {}
    public boolean performHapticFeedback(int p0, boolean p1) { return false; }
    public android.view.View focusSearch(android.view.View p0, int p1) { return null; }
    public android.view.View keyboardNavigationClusterSearch(android.view.View p0, int p1) { return null; }
    public void debug() {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    android.view.ViewRootImpl.GfxInfo getGfxInfo() { return null; }
    boolean die(boolean p0) { return false; }
    void doDie() {}
    public void requestUpdateConfiguration(android.content.res.Configuration p0) {}
    public void loadSystemProperties() {}
    public void dispatchMoved(int p0, int p1) {}
    public void enqueueInputEvent(android.view.InputEvent p0) {}
    void enqueueInputEvent(android.view.InputEvent p0, android.view.InputEventReceiver p1, int p2, boolean p3) {}
    void doProcessInputEvents() {}
    static boolean isTerminalInputEvent(android.view.InputEvent p0) { return false; }
    void scheduleConsumeBatchedInput() {}
    void unscheduleConsumeBatchedInput() {}
    void scheduleConsumeBatchedInputImmediately() {}
    boolean doConsumeBatchedInput(long p0) { return false; }
    public void dispatchInvalidateDelayed(android.view.View p0, long p1) {}
    public void dispatchInvalidateRectDelayed(android.view.View.AttachInfo.InvalidateInfo p0, long p1) {}
    public void dispatchInvalidateOnAnimation(android.view.View p0) {}
    public void dispatchInvalidateRectOnAnimation(android.view.View.AttachInfo.InvalidateInfo p0) {}
    public void cancelInvalidate(android.view.View p0) {}
    public void dispatchInputEvent(android.view.InputEvent p0) {}
    public void dispatchInputEvent(android.view.InputEvent p0, android.view.InputEventReceiver p1) {}
    public void synthesizeInputEvent(android.view.InputEvent p0) {}
    public void dispatchKeyFromIme(android.view.KeyEvent p0) {}
    public void dispatchKeyFromAutofill(android.view.KeyEvent p0) {}
    public void dispatchUnhandledInputEvent(android.view.InputEvent p0) {}
    public void dispatchAppVisibility(boolean p0) {}
    public void dispatchGetNewSurface() {}
    public void windowFocusChanged(boolean p0) {}
    public void touchModeChanged(boolean p0) {}
    public void dispatchWindowShown() {}
    public void dispatchCloseSystemDialogs(java.lang.String p0) {}
    public void dispatchDragEvent(android.view.DragEvent p0) {}
    public void updatePointerIcon(float p0, float p1) {}
    public void dispatchCheckFocus() {}
    public void dispatchRequestKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) {}
    public int getDirectAccessibilityConnectionId() { return 0; }
    public boolean showContextMenuForChild(android.view.View p0) { return false; }
    public boolean showContextMenuForChild(android.view.View p0, float p1, float p2) { return false; }
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1) { return null; }
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1, int p2) { return null; }
    public void createContextMenu(android.view.ContextMenu p0) {}
    public void childDrawableStateChanged(android.view.View p0) {}
    public boolean requestSendAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) { return false; }
    public void notifySubtreeAccessibilityStateChanged(android.view.View p0, android.view.View p1, int p2) {}
    public boolean canResolveLayoutDirection() { return false; }
    public boolean isLayoutDirectionResolved() { return false; }
    public int getLayoutDirection() { return 0; }
    public boolean canResolveTextDirection() { return false; }
    public boolean isTextDirectionResolved() { return false; }
    public int getTextDirection() { return 0; }
    public boolean canResolveTextAlignment() { return false; }
    public boolean isTextAlignmentResolved() { return false; }
    public int getTextAlignment() { return 0; }
    void checkThread() {}
    public void requestDisallowInterceptTouchEvent(boolean p0) {}
    public boolean requestChildRectangleOnScreen(android.view.View p0, android.graphics.Rect p1, boolean p2) { return false; }
    public void childHasTransientStateChanged(android.view.View p0, boolean p1) {}
    public boolean onStartNestedScroll(android.view.View p0, android.view.View p1, int p2) { return false; }
    public void onStopNestedScroll(android.view.View p0) {}
    public void onNestedScrollAccepted(android.view.View p0, android.view.View p1, int p2) {}
    public void onNestedScroll(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public void onNestedPreScroll(android.view.View p0, int p1, int p2, int[] p3) {}
    public boolean onNestedFling(android.view.View p0, float p1, float p2, boolean p3) { return false; }
    public boolean onNestedPreFling(android.view.View p0, float p1, float p2) { return false; }
    public boolean onNestedPrePerformAccessibilityAction(android.view.View p0, int p1, android.os.Bundle p2) { return false; }
    public void addScrollCaptureCallback(android.view.ScrollCaptureCallback p0) {}
    public void removeScrollCaptureCallback(android.view.ScrollCaptureCallback p0) {}
    public void dispatchScrollCaptureRequest(android.view.IScrollCaptureResponseListener p0) {}
    public void setScrollCaptureRequestTimeout(int p0) {}
    public long getScrollCaptureRequestTimeout() { return 0L; }
    public void handleScrollCaptureRequest(android.view.IScrollCaptureResponseListener p0) {}
    public void setReportNextDraw(boolean p0, java.lang.String p1) {}
    void changeCanvasOpacity(boolean p0) {}
    public boolean dispatchUnhandledKeyEvent(android.view.KeyEvent p0) { return false; }
    static android.view.HandlerActionQueue getRunQueue() { return null; }
    public android.view.SurfaceControl getSurfaceControl() { return null; }
    public android.os.IBinder getInputToken() { return null; }
    public android.os.IBinder getWindowToken() { return null; }
    public android.view.accessibility.IAccessibilityEmbeddedConnection getAccessibilityEmbeddedConnection() { return null; }
    public void setDisplayDecoration(boolean p0) {}
    public void dispatchBlurRegions(float[][] p0, long p1) {}
    public com.android.internal.graphics.drawable.BackgroundBlurDrawable createBackgroundBlurDrawable() { return null; }
    public void onDescendantUnbufferedRequested() {}
    void forceDisableBLAST() {}
    boolean useBLAST() { return false; }
    int getSurfaceSequenceId() { return 0; }
    public void mergeWithNextTransaction(android.view.SurfaceControl.Transaction p0, long p1) {}
    public android.view.SurfaceControl.Transaction buildReparentTransaction(android.view.SurfaceControl p0) { return null; }
    public boolean applyTransactionOnDraw(android.view.SurfaceControl.Transaction p0) { return false; }
    public int getBufferTransformHint() { return 0; }
    public void addOnBufferTransformHintChangedListener(android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener p0) {}
    public void removeOnBufferTransformHintChangedListener(android.view.AttachedSurfaceControl.OnBufferTransformHintChangedListener p0) {}
    public void requestCompatCameraControl(boolean p0, boolean p1, android.app.ICompatCameraControlCallback p2) {}
    boolean wasRelayoutRequested() { return false; }
    void forceWmRelayout() {}
    public android.window.WindowOnBackInvokedDispatcher getOnBackInvokedDispatcher() { return null; }
    public android.window.OnBackInvokedDispatcher findOnBackInvokedDispatcherForChild(android.view.View p0, android.view.View p1) { return null; }
    public void setTouchableRegion(android.graphics.Region p0) {}
    android.view.IWindowSession getWindowSession() { return null; }
    public android.window.SurfaceSyncGroup getOrCreateSurfaceSyncGroup() { return null; }
    void addToSync(android.window.SurfaceSyncGroup p0) {}
    public void setChildBoundingInsets(android.graphics.Rect p0) {}

    static final class AccessibilityInteractionConnection extends android.view.accessibility.IAccessibilityInteractionConnection.Stub {
        AccessibilityInteractionConnection(android.view.ViewRootImpl p0) { super(); }
        public void findAccessibilityNodeInfoByAccessibilityId(long p0, android.graphics.Region p1, int p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3, int p4, int p5, long p6, android.view.MagnificationSpec p7, float[] p8, android.os.Bundle p9) {}
        public void performAccessibilityAction(long p0, int p1, android.os.Bundle p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7) {}
        public void findAccessibilityNodeInfosByViewId(long p0, java.lang.String p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8, float[] p9) {}
        public void findAccessibilityNodeInfosByText(long p0, java.lang.String p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8, float[] p9) {}
        public void findFocus(long p0, int p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8, float[] p9) {}
        public void focusSearch(long p0, int p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8, float[] p9) {}
        public void clearAccessibilityFocus() {}
        public void notifyOutsideTouch() {}
        public void takeScreenshotOfWindow(int p0, android.window.ScreenCapture.ScreenCaptureListener p1, android.view.accessibility.IAccessibilityInteractionConnectionCallback p2) {}
        public void attachAccessibilityOverlayToWindow(android.view.SurfaceControl p0) {}
    }

    final class AccessibilityInteractionConnectionManager implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener {
        AccessibilityInteractionConnectionManager(android.view.ViewRootImpl p0) {}
        public void onAccessibilityStateChanged(boolean p0) {}
        public void ensureConnection() {}
        public void ensureNoConnection() {}
        public int ensureDirectConnection() { return 0; }
        public void ensureNoDirectConnection() {}
    }

    public static interface ActivityConfigCallback {
        public void onConfigurationChanged(android.content.res.Configuration p0, int p1);
        public void requestCompatCameraControl(boolean p0, boolean p1, android.app.ICompatCameraControlCallback p2);
    }

    abstract class AsyncInputStage extends android.view.ViewRootImpl.InputStage {
        protected static final int DEFER = 3;
        public AsyncInputStage(android.view.ViewRootImpl p0, android.view.ViewRootImpl.InputStage p1, java.lang.String p2) { super(null, null); }
        protected void defer(android.view.ViewRootImpl.QueuedInputEvent p0) {}
        protected void forward(android.view.ViewRootImpl.QueuedInputEvent p0) {}
        protected void apply(android.view.ViewRootImpl.QueuedInputEvent p0, int p1) {}
        void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    }

    public static final class CalledFromWrongThreadException extends android.util.AndroidRuntimeException {
        public CalledFromWrongThreadException(java.lang.String p0) { super(); }
    }

    public static interface ConfigChangedCallback {
        public void onConfigurationChanged(android.content.res.Configuration p0);
    }

    final class ConsumeBatchedInputImmediatelyRunnable implements java.lang.Runnable {
        ConsumeBatchedInputImmediatelyRunnable(android.view.ViewRootImpl p0) {}
        public void run() {}
    }

    final class ConsumeBatchedInputRunnable implements java.lang.Runnable {
        ConsumeBatchedInputRunnable(android.view.ViewRootImpl p0) {}
        public void run() {}
    }

    final class EarlyPostImeInputStage extends android.view.ViewRootImpl.InputStage {
        public EarlyPostImeInputStage(android.view.ViewRootImpl p0, android.view.ViewRootImpl.InputStage p1) { super(null, null); }
        protected int onProcess(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
    }

    static final class GfxInfo {
        public int viewCount;
        public long renderNodeMemoryUsage;
        public long renderNodeMemoryAllocated;
        GfxInfo() {}
        void add(android.view.ViewRootImpl.GfxInfo p0) {}
    }

    final class HighContrastTextManager implements android.view.accessibility.AccessibilityManager.HighTextContrastChangeListener {
        HighContrastTextManager(android.view.ViewRootImpl p0) {}
        public void onHighTextContrastStateChanged(boolean p0) {}
    }

    final class ImeInputStage extends android.view.ViewRootImpl.AsyncInputStage implements android.view.inputmethod.InputMethodManager.FinishedInputEventCallback {
        public ImeInputStage(android.view.ViewRootImpl p0, android.view.ViewRootImpl.InputStage p1, java.lang.String p2) { super(null, null, null); }
        protected int onProcess(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        public void onFinishedInputEvent(java.lang.Object p0, boolean p1) {}
    }

    final class InputMetricsListener implements android.graphics.HardwareRendererObserver.OnFrameMetricsAvailableListener {
        public long[] data;
        InputMetricsListener(android.view.ViewRootImpl p0) {}
        public void onFrameMetricsAvailable(int p0) {}
    }

    abstract class InputStage {
        protected static final int FORWARD = 0;
        protected static final int FINISH_HANDLED = 1;
        protected static final int FINISH_NOT_HANDLED = 2;
        public InputStage(android.view.ViewRootImpl p0, android.view.ViewRootImpl.InputStage p1) {}
        public final void deliver(android.view.ViewRootImpl.QueuedInputEvent p0) {}
        protected void finish(android.view.ViewRootImpl.QueuedInputEvent p0, boolean p1) {}
        protected void forward(android.view.ViewRootImpl.QueuedInputEvent p0) {}
        protected void apply(android.view.ViewRootImpl.QueuedInputEvent p0, int p1) {}
        protected int onProcess(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        protected void onDeliverToNext(android.view.ViewRootImpl.QueuedInputEvent p0) {}
        protected void onWindowFocusChanged(boolean p0) {}
        protected void onDetachedFromWindow() {}
        protected boolean shouldDropInputEvent(android.view.ViewRootImpl.QueuedInputEvent p0) { return false; }
        void dump(java.lang.String p0, java.io.PrintWriter p1) {}
        boolean isBack(android.view.InputEvent p0) { return false; }
    }

    final class InvalidateOnAnimationRunnable implements java.lang.Runnable {
        InvalidateOnAnimationRunnable(android.view.ViewRootImpl p0) {}
        public void addView(android.view.View p0) {}
        public void addViewRect(android.view.View.AttachInfo.InvalidateInfo p0) {}
        public void removeView(android.view.View p0) {}
        public void run() {}
    }

    final class NativePostImeInputStage extends android.view.ViewRootImpl.AsyncInputStage implements android.view.InputQueue.FinishedInputEventCallback {
        public NativePostImeInputStage(android.view.ViewRootImpl p0, android.view.ViewRootImpl.InputStage p1, java.lang.String p2) { super(null, null, null); }
        protected int onProcess(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        public void onFinishedInputEvent(java.lang.Object p0, boolean p1) {}
    }

    final class NativePreImeInputStage extends android.view.ViewRootImpl.AsyncInputStage implements android.view.InputQueue.FinishedInputEventCallback {
        public NativePreImeInputStage(android.view.ViewRootImpl p0, android.view.ViewRootImpl.InputStage p1, java.lang.String p2) { super(null, null, null); }
        protected int onProcess(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        public void onFinishedInputEvent(java.lang.Object p0, boolean p1) {}
    }

    private static final class QueuedInputEvent {
        public static final int FLAG_DELIVER_POST_IME = 1;
        public static final int FLAG_DEFERRED = 2;
        public static final int FLAG_FINISHED = 4;
        public static final int FLAG_FINISHED_HANDLED = 8;
        public static final int FLAG_RESYNTHESIZED = 16;
        public static final int FLAG_UNHANDLED = 32;
        public static final int FLAG_MODIFIED_FOR_COMPATIBILITY = 64;
        public android.view.ViewRootImpl.QueuedInputEvent mNext;
        public android.view.InputEvent mEvent;
        public android.view.InputEventReceiver mReceiver;
        public int mFlags;
        public boolean shouldSkipIme() { return false; }
        public boolean shouldSendToSynthesizer() { return false; }
        public java.lang.String toString() { return null; }
    }

    private class SendWindowContentChangedAccessibilityEvent implements java.lang.Runnable {
        public android.view.View mSource;
        public long mLastEventTimeMillis;
        public java.util.OptionalInt mAction;
        public java.lang.StackTraceElement[] mOrigin;
        public void run() {}
        public void runOrPost(android.view.View p0, int p1) {}
        public void removeCallbacksAndRun() {}
    }

    public static interface SurfaceChangedCallback {
        public void surfaceCreated(android.view.SurfaceControl.Transaction p0);
        public void surfaceReplaced(android.view.SurfaceControl.Transaction p0);
        public void surfaceDestroyed();
        default public void vriDrawStarted(boolean p0) {}
    }

    final class SyntheticInputStage extends android.view.ViewRootImpl.InputStage {
        public SyntheticInputStage(android.view.ViewRootImpl p0) { super(null, null); }
        protected int onProcess(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        protected void onDeliverToNext(android.view.ViewRootImpl.QueuedInputEvent p0) {}
        protected void onWindowFocusChanged(boolean p0) {}
        protected void onDetachedFromWindow() {}
    }

    final class SyntheticJoystickHandler extends android.os.Handler {
        public SyntheticJoystickHandler(android.view.ViewRootImpl p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
        public void process(android.view.MotionEvent p0) {}

        final class JoystickAxesState {
            final int[] mAxisStatesHat = null;
            final int[] mAxisStatesStick = null;
            JoystickAxesState(android.view.ViewRootImpl.SyntheticJoystickHandler p0) {}
            void resetState() {}
            void updateStateForAxis(android.view.MotionEvent p0, long p1, int p2, float p3) {}
        }
    }

    final class SyntheticKeyboardHandler {
        SyntheticKeyboardHandler(android.view.ViewRootImpl p0) {}
        public void process(android.view.KeyEvent p0) {}
    }

    final class SyntheticTouchNavigationHandler extends android.os.Handler {
        SyntheticTouchNavigationHandler(android.view.ViewRootImpl p0) { super(); }
        public void process(android.view.MotionEvent p0) {}
    }

    final class SyntheticTrackballHandler {
        SyntheticTrackballHandler(android.view.ViewRootImpl p0) {}
        public void process(android.view.MotionEvent p0) {}
        public void cancel() {}
    }

    static final class SystemUiVisibilityInfo {
        int globalVisibility;
        int localValue;
        int localChanges;
        SystemUiVisibilityInfo() {}
    }

    class TakenSurfaceHolder extends com.android.internal.view.BaseSurfaceHolder {
        TakenSurfaceHolder(android.view.ViewRootImpl p0) { super(); }
        public boolean onAllowLockCanvas() { return false; }
        public void onRelayoutContainer() {}
        public void setFormat(int p0) {}
        public void setType(int p0) {}
        public void onUpdateSurface() {}
        public boolean isCreating() { return false; }
        public void setFixedSize(int p0, int p1) {}
        public void setKeepScreenOn(boolean p0) {}
    }

    static final class TrackballAxis {
        static final float MAX_ACCELERATION = 20.0f;
        static final long FAST_MOVE_TIME = 150L;
        static final float ACCEL_MOVE_SCALING_FACTOR = 0.02500000037252903f;
        static final float FIRST_MOVEMENT_THRESHOLD = 0.5f;
        static final float SECOND_CUMULATIVE_MOVEMENT_THRESHOLD = 2.0f;
        static final float SUBSEQUENT_INCREMENTAL_MOVEMENT_THRESHOLD = 1.0f;
        float position;
        float acceleration;
        long lastMoveTime;
        int step;
        int dir;
        int nonAccelMovement;
        TrackballAxis() {}
        void reset(int p0) {}
        float collect(float p0, long p1, java.lang.String p2) { return 0.0f; }
        int generate() { return 0; }
    }

    final class TraversalRunnable implements java.lang.Runnable {
        TraversalRunnable(android.view.ViewRootImpl p0) {}
        public void run() {}
    }

    private static class UnhandledKeyManager {
        boolean dispatch(android.view.View p0, android.view.KeyEvent p1) { return false; }
        void preDispatch(android.view.KeyEvent p0) {}
        boolean preViewDispatch(android.view.KeyEvent p0) { return false; }
    }

    final class ViewPostImeInputStage extends android.view.ViewRootImpl.InputStage {
        public ViewPostImeInputStage(android.view.ViewRootImpl p0, android.view.ViewRootImpl.InputStage p1) { super(null, null); }
        protected int onProcess(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        protected void onDeliverToNext(android.view.ViewRootImpl.QueuedInputEvent p0) {}
    }

    final class ViewPreImeInputStage extends android.view.ViewRootImpl.InputStage {
        public ViewPreImeInputStage(android.view.ViewRootImpl p0, android.view.ViewRootImpl.InputStage p1) { super(null, null); }
        protected int onProcess(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
    }

    final class ViewRootHandler extends android.os.Handler {
        ViewRootHandler(android.view.ViewRootImpl p0) { super(); }
        public java.lang.String getMessageName(android.os.Message p0) { return null; }
        public boolean sendMessageAtTime(android.os.Message p0, long p1) { return false; }
        public void handleMessage(android.os.Message p0) {}
    }

    static class W extends android.view.IWindow.Stub {
        W(android.view.ViewRootImpl p0) { super(); }
        public void resized(android.window.ClientWindowFrames p0, boolean p1, android.util.MergedConfiguration p2, android.view.InsetsState p3, boolean p4, boolean p5, int p6, int p7, boolean p8) {}
        public void insetsControlChanged(android.view.InsetsState p0, android.view.InsetsSourceControl[] p1) {}
        public void showInsets(int p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) {}
        public void hideInsets(int p0, boolean p1, android.view.inputmethod.ImeTracker.Token p2) {}
        public void moved(int p0, int p1) {}
        public void dispatchAppVisibility(boolean p0) {}
        public void dispatchGetNewSurface() {}
        public void executeCommand(java.lang.String p0, java.lang.String p1, android.os.ParcelFileDescriptor p2) {}
        public void closeSystemDialogs(java.lang.String p0) {}
        public void dispatchWallpaperOffsets(float p0, float p1, float p2, float p3, float p4, boolean p5) {}
        public void dispatchWallpaperCommand(java.lang.String p0, int p1, int p2, int p3, android.os.Bundle p4, boolean p5) {}
        public void dispatchDragEvent(android.view.DragEvent p0) {}
        public void updatePointerIcon(float p0, float p1) {}
        public void dispatchWindowShown() {}
        public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) {}
        public void requestScrollCapture(android.view.IScrollCaptureResponseListener p0) {}
    }

    final class WindowInputEventReceiver extends android.view.InputEventReceiver {
        public WindowInputEventReceiver(android.view.ViewRootImpl p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
        public void onInputEvent(android.view.InputEvent p0) {}
        public void onBatchedInputEventPending(int p0) {}
        public void onFocusEvent(boolean p0) {}
        public void onTouchModeChanged(boolean p0) {}
        public void onPointerCaptureEvent(boolean p0) {}
        public void onDragEvent(boolean p0, float p1, float p2) {}
        public void dispose() {}
    }
}
