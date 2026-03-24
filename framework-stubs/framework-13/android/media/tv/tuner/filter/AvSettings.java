package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class AvSettings extends android.media.tv.tuner.filter.Settings {
    public static final int VIDEO_STREAM_TYPE_UNDEFINED = 0;
    public static final int VIDEO_STREAM_TYPE_RESERVED = 1;
    public static final int VIDEO_STREAM_TYPE_MPEG1 = 2;
    public static final int VIDEO_STREAM_TYPE_MPEG2 = 3;
    public static final int VIDEO_STREAM_TYPE_MPEG4P2 = 4;
    public static final int VIDEO_STREAM_TYPE_AVC = 5;
    public static final int VIDEO_STREAM_TYPE_HEVC = 6;
    public static final int VIDEO_STREAM_TYPE_VC1 = 7;
    public static final int VIDEO_STREAM_TYPE_VP8 = 8;
    public static final int VIDEO_STREAM_TYPE_VP9 = 9;
    public static final int VIDEO_STREAM_TYPE_AV1 = 10;
    public static final int VIDEO_STREAM_TYPE_AVS = 11;
    public static final int VIDEO_STREAM_TYPE_AVS2 = 12;
    public static final int AUDIO_STREAM_TYPE_UNDEFINED = 0;
    public static final int AUDIO_STREAM_TYPE_PCM = 1;
    public static final int AUDIO_STREAM_TYPE_MP3 = 2;
    public static final int AUDIO_STREAM_TYPE_MPEG1 = 3;
    public static final int AUDIO_STREAM_TYPE_MPEG2 = 4;
    public static final int AUDIO_STREAM_TYPE_MPEGH = 5;
    public static final int AUDIO_STREAM_TYPE_AAC = 6;
    public static final int AUDIO_STREAM_TYPE_AC3 = 7;
    public static final int AUDIO_STREAM_TYPE_EAC3 = 8;
    public static final int AUDIO_STREAM_TYPE_AC4 = 9;
    public static final int AUDIO_STREAM_TYPE_DTS = 10;
    public static final int AUDIO_STREAM_TYPE_DTS_HD = 11;
    public static final int AUDIO_STREAM_TYPE_WMA = 12;
    public static final int AUDIO_STREAM_TYPE_OPUS = 13;
    public static final int AUDIO_STREAM_TYPE_VORBIS = 14;
    public static final int AUDIO_STREAM_TYPE_DRA = 15;
    public static final int AUDIO_STREAM_TYPE_AAC_ADTS = 16;
    public static final int AUDIO_STREAM_TYPE_AAC_LATM = 17;
    public static final int AUDIO_STREAM_TYPE_AAC_HE_ADTS = 18;
    public static final int AUDIO_STREAM_TYPE_AAC_HE_LATM = 19;
    AvSettings() { super(0); }
    public boolean isPassthrough() { return false; }
    public int getAudioStreamType() { return 0; }
    public int getVideoStreamType() { return 0; }
    public boolean useSecureMemory() { return false; }
    public static android.media.tv.tuner.filter.AvSettings.Builder builder(int p0, boolean p1) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioStreamType {
    }

    public static class Builder {
        boolean mUseSecureMemory;
        public android.media.tv.tuner.filter.AvSettings.Builder setPassthrough(boolean p0) { return null; }
        public android.media.tv.tuner.filter.AvSettings.Builder setAudioStreamType(int p0) { return null; }
        public android.media.tv.tuner.filter.AvSettings.Builder setVideoStreamType(int p0) { return null; }
        public android.media.tv.tuner.filter.AvSettings.Builder setUseSecureMemory(boolean p0) { return null; }
        public android.media.tv.tuner.filter.AvSettings build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VideoStreamType {
    }
}
