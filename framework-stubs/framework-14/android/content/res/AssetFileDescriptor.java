package android.content.res;

public class AssetFileDescriptor implements android.os.Parcelable, java.io.Closeable {
    public static final long UNKNOWN_LENGTH = -1L;
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
    }

    public static class AutoCloseOutputStream extends android.os.ParcelFileDescriptor.AutoCloseOutputStream {
        public AutoCloseOutputStream(android.content.res.AssetFileDescriptor p0) throws java.io.IOException { super(null); }
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void write(byte[] p0) throws java.io.IOException {}
        public void write(int p0) throws java.io.IOException {}
    }
}
