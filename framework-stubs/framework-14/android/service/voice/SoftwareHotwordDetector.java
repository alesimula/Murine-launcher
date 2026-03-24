package android.service.voice;

class SoftwareHotwordDetector extends android.service.voice.AbstractDetector {
    SoftwareHotwordDetector(com.android.internal.app.IVoiceInteractionManagerService p0, android.media.AudioFormat p1, java.util.concurrent.Executor p2, android.service.voice.HotwordDetector.Callback p3) { super(null, null, null); }
    void initialize(android.os.PersistableBundle p0, android.os.SharedMemory p1) {}
    void onDetectorRemoteException() {}
    @android.annotation.RequiresPermission("android.permission.RECORD_AUDIO")
    public boolean startRecognition() { return false; }
    @android.annotation.RequiresPermission("android.permission.RECORD_AUDIO")
    public boolean stopRecognition() { return false; }
    public void destroy() {}
    public boolean isUsingSandboxedDetectionService() { return false; }
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}

    private static class BinderCallback extends android.service.voice.IMicrophoneHotwordDetectionVoiceInteractionCallback.Stub {
        BinderCallback(java.util.concurrent.Executor p0, android.service.voice.HotwordDetector.Callback p1) { super(); }
        public void onDetected(android.service.voice.HotwordDetectedResult p0, android.media.AudioFormat p1, android.os.ParcelFileDescriptor p2) {}
        public void onHotwordDetectionServiceFailure(android.service.voice.HotwordDetectionServiceFailure p0) {}
        public void onRejected(android.service.voice.HotwordRejectedResult p0) {}
    }

    private static class InitializationStateListener extends com.android.internal.app.IHotwordRecognitionStatusCallback.Stub {
        InitializationStateListener(java.util.concurrent.Executor p0, android.service.voice.HotwordDetector.Callback p1) { super(); }
        public void onKeyphraseDetected(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, android.service.voice.HotwordDetectedResult p1) {}
        public void onGenericSoundTriggerDetected(android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p0) throws android.os.RemoteException {}
        public void onRejected(android.service.voice.HotwordRejectedResult p0) throws android.os.RemoteException {}
        public void onHotwordDetectionServiceFailure(android.service.voice.HotwordDetectionServiceFailure p0) throws android.os.RemoteException {}
        public void onVisualQueryDetectionServiceFailure(android.service.voice.VisualQueryDetectionServiceFailure p0) throws android.os.RemoteException {}
        public void onSoundTriggerFailure(android.service.voice.SoundTriggerFailure p0) throws android.os.RemoteException {}
        public void onUnknownFailure(java.lang.String p0) throws android.os.RemoteException {}
        public void onRecognitionPaused() throws android.os.RemoteException {}
        public void onRecognitionResumed() throws android.os.RemoteException {}
        public void onStatusReported(int p0) {}
        public void onProcessRestarted() throws android.os.RemoteException {}
    }
}
