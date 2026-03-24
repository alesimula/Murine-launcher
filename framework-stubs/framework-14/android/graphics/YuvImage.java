package android.graphics;

public class YuvImage {
    public YuvImage(byte[] p0, int p1, int p2, int p3, int[] p4) {}
    public YuvImage(byte[] p0, int p1, int p2, int p3, int[] p4, android.graphics.ColorSpace p5) {}
    public boolean compressToJpeg(android.graphics.Rect p0, int p1, java.io.OutputStream p2) { return false; }
    public boolean compressToJpegR(android.graphics.YuvImage p0, int p1, java.io.OutputStream p2) { return false; }
    public byte[] getYuvData() { return null; }
    public int getYuvFormat() { return 0; }
    public int[] getStrides() { return null; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public android.graphics.ColorSpace getColorSpace() { return null; }
    int[] calculateOffsets(int p0, int p1) { return null; }
}
