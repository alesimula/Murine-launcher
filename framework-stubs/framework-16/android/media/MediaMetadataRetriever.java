package android.media;

public class MediaMetadataRetriever implements java.lang.AutoCloseable {
    public static final int OPTION_PREVIOUS_SYNC = 0;
    public static final int OPTION_NEXT_SYNC = 1;
    public static final int OPTION_CLOSEST_SYNC = 2;
    public static final int OPTION_CLOSEST = 3;
    public static final int METADATA_KEY_CD_TRACK_NUMBER = 0;
    public static final int METADATA_KEY_ALBUM = 1;
    public static final int METADATA_KEY_ARTIST = 2;
    public static final int METADATA_KEY_AUTHOR = 3;
    public static final int METADATA_KEY_COMPOSER = 4;
    public static final int METADATA_KEY_DATE = 5;
    public static final int METADATA_KEY_GENRE = 6;
    public static final int METADATA_KEY_TITLE = 7;
    public static final int METADATA_KEY_YEAR = 8;
    public static final int METADATA_KEY_DURATION = 9;
    public static final int METADATA_KEY_NUM_TRACKS = 10;
    public static final int METADATA_KEY_WRITER = 11;
    public static final int METADATA_KEY_MIMETYPE = 12;
    public static final int METADATA_KEY_ALBUMARTIST = 13;
    public static final int METADATA_KEY_DISC_NUMBER = 14;
    public static final int METADATA_KEY_COMPILATION = 15;
    public static final int METADATA_KEY_HAS_AUDIO = 16;
    public static final int METADATA_KEY_HAS_VIDEO = 17;
    public static final int METADATA_KEY_VIDEO_WIDTH = 18;
    public static final int METADATA_KEY_VIDEO_HEIGHT = 19;
    public static final int METADATA_KEY_BITRATE = 20;
    public static final int METADATA_KEY_TIMED_TEXT_LANGUAGES = 21;
    public static final int METADATA_KEY_IS_DRM = 22;
    public static final int METADATA_KEY_LOCATION = 23;
    public static final int METADATA_KEY_VIDEO_ROTATION = 24;
    public static final int METADATA_KEY_CAPTURE_FRAMERATE = 25;
    public static final int METADATA_KEY_HAS_IMAGE = 26;
    public static final int METADATA_KEY_IMAGE_COUNT = 27;
    public static final int METADATA_KEY_IMAGE_PRIMARY = 28;
    public static final int METADATA_KEY_IMAGE_WIDTH = 29;
    public static final int METADATA_KEY_IMAGE_HEIGHT = 30;
    public static final int METADATA_KEY_IMAGE_ROTATION = 31;
    public static final int METADATA_KEY_VIDEO_FRAME_COUNT = 32;
    public static final int METADATA_KEY_EXIF_OFFSET = 33;
    public static final int METADATA_KEY_EXIF_LENGTH = 34;
    public static final int METADATA_KEY_COLOR_STANDARD = 35;
    public static final int METADATA_KEY_COLOR_TRANSFER = 36;
    public static final int METADATA_KEY_COLOR_RANGE = 37;
    public static final int METADATA_KEY_SAMPLERATE = 38;
    public static final int METADATA_KEY_BITS_PER_SAMPLE = 39;
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public static final int METADATA_KEY_VIDEO_CODEC_MIME_TYPE = 40;
    public static final int METADATA_KEY_XMP_OFFSET = 41;
    public static final int METADATA_KEY_XMP_LENGTH = 42;
    public MediaMetadataRetriever() {}
    public void setDataSource(java.lang.String p0) throws java.lang.IllegalArgumentException {}
    public void setDataSource(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1) throws java.lang.IllegalArgumentException {}
    public void setDataSource(java.io.FileDescriptor p0, long p1, long p2) throws java.lang.IllegalArgumentException {}
    public void setDataSource(java.io.FileDescriptor p0) throws java.lang.IllegalArgumentException {}
    public void setDataSource(android.content.Context p0, android.net.Uri p1) throws java.lang.IllegalArgumentException, java.lang.SecurityException {}
    public void setDataSource(android.media.MediaDataSource p0) throws java.lang.IllegalArgumentException {}
    @android.annotation.Nullable
    public java.lang.String extractMetadata(int p0) { return null; }
    @android.annotation.Nullable
    public android.graphics.Bitmap getFrameAtTime(long p0, int p1) { return null; }
    @android.annotation.Nullable
    public android.graphics.Bitmap getFrameAtTime(long p0, int p1, android.media.MediaMetadataRetriever.BitmapParams p2) { return null; }
    @android.annotation.Nullable
    public android.graphics.Bitmap getScaledFrameAtTime(long p0, int p1, int p2, int p3) { return null; }
    @android.annotation.Nullable
    public android.graphics.Bitmap getScaledFrameAtTime(long p0, int p1, int p2, int p3, android.media.MediaMetadataRetriever.BitmapParams p4) { return null; }
    @android.annotation.Nullable
    public android.graphics.Bitmap getFrameAtTime(long p0) { return null; }
    @android.annotation.Nullable
    public android.graphics.Bitmap getFrameAtTime() { return null; }
    @android.annotation.Nullable
    public android.graphics.Bitmap getFrameAtIndex(int p0, android.media.MediaMetadataRetriever.BitmapParams p1) { return null; }
    @android.annotation.Nullable
    public android.graphics.Bitmap getFrameAtIndex(int p0) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.graphics.Bitmap> getFramesAtIndex(int p0, int p1, android.media.MediaMetadataRetriever.BitmapParams p2) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.graphics.Bitmap> getFramesAtIndex(int p0, int p1) { return null; }
    @android.annotation.Nullable
    public android.graphics.Bitmap getImageAtIndex(int p0, android.media.MediaMetadataRetriever.BitmapParams p1) { return null; }
    @android.annotation.Nullable
    public native android.graphics.Bitmap getThumbnailImageAtIndex(int p0, android.media.MediaMetadataRetriever.BitmapParams p1, int p2, int p3);
    @android.annotation.Nullable
    public android.graphics.Bitmap getImageAtIndex(int p0) { return null; }
    @android.annotation.Nullable
    public android.graphics.Bitmap getPrimaryImage(android.media.MediaMetadataRetriever.BitmapParams p0) { return null; }
    @android.annotation.Nullable
    public android.graphics.Bitmap getPrimaryImage() { return null; }
    @android.annotation.Nullable
    public byte[] getEmbeddedPicture() { return null; }
    public void close() throws java.io.IOException {}
    public native void release() throws java.io.IOException;
    protected void finalize() throws java.lang.Throwable {}

    public static final class BitmapParams {
        public BitmapParams() {}
        public void setPreferredConfig(android.graphics.Bitmap.Config p0) {}
        @android.annotation.NonNull
        public android.graphics.Bitmap.Config getPreferredConfig() { return null; }
        @android.annotation.NonNull
        public android.graphics.Bitmap.Config getActualConfig() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Option {
    }
}
