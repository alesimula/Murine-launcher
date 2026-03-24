package android.opengl;

public class Matrix {
    @java.lang.Deprecated
    public Matrix() {}
    public static native void multiplyMM(float[] p0, int p1, float[] p2, int p3, float[] p4, int p5);
    public static native void multiplyMV(float[] p0, int p1, float[] p2, int p3, float[] p4, int p5);
    public static void transposeM(float[] p0, int p1, float[] p2, int p3) {}
    public static boolean invertM(float[] p0, int p1, float[] p2, int p3) { return false; }
    public static void orthoM(float[] p0, int p1, float p2, float p3, float p4, float p5, float p6, float p7) {}
    public static void frustumM(float[] p0, int p1, float p2, float p3, float p4, float p5, float p6, float p7) {}
    public static void perspectiveM(float[] p0, int p1, float p2, float p3, float p4, float p5) {}
    public static float length(float p0, float p1, float p2) { return 0.0f; }
    public static void setIdentityM(float[] p0, int p1) {}
    public static void scaleM(float[] p0, int p1, float[] p2, int p3, float p4, float p5, float p6) {}
    public static void scaleM(float[] p0, int p1, float p2, float p3, float p4) {}
    public static void translateM(float[] p0, int p1, float[] p2, int p3, float p4, float p5, float p6) {}
    public static void translateM(float[] p0, int p1, float p2, float p3, float p4) {}
    public static void rotateM(float[] p0, int p1, float[] p2, int p3, float p4, float p5, float p6, float p7) {}
    public static void rotateM(float[] p0, int p1, float p2, float p3, float p4, float p5) {}
    public static void setRotateM(float[] p0, int p1, float p2, float p3, float p4, float p5) {}
    public static void setRotateEulerM(float[] p0, int p1, float p2, float p3, float p4) {}
    public static void setLookAtM(float[] p0, int p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, float p9, float p10) {}
}
