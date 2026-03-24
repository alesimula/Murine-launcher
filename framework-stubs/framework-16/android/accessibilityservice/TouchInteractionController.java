package android.accessibilityservice;

public final class TouchInteractionController {
    public static final int STATE_CLEAR = 0;
    public static final int STATE_TOUCH_INTERACTING = 1;
    public static final int STATE_TOUCH_EXPLORING = 2;
    public static final int STATE_DRAGGING = 3;
    public static final int STATE_DELEGATING = 4;
    TouchInteractionController(android.accessibilityservice.AccessibilityService p0, java.lang.Object p1, int p2) {}
    public void registerCallback(java.util.concurrent.Executor p0, android.accessibilityservice.TouchInteractionController.Callback p1) {}
    public boolean unregisterCallback(android.accessibilityservice.TouchInteractionController.Callback p0) { return false; }
    public void unregisterAllCallbacks() {}
    void onMotionEvent(android.view.MotionEvent p0) {}
    void onStateChanged(int p0) {}
    public void requestTouchExploration() {}
    public void requestDragging(int p0) {}
    public void requestDelegating() {}
    public void performClick() {}
    public void performLongClickAndStartDrag() {}
    public int getMaxPointerCount() { return 0; }
    public int getDisplayId() { return 0; }
    public int getState() { return 0; }
    @android.annotation.NonNull
    public static java.lang.String stateToString(int p0) { return null; }

    public static interface Callback {
        public void onMotionEvent(android.view.MotionEvent p0);
        public void onStateChanged(int p0);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface State {
    }
}
