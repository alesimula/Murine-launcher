package android.view;

public final class VelocityTracker {
    private static final android.util.Pools.SynchronizedPool<android.view.VelocityTracker> sPool = null;
    private static final int ACTIVE_POINTER_ID = -1;
    private long mPtr;
    private final java.lang.String mStrategy = null;
    private static native long nativeInitialize(java.lang.String p0);
    private static native void nativeDispose(long p0);
    private static native void nativeClear(long p0);
    private static native void nativeAddMovement(long p0, android.view.MotionEvent p1);
    private static native void nativeComputeCurrentVelocity(long p0, int p1, float p2);
    private static native float nativeGetXVelocity(long p0, int p1);
    private static native float nativeGetYVelocity(long p0, int p1);
    private static native boolean nativeGetEstimator(long p0, int p1, android.view.VelocityTracker.Estimator p2);
    public static android.view.VelocityTracker obtain() { return null; }
    public static android.view.VelocityTracker obtain(java.lang.String p0) { return null; }
    public void recycle() {}
    private VelocityTracker(java.lang.String p0) {}
    protected void finalize() throws java.lang.Throwable {}
    public void clear() {}
    public void addMovement(android.view.MotionEvent p0) {}
    public void computeCurrentVelocity(int p0) {}
    public void computeCurrentVelocity(int p0, float p1) {}
    public float getXVelocity() { return 0.0f; }
    public float getYVelocity() { return 0.0f; }
    public float getXVelocity(int p0) { return 0.0f; }
    public float getYVelocity(int p0) { return 0.0f; }
    public boolean getEstimator(int p0, android.view.VelocityTracker.Estimator p1) { return false; }

    public static final class Estimator {
        private static final int MAX_DEGREE = 4;
        public final float[] xCoeff = null;
        public final float[] yCoeff = null;
        public int degree;
        public float confidence;
        public Estimator() {}
        public float estimateX(float p0) { return 0.0f; }
        public float estimateY(float p0) { return 0.0f; }
        public float getXCoeff(int p0) { return 0.0f; }
        public float getYCoeff(int p0) { return 0.0f; }
        private float estimate(float p0, float[] p1) { return 0.0f; }
    }
}
