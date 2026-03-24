package android.content;

public class SyncContext {
    private android.content.ISyncContext mSyncContext;
    private long mLastHeartbeatSendTime;
    private static final long HEARTBEAT_SEND_INTERVAL_IN_MS = 1000L;
    public SyncContext(android.content.ISyncContext p0) {}
    public void setStatusText(java.lang.String p0) {}
    private void updateHeartbeat() {}
    public void onFinished(android.content.SyncResult p0) {}
    public android.os.IBinder getSyncContextBinder() { return null; }
}
