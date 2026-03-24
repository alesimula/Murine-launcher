package android.view;

public class GestureDetector {
    private static final java.lang.String TAG = null;
    private int mTouchSlopSquare;
    private int mDoubleTapTouchSlopSquare;
    private int mDoubleTapSlopSquare;
    private float mAmbiguousGestureMultiplier;
    private int mMinimumFlingVelocity;
    private int mMaximumFlingVelocity;
    private static final int LONGPRESS_TIMEOUT = Integer.valueOf(0);
    private static final int TAP_TIMEOUT = Integer.valueOf(0);
    private static final int DOUBLE_TAP_TIMEOUT = Integer.valueOf(0);
    private static final int DOUBLE_TAP_MIN_TIME = Integer.valueOf(0);
    private static final int SHOW_PRESS = 1;
    private static final int LONG_PRESS = 2;
    private static final int TAP = 3;
    private final android.os.Handler mHandler = null;
    private final android.view.GestureDetector.OnGestureListener mListener = null;
    private android.view.GestureDetector.OnDoubleTapListener mDoubleTapListener;
    private android.view.GestureDetector.OnContextClickListener mContextClickListener;
    private boolean mStillDown;
    private boolean mDeferConfirmSingleTap;
    private boolean mInLongPress;
    private boolean mInContextClick;
    private boolean mAlwaysInTapRegion;
    private boolean mAlwaysInBiggerTapRegion;
    private boolean mIgnoreNextUpEvent;
    private boolean mHasRecordedClassification;
    private android.view.MotionEvent mCurrentDownEvent;
    private android.view.MotionEvent mCurrentMotionEvent;
    private android.view.MotionEvent mPreviousUpEvent;
    private boolean mIsDoubleTapping;
    private float mLastFocusX;
    private float mLastFocusY;
    private float mDownFocusX;
    private float mDownFocusY;
    private boolean mIsLongpressEnabled;
    private android.view.VelocityTracker mVelocityTracker;
    private final android.view.InputEventConsistencyVerifier mInputEventConsistencyVerifier = null;
    @java.lang.Deprecated
    public GestureDetector(android.view.GestureDetector.OnGestureListener p0, android.os.Handler p1) {}
    @java.lang.Deprecated
    public GestureDetector(android.view.GestureDetector.OnGestureListener p0) {}
    public GestureDetector(android.content.Context p0, android.view.GestureDetector.OnGestureListener p1) {}
    public GestureDetector(android.content.Context p0, android.view.GestureDetector.OnGestureListener p1, android.os.Handler p2) {}
    public GestureDetector(android.content.Context p0, android.view.GestureDetector.OnGestureListener p1, android.os.Handler p2, boolean p3) {}
    private void init(android.content.Context p0) {}
    public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener p0) {}
    public void setContextClickListener(android.view.GestureDetector.OnContextClickListener p0) {}
    public void setIsLongpressEnabled(boolean p0) {}
    public boolean isLongpressEnabled() { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    private void cancel() {}
    private void cancelTaps() {}
    private boolean isConsideredDoubleTap(android.view.MotionEvent p0, android.view.MotionEvent p1, android.view.MotionEvent p2) { return false; }
    private void dispatchLongPress() {}
    private void recordGestureClassification(int p0) {}

    private class GestureHandler extends android.os.Handler {
        GestureHandler(android.view.GestureDetector p0) { super(); }
        GestureHandler(android.view.GestureDetector p0, android.os.Handler p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static interface OnContextClickListener {
        public boolean onContextClick(android.view.MotionEvent p0);
    }

    public static interface OnDoubleTapListener {
        public boolean onSingleTapConfirmed(android.view.MotionEvent p0);
        public boolean onDoubleTap(android.view.MotionEvent p0);
        public boolean onDoubleTapEvent(android.view.MotionEvent p0);
    }

    public static interface OnGestureListener {
        public boolean onDown(android.view.MotionEvent p0);
        public void onShowPress(android.view.MotionEvent p0);
        public boolean onSingleTapUp(android.view.MotionEvent p0);
        public boolean onScroll(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3);
        public void onLongPress(android.view.MotionEvent p0);
        public boolean onFling(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3);
    }

    public static class SimpleOnGestureListener implements android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener, android.view.GestureDetector.OnContextClickListener {
        public SimpleOnGestureListener() {}
        public boolean onSingleTapUp(android.view.MotionEvent p0) { return false; }
        public void onLongPress(android.view.MotionEvent p0) {}
        public boolean onScroll(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3) { return false; }
        public boolean onFling(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3) { return false; }
        public void onShowPress(android.view.MotionEvent p0) {}
        public boolean onDown(android.view.MotionEvent p0) { return false; }
        public boolean onDoubleTap(android.view.MotionEvent p0) { return false; }
        public boolean onDoubleTapEvent(android.view.MotionEvent p0) { return false; }
        public boolean onSingleTapConfirmed(android.view.MotionEvent p0) { return false; }
        public boolean onContextClick(android.view.MotionEvent p0) { return false; }
    }
}
