package android.metrics;

@android.annotation.SystemApi
public class LogMaker {
    public static final int MAX_SERIALIZED_SIZE = 4000;
    public LogMaker(int p0) {}
    public LogMaker(java.lang.Object[] p0) {}
    public android.metrics.LogMaker setCategory(int p0) { return null; }
    public android.metrics.LogMaker clearCategory() { return null; }
    public android.metrics.LogMaker setType(int p0) { return null; }
    public android.metrics.LogMaker clearType() { return null; }
    public android.metrics.LogMaker setSubtype(int p0) { return null; }
    public android.metrics.LogMaker clearSubtype() { return null; }
    public android.metrics.LogMaker setLatency(long p0) { return null; }
    public android.metrics.LogMaker setTimestamp(long p0) { return null; }
    public android.metrics.LogMaker clearTimestamp() { return null; }
    public android.metrics.LogMaker setPackageName(java.lang.String p0) { return null; }
    public android.metrics.LogMaker setComponentName(android.content.ComponentName p0) { return null; }
    public android.metrics.LogMaker clearPackageName() { return null; }
    public android.metrics.LogMaker setProcessId(int p0) { return null; }
    public android.metrics.LogMaker clearProcessId() { return null; }
    public android.metrics.LogMaker setUid(int p0) { return null; }
    public android.metrics.LogMaker clearUid() { return null; }
    public android.metrics.LogMaker setCounterName(java.lang.String p0) { return null; }
    public android.metrics.LogMaker setCounterBucket(int p0) { return null; }
    public android.metrics.LogMaker setCounterBucket(long p0) { return null; }
    public android.metrics.LogMaker setCounterValue(int p0) { return null; }
    public android.metrics.LogMaker addTaggedData(int p0, java.lang.Object p1) { return null; }
    public android.metrics.LogMaker clearTaggedData(int p0) { return null; }
    public boolean isValidValue(java.lang.Object p0) { return false; }
    public java.lang.Object getTaggedData(int p0) { return null; }
    public int getCategory() { return 0; }
    public int getType() { return 0; }
    public int getSubtype() { return 0; }
    public long getTimestamp() { return 0L; }
    public java.lang.String getPackageName() { return null; }
    public int getProcessId() { return 0; }
    public int getUid() { return 0; }
    public java.lang.String getCounterName() { return null; }
    public long getCounterBucket() { return 0L; }
    public boolean isLongCounterBucket() { return false; }
    public int getCounterValue() { return 0; }
    public java.lang.Object[] serialize() { return null; }
    public void deserialize(java.lang.Object[] p0) {}
    public boolean isSubsetOf(android.metrics.LogMaker p0) { return false; }
    public android.util.SparseArray<java.lang.Object> getEntries() { return null; }
}
