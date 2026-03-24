package android.filterfw.core;

public class FilterGraph {
    public static final int AUTOBRANCH_OFF = 0;
    public static final int AUTOBRANCH_SYNCED = 1;
    public static final int AUTOBRANCH_UNSYNCED = 2;
    public static final int TYPECHECK_OFF = 0;
    public static final int TYPECHECK_DYNAMIC = 1;
    public static final int TYPECHECK_STRICT = 2;
    public FilterGraph() {}
    public boolean addFilter(android.filterfw.core.Filter p0) { return false; }
    public boolean containsFilter(android.filterfw.core.Filter p0) { return false; }
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
    public void tearDown(android.filterfw.core.FilterContext p0) {}
    void setupFilters() {}
}
