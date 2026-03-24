package android.filterfw.core;

public class StreamPort extends android.filterfw.core.InputPort {
    public StreamPort(android.filterfw.core.Filter p0, java.lang.String p1) { super(null, null); }
    public void clear() {}
    public void setFrame(android.filterfw.core.Frame p0) {}
    public void pushFrame(android.filterfw.core.Frame p0) {}
    protected synchronized void assignFrame(android.filterfw.core.Frame p0, boolean p1) {}
    public synchronized android.filterfw.core.Frame pullFrame() { return null; }
    public synchronized boolean hasFrame() { return false; }
    public java.lang.String toString() { return null; }
    public synchronized void transfer(android.filterfw.core.FilterContext p0) {}
}
