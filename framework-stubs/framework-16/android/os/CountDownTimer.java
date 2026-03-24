package android.os;

public abstract class CountDownTimer {
    public CountDownTimer(long p0, long p1) {}
    public final synchronized void cancel() {}
    public final synchronized android.os.CountDownTimer start() { return null; }
    public abstract void onTick(long p0);
    public abstract void onFinish();
}
