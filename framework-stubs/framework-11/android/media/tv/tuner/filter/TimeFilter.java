package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public class TimeFilter implements java.lang.AutoCloseable {
    private long mNativeContext;
    private boolean mEnable;
    private native int nativeSetTimestamp(long p0);
    private native int nativeClearTimestamp();
    private native java.lang.Long nativeGetTimestamp();
    private native java.lang.Long nativeGetSourceTime();
    private native int nativeClose();
    private TimeFilter() {}
    public int setCurrentTimestamp(long p0) { return 0; }
    public int clearTimestamp() { return 0; }
    public long getTimeStamp() { return 0L; }
    public long getSourceTime() { return 0L; }
    public void close() {}
}
