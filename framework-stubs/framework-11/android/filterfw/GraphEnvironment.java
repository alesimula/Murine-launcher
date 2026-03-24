package android.filterfw;

public class GraphEnvironment extends android.filterfw.MffEnvironment {
    public static final int MODE_ASYNCHRONOUS = 1;
    public static final int MODE_SYNCHRONOUS = 2;
    private android.filterfw.io.GraphReader mGraphReader;
    private java.util.ArrayList<android.filterfw.GraphEnvironment.GraphHandle> mGraphs;
    public GraphEnvironment() { super(null); }
    public GraphEnvironment(android.filterfw.core.FrameManager p0, android.filterfw.io.GraphReader p1) { super(null); }
    public android.filterfw.io.GraphReader getGraphReader() { return null; }
    public void addReferences(java.lang.Object... p0) {}
    public int loadGraph(android.content.Context p0, int p1) { return 0; }
    public int addGraph(android.filterfw.core.FilterGraph p0) { return 0; }
    public android.filterfw.core.FilterGraph getGraph(int p0) { return null; }
    public android.filterfw.core.GraphRunner getRunner(int p0, int p1) { return null; }

    private class GraphHandle {
        private android.filterfw.core.FilterGraph mGraph;
        private android.filterfw.core.AsyncRunner mAsyncRunner;
        private android.filterfw.core.SyncRunner mSyncRunner;
        public GraphHandle(android.filterfw.GraphEnvironment p0, android.filterfw.core.FilterGraph p1) {}
        public android.filterfw.core.FilterGraph getGraph() { return null; }
        public android.filterfw.core.AsyncRunner getAsyncRunner(android.filterfw.core.FilterContext p0) { return null; }
        public android.filterfw.core.GraphRunner getSyncRunner(android.filterfw.core.FilterContext p0) { return null; }
    }
}
