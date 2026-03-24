package android.graphics;

public class Mesh {
    public static final int TRIANGLES = 0;
    public static final int TRIANGLE_STRIP = 1;
    public Mesh(android.graphics.MeshSpecification p0, int p1, java.nio.Buffer p2, int p3, android.graphics.RectF p4) {}
    public Mesh(android.graphics.MeshSpecification p0, int p1, java.nio.Buffer p2, int p3, java.nio.ShortBuffer p4, android.graphics.RectF p5) {}
    public void setColorUniform(java.lang.String p0, int p1) {}
    public void setColorUniform(java.lang.String p0, long p1) {}
    public void setColorUniform(java.lang.String p0, android.graphics.Color p1) {}
    public void setFloatUniform(java.lang.String p0, float p1) {}
    public void setFloatUniform(java.lang.String p0, float p1, float p2) {}
    public void setFloatUniform(java.lang.String p0, float p1, float p2, float p3) {}
    public void setFloatUniform(java.lang.String p0, float p1, float p2, float p3, float p4) {}
    public void setFloatUniform(java.lang.String p0, float[] p1) {}
    public void setIntUniform(java.lang.String p0, int p1) {}
    public void setIntUniform(java.lang.String p0, int p1, int p2) {}
    public void setIntUniform(java.lang.String p0, int p1, int p2, int p3) {}
    public void setIntUniform(java.lang.String p0, int p1, int p2, int p3, int p4) {}
    public void setIntUniform(java.lang.String p0, int[] p1) {}
    long getNativeWrapperInstance() { return 0L; }

    private static class MeshHolder {
    }

    private static @interface Mode {
    }
}
