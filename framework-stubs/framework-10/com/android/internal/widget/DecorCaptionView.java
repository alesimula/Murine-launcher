package com.android.internal.widget;

public class DecorCaptionView extends android.view.ViewGroup implements android.view.View.OnTouchListener, android.view.GestureDetector.OnGestureListener {
    private static final java.lang.String TAG = "DecorCaptionView";
    private com.android.internal.policy.PhoneWindow mOwner;
    private boolean mShow;
    private boolean mDragging;
    private boolean mOverlayWithAppContent;
    private android.view.View mCaption;
    private android.view.View mContent;
    private android.view.View mMaximize;
    private android.view.View mClose;
    private int mTouchDownX;
    private int mTouchDownY;
    private boolean mCheckForDragging;
    private int mDragSlop;
    private java.util.ArrayList<android.view.View> mTouchDispatchList;
    private android.view.GestureDetector mGestureDetector;
    private final android.graphics.Rect mCloseRect = null;
    private final android.graphics.Rect mMaximizeRect = null;
    private android.view.View mClickTarget;
    private int mRootScrollY;
    public DecorCaptionView(android.content.Context p0) { super((android.content.Context)null); }
    public DecorCaptionView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public DecorCaptionView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    private void init(android.content.Context p0) {}
    protected void onFinishInflate() {}
    public void setPhoneWindow(com.android.internal.policy.PhoneWindow p0, boolean p1) {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouch(android.view.View p0, android.view.MotionEvent p1) { return false; }
    public java.util.ArrayList<android.view.View> buildTouchDispatchChildList() { return null; }
    public boolean shouldDelayChildPressedState() { return false; }
    private boolean passedSlop(int p0, int p1) { return false; }
    public void onConfigurationChanged(boolean p0) {}
    public void addView(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) {}
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    private void updateCaptionVisibility() {}
    private void toggleFreeformWindowingMode() {}
    public boolean isCaptionShowing() { return false; }
    public int getCaptionHeight() { return 0; }
    public void removeContentView() {}
    public android.view.View getCaption() { return null; }
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    public boolean onDown(android.view.MotionEvent p0) { return false; }
    public void onShowPress(android.view.MotionEvent p0) {}
    public boolean onSingleTapUp(android.view.MotionEvent p0) { return false; }
    public boolean onScroll(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3) { return false; }
    public void onLongPress(android.view.MotionEvent p0) {}
    public boolean onFling(android.view.MotionEvent p0, android.view.MotionEvent p1, float p2, float p3) { return false; }
    public void onRootViewScrollYChanged(int p0) {}
}
