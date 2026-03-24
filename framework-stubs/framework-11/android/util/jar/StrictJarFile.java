package android.util.jar;

public final class StrictJarFile {
    private final long nativeHandle = 0L;
    private final java.io.FileDescriptor fd = null;
    private final android.util.jar.StrictJarManifest manifest = null;
    private final android.util.jar.StrictJarVerifier verifier = null;
    private final boolean isSigned = false;
    private boolean closed;
    public StrictJarFile(java.lang.String p0) throws java.io.IOException, java.lang.SecurityException {}
    public StrictJarFile(java.io.FileDescriptor p0) throws java.io.IOException, java.lang.SecurityException {}
    public StrictJarFile(java.io.FileDescriptor p0, boolean p1, boolean p2) throws java.io.IOException, java.lang.SecurityException {}
    public StrictJarFile(java.lang.String p0, boolean p1, boolean p2) throws java.io.IOException, java.lang.SecurityException {}
    private StrictJarFile(java.lang.String p0, java.io.FileDescriptor p1, boolean p2, boolean p3) throws java.io.IOException, java.lang.SecurityException {}
    public android.util.jar.StrictJarManifest getManifest() { return null; }
    public java.util.Iterator<java.util.zip.ZipEntry> iterator() throws java.io.IOException { return null; }
    public java.util.zip.ZipEntry findEntry(java.lang.String p0) { return null; }
    public java.security.cert.Certificate[][] getCertificateChains(java.util.zip.ZipEntry p0) { return null; }
    @java.lang.Deprecated
    public java.security.cert.Certificate[] getCertificates(java.util.zip.ZipEntry p0) { return null; }
    public java.io.InputStream getInputStream(java.util.zip.ZipEntry p0) { return null; }
    public void close() throws java.io.IOException {}
    protected void finalize() throws java.lang.Throwable {}
    private java.io.InputStream getZipInputStream(java.util.zip.ZipEntry p0) { return null; }
    private java.util.HashMap<java.lang.String, byte[]> getMetaEntries() throws java.io.IOException { return null; }
    private static native long nativeOpenJarFile(java.lang.String p0, int p1) throws java.io.IOException;
    private static native long nativeStartIteration(long p0, java.lang.String p1);
    private static native java.util.zip.ZipEntry nativeNextEntry(long p0);
    private static native java.util.zip.ZipEntry nativeFindEntry(long p0, java.lang.String p1);
    private static native void nativeClose(long p0);

    static final class EntryIterator implements java.util.Iterator<java.util.zip.ZipEntry> {
        private final long iterationHandle = 0L;
        private java.util.zip.ZipEntry nextEntry;
        EntryIterator(long p0, java.lang.String p1) throws java.io.IOException {}
        public java.util.zip.ZipEntry next() { return null; }
        public boolean hasNext() { return false; }
        public void remove() {}
    }

    public static class FDStream extends java.io.InputStream {
        private final java.io.FileDescriptor fd = null;
        private long endOffset;
        private long offset;
        public FDStream(java.io.FileDescriptor p0, long p1, long p2) { super(); }
        public int available() throws java.io.IOException { return 0; }
        public int read() throws java.io.IOException { return 0; }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
        public long skip(long p0) throws java.io.IOException { return 0L; }
    }

    static final class JarFileInputStream extends java.io.FilterInputStream {
        private final android.util.jar.StrictJarVerifier.VerifierEntry entry = null;
        private long count;
        private boolean done;
        JarFileInputStream(java.io.InputStream p0, long p1, android.util.jar.StrictJarVerifier.VerifierEntry p2) { super((java.io.InputStream)null); }
        public int read() throws java.io.IOException { return 0; }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
        public int available() throws java.io.IOException { return 0; }
        public long skip(long p0) throws java.io.IOException { return 0L; }
    }

    public static class ZipInflaterInputStream extends java.util.zip.InflaterInputStream {
        private final java.util.zip.ZipEntry entry = null;
        private long bytesRead;
        private boolean closed;
        public ZipInflaterInputStream(java.io.InputStream p0, java.util.zip.Inflater p1, int p2, java.util.zip.ZipEntry p3) { super((java.io.InputStream)null); }
        public int read(byte[] p0, int p1, int p2) throws java.io.IOException { return 0; }
        public int available() throws java.io.IOException { return 0; }
        public void close() throws java.io.IOException {}
    }
}
