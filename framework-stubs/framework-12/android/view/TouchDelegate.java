package android.view;

public class TouchDelegate {
    private android.view.View mDelegateView;
    private android.graphics.Rect mBounds;
    private android.graphics.Rect mSlopBounds;
    private boolean mDelegateTargeted;
    public static final int ABOVE = 1;
    public static final int BELOW = 2;
    public static final int TO_LEFT = 4;
    public static final int TO_RIGHT = 8;
    private int mSlop;
    private android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo mTouchDelegateInfo;
    public TouchDelegate(android.graphics.Rect p0, android.view.View p1) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchExplorationHoverEvent(android.view.MotionEvent p0) { return false; }
    public android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() { return null; }
}
