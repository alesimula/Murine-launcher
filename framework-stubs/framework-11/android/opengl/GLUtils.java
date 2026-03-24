package android.opengl;

public final class GLUtils {
    private GLUtils() {}
    public static int getInternalFormat(android.graphics.Bitmap p0) { return 0; }
    public static int getType(android.graphics.Bitmap p0) { return 0; }
    public static void texImage2D(int p0, int p1, int p2, android.graphics.Bitmap p3, int p4) {}
    public static void texImage2D(int p0, int p1, int p2, android.graphics.Bitmap p3, int p4, int p5) {}
    public static void texImage2D(int p0, int p1, android.graphics.Bitmap p2, int p3) {}
    public static void texSubImage2D(int p0, int p1, int p2, int p3, android.graphics.Bitmap p4) {}
    public static void texSubImage2D(int p0, int p1, int p2, int p3, android.graphics.Bitmap p4, int p5, int p6) {}
    public static java.lang.String getEGLErrorString(int p0) { return null; }
    private static native int native_getInternalFormat(android.graphics.Bitmap p0);
    private static native int native_getType(android.graphics.Bitmap p0);
    private static native int native_texImage2D(int p0, int p1, int p2, android.graphics.Bitmap p3, int p4, int p5);
    private static native int native_texSubImage2D(int p0, int p1, int p2, int p3, android.graphics.Bitmap p4, int p5, int p6);
}
