package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public final class SharedFilter implements java.lang.AutoCloseable {
    public static final int STATUS_INACCESSIBLE = 128;
    public void setCallback(android.media.tv.tuner.filter.SharedFilterCallback p0, java.util.concurrent.Executor p1) {}
    public android.media.tv.tuner.filter.SharedFilterCallback getCallback() { return null; }
    public int start() { return 0; }
    public int stop() { return 0; }
    public int flush() { return 0; }
    public int read(byte[] p0, long p1, long p2) { return 0; }
    public void close() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
