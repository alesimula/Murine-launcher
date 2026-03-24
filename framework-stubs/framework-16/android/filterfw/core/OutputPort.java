package android.filterfw.core;

public class OutputPort extends android.filterfw.core.FilterPort {
    protected android.filterfw.core.InputPort mTargetPort;
    protected android.filterfw.core.InputPort mBasePort;
    public OutputPort(android.filterfw.core.Filter p0, java.lang.String p1) { super(null, null); }
    public void connectTo(android.filterfw.core.InputPort p0) {}
    public boolean isConnected() { return false; }
    public void open() {}
    public void close() {}
    public android.filterfw.core.InputPort getTargetPort() { return null; }
    public android.filterfw.core.Filter getTargetFilter() { return null; }
    public void setBasePort(android.filterfw.core.InputPort p0) {}
    public android.filterfw.core.InputPort getBasePort() { return null; }
    public boolean filterMustClose() { return false; }
    public boolean isReady() { return false; }
    public void clear() {}
    public void pushFrame(android.filterfw.core.Frame p0) {}
    public void setFrame(android.filterfw.core.Frame p0) {}
    public android.filterfw.core.Frame pullFrame() { return null; }
    public boolean hasFrame() { return false; }
    public java.lang.String toString() { return null; }
}
