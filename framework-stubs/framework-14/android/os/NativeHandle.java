package android.os;

@android.annotation.SystemApi
public final class NativeHandle implements java.io.Closeable {
    public NativeHandle() {}
    public NativeHandle(java.io.FileDescriptor p0, boolean p1) {}
    public NativeHandle(java.io.FileDescriptor[] p0, int[] p1, boolean p2) {}
    public boolean hasSingleFileDescriptor() { return false; }
    public android.os.NativeHandle dup() throws java.io.IOException { return null; }
    public void close() throws java.io.IOException {}
    public java.io.FileDescriptor getFileDescriptor() { return null; }
    public java.io.FileDescriptor[] getFileDescriptors() { return null; }
    public int[] getInts() { return null; }
}
