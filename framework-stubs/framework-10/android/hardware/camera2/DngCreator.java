package android.hardware.camera2;

public final class DngCreator implements java.lang.AutoCloseable {
    private static final java.lang.String TAG = "DngCreator";
    public static final int MAX_THUMBNAIL_DIMENSION = 256;
    private static final java.lang.String GPS_LAT_REF_NORTH = "N";
    private static final java.lang.String GPS_LAT_REF_SOUTH = "S";
    private static final java.lang.String GPS_LONG_REF_EAST = "E";
    private static final java.lang.String GPS_LONG_REF_WEST = "W";
    private static final java.lang.String GPS_DATE_FORMAT_STR = "yyyy:MM:dd";
    private static final java.lang.String TIFF_DATETIME_FORMAT = "yyyy:MM:dd HH:mm:ss";
    private static final java.text.DateFormat sExifGPSDateStamp = null;
    private final java.util.Calendar mGPSTimeStampCalendar = null;
    private static final int DEFAULT_PIXEL_STRIDE = 2;
    private static final int BYTES_PER_RGB_PIX = 3;
    private static final int TAG_ORIENTATION_UNKNOWN = 9;
    private long mNativeContext;
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
    private void writeByteBuffer(int p0, int p1, java.nio.ByteBuffer p2, java.io.OutputStream p3, int p4, int p5, long p6) throws java.io.IOException {}
    private static void yuvToRgb(byte[] p0, int p1, byte[] p2) {}
    private static void colorToRgb(int p0, int p1, byte[] p2) {}
    private static java.nio.ByteBuffer convertToRGB(android.media.Image p0) { return null; }
    private static java.nio.ByteBuffer convertToRGB(android.graphics.Bitmap p0) { return null; }
    private static int[] toExifLatLong(double p0) { return null; }
    private static native void nativeClassInit();
    private synchronized native void nativeInit(android.hardware.camera2.impl.CameraMetadataNative p0, android.hardware.camera2.impl.CameraMetadataNative p1, java.lang.String p2);
    private synchronized native void nativeDestroy();
    private synchronized native void nativeSetOrientation(int p0);
    private synchronized native void nativeSetDescription(java.lang.String p0);
    private synchronized native void nativeSetGpsTags(int[] p0, java.lang.String p1, int[] p2, java.lang.String p3, java.lang.String p4, int[] p5);
    private synchronized native void nativeSetThumbnail(java.nio.ByteBuffer p0, int p1, int p2);
    private synchronized native void nativeWriteImage(java.io.OutputStream p0, int p1, int p2, java.nio.ByteBuffer p3, int p4, int p5, long p6, boolean p7) throws java.io.IOException;
    private synchronized native void nativeWriteInputStream(java.io.OutputStream p0, java.io.InputStream p1, int p2, int p3, long p4) throws java.io.IOException;
}
