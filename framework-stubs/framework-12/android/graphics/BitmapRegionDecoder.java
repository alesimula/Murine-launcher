package android.graphics;

public final class BitmapRegionDecoder {
    private long mNativeBitmapRegionDecoder;
    private boolean mRecycled;
    private final java.lang.Object mNativeLock = null;
    @java.lang.Deprecated
    public static android.graphics.BitmapRegionDecoder newInstance(byte[] p0, int p1, int p2, boolean p3) throws java.io.IOException { return null; }
    public static android.graphics.BitmapRegionDecoder newInstance(byte[] p0, int p1, int p2) throws java.io.IOException { return null; }
    @java.lang.Deprecated
    public static android.graphics.BitmapRegionDecoder newInstance(java.io.FileDescriptor p0, boolean p1) throws java.io.IOException { return null; }
    public static android.graphics.BitmapRegionDecoder newInstance(android.os.ParcelFileDescriptor p0) throws java.io.IOException { return null; }
    @java.lang.Deprecated
    public static android.graphics.BitmapRegionDecoder newInstance(java.io.InputStream p0, boolean p1) throws java.io.IOException { return null; }
    public static android.graphics.BitmapRegionDecoder newInstance(java.io.InputStream p0) throws java.io.IOException { return null; }
    @java.lang.Deprecated
    public static android.graphics.BitmapRegionDecoder newInstance(java.lang.String p0, boolean p1) throws java.io.IOException { return null; }
    public static android.graphics.BitmapRegionDecoder newInstance(java.lang.String p0) throws java.io.IOException { return null; }
    private BitmapRegionDecoder(long p0) {}
    public android.graphics.Bitmap decodeRegion(android.graphics.Rect p0, android.graphics.BitmapFactory.Options p1) { return null; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public void recycle() {}
    public final boolean isRecycled() { return false; }
    private void checkRecycled(java.lang.String p0) {}
    protected void finalize() throws java.lang.Throwable {}
    private static native android.graphics.Bitmap nativeDecodeRegion(long p0, int p1, int p2, int p3, int p4, android.graphics.BitmapFactory.Options p5, long p6, long p7);
    private static native int nativeGetWidth(long p0);
    private static native int nativeGetHeight(long p0);
    private static native void nativeClean(long p0);
    private static native android.graphics.BitmapRegionDecoder nativeNewInstance(byte[] p0, int p1, int p2);
    private static native android.graphics.BitmapRegionDecoder nativeNewInstance(java.io.FileDescriptor p0);
    private static native android.graphics.BitmapRegionDecoder nativeNewInstance(java.io.InputStream p0, byte[] p1);
    private static native android.graphics.BitmapRegionDecoder nativeNewInstance(long p0);
}
