package android.filterfw.core;

public class SyncRunner extends android.filterfw.core.GraphRunner {
    private android.filterfw.core.Scheduler mScheduler;
    private android.filterfw.core.GraphRunner.OnRunnerDoneListener mDoneListener;
    private java.util.concurrent.ScheduledThreadPoolExecutor mWakeExecutor;
    private android.os.ConditionVariable mWakeCondition;
    private android.filterfw.core.StopWatchMap mTimer;
    private final boolean mLogVerbose = false;
    private static final java.lang.String TAG = "SyncRunner";
    public SyncRunner(android.filterfw.core.FilterContext p0, android.filterfw.core.FilterGraph p1, java.lang.Class p2) { super(null); }
    public android.filterfw.core.FilterGraph getGraph() { return null; }
    public int step() { return 0; }
    public void beginProcessing() {}
    public void close() {}
    public void run() {}
    public boolean isRunning() { return false; }
    public void setDoneCallback(android.filterfw.core.GraphRunner.OnRunnerDoneListener p0) {}
    public void stop() {}
    public synchronized java.lang.Exception getError() { return null; }
    protected void waitUntilWake() {}
    protected void processFilterNode(android.filterfw.core.Filter p0) {}
    protected void scheduleFilterWake(android.filterfw.core.Filter p0, int p1) {}
    protected int determinePostRunState() { return 0; }
    boolean performStep() { return false; }
    void assertReadyToStep() {}
}
