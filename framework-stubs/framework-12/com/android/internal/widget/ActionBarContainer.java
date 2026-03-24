package com.android.internal.widget;

public class ActionBarContainer extends android.widget.FrameLayout {
    private boolean mIsTransitioning;
    private android.view.View mTabContainer;
    private android.view.View mActionBarView;
    private android.view.View mActionContextView;
    private android.graphics.drawable.Drawable mBackground;
    private android.graphics.drawable.Drawable mStackedBackground;
    private android.graphics.drawable.Drawable mSplitBackground;
    private boolean mIsSplit;
    private boolean mIsStacked;
    private int mHeight;
    public ActionBarContainer(android.content.Context p0) { super((android.content.Context)null); }
    public ActionBarContainer(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public void onFinishInflate() {}
    public void setPrimaryBackground(android.graphics.drawable.Drawable p0) {}
    public void setStackedBackground(android.graphics.drawable.Drawable p0) {}
    public void setSplitBackground(android.graphics.drawable.Drawable p0) {}
    public void setVisibility(int p0) {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
    protected void drawableStateChanged() {}
    public void jumpDrawablesToCurrentState() {}
    public void onResolveDrawables(int p0) {}
    public void setTransitioning(boolean p0) {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onHoverEvent(android.view.MotionEvent p0) { return false; }
    public void setTabContainer(com.android.internal.widget.ScrollingTabContainerView p0) {}
    public android.view.View getTabContainer() { return null; }
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1, int p2) { return null; }
    private static boolean isCollapsed(android.view.View p0) { return false; }
    private int getMeasuredHeightWithMargins(android.view.View p0) { return 0; }
    public void onMeasure(int p0, int p1) {}
    public void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}

    private class ActionBarBackgroundDrawable extends android.graphics.drawable.Drawable {
        private ActionBarBackgroundDrawable(com.android.internal.widget.ActionBarContainer p0) { super(); }
        public void draw(android.graphics.Canvas p0) {}
        public void getOutline(android.graphics.Outline p0) {}
        public void setAlpha(int p0) {}
        public void setColorFilter(android.graphics.ColorFilter p0) {}
        public int getOpacity() { return 0; }
    }
}
