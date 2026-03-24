package android.filterpacks.videoproc;

public class BackDropperFilter extends android.filterfw.core.Filter {
    public BackDropperFilter(java.lang.String p0) { super(null); }
    public void setupPorts() {}
    public android.filterfw.core.FrameFormat getOutputFormat(java.lang.String p0, android.filterfw.core.FrameFormat p1) { return null; }
    public void prepare(android.filterfw.core.FilterContext p0) {}
    public void process(android.filterfw.core.FilterContext p0) {}
    public void close(android.filterfw.core.FilterContext p0) {}
    public synchronized void relearn() {}
    public void fieldPortValueUpdated(java.lang.String p0, android.filterfw.core.FilterContext p1) {}

    public static interface LearningDoneListener {
        public void onLearningDone(android.filterpacks.videoproc.BackDropperFilter p0);
    }
}
