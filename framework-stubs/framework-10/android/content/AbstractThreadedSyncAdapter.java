package android.content;

public abstract class AbstractThreadedSyncAdapter {
    private static final java.lang.String TAG = "SyncAdapter";
    @java.lang.Deprecated
    public static final int LOG_SYNC_DETAILS = 2743;
    private static final boolean ENABLE_LOG = Boolean.valueOf(false);
    private final android.content.Context mContext = null;
    private final java.util.concurrent.atomic.AtomicInteger mNumSyncStarts = null;
    private final android.content.AbstractThreadedSyncAdapter.ISyncAdapterImpl mISyncAdapterImpl = null;
    private final java.util.HashMap<android.accounts.Account, android.content.AbstractThreadedSyncAdapter.SyncThread> mSyncThreads = null;
    private final java.lang.Object mSyncThreadLock = null;
    private final boolean mAutoInitialize = false;
    private boolean mAllowParallelSyncs;
    public AbstractThreadedSyncAdapter(android.content.Context p0, boolean p1) {}
    public AbstractThreadedSyncAdapter(android.content.Context p0, boolean p1, boolean p2) {}
    public android.content.Context getContext() { return null; }
    private android.accounts.Account toSyncKey(android.accounts.Account p0) { return null; }
    public final android.os.IBinder getSyncAdapterBinder() { return null; }
    private void handleOnUnsyncableAccount(android.content.ISyncAdapterUnsyncableAccountCallback p0) {}
    public boolean onUnsyncableAccount() { return false; }
    public abstract void onPerformSync(android.accounts.Account p0, android.os.Bundle p1, java.lang.String p2, android.content.ContentProviderClient p3, android.content.SyncResult p4);
    public void onSecurityException(android.accounts.Account p0, android.os.Bundle p1, java.lang.String p2, android.content.SyncResult p3) {}
    public void onSyncCanceled() {}
    public void onSyncCanceled(java.lang.Thread p0) {}

    private class SyncThread extends java.lang.Thread {
        private final android.content.SyncContext mSyncContext = null;
        private final java.lang.String mAuthority = null;
        private final android.accounts.Account mAccount = null;
        private final android.os.Bundle mExtras = null;
        private final android.accounts.Account mThreadsKey = null;
        private SyncThread(android.content.AbstractThreadedSyncAdapter p0, java.lang.String p1, android.content.SyncContext p2, java.lang.String p3, android.accounts.Account p4, android.os.Bundle p5) { super(); }
        public void run() {}
        private boolean isCanceled() { return false; }
    }

    private class ISyncAdapterImpl extends android.content.ISyncAdapter.Stub {
        private ISyncAdapterImpl(android.content.AbstractThreadedSyncAdapter p0) { super(); }
        public void onUnsyncableAccount(android.content.ISyncAdapterUnsyncableAccountCallback p0) {}
        public void startSync(android.content.ISyncContext p0, java.lang.String p1, android.accounts.Account p2, android.os.Bundle p3) {}
        public void cancelSync(android.content.ISyncContext p0) {}
    }
}
