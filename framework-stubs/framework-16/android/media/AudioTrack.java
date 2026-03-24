package android.media;

public class AudioTrack extends android.media.PlayerBase implements android.media.AudioRouting, android.media.VolumeAutomation {
    public static final int PLAYSTATE_STOPPED = 1;
    public static final int PLAYSTATE_PAUSED = 2;
    public static final int PLAYSTATE_PLAYING = 3;
    public static final int MODE_STATIC = 0;
    public static final int MODE_STREAM = 1;
    public static final int STATE_UNINITIALIZED = 0;
    public static final int STATE_INITIALIZED = 1;
    public static final int STATE_NO_STATIC_DATA = 2;
    public static final int SUCCESS = 0;
    public static final int ERROR = -1;
    public static final int ERROR_BAD_VALUE = -2;
    public static final int ERROR_INVALID_OPERATION = -3;
    public static final int ERROR_DEAD_OBJECT = -6;
    public static final int ERROR_WOULD_BLOCK = -7;
    public static final int ENCAPSULATION_MODE_NONE = 0;
    public static final int ENCAPSULATION_MODE_ELEMENTARY_STREAM = 1;
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public static final int ENCAPSULATION_MODE_HANDLE = 2;
    public static final int ENCAPSULATION_METADATA_TYPE_NONE = 0;
    public static final int ENCAPSULATION_METADATA_TYPE_FRAMEWORK_TUNER = 1;
    public static final int ENCAPSULATION_METADATA_TYPE_DVB_AD_DESCRIPTOR = 2;
    public static final int ENCAPSULATION_METADATA_TYPE_SUPPLEMENTARY_AUDIO_PLACEMENT = 3;
    public static final int SUPPLEMENTARY_AUDIO_PLACEMENT_NORMAL = 0;
    public static final int SUPPLEMENTARY_AUDIO_PLACEMENT_LEFT = 1;
    public static final int SUPPLEMENTARY_AUDIO_PLACEMENT_RIGHT = 2;
    public static final int DUAL_MONO_MODE_OFF = 0;
    public static final int DUAL_MONO_MODE_LR = 1;
    public static final int DUAL_MONO_MODE_LL = 2;
    public static final int DUAL_MONO_MODE_RR = 3;
    public static final int WRITE_BLOCKING = 0;
    public static final int WRITE_NON_BLOCKING = 1;
    public static final int PERFORMANCE_MODE_NONE = 0;
    public static final int PERFORMANCE_MODE_LOW_LATENCY = 1;
    public static final int PERFORMANCE_MODE_POWER_SAVING = 2;
    protected long mNativeTrackInJavaObj;
    public AudioTrack(int p0, int p1, int p2, int p3, int p4, int p5) throws java.lang.IllegalArgumentException { super(null, 0); }
    public AudioTrack(int p0, int p1, int p2, int p3, int p4, int p5, int p6) throws java.lang.IllegalArgumentException { super(null, 0); }
    public AudioTrack(android.media.AudioAttributes p0, android.media.AudioFormat p1, int p2, int p3, int p4) throws java.lang.IllegalArgumentException { super(null, 0); }
    AudioTrack(long p0) { super(null, 0); }
    void deferred_connect(long p0) {}
    public void setOffloadDelayPadding(int p0, int p1) {}
    public int getOffloadDelay() { return 0; }
    public int getOffloadPadding() { return 0; }
    public void setOffloadEndOfStream() {}
    public boolean isOffloadedPlayback() { return false; }
    @java.lang.Deprecated
    public static boolean isDirectPlaybackSupported(android.media.AudioFormat p0, android.media.AudioAttributes p1) { return false; }
    public boolean setAudioDescriptionMixLeveldB(float p0) { return false; }
    public float getAudioDescriptionMixLeveldB() { return 0.0f; }
    public boolean setDualMonoMode(int p0) { return false; }
    public int getDualMonoMode() { return 0; }
    public void release() {}
    protected void finalize() {}
    public static float getMinVolume() { return 0.0f; }
    public static float getMaxVolume() { return 0.0f; }
    public int getSampleRate() { return 0; }
    public int getPlaybackRate() { return 0; }
    @android.annotation.NonNull
    public android.media.PlaybackParams getPlaybackParams() { return null; }
    @android.annotation.NonNull
    public android.media.AudioAttributes getAudioAttributes() { return null; }
    public int getAudioFormat() { return 0; }
    public int getStreamType() { return 0; }
    public int getChannelConfiguration() { return 0; }
    @android.annotation.NonNull
    public android.media.AudioFormat getFormat() { return null; }
    public int getChannelCount() { return 0; }
    public int getState() { return 0; }
    public int getPlayState() { return 0; }
    public int getBufferSizeInFrames() { return 0; }
    public int setBufferSizeInFrames(int p0) { return 0; }
    public int getBufferCapacityInFrames() { return 0; }
    public int setStartThresholdInFrames(int p0) { return 0; }
    public int getStartThresholdInFrames() { return 0; }
    @java.lang.Deprecated
    protected int getNativeFrameCount() { return 0; }
    public int getNotificationMarkerPosition() { return 0; }
    public int getPositionNotificationPeriod() { return 0; }
    public int getPlaybackHeadPosition() { return 0; }
    public int getLatency() { return 0; }
    public int getUnderrunCount() { return 0; }
    public int getPerformanceMode() { return 0; }
    public static int getNativeOutputSampleRate(int p0) { return 0; }
    public static int getMinBufferSize(int p0, int p1, int p2) { return 0; }
    public int getAudioSessionId() { return 0; }
    public boolean getTimestamp(android.media.AudioTimestamp p0) { return false; }
    public int getTimestampWithStatus(android.media.AudioTimestamp p0) { return 0; }
    public android.os.PersistableBundle getMetrics() { return null; }
    public void setPlaybackPositionUpdateListener(android.media.AudioTrack.OnPlaybackPositionUpdateListener p0) {}
    public void setPlaybackPositionUpdateListener(android.media.AudioTrack.OnPlaybackPositionUpdateListener p0, android.os.Handler p1) {}
    @java.lang.Deprecated
    public int setStereoVolume(float p0, float p1) { return 0; }
    void playerSetVolume(boolean p0, float p1, float p2) {}
    public int setVolume(float p0) { return 0; }
    int playerApplyVolumeShaper(android.media.VolumeShaper.Configuration p0, android.media.VolumeShaper.Operation p1) { return 0; }
    @android.annotation.Nullable
    android.media.VolumeShaper.State playerGetVolumeShaperState(int p0) { return null; }
    @android.annotation.NonNull
    public android.media.VolumeShaper createVolumeShaper(android.media.VolumeShaper.Configuration p0) { return null; }
    public int setPlaybackRate(int p0) { return 0; }
    public void setPlaybackParams(android.media.PlaybackParams p0) {}
    public int setNotificationMarkerPosition(int p0) { return 0; }
    public int setPositionNotificationPeriod(int p0) { return 0; }
    public int setPlaybackHeadPosition(int p0) { return 0; }
    public int setLoopPoints(int p0, int p1, int p2) { return 0; }
    public int setPresentation(android.media.AudioPresentation p0) { return 0; }
    @java.lang.Deprecated
    protected void setState(int p0) {}
    public void play() throws java.lang.IllegalStateException {}
    public void stop() throws java.lang.IllegalStateException {}
    public void pause() throws java.lang.IllegalStateException {}
    public void flush() {}
    public int write(byte[] p0, int p1, int p2) { return 0; }
    public int write(byte[] p0, int p1, int p2, int p3) { return 0; }
    public int write(short[] p0, int p1, int p2) { return 0; }
    public int write(short[] p0, int p1, int p2, int p3) { return 0; }
    public int write(float[] p0, int p1, int p2, int p3) { return 0; }
    public int write(java.nio.ByteBuffer p0, int p1, int p2) { return 0; }
    public int write(java.nio.ByteBuffer p0, int p1, int p2, long p3) { return 0; }
    public int reloadStaticData() { return 0; }
    public int attachAuxEffect(int p0) { return 0; }
    public int setAuxEffectSendLevel(float p0) { return 0; }
    int playerSetAuxEffectSendLevel(boolean p0, float p1) { return 0; }
    public boolean setPreferredDevice(android.media.AudioDeviceInfo p0) { return false; }
    public android.media.AudioDeviceInfo getPreferredDevice() { return null; }
    public android.media.AudioDeviceInfo getRoutedDevice() { return null; }
    @android.annotation.FlaggedApi("android.media.audio.routed_device_ids")
    @android.annotation.NonNull
    public java.util.List<android.media.AudioDeviceInfo> getRoutedDevices() { return null; }
    public void addOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener p0, android.os.Handler p1) {}
    public void removeOnRoutingChangedListener(android.media.AudioRouting.OnRoutingChangedListener p0) {}
    @java.lang.Deprecated
    public void addOnRoutingChangedListener(android.media.AudioTrack.OnRoutingChangedListener p0, android.os.Handler p1) {}
    @java.lang.Deprecated
    public void removeOnRoutingChangedListener(android.media.AudioTrack.OnRoutingChangedListener p0) {}
    public void addOnCodecFormatChangedListener(java.util.concurrent.Executor p0, android.media.AudioTrack.OnCodecFormatChangedListener p1) {}
    public void removeOnCodecFormatChangedListener(android.media.AudioTrack.OnCodecFormatChangedListener p0) {}
    public void registerStreamEventCallback(java.util.concurrent.Executor p0, android.media.AudioTrack.StreamEventCallback p1) {}
    public void unregisterStreamEventCallback(android.media.AudioTrack.StreamEventCallback p0) {}
    void handleStreamEventFromNative(int p0, int p1) {}
    public void setLogSessionId(android.media.metrics.LogSessionId p0) {}
    @android.annotation.NonNull
    public android.media.metrics.LogSessionId getLogSessionId() { return null; }
    void playerStart() {}
    void playerPause() {}
    void playerStop() {}
    public final native void native_release();

    public static class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.media.AudioTrack.Builder setContext(android.content.Context p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioTrack.Builder setAudioAttributes(android.media.AudioAttributes p0) throws java.lang.IllegalArgumentException { return null; }
        @android.annotation.NonNull
        public android.media.AudioTrack.Builder setAudioFormat(android.media.AudioFormat p0) throws java.lang.IllegalArgumentException { return null; }
        @android.annotation.NonNull
        public android.media.AudioTrack.Builder setBufferSizeInBytes(int p0) throws java.lang.IllegalArgumentException { return null; }
        @android.annotation.NonNull
        public android.media.AudioTrack.Builder setEncapsulationMode(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioTrack.Builder setTransferMode(int p0) throws java.lang.IllegalArgumentException { return null; }
        @android.annotation.NonNull
        public android.media.AudioTrack.Builder setSessionId(int p0) throws java.lang.IllegalArgumentException { return null; }
        @android.annotation.NonNull
        public android.media.AudioTrack.Builder setPerformanceMode(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioTrack.Builder setOffloadedPlayback(boolean p0) { return null; }
        @android.annotation.SystemApi
        @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
        @android.annotation.NonNull
        public android.media.AudioTrack.Builder setTunerConfiguration(android.media.AudioTrack.TunerConfiguration p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioTrack.Builder setCallRedirectionMode(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.AudioTrack build() throws java.lang.UnsupportedOperationException { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DualMonoMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EncapsulationMetadataType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EncapsulationMode {
    }

    public static final class MetricsConstants {
        public static final java.lang.String STREAMTYPE = "android.media.audiotrack.streamtype";
        public static final java.lang.String CONTENTTYPE = "android.media.audiotrack.type";
        public static final java.lang.String USAGE = "android.media.audiotrack.usage";
        @java.lang.Deprecated
        public static final java.lang.String SAMPLERATE = "android.media.audiorecord.samplerate";
        @java.lang.Deprecated
        public static final java.lang.String CHANNELMASK = "android.media.audiorecord.channelmask";
        public static final java.lang.String SAMPLE_RATE = "android.media.audiotrack.sampleRate";
        public static final java.lang.String CHANNEL_MASK = "android.media.audiotrack.channelMask";
        public static final java.lang.String ENCODING = "android.media.audiotrack.encoding";
        public static final java.lang.String PORT_ID = "android.media.audiotrack.portId";
        public static final java.lang.String FRAME_COUNT = "android.media.audiotrack.frameCount";
        public static final java.lang.String ATTRIBUTES = "android.media.audiotrack.attributes";
    }

    private class NativePositionEventHandlerDelegate {
        NativePositionEventHandlerDelegate(android.media.AudioTrack p0, android.media.AudioTrack p1, android.media.AudioTrack.OnPlaybackPositionUpdateListener p2, android.os.Handler p3) {}
        android.os.Handler getHandler() { return null; }
    }

    public static interface OnCodecFormatChangedListener {
        public void onCodecFormatChanged(android.media.AudioTrack p0, android.media.AudioMetadataReadMap p1);
    }

    public static interface OnPlaybackPositionUpdateListener {
        public void onMarkerReached(android.media.AudioTrack p0);
        public void onPeriodicNotification(android.media.AudioTrack p0);
    }

    @java.lang.Deprecated
    public static interface OnRoutingChangedListener extends android.media.AudioRouting.OnRoutingChangedListener {
        public void onRoutingChanged(android.media.AudioTrack p0);
        default public void onRoutingChanged(android.media.AudioRouting p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PerformanceMode {
    }

    public static abstract class StreamEventCallback {
        public StreamEventCallback() {}
        public void onTearDown(android.media.AudioTrack p0) {}
        public void onPresentationEnded(android.media.AudioTrack p0) {}
        public void onDataRequest(android.media.AudioTrack p0, int p1) {}
    }

    private static class StreamEventCbInfo {
        final java.util.concurrent.Executor mStreamEventExec = null;
        final android.media.AudioTrack.StreamEventCallback mStreamEventCb = null;
        StreamEventCbInfo(java.util.concurrent.Executor p0, android.media.AudioTrack.StreamEventCallback p1) {}
    }

    private class StreamEventHandler extends android.os.Handler {
        StreamEventHandler(android.media.AudioTrack p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SupplementaryAudioPlacement {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TransferMode {
    }

    @android.annotation.SystemApi
    public static class TunerConfiguration {
        public static final int CONTENT_ID_NONE = 0;
        @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
        public TunerConfiguration(int p0, int p1) {}
        @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
        public int getContentId() { return 0; }
        @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
        public int getSyncId() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WriteMode {
    }
}
