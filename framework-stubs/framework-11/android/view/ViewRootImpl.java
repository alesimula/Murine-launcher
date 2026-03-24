package android.view;

public final class ViewRootImpl implements android.view.ViewParent, android.view.View.AttachInfo.Callbacks, android.view.ThreadedRenderer.DrawCallbacks {
    private static final java.lang.String TAG = "ViewRootImpl";
    private static final boolean DBG = false;
    private static final boolean LOCAL_LOGV = false;
    private static final boolean DEBUG_DRAW = false;
    private static final boolean DEBUG_LAYOUT = false;
    private static final boolean DEBUG_DIALOG = false;
    private static final boolean DEBUG_INPUT_RESIZE = false;
    private static final boolean DEBUG_ORIENTATION = false;
    private static final boolean DEBUG_TRACKBALL = false;
    private static final boolean DEBUG_IMF = false;
    private static final boolean DEBUG_CONFIGURATION = false;
    private static final boolean DEBUG_FPS = false;
    private static final boolean DEBUG_INPUT_STAGES = false;
    private static final boolean DEBUG_KEEP_SCREEN_ON = false;
    private static final boolean DEBUG_CONTENT_CAPTURE = false;
    private static final boolean DEBUG_SCROLL_CAPTURE = false;
    private static final boolean MT_RENDERER_AVAILABLE = true;
    private static final java.lang.String USE_NEW_INSETS_PROPERTY = "persist.debug.new_insets";
    public static final int NEW_INSETS_MODE_NONE = 0;
    public static final int NEW_INSETS_MODE_IME = 1;
    public static final int NEW_INSETS_MODE_FULL = 2;
    public static int sNewInsetsMode;
    private static final java.lang.String PROPERTY_PROFILE_RENDERING = "viewroot.profile_rendering";
    static final int MAX_TRACKBALL_DELAY = 250;
    private static final int CONTENT_CAPTURE_ENABLED_NOT_CHECKED = 0;
    private static final int CONTENT_CAPTURE_ENABLED_TRUE = 1;
    private static final int CONTENT_CAPTURE_ENABLED_FALSE = 2;
    static final java.lang.ThreadLocal<android.view.HandlerActionQueue> sRunQueues = null;
    static final java.util.ArrayList<java.lang.Runnable> sFirstDrawHandlers = null;
    static boolean sFirstDrawComplete;
    private static final java.util.ArrayList<android.view.ViewRootImpl.ConfigChangedCallback> sConfigCallbacks = null;
    private android.view.ViewRootImpl.ActivityConfigCallback mActivityConfigCallback;
    private boolean mForceNextConfigUpdate;
    private boolean mUseBLASTAdapter;
    private boolean mForceDisableBLAST;
    private boolean mEnableTripleBuffering;
    private static boolean sCompatibilityDone;
    private static boolean sAlwaysAssignFocus;
    final java.util.ArrayList<android.view.WindowCallbacks> mWindowCallbacks = null;
    public final android.content.Context mContext = null;
    final android.view.IWindowSession mWindowSession = null;
    android.view.Display mDisplay;
    final android.hardware.display.DisplayManager mDisplayManager = null;
    final java.lang.String mBasePackageName = null;
    final int[] mTmpLocation = null;
    final android.util.TypedValue mTmpValue = null;
    final java.lang.Thread mThread = null;
    final android.view.WindowLeaked mLocation = null;
    public final android.view.WindowManager.LayoutParams mWindowAttributes = null;
    final android.view.ViewRootImpl.W mWindow = null;
    final android.os.IBinder mLeashToken = null;
    final int mTargetSdkVersion = 0;
    int mSeq;
    android.view.View mView;
    android.view.View mAccessibilityFocusedHost;
    android.view.accessibility.AccessibilityNodeInfo mAccessibilityFocusedVirtualView;
    boolean mPointerCapture;
    int mViewVisibility;
    boolean mAppVisible;
    private boolean mForceDecorViewVisibility;
    private boolean mAppVisibilityChanged;
    int mOrigWindowType;
    boolean mHadWindowFocus;
    boolean mLostWindowFocus;
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
    int mWidth;
    int mHeight;
    android.graphics.Rect mDirty;
    public boolean mIsAnimating;
    private boolean mUseMTRenderer;
    private boolean mDragResizing;
    private boolean mInvalidateRootRequested;
    private int mResizeMode;
    private int mCanvasOffsetX;
    private int mCanvasOffsetY;
    private boolean mActivityRelaunched;
    android.content.res.CompatibilityInfo.Translator mTranslator;
    final android.view.View.AttachInfo mAttachInfo = null;
    final android.view.ViewRootImpl.SystemUiVisibilityInfo mCompatibleVisibilityInfo = null;
    int mDispatchedSystemUiVisibility;
    android.view.InputQueue.Callback mInputQueueCallback;
    android.view.InputQueue mInputQueue;
    android.view.FallbackEventHandler mFallbackEventHandler;
    final android.view.Choreographer mChoreographer = null;
    private final android.graphics.Point mSurfaceSize = null;
    final android.graphics.Rect mTempRect = null;
    final android.graphics.Rect mVisRect = null;
    private final android.graphics.Rect mTempBoundsRect = null;
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
    boolean mFullRedrawNeeded;
    boolean mNewSurfaceNeeded;
    boolean mForceNextWindowRelayout;
    java.util.concurrent.CountDownLatch mWindowDrawCountDown;
    boolean mIsDrawing;
    int mLastSystemUiVisibility;
    int mClientWindowLayoutFlags;
    private static final int MAX_QUEUED_INPUT_EVENT_POOL_SIZE = 10;
    private android.view.ViewRootImpl.QueuedInputEvent mQueuedInputEventPool;
    private int mQueuedInputEventPoolSize;
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
    private final android.view.ViewRootImpl.UnhandledKeyManager mUnhandledKeyManager = null;
    boolean mWindowAttributesChanged;
    public final android.view.Surface mSurface = null;
    private final android.view.SurfaceControl mSurfaceControl = null;
    private android.view.SurfaceControl mBlastSurfaceControl;
    private android.graphics.BLASTBufferQueue mBlastBufferQueue;
    private final android.view.SurfaceControl.Transaction mSurfaceChangedTransaction = null;
    private android.view.SurfaceControl mBoundsLayer;
    private final android.view.SurfaceSession mSurfaceSession = null;
    private final android.view.SurfaceControl.Transaction mTransaction = null;
    boolean mAdded;
    boolean mAddedTouchMode;
    final android.graphics.Rect mTmpFrame = null;
    final android.graphics.Rect mTmpRect = null;
    final android.graphics.Rect mWinFrame = null;
    final android.graphics.Rect mPendingBackDropFrame = null;
    final android.view.DisplayCutout.ParcelableWrapper mPendingDisplayCutout = null;
    boolean mPendingAlwaysConsumeSystemBars;
    private final android.view.InsetsState mTempInsets = null;
    private final android.view.InsetsSourceControl[] mTempControls = null;
    final android.view.ViewTreeObserver.InternalInsetsInfo mLastGivenInsets = null;
    private android.view.WindowInsets mLastWindowInsets;
    private int mTypesHiddenByFlags;
    private final android.content.res.Configuration mLastConfigurationFromResources = null;
    private final android.util.MergedConfiguration mLastReportedMergedConfiguration = null;
    private final android.util.MergedConfiguration mPendingMergedConfiguration = null;
    boolean mScrollMayChange;
    int mSoftInputMode;
    java.lang.ref.WeakReference<android.view.View> mLastScrolledFocus;
    int mScrollY;
    int mCurScrollY;
    android.widget.Scroller mScroller;
    static final android.view.animation.Interpolator mResizeInterpolator = null;
    private java.util.ArrayList<android.animation.LayoutTransition> mPendingTransitions;
    final android.view.ViewConfiguration mViewConfiguration = null;
    android.content.ClipDescription mDragDescription;
    android.view.View mCurrentDragView;
    volatile java.lang.Object mLocalDragState;
    final android.graphics.PointF mDragPoint = null;
    final android.graphics.PointF mLastTouchPoint = null;
    int mLastTouchSource;
    private boolean mProfileRendering;
    private android.view.Choreographer.FrameCallback mRenderProfiler;
    private boolean mRenderProfilingEnabled;
    private long mFpsStartTime;
    private long mFpsPrevTime;
    private int mFpsNumFrames;
    private int mPointerIconType;
    private android.view.PointerIcon mCustomPointerIcon;
    android.media.AudioManager mAudioManager;
    final android.view.accessibility.AccessibilityManager mAccessibilityManager = null;
    android.view.AccessibilityInteractionController mAccessibilityInteractionController;
    final android.view.ViewRootImpl.AccessibilityInteractionConnectionManager mAccessibilityInteractionConnectionManager = null;
    final android.view.ViewRootImpl.HighContrastTextManager mHighContrastTextManager = null;
    android.view.ViewRootImpl.SendWindowContentChangedAccessibilityEvent mSendWindowContentChangedAccessibilityEvent;
    java.util.HashSet<android.view.View> mTempHashSet;
    private final int mDensity = 0;
    private final int mNoncompatDensity = 0;
    private boolean mInLayout;
    java.util.ArrayList<android.view.View> mLayoutRequesters;
    boolean mHandlingLayoutInLayoutRequest;
    private int mViewLayoutDirectionInitial;
    private boolean mRemoved;
    private boolean mNeedsRendererSetup;
    private final android.view.InputEventCompatProcessor mInputCompatProcessor = null;
    protected final android.view.InputEventConsistencyVerifier mInputEventConsistencyVerifier = null;
    private final android.view.InsetsController mInsetsController = null;
    private final android.view.ImeFocusController mImeFocusController = null;
    private android.view.ScrollCaptureClient mScrollCaptureClient;
    private final android.view.GestureExclusionTracker mGestureExclusionTracker = null;
    private android.view.accessibility.IAccessibilityEmbeddedConnection mAccessibilityEmbeddedConnection;
    private boolean mNextDrawUseBLASTSyncTransaction;
    private boolean mNextReportConsumeBLAST;
    private android.view.SurfaceControl.Transaction mRtBLASTSyncTransaction;
    private boolean mSendNextFrameToWm;
    private java.util.HashSet<android.view.ScrollCaptureCallback> mRootScrollCaptureCallbacks;
    private java.lang.String mTag;
    private boolean mProfile;
    private final android.hardware.display.DisplayManager.DisplayListener mDisplayListener = null;
    private final java.util.ArrayList<android.view.ViewRootImpl.SurfaceChangedCallback> mSurfaceChangedCallbacks = null;
    int mHardwareXOffset;
    int mHardwareYOffset;
    int mDrawsNeededToReport;
    private static final int MSG_INVALIDATE = 1;
    private static final int MSG_INVALIDATE_RECT = 2;
    private static final int MSG_DIE = 3;
    private static final int MSG_RESIZED = 4;
    private static final int MSG_RESIZED_REPORT = 5;
    private static final int MSG_WINDOW_FOCUS_CHANGED = 6;
    private static final int MSG_DISPATCH_INPUT_EVENT = 7;
    private static final int MSG_DISPATCH_APP_VISIBILITY = 8;
    private static final int MSG_DISPATCH_GET_NEW_SURFACE = 9;
    private static final int MSG_DISPATCH_KEY_FROM_IME = 11;
    private static final int MSG_DISPATCH_KEY_FROM_AUTOFILL = 12;
    private static final int MSG_CHECK_FOCUS = 13;
    private static final int MSG_CLOSE_SYSTEM_DIALOGS = 14;
    private static final int MSG_DISPATCH_DRAG_EVENT = 15;
    private static final int MSG_DISPATCH_DRAG_LOCATION_EVENT = 16;
    private static final int MSG_DISPATCH_SYSTEM_UI_VISIBILITY = 17;
    private static final int MSG_UPDATE_CONFIGURATION = 18;
    private static final int MSG_PROCESS_INPUT_EVENTS = 19;
    private static final int MSG_CLEAR_ACCESSIBILITY_FOCUS_HOST = 21;
    private static final int MSG_INVALIDATE_WORLD = 22;
    private static final int MSG_WINDOW_MOVED = 23;
    private static final int MSG_SYNTHESIZE_INPUT_EVENT = 24;
    private static final int MSG_DISPATCH_WINDOW_SHOWN = 25;
    private static final int MSG_REQUEST_KEYBOARD_SHORTCUTS = 26;
    private static final int MSG_UPDATE_POINTER_ICON = 27;
    private static final int MSG_POINTER_CAPTURE_CHANGED = 28;
    private static final int MSG_DRAW_FINISHED = 29;
    private static final int MSG_INSETS_CHANGED = 30;
    private static final int MSG_INSETS_CONTROL_CHANGED = 31;
    private static final int MSG_SYSTEM_GESTURE_EXCLUSION_CHANGED = 32;
    private static final int MSG_LOCATION_IN_PARENT_DISPLAY_CHANGED = 33;
    private static final int MSG_SHOW_INSETS = 34;
    private static final int MSG_HIDE_INSETS = 35;
    private static final int MSG_REQUEST_SCROLL_CAPTURE = 36;
    final android.view.ViewRootImpl.ViewRootHandler mHandler = null;
    final android.view.ViewRootImpl.TraversalRunnable mTraversalRunnable = null;
    android.view.ViewRootImpl.WindowInputEventReceiver mInputEventReceiver;
    final android.view.ViewRootImpl.ConsumeBatchedInputRunnable mConsumedBatchedInputRunnable = null;
    boolean mConsumeBatchedInputScheduled;
    final android.view.ViewRootImpl.ConsumeBatchedInputImmediatelyRunnable mConsumeBatchedInputImmediatelyRunnable = null;
    boolean mConsumeBatchedInputImmediatelyScheduled;
    final android.view.ViewRootImpl.InvalidateOnAnimationRunnable mInvalidateOnAnimationRunnable = null;
    public android.view.ImeFocusController getImeFocusController() { return null; }
    public android.view.ScrollCaptureClient getScrollCaptureClient() { return null; }
    public ViewRootImpl(android.content.Context p0, android.view.Display p1) {}
    public ViewRootImpl(android.content.Context p0, android.view.Display p1, android.view.IWindowSession p2) {}
    public ViewRootImpl(android.content.Context p0, android.view.Display p1, android.view.IWindowSession p2, boolean p3) {}
    public static void addFirstDrawHandler(java.lang.Runnable p0) {}
    public static void addConfigCallback(android.view.ViewRootImpl.ConfigChangedCallback p0) {}
    public void setActivityConfigCallback(android.view.ViewRootImpl.ActivityConfigCallback p0) {}
    public void setOnContentApplyWindowInsetsListener(android.view.Window.OnContentApplyWindowInsetsListener p0) {}
    public void addWindowCallbacks(android.view.WindowCallbacks p0) {}
    public void removeWindowCallbacks(android.view.WindowCallbacks p0) {}
    public void reportDrawFinish() {}
    public void profile() {}
    static boolean isInTouchMode() { return false; }
    public void notifyChildRebuilt() {}
    public void setView(android.view.View p0, android.view.WindowManager.LayoutParams p1, android.view.View p2) {}
    public void setView(android.view.View p0, android.view.WindowManager.LayoutParams p1, android.view.View p2, int p3) {}
    private void setTag() {}
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
    private void enableHardwareAcceleration(android.view.WindowManager.LayoutParams p0) {}
    private int getNightMode() { return 0; }
    private void updateForceDarkMode() {}
    public android.view.View getView() { return null; }
    final android.view.WindowLeaked getLocation() { return null; }
    void setLayoutParams(android.view.WindowManager.LayoutParams p0, boolean p1) {}
    void handleAppVisibility(boolean p0) {}
    void handleGetNewSurface() {}
    public void onMovedToDisplay(int p0, android.content.res.Configuration p1) {}
    private void updateInternalDisplay(int p0, android.content.res.Resources p1) {}
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
    private void invalidateRectOnScreen(android.graphics.Rect p0) {}
    public void setIsAmbientMode(boolean p0) {}
    void setWindowStopped(boolean p0) {}
    void addSurfaceChangedCallback(android.view.ViewRootImpl.SurfaceChangedCallback p0) {}
    void removeSurfaceChangedCallback(android.view.ViewRootImpl.SurfaceChangedCallback p0) {}
    private void notifySurfaceCreated() {}
    private void notifySurfaceReplaced() {}
    private void notifySurfaceDestroyed() {}
    public android.view.SurfaceControl getBoundsLayer() { return null; }
    android.view.Surface getOrCreateBLASTSurface(int p0, int p1) { return null; }
    private void setBoundsLayerCrop() {}
    private void updateBoundsLayer() {}
    private void destroySurface() {}
    public void setPausedForTransition(boolean p0) {}
    public android.view.ViewParent getParent() { return null; }
    public boolean getChildVisibleRect(android.view.View p0, android.graphics.Rect p1, android.graphics.Point p2) { return false; }
    public void bringChildToFront(android.view.View p0) {}
    int getHostVisibility() { return 0; }
    public void requestTransitionStart(android.animation.LayoutTransition p0) {}
    void notifyRendererOfFramePending() {}
    void scheduleTraversals() {}
    void unscheduleTraversals() {}
    void doTraversal() {}
    private void applyKeepScreenOnFlag(android.view.WindowManager.LayoutParams p0) {}
    private boolean collectViewAttributes() { return false; }
    private int getImpliedSystemUiVisibility(android.view.WindowManager.LayoutParams p0) { return 0; }
    void updateCompatSysUiVisibility(int p0, boolean p1, boolean p2) {}
    private void clearLowProfileModeIfNeeded(int p0, boolean p1) {}
    private void dispatchDispatchSystemUiVisibilityChanged(android.view.ViewRootImpl.SystemUiVisibilityInfo p0) {}
    private void handleDispatchSystemUiVisibilityChanged(android.view.ViewRootImpl.SystemUiVisibilityInfo p0) {}
    public static void adjustLayoutParamsForCompatibility(android.view.WindowManager.LayoutParams p0) {}
    private void controlInsetsForCompatibility(android.view.WindowManager.LayoutParams p0) {}
    private boolean measureHierarchy(android.view.View p0, android.view.WindowManager.LayoutParams p1, android.content.res.Resources p2, int p3, int p4) { return false; }
    void transformMatrixToGlobal(android.graphics.Matrix p0) {}
    void transformMatrixToLocal(android.graphics.Matrix p0) {}
    android.view.WindowInsets getWindowInsets(boolean p0) { return null; }
    public void dispatchApplyInsets(android.view.View p0) {}
    private boolean updateCaptionInsets() { return false; }
    private boolean shouldDispatchCutout() { return false; }
    public android.view.InsetsController getInsetsController() { return null; }
    private static boolean shouldUseDisplaySize(android.view.WindowManager.LayoutParams p0) { return false; }
    int dipToPx(int p0) { return 0; }
    private void performTraversals() {}
    private void notifyContentCatpureEvents() {}
    private void notifyHolderSurfaceDestroyed() {}
    private void maybeHandleWindowMove(android.graphics.Rect p0) {}
    private void handleWindowFocusChanged() {}
    private void fireAccessibilityFocusEventIfHasFocusedNode() {}
    private android.view.accessibility.AccessibilityNodeInfo findFocusedVirtualNode(android.view.accessibility.AccessibilityNodeProvider p0) { return null; }
    private void handleOutOfResourcesException(android.view.Surface.OutOfResourcesException p0) {}
    private void performMeasure(int p0, int p1) {}
    boolean isInLayout() { return false; }
    boolean requestLayoutDuringLayout(android.view.View p0) { return false; }
    private void performLayout(android.view.WindowManager.LayoutParams p0, int p1, int p2) {}
    private java.util.ArrayList<android.view.View> getValidLayoutRequesters(java.util.ArrayList<android.view.View> p0, boolean p1) { return null; }
    public void requestTransparentRegion(android.view.View p0) {}
    private static int getRootMeasureSpec(int p0, int p1) { return 0; }
    public void onPreDraw(android.graphics.RecordingCanvas p0) {}
    public void onPostDraw(android.graphics.RecordingCanvas p0) {}
    void outputDisplayList(android.view.View p0) {}
    private void profileRendering(boolean p0) {}
    private void trackFPS() {}
    void drawPending() {}
    void pendingDrawFinished() {}
    private void postDrawFinished() {}
    private void reportDrawFinished() {}
    private void performDraw() {}
    private boolean isContentCaptureEnabled() { return false; }
    private boolean isContentCaptureReallyEnabled() { return false; }
    private void performContentCaptureInitialReport() {}
    private void handleContentCaptureFlush() {}
    private boolean draw(boolean p0) { return false; }
    private boolean drawSoftware(android.view.Surface p0, android.view.View.AttachInfo p1, int p2, int p3, boolean p4, android.graphics.Rect p5, android.graphics.Rect p6) { return false; }
    private void drawAccessibilityFocusedDrawableIfNeeded(android.graphics.Canvas p0) {}
    private boolean getAccessibilityFocusedRect(android.graphics.Rect p0) { return false; }
    private android.graphics.drawable.Drawable getAccessibilityFocusedDrawable() { return null; }
    void updateSystemGestureExclusionRectsForView(android.view.View p0) {}
    void systemGestureExclusionChanged() {}
    void updateLocationInParentDisplay(int p0, int p1) {}
    public void setRootSystemGestureExclusionRects(java.util.List<android.graphics.Rect> p0) {}
    public java.util.List<android.graphics.Rect> getRootSystemGestureExclusionRects() { return null; }
    public void requestInvalidateRootRenderNode() {}
    boolean scrollToRectOrFocus(android.graphics.Rect p0, boolean p1) { return false; }
    public android.view.View getAccessibilityFocusedHost() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getAccessibilityFocusedVirtualView() { return null; }
    void setAccessibilityFocus(android.view.View p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
    boolean hasPointerCapture() { return false; }
    void requestPointerCapture(boolean p0) {}
    private void handlePointerCaptureChanged(boolean p0) {}
    private boolean hasColorModeChanged(int p0) { return false; }
    public void requestChildFocus(android.view.View p0, android.view.View p1) {}
    public void clearChildFocus(android.view.View p0) {}
    public android.view.ViewParent getParentForAccessibility() { return null; }
    public void focusableViewAvailable(android.view.View p0) {}
    public void recomputeViewAttributes(android.view.View p0) {}
    void dispatchDetachedFromWindow() {}
    private void performConfigurationChange(android.util.MergedConfiguration p0, boolean p1, int p2) {}
    public void updateConfiguration(int p0) {}
    public static boolean isViewDescendantOf(android.view.View p0, android.view.View p1) { return false; }
    private static void forceLayout(android.view.View p0) {}
    boolean ensureTouchMode(boolean p0) { return false; }
    private boolean ensureTouchModeLocally(boolean p0) { return false; }
    private boolean enterTouchMode() { return false; }
    private static android.view.ViewGroup findAncestorToTakeFocusInTouchMode(android.view.View p0) { return null; }
    private boolean leaveTouchMode() { return false; }
    private void resetPointerIcon(android.view.MotionEvent p0) {}
    private boolean updatePointerIcon(android.view.MotionEvent p0) { return false; }
    private void maybeUpdateTooltip(android.view.MotionEvent p0) {}
    private static boolean isNavigationKey(android.view.KeyEvent p0) { return false; }
    private static boolean isTypingKey(android.view.KeyEvent p0) { return false; }
    private boolean checkForLeavingTouchModeAndConsume(android.view.KeyEvent p0) { return false; }
    void setLocalDragState(java.lang.Object p0) {}
    private void handleDragEvent(android.view.DragEvent p0) {}
    public void onWindowTitleChanged() {}
    public void handleDispatchWindowShown() {}
    public void handleRequestKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) {}
    public void getLastTouchPoint(android.graphics.Point p0) {}
    public int getLastTouchSource() { return 0; }
    public void setDragFocus(android.view.View p0, android.view.DragEvent p1) {}
    private android.media.AudioManager getAudioManager() { return null; }
    private android.view.autofill.AutofillManager getAutofillManager() { return null; }
    private boolean isAutofillUiShowing() { return false; }
    public android.view.AccessibilityInteractionController getAccessibilityInteractionController() { return null; }
    private int relayoutWindow(android.view.WindowManager.LayoutParams p0, int p1, boolean p2) throws android.os.RemoteException { return 0; }
    private void setFrame(android.graphics.Rect p0) {}
    public void playSoundEffect(int p0) {}
    public boolean performHapticFeedback(int p0, boolean p1) { return false; }
    public android.view.View focusSearch(android.view.View p0, int p1) { return null; }
    public android.view.View keyboardNavigationClusterSearch(android.view.View p0, int p1) { return null; }
    public void debug() {}
    public void dump(java.lang.String p0, java.io.FileDescriptor p1, java.io.PrintWriter p2, java.lang.String[] p3) {}
    private void dumpViewHierarchy(java.lang.String p0, java.io.PrintWriter p1, android.view.View p2) {}
    android.view.ViewRootImpl.GfxInfo getGfxInfo() { return null; }
    private static void computeRenderNodeUsage(android.graphics.RenderNode p0, android.view.ViewRootImpl.GfxInfo p1) {}
    private static void appendGfxInfo(android.view.View p0, android.view.ViewRootImpl.GfxInfo p1) {}
    boolean die(boolean p0) { return false; }
    void doDie() {}
    public void requestUpdateConfiguration(android.content.res.Configuration p0) {}
    public void loadSystemProperties() {}
    private void destroyHardwareRenderer() {}
    private void dispatchResized(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, boolean p4, android.util.MergedConfiguration p5, android.graphics.Rect p6, boolean p7, boolean p8, int p9, android.view.DisplayCutout.ParcelableWrapper p10) {}
    private void dispatchInsetsChanged(android.view.InsetsState p0) {}
    private void dispatchInsetsControlChanged(android.view.InsetsState p0, android.view.InsetsSourceControl[] p1) {}
    private void showInsets(int p0, boolean p1) {}
    private void hideInsets(int p0, boolean p1) {}
    public void dispatchMoved(int p0, int p1) {}
    private android.view.ViewRootImpl.QueuedInputEvent obtainQueuedInputEvent(android.view.InputEvent p0, android.view.InputEventReceiver p1, int p2) { return null; }
    private void recycleQueuedInputEvent(android.view.ViewRootImpl.QueuedInputEvent p0) {}
    void enqueueInputEvent(android.view.InputEvent p0) {}
    void enqueueInputEvent(android.view.InputEvent p0, android.view.InputEventReceiver p1, int p2, boolean p3) {}
    private void scheduleProcessInputEvents() {}
    void doProcessInputEvents() {}
    private void deliverInputEvent(android.view.ViewRootImpl.QueuedInputEvent p0) {}
    private void finishInputEvent(android.view.ViewRootImpl.QueuedInputEvent p0) {}
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
    public void dispatchLocationInParentDisplayChanged(android.graphics.Point p0) {}
    public void windowFocusChanged(boolean p0, boolean p1) {}
    public void dispatchWindowShown() {}
    public void dispatchCloseSystemDialogs(java.lang.String p0) {}
    public void dispatchDragEvent(android.view.DragEvent p0) {}
    public void updatePointerIcon(float p0, float p1) {}
    public void dispatchSystemUiVisibilityChanged(int p0, int p1, int p2, int p3) {}
    public void dispatchCheckFocus() {}
    public void dispatchRequestKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) {}
    public void dispatchPointerCaptureChanged(boolean p0) {}
    private void postSendWindowContentChangedCallback(android.view.View p0, int p1) {}
    private void removeSendWindowContentChangedCallback() {}
    public boolean showContextMenuForChild(android.view.View p0) { return false; }
    public boolean showContextMenuForChild(android.view.View p0, float p1, float p2) { return false; }
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1) { return null; }
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1, int p2) { return null; }
    public void createContextMenu(android.view.ContextMenu p0) {}
    public void childDrawableStateChanged(android.view.View p0) {}
    public boolean requestSendAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) { return false; }
    private android.view.View getSourceForAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) { return null; }
    private void handleWindowContentChangedEvent(android.view.accessibility.AccessibilityEvent p0) {}
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
    private android.view.View getCommonPredecessor(android.view.View p0, android.view.View p1) { return null; }
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
    public void dispatchScrollCaptureRequest(android.view.IScrollCaptureController p0) {}
    private void collectRootScrollCaptureTargets(java.util.Queue<android.view.ScrollCaptureTarget> p0) {}
    private void handleScrollCaptureRequest(android.view.IScrollCaptureController p0) {}
    private void dispatchScrollCaptureSearchResult(android.view.IScrollCaptureController p0, android.view.ScrollCaptureTarget p1) {}
    private void reportNextDraw() {}
    public void setReportNextDraw() {}
    void changeCanvasOpacity(boolean p0) {}
    public boolean dispatchUnhandledKeyEvent(android.view.KeyEvent p0) { return false; }
    static android.view.HandlerActionQueue getRunQueue() { return null; }
    private void startDragResizing(android.graphics.Rect p0, boolean p1, android.graphics.Rect p2, android.graphics.Rect p3, int p4) {}
    private void endDragResizing() {}
    private boolean updateContentDrawBounds() { return false; }
    private void requestDrawWindow() {}
    public void reportActivityRelaunched() {}
    public android.view.SurfaceControl getSurfaceControl() { return null; }
    public android.os.IBinder getInputToken() { return null; }
    public android.os.IBinder getWindowToken() { return null; }
    public android.view.accessibility.IAccessibilityEmbeddedConnection getAccessibilityEmbeddedConnection() { return null; }
    void setUseBLASTSyncTransaction() {}
    private void finishBLASTSync(boolean p0) {}
    android.view.SurfaceControl.Transaction getBLASTSyncTransaction() { return null; }
    public android.view.SurfaceControl getRenderSurfaceControl() { return null; }
    public void onDescendantUnbufferedRequested() {}
    void forceDisableBLAST() {}
    boolean useBLAST() { return false; }
    boolean isDrawingToBLASTTransaction() { return false; }

    static final class AccessibilityInteractionConnection extends android.view.accessibility.IAccessibilityInteractionConnection.Stub {
        private final java.lang.ref.WeakReference<android.view.ViewRootImpl> mViewRootImpl = null;
        AccessibilityInteractionConnection(android.view.ViewRootImpl p0) { super(); }
        public void findAccessibilityNodeInfoByAccessibilityId(long p0, android.graphics.Region p1, int p2, android.view.accessibility.IAccessibilityInteractionConnectionCallback p3, int p4, int p5, long p6, android.view.MagnificationSpec p7, android.os.Bundle p8) {}
        public void performAccessibilityAction(long p0, int p1, android.os.Bundle p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7) {}
        public void findAccessibilityNodeInfosByViewId(long p0, java.lang.String p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) {}
        public void findAccessibilityNodeInfosByText(long p0, java.lang.String p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) {}
        public void findFocus(long p0, int p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) {}
        public void focusSearch(long p0, int p1, android.graphics.Region p2, int p3, android.view.accessibility.IAccessibilityInteractionConnectionCallback p4, int p5, int p6, long p7, android.view.MagnificationSpec p8) {}
        public void clearAccessibilityFocus() {}
        public void notifyOutsideTouch() {}
    }

    final class AccessibilityInteractionConnectionManager implements android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener {
        AccessibilityInteractionConnectionManager(android.view.ViewRootImpl p0) {}
        public void onAccessibilityStateChanged(boolean p0) {}
        public void ensureConnection() {}
        public void ensureNoConnection() {}
    }

    public static interface ActivityConfigCallback {
        public void onConfigurationChanged(android.content.res.Configuration p0, int p1);
    }

    abstract class AsyncInputStage extends android.view.ViewRootImpl.InputStage {
        private final java.lang.String mTraceCounter = null;
        private android.view.ViewRootImpl.QueuedInputEvent mQueueHead;
        private android.view.ViewRootImpl.QueuedInputEvent mQueueTail;
        private int mQueueLength;
        protected static final int DEFER = 3;
        public AsyncInputStage(android.view.ViewRootImpl p0, android.view.ViewRootImpl.InputStage p1, java.lang.String p2) { super(null, null); }
        protected void defer(android.view.ViewRootImpl.QueuedInputEvent p0) {}
        protected void forward(android.view.ViewRootImpl.QueuedInputEvent p0) {}
        protected void apply(android.view.ViewRootImpl.QueuedInputEvent p0, int p1) {}
        private void enqueue(android.view.ViewRootImpl.QueuedInputEvent p0) {}
        private void dequeue(android.view.ViewRootImpl.QueuedInputEvent p0, android.view.ViewRootImpl.QueuedInputEvent p1) {}
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
        private int processKeyEvent(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        private int processMotionEvent(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        private int processPointerEvent(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
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

    abstract class InputStage {
        private final android.view.ViewRootImpl.InputStage mNext = null;
        protected static final int FORWARD = 0;
        protected static final int FINISH_HANDLED = 1;
        protected static final int FINISH_NOT_HANDLED = 2;
        private java.lang.String mTracePrefix;
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
        private boolean isBack(android.view.InputEvent p0) { return false; }
        private void traceEvent(android.view.ViewRootImpl.QueuedInputEvent p0, long p1) {}
    }

    final class InvalidateOnAnimationRunnable implements java.lang.Runnable {
        private boolean mPosted;
        private final java.util.ArrayList<android.view.View> mViews = null;
        private final java.util.ArrayList<android.view.View.AttachInfo.InvalidateInfo> mViewRects = null;
        private android.view.View[] mTempViews;
        private android.view.View.AttachInfo.InvalidateInfo[] mTempViewRects;
        InvalidateOnAnimationRunnable(android.view.ViewRootImpl p0) {}
        public void addView(android.view.View p0) {}
        public void addViewRect(android.view.View.AttachInfo.InvalidateInfo p0) {}
        public void removeView(android.view.View p0) {}
        public void run() {}
        private void postIfNeededLocked() {}
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
        private QueuedInputEvent() {}
        public boolean shouldSkipIme() { return false; }
        public boolean shouldSendToSynthesizer() { return false; }
        public java.lang.String toString() { return null; }
        private boolean flagToString(java.lang.String p0, int p1, boolean p2, java.lang.StringBuilder p3) { return false; }
    }

    private class SendWindowContentChangedAccessibilityEvent implements java.lang.Runnable {
        private int mChangeTypes;
        public android.view.View mSource;
        public long mLastEventTimeMillis;
        public java.lang.StackTraceElement[] mOrigin;
        private SendWindowContentChangedAccessibilityEvent(android.view.ViewRootImpl p0) {}
        public void run() {}
        public void runOrPost(android.view.View p0, int p1) {}
        public void removeCallbacksAndRun() {}
    }

    static interface SurfaceChangedCallback {
        public void surfaceCreated(android.view.SurfaceControl.Transaction p0);
        public void surfaceReplaced(android.view.SurfaceControl.Transaction p0);
        public void surfaceDestroyed();
    }

    final class SyntheticInputStage extends android.view.ViewRootImpl.InputStage {
        private final android.view.ViewRootImpl.SyntheticTrackballHandler mTrackball = null;
        private final android.view.ViewRootImpl.SyntheticJoystickHandler mJoystick = null;
        private final android.view.ViewRootImpl.SyntheticTouchNavigationHandler mTouchNavigation = null;
        private final android.view.ViewRootImpl.SyntheticKeyboardHandler mKeyboard = null;
        public SyntheticInputStage(android.view.ViewRootImpl p0) { super(null, null); }
        protected int onProcess(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        protected void onDeliverToNext(android.view.ViewRootImpl.QueuedInputEvent p0) {}
        protected void onWindowFocusChanged(boolean p0) {}
        protected void onDetachedFromWindow() {}
    }

    final class SyntheticJoystickHandler extends android.os.Handler {
        private static final int MSG_ENQUEUE_X_AXIS_KEY_REPEAT = 1;
        private static final int MSG_ENQUEUE_Y_AXIS_KEY_REPEAT = 2;
        private final android.view.ViewRootImpl.SyntheticJoystickHandler.JoystickAxesState mJoystickAxesState = null;
        private final android.util.SparseArray<android.view.KeyEvent> mDeviceKeyEvents = null;
        public SyntheticJoystickHandler(android.view.ViewRootImpl p0) { super(); }
        public void handleMessage(android.os.Message p0) {}
        public void process(android.view.MotionEvent p0) {}
        private void cancel() {}
        private void update(android.view.MotionEvent p0) {}

        final class JoystickAxesState {
            private static final int STATE_UP_OR_LEFT = -1;
            private static final int STATE_NEUTRAL = 0;
            private static final int STATE_DOWN_OR_RIGHT = 1;
            final int[] mAxisStatesHat = null;
            final int[] mAxisStatesStick = null;
            JoystickAxesState(android.view.ViewRootImpl.SyntheticJoystickHandler p0) {}
            void resetState() {}
            void updateStateForAxis(android.view.MotionEvent p0, long p1, int p2, float p3) {}
            private boolean isXAxis(int p0) { return false; }
            private boolean isYAxis(int p0) { return false; }
            private int joystickAxisAndStateToKeycode(int p0, int p1) { return 0; }
            private int joystickAxisValueToState(float p0) { return 0; }
        }
    }

    final class SyntheticKeyboardHandler {
        SyntheticKeyboardHandler(android.view.ViewRootImpl p0) {}
        public void process(android.view.KeyEvent p0) {}
    }

    final class SyntheticTouchNavigationHandler extends android.os.Handler {
        private static final java.lang.String LOCAL_TAG = "SyntheticTouchNavigationHandler";
        private static final boolean LOCAL_DEBUG = false;
        private static final float DEFAULT_WIDTH_MILLIMETERS = 48.0f;
        private static final float DEFAULT_HEIGHT_MILLIMETERS = 48.0f;
        private static final int TICK_DISTANCE_MILLIMETERS = 12;
        private static final float MIN_FLING_VELOCITY_TICKS_PER_SECOND = 6.0f;
        private static final float MAX_FLING_VELOCITY_TICKS_PER_SECOND = 20.0f;
        private static final float FLING_TICK_DECAY = 0.800000011920929f;
        private int mCurrentDeviceId;
        private int mCurrentSource;
        private boolean mCurrentDeviceSupported;
        private float mConfigTickDistance;
        private float mConfigMinFlingVelocity;
        private float mConfigMaxFlingVelocity;
        private android.view.VelocityTracker mVelocityTracker;
        private int mActivePointerId;
        private float mStartX;
        private float mStartY;
        private float mLastX;
        private float mLastY;
        private float mAccumulatedX;
        private float mAccumulatedY;
        private boolean mConsumedMovement;
        private long mPendingKeyDownTime;
        private int mPendingKeyCode;
        private int mPendingKeyRepeatCount;
        private int mPendingKeyMetaState;
        private boolean mFlinging;
        private float mFlingVelocity;
        private final java.lang.Runnable mFlingRunnable = null;
        public SyntheticTouchNavigationHandler(android.view.ViewRootImpl p0) { super(); }
        public void process(android.view.MotionEvent p0) {}
        public void cancel(android.view.MotionEvent p0) {}
        private void finishKeys(long p0) {}
        private void finishTracking(long p0) {}
        private void consumeAccumulatedMovement(long p0, int p1) {}
        private float consumeAccumulatedMovement(long p0, int p1, float p2, int p3, int p4) { return 0.0f; }
        private void sendKeyDownOrRepeat(long p0, int p1, int p2) {}
        private void sendKeyUp(long p0) {}
        private boolean startFling(long p0, float p1, float p2) { return false; }
        private boolean postFling(long p0) { return false; }
        private void cancelFling() {}
    }

    final class SyntheticTrackballHandler {
        private final android.view.ViewRootImpl.TrackballAxis mX = null;
        private final android.view.ViewRootImpl.TrackballAxis mY = null;
        private long mLastTime;
        SyntheticTrackballHandler(android.view.ViewRootImpl p0) {}
        public void process(android.view.MotionEvent p0) {}
        public void cancel() {}
    }

    static final class SystemUiVisibilityInfo {
        int seq;
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
        private boolean mDispatched;
        private final android.util.SparseArray<java.lang.ref.WeakReference<android.view.View>> mCapturedKeys = null;
        private java.lang.ref.WeakReference<android.view.View> mCurrentReceiver;
        private UnhandledKeyManager() {}
        boolean dispatch(android.view.View p0, android.view.KeyEvent p1) { return false; }
        void preDispatch(android.view.KeyEvent p0) {}
        boolean preViewDispatch(android.view.KeyEvent p0) { return false; }
    }

    final class ViewPostImeInputStage extends android.view.ViewRootImpl.InputStage {
        public ViewPostImeInputStage(android.view.ViewRootImpl p0, android.view.ViewRootImpl.InputStage p1) { super(null, null); }
        protected int onProcess(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        protected void onDeliverToNext(android.view.ViewRootImpl.QueuedInputEvent p0) {}
        private boolean performFocusNavigation(android.view.KeyEvent p0) { return false; }
        private boolean performKeyboardGroupNavigation(int p0) { return false; }
        private int processKeyEvent(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        private int processPointerEvent(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        private void maybeUpdatePointerIcon(android.view.MotionEvent p0) {}
        private int processTrackballEvent(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        private int processGenericMotionEvent(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
    }

    final class ViewPreImeInputStage extends android.view.ViewRootImpl.InputStage {
        public ViewPreImeInputStage(android.view.ViewRootImpl p0, android.view.ViewRootImpl.InputStage p1) { super(null, null); }
        protected int onProcess(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
        private int processKeyEvent(android.view.ViewRootImpl.QueuedInputEvent p0) { return 0; }
    }

    final class ViewRootHandler extends android.os.Handler {
        ViewRootHandler(android.view.ViewRootImpl p0) { super(); }
        public java.lang.String getMessageName(android.os.Message p0) { return null; }
        public boolean sendMessageAtTime(android.os.Message p0, long p1) { return false; }
        public void handleMessage(android.os.Message p0) {}
    }

    static class W extends android.view.IWindow.Stub {
        private final java.lang.ref.WeakReference<android.view.ViewRootImpl> mViewAncestor = null;
        private final android.view.IWindowSession mWindowSession = null;
        W(android.view.ViewRootImpl p0) { super(); }
        public void resized(android.graphics.Rect p0, android.graphics.Rect p1, android.graphics.Rect p2, android.graphics.Rect p3, boolean p4, android.util.MergedConfiguration p5, android.graphics.Rect p6, boolean p7, boolean p8, int p9, android.view.DisplayCutout.ParcelableWrapper p10) {}
        public void locationInParentDisplayChanged(android.graphics.Point p0) {}
        public void insetsChanged(android.view.InsetsState p0) {}
        public void insetsControlChanged(android.view.InsetsState p0, android.view.InsetsSourceControl[] p1) {}
        public void showInsets(int p0, boolean p1) {}
        public void hideInsets(int p0, boolean p1) {}
        public void moved(int p0, int p1) {}
        public void dispatchAppVisibility(boolean p0) {}
        public void dispatchGetNewSurface() {}
        public void windowFocusChanged(boolean p0, boolean p1) {}
        private static int checkCallingPermission(java.lang.String p0) { return 0; }
        public void executeCommand(java.lang.String p0, java.lang.String p1, android.os.ParcelFileDescriptor p2) {}
        public void closeSystemDialogs(java.lang.String p0) {}
        public void dispatchWallpaperOffsets(float p0, float p1, float p2, float p3, float p4, boolean p5) {}
        public void dispatchWallpaperCommand(java.lang.String p0, int p1, int p2, int p3, android.os.Bundle p4, boolean p5) {}
        public void dispatchDragEvent(android.view.DragEvent p0) {}
        public void updatePointerIcon(float p0, float p1) {}
        public void dispatchSystemUiVisibilityChanged(int p0, int p1, int p2, int p3) {}
        public void dispatchWindowShown() {}
        public void requestAppKeyboardShortcuts(com.android.internal.os.IResultReceiver p0, int p1) {}
        public void dispatchPointerCaptureChanged(boolean p0) {}
        public void requestScrollCapture(android.view.IScrollCaptureController p0) {}
    }

    final class WindowInputEventReceiver extends android.view.InputEventReceiver {
        public WindowInputEventReceiver(android.view.ViewRootImpl p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
        public void onInputEvent(android.view.InputEvent p0) {}
        public void onBatchedInputEventPending(int p0) {}
        public void onFocusEvent(boolean p0, boolean p1) {}
        public void dispose() {}
    }
}
