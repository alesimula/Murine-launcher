package android.media;

public class ThumbnailUtils {
    @java.lang.Deprecated
    public static final int TARGET_SIZE_MICRO_THUMBNAIL = 96;
    public static final int OPTIONS_RECYCLE_INPUT = 2;
    public ThumbnailUtils() {}
    @java.lang.Deprecated
    @android.annotation.Nullable
    public static android.graphics.Bitmap createAudioThumbnail(java.lang.String p0, int p1) { return null; }
    @android.annotation.NonNull
    public static android.graphics.Bitmap createAudioThumbnail(java.io.File p0, android.util.Size p1, android.os.CancellationSignal p2) throws java.io.IOException { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public static android.graphics.Bitmap createImageThumbnail(java.lang.String p0, int p1) { return null; }
    @android.annotation.NonNull
    public static android.graphics.Bitmap createImageThumbnail(java.io.File p0, android.util.Size p1, android.os.CancellationSignal p2) throws java.io.IOException { return null; }
    @java.lang.Deprecated
    @android.annotation.Nullable
    public static android.graphics.Bitmap createVideoThumbnail(java.lang.String p0, int p1) { return null; }
    @android.annotation.NonNull
    public static android.graphics.Bitmap createVideoThumbnail(java.io.File p0, android.util.Size p1, android.os.CancellationSignal p2) throws java.io.IOException { return null; }
    public static android.graphics.Bitmap extractThumbnail(android.graphics.Bitmap p0, int p1, int p2) { return null; }
    public static android.graphics.Bitmap extractThumbnail(android.graphics.Bitmap p0, int p1, int p2, int p3) { return null; }

    private static class Resizer implements android.graphics.ImageDecoder.OnHeaderDecodedListener {
        public Resizer(android.util.Size p0, android.os.CancellationSignal p1) {}
        public void onHeaderDecoded(android.graphics.ImageDecoder p0, android.graphics.ImageDecoder.ImageInfo p1, android.graphics.ImageDecoder.Source p2) {}
    }

    @java.lang.Deprecated
    private static class SizedThumbnailBitmap {
        public byte[] mThumbnailData;
        public android.graphics.Bitmap mBitmap;
        public int mThumbnailWidth;
        public int mThumbnailHeight;
    }
}
