package android.util;

public abstract class Spline {
    public Spline() {}
    public abstract float interpolate(float p0);
    public static android.util.Spline createSpline(float[] p0, float[] p1) { return null; }
    public static android.util.Spline createMonotoneCubicSpline(float[] p0, float[] p1) { return null; }
    public static android.util.Spline createLinearSpline(float[] p0, float[] p1) { return null; }
    private static boolean isStrictlyIncreasing(float[] p0) { return false; }
    private static boolean isMonotonic(float[] p0) { return false; }

    public static class MonotoneCubicSpline extends android.util.Spline {
        private float[] mX;
        private float[] mY;
        private float[] mM;
        public MonotoneCubicSpline(float[] p0, float[] p1) { super(); }
        public float interpolate(float p0) { return 0.0f; }
        public java.lang.String toString() { return null; }
    }

    public static class LinearSpline extends android.util.Spline {
        private final float[] mX = null;
        private final float[] mY = null;
        private final float[] mM = null;
        public LinearSpline(float[] p0, float[] p1) { super(); }
        public float interpolate(float p0) { return 0.0f; }
        public java.lang.String toString() { return null; }
    }
}
