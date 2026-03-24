package android.os;

public class ParcelFileDescriptor implements android.os.Parcelable, java.io.Closeable {
    @java.lang.Deprecated
    public static final int MODE_WORLD_READABLE = 1;
    @java.lang.Deprecated
    public static final int MODE_WORLD_WRITEABLE = 2;
    public static final int MODE_READ_ONLY = 268435456;
    public static final int MODE_WRITE_ONLY = 536870912;
    public static final int MODE_READ_WRITE = 805306368;
    public static final int MODE_CREATE = 134217728;
    public static final int MODE_TRUNCATE = 67108864;
    public static final int MODE_APPEND = 33554432;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.ParcelFileDescriptor> CREATOR = null;
    public ParcelFileDescriptor(android.os.ParcelFileDescriptor p0) {}
    public ParcelFileDescriptor(java.io.FileDescriptor p0) {}
    public ParcelFileDescriptor(java.io.FileDescriptor p0, java.io.FileDescriptor p1) {}
    public static android.os.ParcelFileDescriptor open(java.io.File p0, int p1) throws java.io.FileNotFoundException { return null; }
    @android.annotation.SuppressLint("ExecutorRegistration")
    public static android.os.ParcelFileDescriptor open(java.io.File p0, int p1, android.os.Handler p2, android.os.ParcelFileDescriptor.OnCloseListener p3) throws java.io.IOException { return null; }
    @android.annotation.SuppressLint("ExecutorRegistration")
    @android.annotation.NonNull
    public static android.os.ParcelFileDescriptor wrap(android.os.ParcelFileDescriptor p0, android.os.Handler p1, android.os.ParcelFileDescriptor.OnCloseListener p2) throws java.io.IOException { return null; }
    public static android.os.ParcelFileDescriptor fromFd(java.io.FileDescriptor p0, android.os.Handler p1, android.os.ParcelFileDescriptor.OnCloseListener p2) throws java.io.IOException { return null; }
    public static android.os.ParcelFileDescriptor dup(java.io.FileDescriptor p0) throws java.io.IOException { return null; }
    public android.os.ParcelFileDescriptor dup() throws java.io.IOException { return null; }
    public static android.os.ParcelFileDescriptor fromFd(int p0) throws java.io.IOException { return null; }
    public static android.os.ParcelFileDescriptor adoptFd(int p0) { return null; }
    public static android.os.ParcelFileDescriptor fromSocket(java.net.Socket p0) { return null; }
    public static android.os.ParcelFileDescriptor fromDatagramSocket(java.net.DatagramSocket p0) { return null; }
    public static android.os.ParcelFileDescriptor[] createPipe() throws java.io.IOException { return null; }
    public static android.os.ParcelFileDescriptor[] createReliablePipe() throws java.io.IOException { return null; }
    public static android.os.ParcelFileDescriptor[] createSocketPair() throws java.io.IOException { return null; }
    public static android.os.ParcelFileDescriptor[] createSocketPair(int p0) throws java.io.IOException { return null; }
    public static android.os.ParcelFileDescriptor[] createReliableSocketPair() throws java.io.IOException { return null; }
    public static android.os.ParcelFileDescriptor[] createReliableSocketPair(int p0) throws java.io.IOException { return null; }
    @java.lang.Deprecated
    public static android.os.ParcelFileDescriptor fromData(byte[] p0, java.lang.String p1) throws java.io.IOException { return null; }
    public static int parseMode(java.lang.String p0) { return 0; }
    public static java.io.File getFile(java.io.FileDescriptor p0) throws java.io.IOException { return null; }
    public java.io.FileDescriptor getFileDescriptor() { return null; }
    public long getStatSize() { return 0L; }
    public long seekTo(long p0) throws java.io.IOException { return 0L; }
    public int getFd() { return 0; }
    public int detachFd() { return 0; }
    public void close() throws java.io.IOException {}
    public void closeWithError(java.lang.String p0) throws java.io.IOException {}
    public void releaseResources() {}
    public boolean canDetectErrors() { return false; }
    public void checkError() throws java.io.IOException {}
    public java.lang.String toString() { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class AutoCloseInputStream extends java.io.FileInputStream {
        public AutoCloseInputStream(android.os.ParcelFileDescriptor p0) { super((java.io.FileDescriptor)null); }
        public void close() throws java.io.IOException {}
        public int read() throws java.io.IOException { return 0; }
        public int read(byte[] p0) throws java.io.IOException { return 0; }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
    }

    public static class AutoCloseOutputStream extends java.io.FileOutputStream {
        public AutoCloseOutputStream(android.os.ParcelFileDescriptor p0) { super((java.io.FileDescriptor)null); }
        public void close() throws java.io.IOException {}
    }

    public static class FileDescriptorDetachedException extends java.io.IOException {
        public FileDescriptorDetachedException() { super(); }
    }

    public static interface OnCloseListener {
        public void onClose(java.io.IOException p0);
    }

    private static class Status {
        public static final int DEAD = -2;
        public static final int SILENCE = -1;
        public static final int OK = 0;
        public static final int ERROR = 1;
        public static final int DETACHED = 2;
        public static final int LEAKED = 3;
        public final int status = 0;
        public final java.lang.String msg = null;
        public Status(int p0) {}
        public Status(int p0, java.lang.String p1) {}
        public java.io.IOException asIOException() { return null; }
        public java.lang.String toString() { return null; }
    }
}
