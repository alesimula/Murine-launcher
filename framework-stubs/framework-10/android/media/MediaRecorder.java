package android.media;

public class MediaRecorder implements android.media.AudioRouting, android.media.AudioRecordingMonitor, android.media.AudioRecordingMonitorClient, android.media.MicrophoneDirection {
    private static final java.lang.String TAG = "MediaRecorder";
    private long mNativeContext;
    @android.annotation.UnsupportedAppUsage
    private android.view.Surface mSurface;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private java.lang.String mPath;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private java.io.FileDescriptor mFd;
    private java.io.File mFile;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private android.media.MediaRecorder.EventHandler mEventHandler;
    @android.annotation.UnsupportedAppUsage
    private android.media.MediaRecorder.OnErrorListener mOnErrorListener;
    @android.annotation.UnsupportedAppUsage
    private android.media.MediaRecorder.OnInfoListener mOnInfoListener;
    private int mChannelCount;
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
    private android.media.AudioDeviceInfo mPreferredDevice;
    private android.util.ArrayMap<android.media.AudioRouting.OnRoutingChangedListener, android.media.NativeRoutingEventHandlerDelegate> mRoutingChangeListeners;
    android.media.AudioRecordingMonitorImpl mRecordingInfoImpl;
    public MediaRecorder() {}
    @java.lang.Deprecated
    public native void setCamera(android.hardware.Camera p0);
    public native android.view.Surface getSurface();
    public void setInputSurface(android.view.Surface p0) {}
    private final native void native_setInputSurface(android.view.Surface p0);
    public void setPreviewDisplay(android.view.Surface p0) {}
    public static boolean isSystemOnlyAudioSource(int p0) { return false; }
    public static final java.lang.String toLogFriendlyAudioSource(int p0) { return null; }
    public native void setAudioSource(int p0) throws java.lang.IllegalStateException;
    public static final int getAudioSourceMax() { return 0; }
    public native void setVideoSource(int p0) throws java.lang.IllegalStateException;
    public void setProfile(android.media.CamcorderProfile p0) {}
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
    private native void _setOutputFile(java.io.FileDescriptor p0) throws java.lang.IllegalStateException, java.io.IOException;
    private native void _setNextOutputFile(java.io.FileDescriptor p0) throws java.lang.IllegalStateException, java.io.IOException;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private native void _prepare() throws java.lang.IllegalStateException, java.io.IOException;
    public void prepare() throws java.lang.IllegalStateException, java.io.IOException {}
    public native void start() throws java.lang.IllegalStateException;
    public native void stop() throws java.lang.IllegalStateException;
    public native void pause() throws java.lang.IllegalStateException;
    public native void resume() throws java.lang.IllegalStateException;
    public void reset() {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private native void native_reset();
    public native int getMaxAmplitude() throws java.lang.IllegalStateException;
    public void setOnErrorListener(android.media.MediaRecorder.OnErrorListener p0) {}
    public void setOnInfoListener(android.media.MediaRecorder.OnInfoListener p0) {}
    public boolean setPreferredDevice(android.media.AudioDeviceInfo p0) { return false; }
    public android.media.AudioDeviceInfo getPreferredDevice() { return null; }
    public android.media.AudioDeviceInfo getRoutedDevice() { return null; }
    private void enableNativeRoutingCallbacksLocked(boolean p0) {}
    public void addOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener p0, android.os.Handler p1) {}
    public void removeOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener p0) {}
    private final native boolean native_setInputDevice(int p0);
    private final native int native_getRoutedDeviceId();
    private final native void native_enableDeviceCallback(boolean p0);
    public java.util.List<android.media.MicrophoneInfo> getActiveMicrophones() throws java.io.IOException { return null; }
    private final native int native_getActiveMicrophones(java.util.ArrayList<android.media.MicrophoneInfo> p0);
    public boolean setPreferredMicrophoneDirection(int p0) { return false; }
    public boolean setPreferredMicrophoneFieldDimension(float p0) { return false; }
    private native int native_setPreferredMicrophoneDirection(int p0);
    private native int native_setPreferredMicrophoneFieldDimension(float p0);
    public void registerAudioRecordingCallback(java.util.concurrent.Executor p0, android.media.AudioManager.AudioRecordingCallback p1) {}
    public void unregisterAudioRecordingCallback(android.media.AudioManager.AudioRecordingCallback p0) {}
    public android.media.AudioRecordingConfiguration getActiveRecordingConfiguration() { return null; }
    public int getPortId() { return 0; }
    private native int native_getPortId();
    private static void postEventFromNative(java.lang.Object p0, int p1, int p2, int p3, java.lang.Object p4) {}
    public native void release();
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private static final native void native_init();
    @android.annotation.UnsupportedAppUsage
    private final native void native_setup(java.lang.Object p0, java.lang.String p1, java.lang.String p2) throws java.lang.IllegalStateException;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private final native void native_finalize();
    @android.annotation.UnsupportedAppUsage
    private native void setParameter(java.lang.String p0);
    public android.os.PersistableBundle getMetrics() { return null; }
    private native android.os.PersistableBundle native_getMetrics();
    protected void finalize() {}

    public final class VideoSource {
        public static final int DEFAULT = 0;
        public static final int CAMERA = 1;
        public static final int SURFACE = 2;
        private VideoSource(android.media.MediaRecorder p0) {}
    }

    public final class VideoEncoder {
        public static final int DEFAULT = 0;
        public static final int H263 = 1;
        public static final int H264 = 2;
        public static final int MPEG_4_SP = 3;
        public static final int VP8 = 4;
        public static final int HEVC = 5;
        private VideoEncoder(android.media.MediaRecorder p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Source {
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
        private OutputFormat(android.media.MediaRecorder p0) {}
    }

    public static interface OnInfoListener {
        public void onInfo(android.media.MediaRecorder p0, int p1, int p2);
    }

    public static interface OnErrorListener {
        public void onError(android.media.MediaRecorder p0, int p1, int p2);
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
        private MetricsConstants() {}
    }

    private class EventHandler extends android.os.Handler {
        private android.media.MediaRecorder mMediaRecorder;
        private static final int MEDIA_RECORDER_EVENT_LIST_START = 1;
        private static final int MEDIA_RECORDER_EVENT_ERROR = 1;
        private static final int MEDIA_RECORDER_EVENT_INFO = 2;
        private static final int MEDIA_RECORDER_EVENT_LIST_END = 99;
        private static final int MEDIA_RECORDER_TRACK_EVENT_LIST_START = 100;
        private static final int MEDIA_RECORDER_TRACK_EVENT_ERROR = 100;
        private static final int MEDIA_RECORDER_TRACK_EVENT_INFO = 101;
        private static final int MEDIA_RECORDER_TRACK_EVENT_LIST_END = 1000;
        private static final int MEDIA_RECORDER_AUDIO_ROUTING_CHANGED = 10000;
        public EventHandler(android.media.MediaRecorder p0, android.media.MediaRecorder p1, android.os.Looper p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
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
        public static final int REMOTE_SUBMIX = 8;
        public static final int UNPROCESSED = 9;
        public static final int VOICE_PERFORMANCE = 10;
        @android.annotation.SystemApi
        public static final int ECHO_REFERENCE = 1997;
        @android.annotation.SystemApi
        public static final int RADIO_TUNER = 1998;
        @android.annotation.SystemApi
        public static final int HOTWORD = 1999;
        private AudioSource(android.media.MediaRecorder p0) {}
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
        private AudioEncoder(android.media.MediaRecorder p0) {}
    }
}
