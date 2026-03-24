package android.telecom.Logging;

public abstract class Runnable {
    private android.telecom.Logging.Session mSubsession;
    private final java.lang.String mSubsessionName = null;
    private final java.lang.Object mLock = null;
    private final java.lang.Runnable mRunnable = null;
    public Runnable(java.lang.String p0, java.lang.Object p1) {}
    public final java.lang.Runnable getRunnableToCancel() { return null; }
    public java.lang.Runnable prepare() { return null; }
    public void cancel() {}
    public abstract void loggedRun();
}
