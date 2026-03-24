package android.widget;

@java.lang.Deprecated
public class SlidingDrawer extends android.view.ViewGroup {
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    private static final int TAP_THRESHOLD = 6;
    private static final float MAXIMUM_TAP_VELOCITY = 100.0f;
    private static final float MAXIMUM_MINOR_VELOCITY = 150.0f;
    private static final float MAXIMUM_MAJOR_VELOCITY = 200.0f;
    private static final float MAXIMUM_ACCELERATION = 2000.0f;
    private static final int VELOCITY_UNITS = 1000;
    private static final int ANIMATION_FRAME_DURATION = 16;
    private static final int EXPANDED_FULL_OPEN = -10001;
    private static final int COLLAPSED_FULL_CLOSED = -10002;
    private final int mHandleId = 0;
    private final int mContentId = 0;
    private android.view.View mHandle;
    private android.view.View mContent;
    private final android.graphics.Rect mFrame = null;
    private final android.graphics.Rect mInvalidate = null;
    @android.annotation.UnsupportedAppUsage
    private boolean mTracking;
    private boolean mLocked;
    @android.annotation.UnsupportedAppUsage
    private android.view.VelocityTracker mVelocityTracker;
    private boolean mVertical;
    private boolean mExpanded;
    private int mBottomOffset;
    @android.annotation.UnsupportedAppUsage
    private int mTopOffset;
    private int mHandleHeight;
    private int mHandleWidth;
    private android.widget.SlidingDrawer.OnDrawerOpenListener mOnDrawerOpenListener;
    private android.widget.SlidingDrawer.OnDrawerCloseListener mOnDrawerCloseListener;
    private android.widget.SlidingDrawer.OnDrawerScrollListener mOnDrawerScrollListener;
    private float mAnimatedAcceleration;
    private float mAnimatedVelocity;
    private float mAnimationPosition;
    private long mAnimationLastTime;
    private long mCurrentAnimationTime;
    @android.annotation.UnsupportedAppUsage
    private int mTouchDelta;
    private boolean mAnimating;
    private boolean mAllowSingleTap;
    private boolean mAnimateOnClick;
    private final int mTapThreshold = 0;
    private final int mMaximumTapVelocity = 0;
    private final int mMaximumMinorVelocity = 0;
    private final int mMaximumMajorVelocity = 0;
    private final int mMaximumAcceleration = 0;
    private final int mVelocityUnits = 0;
    private final java.lang.Runnable mSlidingRunnable = null;
    public SlidingDrawer(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public SlidingDrawer(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public SlidingDrawer(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    protected void onFinishInflate() {}
    protected void onMeasure(int p0, int p1) {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    private void animateClose(int p0, boolean p1) {}
    private void animateOpen(int p0, boolean p1) {}
    private void performFling(int p0, float p1, boolean p2, boolean p3) {}
    @android.annotation.UnsupportedAppUsage
    private void prepareTracking(int p0) {}
    private void moveHandle(int p0) {}
    @android.annotation.UnsupportedAppUsage
    private void prepareContent() {}
    private void stopTracking(boolean p0) {}
    private void doAnimation() {}
    private void incrementAnimation() {}
    public void toggle() {}
    public void animateToggle() {}
    public void open() {}
    public void close() {}
    public void animateClose() {}
    public void animateOpen() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    private void closeDrawer() {}
    private void openDrawer() {}
    public void setOnDrawerOpenListener(android.widget.SlidingDrawer.OnDrawerOpenListener p0) {}
    public void setOnDrawerCloseListener(android.widget.SlidingDrawer.OnDrawerCloseListener p0) {}
    public void setOnDrawerScrollListener(android.widget.SlidingDrawer.OnDrawerScrollListener p0) {}
    public android.view.View getHandle() { return null; }
    public android.view.View getContent() { return null; }
    public void unlock() {}
    public void lock() {}
    public boolean isOpened() { return false; }
    public boolean isMoving() { return false; }

    public static interface OnDrawerScrollListener {
        public void onScrollStarted();
        public void onScrollEnded();
    }

    public static interface OnDrawerOpenListener {
        public void onDrawerOpened();
    }

    public static interface OnDrawerCloseListener {
        public void onDrawerClosed();
    }

    private class DrawerToggler implements android.view.View.OnClickListener {
        private DrawerToggler(android.widget.SlidingDrawer p0) {}
        public void onClick(android.view.View p0) {}
    }
}
