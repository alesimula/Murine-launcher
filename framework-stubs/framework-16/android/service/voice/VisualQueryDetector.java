package android.service.voice;

@android.annotation.SystemApi
@android.annotation.SuppressLint("NotCloseable")
public class VisualQueryDetector {
    VisualQueryDetector(com.android.internal.app.IVoiceInteractionManagerService p0, java.util.concurrent.Executor p1, android.service.voice.VisualQueryDetector.Callback p2, android.content.Context p3, java.lang.String p4) {}
    void initialize(android.os.PersistableBundle p0, android.os.SharedMemory p1) {}
    public void updateState(android.os.PersistableBundle p0, android.os.SharedMemory p1) {}
    @android.annotation.RequiresPermission(allOf={"android.permission.CAMERA", "android.permission.RECORD_AUDIO"})
    public boolean startRecognition() { return false; }
    @android.annotation.RequiresPermission(allOf={"android.permission.CAMERA", "android.permission.RECORD_AUDIO"})
    public boolean stopRecognition() { return false; }
    public void destroy() {}
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("UnflaggedApi")
    public boolean isAccessibilityDetectionEnabled() { return false; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("UnflaggedApi")
    public void setAccessibilityDetectionEnabledListener(java.util.function.Consumer<java.lang.Boolean> p0) {}
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("UnflaggedApi")
    public void clearAccessibilityDetectionEnabledListener() {}
    public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    public android.service.voice.HotwordDetector getInitializationDelegate() { return null; }
    void registerOnDestroyListener(java.util.function.Consumer<android.service.voice.AbstractDetector> p0) {}

    private final class AccessibilityDetectionEnabledListenerWrapper extends com.android.internal.app.IVoiceInteractionAccessibilitySettingsListener.Stub {
        AccessibilityDetectionEnabledListenerWrapper(java.util.function.Consumer<java.lang.Boolean> p0) { super(); }
        public void onAccessibilityDetectionChanged(boolean p0) {}
    }

    private static class BinderCallback extends android.service.voice.IVisualQueryDetectionVoiceInteractionCallback.Stub {
        BinderCallback(java.util.concurrent.Executor p0, android.service.voice.VisualQueryDetector.Callback p1, java.lang.Object p2) { super(); }
        public void onQueryDetected(java.lang.String p0) {}
        public void onResultDetected(android.service.voice.VisualQueryDetectedResult p0) {}
        public void onQueryFinished() {}
        public void onQueryRejected() {}
        public void onVisualQueryDetectionServiceFailure(android.service.voice.VisualQueryDetectionServiceFailure p0) {}
    }

    public static interface Callback {
        public void onQueryDetected(java.lang.String p0);
        @android.annotation.SuppressLint("UnflaggedApi")
        default public void onQueryDetected(android.service.voice.VisualQueryDetectedResult p0) {}
        public void onQueryRejected();
        public void onQueryFinished();
        public void onVisualQueryDetectionServiceInitialized(int p0);
        public void onVisualQueryDetectionServiceRestarted();
        public void onFailure(android.service.voice.VisualQueryDetectionServiceFailure p0);
        public void onUnknownFailure(java.lang.String p0);
    }

    private static class InitializationStateListener extends com.android.internal.app.IHotwordRecognitionStatusCallback.Stub {
        InitializationStateListener(java.util.concurrent.Executor p0, android.service.voice.VisualQueryDetector.Callback p1, android.content.Context p2) { super(); }
        public void onKeyphraseDetected(android.hardware.soundtrigger.SoundTrigger.KeyphraseRecognitionEvent p0, android.service.voice.HotwordDetectedResult p1) {}
        public void onKeyphraseDetectedFromExternalSource(android.service.voice.HotwordDetectedResult p0) {}
        public void onGenericSoundTriggerDetected(android.hardware.soundtrigger.SoundTrigger.GenericRecognitionEvent p0) throws android.os.RemoteException {}
        public void onRejected(android.service.voice.HotwordRejectedResult p0) throws android.os.RemoteException {}
        public void onRecognitionPaused() throws android.os.RemoteException {}
        public void onRecognitionResumed() throws android.os.RemoteException {}
        public void onStatusReported(int p0) {}
        public void onProcessRestarted() throws android.os.RemoteException {}
        public void onHotwordDetectionServiceFailure(android.service.voice.HotwordDetectionServiceFailure p0) throws android.os.RemoteException {}
        public void onVisualQueryDetectionServiceFailure(android.service.voice.VisualQueryDetectionServiceFailure p0) throws android.os.RemoteException {}
        public void onSoundTriggerFailure(android.service.voice.SoundTriggerFailure p0) {}
        public void onUnknownFailure(java.lang.String p0) throws android.os.RemoteException {}
        public void onOpenFile(java.lang.String p0, com.android.internal.infra.AndroidFuture p1) throws android.os.RemoteException {}
    }

    private class VisualQueryDetectorInitializationDelegate extends android.service.voice.AbstractDetector {
        VisualQueryDetectorInitializationDelegate(android.service.voice.VisualQueryDetector p0) { super(null, null, null); }
        void initialize(android.os.PersistableBundle p0, android.os.SharedMemory p1) {}
        public boolean stopRecognition() { return false; }
        public boolean startRecognition() { return false; }
        public final boolean startRecognition(android.os.ParcelFileDescriptor p0, android.media.AudioFormat p1, android.os.PersistableBundle p2) { return false; }
        public boolean isUsingSandboxedDetectionService() { return false; }
        public void dump(java.lang.String p0, java.io.PrintWriter p1) {}
    }
}
