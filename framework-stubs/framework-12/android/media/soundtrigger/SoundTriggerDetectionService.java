package android.media.soundtrigger;

@android.annotation.SystemApi
public abstract class SoundTriggerDetectionService extends android.app.Service {
    private static final java.lang.String LOG_TAG = null;
    private static final boolean DEBUG = false;
    private final java.lang.Object mLock = null;
    private final android.util.ArrayMap<java.util.UUID, android.media.soundtrigger.ISoundTriggerDetectionServiceClient> mClients = null;
    private android.os.Handler mHandler;
    public SoundTriggerDetectionService() { super(); }
    protected final void attachBaseContext(android.content.Context p0) {}
    private void setClient(java.util.UUID p0, android.os.Bundle p1, android.media.soundtrigger.ISoundTriggerDetectionServiceClient p2) {}
    private void removeClient(java.util.UUID p0, android.os.Bundle p1) {}
    public void onConnected(java.util.UUID p0, android.os.Bundle p1) {}
    public void onDisconnected(java.util.UUID p0, android.os.Bundle p1) {}
    public void onGenericRecognitionEvent(java.util.UUID p0, android.os.Bundle p1, int p2, android.hardware.soundtrigger.SoundTrigger.RecognitionEvent p3) {}
    public void onError(java.util.UUID p0, android.os.Bundle p1, int p2, int p3) {}
    public abstract void onStopOperation(java.util.UUID p0, android.os.Bundle p1, int p2);
    public final void operationFinished(java.util.UUID p0, int p1) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
}
