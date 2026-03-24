package android.widget;

@java.lang.Deprecated
public class Gallery extends android.widget.AbsSpinner implements android.view.GestureDetector.OnGestureListener {
    private static final java.lang.String TAG = "Gallery";
    private static final boolean localLOGV = false;
    private static final int SCROLL_TO_FLING_UNCERTAINTY_TIMEOUT = 250;
    @android.annotation.UnsupportedAppUsage
    private int mSpacing;
    private int mAnimationDuration;
    private float mUnselectedAlpha;
    private int mLeftMost;
    private int mRightMost;
    private int mGravity;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private android.view.GestureDetector mGestureDetector;
    @android.annotation.UnsupportedAppUsage
    private int mDownTouchPosition;
    @android.annotation.UnsupportedAppUsage
    private android.view.View mDownTouchView;
    @android.annotation.UnsupportedAppUsage
    private android.widget.Gallery.FlingRunnable mFlingRunnable;
    private java.lang.Runnable mDisableSuppressSelectionChangedRunnable;
    private boolean mShouldStopFling;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private android.view.View mSelectedChild;
    private boolean mShouldCallbackDuringFling;
    private boolean mShouldCallbackOnUnselectedItemClick;
    private boolean mSuppressSelectionChanged;
    private boolean mReceivedInvokeKeyDown;
    private android.widget.AdapterView.AdapterContextMenuInfo mContextMenuInfo;
    private boolean mIsFirstScroll;
    private boolean mIsRtl;
    private int mSelectedCenterOffset;
    public Gallery(android.content.Context p0) { super((android.content.Context)null); }
    public Gallery(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public Gallery(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public Gallery(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onAttachedToWindow() {}
    public void setCallbackDuringFling(boolean p0) {}
    public void setCallbackOnUnselectedItemClick(boolean p0) {}
    public void setAnimationDuration(int p0) {}
    public void setSpacing(int p0) {}
    public void setUnselectedAlpha(float p0) {}
    protected boolean getChildStaticTransformation(android.view.View p0, android.view.animation.Transformation p1) { return false; }
    protected int computeHorizontalScrollExtent() { return 0; }
    protected int computeHorizontalScrollOffset() { return 0; }
    protected int computeHorizontalScrollRange() { return 0; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    int getChildHeight(android.view.View p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    void trackMotionScroll(int p0) {}
    int getLimitedMotionScrollAmount(boolean p0, int p1) { return 0; }
    private void offsetChildrenLeftAndRight(int p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private int getCenterOfGallery() { return 0; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private static int getCenterOfView(android.view.View p0) { return 0; }
    private void detachOffScreenChildren(boolean p0) {}
    private void scrollIntoSlots() {}
    private void onFinishedMovement() {}
    void selectionChanged() {}
    private void setSelectionToCenterChild() {}
    void layout(int p0, boolean p1) {}
    @android.annotation.UnsupportedAppUsage
    private void fillToGalleryLeft() {}
    private void fillToGalleryLeftRtl() {}
    private void fillToGalleryLeftLtr() {}
    @android.annotation.UnsupportedAppUsage
    private void fillToGalleryRight() {}
    private void fillToGalleryRightRtl() {}
    private void fillToGalleryRightLtr() {}
    @android.annotation.UnsupportedAppUsage
    private android.view.View makeAndAddView(int p0, int p1, int p2, boolean p3) { return null; }
    private void setUpChild(android.view.View p0, int p1, int p2, boolean p3) {}
    private int calculateTop(android.view.View p0, boolean p1) { return 0; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onSingleTapUp(android.view.MotionEvent p0) { return false; }
    public boolean onFling(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3) { return false; }
    public boolean onScroll(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3) { return false; }
    public boolean onDown(android.view.MotionEvent p0) { return false; }
    void onUp() {}
    void onCancel() {}
    public void onLongPress(android.view.MotionEvent p0) {}
    public void onShowPress(android.view.MotionEvent p0) {}
    private void dispatchPress(android.view.View p0) {}
    private void dispatchUnpress() {}
    public void dispatchSetSelected(boolean p0) {}
    protected void dispatchSetPressed(boolean p0) {}
    protected android.view.ContextMenu.ContextMenuInfo getContextMenuInfo() { return null; }
    public boolean showContextMenuForChild(android.view.View p0) { return false; }
    public boolean showContextMenuForChild(android.view.View p0, float p1, float p2) { return false; }
    private boolean showContextMenuForChildInternal(android.view.View p0, float p1, float p2, boolean p3) { return false; }
    public boolean showContextMenu() { return false; }
    public boolean showContextMenu(float p0, float p1) { return false; }
    private boolean showContextMenuInternal(float p0, float p1, boolean p2) { return false; }
    private boolean dispatchLongPress(android.view.View p0, int p1, long p2, float p3, float p4, boolean p5) { return false; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    boolean moveDirection(int p0) { return false; }
    private boolean scrollToChild(int p0) { return false; }
    void setSelectedPositionInt(int p0) {}
    private void updateSelectedItemMetadata() {}
    public void setGravity(int p0) {}
    protected int getChildDrawingOrder(int p0, int p1) { return 0; }
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
    }

    private class FlingRunnable implements java.lang.Runnable {
        private android.widget.Scroller mScroller;
        private int mLastFlingX;
        public FlingRunnable(android.widget.Gallery p0) {}
        private void startCommon() {}
        @android.annotation.UnsupportedAppUsage
        public void startUsingVelocity(int p0) {}
        public void startUsingDistance(int p0) {}
        public void stop(boolean p0) {}
        private void endFling(boolean p0) {}
        public void run() {}
    }
}
