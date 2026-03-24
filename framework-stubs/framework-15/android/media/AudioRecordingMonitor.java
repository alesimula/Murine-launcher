package android.media;

public interface AudioRecordingMonitor {
    public void registerAudioRecordingCallback(java.util.concurrent.Executor p0, android.media.AudioManager.AudioRecordingCallback p1);
    public void unregisterAudioRecordingCallback(android.media.AudioManager.AudioRecordingCallback p0);
    @android.annotation.Nullable
    public android.media.AudioRecordingConfiguration getActiveRecordingConfiguration();
}
