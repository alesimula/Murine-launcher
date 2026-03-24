package android.os;

public final class FileUtils {
    private static final java.lang.String TAG = "FileUtils";
    public static final int S_IRWXU = 448;
    public static final int S_IRUSR = 256;
    public static final int S_IWUSR = 128;
    public static final int S_IXUSR = 64;
    public static final int S_IRWXG = 56;
    public static final int S_IRGRP = 32;
    public static final int S_IWGRP = 16;
    public static final int S_IXGRP = 8;
    public static final int S_IRWXO = 7;
    public static final int S_IROTH = 4;
    public static final int S_IWOTH = 2;
    public static final int S_IXOTH = 1;
    private static boolean sEnableCopyOptimizations;
    private static final long COPY_CHECKPOINT_BYTES = 524288L;
    private FileUtils() {}
    public static int setPermissions(java.io.File p0, int p1, int p2, int p3) { return 0; }
    public static int setPermissions(java.lang.String p0, int p1, int p2, int p3) { return 0; }
    public static int setPermissions(java.io.FileDescriptor p0, int p1, int p2, int p3) { return 0; }
    public static void copyPermissions(java.io.File p0, java.io.File p1) throws java.io.IOException {}
    @java.lang.Deprecated
    public static int getUid(java.lang.String p0) { return 0; }
    public static boolean sync(java.io.FileOutputStream p0) { return false; }
    @java.lang.Deprecated
    public static boolean copyFile(java.io.File p0, java.io.File p1) { return false; }
    @java.lang.Deprecated
    public static void copyFileOrThrow(java.io.File p0, java.io.File p1) throws java.io.IOException {}
    @java.lang.Deprecated
    public static boolean copyToFile(java.io.InputStream p0, java.io.File p1) { return false; }
    @java.lang.Deprecated
    public static void copyToFileOrThrow(java.io.InputStream p0, java.io.File p1) throws java.io.IOException {}
    public static long copy(java.io.File p0, java.io.File p1) throws java.io.IOException { return 0L; }
    public static long copy(java.io.File p0, java.io.File p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, android.os.FileUtils.ProgressListener p4) throws java.io.IOException { return 0L; }
    public static long copy(java.io.InputStream p0, java.io.OutputStream p1) throws java.io.IOException { return 0L; }
    public static long copy(java.io.InputStream p0, java.io.OutputStream p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, android.os.FileUtils.ProgressListener p4) throws java.io.IOException { return 0L; }
    public static long copy(java.io.FileDescriptor p0, java.io.FileDescriptor p1) throws java.io.IOException { return 0L; }
    public static long copy(java.io.FileDescriptor p0, java.io.FileDescriptor p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, android.os.FileUtils.ProgressListener p4) throws java.io.IOException { return 0L; }
    public static long copy(java.io.FileDescriptor p0, java.io.FileDescriptor p1, long p2, android.os.CancellationSignal p3, java.util.concurrent.Executor p4, android.os.FileUtils.ProgressListener p5) throws java.io.IOException { return 0L; }
    public static long copyInternalSplice(java.io.FileDescriptor p0, java.io.FileDescriptor p1, long p2, android.os.CancellationSignal p3, java.util.concurrent.Executor p4, android.os.FileUtils.ProgressListener p5) throws android.system.ErrnoException { return 0L; }
    public static long copyInternalSendfile(java.io.FileDescriptor p0, java.io.FileDescriptor p1, long p2, android.os.CancellationSignal p3, java.util.concurrent.Executor p4, android.os.FileUtils.ProgressListener p5) throws android.system.ErrnoException { return 0L; }
    @java.lang.Deprecated
    public static long copyInternalUserspace(java.io.FileDescriptor p0, java.io.FileDescriptor p1, android.os.FileUtils.ProgressListener p2, android.os.CancellationSignal p3, long p4) throws java.io.IOException { return 0L; }
    public static long copyInternalUserspace(java.io.FileDescriptor p0, java.io.FileDescriptor p1, long p2, android.os.CancellationSignal p3, java.util.concurrent.Executor p4, android.os.FileUtils.ProgressListener p5) throws java.io.IOException { return 0L; }
    public static long copyInternalUserspace(java.io.InputStream p0, java.io.OutputStream p1, android.os.CancellationSignal p2, java.util.concurrent.Executor p3, android.os.FileUtils.ProgressListener p4) throws java.io.IOException { return 0L; }
    public static boolean isFilenameSafe(java.io.File p0) { return false; }
    public static java.lang.String readTextFile(java.io.File p0, int p1, java.lang.String p2) throws java.io.IOException { return null; }
    public static void stringToFile(java.io.File p0, java.lang.String p1) throws java.io.IOException {}
    public static void bytesToFile(java.lang.String p0, byte[] p1) throws java.io.IOException {}
    public static void stringToFile(java.lang.String p0, java.lang.String p1) throws java.io.IOException {}
    @java.lang.Deprecated
    public static long checksumCrc32(java.io.File p0) throws java.io.FileNotFoundException, java.io.IOException { return 0L; }
    public static byte[] digest(java.io.File p0, java.lang.String p1) throws java.io.IOException, java.security.NoSuchAlgorithmException { return null; }
    public static byte[] digest(java.io.InputStream p0, java.lang.String p1) throws java.io.IOException, java.security.NoSuchAlgorithmException { return null; }
    public static byte[] digest(java.io.FileDescriptor p0, java.lang.String p1) throws java.io.IOException, java.security.NoSuchAlgorithmException { return null; }
    private static byte[] digestInternalUserspace(java.io.InputStream p0, java.lang.String p1) throws java.io.IOException, java.security.NoSuchAlgorithmException { return null; }
    public static boolean deleteOlderFiles(java.io.File p0, int p1, long p2) { return false; }
    public static boolean contains(java.io.File[] p0, java.io.File p1) { return false; }
    public static boolean contains(java.util.Collection<java.io.File> p0, java.io.File p1) { return false; }
    public static boolean contains(java.io.File p0, java.io.File p1) { return false; }
    public static boolean contains(java.lang.String p0, java.lang.String p1) { return false; }
    public static boolean deleteContentsAndDir(java.io.File p0) { return false; }
    public static boolean deleteContents(java.io.File p0) { return false; }
    private static boolean isValidExtFilenameChar(char p0) { return false; }
    public static boolean isValidExtFilename(java.lang.String p0) { return false; }
    public static java.lang.String buildValidExtFilename(java.lang.String p0) { return null; }
    private static boolean isValidFatFilenameChar(char p0) { return false; }
    public static boolean isValidFatFilename(java.lang.String p0) { return false; }
    public static java.lang.String buildValidFatFilename(java.lang.String p0) { return null; }
    public static java.lang.String trimFilename(java.lang.String p0, int p1) { return null; }
    private static void trimFilename(java.lang.StringBuilder p0, int p1) {}
    public static java.lang.String rewriteAfterRename(java.io.File p0, java.io.File p1, java.lang.String p2) { return null; }
    public static java.lang.String[] rewriteAfterRename(java.io.File p0, java.io.File p1, java.lang.String[] p2) { return null; }
    public static java.io.File rewriteAfterRename(java.io.File p0, java.io.File p1, java.io.File p2) { return null; }
    private static java.io.File buildUniqueFileWithExtension(java.io.File p0, java.lang.String p1, java.lang.String p2) throws java.io.FileNotFoundException { return null; }
    public static java.io.File buildUniqueFile(java.io.File p0, java.lang.String p1, java.lang.String p2) throws java.io.FileNotFoundException { return null; }
    public static java.io.File buildNonUniqueFile(java.io.File p0, java.lang.String p1, java.lang.String p2) { return null; }
    public static java.io.File buildUniqueFile(java.io.File p0, java.lang.String p1) throws java.io.FileNotFoundException { return null; }
    public static java.lang.String[] splitFileName(java.lang.String p0, java.lang.String p1) { return null; }
    private static java.io.File buildFile(java.io.File p0, java.lang.String p1, java.lang.String p2) { return null; }
    public static java.lang.String[] listOrEmpty(java.io.File p0) { return null; }
    public static java.io.File[] listFilesOrEmpty(java.io.File p0) { return null; }
    public static java.io.File[] listFilesOrEmpty(java.io.File p0, java.io.FilenameFilter p1) { return null; }
    public static java.io.File newFileOrNull(java.lang.String p0) { return null; }
    public static java.io.File createDir(java.io.File p0, java.lang.String p1) { return null; }
    public static boolean createDir(java.io.File p0) { return false; }
    public static long roundStorageSize(long p0) { return 0L; }
    @java.lang.Deprecated
    public static void closeQuietly(java.lang.AutoCloseable p0) {}
    @java.lang.Deprecated
    public static void closeQuietly(java.io.FileDescriptor p0) {}
    public static int translateModeStringToPosix(java.lang.String p0) { return 0; }
    public static java.lang.String translateModePosixToString(int p0) { return null; }
    public static int translateModePosixToPfd(int p0) { return 0; }
    public static int translateModePfdToPosix(int p0) { return 0; }
    public static int translateModeAccessToPosix(int p0) { return 0; }

    public static class MemoryPipe extends java.lang.Thread implements java.lang.AutoCloseable {
        private final java.io.FileDescriptor[] pipe = null;
        private final byte[] data = null;
        private final boolean sink = false;
        private MemoryPipe(byte[] p0, boolean p1) throws java.io.IOException { super(); }
        private android.os.FileUtils.MemoryPipe startInternal() { return null; }
        public static android.os.FileUtils.MemoryPipe createSource(byte[] p0) throws java.io.IOException { return null; }
        public static android.os.FileUtils.MemoryPipe createSink(byte[] p0) throws java.io.IOException { return null; }
        public java.io.FileDescriptor getFD() { return null; }
        public java.io.FileDescriptor getInternalFD() { return null; }
        public void run() {}
        public void close() throws java.lang.Exception {}
    }

    private static class NoImagePreloadHolder {
        public static final java.util.regex.Pattern SAFE_FILENAME_PATTERN = null;
        private NoImagePreloadHolder() {}
    }

    public static interface ProgressListener {
        public void onProgress(long p0);
    }
}
