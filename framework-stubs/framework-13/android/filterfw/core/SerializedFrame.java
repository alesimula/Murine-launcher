package android.filterfw.core;

public class SerializedFrame extends android.filterfw.core.Frame {
    SerializedFrame(android.filterfw.core.FrameFormat p0, android.filterfw.core.FrameManager p1) { super((android.filterfw.core.FrameFormat)null, (android.filterfw.core.FrameManager)null); }
    static android.filterfw.core.SerializedFrame wrapObject(java.lang.Object p0, android.filterfw.core.FrameManager p1) { return null; }
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
    protected void setGenericObjectValue(java.lang.Object p0) {}
    public java.lang.String toString() { return null; }

    private class DirectByteInputStream extends java.io.InputStream {
        public DirectByteInputStream(android.filterfw.core.SerializedFrame p0, byte[] p1, int p2) { super(); }
        public final int available() { return 0; }
        public final int read() { return 0; }
        public final int read(byte[] p0, int p1, int p2) { return 0; }
        public final long skip(long p0) { return 0L; }
    }

    private class DirectByteOutputStream extends java.io.OutputStream {
        public DirectByteOutputStream(android.filterfw.core.SerializedFrame p0, int p1) { super(); }
        public final void markHeaderEnd() {}
        public final int getSize() { return 0; }
        public byte[] getByteArray() { return null; }
        public final void write(byte[] p0) {}
        public final void write(byte[] p0, int p1, int p2) {}
        public final void write(int p0) {}
        public final void reset() {}
        public final android.filterfw.core.SerializedFrame.DirectByteInputStream getInputStream() { return null; }
    }
}
