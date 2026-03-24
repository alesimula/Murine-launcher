package android.util;

public abstract class TimedRemoteCaller<T extends java.lang.Object> {
    public static final long DEFAULT_CALL_TIMEOUT_MILLIS = 5000L;
    private final java.lang.Object mLock = null;
    private final long mCallTimeoutMillis = 0L;
    private final android.util.SparseIntArray mAwaitedCalls = null;
    private final android.util.SparseArray<T> mReceivedCalls = null;
    private int mSequenceCounter;
    public TimedRemoteCaller(long p0) {}
    protected final int onBeforeRemoteCall() { return 0; }
    protected final void onRemoteMethodResult(T p0, int p1) {}
    protected final T getResultTimed(int p0) throws java.util.concurrent.TimeoutException { return null; }
}
