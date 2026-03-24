package android.filterfw.core;

public class RoundRobinScheduler extends android.filterfw.core.Scheduler {
    private int mLastPos;
    public RoundRobinScheduler(android.filterfw.core.FilterGraph p0) { super(null); }
    public void reset() {}
    public android.filterfw.core.Filter scheduleNextNode() { return null; }
}
