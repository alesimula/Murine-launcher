package android.service.remotelockscreenvalidation;

public interface RemoteLockscreenValidationClient {
    @android.annotation.NonNull
    public static android.service.remotelockscreenvalidation.RemoteLockscreenValidationClient create(android.content.Context p0, android.content.ComponentName p1) { return null; }
    @android.annotation.NonNull
    public static android.service.remotelockscreenvalidation.RemoteLockscreenValidationClient create(android.content.Context p0, java.util.concurrent.Executor p1, android.content.ComponentName p2) { return null; }
    public boolean isServiceAvailable();
    public void disconnect();
    public void validateLockscreenGuess(byte[] p0, android.service.remotelockscreenvalidation.IRemoteLockscreenValidationCallback p1);
}
