package android.media.soundtrigger;

@android.annotation.SystemApi
public abstract class SoundTriggerDetectionService extends android.app.Service {
    public SoundTriggerDetectionService() { super(); }
    protected final void attachBaseContext(android.content.Context p0) {}
    public void onConnected(java.util.UUID p0, android.os.Bundle p1) {}
    public void onDisconnected(java.util.UUID p0, android.os.Bundle p1) {}
    public void onGenericRecognitionEvent(java.util.UUID p0, android.os.Bundle p1, int p2, android.hardware.soundtrigger.SoundTrigger.RecognitionEvent p3) {}
    public void onError(java.util.UUID p0, android.os.Bundle p1, int p2, int p3) {}
    public abstract void onStopOperation(java.util.UUID p0, android.os.Bundle p1, int p2);
    public final void operationFinished(java.util.UUID p0, int p1) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public boolean onUnbind(android.content.Intent p0) { return false; }
}
