package android.media.tv.tuner.dvr;

@android.annotation.SystemApi
public class DvrRecorder implements java.lang.AutoCloseable {
    public void setListener(java.util.concurrent.Executor p0, android.media.tv.tuner.dvr.OnRecordStatusChangedListener p1) {}
    public int attachFilter(android.media.tv.tuner.filter.Filter p0) { return 0; }
    public int detachFilter(android.media.tv.tuner.filter.Filter p0) { return 0; }
    public int configure(android.media.tv.tuner.dvr.DvrSettings p0) { return 0; }
    public int setRecordBufferStatusCheckIntervalHint(long p0) { return 0; }
    public int start() { return 0; }
    public int stop() { return 0; }
    public int flush() { return 0; }
    public void close() {}
    public void setFileDescriptor(android.os.ParcelFileDescriptor p0) {}
    public long write(long p0) { return 0L; }
    public long write(byte[] p0, long p1, long p2) { return 0L; }
}
