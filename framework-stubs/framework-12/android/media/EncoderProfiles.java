package android.media;

public final class EncoderProfiles {
    private int durationSecs;
    private int fileFormat;
    private java.util.List<android.media.EncoderProfiles.AudioProfile> audioProfiles;
    private java.util.List<android.media.EncoderProfiles.VideoProfile> videoProfiles;
    public int getDefaultDurationSeconds() { return 0; }
    public int getRecommendedFileFormat() { return 0; }
    public java.util.List<android.media.EncoderProfiles.AudioProfile> getAudioProfiles() { return null; }
    public java.util.List<android.media.EncoderProfiles.VideoProfile> getVideoProfiles() { return null; }
    EncoderProfiles(int p0, int p1, android.media.EncoderProfiles.VideoProfile[] p2, android.media.EncoderProfiles.AudioProfile[] p3) {}

    public static final class AudioProfile {
        private int codec;
        private int channels;
        private int sampleRate;
        private int bitrate;
        private int profile;
        public int getCodec() { return 0; }
        public java.lang.String getMediaType() { return null; }
        public int getBitrate() { return 0; }
        public int getSampleRate() { return 0; }
        public int getChannels() { return 0; }
        public int getProfile() { return 0; }
        AudioProfile(int p0, int p1, int p2, int p3, int p4) {}
    }

    public static final class VideoProfile {
        private int codec;
        private int width;
        private int height;
        private int frameRate;
        private int bitrate;
        private int profile;
        public int getCodec() { return 0; }
        public java.lang.String getMediaType() { return null; }
        public int getBitrate() { return 0; }
        public int getFrameRate() { return 0; }
        public int getWidth() { return 0; }
        public int getHeight() { return 0; }
        public int getProfile() { return 0; }
        VideoProfile(int p0, int p1, int p2, int p3, int p4, int p5) {}
    }
}
