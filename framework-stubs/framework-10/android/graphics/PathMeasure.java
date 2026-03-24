package android.graphics;

public class PathMeasure {
    private android.graphics.Path mPath;
    public static final int POSITION_MATRIX_FLAG = 1;
    public static final int TANGENT_MATRIX_FLAG = 2;
    private long native_instance;
    public PathMeasure() {}
    public PathMeasure(android.graphics.Path p0, boolean p1) {}
    public void setPath(android.graphics.Path p0, boolean p1) {}
    public float getLength() { return 0.0f; }
    public boolean getPosTan(float p0, float[] p1, float[] p2) { return false; }
    public boolean getMatrix(float p0, android.graphics.Matrix p1, int p2) { return false; }
    public boolean getSegment(float p0, float p1, android.graphics.Path p2, boolean p3) { return false; }
    public boolean isClosed() { return false; }
    public boolean nextContour() { return false; }
    protected void finalize() throws java.lang.Throwable {}
    private static native long native_create(long p0, boolean p1);
    private static native void native_setPath(long p0, long p1, boolean p2);
    private static native float native_getLength(long p0);
    private static native boolean native_getPosTan(long p0, float p1, float[] p2, float[] p3);
    private static native boolean native_getMatrix(long p0, float p1, long p2, int p3);
    private static native boolean native_getSegment(long p0, float p1, float p2, long p3, boolean p4);
    private static native boolean native_isClosed(long p0);
    private static native boolean native_nextContour(long p0);
    private static native void native_destroy(long p0);
}
