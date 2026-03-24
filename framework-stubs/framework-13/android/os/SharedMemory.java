package android.os;

public final class SharedMemory implements android.os.Parcelable, java.io.Closeable {
    public static final android.os.Parcelable.Creator<android.os.SharedMemory> CREATOR = null;
    public static android.os.SharedMemory create(java.lang.String p0, int p1) throws android.system.ErrnoException { return null; }
    public static android.os.SharedMemory fromFileDescriptor(android.os.ParcelFileDescriptor p0) { return null; }
    public boolean setProtect(int p0) { return false; }
    public java.io.FileDescriptor getFileDescriptor() { return null; }
    public int getFd() { return 0; }
    public int getSize() { return 0; }
    public java.nio.ByteBuffer mapReadWrite() throws android.system.ErrnoException { return null; }
    public java.nio.ByteBuffer mapReadOnly() throws android.system.ErrnoException { return null; }
    public java.nio.ByteBuffer map(int p0, int p1, int p2) throws android.system.ErrnoException { return null; }
    public static void unmap(java.nio.ByteBuffer p0) {}
    public void close() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public android.os.ParcelFileDescriptor getFdDup() throws java.io.IOException { return null; }

    private static final class Closer implements java.lang.Runnable {
        public void run() {}
    }

    private static final class MemoryRegistration {
        public synchronized android.os.SharedMemory.MemoryRegistration acquire() { return null; }
        public synchronized void release() {}
    }

    private static final class Unmapper implements java.lang.Runnable {
        public void run() {}
    }
}
