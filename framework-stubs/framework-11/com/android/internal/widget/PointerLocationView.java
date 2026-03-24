package com.android.internal.widget;

public class PointerLocationView extends android.view.View implements android.hardware.input.InputManager.InputDeviceListener, android.view.WindowManagerPolicyConstants.PointerEventListener {
    private static final java.lang.String TAG = "Pointer";
    private static final java.lang.String ALT_STRATEGY_PROPERY_KEY = "debug.velocitytracker.alt";
    private static final java.lang.String GESTURE_EXCLUSION_PROP = "debug.pointerlocation.showexclusion";
    private final android.hardware.input.InputManager mIm = null;
    private final android.view.ViewConfiguration mVC = null;
    private final android.graphics.Paint mTextPaint = null;
    private final android.graphics.Paint mTextBackgroundPaint = null;
    private final android.graphics.Paint mTextLevelPaint = null;
    private final android.graphics.Paint mPaint = null;
    private final android.graphics.Paint mCurrentPointPaint = null;
    private final android.graphics.Paint mTargetPaint = null;
    private final android.graphics.Paint mPathPaint = null;
    private final android.graphics.Paint.FontMetricsInt mTextMetrics = null;
    private int mHeaderBottom;
    private int mHeaderPaddingTop;
    private boolean mCurDown;
    private int mCurNumPointers;
    private int mMaxNumPointers;
    private int mActivePointerId;
    private final java.util.ArrayList<com.android.internal.widget.PointerLocationView.PointerState> mPointers = null;
    private final android.view.MotionEvent.PointerCoords mTempCoords = null;
    private final android.graphics.Region mSystemGestureExclusion = null;
    private final android.graphics.Region mSystemGestureExclusionRejected = null;
    private final android.graphics.Path mSystemGestureExclusionPath = null;
    private final android.graphics.Paint mSystemGestureExclusionPaint = null;
    private final android.graphics.Paint mSystemGestureExclusionRejectedPaint = null;
    private final android.view.VelocityTracker mVelocity = null;
    private final android.view.VelocityTracker mAltVelocity = null;
    private final com.android.internal.widget.PointerLocationView.FasterStringBuilder mText = null;
    private boolean mPrintCoords;
    private android.graphics.RectF mReusableOvalRect;
    private android.view.ISystemGestureExclusionListener mSystemGestureExclusionListener;
    public PointerLocationView(android.content.Context p0) { super((android.content.Context)null); }
    public void setPrintCoords(boolean p0) {}
    public android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets p0) { return null; }
    protected void onMeasure(int p0, int p1) {}
    private void drawOval(android.graphics.Canvas p0, float p1, float p2, float p3, float p4, float p5, android.graphics.Paint p6) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    private void logMotionEvent(java.lang.String p0, android.view.MotionEvent p1) {}
    private void logCoords(java.lang.String p0, int p1, int p2, android.view.MotionEvent.PointerCoords p3, int p4, android.view.MotionEvent p5) {}
    public void onPointerEvent(android.view.MotionEvent p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    private static boolean shouldLogKey(int p0) { return false; }
    public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    public void onInputDeviceAdded(int p0) {}
    public void onInputDeviceChanged(int p0) {}
    public void onInputDeviceRemoved(int p0) {}
    private void logInputDevices() {}
    private void logInputDeviceState(int p0, java.lang.String p1) {}
    private static boolean shouldShowSystemGestureExclusion() { return false; }
    private static int systemGestureExclusionOpacity() { return 0; }

    private static final class FasterStringBuilder {
        private char[] mChars;
        private int mLength;
        public FasterStringBuilder() {}
        public com.android.internal.widget.PointerLocationView.FasterStringBuilder clear() { return null; }
        public com.android.internal.widget.PointerLocationView.FasterStringBuilder append(java.lang.String p0) { return null; }
        public com.android.internal.widget.PointerLocationView.FasterStringBuilder append(int p0) { return null; }
        public com.android.internal.widget.PointerLocationView.FasterStringBuilder append(int p0, int p1) { return null; }
        public com.android.internal.widget.PointerLocationView.FasterStringBuilder append(float p0, int p1) { return null; }
        public java.lang.String toString() { return null; }
        private int reserve(int p0) { return 0; }
    }

    public static class PointerState {
        private float[] mTraceX;
        private float[] mTraceY;
        private boolean[] mTraceCurrent;
        private int mTraceCount;
        private boolean mCurDown;
        private android.view.MotionEvent.PointerCoords mCoords;
        private int mToolType;
        private float mXVelocity;
        private float mYVelocity;
        private float mAltXVelocity;
        private float mAltYVelocity;
        private boolean mHasBoundingBox;
        private float mBoundingLeft;
        private float mBoundingTop;
        private float mBoundingRight;
        private float mBoundingBottom;
        private android.view.VelocityTracker.Estimator mEstimator;
        private android.view.VelocityTracker.Estimator mAltEstimator;
        public PointerState() {}
        public void clearTrace() {}
        public void addTrace(float p0, float p1, boolean p2) {}
    }
}
