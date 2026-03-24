package android.media;

public class MediaRecorder implements android.media.AudioRouting, android.media.AudioRecordingMonitor, android.media.AudioRecordingMonitorClient, android.media.MicrophoneDirection {
    public static final int MEDIA_RECORDER_ERROR_UNKNOWN = 1;
    public static final int MEDIA_ERROR_SERVER_DIED = 100;
    public static final int MEDIA_RECORDER_INFO_UNKNOWN = 1;
    public static final int MEDIA_RECORDER_INFO_MAX_DURATION_REACHED = 800;
    public static final int MEDIA_RECORDER_INFO_MAX_FILESIZE_REACHED = 801;
    public static final int MEDIA_RECORDER_INFO_MAX_FILESIZE_APPROACHING = 802;
    public static final int MEDIA_RECORDER_INFO_NEXT_OUTPUT_FILE_STARTED = 803;
    public static final int MEDIA_RECORDER_TRACK_INFO_LIST_START = 1000;
    public static final int MEDIA_RECORDER_TRACK_INFO_COMPLETION_STATUS = 1000;
    public static final int MEDIA_RECORDER_TRACK_INFO_PROGRESS_IN_TIME = 1001;
    public static final int MEDIA_RECORDER_TRACK_INFO_TYPE = 1002;
    public static final int MEDIA_RECORDER_TRACK_INFO_DURATION_MS = 1003;
    public static final int MEDIA_RECORDER_TRACK_INFO_MAX_CHUNK_DUR_MS = 1004;
    public static final int MEDIA_RECORDER_TRACK_INFO_ENCODED_FRAMES = 1005;
    public static final int MEDIA_RECORDER_TRACK_INTER_CHUNK_TIME_MS = 1006;
    public static final int MEDIA_RECORDER_TRACK_INFO_INITIAL_DELAY_MS = 1007;
    public static final int MEDIA_RECORDER_TRACK_INFO_START_OFFSET_MS = 1008;
    public static final int MEDIA_RECORDER_TRACK_INFO_DATA_KBYTES = 1009;
    public static final int MEDIA_RECORDER_TRACK_INFO_LIST_END = 2000;
    android.media.AudioRecordingMonitorImpl mRecordingInfoImpl;
    @java.lang.Deprecated
    public MediaRecorder() {}
    public MediaRecorder(android.content.Context p0) {}
    public void setLogSessionId(android.media.metrics.LogSessionId p0) {}
    public android.media.metrics.LogSessionId getLogSessionId() { return null; }
    @java.lang.Deprecated
    public native void setCamera(android.hardware.Camera p0);
    public native android.view.Surface getSurface();
    public void setInputSurface(android.view.Surface p0) {}
    public void setPreviewDisplay(android.view.Surface p0) {}
    public static boolean isSystemOnlyAudioSource(int p0) { return false; }
    public static boolean isValidAudioSource(int p0) { return false; }
    public static final java.lang.String toLogFriendlyAudioSource(int p0) { return null; }
    public native void setAudioSource(int p0) throws java.lang.IllegalStateException;
    public static final int getAudioSourceMax() { return 0; }
    public native void setPrivacySensitive(boolean p0);
    public native boolean isPrivacySensitive();
    public native void setVideoSource(int p0) throws java.lang.IllegalStateException;
    public void setProfile(android.media.CamcorderProfile p0) {}
    public void setAudioProfile(android.media.EncoderProfiles.AudioProfile p0) {}
    public void setVideoProfile(android.media.EncoderProfiles.VideoProfile p0) {}
    public void setCaptureRate(double p0) {}
    public void setOrientationHint(int p0) {}
    public void setLocation(float p0, float p1) {}
    public native void setOutputFormat(int p0) throws java.lang.IllegalStateException;
    public native void setVideoSize(int p0, int p1) throws java.lang.IllegalStateException;
    public native void setVideoFrameRate(int p0) throws java.lang.IllegalStateException;
    public native void setMaxDuration(int p0) throws java.lang.IllegalArgumentException;
    public native void setMaxFileSize(long p0) throws java.lang.IllegalArgumentException;
    public native void setAudioEncoder(int p0) throws java.lang.IllegalStateException;
    public native void setVideoEncoder(int p0) throws java.lang.IllegalStateException;
    public void setAudioSamplingRate(int p0) {}
    public void setAudioChannels(int p0) {}
    public void setAudioEncodingBitRate(int p0) {}
    public void setVideoEncodingBitRate(int p0) {}
    public void setVideoEncodingProfileLevel(int p0, int p1) {}
    public void setAuxiliaryOutputFile(java.io.FileDescriptor p0) {}
    public void setAuxiliaryOutputFile(java.lang.String p0) {}
    public void setOutputFile(java.io.FileDescriptor p0) throws java.lang.IllegalStateException {}
    public void setOutputFile(java.io.File p0) {}
    public void setNextOutputFile(java.io.FileDescriptor p0) throws java.io.IOException {}
    public void setOutputFile(java.lang.String p0) throws java.lang.IllegalStateException {}
    public void setNextOutputFile(java.io.File p0) throws java.io.IOException {}
    public void prepare() throws java.lang.IllegalStateException, java.io.IOException {}
    public native void start() throws java.lang.IllegalStateException;
    public native void stop() throws java.lang.IllegalStateException;
    public native void pause() throws java.lang.IllegalStateException;
    public native void resume() throws java.lang.IllegalStateException;
    public void reset() {}
    public native int getMaxAmplitude() throws java.lang.IllegalStateException;
    public void setOnErrorListener(android.media.MediaRecorder.OnErrorListener p0) {}
    public void setOnInfoListener(android.media.MediaRecorder.OnInfoListener p0) {}
    public boolean setPreferredDevice(android.media.AudioDeviceInfo p0) { return false; }
    public android.media.AudioDeviceInfo getPreferredDevice() { return null; }
    public android.media.AudioDeviceInfo getRoutedDevice() { return null; }
    public void addOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener p0, android.os.Handler p1) {}
    public void removeOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener p0) {}
    public java.util.List<android.media.MicrophoneInfo> getActiveMicrophones() throws java.io.IOException { return null; }
    public boolean setPreferredMicrophoneDirection(int p0) { return false; }
    public boolean setPreferredMicrophoneFieldDimension(float p0) { return false; }
    public void registerAudioRecordingCallback(java.util.concurrent.Executor p0, android.media.AudioManager.AudioRecordingCallback p1) {}
    public void unregisterAudioRecordingCallback(android.media.AudioManager.AudioRecordingCallback p0) {}
    public android.media.AudioRecordingConfiguration getActiveRecordingConfiguration() { return null; }
    public int getPortId() { return 0; }
    public native void release();
    public android.os.PersistableBundle getMetrics() { return null; }
    protected void finalize() {}

    public static interface OnErrorListener {
        public void onError(android.media.MediaRecorder p0, int p1, int p2);
    }

    public final class AudioEncoder {
        public static final int DEFAULT = 0;
        public static final int AMR_NB = 1;
        public static final int AMR_WB = 2;
        public static final int AAC = 3;
        public static final int HE_AAC = 4;
        public static final int AAC_ELD = 5;
        public static final int VORBIS = 6;
        public static final int OPUS = 7;
    }

    public final class VideoEncoder {
        public static final int DEFAULT = 0;
        public static final int H263 = 1;
        public static final int H264 = 2;
        public static final int MPEG_4_SP = 3;
        public static final int VP8 = 4;
        public static final int HEVC = 5;
        public static final int VP9 = 6;
        public static final int DOLBY_VISION = 7;
        public static final int AV1 = 8;
    }

    public final class OutputFormat {
        public static final int DEFAULT = 0;
        public static final int THREE_GPP = 1;
        public static final int MPEG_4 = 2;
        public static final int RAW_AMR = 3;
        public static final int AMR_NB = 3;
        public static final int AMR_WB = 4;
        public static final int AAC_ADIF = 5;
        public static final int AAC_ADTS = 6;
        public static final int OUTPUT_FORMAT_RTP_AVP = 7;
        public static final int MPEG_2_TS = 8;
        public static final int WEBM = 9;
        public static final int HEIF = 10;
        public static final int OGG = 11;
    }

    public static final class MetricsConstants {
        public static final java.lang.String AUDIO_BITRATE = "android.media.mediarecorder.audio-bitrate";
        public static final java.lang.String AUDIO_CHANNELS = "android.media.mediarecorder.audio-channels";
        public static final java.lang.String AUDIO_SAMPLERATE = "android.media.mediarecorder.audio-samplerate";
        public static final java.lang.String AUDIO_TIMESCALE = "android.media.mediarecorder.audio-timescale";
        public static final java.lang.String CAPTURE_FPS = "android.media.mediarecorder.capture-fps";
        public static final java.lang.String CAPTURE_FPS_ENABLE = "android.media.mediarecorder.capture-fpsenable";
        public static final java.lang.String FRAMERATE = "android.media.mediarecorder.frame-rate";
        public static final java.lang.String HEIGHT = "android.media.mediarecorder.height";
        public static final java.lang.String MOVIE_TIMESCALE = "android.media.mediarecorder.movie-timescale";
        public static final java.lang.String ROTATION = "android.media.mediarecorder.rotation";
        public static final java.lang.String VIDEO_BITRATE = "android.media.mediarecorder.video-bitrate";
        public static final java.lang.String VIDEO_IFRAME_INTERVAL = "android.media.mediarecorder.video-iframe-interval";
        public static final java.lang.String VIDEO_LEVEL = "android.media.mediarecorder.video-encoder-level";
        public static final java.lang.String VIDEO_PROFILE = "android.media.mediarecorder.video-encoder-profile";
        public static final java.lang.String VIDEO_TIMESCALE = "android.media.mediarecorder.video-timescale";
        public static final java.lang.String WIDTH = "android.media.mediarecorder.width";
    }

    public final class AudioSource {
        public static final int AUDIO_SOURCE_INVALID = -1;
        public static final int DEFAULT = 0;
        public static final int MIC = 1;
        public static final int VOICE_UPLINK = 2;
        public static final int VOICE_DOWNLINK = 3;
        public static final int VOICE_CALL = 4;
        public static final int CAMCORDER = 5;
        public static final int VOICE_RECOGNITION = 6;
        public static final int VOICE_COMMUNICATION = 7;
        @android.annotation.RequiresPermission("android.permission.CAPTURE_AUDIO_OUTPUT")
        public static final int REMOTE_SUBMIX = 8;
        public static final int UNPROCESSED = 9;
        public static final int VOICE_PERFORMANCE = 10;
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.CAPTURE_AUDIO_OUTPUT")
        public static final int ECHO_REFERENCE = 1997;
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.CAPTURE_AUDIO_OUTPUT")
        public static final int RADIO_TUNER = 1998;
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.CAPTURE_AUDIO_HOTWORD")
        public static final int HOTWORD = 1999;
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.ACCESS_ULTRASOUND")
        public static final int ULTRASOUND = 2000;
    }

    public final class VideoSource {
        public static final int DEFAULT = 0;
        public static final int CAMERA = 1;
        public static final int SURFACE = 2;
    }

    public static interface OnInfoListener {
        public void onInfo(android.media.MediaRecorder p0, int p1, int p2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AudioEncoderValues {
    }

    private class EventHandler extends android.os.Handler {
        public EventHandler(android.media.MediaRecorder p0, android.media.MediaRecorder p1, android.os.Looper p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface OutputFormatValues {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Source {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SystemSource {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VideoEncoderValues {
    }
}
