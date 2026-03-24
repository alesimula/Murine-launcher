package android.widget;

public abstract class ForwardingListener implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {
    private final float mScaledTouchSlop = 0.0f;
    private final int mTapTimeout = 0;
    private final int mLongPressTimeout = 0;
    private final android.view.View mSrc = null;
    private java.lang.Runnable mDisallowIntercept;
    private java.lang.Runnable mTriggerLongPress;
    private boolean mForwarding;
    private int mActivePointerId;
    public ForwardingListener(android.view.View p0) {}
    public abstract com.android.internal.view.menu.ShowableListMenu getPopup();
    public boolean onTouch(android.view.View p0, android.view.MotionEvent p1) { return false; }
    public void onViewAttachedToWindow(android.view.View p0) {}
    public void onViewDetachedFromWindow(android.view.View p0) {}
    protected boolean onForwardingStarted() { return false; }
    protected boolean onForwardingStopped() { return false; }
    private boolean onTouchObserved(android.view.MotionEvent p0) { return false; }
    private void clearCallbacks() {}
    private void onLongPress() {}
    private boolean onTouchForwarded(android.view.MotionEvent p0) { return false; }

    private class DisallowIntercept implements java.lang.Runnable {
        private DisallowIntercept(android.widget.ForwardingListener p0) {}
        public void run() {}
    }

    private class TriggerLongPress implements java.lang.Runnable {
        private TriggerLongPress(android.widget.ForwardingListener p0) {}
        public void run() {}
    }
}
