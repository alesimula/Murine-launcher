package com.android.internal.widget;

public class ActionBarContextView extends com.android.internal.widget.AbsActionBarView {
    private static final java.lang.String TAG = "ActionBarContextView";
    private java.lang.CharSequence mTitle;
    private java.lang.CharSequence mSubtitle;
    private android.view.View mClose;
    private android.view.View mCustomView;
    private android.widget.LinearLayout mTitleLayout;
    private android.widget.TextView mTitleView;
    private android.widget.TextView mSubtitleView;
    private int mTitleStyleRes;
    private int mSubtitleStyleRes;
    private android.graphics.drawable.Drawable mSplitBackground;
    private boolean mTitleOptional;
    private int mCloseItemLayout;
    public ActionBarContextView(android.content.Context p0) { super((android.content.Context)null); }
    @android.annotation.UnsupportedAppUsage
    public ActionBarContextView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ActionBarContextView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ActionBarContextView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void onDetachedFromWindow() {}
    public void setSplitToolbar(boolean p0) {}
    public void setContentHeight(int p0) {}
    public void setCustomView(android.view.View p0) {}
    public void setTitle(java.lang.CharSequence p0) {}
    public void setSubtitle(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getTitle() { return null; }
    public java.lang.CharSequence getSubtitle() { return null; }
    private void initTitle() {}
    public void initForMode(android.view.ActionMode p0) {}
    public void closeMode() {}
    public void killMode() {}
    public boolean showOverflowMenu() { return false; }
    public boolean hideOverflowMenu() { return false; }
    public boolean isOverflowMenuShowing() { return false; }
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public boolean shouldDelayChildPressedState() { return false; }
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public void setTitleOptional(boolean p0) {}
    public boolean isTitleOptional() { return false; }
}
