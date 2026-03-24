package android.service.voice;

abstract class AbstractHotwordDetector implements android.service.voice.HotwordDetector {
    private static final java.lang.String TAG = null;
    private static final boolean DEBUG = false;
    protected final java.lang.Object mLock = null;
    private final com.android.internal.app.IVoiceInteractionManagerService mManagerService = null;
    private final android.os.Handler mHandler = null;
    private final android.service.voice.HotwordDetector.Callback mCallback = null;
    AbstractHotwordDetector(com.android.internal.app.IVoiceInteractionManagerService p0, android.service.voice.HotwordDetector.Callback p1) {}
    public boolean startRecognition(android.os.ParcelFileDescriptor p0, android.media.AudioFormat p1, android.os.PersistableBundle p2) { return false; }
    public void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1) {}
    protected void updateStateLocked(android.os.PersistableBundle p0, android.os.SharedMemory p1, com.android.internal.app.IHotwordRecognitionStatusCallback p2) {}

    private static class BinderCallback extends android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback.Stub {
        private final android.os.Handler mHandler = null;
        private final android.service.voice.HotwordDetector.Callback mCallback = null;
        BinderCallback(android.os.Handler p0, android.service.voice.HotwordDetector.Callback p1) { super(); }
        public void onDetected(android.service.voice.HotwordDetectedResult p0, android.media.AudioFormat p1, android.os.ParcelFileDescriptor p2) {}
    }
}
