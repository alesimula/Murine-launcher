package android.filterfw.core;

public class CachedFrameManager extends android.filterfw.core.SimpleFrameManager {
    private java.util.SortedMap<java.lang.Integer, android.filterfw.core.Frame> mAvailableFrames;
    private int mStorageCapacity;
    private int mStorageSize;
    private int mTimeStamp;
    public CachedFrameManager() { super(); }
    public android.filterfw.core.Frame newFrame(android.filterfw.core.FrameFormat p0) { return null; }
    public android.filterfw.core.Frame newBoundFrame(android.filterfw.core.FrameFormat p0, int p1, long p2) { return null; }
    public android.filterfw.core.Frame retainFrame(android.filterfw.core.Frame p0) { return null; }
    public android.filterfw.core.Frame releaseFrame(android.filterfw.core.Frame p0) { return null; }
    public void clearCache() {}
    public void tearDown() {}
    private boolean storeFrame(android.filterfw.core.Frame p0) { return false; }
    private void dropOldestFrame() {}
    private android.filterfw.core.Frame findAvailableFrame(android.filterfw.core.FrameFormat p0, int p1, long p2) { return null; }
}
