package android.graphics;

public class PathMeasure {
    public static final int POSITION_MATRIX_FLAG = 1;
    public static final int TANGENT_MATRIX_FLAG = 2;
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
}
