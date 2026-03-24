package com.android.internal.widget;

public abstract class AbsActionBarView extends android.view.ViewGroup {
    private static final android.animation.TimeInterpolator sAlphaInterpolator = null;
    private static final int FADE_DURATION = 200;
    protected final com.android.internal.widget.AbsActionBarView.VisibilityAnimListener mVisAnimListener = null;
    protected final android.content.Context mPopupContext = null;
    protected android.widget.ActionMenuView mMenuView;
    protected android.widget.ActionMenuPresenter mActionMenuPresenter;
    protected android.view.ViewGroup mSplitView;
    protected boolean mSplitActionBar;
    protected boolean mSplitWhenNarrow;
    protected int mContentHeight;
    protected android.animation.Animator mVisibilityAnim;
    private boolean mEatingTouch;
    private boolean mEatingHover;
    public AbsActionBarView(android.content.Context p0) { super((android.content.Context)null); }
    public AbsActionBarView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public AbsActionBarView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public AbsActionBarView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onHoverEvent(android.view.MotionEvent p0) { return false; }
    public void setSplitToolbar(boolean p0) {}
    public void setSplitWhenNarrow(boolean p0) {}
    public void setContentHeight(int p0) {}
    public int getContentHeight() { return 0; }
    public void setSplitView(android.view.ViewGroup p0) {}
    public int getAnimatedVisibility() { return 0; }
    public android.animation.Animator setupAnimatorToVisibility(int p0, long p1) { return null; }
    public void animateToVisibility(int p0) {}
    public void setVisibility(int p0) {}
    public boolean showOverflowMenu() { return false; }
    public void postShowOverflowMenu() {}
    public boolean hideOverflowMenu() { return false; }
    public boolean isOverflowMenuShowing() { return false; }
    public boolean isOverflowMenuShowPending() { return false; }
    public boolean isOverflowReserved() { return false; }
    public boolean canShowOverflowMenu() { return false; }
    public void dismissPopupMenus() {}
    protected int measureChildView(android.view.View p0, int p1, int p2, int p3) { return 0; }
    protected static int next(int p0, int p1, boolean p2) { return 0; }
    protected int positionChild(android.view.View p0, int p1, int p2, int p3, boolean p4) { return 0; }

    protected class VisibilityAnimListener implements android.animation.Animator.AnimatorListener {
        private boolean mCanceled;
        int mFinalVisibility;
        protected VisibilityAnimListener(com.android.internal.widget.AbsActionBarView p0) {}
        public com.android.internal.widget.AbsActionBarView.VisibilityAnimListener withFinalVisibility(int p0) { return null; }
        public void onAnimationStart(android.animation.Animator p0) {}
        public void onAnimationEnd(android.animation.Animator p0) {}
        public void onAnimationCancel(android.animation.Animator p0) {}
        public void onAnimationRepeat(android.animation.Animator p0) {}
    }
}
