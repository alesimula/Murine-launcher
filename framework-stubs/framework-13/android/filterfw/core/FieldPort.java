package android.filterfw.core;

public class FieldPort extends android.filterfw.core.InputPort {
    protected java.lang.reflect.Field mField;
    protected boolean mHasFrame;
    protected boolean mValueWaiting;
    protected java.lang.Object mValue;
    public FieldPort(android.filterfw.core.Filter p0, java.lang.String p1, java.lang.reflect.Field p2, boolean p3) { super(null, null); }
    public void clear() {}
    public void pushFrame(android.filterfw.core.Frame p0) {}
    public void setFrame(android.filterfw.core.Frame p0) {}
    public java.lang.Object getTarget() { return null; }
    public synchronized void transfer(android.filterfw.core.FilterContext p0) {}
    public synchronized android.filterfw.core.Frame pullFrame() { return null; }
    public synchronized boolean hasFrame() { return false; }
    public synchronized boolean acceptsFrame() { return false; }
    public java.lang.String toString() { return null; }
    protected synchronized void setFieldFrame(android.filterfw.core.Frame p0, boolean p1) {}
}
