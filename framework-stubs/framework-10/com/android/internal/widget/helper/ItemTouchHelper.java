package com.android.internal.widget.helper;

public class ItemTouchHelper extends com.android.internal.widget.RecyclerView.ItemDecoration implements com.android.internal.widget.RecyclerView.OnChildAttachStateChangeListener {
    public static final int UP = 1;
    public static final int DOWN = 2;
    public static final int LEFT = 4;
    public static final int RIGHT = 8;
    public static final int START = 16;
    public static final int END = 32;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_DRAG = 8;
    static final java.lang.String TAG = "ItemTouchHelper";
    static final boolean DEBUG = false;
    static final int ACTIVE_POINTER_ID_NONE = -1;
    static final int DIRECTION_FLAG_COUNT = 8;
    private static final int ACTION_MODE_IDLE_MASK = 255;
    static final int ACTION_MODE_SWIPE_MASK = 65280;
    static final int ACTION_MODE_DRAG_MASK = 16711680;
    private static final int PIXELS_PER_SECOND = 1000;
    final java.util.List<android.view.View> mPendingCleanup = null;
    private final float[] mTmpPosition = null;
    com.android.internal.widget.RecyclerView.ViewHolder mSelected;
    float mInitialTouchX;
    float mInitialTouchY;
    float mSwipeEscapeVelocity;
    float mMaxSwipeVelocity;
    float mDx;
    float mDy;
    float mSelectedStartX;
    float mSelectedStartY;
    int mActivePointerId;
    com.android.internal.widget.helper.ItemTouchHelper.Callback mCallback;
    int mActionState;
    int mSelectedFlags;
    java.util.List<com.android.internal.widget.helper.ItemTouchHelper.RecoverAnimation> mRecoverAnimations;
    private int mSlop;
    com.android.internal.widget.RecyclerView mRecyclerView;
    final java.lang.Runnable mScrollRunnable = null;
    android.view.VelocityTracker mVelocityTracker;
    private java.util.List<com.android.internal.widget.RecyclerView.ViewHolder> mSwapTargets;
    private java.util.List<java.lang.Integer> mDistances;
    private com.android.internal.widget.RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback;
    android.view.View mOverdrawChild;
    int mOverdrawChildPosition;
    android.view.GestureDetector mGestureDetector;
    private final com.android.internal.widget.RecyclerView.OnItemTouchListener mOnItemTouchListener = null;
    private android.graphics.Rect mTmpRect;
    private long mDragScrollStartTimeInMs;
    public ItemTouchHelper(com.android.internal.widget.helper.ItemTouchHelper.Callback p0) { super(); }
    private static boolean hitTest(android.view.View p0, float p1, float p2, float p3, float p4) { return false; }
    public void attachToRecyclerView(com.android.internal.widget.RecyclerView p0) {}
    private void setupCallbacks() {}
    private void destroyCallbacks() {}
    private void initGestureDetector() {}
    private void getSelectedDxDy(float[] p0) {}
    public void onDrawOver(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1, com.android.internal.widget.RecyclerView.State p2) {}
    public void onDraw(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1, com.android.internal.widget.RecyclerView.State p2) {}
    void select(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1) {}
    void postDispatchSwipe(com.android.internal.widget.helper.ItemTouchHelper.RecoverAnimation p0, int p1) {}
    boolean hasRunningRecoverAnim() { return false; }
    boolean scrollIfNecessary() { return false; }
    private java.util.List<com.android.internal.widget.RecyclerView.ViewHolder> findSwapTargets(com.android.internal.widget.RecyclerView.ViewHolder p0) { return null; }
    void moveIfNecessary(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    public void onChildViewAttachedToWindow(android.view.View p0) {}
    public void onChildViewDetachedFromWindow(android.view.View p0) {}
    int endRecoverAnimation(com.android.internal.widget.RecyclerView.ViewHolder p0, boolean p1) { return 0; }
    public void getItemOffsets(android.graphics.Rect p0, android.view.View p1, com.android.internal.widget.RecyclerView p2, com.android.internal.widget.RecyclerView.State p3) {}
    void obtainVelocityTracker() {}
    private void releaseVelocityTracker() {}
    private com.android.internal.widget.RecyclerView.ViewHolder findSwipedView(android.view.MotionEvent p0) { return null; }
    boolean checkSelectForSwipe(int p0, android.view.MotionEvent p1, int p2) { return false; }
    android.view.View findChildView(android.view.MotionEvent p0) { return null; }
    public void startDrag(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    public void startSwipe(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    com.android.internal.widget.helper.ItemTouchHelper.RecoverAnimation findAnimation(android.view.MotionEvent p0) { return null; }
    void updateDxDy(android.view.MotionEvent p0, int p1, int p2) {}
    private int swipeIfNecessary(com.android.internal.widget.RecyclerView.ViewHolder p0) { return 0; }
    private int checkHorizontalSwipe(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1) { return 0; }
    private int checkVerticalSwipe(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1) { return 0; }
    private void addChildDrawingOrderCallback() {}
    void removeChildDrawingOrderCallbackIfNecessary(android.view.View p0) {}

    public static interface ViewDropHandler {
        public void prepareForDrop(android.view.View p0, android.view.View p1, int p2, int p3);
    }

    public static abstract class SimpleCallback extends com.android.internal.widget.helper.ItemTouchHelper.Callback {
        private int mDefaultSwipeDirs;
        private int mDefaultDragDirs;
        public SimpleCallback(int p0, int p1) { super(); }
        public void setDefaultSwipeDirs(int p0) {}
        public void setDefaultDragDirs(int p0) {}
        public int getSwipeDirs(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1) { return 0; }
        public int getDragDirs(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1) { return 0; }
        public int getMovementFlags(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1) { return 0; }
    }

    private class RecoverAnimation implements android.animation.Animator.AnimatorListener {
        final float mStartDx = 0.0f;
        final float mStartDy = 0.0f;
        final float mTargetX = 0.0f;
        final float mTargetY = 0.0f;
        final com.android.internal.widget.RecyclerView.ViewHolder mViewHolder = null;
        final int mActionState = 0;
        private final android.animation.ValueAnimator mValueAnimator = null;
        final int mAnimationType = 0;
        public boolean mIsPendingCleanup;
        float mX;
        float mY;
        boolean mOverridden;
        boolean mEnded;
        private float mFraction;
        RecoverAnimation(com.android.internal.widget.helper.ItemTouchHelper p0, com.android.internal.widget.RecyclerView.ViewHolder p1, int p2, int p3, float p4, float p5, float p6, float p7) {}
        public void setDuration(long p0) {}
        public void start() {}
        public void cancel() {}
        public void setFraction(float p0) {}
        public void update() {}
        public void onAnimationStart(android.animation.Animator p0) {}
        public void onAnimationEnd(android.animation.Animator p0) {}
        public void onAnimationCancel(android.animation.Animator p0) {}
        public void onAnimationRepeat(android.animation.Animator p0) {}
    }

    private class ItemTouchHelperGestureListener extends android.view.GestureDetector.SimpleOnGestureListener {
        ItemTouchHelperGestureListener(com.android.internal.widget.helper.ItemTouchHelper p0) { super(); }
        public boolean onDown(android.view.MotionEvent p0) { return false; }
        public void onLongPress(android.view.MotionEvent p0) {}
    }

    public static abstract class Callback {
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final com.android.internal.widget.helper.ItemTouchUIUtil sUICallback = null;
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        private static final android.view.animation.Interpolator sDragScrollInterpolator = null;
        private static final android.view.animation.Interpolator sDragViewScrollCapInterpolator = null;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000L;
        private int mCachedMaxScrollSpeed;
        public Callback() {}
        public static com.android.internal.widget.helper.ItemTouchUIUtil getDefaultUIUtil() { return null; }
        public static int convertToRelativeDirection(int p0, int p1) { return 0; }
        public static int makeMovementFlags(int p0, int p1) { return 0; }
        public static int makeFlag(int p0, int p1) { return 0; }
        public abstract int getMovementFlags(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1);
        public int convertToAbsoluteDirection(int p0, int p1) { return 0; }
        final int getAbsoluteMovementFlags(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1) { return 0; }
        boolean hasDragFlag(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1) { return false; }
        boolean hasSwipeFlag(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1) { return false; }
        public boolean canDropOver(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1, com.android.internal.widget.RecyclerView.ViewHolder p2) { return false; }
        public abstract boolean onMove(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1, com.android.internal.widget.RecyclerView.ViewHolder p2);
        public boolean isLongPressDragEnabled() { return false; }
        public boolean isItemViewSwipeEnabled() { return false; }
        public int getBoundingBoxMargin() { return 0; }
        public float getSwipeThreshold(com.android.internal.widget.RecyclerView.ViewHolder p0) { return 0.0f; }
        public float getMoveThreshold(com.android.internal.widget.RecyclerView.ViewHolder p0) { return 0.0f; }
        public float getSwipeEscapeVelocity(float p0) { return 0.0f; }
        public float getSwipeVelocityThreshold(float p0) { return 0.0f; }
        public com.android.internal.widget.RecyclerView.ViewHolder chooseDropTarget(com.android.internal.widget.RecyclerView.ViewHolder p0, java.util.List<com.android.internal.widget.RecyclerView.ViewHolder> p1, int p2, int p3) { return null; }
        public abstract void onSwiped(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1);
        public void onSelectedChanged(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1) {}
        private int getMaxDragScroll(com.android.internal.widget.RecyclerView p0) { return 0; }
        public void onMoved(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1, int p2, com.android.internal.widget.RecyclerView.ViewHolder p3, int p4, int p5, int p6) {}
        void onDraw(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1, com.android.internal.widget.RecyclerView.ViewHolder p2, java.util.List<com.android.internal.widget.helper.ItemTouchHelper.RecoverAnimation> p3, int p4, float p5, float p6) {}
        void onDrawOver(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1, com.android.internal.widget.RecyclerView.ViewHolder p2, java.util.List<com.android.internal.widget.helper.ItemTouchHelper.RecoverAnimation> p3, int p4, float p5, float p6) {}
        public void clearView(com.android.internal.widget.RecyclerView p0, com.android.internal.widget.RecyclerView.ViewHolder p1) {}
        public void onChildDraw(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1, com.android.internal.widget.RecyclerView.ViewHolder p2, float p3, float p4, int p5, boolean p6) {}
        public void onChildDrawOver(android.graphics.Canvas p0, com.android.internal.widget.RecyclerView p1, com.android.internal.widget.RecyclerView.ViewHolder p2, float p3, float p4, int p5, boolean p6) {}
        public long getAnimationDuration(com.android.internal.widget.RecyclerView p0, int p1, float p2, float p3) { return 0L; }
        public int interpolateOutOfBoundsScroll(com.android.internal.widget.RecyclerView p0, int p1, int p2, int p3, long p4) { return 0; }
    }
}
