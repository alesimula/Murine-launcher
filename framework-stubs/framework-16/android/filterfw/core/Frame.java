package android.filterfw.core;

public abstract class Frame {
    public static final int NO_BINDING = 0;
    public static final long TIMESTAMP_NOT_SET = -2L;
    public static final long TIMESTAMP_UNKNOWN = -1L;
    Frame(android.filterfw.core.FrameFormat p0, android.filterfw.core.FrameManager p1) {}
    Frame(android.filterfw.core.FrameFormat p0, android.filterfw.core.FrameManager p1, int p2, long p3) {}
    public android.filterfw.core.FrameFormat getFormat() { return null; }
    public int getCapacity() { return 0; }
    public boolean isReadOnly() { return false; }
    public int getBindingType() { return 0; }
    public long getBindingId() { return 0L; }
    public void setObjectValue(java.lang.Object p0) {}
    public abstract java.lang.Object getObjectValue();
    public abstract void setInts(int[] p0);
    public abstract int[] getInts();
    public abstract void setFloats(float[] p0);
    public abstract float[] getFloats();
    public abstract void setData(java.nio.ByteBuffer p0, int p1, int p2);
    public void setData(java.nio.ByteBuffer p0) {}
    public void setData(byte[] p0, int p1, int p2) {}
    public abstract java.nio.ByteBuffer getData();
    public abstract void setBitmap(android.graphics.Bitmap p0);
    public abstract android.graphics.Bitmap getBitmap();
    public void setTimestamp(long p0) {}
    public long getTimestamp() { return 0L; }
    public void setDataFromFrame(android.filterfw.core.Frame p0) {}
    protected boolean requestResize(int[] p0) { return false; }
    public int getRefCount() { return 0; }
    public android.filterfw.core.Frame release() { return null; }
    public android.filterfw.core.Frame retain() { return null; }
    public android.filterfw.core.FrameManager getFrameManager() { return null; }
    protected void assertFrameMutable() {}
    protected void setReusable(boolean p0) {}
    protected void setFormat(android.filterfw.core.FrameFormat p0) {}
    protected void setGenericObjectValue(java.lang.Object p0) {}
    protected static android.graphics.Bitmap convertBitmapToRGBA(android.graphics.Bitmap p0) { return null; }
    protected void reset(android.filterfw.core.FrameFormat p0) {}
    protected void onFrameStore() {}
    protected void onFrameFetch() {}
    protected abstract boolean hasNativeAllocation();
    protected abstract void releaseNativeAllocation();
    final int incRefCount() { return 0; }
    final int decRefCount() { return 0; }
    final boolean isReusable() { return false; }
    final void markReadOnly() {}
}
