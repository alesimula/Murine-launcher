package com.android.internal.widget;

public class ScrollingTabContainerView extends android.widget.HorizontalScrollView implements android.widget.AdapterView.OnItemClickListener {
    java.lang.Runnable mTabSelector;
    int mMaxTabWidth;
    int mStackedTabMaxWidth;
    protected android.animation.Animator mVisibilityAnim;
    protected final com.android.internal.widget.ScrollingTabContainerView.VisibilityAnimListener mVisAnimListener = null;
    public ScrollingTabContainerView(android.content.Context p0) { super((android.content.Context)null); }
    public void onMeasure(int p0, int p1) {}
    public void setAllowCollapse(boolean p0) {}
    public void setTabSelected(int p0) {}
    public void setContentHeight(int p0) {}
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    public void animateToVisibility(int p0) {}
    public void animateToTab(int p0) {}
    public void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    public void addTab(android.app.ActionBar.Tab p0, boolean p1) {}
    public void addTab(android.app.ActionBar.Tab p0, int p1, boolean p2) {}
    public void updateTab(int p0) {}
    public void removeTabAt(int p0) {}
    public void removeAllTabs() {}
    public void onItemClick(android.widget.AdapterView<?> p0, android.view.View p1, int p2, long p3) {}

    private class TabAdapter extends android.widget.BaseAdapter {
        public TabAdapter(com.android.internal.widget.ScrollingTabContainerView p0, android.content.Context p1) { super(); }
        public void setDropDownViewContext(android.content.Context p0) {}
        public int getCount() { return 0; }
        public java.lang.Object getItem(int p0) { return null; }
        public long getItemId(int p0) { return 0L; }
        public android.view.View getView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
        public android.view.View getDropDownView(int p0, android.view.View p1, android.view.ViewGroup p2) { return null; }
    }

    private class TabClickListener implements android.view.View.OnClickListener {
        public void onClick(android.view.View p0) {}
    }

    private class TabView extends android.widget.LinearLayout {
        public TabView(com.android.internal.widget.ScrollingTabContainerView p0, android.content.Context p1, android.app.ActionBar.Tab p2, boolean p3) { super((android.content.Context)null); }
        public void bindTab(android.app.ActionBar.Tab p0) {}
        public void setSelected(boolean p0) {}
        public java.lang.CharSequence getAccessibilityClassName() { return null; }
        public void onMeasure(int p0, int p1) {}
        public void update() {}
        public android.app.ActionBar.Tab getTab() { return null; }
    }

    protected class VisibilityAnimListener implements android.animation.Animator.AnimatorListener {
        protected VisibilityAnimListener(com.android.internal.widget.ScrollingTabContainerView p0) {}
        public com.android.internal.widget.ScrollingTabContainerView.VisibilityAnimListener withFinalVisibility(int p0) { return null; }
        public void onAnimationStart(android.animation.Animator p0) {}
        public void onAnimationEnd(android.animation.Animator p0) {}
        public void onAnimationCancel(android.animation.Animator p0) {}
        public void onAnimationRepeat(android.animation.Animator p0) {}
    }
}
