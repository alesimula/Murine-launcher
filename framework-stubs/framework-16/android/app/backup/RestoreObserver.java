package android.app.backup;

public abstract class RestoreObserver {
    public RestoreObserver() {}
    @android.annotation.SystemApi
    public void restoreSetsAvailable(android.app.backup.RestoreSet[] p0) {}
    public void restoreStarting(int p0) {}
    public void onUpdate(int p0, java.lang.String p1) {}
    public void restoreFinished(int p0) {}
}
