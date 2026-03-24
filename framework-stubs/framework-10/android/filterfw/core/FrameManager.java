package android.filterfw.core;

public abstract class FrameManager {
    private android.filterfw.core.FilterContext mContext;
    public FrameManager() {}
    @android.annotation.UnsupportedAppUsage
    public abstract android.filterfw.core.Frame newFrame(android.filterfw.core.FrameFormat p0);
    @android.annotation.UnsupportedAppUsage
    public abstract android.filterfw.core.Frame newBoundFrame(android.filterfw.core.FrameFormat p0, int p1, long p2);
    @android.annotation.UnsupportedAppUsage
    public android.filterfw.core.Frame duplicateFrame(android.filterfw.core.Frame p0) { return null; }
    public android.filterfw.core.Frame duplicateFrameToTarget(android.filterfw.core.Frame p0, int p1) { return null; }
    public abstract android.filterfw.core.Frame retainFrame(android.filterfw.core.Frame p0);
    public abstract android.filterfw.core.Frame releaseFrame(android.filterfw.core.Frame p0);
    public android.filterfw.core.FilterContext getContext() { return null; }
    public android.filterfw.core.GLEnvironment getGLEnvironment() { return null; }
    public void tearDown() {}
    void setContext(android.filterfw.core.FilterContext p0) {}
}
