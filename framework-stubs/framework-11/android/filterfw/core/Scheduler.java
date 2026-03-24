package android.filterfw.core;

public abstract class Scheduler {
    private android.filterfw.core.FilterGraph mGraph;
    Scheduler(android.filterfw.core.FilterGraph p0) {}
    android.filterfw.core.FilterGraph getGraph() { return null; }
    abstract void reset();
    abstract android.filterfw.core.Filter scheduleNextNode();
    boolean finished() { return false; }
}
