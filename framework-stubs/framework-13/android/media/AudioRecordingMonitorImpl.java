package android.media;

public class AudioRecordingMonitorImpl implements android.media.AudioRecordingMonitor {
    AudioRecordingMonitorImpl(android.media.AudioRecordingMonitorClient p0) {}
    public void registerAudioRecordingCallback(java.util.concurrent.Executor p0, android.media.AudioManager.AudioRecordingCallback p1) {}
    public void unregisterAudioRecordingCallback(android.media.AudioManager.AudioRecordingCallback p0) {}
    public android.media.AudioRecordingConfiguration getActiveRecordingConfiguration() { return null; }
    android.media.AudioRecordingConfiguration getMyConfig(java.util.List<android.media.AudioRecordingConfiguration> p0) { return null; }

    private static class AudioRecordingCallbackInfo {
        final android.media.AudioManager.AudioRecordingCallback mCb = null;
        final java.util.concurrent.Executor mExecutor = null;
        AudioRecordingCallbackInfo(java.util.concurrent.Executor p0, android.media.AudioManager.AudioRecordingCallback p1) {}
    }
}
