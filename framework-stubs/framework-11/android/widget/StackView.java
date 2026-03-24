package android.widget;

@android.widget.RemoteViews.RemoteView
public class StackView extends android.widget.AdapterViewAnimator {
    private final java.lang.String TAG = null;
    private static final int DEFAULT_ANIMATION_DURATION = 400;
    private static final int MINIMUM_ANIMATION_DURATION = 50;
    private static final int STACK_RELAYOUT_DURATION = 100;
    private static final float PERSPECTIVE_SHIFT_FACTOR_Y = 0.10000000149011612f;
    private static final float PERSPECTIVE_SHIFT_FACTOR_X = 0.10000000149011612f;
    private float mPerspectiveShiftX;
    private float mPerspectiveShiftY;
    private float mNewPerspectiveShiftX;
    private float mNewPerspectiveShiftY;
    private static final float PERSPECTIVE_SCALE_FACTOR = 0.0f;
    private static final int ITEMS_SLIDE_UP = 0;
    private static final int ITEMS_SLIDE_DOWN = 1;
    private static final int GESTURE_NONE = 0;
    private static final int GESTURE_SLIDE_UP = 1;
    private static final int GESTURE_SLIDE_DOWN = 2;
    private static final float SWIPE_THRESHOLD_RATIO = 0.20000000298023224f;
    private static final float SLIDE_UP_RATIO = 0.699999988079071f;
    private static final int INVALID_POINTER = -1;
    private static final int NUM_ACTIVE_VIEWS = 5;
    private static final int FRAME_PADDING = 4;
    private final android.graphics.Rect mTouchRect = null;
    private static final int MIN_TIME_BETWEEN_INTERACTION_AND_AUTOADVANCE = 5000;
    private static final long MIN_TIME_BETWEEN_SCROLLS = 100L;
    private float mInitialY;
    private float mInitialX;
    private int mActivePointerId;
    private int mYVelocity;
    private int mSwipeGestureType;
    private int mSlideAmount;
    private int mSwipeThreshold;
    private int mTouchSlop;
    private int mMaximumVelocity;
    private android.view.VelocityTracker mVelocityTracker;
    private boolean mTransitionIsSetup;
    private int mResOutColor;
    private int mClickColor;
    private static android.widget.StackView.HolographicHelper sHolographicHelper;
    private android.widget.ImageView mHighlight;
    private android.widget.ImageView mClickFeedback;
    private boolean mClickFeedbackIsValid;
    private android.widget.StackView.StackSlider mStackSlider;
    private boolean mFirstLayoutHappened;
    private long mLastInteractionTime;
    private long mLastScrollTime;
    private int mStackMode;
    private int mFramePadding;
    private final android.graphics.Rect stackInvalidateRect = null;
    public StackView(android.content.Context p0) { super((android.content.Context)null); }
    public StackView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public StackView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public StackView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void initStackView() {}
    void transformViewForTransition(int p0, int p1, android.view.View p2, boolean p3) {}
    private void transformViewAtIndex(int p0, android.view.View p1, boolean p2) {}
    private void setupStackSlider(android.view.View p0, int p1) {}
    @android.view.RemotableViewMethod
    public void showNext() {}
    @android.view.RemotableViewMethod
    public void showPrevious() {}
    void showOnly(int p0, boolean p1) {}
    void updateClickFeedback() {}
    void showTapFeedback(android.view.View p0) {}
    void hideTapFeedback(android.view.View p0) {}
    private void updateChildTransforms() {}
    android.widget.FrameLayout getFrameForChild() { return null; }
    void applyTransformForChildAtIndex(android.view.View p0, int p1) {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    private void onLayout() {}
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    private void pacedScroll(boolean p0) {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    private void beginGestureIfNeeded(float p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    private void onSecondaryPointerUp(android.view.MotionEvent p0) {}
    private void handlePointerUp(android.view.MotionEvent p0) {}
    android.widget.StackView.LayoutParams createOrReuseLayoutParams(android.view.View p0) { return null; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void advance() {}
    private void measureChildren() {}
    protected void onMeasure(int p0, int p1) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    private boolean goForward() { return false; }
    private boolean goBackward() { return false; }
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }

    private static class HolographicHelper {
        private final android.graphics.Paint mHolographicPaint = null;
        private final android.graphics.Paint mErasePaint = null;
        private final android.graphics.Paint mBlurPaint = null;
        private static final int RES_OUT = 0;
        private static final int CLICK_FEEDBACK = 1;
        private float mDensity;
        private android.graphics.BlurMaskFilter mSmallBlurMaskFilter;
        private android.graphics.BlurMaskFilter mLargeBlurMaskFilter;
        private final android.graphics.Canvas mCanvas = null;
        private final android.graphics.Canvas mMaskCanvas = null;
        private final int[] mTmpXY = null;
        private final android.graphics.Matrix mIdentityMatrix = null;
        HolographicHelper(android.content.Context p0) {}
        android.graphics.Bitmap createClickOutline(android.view.View p0, int p1) { return null; }
        android.graphics.Bitmap createResOutline(android.view.View p0, int p1) { return null; }
        android.graphics.Bitmap createOutline(android.view.View p0, int p1, int p2) { return null; }
        void drawOutline(android.graphics.Canvas p0, android.graphics.Bitmap p1) {}
    }

    class LayoutParams extends android.view.ViewGroup.LayoutParams {
        int horizontalOffset;
        int verticalOffset;
        android.view.View mView;
        private final android.graphics.Rect parentRect = null;
        private final android.graphics.Rect invalidateRect = null;
        private final android.graphics.RectF invalidateRectf = null;
        private final android.graphics.Rect globalInvalidateRect = null;
        LayoutParams(android.widget.StackView p0, android.view.View p1) { super((android.view.ViewGroup.LayoutParams)null); }
        LayoutParams(android.widget.StackView p0, android.content.Context p1, android.util.AttributeSet p2) { super((android.view.ViewGroup.LayoutParams)null); }
        void invalidateGlobalRegion(android.view.View p0, android.graphics.Rect p1) {}
        android.graphics.Rect getInvalidateRect() { return null; }
        void resetInvalidateRect() {}
        public void setVerticalOffset(int p0) {}
        public void setHorizontalOffset(int p0) {}
        public void setOffsets(int p0, int p1) {}
    }

    private static class StackFrame extends android.widget.FrameLayout {
        java.lang.ref.WeakReference<android.animation.ObjectAnimator> transformAnimator;
        java.lang.ref.WeakReference<android.animation.ObjectAnimator> sliderAnimator;
        public StackFrame(android.content.Context p0) { super((android.content.Context)null); }
        void setTransformAnimator(android.animation.ObjectAnimator p0) {}
        void setSliderAnimator(android.animation.ObjectAnimator p0) {}
        boolean cancelTransformAnimator() { return false; }
        boolean cancelSliderAnimator() { return false; }
    }

    private class StackSlider {
        android.view.View mView;
        float mYProgress;
        float mXProgress;
        static final int NORMAL_MODE = 0;
        static final int BEGINNING_OF_STACK_MODE = 1;
        static final int END_OF_STACK_MODE = 2;
        int mMode;
        public StackSlider(android.widget.StackView p0) {}
        public StackSlider(android.widget.StackView p0, android.widget.StackView.StackSlider p1) {}
        private float cubic(float p0) { return 0.0f; }
        private float highlightAlphaInterpolator(float p0) { return 0.0f; }
        private float viewAlphaInterpolator(float p0) { return 0.0f; }
        private float rotationInterpolator(float p0) { return 0.0f; }
        void setView(android.view.View p0) {}
        public void setYProgress(float p0) {}
        public void setXProgress(float p0) {}
        void setMode(int p0) {}
        float getDurationForNeutralPosition() { return 0.0f; }
        float getDurationForOffscreenPosition() { return 0.0f; }
        float getDurationForNeutralPosition(float p0) { return 0.0f; }
        float getDurationForOffscreenPosition(float p0) { return 0.0f; }
        private float getDuration(boolean p0, float p1) { return 0.0f; }
        public float getYProgress() { return 0.0f; }
        public float getXProgress() { return 0.0f; }
    }
}
