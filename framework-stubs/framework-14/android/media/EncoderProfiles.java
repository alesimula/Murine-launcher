package android.media;

public final class EncoderProfiles {
    public int getDefaultDurationSeconds() { return 0; }
    public int getRecommendedFileFormat() { return 0; }
    public java.util.List<android.media.EncoderProfiles.AudioProfile> getAudioProfiles() { return null; }
    public java.util.List<android.media.EncoderProfiles.VideoProfile> getVideoProfiles() { return null; }
    EncoderProfiles(int p0, int p1, android.media.EncoderProfiles.VideoProfile[] p2, android.media.EncoderProfiles.AudioProfile[] p3) {}

    public static final class VideoProfile {
        public static final int HDR_NONE = 0;
        public static final int HDR_HLG = 1;
        public static final int HDR_HDR10 = 2;
        public static final int HDR_HDR10PLUS = 3;
        public static final int HDR_DOLBY_VISION = 4;
        public static final int YUV_420 = 0;
        public static final int YUV_422 = 1;
        public static final int YUV_444 = 2;
        public int getCodec() { return 0; }
        public java.lang.String getMediaType() { return null; }
        public int getBitrate() { return 0; }
        public int getFrameRate() { return 0; }
        public int getWidth() { return 0; }
        public int getHeight() { return 0; }
        public int getProfile() { return 0; }
        public int getBitDepth() { return 0; }
        public int getChromaSubsampling() { return 0; }
        public int getHdrFormat() { return 0; }
        VideoProfile(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8) {}
        VideoProfile(int p0, int p1, int p2, int p3, int p4, int p5) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface ChromaSubsampling {
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface HdrFormat {
        }
    }

    public static final class AudioProfile {
        public int getCodec() { return 0; }
        public java.lang.String getMediaType() { return null; }
        public int getBitrate() { return 0; }
        public int getSampleRate() { return 0; }
        public int getChannels() { return 0; }
        public int getProfile() { return 0; }
        AudioProfile(int p0, int p1, int p2, int p3, int p4) {}
    }
}
