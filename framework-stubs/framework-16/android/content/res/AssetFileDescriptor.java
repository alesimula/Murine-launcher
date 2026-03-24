package android.content.res;

public class AssetFileDescriptor implements android.os.Parcelable, java.io.Closeable {
    public static final long UNKNOWN_LENGTH = -1L;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.res.AssetFileDescriptor> CREATOR = null;
    public AssetFileDescriptor(android.os.ParcelFileDescriptor p0, long p1, long p2) {}
    public AssetFileDescriptor(android.os.ParcelFileDescriptor p0, long p1, long p2, android.os.Bundle p3) {}
    public android.os.ParcelFileDescriptor getParcelFileDescriptor() { return null; }
    public java.io.FileDescriptor getFileDescriptor() { return null; }
    public long getStartOffset() { return 0L; }
    public android.os.Bundle getExtras() { return null; }
    public long getLength() { return 0L; }
    public long getDeclaredLength() { return 0L; }
    public void close() throws java.io.IOException {}
    public java.io.FileInputStream createInputStream() throws java.io.IOException { return null; }
    public java.io.FileOutputStream createOutputStream() throws java.io.IOException { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    AssetFileDescriptor(android.os.Parcel p0) {}

    public static class AutoCloseInputStream extends android.os.ParcelFileDescriptor.AutoCloseInputStream {
        public AutoCloseInputStream(android.content.res.AssetFileDescriptor p0) throws java.io.IOException { super(null); }
        public int available() throws java.io.IOException { return 0; }
        public int read() throws java.io.IOException { return 0; }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
        public int read(byte[] p0) throws java.io.IOException { return 0; }
        public long skip(long p0) throws java.io.IOException { return 0L; }
        public void mark(int p0) {}
        public boolean markSupported() { return false; }
        public synchronized void reset() throws java.io.IOException {}
        public java.nio.channels.FileChannel getChannel() { return null; }
        public void close() throws java.io.IOException {}
    }

    public static class AutoCloseOutputStream extends android.os.ParcelFileDescriptor.AutoCloseOutputStream {
        public AutoCloseOutputStream(android.content.res.AssetFileDescriptor p0) throws java.io.IOException { super(null); }
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void write(byte[] p0) throws java.io.IOException {}
        public void write(int p0) throws java.io.IOException {}
    }

    private static class NonSeekableAutoCloseInputStream extends android.os.ParcelFileDescriptor.AutoCloseInputStream {
        NonSeekableAutoCloseInputStream(android.content.res.AssetFileDescriptor p0) throws java.io.IOException { super(null); }
        public int available() throws java.io.IOException { return 0; }
        public int read() throws java.io.IOException { return 0; }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
        public int read(byte[] p0) throws java.io.IOException { return 0; }
        public long skip(long p0) throws java.io.IOException { return 0L; }
        public void mark(int p0) {}
        public boolean markSupported() { return false; }
        public synchronized void reset() throws java.io.IOException {}
    }

    private static class SeekableAutoCloseInputStream extends android.os.ParcelFileDescriptor.AutoCloseInputStream {
        SeekableAutoCloseInputStream(android.content.res.AssetFileDescriptor p0) throws java.io.IOException { super(null); }
        public int available() throws java.io.IOException { return 0; }
        public int read() throws java.io.IOException { return 0; }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
        public int read(byte[] p0) throws java.io.IOException { return 0; }
        public long skip(long p0) throws java.io.IOException { return 0L; }
        public void mark(int p0) {}
        public boolean markSupported() { return false; }
        public synchronized void reset() throws java.io.IOException {}
        public java.nio.channels.FileChannel getChannel() { return null; }

        private class OffsetCorrectFileChannel extends java.nio.channels.FileChannel {
            OffsetCorrectFileChannel(android.content.res.AssetFileDescriptor.SeekableAutoCloseInputStream p0, java.nio.channels.FileChannel p1) { super(); }
            public int read(java.nio.ByteBuffer p0) throws java.io.IOException { return 0; }
            public long read(java.nio.ByteBuffer[] p0, int p1, int p2) throws java.io.IOException { return 0L; }
            public int read(java.nio.ByteBuffer p0, long p1) throws java.io.IOException { return 0; }
            public long position() throws java.io.IOException { return 0L; }
            public java.nio.channels.FileChannel position(long p0) throws java.io.IOException { return null; }
            public long size() throws java.io.IOException { return 0L; }
            public long transferTo(long p0, long p1, java.nio.channels.WritableByteChannel p2) throws java.io.IOException { return 0L; }
            public java.nio.MappedByteBuffer map(java.nio.channels.FileChannel.MapMode p0, long p1, long p2) throws java.io.IOException { return null; }
            protected void implCloseChannel() throws java.io.IOException {}
            public int write(java.nio.ByteBuffer p0) throws java.io.IOException { return 0; }
            public long write(java.nio.ByteBuffer[] p0, int p1, int p2) throws java.io.IOException { return 0L; }
            public int write(java.nio.ByteBuffer p0, long p1) throws java.io.IOException { return 0; }
            public long transferFrom(java.nio.channels.ReadableByteChannel p0, long p1, long p2) throws java.io.IOException { return 0L; }
            public java.nio.channels.FileChannel truncate(long p0) throws java.io.IOException { return null; }
            public void force(boolean p0) throws java.io.IOException {}
            public java.nio.channels.FileLock lock(long p0, long p1, boolean p2) throws java.io.IOException { return null; }
            public java.nio.channels.FileLock tryLock(long p0, long p1, boolean p2) throws java.io.IOException { return null; }
        }
    }
}
