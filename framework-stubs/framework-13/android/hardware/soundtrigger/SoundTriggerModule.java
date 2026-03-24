package android.hardware.soundtrigger;

public class SoundTriggerModule {
    SoundTriggerModule(android.media.soundtrigger_middleware.ISoundTriggerMiddlewareService p0, int p1, android.hardware.soundtrigger.SoundTrigger.StatusListener p2, android.os.Looper p3, android.media.permission.Identity p4) throws android.os.RemoteException {}
    SoundTriggerModule(android.media.soundtrigger_middleware.ISoundTriggerMiddlewareService p0, int p1, android.hardware.soundtrigger.SoundTrigger.StatusListener p2, android.os.Looper p3, android.media.permission.Identity p4, android.media.permission.Identity p5) throws android.os.RemoteException {}
    protected void finalize() {}
    public synchronized void detach() {}
    public synchronized int loadSoundModel(android.hardware.soundtrigger.SoundTrigger.SoundModel p0, int[] p1) { return 0; }
    public synchronized int unloadSoundModel(int p0) { return 0; }
    public synchronized int startRecognition(int p0, android.hardware.soundtrigger.SoundTrigger.RecognitionConfig p1) { return 0; }
    public synchronized int stopRecognition(int p0) { return 0; }
    public synchronized int getModelState(int p0) { return 0; }
    public synchronized int setParameter(int p0, int p1, int p2) { return 0; }
    public synchronized int getParameter(int p0, int p1) { return 0; }
    public synchronized android.hardware.soundtrigger.SoundTrigger.ModelParamRange queryParameter(int p0, int p1) { return null; }

    private class EventHandlerDelegate extends android.media.soundtrigger_middleware.ISoundTriggerCallback.Stub implements android.os.IBinder.DeathRecipient {
        EventHandlerDelegate(android.hardware.soundtrigger.SoundTriggerModule p0, android.hardware.soundtrigger.SoundTrigger.StatusListener p1, android.os.Looper p2) { super(); }
        public synchronized void onRecognition(int p0, android.media.soundtrigger.RecognitionEvent p1, int p2) throws android.os.RemoteException {}
        public synchronized void onPhraseRecognition(int p0, android.media.soundtrigger.PhraseRecognitionEvent p1, int p2) throws android.os.RemoteException {}
        public void onModelUnloaded(int p0) throws android.os.RemoteException {}
        public synchronized void onResourcesAvailable() throws android.os.RemoteException {}
        public synchronized void onModuleDied() {}
        public synchronized void binderDied() {}
    }
}
