package com.android.internal.widget;

public class ViewPager extends android.view.ViewGroup {
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_SETTLING = 2;
    public ViewPager(android.content.Context p0) { super((android.content.Context)null); }
    public ViewPager(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ViewPager(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ViewPager(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onDetachedFromWindow() {}
    public void setAdapter(com.android.internal.widget.PagerAdapter p0) {}
    public com.android.internal.widget.PagerAdapter getAdapter() { return null; }
    void setOnAdapterChangeListener(com.android.internal.widget.ViewPager.OnAdapterChangeListener p0) {}
    public void setCurrentItem(int p0) {}
    public void setCurrentItem(int p0, boolean p1) {}
    public int getCurrentItem() { return 0; }
    boolean setCurrentItemInternal(int p0, boolean p1, boolean p2) { return false; }
    boolean setCurrentItemInternal(int p0, boolean p1, boolean p2, int p3) { return false; }
    public void setOnPageChangeListener(com.android.internal.widget.ViewPager.OnPageChangeListener p0) {}
    public void setPageTransformer(boolean p0, com.android.internal.widget.ViewPager.PageTransformer p1) {}
    protected int getChildDrawingOrder(int p0, int p1) { return 0; }
    com.android.internal.widget.ViewPager.OnPageChangeListener setInternalPageChangeListener(com.android.internal.widget.ViewPager.OnPageChangeListener p0) { return null; }
    public int getOffscreenPageLimit() { return 0; }
    public void setOffscreenPageLimit(int p0) {}
    public void setPageMargin(int p0) {}
    public int getPageMargin() { return 0; }
    public void setPageMarginDrawable(android.graphics.drawable.Drawable p0) {}
    public void setPageMarginDrawable(int p0) {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
    protected void drawableStateChanged() {}
    float distanceInfluenceForSnapDuration(float p0) { return 0.0f; }
    void smoothScrollTo(int p0, int p1) {}
    void smoothScrollTo(int p0, int p1, int p2) {}
    com.android.internal.widget.ViewPager.ItemInfo addNewItem(int p0, int p1) { return null; }
    void dataSetChanged() {}
    public void populate() {}
    void populate(int p0) {}
    public android.os.Parcelable onSaveInstanceState() { return null; }
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    public void addView(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) {}
    public java.lang.Object getCurrent() { return null; }
    public void removeView(android.view.View p0) {}
    com.android.internal.widget.ViewPager.ItemInfo infoForChild(android.view.View p0) { return null; }
    com.android.internal.widget.ViewPager.ItemInfo infoForAnyChild(android.view.View p0) { return null; }
    com.android.internal.widget.ViewPager.ItemInfo infoForPosition(int p0) { return null; }
    protected void onAttachedToWindow() {}
    protected void onMeasure(int p0, int p1) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void computeScroll() {}
    protected void onPageScrolled(int p0, float p1, int p2) {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void draw(android.graphics.Canvas p0) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    public boolean canScrollHorizontally(int p0) { return false; }
    protected boolean canScroll(android.view.View p0, boolean p1, int p2, int p3, int p4) { return false; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean executeKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean arrowScroll(int p0) { return false; }
    boolean pageLeft() { return false; }
    boolean pageRight() { return false; }
    public void onRtlPropertiesChanged(int p0) {}
    public void addFocusables(java.util.ArrayList<android.view.View> p0, int p1, int p2) {}
    public void addTouchables(java.util.ArrayList<android.view.View> p0) {}
    protected boolean onRequestFocusInDescendants(int p0, android.graphics.Rect p1) { return false; }
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent p0) {}
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean performAccessibilityAction(int p0, android.os.Bundle p1) { return false; }

    static interface Decor {
    }

    static class ItemInfo {
        java.lang.Object object;
        boolean scrolling;
        float widthFactor;
        int position;
        float offset;
        ItemInfo() {}
    }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        public boolean isDecor;
        public int gravity;
        float widthFactor;
        boolean needsMeasure;
        int position;
        int childIndex;
        public LayoutParams() { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
    }

    static interface OnAdapterChangeListener {
        public void onAdapterChanged(com.android.internal.widget.PagerAdapter p0, com.android.internal.widget.PagerAdapter p1);
    }

    public static interface OnPageChangeListener {
        public void onPageScrolled(int p0, float p1, int p2);
        public void onPageSelected(int p0);
        public void onPageScrollStateChanged(int p0);
    }

    private class PagerObserver extends android.database.DataSetObserver {
        public void onChanged() {}
        public void onInvalidated() {}
    }

    public static interface PageTransformer {
        public void transformPage(android.view.View p0, float p1);
    }

    public static class SavedState extends android.view.AbsSavedState {
        int position;
        android.os.Parcelable adapterState;
        java.lang.ClassLoader loader;
        public static final android.os.Parcelable.Creator<com.android.internal.widget.ViewPager.SavedState> CREATOR = null;
        public SavedState(android.os.Parcelable p0) { super((android.os.Parcelable)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
        SavedState(android.os.Parcel p0, java.lang.ClassLoader p1) { super((android.os.Parcelable)null); }
    }

    public static class SimpleOnPageChangeListener implements com.android.internal.widget.ViewPager.OnPageChangeListener {
        public SimpleOnPageChangeListener() {}
        public void onPageScrolled(int p0, float p1, int p2) {}
        public void onPageSelected(int p0) {}
        public void onPageScrollStateChanged(int p0) {}
    }

    static abstract class ViewPositionComparator implements java.util.Comparator<android.view.View> {
        ViewPositionComparator() {}
        public int compare(android.view.View p0, android.view.View p1) { return 0; }
    }
}
