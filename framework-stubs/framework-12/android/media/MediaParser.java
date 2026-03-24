package android.media;

public final class MediaParser {
    public static final java.lang.String PARAMETER_ADTS_ENABLE_CBR_SEEKING = "android.media.mediaparser.adts.enableCbrSeeking";
    public static final java.lang.String PARAMETER_AMR_ENABLE_CBR_SEEKING = "android.media.mediaparser.amr.enableCbrSeeking";
    public static final java.lang.String PARAMETER_FLAC_DISABLE_ID3 = "android.media.mediaparser.flac.disableId3";
    public static final java.lang.String PARAMETER_MATROSKA_DISABLE_CUES_SEEKING = "android.media.mediaparser.matroska.disableCuesSeeking";
    public static final java.lang.String PARAMETER_MP3_DISABLE_ID3 = "android.media.mediaparser.mp3.disableId3";
    public static final java.lang.String PARAMETER_MP3_ENABLE_CBR_SEEKING = "android.media.mediaparser.mp3.enableCbrSeeking";
    public static final java.lang.String PARAMETER_MP3_ENABLE_INDEX_SEEKING = "android.media.mediaparser.mp3.enableIndexSeeking";
    public static final java.lang.String PARAMETER_MP4_IGNORE_EDIT_LISTS = "android.media.mediaparser.mp4.ignoreEditLists";
    public static final java.lang.String PARAMETER_MP4_IGNORE_TFDT_BOX = "android.media.mediaparser.mp4.ignoreTfdtBox";
    public static final java.lang.String PARAMETER_MP4_TREAT_VIDEO_FRAMES_AS_KEYFRAMES = "android.media.mediaparser.mp4.treatVideoFramesAsKeyframes";
    public static final java.lang.String PARAMETER_TS_ALLOW_NON_IDR_AVC_KEYFRAMES = "android.media.mediaparser.ts.allowNonIdrAvcKeyframes";
    public static final java.lang.String PARAMETER_TS_DETECT_ACCESS_UNITS = "android.media.mediaparser.ts.ignoreDetectAccessUnits";
    public static final java.lang.String PARAMETER_TS_ENABLE_HDMV_DTS_AUDIO_STREAMS = "android.media.mediaparser.ts.enableHdmvDtsAudioStreams";
    public static final java.lang.String PARAMETER_TS_IGNORE_AAC_STREAM = "android.media.mediaparser.ts.ignoreAacStream";
    public static final java.lang.String PARAMETER_TS_IGNORE_AVC_STREAM = "android.media.mediaparser.ts.ignoreAvcStream";
    public static final java.lang.String PARAMETER_TS_IGNORE_SPLICE_INFO_STREAM = "android.media.mediaparser.ts.ignoreSpliceInfoStream";
    public static final java.lang.String PARAMETER_TS_MODE = "android.media.mediaparser.ts.mode";
    public static final java.lang.String PARSER_NAME_AC3 = "android.media.mediaparser.Ac3Parser";
    public static final java.lang.String PARSER_NAME_AC4 = "android.media.mediaparser.Ac4Parser";
    public static final java.lang.String PARSER_NAME_ADTS = "android.media.mediaparser.AdtsParser";
    public static final java.lang.String PARSER_NAME_AMR = "android.media.mediaparser.AmrParser";
    public static final java.lang.String PARSER_NAME_FLAC = "android.media.mediaparser.FlacParser";
    public static final java.lang.String PARSER_NAME_FLV = "android.media.mediaparser.FlvParser";
    public static final java.lang.String PARSER_NAME_FMP4 = "android.media.mediaparser.FragmentedMp4Parser";
    public static final java.lang.String PARSER_NAME_MATROSKA = "android.media.mediaparser.MatroskaParser";
    public static final java.lang.String PARSER_NAME_MP3 = "android.media.mediaparser.Mp3Parser";
    public static final java.lang.String PARSER_NAME_MP4 = "android.media.mediaparser.Mp4Parser";
    public static final java.lang.String PARSER_NAME_OGG = "android.media.mediaparser.OggParser";
    public static final java.lang.String PARSER_NAME_PS = "android.media.mediaparser.PsParser";
    public static final java.lang.String PARSER_NAME_TS = "android.media.mediaparser.TsParser";
    public static final java.lang.String PARSER_NAME_UNKNOWN = "android.media.mediaparser.UNKNOWN";
    public static final java.lang.String PARSER_NAME_WAV = "android.media.mediaparser.WavParser";
    public static final int SAMPLE_FLAG_DECODE_ONLY = -2147483648;
    public static final int SAMPLE_FLAG_ENCRYPTED = 1073741824;
    public static final int SAMPLE_FLAG_HAS_SUPPLEMENTAL_DATA = 268435456;
    public static final int SAMPLE_FLAG_KEY_FRAME = 1;
    public static final int SAMPLE_FLAG_LAST_SAMPLE = 536870912;
    private MediaParser() {}
    @android.annotation.NonNull
    public static android.media.MediaParser createByName(java.lang.String p0, android.media.MediaParser.OutputConsumer p1) { return null; }
    @android.annotation.NonNull
    public static android.media.MediaParser create(android.media.MediaParser.OutputConsumer p0, java.lang.String... p1) { return null; }
    @android.annotation.NonNull
    public static java.util.List<java.lang.String> getParserNames(android.media.MediaFormat p0) { return null; }
    @android.annotation.NonNull
    public android.media.MediaParser setParameter(java.lang.String p0, java.lang.Object p1) { return null; }
    public boolean supportsParameter(java.lang.String p0) { return false; }
    @android.annotation.NonNull
    public java.lang.String getParserName() { return null; }
    public boolean advance(android.media.MediaParser.SeekableInputReader p0) throws java.io.IOException { return false; }
    public void seek(android.media.MediaParser.SeekPoint p0) {}
    public void release() {}
    public void setLogSessionId(android.media.metrics.LogSessionId p0) {}
    @android.annotation.NonNull
    public android.media.metrics.LogSessionId getLogSessionId() { return null; }

    public static interface InputReader {
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException;
        public long getPosition();
        public long getLength();
    }

    public static interface OutputConsumer {
        public void onSeekMapFound(android.media.MediaParser.SeekMap p0);
        public void onTrackCountFound(int p0);
        public void onTrackDataFound(int p0, android.media.MediaParser.TrackData p1);
        public void onSampleDataFound(int p0, android.media.MediaParser.InputReader p1) throws java.io.IOException;
        public void onSampleCompleted(int p0, long p1, int p2, int p3, int p4, android.media.MediaCodec.CryptoInfo p5);
    }

    public static final class ParsingException extends java.io.IOException {
        private ParsingException() { super(); }
    }

    public static final class SeekMap {
        public static final int UNKNOWN_DURATION = -2147483648;
        private SeekMap() {}
        public boolean isSeekable() { return false; }
        public long getDurationMicros() { return 0L; }
        @android.annotation.NonNull
        public android.util.Pair<android.media.MediaParser.SeekPoint, android.media.MediaParser.SeekPoint> getSeekPoints(long p0) { return null; }
    }

    public static final class SeekPoint {
        @android.annotation.NonNull
        public static final android.media.MediaParser.SeekPoint START = null;
        public final long position = 0L;
        public final long timeMicros = 0L;
        private SeekPoint() {}
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    public static interface SeekableInputReader extends android.media.MediaParser.InputReader {
        public void seekToPosition(long p0);
    }

    public static final class TrackData {
        @android.annotation.Nullable
        public final android.media.DrmInitData drmInitData = null;
        @android.annotation.NonNull
        public final android.media.MediaFormat mediaFormat = null;
        private TrackData() {}
    }

    public static final class UnrecognizedInputFormatException extends java.io.IOException {
        private UnrecognizedInputFormatException() { super(); }
    }
}
