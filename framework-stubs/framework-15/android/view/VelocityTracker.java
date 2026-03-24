package android.view;

public final class VelocityTracker {
    public static final int VELOCITY_TRACKER_STRATEGY_DEFAULT = -1;
    public static final int VELOCITY_TRACKER_STRATEGY_IMPULSE = 0;
    public static final int VELOCITY_TRACKER_STRATEGY_LSQ1 = 1;
    public static final int VELOCITY_TRACKER_STRATEGY_LSQ2 = 2;
    public static final int VELOCITY_TRACKER_STRATEGY_LSQ3 = 3;
    public static final int VELOCITY_TRACKER_STRATEGY_WLSQ2_DELTA = 4;
    public static final int VELOCITY_TRACKER_STRATEGY_WLSQ2_CENTRAL = 5;
    public static final int VELOCITY_TRACKER_STRATEGY_WLSQ2_RECENT = 6;
    public static final int VELOCITY_TRACKER_STRATEGY_INT1 = 7;
    public static final int VELOCITY_TRACKER_STRATEGY_INT2 = 8;
    public static final int VELOCITY_TRACKER_STRATEGY_LEGACY = 9;
    public static android.view.VelocityTracker obtain() { return null; }
    @java.lang.Deprecated
    public static android.view.VelocityTracker obtain(java.lang.String p0) { return null; }
    public static android.view.VelocityTracker obtain(int p0) { return null; }
    public void recycle() {}
    public int getStrategyId() { return 0; }
    protected void finalize() throws java.lang.Throwable {}
    public boolean isAxisSupported(int p0) { return false; }
    public void clear() {}
    public void addMovement(android.view.MotionEvent p0) {}
    public void computeCurrentVelocity(int p0) {}
    public void computeCurrentVelocity(int p0, float p1) {}
    public float getXVelocity() { return 0.0f; }
    public float getYVelocity() { return 0.0f; }
    public float getXVelocity(int p0) { return 0.0f; }
    public float getYVelocity(int p0) { return 0.0f; }
    public float getAxisVelocity(int p0, int p1) { return 0.0f; }
    public float getAxisVelocity(int p0) { return 0.0f; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VelocityTrackableMotionEventAxis {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VelocityTrackerStrategy {
    }
}
