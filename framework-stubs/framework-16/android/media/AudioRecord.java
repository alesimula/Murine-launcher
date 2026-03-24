package android.media;

public class AudioRecord implements android.media.AudioRouting, android.media.MicrophoneDirection, android.media.AudioRecordingMonitor, android.media.AudioRecordingMonitorClient {
    public static final int STATE_UNINITIALIZED = 0;
    public static final int STATE_INITIALIZED = 1;
    public static final int RECORDSTATE_STOPPED = 1;
    public static final int RECORDSTATE_RECORDING = 3;
    public static final int SUCCESS = 0;
    public static final int ERROR = -1;
    public static final int ERROR_BAD_VALUE = -2;
    public static final int ERROR_INVALID_OPERATION = -3;
    public static final int ERROR_DEAD_OBJECT = -6;
    public static final java.lang.String SUBMIX_FIXED_VOLUME = "fixedVolume";
    public static final int READ_BLOCKING = 0;
    public static final int READ_NON_BLOCKING = 1;
    android.media.AudioRecordingMonitorImpl mRecordingInfoImpl;
    @android.annotation.RequiresPermission("android.permission.RECORD_AUDIO")
    public AudioRecord(int p0, int p1, int p2, int p3, int p4) throws java.lang.IllegalArgumentException {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.RECORD_AUDIO")
    public AudioRecord(android.media.AudioAttributes p0, android.media.AudioFormat p1, int p2, int p3) throws java.lang.IllegalArgumentException {}
    AudioRecord(long p0) {}
    void deferred_connect(long p0) {}
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    public void release() {}
    protected void finalize() {}
    public int getSampleRate() { return 0; }
    public int getAudioSource() { return 0; }
    public int getAudioFormat() { return 0; }
    public int getChannelConfiguration() { return 0; }
    @android.annotation.NonNull
    public android.media.AudioFormat getFormat() { return null; }
    public int getChannelCount() { return 0; }
    public int getState() { return 0; }
    public int getRecordingState() { return 0; }
    public int getBufferSizeInFrames() { return 0; }
    public int getNotificationMarkerPosition() { return 0; }
    public int getPositionNotificationPeriod() { return 0; }
    public int getTimestamp(android.media.AudioTimestamp p0, int p1) { return 0; }
    public static int getMinBufferSize(int p0, int p1, int p2) { return 0; }
    public int getAudioSessionId() { return 0; }
    public boolean isPrivacySensitive() { return false; }
    @android.annotation.SystemApi
    public boolean isHotwordStream() { return false; }
    @android.annotation.SystemApi
    public boolean isHotwordLookbackStream() { return false; }
    public void startRecording() throws java.lang.IllegalStateException {}
    public void startRecording(android.media.MediaSyncEvent p0) throws java.lang.IllegalStateException {}
    public void stop() throws java.lang.IllegalStateException {}
    public int read(byte[] p0, int p1, int p2) { return 0; }
    public int read(byte[] p0, int p1, int p2, int p3) { return 0; }
    public int read(short[] p0, int p1, int p2) { return 0; }
    public int read(short[] p0, int p1, int p2, int p3) { return 0; }
    public int read(float[] p0, int p1, int p2, int p3) { return 0; }
    public int read(java.nio.ByteBuffer p0, int p1) { return 0; }
    public int read(java.nio.ByteBuffer p0, int p1, int p2) { return 0; }
    public android.os.PersistableBundle getMetrics() { return null; }
    public void setRecordPositionUpdateListener(android.media.AudioRecord.OnRecordPositionUpdateListener p0) {}
    public void setRecordPositionUpdateListener(android.media.AudioRecord.OnRecordPositionUpdateListener p0, android.os.Handler p1) {}
    public int setNotificationMarkerPosition(int p0) { return 0; }
    public android.media.AudioDeviceInfo getRoutedDevice() { return null; }
    @android.annotation.FlaggedApi("android.media.audio.routed_device_ids")
    @android.annotation.NonNull
    public java.util.List<android.media.AudioDeviceInfo> getRoutedDevices() { return null; }
    @android.annotation.SystemApi
    public static long getMaxSharedAudioHistoryMillis() { return 0L; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.CAPTURE_AUDIO_HOTWORD")
    @android.annotation.NonNull
    public android.media.MediaSyncEvent shareAudioHistory(java.lang.String p0, long p1) { return null; }
    public void addOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener p0, android.os.Handler p1) {}
    public void removeOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener p0) {}
    @java.lang.Deprecated
    public void addOnRoutingChangedListener(android.media.AudioRecord.OnRoutingChangedListener p0, android.os.Handler p1) {}
    @java.lang.Deprecated
    public void removeOnRoutingChangedListener(android.media.AudioRecord.OnRoutingChangedListener p0) {}
    public int setPositionNotificationPeriod(int p0) { return 0; }
    public boolean setPreferredDevice(android.media.AudioDeviceInfo p0) { return false; }
    public android.media.AudioDeviceInfo getPreferredDevice() { return null; }
    public java.util.List<android.media.MicrophoneInfo> getActiveMicrophones() throws java.io.IOException { return null; }
    public void registerAudioRecordingCallback(java.util.concurrent.Executor p0, android.media.AudioManager.AudioRecordingCallback p1) {}
    public void unregisterAudioRecordingCallback(android.media.AudioManager.AudioRecordingCallback p0) {}
    @android.annotation.Nullable
    public android.media.AudioRecordingConfiguration getActiveRecordingConfiguration() { return null; }
    public int getPortId() { return 0; }
    public boolean setPreferredMicrophoneDirection(int p0) { return false; }
    public boolean setPreferredMicrophoneFieldDimension(float p0) { return false; }
    public void setLogSessionId(android.media.metrics.LogSessionId p0) {}
    @android.annotation.NonNull
    public android.media.metrics.LogSessionId getLogSessionId() { return null; }
    public final native void native_release();

    public static class Builder {
        public Builder() {}
        public android.media.AudioRecord.Builder setAudioSource(int p0) throws java.lang.IllegalArgumentException { return null; }
        @android.annotation.NonNull
        public android.media.AudioRecord.Builder setContext(android.content.Context p0) { return null; }
        @android.annotation.SystemApi
        public android.media.AudioRecord.Builder setAudioAttributes(android.media.AudioAttributes p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.AudioRecord.Builder setAudioFormat(android.media.AudioFormat p0) throws java.lang.IllegalArgumentException { return null; }
        public android.media.AudioRecord.Builder setBufferSizeInBytes(int p0) throws java.lang.IllegalArgumentException { return null; }
        @android.annotation.NonNull
        public android.media.AudioRecord.Builder setAudioPlaybackCaptureConfig(android.media.AudioPlaybackCaptureConfiguration p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioRecord.Builder setPrivacySensitive(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.media.AudioRecord.Builder setSessionId(int p0) throws java.lang.IllegalArgumentException { return null; }
        @android.annotation.NonNull
        public android.media.AudioRecord.Builder setCallRedirectionMode(int p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.CAPTURE_AUDIO_HOTWORD")
        @android.annotation.NonNull
        public android.media.AudioRecord.Builder setMaxSharedAudioHistoryMillis(long p0) throws java.lang.IllegalArgumentException { return null; }
        @android.annotation.SystemApi
        @android.annotation.NonNull
        public android.media.AudioRecord.Builder setSharedAudioEvent(android.media.MediaSyncEvent p0) throws java.lang.IllegalArgumentException { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.CAPTURE_AUDIO_HOTWORD")
        @android.annotation.NonNull
        public android.media.AudioRecord.Builder setRequestHotwordStream(boolean p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.CAPTURE_AUDIO_HOTWORD")
        @android.annotation.NonNull
        public android.media.AudioRecord.Builder setRequestHotwordLookbackStream(boolean p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.RECORD_AUDIO")
        public android.media.AudioRecord build() throws java.lang.UnsupportedOperationException { return null; }
    }

    public static final class MetricsConstants {
        public static final java.lang.String ENCODING = "android.media.audiorecord.encoding";
        public static final java.lang.String SOURCE = "android.media.audiorecord.source";
        @java.lang.Deprecated
        public static final java.lang.String LATENCY = "android.media.audiorecord.latency";
        public static final java.lang.String SAMPLERATE = "android.media.audiorecord.samplerate";
        public static final java.lang.String CHANNELS = "android.media.audiorecord.channels";
        public static final java.lang.String CHANNEL_MASK = "android.media.audiorecord.channelMask";
        public static final java.lang.String PORT_ID = "android.media.audiorecord.portId";
        public static final java.lang.String FRAME_COUNT = "android.media.audiorecord.frameCount";
        public static final java.lang.String ATTRIBUTES = "android.media.audiorecord.attributes";
        public static final java.lang.String DURATION_MS = "android.media.audiorecord.durationMs";
        public static final java.lang.String START_COUNT = "android.media.audiorecord.startCount";
    }

    private class NativeEventHandler extends android.os.Handler {
        NativeEventHandler(android.media.AudioRecord p0, android.media.AudioRecord p1, android.os.Looper p2) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static interface OnRecordPositionUpdateListener {
        public void onMarkerReached(android.media.AudioRecord p0);
        public void onPeriodicNotification(android.media.AudioRecord p0);
    }

    @java.lang.Deprecated
    public static interface OnRoutingChangedListener extends android.media.AudioRouting.OnRoutingChangedListener {
        public void onRoutingChanged(android.media.AudioRecord p0);
        default public void onRoutingChanged(android.media.AudioRouting p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ReadMode {
    }
}
