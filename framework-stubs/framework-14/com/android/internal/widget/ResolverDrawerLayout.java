package com.android.internal.widget;

public class ResolverDrawerLayout extends android.view.ViewGroup {
    public ResolverDrawerLayout(android.content.Context p0) { super((android.content.Context)null); }
    public ResolverDrawerLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ResolverDrawerLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public void setMaxCollapsedHeight(int p0) {}
    public void setSmallCollapsed(boolean p0) {}
    public boolean isSmallCollapsed() { return false; }
    public boolean isCollapsed() { return false; }
    public void setShowAtTop(boolean p0) {}
    public boolean getShowAtTop() { return false; }
    public void setCollapsed(boolean p0) {}
    public void setCollapsibleHeightReserved(int p0) {}
    public void setDismissLocked(boolean p0) {}
    public void setOnDismissedListener(com.android.internal.widget.ResolverDrawerLayout.OnDismissedListener p0) {}
    public void setOnCollapsedChangedListener(com.android.internal.widget.ResolverDrawerLayout.OnCollapsedChangedListener p0) {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void scrollNestedScrollableChildBackToTop() {}
    public void computeScroll() {}
    void dispatchOnDismissed() {}
    public void requestChildFocus(android.view.View p0, android.view.View p1) {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    public boolean onStartNestedScroll(android.view.View p0, android.view.View p1, int p2) { return false; }
    public void onNestedScrollAccepted(android.view.View p0, android.view.View p1, int p2) {}
    public void onStopNestedScroll(android.view.View p0) {}
    public void onNestedScroll(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public void onNestedPreScroll(android.view.View p0, int p1, int p2, int[] p3) {}
    public boolean onNestedPreFling(android.view.View p0, float p1, float p2) { return false; }
    public boolean onNestedFling(android.view.View p0, float p1, float p2, boolean p3) { return false; }
    public boolean onNestedPrePerformAccessibilityAction(android.view.View p0, int p1, android.os.Bundle p2) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    public void onDrawForeground(android.graphics.Canvas p0) {}
    protected void onMeasure(int p0, int p1) {}
    public int getAlwaysShowHeight() { return 0; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public boolean alwaysShow;
        public boolean ignoreOffset;
        public boolean hasNestedScrollIndicator;
        public int maxHeight;
        int mFixedTop;
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(com.android.internal.widget.ResolverDrawerLayout.LayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.MarginLayoutParams)null); }
    }

    public static interface OnCollapsedChangedListener {
        public void onCollapsedChanged(boolean p0);
    }

    public static interface OnDismissedListener {
        public void onDismissed();
    }

    private class RunOnDismissedListener implements java.lang.Runnable {
        public void run() {}
    }

    static class SavedState extends android.view.View.BaseSavedState {
        boolean open;
        public static final android.os.Parcelable.Creator<com.android.internal.widget.ResolverDrawerLayout.SavedState> CREATOR = null;
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}
