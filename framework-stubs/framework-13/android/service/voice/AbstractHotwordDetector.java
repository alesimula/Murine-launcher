package android.service.voice;

abstract class AbstractHotwordDetector implements android.service.voice.HotwordDetector {
    protected final java.lang.Object mLock = null;
    AbstractHotwordDetector(com.android.internal.app.IVoiceInteractionManagerService p0, android.service.voice.HotwordDetector.Callback p1, int p2) {}
    public boolean startRecognition(android.os.ParcelFileDescriptor p0, android.media.AudioFormat p1, android.os.PersistableBundle p2) { return false; }
    public void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1) {}
    protected void updateStateLocked(android.os.PersistableBundle p0, android.os.SharedMemory p1, com.android.internal.app.IHotwordRecognitionStatusCallback p2, int p3) {}
    void registerOnDestroyListener(java.util.function.Consumer<android.service.voice.AbstractHotwordDetector> p0) {}
    public void destroy() {}
    protected void throwIfDetectorIsNoLongerActive() {}

    private static class BinderCallback extends android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback.Stub {
        BinderCallback(android.os.Handler p0, android.service.voice.HotwordDetector.Callback p1) { super(); }
        public void onDetected(android.service.voice.HotwordDetectedResult p0, android.media.AudioFormat p1, android.os.ParcelFileDescriptor p2) {}
        public void onError() {}
        public void onRejected(android.service.voice.HotwordRejectedResult p0) {}
    }
}
