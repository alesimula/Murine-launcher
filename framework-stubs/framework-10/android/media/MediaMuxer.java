package android.media;

public final class MediaMuxer {
    @android.annotation.UnsupportedAppUsage
    private static final int MUXER_STATE_UNINITIALIZED = -1;
    private static final int MUXER_STATE_INITIALIZED = 0;
    @android.annotation.UnsupportedAppUsage
    private static final int MUXER_STATE_STARTED = 1;
    @android.annotation.UnsupportedAppUsage
    private static final int MUXER_STATE_STOPPED = 2;
    @android.annotation.UnsupportedAppUsage
    private int mState;
    private int mLastTrackIndex;
    @android.annotation.UnsupportedAppUsage
    private long mNativeObject;
    @android.annotation.UnsupportedAppUsage
    private static native long nativeSetup(java.io.FileDescriptor p0, int p1) throws java.lang.IllegalArgumentException, java.io.IOException;
    @android.annotation.UnsupportedAppUsage
    private static native void nativeRelease(long p0);
    private static native void nativeStart(long p0);
    private static native void nativeStop(long p0);
    private static native int nativeAddTrack(long p0, java.lang.String[] p1, java.lang.Object[] p2);
    private static native void nativeSetOrientationHint(long p0, int p1);
    private static native void nativeSetLocation(long p0, int p1, int p2);
    private static native void nativeWriteSampleData(long p0, int p1, java.nio.ByteBuffer p2, int p3, int p4, long p5, int p6);
    public MediaMuxer(java.lang.String p0, int p1) throws java.io.IOException {}
    public MediaMuxer(java.io.FileDescriptor p0, int p1) throws java.io.IOException {}
    private void setUpMediaMuxer(java.io.FileDescriptor p0, int p1) throws java.io.IOException {}
    public void setOrientationHint(int p0) {}
    public void setLocation(float p0, float p1) {}
    public void start() {}
    public void stop() {}
    protected void finalize() throws java.lang.Throwable {}
    public int addTrack(android.media.MediaFormat p0) { return 0; }
    public void writeSampleData(int p0, java.nio.ByteBuffer p1, android.media.MediaCodec.BufferInfo p2) {}
    public void release() {}

    public static final class OutputFormat {
        public static final int MUXER_OUTPUT_FIRST = 0;
        public static final int MUXER_OUTPUT_MPEG_4 = 0;
        public static final int MUXER_OUTPUT_WEBM = 1;
        public static final int MUXER_OUTPUT_3GPP = 2;
        public static final int MUXER_OUTPUT_HEIF = 3;
        public static final int MUXER_OUTPUT_OGG = 4;
        public static final int MUXER_OUTPUT_LAST = 4;
        private OutputFormat() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Format {
    }
}
