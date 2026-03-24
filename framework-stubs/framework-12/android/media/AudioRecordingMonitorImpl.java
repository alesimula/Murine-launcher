package android.media;

public class AudioRecordingMonitorImpl implements android.media.AudioRecordingMonitor {
    private static final java.lang.String TAG = "android.media.AudioRecordingMonitor";
    private static android.media.IAudioService sService;
    private final android.media.AudioRecordingMonitorClient mClient = null;
    private static final int MSG_RECORDING_CONFIG_CHANGE = 1;
    private final java.lang.Object mRecordCallbackLock = null;
    private java.util.LinkedList<android.media.AudioRecordingMonitorImpl.AudioRecordingCallbackInfo> mRecordCallbackList;
    private android.os.HandlerThread mRecordingCallbackHandlerThread;
    private volatile android.os.Handler mRecordingCallbackHandler;
    private final android.media.IRecordingConfigDispatcher mRecordingCallback = null;
    AudioRecordingMonitorImpl(android.media.AudioRecordingMonitorClient p0) {}
    public void registerAudioRecordingCallback(java.util.concurrent.Executor p0, android.media.AudioManager.AudioRecordingCallback p1) {}
    public void unregisterAudioRecordingCallback(android.media.AudioManager.AudioRecordingCallback p0) {}
    public android.media.AudioRecordingConfiguration getActiveRecordingConfiguration() { return null; }
    private void beginRecordingCallbackHandling() {}
    private void endRecordingCallbackHandling() {}
    android.media.AudioRecordingConfiguration getMyConfig(java.util.List<android.media.AudioRecordingConfiguration> p0) { return null; }
    private static android.media.IAudioService getService() { return null; }

    private static class AudioRecordingCallbackInfo {
        final android.media.AudioManager.AudioRecordingCallback mCb = null;
        final java.util.concurrent.Executor mExecutor = null;
        AudioRecordingCallbackInfo(java.util.concurrent.Executor p0, android.media.AudioManager.AudioRecordingCallback p1) {}
    }
}
