package com.android.internal.widget;

public class WatchListDecorLayout extends android.widget.FrameLayout implements android.view.ViewTreeObserver.OnScrollChangedListener {
    private int mForegroundPaddingLeft;
    private int mForegroundPaddingTop;
    private int mForegroundPaddingRight;
    private int mForegroundPaddingBottom;
    private final java.util.ArrayList<android.view.View> mMatchParentChildren = null;
    private int mPendingScroll;
    private android.view.View mBottomPanel;
    private android.view.View mTopPanel;
    private android.widget.ListView mListView;
    private android.view.ViewTreeObserver mObserver;
    public WatchListDecorLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public WatchListDecorLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public WatchListDecorLayout(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onAttachedToWindow() {}
    public void onDetachedFromWindow() {}
    private void applyMeasureToChild(android.view.View p0, int p1, int p2) {}
    private int measureAndGetHeight(android.view.View p0, int p1, int p2) { return 0; }
    protected void onMeasure(int p0, int p1) {}
    public void setForegroundGravity(int p0) {}
    private int getPaddingLeftWithForeground() { return 0; }
    private int getPaddingRightWithForeground() { return 0; }
    private int getPaddingTopWithForeground() { return 0; }
    private int getPaddingBottomWithForeground() { return 0; }
    public void onScrollChanged() {}
    private void setScrolling(android.view.View p0, float p1) {}
}
