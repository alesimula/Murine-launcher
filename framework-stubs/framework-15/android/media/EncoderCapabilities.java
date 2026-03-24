package android.media;

public class EncoderCapabilities {
    public static int[] getOutputFileFormats() { return null; }
    public static java.util.List<android.media.EncoderCapabilities.VideoEncoderCap> getVideoEncoders() { return null; }
    public static java.util.List<android.media.EncoderCapabilities.AudioEncoderCap> getAudioEncoders() { return null; }

    public static class AudioEncoderCap {
        public final int mCodec = 0;
        public final int mMinChannels = 0;
        public final int mMaxChannels = 0;
        public final int mMinSampleRate = 0;
        public final int mMaxSampleRate = 0;
        public final int mMinBitRate = 0;
        public final int mMaxBitRate = 0;
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
    }
}
