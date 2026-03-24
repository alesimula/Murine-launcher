package android.os;

public class MemoryFile {
    public MemoryFile(java.lang.String p0, int p1) throws java.io.IOException {}
    public void close() {}
    void deactivate() {}
    public int length() { return 0; }
    @java.lang.Deprecated
    public boolean isPurgingAllowed() { return false; }
    @java.lang.Deprecated
    public synchronized boolean allowPurging(boolean p0) throws java.io.IOException { return false; }
    public java.io.InputStream getInputStream() { return null; }
    public java.io.OutputStream getOutputStream() { return null; }
    public int readBytes(byte[] p0, int p1, int p2, int p3) throws java.io.IOException { return 0; }
    public void writeBytes(byte[] p0, int p1, int p2, int p3) throws java.io.IOException {}
    public java.io.FileDescriptor getFileDescriptor() throws java.io.IOException { return null; }
    public static int getSize(java.io.FileDescriptor p0) throws java.io.IOException { return 0; }

    private class MemoryInputStream extends java.io.InputStream {
        public int available() throws java.io.IOException { return 0; }
        public boolean markSupported() { return false; }
        public void mark(int p0) {}
        public void reset() throws java.io.IOException {}
        public int read() throws java.io.IOException { return 0; }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
        public long skip(long p0) throws java.io.IOException { return 0L; }
    }

    private class MemoryOutputStream extends java.io.OutputStream {
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void write(int p0) throws java.io.IOException {}
    }
}
