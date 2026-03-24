package android.renderscript;

@java.lang.Deprecated
public class Matrix4f {
    final float[] mMat = null;
    public Matrix4f() {}
    public Matrix4f(float[] p0) {}
    public float[] getArray() { return null; }
    public float get(int p0, int p1) { return 0.0f; }
    public void set(int p0, int p1, float p2) {}
    public void loadIdentity() {}
    public void load(android.renderscript.Matrix4f p0) {}
    public void load(android.renderscript.Matrix3f p0) {}
    public void loadRotate(float p0, float p1, float p2, float p3) {}
    public void loadScale(float p0, float p1, float p2) {}
    public void loadTranslate(float p0, float p1, float p2) {}
    public void loadMultiply(android.renderscript.Matrix4f p0, android.renderscript.Matrix4f p1) {}
    public void loadOrtho(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void loadOrthoWindow(int p0, int p1) {}
    public void loadFrustum(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void loadPerspective(float p0, float p1, float p2, float p3) {}
    public void loadProjectionNormalized(int p0, int p1) {}
    public void multiply(android.renderscript.Matrix4f p0) {}
    public void rotate(float p0, float p1, float p2, float p3) {}
    public void scale(float p0, float p1, float p2) {}
    public void translate(float p0, float p1, float p2) {}
    public boolean inverse() { return false; }
    public boolean inverseTranspose() { return false; }
    public void transpose() {}
}
