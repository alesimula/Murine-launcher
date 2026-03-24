package android.app.backup;

@android.annotation.SystemApi
public abstract class BackupObserver {
    public BackupObserver() {}
    public void onUpdate(java.lang.String p0, android.app.backup.BackupProgress p1) {}
    public void onResult(java.lang.String p0, int p1) {}
    public void backupFinished(int p0) {}
}
