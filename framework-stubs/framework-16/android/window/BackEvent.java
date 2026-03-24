package android.window;

public final class BackEvent {
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_RIGHT = 1;
    @android.annotation.FlaggedApi("com.android.window.flags.predictive_back_swipe_edge_none_api")
    public static final int EDGE_NONE = 2;
    public static android.window.BackEvent fromBackMotionEvent(android.window.BackMotionEvent p0) { return null; }
    public BackEvent(float p0, float p1, float p2, int p3) {}
    @android.annotation.FlaggedApi("com.android.window.flags.predictive_back_timestamp_api")
    public BackEvent(float p0, float p1, float p2, int p3, long p4) {}
    public float getProgress() { return 0.0f; }
    public float getTouchX() { return 0.0f; }
    public float getTouchY() { return 0.0f; }
    public int getSwipeEdge() { return 0; }
    @android.annotation.FlaggedApi("com.android.window.flags.predictive_back_timestamp_api")
    public long getFrameTimeMillis() { return 0L; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SwipeEdge {
    }
}
