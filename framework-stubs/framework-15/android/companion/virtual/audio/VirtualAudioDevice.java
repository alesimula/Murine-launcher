package android.companion.virtual.audio;

@android.annotation.SystemApi
public final class VirtualAudioDevice implements java.io.Closeable {
    public VirtualAudioDevice(android.content.Context p0, android.companion.virtual.IVirtualDevice p1, android.hardware.display.VirtualDisplay p2, java.util.concurrent.Executor p3, android.companion.virtual.audio.VirtualAudioDevice.AudioConfigurationChangeCallback p4, android.companion.virtual.audio.VirtualAudioDevice.CloseListener p5) {}
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    @android.annotation.NonNull
    public android.companion.virtual.audio.AudioInjection startAudioInjection(android.media.AudioFormat p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    @android.annotation.NonNull
    public android.companion.virtual.audio.AudioCapture startAudioCapture(android.media.AudioFormat p0) { return null; }
    @android.annotation.Nullable
    public android.companion.virtual.audio.AudioCapture getAudioCapture() { return null; }
    @android.annotation.Nullable
    public android.companion.virtual.audio.AudioInjection getAudioInjection() { return null; }
    @android.annotation.RequiresPermission("android.permission.MODIFY_AUDIO_ROUTING")
    public void close() {}

    @android.annotation.SystemApi
    public static interface AudioConfigurationChangeCallback {
        public void onPlaybackConfigChanged(java.util.List<android.media.AudioPlaybackConfiguration> p0);
        public void onRecordingConfigChanged(java.util.List<android.media.AudioRecordingConfiguration> p0);
    }

    public static interface CloseListener {
        public void onClosed();
    }
}
