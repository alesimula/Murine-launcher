package android.media;

public class ThumbnailUtils {
    private static final java.lang.String TAG = "ThumbnailUtils";
    @java.lang.Deprecated
    public static final int TARGET_SIZE_MICRO_THUMBNAIL = 96;
    private static final int OPTIONS_NONE = 0;
    private static final int OPTIONS_SCALE_UP = 1;
    public static final int OPTIONS_RECYCLE_INPUT = 2;
    public ThumbnailUtils() {}
    private static android.util.Size convertKind(int p0) { return null; }
    @java.lang.Deprecated
    public static android.graphics.Bitmap createAudioThumbnail(java.lang.String p0, int p1) { return null; }
    public static android.graphics.Bitmap createAudioThumbnail(java.io.File p0, android.util.Size p1, android.os.CancellationSignal p2) throws java.io.IOException { return null; }
    @java.lang.Deprecated
    public static android.graphics.Bitmap createImageThumbnail(java.lang.String p0, int p1) { return null; }
    public static android.graphics.Bitmap createImageThumbnail(java.io.File p0, android.util.Size p1, android.os.CancellationSignal p2) throws java.io.IOException { return null; }
    @java.lang.Deprecated
    public static android.graphics.Bitmap createVideoThumbnail(java.lang.String p0, int p1) { return null; }
    public static android.graphics.Bitmap createVideoThumbnail(java.io.File p0, android.util.Size p1, android.os.CancellationSignal p2) throws java.io.IOException { return null; }
    public static android.graphics.Bitmap extractThumbnail(android.graphics.Bitmap p0, int p1, int p2) { return null; }
    public static android.graphics.Bitmap extractThumbnail(android.graphics.Bitmap p0, int p1, int p2, int p3) { return null; }
    @java.lang.Deprecated
    private static int computeSampleSize(android.graphics.BitmapFactory.Options p0, int p1, int p2) { return 0; }
    @java.lang.Deprecated
    private static int computeInitialSampleSize(android.graphics.BitmapFactory.Options p0, int p1, int p2) { return 0; }
    @java.lang.Deprecated
    private static void closeSilently(android.os.ParcelFileDescriptor p0) {}
    @java.lang.Deprecated
    private static android.os.ParcelFileDescriptor makeInputStream(android.net.Uri p0, android.content.ContentResolver p1) { return null; }
    @java.lang.Deprecated
    private static android.graphics.Bitmap transform(android.graphics.Matrix p0, android.graphics.Bitmap p1, int p2, int p3, int p4) { return null; }
    @java.lang.Deprecated
    private static void createThumbnailFromEXIF(java.lang.String p0, int p1, int p2, android.media.ThumbnailUtils.SizedThumbnailBitmap p3) {}

    private static class Resizer implements android.graphics.ImageDecoder.OnHeaderDecodedListener {
        private final android.util.Size size = null;
        private final android.os.CancellationSignal signal = null;
        public Resizer(android.util.Size p0, android.os.CancellationSignal p1) {}
        public void onHeaderDecoded(android.graphics.ImageDecoder p0, android.graphics.ImageDecoder.ImageInfo p1, android.graphics.ImageDecoder.Source p2) {}
    }

    @java.lang.Deprecated
    private static class SizedThumbnailBitmap {
        public byte[] mThumbnailData;
        public android.graphics.Bitmap mBitmap;
        public int mThumbnailWidth;
        public int mThumbnailHeight;
        private SizedThumbnailBitmap() {}
    }
}
