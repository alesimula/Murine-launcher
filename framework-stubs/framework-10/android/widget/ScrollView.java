package android.widget;

public class ScrollView extends android.widget.FrameLayout {
    static final int ANIMATED_SCROLL_GAP = 250;
    static final float MAX_SCROLL_FACTOR = 0.5f;
    private static final java.lang.String TAG = "ScrollView";
    @android.annotation.UnsupportedAppUsage
    private long mLastScroll;
    private final android.graphics.Rect mTempRect = null;
    @android.annotation.UnsupportedAppUsage
    private android.widget.OverScroller mScroller;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=123768600L)
    private android.widget.EdgeEffect mEdgeGlowTop;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=123769386L)
    private android.widget.EdgeEffect mEdgeGlowBottom;
    @android.annotation.UnsupportedAppUsage
    private int mLastMotionY;
    private boolean mIsLayoutDirty;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=123769715L)
    private android.view.View mChildToScrollTo;
    @android.annotation.UnsupportedAppUsage
    private boolean mIsBeingDragged;
    @android.annotation.UnsupportedAppUsage
    private android.view.VelocityTracker mVelocityTracker;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    private boolean mFillViewport;
    private boolean mSmoothScrollingEnabled;
    private int mTouchSlop;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124051125L)
    private int mMinimumVelocity;
    private int mMaximumVelocity;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124050903L)
    private int mOverscrollDistance;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=124050903L)
    private int mOverflingDistance;
    private float mVerticalScrollFactor;
    private int mActivePointerId;
    private final int[] mScrollOffset = null;
    private final int[] mScrollConsumed = null;
    private int mNestedYOffset;
    private android.os.StrictMode.Span mScrollStrictSpan;
    @android.annotation.UnsupportedAppUsage
    private android.os.StrictMode.Span mFlingStrictSpan;
    private static final int INVALID_POINTER = -1;
    private android.widget.ScrollView.SavedState mSavedState;
    public ScrollView(android.content.Context p0) { super((android.content.Context)null); }
    public ScrollView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ScrollView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ScrollView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public boolean shouldDelayChildPressedState() { return false; }
    protected float getTopFadingEdgeStrength() { return 0.0f; }
    protected float getBottomFadingEdgeStrength() { return 0.0f; }
    public void setEdgeEffectColor(int p0) {}
    public void setBottomEdgeEffectColor(int p0) {}
    public void setTopEdgeEffectColor(int p0) {}
    public int getTopEdgeEffectColor() { return 0; }
    public int getBottomEdgeEffectColor() { return 0; }
    public int getMaxScrollAmount() { return 0; }
    private void initScrollView() {}
    public void addView(android.view.View p0) {}
    public void addView(android.view.View p0, int p1) {}
    public void addView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void addView(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) {}
    @android.annotation.UnsupportedAppUsage
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
    private void recycleVelocityTracker() {}
    public void requestDisallowInterceptTouchEvent(boolean p0) {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    private boolean shouldDisplayEdgeEffects() { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    private void onSecondaryPointerUp(android.view.MotionEvent p0) {}
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    protected void onOverScrolled(int p0, int p1, boolean p2, boolean p3) {}
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    private int getScrollRange() { return 0; }
    private android.view.View findFocusableViewInBounds(boolean p0, int p1, int p2) { return null; }
    public boolean pageScroll(int p0) { return false; }
    public boolean fullScroll(int p0) { return false; }
    private boolean scrollAndFocus(int p0, int p1, int p2) { return false; }
    public boolean arrowScroll(int p0) { return false; }
    private boolean isOffScreen(android.view.View p0) { return false; }
    private boolean isWithinDeltaOfScreen(android.view.View p0, int p1, int p2) { return false; }
    private void doScrollY(int p0) {}
    public final void smoothScrollBy(int p0, int p1) {}
    public final void smoothScrollTo(int p0, int p1) {}
    protected int computeVerticalScrollRange() { return 0; }
    protected int computeVerticalScrollOffset() { return 0; }
    protected void measureChild(android.view.View p0, int p1, int p2) {}
    protected void measureChildWithMargins(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public void computeScroll() {}
    public void scrollToDescendant(android.view.View p0) {}
    private boolean scrollToChildRect(android.graphics.Rect p0, boolean p1) { return false; }
    protected int computeScrollDeltaToGetChildRectOnScreen(android.graphics.Rect p0) { return 0; }
    public void requestChildFocus(android.view.View p0, android.view.View p1) {}
    protected boolean onRequestFocusInDescendants(int p0, android.graphics.Rect p1) { return false; }
    public boolean requestChildRectangleOnScreen(android.view.View p0, android.graphics.Rect p1, boolean p2) { return false; }
    public void requestLayout() {}
    protected void onDetachedFromWindow() {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    private static boolean isViewDescendantOf(android.view.View p0, android.view.View p1) { return false; }
    public void fling(int p0) {}
    private void flingWithNestedDispatch(int p0) {}
    @android.annotation.UnsupportedAppUsage
    private void endDrag() {}
    public void scrollTo(int p0, int p1) {}
    public boolean onStartNestedScroll(android.view.View p0, android.view.View p1, int p2) { return false; }
    public void onNestedScrollAccepted(android.view.View p0, android.view.View p1, int p2) {}
    public void onStopNestedScroll(android.view.View p0) {}
    public void onNestedScroll(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public boolean onNestedFling(android.view.View p0, float p1, float p2, boolean p3) { return false; }
    public void draw(android.graphics.Canvas p0) {}
    private static int clamp(int p0, int p1, int p2) { return 0; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}

    static class SavedState extends android.view.View.BaseSavedState {
        public int scrollPosition;
        public static final android.os.Parcelable.Creator<android.widget.ScrollView.SavedState> CREATOR = null;
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public SavedState(android.os.Parcel p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.ScrollView> {
        private boolean mPropertiesMapped;
        private int mFillViewportId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.ScrollView p0, android.view.inspector.PropertyReader p1) {}
    }
}
