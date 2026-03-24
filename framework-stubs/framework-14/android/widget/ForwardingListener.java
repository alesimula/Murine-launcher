package android.widget;

public abstract class ForwardingListener implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {
    public ForwardingListener(android.view.View p0) {}
    public abstract com.android.internal.view.menu.ShowableListMenu getPopup();
    public boolean onTouch(android.view.View p0, android.view.MotionEvent p1) { return false; }
    public void onViewAttachedToWindow(android.view.View p0) {}
    public void onViewDetachedFromWindow(android.view.View p0) {}
    protected boolean onForwardingStarted() { return false; }
    protected boolean onForwardingStopped() { return false; }

    private class DisallowIntercept implements java.lang.Runnable {
        public void run() {}
    }

    private class TriggerLongPress implements java.lang.Runnable {
        public void run() {}
    }
}
