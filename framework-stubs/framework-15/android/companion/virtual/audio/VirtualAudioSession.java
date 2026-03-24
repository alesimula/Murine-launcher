package android.companion.virtual.audio;

public final class VirtualAudioSession extends android.companion.virtual.audio.IAudioRoutingCallback.Stub implements android.companion.virtual.audio.UserRestrictionsDetector.UserRestrictionsCallback, java.io.Closeable {
    public VirtualAudioSession(android.content.Context p0, android.companion.virtual.audio.VirtualAudioDevice.AudioConfigurationChangeCallback p1, java.util.concurrent.Executor p2) { super(); }
    @android.annotation.NonNull
    public android.companion.virtual.audio.AudioCapture startAudioCapture(android.media.AudioFormat p0) { return null; }
    @android.annotation.NonNull
    public android.companion.virtual.audio.AudioInjection startAudioInjection(android.media.AudioFormat p0) { return null; }
    @android.annotation.Nullable
    public android.companion.virtual.audio.VirtualAudioSession.AudioConfigChangedCallback getAudioConfigChangedListener() { return null; }
    @android.annotation.Nullable
    public android.companion.virtual.audio.AudioCapture getAudioCapture() { return null; }
    @android.annotation.Nullable
    public android.companion.virtual.audio.AudioInjection getAudioInjection() { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void onAppsNeedingAudioRoutingChanged(int[] p0) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void close() {}
    public void onMicrophoneRestrictionChanged(boolean p0) {}
    public android.util.IntArray getReroutedAppUids() { return null; }

    public static final class AudioConfigChangedCallback extends android.companion.virtual.audio.IAudioConfigChangedCallback.Stub {
        AudioConfigChangedCallback(android.content.Context p0, java.util.concurrent.Executor p1, android.companion.virtual.audio.VirtualAudioDevice.AudioConfigurationChangeCallback p2) { super(); }
        public void onPlaybackConfigChanged(java.util.List<android.media.AudioPlaybackConfiguration> p0) {}
        public void onRecordingConfigChanged(java.util.List<android.media.AudioRecordingConfiguration> p0) {}
    }
}
