package android.os;

public final class SharedMemory implements android.os.Parcelable, java.io.Closeable {
    private final java.io.FileDescriptor mFileDescriptor = null;
    private final int mSize = 0;
    private final android.os.SharedMemory.MemoryRegistration mMemoryRegistration = null;
    private static final int PROT_MASK = Integer.valueOf(0);
    public static final android.os.Parcelable.Creator<android.os.SharedMemory> CREATOR = null;
    private SharedMemory(java.io.FileDescriptor p0) {}
    public static android.os.SharedMemory create(java.lang.String p0, int p1) throws android.system.ErrnoException { return null; }
    private void checkOpen() {}
    private static void validateProt(int p0) {}
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
    private static native java.io.FileDescriptor nCreate(java.lang.String p0, int p1) throws android.system.ErrnoException;
    private static native int nGetSize(java.io.FileDescriptor p0);
    private static native int nSetProt(java.io.FileDescriptor p0, int p1);

    private static final class Closer implements java.lang.Runnable {
        private java.io.FileDescriptor mFd;
        private android.os.SharedMemory.MemoryRegistration mMemoryReference;
        private Closer(java.io.FileDescriptor p0, android.os.SharedMemory.MemoryRegistration p1) {}
        public void run() {}
    }

    private static final class MemoryRegistration {
        private int mSize;
        private int mReferenceCount;
        private MemoryRegistration(int p0) {}
        public synchronized android.os.SharedMemory.MemoryRegistration acquire() { return null; }
        public synchronized void release() {}
    }

    private static final class Unmapper implements java.lang.Runnable {
        private long mAddress;
        private int mSize;
        private android.os.SharedMemory.MemoryRegistration mMemoryReference;
        private Unmapper(long p0, int p1, android.os.SharedMemory.MemoryRegistration p2) {}
        public void run() {}
    }
}
