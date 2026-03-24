package com.android.internal.policy;

public class DecorView extends android.widget.FrameLayout implements com.android.internal.view.RootViewSurfaceTaker, android.view.WindowCallbacks {
    private static final java.lang.String TAG = "DecorView";
    private static final boolean DEBUG_MEASURE = false;
    private static final boolean SWEEP_OPEN_MENU = false;
    public static final int DECOR_SHADOW_FOCUSED_HEIGHT_IN_DIP = 20;
    public static final int DECOR_SHADOW_UNFOCUSED_HEIGHT_IN_DIP = 5;
    private static final int SCRIM_LIGHT = -419430401;
    public static final com.android.internal.policy.DecorView.ColorViewAttributes STATUS_BAR_COLOR_VIEW_ATTRIBUTES = null;
    public static final com.android.internal.policy.DecorView.ColorViewAttributes NAVIGATION_BAR_COLOR_VIEW_ATTRIBUTES = null;
    private static final android.view.ViewOutlineProvider PIP_OUTLINE_PROVIDER = null;
    private boolean mAllowUpdateElevation;
    private boolean mElevationAdjustedForStack;
    private boolean mIsInPictureInPictureMode;
    private android.view.ViewOutlineProvider mLastOutlineProvider;
    int mDefaultOpacity;
    private final int mFeatureId = 0;
    private final android.graphics.Rect mDrawingBounds = null;
    private final android.graphics.Rect mBackgroundPadding = null;
    private final android.graphics.Rect mFramePadding = null;
    private final android.graphics.Rect mFrameOffsets = null;
    private boolean mHasCaption;
    private boolean mChanging;
    private android.graphics.drawable.Drawable mMenuBackground;
    private boolean mWatchingForMenu;
    private int mDownY;
    android.view.ActionMode mPrimaryActionMode;
    private android.view.ActionMode mFloatingActionMode;
    private com.android.internal.widget.ActionBarContextView mPrimaryActionModeView;
    private android.widget.PopupWindow mPrimaryActionModePopup;
    private java.lang.Runnable mShowPrimaryActionModePopup;
    private android.view.ViewTreeObserver.OnPreDrawListener mFloatingToolbarPreDrawListener;
    private android.view.View mFloatingActionModeOriginatingView;
    private com.android.internal.widget.FloatingToolbar mFloatingToolbar;
    private android.animation.ObjectAnimator mFadeAnim;
    private android.view.View mStatusGuard;
    private final com.android.internal.policy.DecorView.ColorViewState mStatusColorViewState = null;
    private final com.android.internal.policy.DecorView.ColorViewState mNavigationColorViewState = null;
    private final android.view.animation.Interpolator mShowInterpolator = null;
    private final android.view.animation.Interpolator mHideInterpolator = null;
    private final int mBarEnterExitDuration = 0;
    final boolean mForceWindowDrawsBarBackgrounds = false;
    private final int mSemiTransparentBarColor = 0;
    private final com.android.internal.widget.BackgroundFallback mBackgroundFallback = null;
    private int mLastTopInset;
    private int mLastBottomInset;
    private int mLastRightInset;
    private int mLastLeftInset;
    private boolean mLastHasTopStableInset;
    private boolean mLastHasBottomStableInset;
    private boolean mLastHasRightStableInset;
    private boolean mLastHasLeftStableInset;
    private int mLastWindowFlags;
    private boolean mLastShouldAlwaysConsumeSystemBars;
    private int mRootScrollY;
    private com.android.internal.policy.PhoneWindow mWindow;
    android.view.ViewGroup mContentRoot;
    private android.graphics.Rect mTempRect;
    private com.android.internal.widget.DecorCaptionView mDecorCaptionView;
    private boolean mWindowResizeCallbacksAdded;
    private android.graphics.drawable.Drawable.Callback mLastBackgroundDrawableCb;
    private com.android.internal.policy.BackdropFrameRenderer mBackdropFrameRenderer;
    private android.graphics.drawable.Drawable mOriginalBackgroundDrawable;
    private android.graphics.drawable.Drawable mLastOriginalBackgroundDrawable;
    private android.graphics.drawable.Drawable mResizingBackgroundDrawable;
    private com.android.internal.graphics.drawable.BackgroundBlurDrawable mBackgroundBlurDrawable;
    private com.android.internal.graphics.drawable.BackgroundBlurDrawable mLastBackgroundBlurDrawable;
    private android.graphics.drawable.Drawable mPendingWindowBackground;
    private android.graphics.drawable.Drawable mCaptionBackgroundDrawable;
    private android.graphics.drawable.Drawable mUserCaptionBackgroundDrawable;
    private float mAvailableWidth;
    java.lang.String mLogTag;
    private final android.graphics.Rect mFloatingInsets = null;
    private boolean mApplyFloatingVerticalInsets;
    private boolean mApplyFloatingHorizontalInsets;
    private int mResizeMode;
    private final int mResizeShadowSize = 0;
    private final android.graphics.Paint mVerticalResizeShadowPaint = null;
    private final android.graphics.Paint mHorizontalResizeShadowPaint = null;
    private final android.graphics.Paint mLegacyNavigationBarBackgroundPaint = null;
    private android.graphics.Insets mBackgroundInsets;
    private android.graphics.Insets mLastBackgroundInsets;
    private boolean mDrawLegacyNavigationBarBackground;
    private android.view.PendingInsetsController mPendingInsetsController;
    private int mOriginalBackgroundBlurRadius;
    private int mBackgroundBlurRadius;
    private boolean mCrossWindowBlurEnabled;
    private final android.view.ViewTreeObserver.OnPreDrawListener mBackgroundBlurOnPreDrawListener = null;
    private java.util.function.Consumer<java.lang.Boolean> mCrossWindowBlurEnabledListener;
    DecorView(android.content.Context p0, int p1, com.android.internal.policy.PhoneWindow p2, android.view.WindowManager.LayoutParams p3) { super((android.content.Context)null); }
    void setBackgroundFallback(android.graphics.drawable.Drawable p0) {}
    public android.graphics.drawable.Drawable getBackgroundFallback() { return null; }
    android.view.View getStatusBarBackgroundView() { return null; }
    android.view.View getNavigationBarBackgroundView() { return null; }
    public boolean gatherTransparentRegion(android.graphics.Region p0) { return false; }
    boolean gatherTransparentRegion(com.android.internal.policy.DecorView.ColorViewState p0, android.graphics.Region p1) { return false; }
    public void onDraw(android.graphics.Canvas p0) {}
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean superDispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean superDispatchKeyShortcutEvent(android.view.KeyEvent p0) { return false; }
    public boolean superDispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean superDispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean superDispatchGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    private boolean isOutOfInnerBounds(int p0, int p1) { return false; }
    private boolean isOutOfBounds(int p0, int p1) { return false; }
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public void sendAccessibilityEvent(int p0) {}
    public boolean dispatchPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) { return false; }
    protected boolean setFrame(int p0, int p1, int p2, int p3) { return false; }
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void draw(android.graphics.Canvas p0) {}
    public boolean showContextMenuForChild(android.view.View p0) { return false; }
    public boolean showContextMenuForChild(android.view.View p0, float p1, float p2) { return false; }
    private boolean showContextMenuForChildInternal(android.view.View p0, float p1, float p2) { return false; }
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1) { return null; }
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1, int p2) { return null; }
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback p0) { return null; }
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback p0, int p1) { return null; }
    private android.view.ActionMode startActionMode(android.view.View p0, android.view.ActionMode.Callback p1, int p2) { return null; }
    private void cleanupPrimaryActionMode() {}
    private void cleanupFloatingActionModeViews() {}
    void startChanging() {}
    void finishChanging() {}
    public void setWindowBackground(android.graphics.drawable.Drawable p0) {}
    public void setBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    public void setWindowFrame(android.graphics.drawable.Drawable p0) {}
    public void onWindowSystemUiVisibilityChanged(int p0) {}
    public void onSystemBarAppearanceChanged(int p0) {}
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets p0) { return null; }
    public boolean isTransitionGroup() { return false; }
    public static boolean isNavBarToRightEdge(int p0, int p1) { return false; }
    public static boolean isNavBarToLeftEdge(int p0, int p1) { return false; }
    public static int getNavBarSize(int p0, int p1, int p2) { return 0; }
    public static void getNavigationBarRect(int p0, int p1, android.graphics.Rect p2, android.graphics.Rect p3, float p4) {}
    android.view.WindowInsets updateColorViews(android.view.WindowInsets p0, boolean p1) { return null; }
    private void updateBackgroundDrawable() {}
    private void updateBackgroundBlurCorners() {}
    private void updateBackgroundBlurRadius() {}
    void setBackgroundBlurRadius(int p0) {}
    void removeBackgroundBlurDrawable() {}
    public android.graphics.drawable.Drawable getBackground() { return null; }
    private int calculateStatusBarColor(int p0) { return 0; }
    private int calculateNavigationBarColor(int p0) { return 0; }
    public static int calculateBarColor(int p0, int p1, int p2, int p3, int p4, int p5, boolean p6) { return 0; }
    private int getCurrentColor(com.android.internal.policy.DecorView.ColorViewState p0) { return 0; }
    private void updateColorViewInt(com.android.internal.policy.DecorView.ColorViewState p0, int p1, int p2, int p3, boolean p4, boolean p5, int p6, boolean p7, boolean p8, android.view.WindowInsetsController p9) {}
    private static void setColor(android.view.View p0, int p1, int p2, boolean p3, boolean p4) {}
    private void updateColorViewTranslations() {}
    private android.view.WindowInsets updateStatusGuard(android.view.WindowInsets p0) { return null; }
    private void updateStatusGuardColor() {}
    public void updatePictureInPictureOutlineProvider(boolean p0) {}
    public void setOutlineProvider(android.view.ViewOutlineProvider p0) {}
    private void drawableChanged() {}
    public void onWindowFocusChanged(boolean p0) {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    public void onCloseSystemDialogs(java.lang.String p0) {}
    public android.view.SurfaceHolder.Callback2 willYouTakeTheSurface() { return null; }
    public android.view.InputQueue.Callback willYouTakeTheInputQueue() { return null; }
    public void setSurfaceType(int p0) {}
    public void setSurfaceFormat(int p0) {}
    public void setSurfaceKeepScreenOn(boolean p0) {}
    public void onRootViewScrollYChanged(int p0) {}
    public android.view.PendingInsetsController providePendingInsetsController() { return null; }
    private android.view.ActionMode createActionMode(int p0, android.view.ActionMode.Callback2 p1, android.view.View p2) { return null; }
    private void setHandledActionMode(android.view.ActionMode p0) {}
    private android.view.ActionMode createStandaloneActionMode(android.view.ActionMode.Callback p0) { return null; }
    private void endOnGoingFadeAnimation() {}
    private void setHandledPrimaryActionMode(android.view.ActionMode p0) {}
    boolean shouldAnimatePrimaryActionModeView() { return false; }
    private android.view.ActionMode createFloatingActionMode(android.view.View p0, android.view.ActionMode.Callback2 p1) { return null; }
    private void setHandledFloatingActionMode(android.view.ActionMode p0) {}
    void enableCaption(boolean p0) {}
    public void notifyCaptionHeightChanged() {}
    void setWindow(com.android.internal.policy.PhoneWindow p0) {}
    public android.content.res.Resources getResources() { return null; }
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onMovedToDisplay(int p0, android.content.res.Configuration p1) {}
    private boolean isFillingScreen(android.content.res.Configuration p0) { return false; }
    private void updateDecorCaptionStatus(android.content.res.Configuration p0) {}
    void onResourcesLoaded(android.view.LayoutInflater p0, int p1) {}
    private void loadBackgroundDrawablesIfNeeded() {}
    private com.android.internal.widget.DecorCaptionView createDecorCaptionView(android.view.LayoutInflater p0) { return null; }
    private com.android.internal.widget.DecorCaptionView inflateDecorCaptionView(android.view.LayoutInflater p0) { return null; }
    private void setDecorCaptionShade(com.android.internal.widget.DecorCaptionView p0) {}
    void updateDecorCaptionShade() {}
    private void setLightDecorCaptionShade(com.android.internal.widget.DecorCaptionView p0) {}
    private void setDarkDecorCaptionShade(com.android.internal.widget.DecorCaptionView p0) {}
    public static android.graphics.drawable.Drawable getResizingBackgroundDrawable(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1, boolean p2) { return null; }
    private static android.graphics.drawable.Drawable enforceNonTranslucentBackground(android.graphics.drawable.Drawable p0, boolean p1) { return null; }
    void clearContentView() {}
    public void onWindowSizeIsChanging(android.graphics.Rect p0, boolean p1, android.graphics.Rect p2, android.graphics.Rect p3) {}
    public void onWindowDragResizeStart(android.graphics.Rect p0, boolean p1, android.graphics.Rect p2, android.graphics.Rect p3, int p4) {}
    public void onWindowDragResizeEnd() {}
    public boolean onContentDrawn(int p0, int p1, int p2, int p3) { return false; }
    public void onRequestDraw(boolean p0) {}
    public void onPostDraw(android.graphics.RecordingCanvas p0) {}
    private void initResizingPaints() {}
    private void drawResizingShadowIfNeeded(android.graphics.RecordingCanvas p0) {}
    private void drawLegacyNavigationBarBackground(android.graphics.RecordingCanvas p0) {}
    private void releaseThreadedRenderer() {}
    private boolean isResizing() { return false; }
    private void initializeElevation() {}
    private void updateElevation() {}
    boolean isShowingCaption() { return false; }
    int getCaptionHeight() { return 0; }
    public int getCaptionInsetsHeight() { return 0; }
    private float dipToPx(float p0) { return 0.0f; }
    void setUserCaptionBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    private static java.lang.String getTitleSuffix(android.view.WindowManager.LayoutParams p0) { return null; }
    void updateLogTag(android.view.WindowManager.LayoutParams p0) {}
    private void updateAvailableWidth() {}
    public void requestKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> p0, int p1) {}
    public void dispatchPointerCaptureChanged(boolean p0) {}
    public int getAccessibilityViewId() { return 0; }
    public android.view.WindowInsetsController getWindowInsetsController() { return null; }
    public java.lang.String toString() { return null; }

    private class ActionModeCallback2Wrapper extends android.view.ActionMode.Callback2 {
        private final android.view.ActionMode.Callback mWrapped = null;
        public ActionModeCallback2Wrapper(com.android.internal.policy.DecorView p0, android.view.ActionMode.Callback p1) { super(); }
        public boolean onCreateActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
        public boolean onPrepareActionMode(android.view.ActionMode p0, android.view.Menu p1) { return false; }
        public boolean onActionItemClicked(android.view.ActionMode p0, android.view.MenuItem p1) { return false; }
        public void onDestroyActionMode(android.view.ActionMode p0) {}
        public void onGetContentRect(android.view.ActionMode p0, android.view.View p1, android.graphics.Rect p2) {}
    }

    public static class ColorViewAttributes {
        final int id = 0;
        final int translucentFlag = 0;
        final int verticalGravity = 0;
        final int horizontalGravity = 0;
        final int seascapeGravity = 0;
        final java.lang.String transitionName = null;
        final int insetsType = 0;
        private ColorViewAttributes(int p0, int p1, int p2, int p3, java.lang.String p4, int p5, int p6) {}
        public boolean isPresent(boolean p0, int p1, boolean p2) { return false; }
        public boolean isVisible(boolean p0, int p1, int p2, boolean p3) { return false; }
        public boolean isVisible(android.view.InsetsState p0, int p1, int p2, boolean p3) { return false; }
    }

    private static class ColorViewState {
        android.view.View view;
        int targetVisibility;
        boolean present;
        boolean visible;
        int color;
        final com.android.internal.policy.DecorView.ColorViewAttributes attributes = null;
        ColorViewState(com.android.internal.policy.DecorView.ColorViewAttributes p0) {}
    }
}
