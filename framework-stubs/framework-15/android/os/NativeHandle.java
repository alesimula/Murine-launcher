package android.os;

@android.annotation.SystemApi
public final class NativeHandle implements java.io.Closeable {
    public NativeHandle() {}
    public NativeHandle(java.io.FileDescriptor p0, boolean p1) {}
    public NativeHandle(java.io.FileDescriptor[] p0, int[] p1, boolean p2) {}
    public boolean hasSingleFileDescriptor() { return false; }
    @android.annotation.NonNull
    public android.os.NativeHandle dup() throws java.io.IOException { return null; }
    public void close() throws java.io.IOException {}
    @android.annotation.NonNull
    public java.io.FileDescriptor getFileDescriptor() { return null; }
    @android.annotation.NonNull
    public java.io.FileDescriptor[] getFileDescriptors() { return null; }
    @android.annotation.NonNull
    public int[] getInts() { return null; }
}
