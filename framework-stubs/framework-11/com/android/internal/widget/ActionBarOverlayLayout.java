package com.android.internal.widget;

public class ActionBarOverlayLayout extends android.view.ViewGroup implements com.android.internal.widget.DecorContentParent {
    private static final java.lang.String TAG = "ActionBarOverlayLayout";
    private int mActionBarHeight;
    private int mWindowVisibility;
    private android.view.View mContent;
    private com.android.internal.widget.ActionBarContainer mActionBarBottom;
    private com.android.internal.widget.ActionBarContainer mActionBarTop;
    private com.android.internal.widget.DecorToolbar mDecorToolbar;
    private android.graphics.drawable.Drawable mWindowContentOverlay;
    private boolean mIgnoreWindowContentOverlay;
    private boolean mOverlayMode;
    private boolean mHasNonEmbeddedTabs;
    private boolean mHideOnContentScroll;
    private boolean mAnimatingForFling;
    private int mHideOnContentScrollReference;
    private int mLastSystemUiVisibility;
    private final android.graphics.Rect mBaseContentInsets = null;
    private final android.graphics.Rect mLastBaseContentInsets = null;
    private final android.graphics.Rect mContentInsets = null;
    private android.view.WindowInsets mBaseInnerInsets;
    private android.view.WindowInsets mLastBaseInnerInsets;
    private android.view.WindowInsets mInnerInsets;
    private android.view.WindowInsets mLastInnerInsets;
    private com.android.internal.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback mActionBarVisibilityCallback;
    private final int ACTION_BAR_ANIMATE_DELAY = 0;
    private android.widget.OverScroller mFlingEstimator;
    private android.view.ViewPropertyAnimator mCurrentActionBarTopAnimator;
    private android.view.ViewPropertyAnimator mCurrentActionBarBottomAnimator;
    private final android.animation.Animator.AnimatorListener mTopAnimatorListener = null;
    private final android.animation.Animator.AnimatorListener mBottomAnimatorListener = null;
    private final java.lang.Runnable mRemoveActionBarHideOffset = null;
    private final java.lang.Runnable mAddActionBarHideOffset = null;
    public static final android.util.Property<com.android.internal.widget.ActionBarOverlayLayout, java.lang.Integer> ACTION_BAR_HIDE_OFFSET = null;
    static final int[] ATTRS = null;
    public ActionBarOverlayLayout(android.content.Context p0) { super((android.content.Context)null); }
    public ActionBarOverlayLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    private void init(android.content.Context p0) {}
    protected void onDetachedFromWindow() {}
    public void setActionBarVisibilityCallback(com.android.internal.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback p0) {}
    public void setOverlayMode(boolean p0) {}
    public boolean isInOverlayMode() { return false; }
    public void setHasNonEmbeddedTabs(boolean p0) {}
    public void setShowingForActionMode(boolean p0) {}
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void onWindowSystemUiVisibilityChanged(int p0) {}
    protected void onWindowVisibilityChanged(int p0) {}
    private boolean applyInsets(android.view.View p0, android.graphics.Rect p1, boolean p2, boolean p3, boolean p4, boolean p5) { return false; }
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets p0) { return null; }
    protected com.android.internal.widget.ActionBarOverlayLayout.LayoutParams generateDefaultLayoutParams() { return null; }
    public com.android.internal.widget.ActionBarOverlayLayout.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void draw(android.graphics.Canvas p0) {}
    public boolean shouldDelayChildPressedState() { return false; }
    public boolean onStartNestedScroll(android.view.View p0, android.view.View p1, int p2) { return false; }
    public void onNestedScrollAccepted(android.view.View p0, android.view.View p1, int p2) {}
    public void onNestedScroll(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public void onStopNestedScroll(android.view.View p0) {}
    public boolean onNestedFling(android.view.View p0, float p1, float p2, boolean p3) { return false; }
    void pullChildren() {}
    private com.android.internal.widget.DecorToolbar getDecorToolbar(android.view.View p0) { return null; }
    public void setHideOnContentScrollEnabled(boolean p0) {}
    public boolean isHideOnContentScrollEnabled() { return false; }
    public int getActionBarHideOffset() { return 0; }
    public void setActionBarHideOffset(int p0) {}
    private void haltActionBarHideOffsetAnimations() {}
    private void postRemoveActionBarHideOffset() {}
    private void postAddActionBarHideOffset() {}
    private void removeActionBarHideOffset() {}
    private void addActionBarHideOffset() {}
    private boolean shouldHideActionBarOnFling(float p0, float p1) { return false; }
    public void setWindowCallback(android.view.Window.Callback p0) {}
    public void setWindowTitle(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getTitle() { return null; }
    public void initFeature(int p0) {}
    public void setUiOptions(int p0) {}
    public boolean hasIcon() { return false; }
    public boolean hasLogo() { return false; }
    public void setIcon(int p0) {}
    public void setIcon(android.graphics.drawable.Drawable p0) {}
    public void setLogo(int p0) {}
    public boolean canShowOverflowMenu() { return false; }
    public boolean isOverflowMenuShowing() { return false; }
    public boolean isOverflowMenuShowPending() { return false; }
    public boolean showOverflowMenu() { return false; }
    public boolean hideOverflowMenu() { return false; }
    public void setMenuPrepared() {}
    public void setMenu(android.view.Menu p0, com.android.internal.view.menu.MenuPresenter.Callback p1) {}
    public void saveToolbarHierarchyState(android.util.SparseArray<android.os.Parcelable> p0) {}
    public void restoreToolbarHierarchyState(android.util.SparseArray<android.os.Parcelable> p0) {}
    public void dismissPopups() {}

    public static interface ActionBarVisibilityCallback {
        public void onWindowVisibilityChanged(int p0);
        public void showForSystem();
        public void hideForSystem();
        public void enableContentAnimations(boolean p0);
        public void onContentScrollStarted();
        public void onContentScrollStopped();
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
    }
}
