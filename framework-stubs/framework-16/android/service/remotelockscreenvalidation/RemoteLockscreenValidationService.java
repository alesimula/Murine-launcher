package android.service.remotelockscreenvalidation;

@android.annotation.SystemApi
public abstract class RemoteLockscreenValidationService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.remotelockscreenvalidation.RemoteLockscreenValidationService";
    public RemoteLockscreenValidationService() { super(); }
    @android.annotation.Nullable
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onValidateLockscreenGuess(byte[] p0, android.os.OutcomeReceiver<android.app.RemoteLockscreenValidationResult, java.lang.Exception> p1);
}
