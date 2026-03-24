package android.hardware.camera2;

public final class DngCreator implements java.lang.AutoCloseable {
    public static final int MAX_THUMBNAIL_DIMENSION = 256;
    public DngCreator(android.hardware.camera2.CameraCharacteristics p0, android.hardware.camera2.CaptureResult p1) {}
    public android.hardware.camera2.DngCreator setOrientation(int p0) { return null; }
    public android.hardware.camera2.DngCreator setThumbnail(android.graphics.Bitmap p0) { return null; }
    public android.hardware.camera2.DngCreator setThumbnail(android.media.Image p0) { return null; }
    public android.hardware.camera2.DngCreator setLocation(android.location.Location p0) { return null; }
    public android.hardware.camera2.DngCreator setDescription(java.lang.String p0) { return null; }
    public void writeInputStream(java.io.OutputStream p0, android.util.Size p1, java.io.InputStream p2, long p3) throws java.io.IOException {}
    public void writeByteBuffer(java.io.OutputStream p0, android.util.Size p1, java.nio.ByteBuffer p2, long p3) throws java.io.IOException {}
    public void writeImage(java.io.OutputStream p0, android.media.Image p1) throws java.io.IOException {}
    public void close() {}
    protected void finalize() throws java.lang.Throwable {}
}
