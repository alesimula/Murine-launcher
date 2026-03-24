package com.android.internal.policy;

public class DecorView extends android.widget.FrameLayout implements com.android.internal.view.RootViewSurfaceTaker, android.view.WindowCallbacks {
    public static final int DECOR_SHADOW_FOCUSED_HEIGHT_IN_DIP = 20;
    public static final int DECOR_SHADOW_UNFOCUSED_HEIGHT_IN_DIP = 5;
    public static final com.android.internal.policy.DecorView.ColorViewAttributes STATUS_BAR_COLOR_VIEW_ATTRIBUTES = null;
    public static final com.android.internal.policy.DecorView.ColorViewAttributes NAVIGATION_BAR_COLOR_VIEW_ATTRIBUTES = null;
    int mDefaultOpacity;
    android.view.ActionMode mPrimaryActionMode;
    final boolean mForceWindowDrawsBarBackgrounds = false;
    android.view.ViewGroup mContentRoot;
    java.lang.String mLogTag;
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
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public void sendAccessibilityEvent(int p0) {}
    public boolean dispatchPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) { return false; }
    protected boolean setFrame(int p0, int p1, int p2, int p3) { return false; }
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void draw(android.graphics.Canvas p0) {}
    public boolean showContextMenuForChild(android.view.View p0) { return false; }
    public boolean showContextMenuForChild(android.view.View p0, float p1, float p2) { return false; }
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1) { return null; }
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1, int p2) { return null; }
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback p0) { return null; }
    public android.view.ActionMode startActionMode(android.view.ActionMode.Callback p0, int p1) { return null; }
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
    void setBackgroundBlurRadius(int p0) {}
    void removeBackgroundBlurDrawable() {}
    public android.graphics.drawable.Drawable getBackground() { return null; }
    public static int calculateBarColor(int p0, int p1, int p2, int p3, int p4, int p5, boolean p6) { return 0; }
    public void updatePictureInPictureOutlineProvider(boolean p0) {}
    public void setOutlineProvider(android.view.ViewOutlineProvider p0) {}
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
    boolean shouldAnimatePrimaryActionModeView() { return false; }
    void enableCaption(boolean p0) {}
    public void notifyCaptionHeightChanged() {}
    void setWindow(com.android.internal.policy.PhoneWindow p0) {}
    public android.content.res.Resources getResources() { return null; }
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onMovedToDisplay(int p0, android.content.res.Configuration p1) {}
    void onResourcesLoaded(android.view.LayoutInflater p0, int p1) {}
    void updateDecorCaptionShade() {}
    public static android.graphics.drawable.Drawable getResizingBackgroundDrawable(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1, boolean p2) { return null; }
    void clearContentView() {}
    public void onWindowSizeIsChanging(android.graphics.Rect p0, boolean p1, android.graphics.Rect p2, android.graphics.Rect p3) {}
    public void onWindowDragResizeStart(android.graphics.Rect p0, boolean p1, android.graphics.Rect p2, android.graphics.Rect p3) {}
    public void onWindowDragResizeEnd() {}
    public boolean onContentDrawn(int p0, int p1, int p2, int p3) { return false; }
    public void onRequestDraw(boolean p0) {}
    public void onPostDraw(android.graphics.RecordingCanvas p0) {}
    boolean isShowingCaption() { return false; }
    int getCaptionHeight() { return 0; }
    public int getCaptionInsetsHeight() { return 0; }
    void setUserCaptionBackgroundDrawable(android.graphics.drawable.Drawable p0) {}
    void updateLogTag(android.view.WindowManager.LayoutParams p0) {}
    public void requestKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> p0, int p1) {}
    public void dispatchPointerCaptureChanged(boolean p0) {}
    public int getAccessibilityViewId() { return 0; }
    public android.view.WindowInsetsController getWindowInsetsController() { return null; }
    public java.lang.String toString() { return null; }

    private class ActionModeCallback2Wrapper extends android.view.ActionMode.Callback2 {
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
        public boolean isPresent(boolean p0, int p1, boolean p2) { return false; }
        public boolean isVisible(boolean p0, int p1, int p2, boolean p3) { return false; }
        public boolean isVisible(int p0, int p1, int p2, boolean p3) { return false; }
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
