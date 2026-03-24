package android.filterfw.core;

public class OneShotScheduler extends android.filterfw.core.RoundRobinScheduler {
    private java.util.HashMap<java.lang.String, java.lang.Integer> scheduled;
    private final boolean mLogVerbose = false;
    private static final java.lang.String TAG = "OneShotScheduler";
    public OneShotScheduler(android.filterfw.core.FilterGraph p0) { super(null); }
    public void reset() {}
    public android.filterfw.core.Filter scheduleNextNode() { return null; }
}
