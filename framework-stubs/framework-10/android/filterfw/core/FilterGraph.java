package android.filterfw.core;

public class FilterGraph {
    private java.util.HashSet<android.filterfw.core.Filter> mFilters;
    private java.util.HashMap<java.lang.String, android.filterfw.core.Filter> mNameMap;
    private java.util.HashMap<android.filterfw.core.OutputPort, java.util.LinkedList<android.filterfw.core.InputPort>> mPreconnections;
    public static final int AUTOBRANCH_OFF = 0;
    public static final int AUTOBRANCH_SYNCED = 1;
    public static final int AUTOBRANCH_UNSYNCED = 2;
    public static final int TYPECHECK_OFF = 0;
    public static final int TYPECHECK_DYNAMIC = 1;
    public static final int TYPECHECK_STRICT = 2;
    private boolean mIsReady;
    private int mAutoBranchMode;
    private int mTypeCheckMode;
    private boolean mDiscardUnconnectedOutputs;
    private boolean mLogVerbose;
    private java.lang.String TAG;
    public FilterGraph() {}
    public boolean addFilter(android.filterfw.core.Filter p0) { return false; }
    public boolean containsFilter(android.filterfw.core.Filter p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public android.filterfw.core.Filter getFilter(java.lang.String p0) { return null; }
    public void connect(android.filterfw.core.Filter p0, java.lang.String p1, android.filterfw.core.Filter p2, java.lang.String p3) {}
    public void connect(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    public java.util.Set<android.filterfw.core.Filter> getFilters() { return null; }
    public void beginProcessing() {}
    public void flushFrames() {}
    public void closeFilters(android.filterfw.core.FilterContext p0) {}
    public boolean isReady() { return false; }
    public void setAutoBranchMode(int p0) {}
    public void setDiscardUnconnectedOutputs(boolean p0) {}
    public void setTypeCheckMode(int p0) {}
    @android.annotation.UnsupportedAppUsage
    public void tearDown(android.filterfw.core.FilterContext p0) {}
    private boolean readyForProcessing(android.filterfw.core.Filter p0, java.util.Set<android.filterfw.core.Filter> p1) { return false; }
    private void runTypeCheck() {}
    private void updateOutputs(android.filterfw.core.Filter p0) {}
    private void runTypeCheckOn(android.filterfw.core.Filter p0) {}
    private void checkConnections() {}
    private void discardUnconnectedOutputs() {}
    private void removeFilter(android.filterfw.core.Filter p0) {}
    private void preconnect(android.filterfw.core.OutputPort p0, android.filterfw.core.InputPort p1) {}
    private void connectPorts() {}
    private java.util.HashSet<android.filterfw.core.Filter> getSourceFilters() { return null; }
    void setupFilters() {}
}
