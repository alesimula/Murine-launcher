package android.util.jar;

public final class StrictJarFile {
    public StrictJarFile(java.lang.String p0) throws java.io.IOException, java.lang.SecurityException {}
    public StrictJarFile(java.io.FileDescriptor p0) throws java.io.IOException, java.lang.SecurityException {}
    public StrictJarFile(java.io.FileDescriptor p0, boolean p1, boolean p2) throws java.io.IOException, java.lang.SecurityException {}
    public StrictJarFile(java.lang.String p0, boolean p1, boolean p2) throws java.io.IOException, java.lang.SecurityException {}
    public android.util.jar.StrictJarManifest getManifest() { return null; }
    public java.util.Iterator<java.util.zip.ZipEntry> iterator() throws java.io.IOException { return null; }
    public java.util.zip.ZipEntry findEntry(java.lang.String p0) { return null; }
    public java.security.cert.Certificate[][] getCertificateChains(java.util.zip.ZipEntry p0) { return null; }
    @java.lang.Deprecated
    public java.security.cert.Certificate[] getCertificates(java.util.zip.ZipEntry p0) { return null; }
    public java.io.InputStream getInputStream(java.util.zip.ZipEntry p0) { return null; }
    public void close() throws java.io.IOException {}
    protected void finalize() throws java.lang.Throwable {}

    static final class EntryIterator implements java.util.Iterator<java.util.zip.ZipEntry> {
        EntryIterator(long p0, java.lang.String p1) throws java.io.IOException {}
        public java.util.zip.ZipEntry next() { return null; }
        public boolean hasNext() { return false; }
        public void remove() {}
    }

    public static class FDStream extends java.io.InputStream {
        public FDStream(java.io.FileDescriptor p0, long p1, long p2) { super(); }
        public int available() throws java.io.IOException { return 0; }
        public int read() throws java.io.IOException { return 0; }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
        public long skip(long p0) throws java.io.IOException { return 0L; }
    }

    static final class JarFileInputStream extends java.io.FilterInputStream {
        JarFileInputStream(java.io.InputStream p0, long p1, android.util.jar.StrictJarVerifier.VerifierEntry p2) { super((java.io.InputStream)null); }
        public int read() throws java.io.IOException { return 0; }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
        public int available() throws java.io.IOException { return 0; }
        public long skip(long p0) throws java.io.IOException { return 0L; }
    }

    public static class ZipInflaterInputStream extends java.util.zip.InflaterInputStream {
        public ZipInflaterInputStream(java.io.InputStream p0, java.util.zip.Inflater p1, int p2, java.util.zip.ZipEntry p3) { super((java.io.InputStream)null); }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
        public int available() throws java.io.IOException { return 0; }
        public void close() throws java.io.IOException {}
    }
}
