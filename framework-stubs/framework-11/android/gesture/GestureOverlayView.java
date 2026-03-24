package android.gesture;

public class GestureOverlayView extends android.widget.FrameLayout {
    public static final int GESTURE_STROKE_TYPE_SINGLE = 0;
    public static final int GESTURE_STROKE_TYPE_MULTIPLE = 1;
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    private static final int FADE_ANIMATION_RATE = 16;
    private static final boolean GESTURE_RENDERING_ANTIALIAS = true;
    private static final boolean DITHER_FLAG = true;
    private final android.graphics.Paint mGesturePaint = null;
    private long mFadeDuration;
    private long mFadeOffset;
    private long mFadingStart;
    private boolean mFadingHasStarted;
    private boolean mFadeEnabled;
    private int mCurrentColor;
    private int mCertainGestureColor;
    private int mUncertainGestureColor;
    private float mGestureStrokeWidth;
    private int mInvalidateExtraBorder;
    private int mGestureStrokeType;
    private float mGestureStrokeLengthThreshold;
    private float mGestureStrokeSquarenessTreshold;
    private float mGestureStrokeAngleThreshold;
    private int mOrientation;
    private final android.graphics.Rect mInvalidRect = null;
    private final android.graphics.Path mPath = null;
    private boolean mGestureVisible;
    private float mX;
    private float mY;
    private float mCurveEndX;
    private float mCurveEndY;
    private float mTotalLength;
    private boolean mIsGesturing;
    private boolean mPreviousWasGesturing;
    private boolean mInterceptEvents;
    private boolean mIsListeningForGestures;
    private boolean mResetGesture;
    private android.gesture.Gesture mCurrentGesture;
    private final java.util.ArrayList<android.gesture.GesturePoint> mStrokeBuffer = null;
    private final java.util.ArrayList<android.gesture.GestureOverlayView.OnGestureListener> mOnGestureListeners = null;
    private final java.util.ArrayList<android.gesture.GestureOverlayView.OnGesturePerformedListener> mOnGesturePerformedListeners = null;
    private final java.util.ArrayList<android.gesture.GestureOverlayView.OnGesturingListener> mOnGesturingListeners = null;
    private boolean mHandleGestureActions;
    private boolean mIsFadingOut;
    private float mFadingAlpha;
    private final android.view.animation.AccelerateDecelerateInterpolator mInterpolator = null;
    private final android.gesture.GestureOverlayView.FadeOutRunnable mFadingOut = null;
    public GestureOverlayView(android.content.Context p0) { super((android.content.Context)null); }
    public GestureOverlayView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public GestureOverlayView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public GestureOverlayView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void init() {}
    public java.util.ArrayList<android.gesture.GesturePoint> getCurrentStroke() { return null; }
    public int getOrientation() { return 0; }
    public void setOrientation(int p0) {}
    public void setGestureColor(int p0) {}
    public void setUncertainGestureColor(int p0) {}
    public int getUncertainGestureColor() { return 0; }
    public int getGestureColor() { return 0; }
    public float getGestureStrokeWidth() { return 0.0f; }
    public void setGestureStrokeWidth(float p0) {}
    public int getGestureStrokeType() { return 0; }
    public void setGestureStrokeType(int p0) {}
    public float getGestureStrokeLengthThreshold() { return 0.0f; }
    public void setGestureStrokeLengthThreshold(float p0) {}
    public float getGestureStrokeSquarenessTreshold() { return 0.0f; }
    public void setGestureStrokeSquarenessTreshold(float p0) {}
    public float getGestureStrokeAngleThreshold() { return 0.0f; }
    public void setGestureStrokeAngleThreshold(float p0) {}
    public boolean isEventsInterceptionEnabled() { return false; }
    public void setEventsInterceptionEnabled(boolean p0) {}
    public boolean isFadeEnabled() { return false; }
    public void setFadeEnabled(boolean p0) {}
    public android.gesture.Gesture getGesture() { return null; }
    public void setGesture(android.gesture.Gesture p0) {}
    public android.graphics.Path getGesturePath() { return null; }
    public android.graphics.Path getGesturePath(android.graphics.Path p0) { return null; }
    public boolean isGestureVisible() { return false; }
    public void setGestureVisible(boolean p0) {}
    public long getFadeOffset() { return 0L; }
    public void setFadeOffset(long p0) {}
    public void addOnGestureListener(android.gesture.GestureOverlayView.OnGestureListener p0) {}
    public void removeOnGestureListener(android.gesture.GestureOverlayView.OnGestureListener p0) {}
    public void removeAllOnGestureListeners() {}
    public void addOnGesturePerformedListener(android.gesture.GestureOverlayView.OnGesturePerformedListener p0) {}
    public void removeOnGesturePerformedListener(android.gesture.GestureOverlayView.OnGesturePerformedListener p0) {}
    public void removeAllOnGesturePerformedListeners() {}
    public void addOnGesturingListener(android.gesture.GestureOverlayView.OnGesturingListener p0) {}
    public void removeOnGesturingListener(android.gesture.GestureOverlayView.OnGesturingListener p0) {}
    public void removeAllOnGesturingListeners() {}
    public boolean isGesturing() { return false; }
    private void setCurrentColor(int p0) {}
    public android.graphics.Paint getGesturePaint() { return null; }
    public void draw(android.graphics.Canvas p0) {}
    private void setPaintAlpha(int p0) {}
    public void clear(boolean p0) {}
    private void clear(boolean p0, boolean p1, boolean p2) {}
    public void cancelClearAnimation() {}
    public void cancelGesture() {}
    protected void onDetachedFromWindow() {}
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    private boolean processEvent(android.view.MotionEvent p0) { return false; }
    private void touchDown(android.view.MotionEvent p0) {}
    private android.graphics.Rect touchMove(android.view.MotionEvent p0) { return null; }
    private void touchUp(android.view.MotionEvent p0, boolean p1) {}
    private void cancelGesture(android.view.MotionEvent p0) {}
    private void fireOnGesturePerformed() {}

    private class FadeOutRunnable implements java.lang.Runnable {
        boolean fireActionPerformed;
        boolean resetMultipleStrokes;
        private FadeOutRunnable(android.gesture.GestureOverlayView p0) {}
        public void run() {}
    }

    public static interface OnGestureListener {
        public void onGestureStarted(android.gesture.GestureOverlayView p0, android.view.MotionEvent p1);
        public void onGesture(android.gesture.GestureOverlayView p0, android.view.MotionEvent p1);
        public void onGestureEnded(android.gesture.GestureOverlayView p0, android.view.MotionEvent p1);
        public void onGestureCancelled(android.gesture.GestureOverlayView p0, android.view.MotionEvent p1);
    }

    public static interface OnGesturePerformedListener {
        public void onGesturePerformed(android.gesture.GestureOverlayView p0, android.gesture.Gesture p1);
    }

    public static interface OnGesturingListener {
        public void onGesturingStarted(android.gesture.GestureOverlayView p0);
        public void onGesturingEnded(android.gesture.GestureOverlayView p0);
    }
}
