package android.service.voice;

abstract class AbstractDetector implements android.service.voice.HotwordDetector {
    protected final java.lang.Object mLock = null;
    static final boolean IS_IDENTITY_WITH_ATTRIBUTION_TAG = false;
    AbstractDetector(com.android.internal.app.IVoiceInteractionManagerService p0, java.util.concurrent.Executor p1, android.service.voice.HotwordDetector.Callback p2) {}
    boolean isSameToken(android.os.IBinder p0) { return false; }
    abstract void initialize(android.os.PersistableBundle p0, android.os.SharedMemory p1);
    public boolean startRecognition(android.os.ParcelFileDescriptor p0, android.media.AudioFormat p1, android.os.PersistableBundle p2) { return false; }
    public void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1) {}
    protected void initAndVerifyDetector(android.os.PersistableBundle p0, android.os.SharedMemory p1, com.android.internal.app.IHotwordRecognitionStatusCallback p2, int p3, java.lang.String p4) {}
    void registerOnDestroyListener(java.util.function.Consumer<android.service.voice.AbstractDetector> p0) {}
    public void destroy() {}
    protected void throwIfDetectorIsNoLongerActive() {}

    private static class BinderCallback extends android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback.Stub {
        BinderCallback(java.util.concurrent.Executor p0, android.service.voice.HotwordDetector.Callback p1) { super(); }
        public void onDetected(android.service.voice.HotwordDetectedResult p0, android.media.AudioFormat p1, android.os.ParcelFileDescriptor p2) {}
        public void onHotwordDetectionServiceFailure(android.service.voice.HotwordDetectionServiceFailure p0) {}
        public void onRejected(android.service.voice.HotwordRejectedResult p0) {}
    }
}
