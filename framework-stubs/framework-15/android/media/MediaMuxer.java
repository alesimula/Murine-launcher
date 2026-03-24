package android.media;

public final class MediaMuxer {
    public MediaMuxer(java.lang.String p0, int p1) throws java.io.IOException {}
    public MediaMuxer(java.io.FileDescriptor p0, int p1) throws java.io.IOException {}
    public void setOrientationHint(int p0) {}
    public void setLocation(float p0, float p1) {}
    public void start() {}
    public void stop() {}
    protected void finalize() throws java.lang.Throwable {}
    public int addTrack(android.media.MediaFormat p0) { return 0; }
    public void writeSampleData(int p0, java.nio.ByteBuffer p1, android.media.MediaCodec.BufferInfo p2) {}
    public void release() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Format {
    }

    public static final class OutputFormat {
        public static final int MUXER_OUTPUT_FIRST = 0;
        public static final int MUXER_OUTPUT_MPEG_4 = 0;
        public static final int MUXER_OUTPUT_WEBM = 1;
        public static final int MUXER_OUTPUT_3GPP = 2;
        public static final int MUXER_OUTPUT_HEIF = 3;
        public static final int MUXER_OUTPUT_OGG = 4;
        public static final int MUXER_OUTPUT_LAST = 4;
    }
}
