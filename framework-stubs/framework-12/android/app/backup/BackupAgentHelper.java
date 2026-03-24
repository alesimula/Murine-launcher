package android.app.backup;

public class BackupAgentHelper extends android.app.backup.BackupAgent {
    static final java.lang.String TAG = "BackupAgentHelper";
    android.app.backup.BackupHelperDispatcher mDispatcher;
    public BackupAgentHelper() { super(); }
    public void onBackup(android.os.ParcelFileDescriptor p0, android.app.backup.BackupDataOutput p1, android.os.ParcelFileDescriptor p2) throws java.io.IOException {}
    public void onRestore(android.app.backup.BackupDataInput p0, int p1, android.os.ParcelFileDescriptor p2) throws java.io.IOException {}
    public android.app.backup.BackupHelperDispatcher getDispatcher() { return null; }
    public void addHelper(java.lang.String p0, android.app.backup.BackupHelper p1) {}
}
