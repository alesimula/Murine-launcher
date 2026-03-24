package android.os;

public abstract class CountDownTimer {
    private final long mMillisInFuture = 0L;
    private final long mCountdownInterval = 0L;
    private long mStopTimeInFuture;
    private boolean mCancelled;
    private static final int MSG = 1;
    private android.os.Handler mHandler;
    public CountDownTimer(long p0, long p1) {}
    public final synchronized void cancel() {}
    public final synchronized android.os.CountDownTimer start() { return null; }
    public abstract void onTick(long p0);
    public abstract void onFinish();
}
