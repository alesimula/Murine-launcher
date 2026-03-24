package android.graphics;

@java.lang.Deprecated
public class Movie {
    @android.annotation.UnsupportedAppUsage
    private long mNativeMovie;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private Movie(long p0) {}
    public native int width();
    public native int height();
    public native boolean isOpaque();
    public native int duration();
    public native boolean setTime(int p0);
    private native void nDraw(long p0, float p1, float p2, long p3);
    public void draw(android.graphics.Canvas p0, float p1, float p2, android.graphics.Paint p3) {}
    public void draw(android.graphics.Canvas p0, float p1, float p2) {}
    public static android.graphics.Movie decodeStream(java.io.InputStream p0) { return null; }
    private static native android.graphics.Movie nativeDecodeAsset(long p0);
    private static native android.graphics.Movie nativeDecodeStream(java.io.InputStream p0);
    public static native android.graphics.Movie decodeByteArray(byte[] p0, int p1, int p2);
    private static native void nativeDestructor(long p0);
    public static android.graphics.Movie decodeFile(java.lang.String p0) { return null; }
    protected void finalize() throws java.lang.Throwable {}
    private static android.graphics.Movie decodeTempStream(java.io.InputStream p0) { return null; }
}
