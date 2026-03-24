package android.os.incremental;

public class IncrementalMetrics {
    private final android.os.PersistableBundle mData = null;
    public IncrementalMetrics(android.os.PersistableBundle p0) {}
    public long getMillisSinceOldestPendingRead() { return 0L; }
    public boolean getReadLogsEnabled() { return false; }
    public int getStorageHealthStatusCode() { return 0; }
    public int getDataLoaderStatusCode() { return 0; }
    public long getMillisSinceLastDataLoaderBind() { return 0L; }
    public long getDataLoaderBindDelayMillis() { return 0L; }
    public int getTotalDelayedReads() { return 0; }
    public int getTotalFailedReads() { return 0; }
    public long getTotalDelayedReadsDurationMillis() { return 0L; }
    public int getLastReadErrorUid() { return 0; }
    public long getMillisSinceLastReadError() { return 0L; }
    public int getLastReadErrorNumber() { return 0; }
}
