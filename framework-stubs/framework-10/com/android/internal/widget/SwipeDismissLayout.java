package com.android.internal.widget;

public class SwipeDismissLayout extends android.widget.FrameLayout {
    private static final java.lang.String TAG = "SwipeDismissLayout";
    private static final float MAX_DIST_THRESHOLD = 0.33000001311302185f;
    private static final float MIN_DIST_THRESHOLD = 0.10000000149011612f;
    private boolean mIsWindowNativelyTranslucent;
    private int mSlop;
    private int mMinFlingVelocity;
    private int mActiveTouchId;
    private float mDownX;
    private float mDownY;
    private float mLastX;
    private boolean mSwiping;
    private boolean mDismissed;
    private boolean mDiscardIntercept;
    private android.view.VelocityTracker mVelocityTracker;
    private boolean mBlockGesture;
    private boolean mActivityTranslucencyConverted;
    private final com.android.internal.widget.SwipeDismissLayout.DismissAnimator mDismissAnimator = null;
    private com.android.internal.widget.SwipeDismissLayout.OnDismissedListener mDismissedListener;
    private com.android.internal.widget.SwipeDismissLayout.OnSwipeProgressChangedListener mProgressListener;
    private android.content.BroadcastReceiver mScreenOffReceiver;
    private android.content.IntentFilter mScreenOffFilter;
    private boolean mDismissable;
    public SwipeDismissLayout(android.content.Context p0) { super((android.content.Context)null); }
    public SwipeDismissLayout(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public SwipeDismissLayout(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    private void init(android.content.Context p0) {}
    public void setOnDismissedListener(com.android.internal.widget.SwipeDismissLayout.OnDismissedListener p0) {}
    public void setOnSwipeProgressChangedListener(com.android.internal.widget.SwipeDismissLayout.OnSwipeProgressChangedListener p0) {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    private void setProgress(float p0) {}
    private void dismiss() {}
    protected void cancel() {}
    private void resetMembers() {}
    private void updateSwiping(android.view.MotionEvent p0) {}
    private void updateDismiss(android.view.MotionEvent p0) {}
    protected boolean canScroll(android.view.View p0, boolean p1, float p2, float p3, float p4) { return false; }
    public void setDismissable(boolean p0) {}
    private void checkGesture(android.view.MotionEvent p0) {}
    private float progressToAlpha(float p0) { return 0.0f; }
    private android.app.Activity findActivity() { return null; }

    public static interface OnSwipeProgressChangedListener {
        public void onSwipeProgressChanged(com.android.internal.widget.SwipeDismissLayout p0, float p1, float p2);
        public void onSwipeCancelled(com.android.internal.widget.SwipeDismissLayout p0);
    }

    public static interface OnDismissedListener {
        public void onDismissed(com.android.internal.widget.SwipeDismissLayout p0);
    }

    private class DismissAnimator implements android.animation.ValueAnimator.AnimatorUpdateListener, android.animation.Animator.AnimatorListener {
        private final android.animation.TimeInterpolator DISMISS_INTERPOLATOR = null;
        private final long DISMISS_DURATION = 0L;
        private final android.animation.ValueAnimator mDismissAnimator = null;
        private boolean mWasCanceled;
        private boolean mDismissOnComplete;
        DismissAnimator(com.android.internal.widget.SwipeDismissLayout p0) {}
        void animateDismissal(float p0) {}
        void animateRecovery(float p0) {}
        boolean isAnimating() { return false; }
        private void animate(float p0, float p1, long p2, android.animation.TimeInterpolator p3, boolean p4) {}
        public void onAnimationUpdate(android.animation.ValueAnimator p0) {}
        public void onAnimationStart(android.animation.Animator p0) {}
        public void onAnimationCancel(android.animation.Animator p0) {}
        public void onAnimationEnd(android.animation.Animator p0) {}
        public void onAnimationRepeat(android.animation.Animator p0) {}
    }
}
