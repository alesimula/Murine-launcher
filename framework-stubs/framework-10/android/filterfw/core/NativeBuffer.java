package android.filterfw.core;

public class NativeBuffer {
    private long mDataPointer;
    private int mSize;
    private android.filterfw.core.Frame mAttachedFrame;
    private boolean mOwnsData;
    private int mRefCount;
    public NativeBuffer() {}
    public NativeBuffer(int p0) {}
    public android.filterfw.core.NativeBuffer mutableCopy() { return null; }
    public int size() { return 0; }
    public int count() { return 0; }
    public int getElementSize() { return 0; }
    public android.filterfw.core.NativeBuffer retain() { return null; }
    public android.filterfw.core.NativeBuffer release() { return null; }
    public boolean isReadOnly() { return false; }
    void attachToFrame(android.filterfw.core.Frame p0) {}
    protected void assertReadable() {}
    protected void assertWritable() {}
    private native boolean allocate(int p0);
    private native boolean deallocate(boolean p0);
    private native boolean nativeCopyTo(android.filterfw.core.NativeBuffer p0);
}
