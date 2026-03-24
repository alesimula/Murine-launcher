package android.content;

public abstract class AbstractThreadedSyncAdapter {
    @java.lang.Deprecated
    public static final int LOG_SYNC_DETAILS = 2743;
    public AbstractThreadedSyncAdapter(android.content.Context p0, boolean p1) {}
    public AbstractThreadedSyncAdapter(android.content.Context p0, boolean p1, boolean p2) {}
    public android.content.Context getContext() { return null; }
    public final android.os.IBinder getSyncAdapterBinder() { return null; }
    public boolean onUnsyncableAccount() { return false; }
    public abstract void onPerformSync(android.accounts.Account p0, android.os.Bundle p1, java.lang.String p2, android.content.ContentProviderClient p3, android.content.SyncResult p4);
    public void onSecurityException(android.accounts.Account p0, android.os.Bundle p1, java.lang.String p2, android.content.SyncResult p3) {}
    public void onSyncCanceled() {}
    public void onSyncCanceled(java.lang.Thread p0) {}

    private class ISyncAdapterImpl extends android.content.ISyncAdapter.Stub {
        public void onUnsyncableAccount(android.content.ISyncAdapterUnsyncableAccountCallback p0) {}
        public void startSync(android.content.ISyncContext p0, java.lang.String p1, android.accounts.Account p2, android.os.Bundle p3) {}
        public void cancelSync(android.content.ISyncContext p0) {}
    }

    private class SyncThread extends java.lang.Thread {
        public void run() {}
    }
}
