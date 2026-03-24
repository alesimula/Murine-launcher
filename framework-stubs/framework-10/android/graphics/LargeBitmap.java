package android.graphics;

public final class LargeBitmap {
    private long mNativeLargeBitmap;
    private boolean mRecycled;
    private LargeBitmap(long p0) {}
    public android.graphics.Bitmap decodeRegion(android.graphics.Rect p0, android.graphics.BitmapFactory.Options p1) { return null; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public void recycle() {}
    public final boolean isRecycled() { return false; }
    private void checkRecycled(java.lang.String p0) {}
    protected void finalize() {}
    private static native android.graphics.Bitmap nativeDecodeRegion(long p0, int p1, int p2, int p3, int p4, android.graphics.BitmapFactory.Options p5);
    private static native int nativeGetWidth(long p0);
    private static native int nativeGetHeight(long p0);
    private static native void nativeClean(long p0);
}
