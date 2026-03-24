package android.view;

public class ScaleGestureDetector {
    private static final java.lang.String TAG = "ScaleGestureDetector";
    private final android.content.Context mContext = null;
    @android.annotation.UnsupportedAppUsage
    private final android.view.ScaleGestureDetector.OnScaleGestureListener mListener = null;
    private float mFocusX;
    private float mFocusY;
    private boolean mQuickScaleEnabled;
    private boolean mStylusScaleEnabled;
    private float mCurrSpan;
    private float mPrevSpan;
    private float mInitialSpan;
    private float mCurrSpanX;
    private float mCurrSpanY;
    private float mPrevSpanX;
    private float mPrevSpanY;
    private long mCurrTime;
    private long mPrevTime;
    private boolean mInProgress;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=123768938L)
    private int mSpanSlop;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=123768938L)
    private int mMinSpan;
    private final android.os.Handler mHandler = null;
    private float mAnchoredScaleStartX;
    private float mAnchoredScaleStartY;
    private int mAnchoredScaleMode;
    private static final long TOUCH_STABILIZE_TIME = 128L;
    private static final float SCALE_FACTOR = 0.5f;
    private static final int ANCHORED_SCALE_MODE_NONE = 0;
    private static final int ANCHORED_SCALE_MODE_DOUBLE_TAP = 1;
    private static final int ANCHORED_SCALE_MODE_STYLUS = 2;
    private final android.view.InputEventConsistencyVerifier mInputEventConsistencyVerifier = null;
    private android.view.GestureDetector mGestureDetector;
    private boolean mEventBeforeOrAboveStartingGestureEvent;
    public ScaleGestureDetector(android.content.Context p0, android.view.ScaleGestureDetector.OnScaleGestureListener p1) {}
    public ScaleGestureDetector(android.content.Context p0, android.view.ScaleGestureDetector.OnScaleGestureListener p1, android.os.Handler p2) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    private boolean inAnchoredScaleMode() { return false; }
    public void setQuickScaleEnabled(boolean p0) {}
    public boolean isQuickScaleEnabled() { return false; }
    public void setStylusScaleEnabled(boolean p0) {}
    public boolean isStylusScaleEnabled() { return false; }
    public boolean isInProgress() { return false; }
    public float getFocusX() { return 0.0f; }
    public float getFocusY() { return 0.0f; }
    public float getCurrentSpan() { return 0.0f; }
    public float getCurrentSpanX() { return 0.0f; }
    public float getCurrentSpanY() { return 0.0f; }
    public float getPreviousSpan() { return 0.0f; }
    public float getPreviousSpanX() { return 0.0f; }
    public float getPreviousSpanY() { return 0.0f; }
    public float getScaleFactor() { return 0.0f; }
    public long getTimeDelta() { return 0L; }
    public long getEventTime() { return 0L; }

    public static class SimpleOnScaleGestureListener implements android.view.ScaleGestureDetector.OnScaleGestureListener {
        public SimpleOnScaleGestureListener() {}
        public boolean onScale(android.view.ScaleGestureDetector p0) { return false; }
        public boolean onScaleBegin(android.view.ScaleGestureDetector p0) { return false; }
        public void onScaleEnd(android.view.ScaleGestureDetector p0) {}
    }

    public static interface OnScaleGestureListener {
        public boolean onScale(android.view.ScaleGestureDetector p0);
        public boolean onScaleBegin(android.view.ScaleGestureDetector p0);
        public void onScaleEnd(android.view.ScaleGestureDetector p0);
    }
}
