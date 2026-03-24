package android.widget;

public class HorizontalScrollView extends android.widget.FrameLayout {
    @android.annotation.NonNull
    public android.widget.EdgeEffect mEdgeGlowLeft;
    public android.widget.EdgeEffect mEdgeGlowRight;
    public HorizontalScrollView(android.content.Context p0) { super((android.content.Context)null); }
    public HorizontalScrollView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public HorizontalScrollView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public HorizontalScrollView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected float getLeftFadingEdgeStrength() { return 0.0f; }
    protected float getRightFadingEdgeStrength() { return 0.0f; }
    public void setEdgeEffectColor(int p0) {}
    public void setRightEdgeEffectColor(int p0) {}
    public void setLeftEdgeEffectColor(int p0) {}
    public int getLeftEdgeEffectColor() { return 0; }
    public int getRightEdgeEffectColor() { return 0; }
    public int getMaxScrollAmount() { return 0; }
    public void addView(android.view.View p0) {}
    public void addView(android.view.View p0, int p1) {}
    public void addView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void addView(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) {}
    public boolean isFillViewport() { return false; }
    public void setFillViewport(boolean p0) {}
    public boolean isSmoothScrollingEnabled() { return false; }
    public void setSmoothScrollingEnabled(boolean p0) {}
    protected void onMeasure(int p0, int p1) {}
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean executeKeyEvent(android.view.KeyEvent p0) { return false; }
    public void requestDisallowInterceptTouchEvent(boolean p0) {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean shouldDelayChildPressedState() { return false; }
    protected void onOverScrolled(int p0, int p1, boolean p2, boolean p3) {}
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public boolean pageScroll(int p0) { return false; }
    public boolean fullScroll(int p0) { return false; }
    public boolean arrowScroll(int p0) { return false; }
    public final void smoothScrollBy(int p0, int p1) {}
    public final void smoothScrollTo(int p0, int p1) {}
    protected int computeHorizontalScrollRange() { return 0; }
    protected int computeHorizontalScrollOffset() { return 0; }
    protected void measureChild(android.view.View p0, int p1, int p2) {}
    protected void measureChildWithMargins(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public void computeScroll() {}
    protected int computeScrollDeltaToGetChildRectOnScreen(android.graphics.Rect p0) { return 0; }
    public void requestChildFocus(android.view.View p0, android.view.View p1) {}
    protected boolean onRequestFocusInDescendants(int p0, android.graphics.Rect p1) { return false; }
    public boolean requestChildRectangleOnScreen(android.view.View p0, android.graphics.Rect p1, boolean p2) { return false; }
    public void requestLayout() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    public void fling(int p0) {}
    public void scrollTo(int p0, int p1) {}
    public void draw(android.graphics.Canvas p0) {}
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}

    static class SavedState extends android.view.View.BaseSavedState {
        public int scrollOffsetFromStart;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.widget.HorizontalScrollView.SavedState> CREATOR = null;
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }
}
