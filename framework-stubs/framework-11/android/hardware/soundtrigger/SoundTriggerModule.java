package android.hardware.soundtrigger;

public class SoundTriggerModule {
    private static final java.lang.String TAG = "SoundTriggerModule";
    private static final int EVENT_RECOGNITION = 1;
    private static final int EVENT_SERVICE_DIED = 2;
    private static final int EVENT_SERVICE_STATE_CHANGE = 3;
    private int mId;
    private android.hardware.soundtrigger.SoundTriggerModule.EventHandlerDelegate mEventHandlerDelegate;
    private android.media.soundtrigger_middleware.ISoundTriggerModule mService;
    SoundTriggerModule(android.media.soundtrigger_middleware.ISoundTriggerMiddlewareService p0, int p1, android.hardware.soundtrigger.SoundTrigger.StatusListener p2, android.os.Looper p3) throws android.os.RemoteException {}
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
        private final android.os.Handler mHandler = null;
        EventHandlerDelegate(android.hardware.soundtrigger.SoundTriggerModule p0, android.hardware.soundtrigger.SoundTrigger.StatusListener p1, android.os.Looper p2) { super(); }
        public synchronized void onRecognition(int p0, android.media.soundtrigger_middleware.RecognitionEvent p1) throws android.os.RemoteException {}
        public synchronized void onPhraseRecognition(int p0, android.media.soundtrigger_middleware.PhraseRecognitionEvent p1) throws android.os.RemoteException {}
        public synchronized void onRecognitionAvailabilityChange(boolean p0) throws android.os.RemoteException {}
        public synchronized void onModuleDied() {}
        public synchronized void binderDied() {}
    }
}
