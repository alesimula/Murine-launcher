package android.graphics;

public class YuvImage {
    private static final int WORKING_COMPRESS_STORAGE = 4096;
    private int mFormat;
    private byte[] mData;
    private int[] mStrides;
    private int mWidth;
    private int mHeight;
    public YuvImage(byte[] p0, int p1, int p2, int p3, int[] p4) {}
    public boolean compressToJpeg(android.graphics.Rect p0, int p1, java.io.OutputStream p2) { return false; }
    public byte[] getYuvData() { return null; }
    public int getYuvFormat() { return 0; }
    public int[] getStrides() { return null; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    int[] calculateOffsets(int p0, int p1) { return null; }
    private int[] calculateStrides(int p0, int p1) { return null; }
    private void adjustRectangle(android.graphics.Rect p0) {}
    private static native boolean nativeCompressToJpeg(byte[] p0, int p1, int p2, int p3, int[] p4, int[] p5, int p6, java.io.OutputStream p7, byte[] p8);
}
