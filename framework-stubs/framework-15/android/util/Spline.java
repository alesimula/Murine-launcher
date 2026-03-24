package android.util;

public abstract class Spline {
    public Spline() {}
    public abstract float interpolate(float p0);
    public static android.util.Spline createSpline(float[] p0, float[] p1) { return null; }
    public static android.util.Spline createMonotoneCubicSpline(float[] p0, float[] p1) { return null; }
    public static android.util.Spline createLinearSpline(float[] p0, float[] p1) { return null; }

    public static class LinearSpline extends android.util.Spline {
        public LinearSpline(float[] p0, float[] p1) { super(); }
        public float interpolate(float p0) { return 0.0f; }
        public java.lang.String toString() { return null; }
    }

    public static class MonotoneCubicSpline extends android.util.Spline {
        public MonotoneCubicSpline(float[] p0, float[] p1) { super(); }
        public float interpolate(float p0) { return 0.0f; }
        public java.lang.String toString() { return null; }
    }
}
