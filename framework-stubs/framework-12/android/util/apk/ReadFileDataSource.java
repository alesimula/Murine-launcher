package android.util.apk;

class ReadFileDataSource implements android.util.apk.DataSource {
    private final java.io.FileDescriptor mFd = null;
    private final long mFilePosition = 0L;
    private final long mSize = 0L;
    private static final int CHUNK_SIZE = 1048576;
    ReadFileDataSource(java.io.FileDescriptor p0, long p1, long p2) {}
    public long size() { return 0L; }
    public void feedIntoDataDigester(android.util.apk.DataDigester p0, long p1, int p2) throws java.io.IOException, java.security.DigestException {}
}
