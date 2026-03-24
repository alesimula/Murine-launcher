package android.os;

@java.lang.Deprecated
public class FileBridge extends java.lang.Thread {
    public FileBridge() { super(); }
    public boolean isClosed() { return false; }
    public void forceClose() {}
    public void setTargetFile(android.os.ParcelFileDescriptor p0) {}
    public android.os.ParcelFileDescriptor getClientSocket() { return null; }
    public void run() {}

    public static class FileBridgeOutputStream extends java.io.OutputStream {
        public FileBridgeOutputStream(android.os.ParcelFileDescriptor p0) { super(); }
        public void close() throws java.io.IOException {}
        public void fsync() throws java.io.IOException {}
        public void write(byte[] p0, int p1, int p2) throws java.io.IOException {}
        public void write(int p0) throws java.io.IOException {}
    }
}
