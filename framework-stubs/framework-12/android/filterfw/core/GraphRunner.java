package android.filterfw.core;

public abstract class GraphRunner {
    protected android.filterfw.core.FilterContext mFilterContext;
    public static final int RESULT_UNKNOWN = 0;
    public static final int RESULT_RUNNING = 1;
    public static final int RESULT_FINISHED = 2;
    public static final int RESULT_SLEEPING = 3;
    public static final int RESULT_BLOCKED = 4;
    public static final int RESULT_STOPPED = 5;
    public static final int RESULT_ERROR = 6;
    public GraphRunner(android.filterfw.core.FilterContext p0) {}
    public abstract android.filterfw.core.FilterGraph getGraph();
    public android.filterfw.core.FilterContext getContext() { return null; }
    protected boolean activateGlContext() { return false; }
    protected void deactivateGlContext() {}
    public abstract void run();
    public abstract void setDoneCallback(android.filterfw.core.GraphRunner.OnRunnerDoneListener p0);
    public abstract boolean isRunning();
    public abstract void stop();
    public abstract void close();
    public abstract java.lang.Exception getError();

    public static interface OnRunnerDoneListener {
        public void onRunnerDone(int p0);
    }
}
