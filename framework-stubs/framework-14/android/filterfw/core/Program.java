package android.filterfw.core;

public abstract class Program {
    public Program() {}
    public abstract void process(android.filterfw.core.Frame[] p0, android.filterfw.core.Frame p1);
    public void process(android.filterfw.core.Frame p0, android.filterfw.core.Frame p1) {}
    public abstract void setHostValue(java.lang.String p0, java.lang.Object p1);
    public abstract java.lang.Object getHostValue(java.lang.String p0);
    public void reset() {}
}
