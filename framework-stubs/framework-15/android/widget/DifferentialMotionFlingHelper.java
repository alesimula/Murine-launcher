package android.widget;

public class DifferentialMotionFlingHelper {
    public DifferentialMotionFlingHelper(android.content.Context p0, android.widget.DifferentialMotionFlingHelper.DifferentialMotionFlingTarget p1) {}
    public DifferentialMotionFlingHelper(android.content.Context p0, android.widget.DifferentialMotionFlingHelper.DifferentialMotionFlingTarget p1, android.widget.DifferentialMotionFlingHelper.FlingVelocityThresholdCalculator p2, android.widget.DifferentialMotionFlingHelper.DifferentialVelocityProvider p3, android.widget.flags.FeatureFlags p4) {}
    public void onMotionEvent(android.view.MotionEvent p0, int p1) {}

    public static interface DifferentialMotionFlingTarget {
        public boolean startDifferentialMotionFling(float p0);
        public void stopDifferentialMotionFling();
        public float getScaledScrollFactor();
    }

    public static interface DifferentialVelocityProvider {
        public float getCurrentVelocity(android.view.VelocityTracker p0, android.view.MotionEvent p1, int p2);
    }

    public static interface FlingVelocityThresholdCalculator {
        public void calculateFlingVelocityThresholds(android.content.Context p0, int[] p1, android.view.MotionEvent p2, int p3);
    }
}
