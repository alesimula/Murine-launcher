package android.widget;

public class HorizontalScrollView extends android.widget.FrameLayout {
    private static final int ANIMATED_SCROLL_GAP = 250;
    private static final float MAX_SCROLL_FACTOR = 0.5f;
    private static final java.lang.String TAG = "HorizontalScrollView";
    private long mLastScroll;
    private final android.graphics.Rect mTempRect = null;
    @android.annotation.UnsupportedAppUsage
    private android.widget.OverScroller mScroller;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124053130L)
    private android.widget.EdgeEffect mEdgeGlowLeft;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124052619L)
    private android.widget.EdgeEffect mEdgeGlowRight;
    @android.annotation.UnsupportedAppUsage
    private int mLastMotionX;
    private boolean mIsLayoutDirty;
    @android.annotation.UnsupportedAppUsage
    private android.view.View mChildToScrollTo;
    @android.annotation.UnsupportedAppUsage
    private boolean mIsBeingDragged;
    @android.annotation.UnsupportedAppUsage
    private android.view.VelocityTracker mVelocityTracker;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    private boolean mFillViewport;
    private boolean mSmoothScrollingEnabled;
    private int mTouchSlop;
    private int mMinimumVelocity;
    private int mMaximumVelocity;
    @android.annotation.UnsupportedAppUsage
    private int mOverscrollDistance;
    @android.annotation.UnsupportedAppUsage
    private int mOverflingDistance;
    private float mHorizontalScrollFactor;
    private int mActivePointerId;
    private static final int INVALID_POINTER = -1;
    private android.widget.HorizontalScrollView.SavedState mSavedState;
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
    private void initScrollView() {}
    public void addView(android.view.View p0) {}
    public void addView(android.view.View p0, int p1) {}
    public void addView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void addView(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) {}
    private boolean canScroll() { return false; }
    public boolean isFillViewport() { return false; }
    public void setFillViewport(boolean p0) {}
    public boolean isSmoothScrollingEnabled() { return false; }
    public void setSmoothScrollingEnabled(boolean p0) {}
    protected void onMeasure(int p0, int p1) {}
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean executeKeyEvent(android.view.KeyEvent p0) { return false; }
    private boolean inChild(int p0, int p1) { return false; }
    private void initOrResetVelocityTracker() {}
    private void initVelocityTrackerIfNotExists() {}
    @android.annotation.UnsupportedAppUsage
    private void recycleVelocityTracker() {}
    public void requestDisallowInterceptTouchEvent(boolean p0) {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    private void onSecondaryPointerUp(android.view.MotionEvent p0) {}
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean shouldDelayChildPressedState() { return false; }
    protected void onOverScrolled(int p0, int p1, boolean p2, boolean p3) {}
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    private int getScrollRange() { return 0; }
    private android.view.View findFocusableViewInMyBounds(boolean p0, int p1, android.view.View p2) { return null; }
    private android.view.View findFocusableViewInBounds(boolean p0, int p1, int p2) { return null; }
    public boolean pageScroll(int p0) { return false; }
    public boolean fullScroll(int p0) { return false; }
    private boolean scrollAndFocus(int p0, int p1, int p2) { return false; }
    public boolean arrowScroll(int p0) { return false; }
    private boolean isOffScreen(android.view.View p0) { return false; }
    private boolean isWithinDeltaOfScreen(android.view.View p0, int p1) { return false; }
    private void doScrollX(int p0) {}
    public final void smoothScrollBy(int p0, int p1) {}
    public final void smoothScrollTo(int p0, int p1) {}
    protected int computeHorizontalScrollRange() { return 0; }
    protected int computeHorizontalScrollOffset() { return 0; }
    protected void measureChild(android.view.View p0, int p1, int p2) {}
    protected void measureChildWithMargins(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public void computeScroll() {}
    private void scrollToChild(android.view.View p0) {}
    private boolean scrollToChildRect(android.graphics.Rect p0, boolean p1) { return false; }
    protected int computeScrollDeltaToGetChildRectOnScreen(android.graphics.Rect p0) { return 0; }
    public void requestChildFocus(android.view.View p0, android.view.View p1) {}
    protected boolean onRequestFocusInDescendants(int p0, android.graphics.Rect p1) { return false; }
    public boolean requestChildRectangleOnScreen(android.view.View p0, android.graphics.Rect p1, boolean p2) { return false; }
    public void requestLayout() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    private static boolean isViewDescendantOf(android.view.View p0, android.view.View p1) { return false; }
    public void fling(int p0) {}
    public void scrollTo(int p0, int p1) {}
    private boolean shouldDisplayEdgeEffects() { return false; }
    public void draw(android.graphics.Canvas p0) {}
    private static int clamp(int p0, int p1, int p2) { return 0; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}

    static class SavedState extends android.view.View.BaseSavedState {
        public int scrollOffsetFromStart;
        public static final android.os.Parcelable.Creator<android.widget.HorizontalScrollView.SavedState> CREATOR = null;
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.HorizontalScrollView> {
        private boolean mPropertiesMapped;
        private int mFillViewportId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.HorizontalScrollView p0, android.view.inspector.PropertyReader p1) {}
    }
}
