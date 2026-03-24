package android.window;

public final class BackEvent {
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_RIGHT = 1;
    public static android.window.BackEvent fromBackMotionEvent(android.window.BackMotionEvent p0) { return null; }
    public BackEvent(float p0, float p1, float p2, int p3) {}
    public float getProgress() { return 0.0f; }
    public float getTouchX() { return 0.0f; }
    public float getTouchY() { return 0.0f; }
    public int getSwipeEdge() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SwipeEdge {
    }
}
