package android.filterfw.core;

public class NativeFrame extends android.filterfw.core.Frame {
    private int nativeFrameId;
    NativeFrame(android.filterfw.core.FrameFormat p0, android.filterfw.core.FrameManager p1) { super((android.filterfw.core.FrameFormat)null, (android.filterfw.core.FrameManager)null); }
    protected synchronized void releaseNativeAllocation() {}
    protected synchronized boolean hasNativeAllocation() { return false; }
    public int getCapacity() { return 0; }
    public java.lang.Object getObjectValue() { return null; }
    public void setInts(int[] p0) {}
    public int[] getInts() { return null; }
    public void setFloats(float[] p0) {}
    public float[] getFloats() { return null; }
    public void setData(java.nio.ByteBuffer p0, int p1, int p2) {}
    public java.nio.ByteBuffer getData() { return null; }
    public void setBitmap(android.graphics.Bitmap p0) {}
    public android.graphics.Bitmap getBitmap() { return null; }
    public void setDataFromFrame(android.filterfw.core.Frame p0) {}
    public java.lang.String toString() { return null; }
    private native boolean nativeAllocate(int p0);
    private native boolean nativeDeallocate();
    private native int getNativeCapacity();
    private static native int nativeIntSize();
    private static native int nativeFloatSize();
    private native boolean setNativeData(byte[] p0, int p1, int p2);
    private native byte[] getNativeData(int p0);
    private native boolean getNativeBuffer(android.filterfw.core.NativeBuffer p0);
    private native boolean setNativeInts(int[] p0);
    private native boolean setNativeFloats(float[] p0);
    private native int[] getNativeInts(int p0);
    private native float[] getNativeFloats(int p0);
    private native boolean setNativeBitmap(android.graphics.Bitmap p0, int p1, int p2);
    private native boolean getNativeBitmap(android.graphics.Bitmap p0, int p1, int p2);
    private native boolean nativeCopyFromNative(android.filterfw.core.NativeFrame p0);
    private native boolean nativeCopyFromGL(android.filterfw.core.GLFrame p0);
}
