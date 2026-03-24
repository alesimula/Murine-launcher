package com.android.internal.widget;

public class ScrollingTabContainerView extends android.widget.HorizontalScrollView implements android.widget.AdapterView.OnItemClickListener {
    private static final java.lang.String TAG = "ScrollingTabContainerView";
    java.lang.Runnable mTabSelector;
    private com.android.internal.widget.ScrollingTabContainerView.TabClickListener mTabClickListener;
    private android.widget.LinearLayout mTabLayout;
    private android.widget.Spinner mTabSpinner;
    private boolean mAllowCollapse;
    int mMaxTabWidth;
    int mStackedTabMaxWidth;
    private int mContentHeight;
    private int mSelectedTabIndex;
    protected android.animation.Animator mVisibilityAnim;
    protected final com.android.internal.widget.ScrollingTabContainerView.VisibilityAnimListener mVisAnimListener = null;
    private static final android.animation.TimeInterpolator sAlphaInterpolator = null;
    private static final int FADE_DURATION = 200;
    public ScrollingTabContainerView(android.content.Context p0) { super((android.content.Context)null); }
    public void onMeasure(int p0, int p1) {}
    private boolean isCollapsed() { return false; }
    public void setAllowCollapse(boolean p0) {}
    private void performCollapse() {}
    private boolean performExpand() { return false; }
    public void setTabSelected(int p0) {}
    public void setContentHeight(int p0) {}
    private android.widget.LinearLayout createTabLayout() { return null; }
    private android.widget.Spinner createSpinner() { return null; }
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void animateToVisibility(int p0) {}
    public void animateToTab(int p0) {}
    public void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    private com.android.internal.widget.ScrollingTabContainerView.TabView createTabView(android.content.Context p0, android.app.ActionBar.Tab p1, boolean p2) { return null; }
    public void addTab(android.app.ActionBar.Tab p0, boolean p1) {}
    public void addTab(android.app.ActionBar.Tab p0, int p1, boolean p2) {}
    public void updateTab(int p0) {}
    public void removeTabAt(int p0) {}
    public void removeAllTabs() {}
    public void onItemClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) {}

    private class TabAdapter extends android.widget.BaseAdapter {
        private android.content.Context mDropDownContext;
        public TabAdapter(com.android.internal.widget.ScrollingTabContainerView p0, android.content.Context p1) { super(); }
        public void setDropDownViewContext(android.content.Context p0) {}
        public int getCount() { return 0; }
        public java.lang.Object getItem(int p0) { return null; }
        public long getItemId(int p0) { return 0L; }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        public android.view.View getDropDownView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    }

    private class TabClickListener implements android.view.View.OnClickListener {
        private TabClickListener(com.android.internal.widget.ScrollingTabContainerView p0) {}
        public void onClick(android.view.View p0) {}
    }

    private class TabView extends android.widget.LinearLayout {
        private android.app.ActionBar.Tab mTab;
        private android.widget.TextView mTextView;
        private android.widget.ImageView mIconView;
        private android.view.View mCustomView;
        public TabView(com.android.internal.widget.ScrollingTabContainerView p0, android.content.Context p1, android.app.ActionBar.Tab p2, boolean p3) { super((android.content.Context)null); }
        public void bindTab(android.app.ActionBar.Tab p0) {}
        public void setSelected(boolean p0) {}
        public java.lang.CharSequence getAccessibilityClassName() { return null; }
        public void onMeasure(int p0, int p1) {}
        public void update() {}
        public android.app.ActionBar.Tab getTab() { return null; }
    }

    protected class VisibilityAnimListener implements android.animation.Animator.AnimatorListener {
        private boolean mCanceled;
        private int mFinalVisibility;
        protected VisibilityAnimListener(com.android.internal.widget.ScrollingTabContainerView p0) {}
        public com.android.internal.widget.ScrollingTabContainerView.VisibilityAnimListener withFinalVisibility(int p0) { return null; }
        public void onAnimationStart(android.animation.Animator p0) {}
        public void onAnimationEnd(android.animation.Animator p0) {}
        public void onAnimationCancel(android.animation.Animator p0) {}
        public void onAnimationRepeat(android.animation.Animator p0) {}
    }
}
