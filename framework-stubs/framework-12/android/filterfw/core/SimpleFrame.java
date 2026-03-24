package android.filterfw.core;

public class SimpleFrame extends android.filterfw.core.Frame {
    private java.lang.Object mObject;
    SimpleFrame(android.filterfw.core.FrameFormat p0, android.filterfw.core.FrameManager p1) { super((android.filterfw.core.FrameFormat)null, (android.filterfw.core.FrameManager)null); }
    static android.filterfw.core.SimpleFrame wrapObject(java.lang.Object p0, android.filterfw.core.FrameManager p1) { return null; }
    private void initWithFormat(android.filterfw.core.FrameFormat p0) {}
    protected boolean hasNativeAllocation() { return false; }
    protected void releaseNativeAllocation() {}
    public java.lang.Object getObjectValue() { return null; }
    public void setInts(int[] p0) {}
    public int[] getInts() { return null; }
    public void setFloats(float[] p0) {}
    public float[] getFloats() { return null; }
    public void setData(java.nio.ByteBuffer p0, int p1, int p2) {}
    public java.nio.ByteBuffer getData() { return null; }
    public void setBitmap(android.graphics.Bitmap p0) {}
    public android.graphics.Bitmap getBitmap() { return null; }
    private void setFormatObjectClass(java.lang.Class p0) {}
    protected void setGenericObjectValue(java.lang.Object p0) {}
    public java.lang.String toString() { return null; }
}
