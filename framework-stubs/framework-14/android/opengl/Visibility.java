package android.opengl;

public class Visibility {
    public Visibility() {}
    public static native int visibilityTest(float[] p0, int p1, float[] p2, int p3, char[] p4, int p5, int p6);
    public static native int frustumCullSpheres(float[] p0, int p1, float[] p2, int p3, int p4, int[] p5, int p6, int p7);
    public static native void computeBoundingSphere(float[] p0, int p1, int p2, float[] p3, int p4);
}
