package android.widget;

public class EditorTouchState {
    public EditorTouchState() {}
    public float getLastDownX() { return 0.0f; }
    public float getLastDownY() { return 0.0f; }
    public float getLastUpX() { return 0.0f; }
    public float getLastUpY() { return 0.0f; }
    public boolean isDoubleTap() { return false; }
    public boolean isTripleClick() { return false; }
    public boolean isMultiTap() { return false; }
    public boolean isMultiTapInSameArea() { return false; }
    public boolean isMovedEnoughForDrag() { return false; }
    public float getInitialDragDirectionXYRatio() { return 0.0f; }
    public void setIsOnHandle(boolean p0) {}
    public boolean isOnHandle() { return false; }
    public void update(android.view.MotionEvent p0, android.view.ViewConfiguration p1) {}
    public static boolean isDistanceWithin(float p0, float p1, float p2, float p3, int p4) { return false; }
    public static float getXYRatio(int p0) { return 0.0f; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MultiTapStatus {
        public static final int NONE = 0;
        public static final int FIRST_TAP = 1;
        public static final int DOUBLE_TAP = 2;
        public static final int TRIPLE_CLICK = 3;
    }
}
