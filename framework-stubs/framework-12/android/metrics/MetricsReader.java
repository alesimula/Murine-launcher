package android.metrics;

@android.annotation.SystemApi
public class MetricsReader {
    private java.util.Queue<android.metrics.LogMaker> mPendingQueue;
    private java.util.Queue<android.metrics.LogMaker> mSeenQueue;
    private int[] LOGTAGS;
    private android.metrics.MetricsReader.LogReader mReader;
    private int mCheckpointTag;
    public MetricsReader() {}
    public void setLogReader(android.metrics.MetricsReader.LogReader p0) {}
    public void read(long p0) {}
    public void checkpoint() {}
    public void reset() {}
    public boolean hasNext() { return false; }
    public android.metrics.LogMaker next() { return null; }

    public static class Event {
        long mTimeMillis;
        int mPid;
        int mUid;
        java.lang.Object mData;
        public Event(long p0, int p1, int p2, java.lang.Object p3) {}
        Event(android.util.EventLog.Event p0) {}
        public long getTimeMillis() { return 0L; }
        public int getProcessId() { return 0; }
        public int getUid() { return 0; }
        public java.lang.Object getData() { return null; }
        public void setData(java.lang.Object p0) {}
    }

    public static class LogReader {
        public LogReader() {}
        public void readEvents(int[] p0, long p1, java.util.Collection<android.metrics.MetricsReader.Event> p2) throws java.io.IOException {}
        public void writeCheckpoint(int p0) {}
    }
}
