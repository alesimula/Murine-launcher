package android.media;

public class EncoderCapabilities {
    private static final java.lang.String TAG = "EncoderCapabilities";
    public static int[] getOutputFileFormats() { return null; }
    public static java.util.List<android.media.EncoderCapabilities.VideoEncoderCap> getVideoEncoders() { return null; }
    public static java.util.List<android.media.EncoderCapabilities.AudioEncoderCap> getAudioEncoders() { return null; }
    private EncoderCapabilities() {}
    private static final native void native_init();
    private static final native int native_get_num_file_formats();
    private static final native int native_get_file_format(int p0);
    private static final native int native_get_num_video_encoders();
    private static final native android.media.EncoderCapabilities.VideoEncoderCap native_get_video_encoder_cap(int p0);
    private static final native int native_get_num_audio_encoders();
    private static final native android.media.EncoderCapabilities.AudioEncoderCap native_get_audio_encoder_cap(int p0);

    public static class AudioEncoderCap {
        public final int mCodec = 0;
        public final int mMinChannels = 0;
        public final int mMaxChannels = 0;
        public final int mMinSampleRate = 0;
        public final int mMaxSampleRate = 0;
        public final int mMinBitRate = 0;
        public final int mMaxBitRate = 0;
        private AudioEncoderCap(int p0, int p1, int p2, int p3, int p4, int p5, int p6) {}
    }

    public static class VideoEncoderCap {
        public final int mCodec = 0;
        public final int mMinBitRate = 0;
        public final int mMaxBitRate = 0;
        public final int mMinFrameRate = 0;
        public final int mMaxFrameRate = 0;
        public final int mMinFrameWidth = 0;
        public final int mMaxFrameWidth = 0;
        public final int mMinFrameHeight = 0;
        public final int mMaxFrameHeight = 0;
        private VideoEncoderCap(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8) {}
    }
}
