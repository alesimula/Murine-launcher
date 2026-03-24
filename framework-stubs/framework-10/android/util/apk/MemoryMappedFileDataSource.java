package android.util.apk;

class MemoryMappedFileDataSource implements android.util.apk.DataSource {
    private static final long MEMORY_PAGE_SIZE_BYTES = Long.valueOf(0L);
    private final java.io.FileDescriptor mFd = null;
    private final long mFilePosition = 0L;
    private final long mSize = 0L;
    MemoryMappedFileDataSource(java.io.FileDescriptor p0, long p1, long p2) {}
    public long size() { return 0L; }
    public void feedIntoDataDigester(android.util.apk.DataDigester p0, long p1, int p2) throws java.io.IOException, java.security.DigestException {}
}
