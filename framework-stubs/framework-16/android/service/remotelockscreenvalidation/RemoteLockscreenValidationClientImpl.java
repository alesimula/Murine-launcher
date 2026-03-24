package android.service.remotelockscreenvalidation;

public class RemoteLockscreenValidationClientImpl implements android.service.remotelockscreenvalidation.RemoteLockscreenValidationClient, android.content.ServiceConnection {
    RemoteLockscreenValidationClientImpl(android.content.Context p0, java.util.concurrent.Executor p1, android.content.ComponentName p2) {}
    public boolean isServiceAvailable() { return false; }
    public void validateLockscreenGuess(byte[] p0, android.service.remotelockscreenvalidation.IRemoteLockscreenValidationCallback p1) {}
    public void disconnect() {}
    public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
    public void onServiceDisconnected(android.content.ComponentName p0) {}
    public void onBindingDied(android.content.ComponentName p0) {}
    public void onNullBinding(android.content.ComponentName p0) {}

    private static abstract class Call {
        abstract void exec(android.service.remotelockscreenvalidation.IRemoteLockscreenValidationService p0) throws android.os.RemoteException;
        abstract void onError(java.lang.String p0);
    }
}
