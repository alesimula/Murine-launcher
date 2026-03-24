package android.view;

public abstract class Window {
    public static final int FEATURE_OPTIONS_PANEL = 0;
    public static final int FEATURE_NO_TITLE = 1;
    @java.lang.Deprecated
    public static final int FEATURE_PROGRESS = 2;
    public static final int FEATURE_LEFT_ICON = 3;
    public static final int FEATURE_RIGHT_ICON = 4;
    @java.lang.Deprecated
    public static final int FEATURE_INDETERMINATE_PROGRESS = 5;
    public static final int FEATURE_CONTEXT_MENU = 6;
    public static final int FEATURE_CUSTOM_TITLE = 7;
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    @java.lang.Deprecated
    public static final int FEATURE_SWIPE_TO_DISMISS = 11;
    public static final int FEATURE_CONTENT_TRANSITIONS = 12;
    public static final int FEATURE_ACTIVITY_TRANSITIONS = 13;
    public static final int FEATURE_MAX = 13;
    @java.lang.Deprecated
    public static final int PROGRESS_VISIBILITY_ON = -1;
    @java.lang.Deprecated
    public static final int PROGRESS_VISIBILITY_OFF = -2;
    @java.lang.Deprecated
    public static final int PROGRESS_INDETERMINATE_ON = -3;
    @java.lang.Deprecated
    public static final int PROGRESS_INDETERMINATE_OFF = -4;
    @java.lang.Deprecated
    public static final int PROGRESS_START = 0;
    @java.lang.Deprecated
    public static final int PROGRESS_END = 10000;
    @java.lang.Deprecated
    public static final int PROGRESS_SECONDARY_START = 20000;
    @java.lang.Deprecated
    public static final int PROGRESS_SECONDARY_END = 30000;
    public static final java.lang.String STATUS_BAR_BACKGROUND_TRANSITION_NAME = "android:status:background";
    public static final java.lang.String NAVIGATION_BAR_BACKGROUND_TRANSITION_NAME = "android:navigation:background";
    @java.lang.Deprecated
    protected static final int DEFAULT_FEATURES = 65;
    public static final int ID_ANDROID_CONTENT = 16908290;
    public static final int DECOR_CAPTION_SHADE_AUTO = 0;
    public static final int DECOR_CAPTION_SHADE_LIGHT = 1;
    public static final int DECOR_CAPTION_SHADE_DARK = 2;
    private final android.content.Context mContext = null;
    private android.content.res.TypedArray mWindowStyle;
    private android.view.Window.Callback mCallback;
    private android.view.Window.OnWindowDismissedCallback mOnWindowDismissedCallback;
    private android.view.Window.OnWindowSwipeDismissedCallback mOnWindowSwipeDismissedCallback;
    private android.view.Window.WindowControllerCallback mWindowControllerCallback;
    private android.view.Window.OnRestrictedCaptionAreaChangedListener mOnRestrictedCaptionAreaChangedListener;
    private android.graphics.Rect mRestrictedCaptionAreaRect;
    private android.view.WindowManager mWindowManager;
    private android.os.IBinder mAppToken;
    private java.lang.String mAppName;
    private boolean mHardwareAccelerated;
    private android.view.Window mContainer;
    private android.view.Window mActiveChild;
    private boolean mIsActive;
    private boolean mHasChildren;
    private boolean mCloseOnTouchOutside;
    private boolean mSetCloseOnTouchOutside;
    private int mForcedWindowFlags;
    private int mFeatures;
    private int mLocalFeatures;
    private boolean mHaveWindowFormat;
    private boolean mHaveDimAmount;
    private int mDefaultWindowFormat;
    private boolean mHasSoftInputMode;
    private boolean mDestroyed;
    private boolean mOverlayWithDecorCaptionEnabled;
    private boolean mCloseOnSwipeEnabled;
    private final android.view.WindowManager.LayoutParams mWindowAttributes = null;
    public Window(android.content.Context p0) {}
    public final android.content.Context getContext() { return null; }
    public final android.content.res.TypedArray getWindowStyle() { return null; }
    public void setContainer(android.view.Window p0) {}
    public final android.view.Window getContainer() { return null; }
    public final boolean hasChildren() { return false; }
    public final void destroy() {}
    public final boolean isDestroyed() { return false; }
    public void setWindowManager(android.view.WindowManager p0, android.os.IBinder p1, java.lang.String p2) {}
    public void setWindowManager(android.view.WindowManager p0, android.os.IBinder p1, java.lang.String p2, boolean p3) {}
    void adjustLayoutParamsForSubWindow(android.view.WindowManager.LayoutParams p0) {}
    public android.view.WindowManager getWindowManager() { return null; }
    public void setCallback(android.view.Window.Callback p0) {}
    public final android.view.Window.Callback getCallback() { return null; }
    public final void addOnFrameMetricsAvailableListener(android.view.Window.OnFrameMetricsAvailableListener p0, android.os.Handler p1) {}
    public final void removeOnFrameMetricsAvailableListener(android.view.Window.OnFrameMetricsAvailableListener p0) {}
    public final void setOnWindowDismissedCallback(android.view.Window.OnWindowDismissedCallback p0) {}
    public final void dispatchOnWindowDismissed(boolean p0, boolean p1) {}
    public final void setOnWindowSwipeDismissedCallback(android.view.Window.OnWindowSwipeDismissedCallback p0) {}
    public final void dispatchOnWindowSwipeDismissed() {}
    public final void setWindowControllerCallback(android.view.Window.WindowControllerCallback p0) {}
    public final android.view.Window.WindowControllerCallback getWindowControllerCallback() { return null; }
    public final void setRestrictedCaptionAreaListener(android.view.Window.OnRestrictedCaptionAreaChangedListener p0) {}
    public abstract void takeSurface(android.view.SurfaceHolder.Callback2 p0);
    public abstract void takeInputQueue(android.view.InputQueue.Callback p0);
    public abstract boolean isFloating();
    public void setLayout(int p0, int p1) {}
    public void setGravity(int p0) {}
    public void setType(int p0) {}
    public void setFormat(int p0) {}
    public void setWindowAnimations(int p0) {}
    public void setSoftInputMode(int p0) {}
    public void addFlags(int p0) {}
    public void addPrivateFlags(int p0) {}
    @android.annotation.SystemApi
    public void addSystemFlags(int p0) {}
    public void clearFlags(int p0) {}
    public void setFlags(int p0, int p1) {}
    private void setPrivateFlags(int p0, int p1) {}
    protected void dispatchWindowAttributesChanged(android.view.WindowManager.LayoutParams p0) {}
    public void setColorMode(int p0) {}
    public void setPreferMinimalPostProcessing(boolean p0) {}
    public int getColorMode() { return 0; }
    public boolean isWideColorGamut() { return false; }
    public void setDimAmount(float p0) {}
    public void setDecorFitsSystemWindows(boolean p0) {}
    public void setAttributes(android.view.WindowManager.LayoutParams p0) {}
    public final android.view.WindowManager.LayoutParams getAttributes() { return null; }
    protected final int getForcedWindowFlags() { return 0; }
    protected final boolean hasSoftInputMode() { return false; }
    public void setCloseOnTouchOutside(boolean p0) {}
    public void setCloseOnTouchOutsideIfNotSet(boolean p0) {}
    public abstract void alwaysReadCloseOnTouchAttr();
    public boolean shouldCloseOnTouch(android.content.Context p0, android.view.MotionEvent p1) { return false; }
    public void setSustainedPerformanceMode(boolean p0) {}
    private boolean isOutOfBounds(android.content.Context p0, android.view.MotionEvent p1) { return false; }
    public boolean requestFeature(int p0) { return false; }
    protected void removeFeature(int p0) {}
    public final void makeActive() {}
    public final boolean isActive() { return false; }
    public <T extends android.view.View> T findViewById(int p0) { return null; }
    public final <T extends android.view.View> T requireViewById(int p0) { return null; }
    public abstract void setContentView(int p0);
    public abstract void setContentView(android.view.View p0);
    public abstract void setContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1);
    public abstract void addContentView(android.view.View p0, android.view.ViewGroup.LayoutParams p1);
    public abstract void clearContentView();
    public abstract android.view.View getCurrentFocus();
    public abstract android.view.LayoutInflater getLayoutInflater();
    public abstract void setTitle(java.lang.CharSequence p0);
    @java.lang.Deprecated
    public abstract void setTitleColor(int p0);
    public abstract void openPanel(int p0, android.view.KeyEvent p1);
    public abstract void closePanel(int p0);
    public abstract void togglePanel(int p0, android.view.KeyEvent p1);
    public abstract void invalidatePanelMenu(int p0);
    public abstract boolean performPanelShortcut(int p0, int p1, android.view.KeyEvent p2, int p3);
    public abstract boolean performPanelIdentifierAction(int p0, int p1, int p2);
    public abstract void closeAllPanels();
    public abstract boolean performContextMenuIdentifierAction(int p0, int p1);
    public abstract void onConfigurationChanged(android.content.res.Configuration p0);
    public void setElevation(float p0) {}
    public float getElevation() { return 0.0f; }
    public void setClipToOutline(boolean p0) {}
    public void setBackgroundDrawableResource(int p0) {}
    public abstract void setBackgroundDrawable(android.graphics.drawable.Drawable p0);
    public abstract void setFeatureDrawableResource(int p0, int p1);
    public abstract void setFeatureDrawableUri(int p0, android.net.Uri p1);
    public abstract void setFeatureDrawable(int p0, android.graphics.drawable.Drawable p1);
    public abstract void setFeatureDrawableAlpha(int p0, int p1);
    public abstract void setFeatureInt(int p0, int p1);
    public abstract void takeKeyEvents(boolean p0);
    public abstract boolean superDispatchKeyEvent(android.view.KeyEvent p0);
    public abstract boolean superDispatchKeyShortcutEvent(android.view.KeyEvent p0);
    public abstract boolean superDispatchTouchEvent(android.view.MotionEvent p0);
    public abstract boolean superDispatchTrackballEvent(android.view.MotionEvent p0);
    public abstract boolean superDispatchGenericMotionEvent(android.view.MotionEvent p0);
    public abstract android.view.View getDecorView();
    public android.view.View getStatusBarBackgroundView() { return null; }
    public android.view.View getNavigationBarBackgroundView() { return null; }
    public abstract android.view.View peekDecorView();
    public abstract android.os.Bundle saveHierarchyState();
    public abstract void restoreHierarchyState(android.os.Bundle p0);
    protected abstract void onActive();
    protected final int getFeatures() { return 0; }
    public static int getDefaultFeatures(android.content.Context p0) { return 0; }
    public boolean hasFeature(int p0) { return false; }
    protected final int getLocalFeatures() { return 0; }
    protected void setDefaultWindowFormat(int p0) {}
    protected boolean haveDimAmount() { return false; }
    public abstract void setChildDrawable(int p0, android.graphics.drawable.Drawable p1);
    public abstract void setChildInt(int p0, int p1);
    public abstract boolean isShortcutKey(int p0, android.view.KeyEvent p1);
    public abstract void setVolumeControlStream(int p0);
    public abstract int getVolumeControlStream();
    public void setMediaController(android.media.session.MediaController p0) {}
    public android.media.session.MediaController getMediaController() { return null; }
    public void setUiOptions(int p0) {}
    public void setUiOptions(int p0, int p1) {}
    public void setIcon(int p0) {}
    public void setDefaultIcon(int p0) {}
    public void setLogo(int p0) {}
    public void setDefaultLogo(int p0) {}
    public void setLocalFocus(boolean p0, boolean p1) {}
    public void injectInputEvent(android.view.InputEvent p0) {}
    public android.transition.TransitionManager getTransitionManager() { return null; }
    public void setTransitionManager(android.transition.TransitionManager p0) {}
    public android.transition.Scene getContentScene() { return null; }
    public void setEnterTransition(android.transition.Transition p0) {}
    public void setReturnTransition(android.transition.Transition p0) {}
    public void setExitTransition(android.transition.Transition p0) {}
    public void setReenterTransition(android.transition.Transition p0) {}
    public android.transition.Transition getEnterTransition() { return null; }
    public android.transition.Transition getReturnTransition() { return null; }
    public android.transition.Transition getExitTransition() { return null; }
    public android.transition.Transition getReenterTransition() { return null; }
    public void setSharedElementEnterTransition(android.transition.Transition p0) {}
    public void setSharedElementReturnTransition(android.transition.Transition p0) {}
    public android.transition.Transition getSharedElementEnterTransition() { return null; }
    public android.transition.Transition getSharedElementReturnTransition() { return null; }
    public void setSharedElementExitTransition(android.transition.Transition p0) {}
    public void setSharedElementReenterTransition(android.transition.Transition p0) {}
    public android.transition.Transition getSharedElementExitTransition() { return null; }
    public android.transition.Transition getSharedElementReenterTransition() { return null; }
    public void setAllowEnterTransitionOverlap(boolean p0) {}
    public boolean getAllowEnterTransitionOverlap() { return false; }
    public void setAllowReturnTransitionOverlap(boolean p0) {}
    public boolean getAllowReturnTransitionOverlap() { return false; }
    public long getTransitionBackgroundFadeDuration() { return 0L; }
    public void setTransitionBackgroundFadeDuration(long p0) {}
    public boolean getSharedElementsUseOverlay() { return false; }
    public void setSharedElementsUseOverlay(boolean p0) {}
    public abstract int getStatusBarColor();
    public abstract void setStatusBarColor(int p0);
    public abstract int getNavigationBarColor();
    public abstract void setNavigationBarColor(int p0);
    public void setNavigationBarDividerColor(int p0) {}
    public int getNavigationBarDividerColor() { return 0; }
    public void setStatusBarContrastEnforced(boolean p0) {}
    public boolean isStatusBarContrastEnforced() { return false; }
    public void setNavigationBarContrastEnforced(boolean p0) {}
    public boolean isNavigationBarContrastEnforced() { return false; }
    public void setSystemGestureExclusionRects(java.util.List<android.graphics.Rect> p0) {}
    public java.util.List<android.graphics.Rect> getSystemGestureExclusionRects() { return null; }
    public void requestScrollCapture(android.view.IScrollCaptureController p0) {}
    public void addScrollCaptureCallback(android.view.ScrollCaptureCallback p0) {}
    public void removeScrollCaptureCallback(android.view.ScrollCaptureCallback p0) {}
    public void setTheme(int p0) {}
    public void setOverlayWithDecorCaptionEnabled(boolean p0) {}
    public boolean isOverlayWithDecorCaptionEnabled() { return false; }
    public void notifyRestrictedCaptionAreaCallback(int p0, int p1, int p2, int p3) {}
    public abstract void setDecorCaptionShade(int p0);
    public abstract void setResizingCaptionDrawable(android.graphics.drawable.Drawable p0);
    public abstract void onMultiWindowModeChanged();
    public abstract void onPictureInPictureModeChanged(boolean p0);
    public abstract void reportActivityRelaunched();
    public android.view.WindowInsetsController getInsetsController() { return null; }

    public static interface Callback {
        public boolean dispatchKeyEvent(android.view.KeyEvent p0);
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent p0);
        public boolean dispatchTouchEvent(android.view.MotionEvent p0);
        public boolean dispatchTrackballEvent(android.view.MotionEvent p0);
        public boolean dispatchGenericMotionEvent(android.view.MotionEvent p0);
        public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0);
        public android.view.View onCreatePanelView(int p0);
        public boolean onCreatePanelMenu(int p0, android.view.Menu p1);
        public boolean onPreparePanel(int p0, android.view.View p1, android.view.Menu p2);
        public boolean onMenuOpened(int p0, android.view.Menu p1);
        public boolean onMenuItemSelected(int p0, android.view.MenuItem p1);
        public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams p0);
        public void onContentChanged();
        public void onWindowFocusChanged(boolean p0);
        public void onAttachedToWindow();
        public void onDetachedFromWindow();
        public void onPanelClosed(int p0, android.view.Menu p1);
        public boolean onSearchRequested();
        public boolean onSearchRequested(android.view.SearchEvent p0);
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback p0);
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback p0, int p1);
        public void onActionModeStarted(android.view.ActionMode p0);
        public void onActionModeFinished(android.view.ActionMode p0);
        default public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> p0, android.view.Menu p1, int p2) {}
        default public void onPointerCaptureChanged(boolean p0) {}
    }

    public static interface OnContentApplyWindowInsetsListener {
        public android.util.Pair<android.graphics.Insets, android.view.WindowInsets> onContentApplyWindowInsets(android.view.View p0, android.view.WindowInsets p1);
    }

    public static interface OnFrameMetricsAvailableListener {
        public void onFrameMetricsAvailable(android.view.Window p0, android.view.FrameMetrics p1, int p2);
    }

    public static interface OnRestrictedCaptionAreaChangedListener {
        public void onRestrictedCaptionAreaChanged(android.graphics.Rect p0);
    }

    public static interface OnWindowDismissedCallback {
        public void onWindowDismissed(boolean p0, boolean p1);
    }

    public static interface OnWindowSwipeDismissedCallback {
        public void onWindowSwipeDismissed();
    }

    public static interface WindowControllerCallback {
        public void toggleFreeformWindowingMode() throws android.os.RemoteException;
        public void enterPictureInPictureModeIfPossible();
        public boolean isTaskRoot();
        public void updateStatusBarColor(int p0);
        public void updateNavigationBarColor(int p0);
    }
}
