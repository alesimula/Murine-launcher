package android.filterfw.core;

public abstract class FilterPort {
    protected android.filterfw.core.Filter mFilter;
    protected java.lang.String mName;
    protected android.filterfw.core.FrameFormat mPortFormat;
    protected boolean mIsBlocking;
    protected boolean mIsOpen;
    protected boolean mChecksType;
    public FilterPort(android.filterfw.core.Filter p0, java.lang.String p1) {}
    public boolean isAttached() { return false; }
    public android.filterfw.core.FrameFormat getPortFormat() { return null; }
    public void setPortFormat(android.filterfw.core.FrameFormat p0) {}
    public android.filterfw.core.Filter getFilter() { return null; }
    public java.lang.String getName() { return null; }
    public void setBlocking(boolean p0) {}
    public void setChecksType(boolean p0) {}
    public void open() {}
    public void close() {}
    public boolean isOpen() { return false; }
    public boolean isBlocking() { return false; }
    public abstract boolean filterMustClose();
    public abstract boolean isReady();
    public abstract void pushFrame(android.filterfw.core.Frame p0);
    public abstract void setFrame(android.filterfw.core.Frame p0);
    public abstract android.filterfw.core.Frame pullFrame();
    public abstract boolean hasFrame();
    public abstract void clear();
    public java.lang.String toString() { return null; }
    protected void assertPortIsOpen() {}
    protected void checkFrameType(android.filterfw.core.Frame p0, boolean p1) {}
    protected void checkFrameManager(android.filterfw.core.Frame p0, android.filterfw.core.FilterContext p1) {}
}
