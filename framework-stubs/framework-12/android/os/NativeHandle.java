package android.os;

@android.annotation.SystemApi
public final class NativeHandle implements java.io.Closeable {
    private boolean mOwn;
    private java.io.FileDescriptor[] mFds;
    private int[] mInts;
    public NativeHandle() {}
    public NativeHandle(java.io.FileDescriptor p0, boolean p1) {}
    private static java.io.FileDescriptor[] createFileDescriptorArray(int[] p0) { return null; }
    private NativeHandle(int[] p0, int[] p1, boolean p2) {}
    public NativeHandle(java.io.FileDescriptor[] p0, int[] p1, boolean p2) {}
    public boolean hasSingleFileDescriptor() { return false; }
    public android.os.NativeHandle dup() throws java.io.IOException { return null; }
    private void checkOpen() {}
    public void close() throws java.io.IOException {}
    public java.io.FileDescriptor getFileDescriptor() { return null; }
    private int[] getFdsAsIntArray() { return null; }
    public java.io.FileDescriptor[] getFileDescriptors() { return null; }
    public int[] getInts() { return null; }
}
