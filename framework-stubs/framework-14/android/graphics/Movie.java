package android.graphics;

@java.lang.Deprecated
public class Movie {
    public native int width();
    public native int height();
    public native boolean isOpaque();
    public native int duration();
    public native boolean setTime(int p0);
    public void draw(android.graphics.Canvas p0, float p1, float p2, android.graphics.Paint p3) {}
    public void draw(android.graphics.Canvas p0, float p1, float p2) {}
    public static android.graphics.Movie decodeStream(java.io.InputStream p0) { return null; }
    public static native android.graphics.Movie decodeByteArray(byte[] p0, int p1, int p2);
    public static android.graphics.Movie decodeFile(java.lang.String p0) { return null; }
    protected void finalize() throws java.lang.Throwable {}
}
