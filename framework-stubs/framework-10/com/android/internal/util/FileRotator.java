package com.android.internal.util;

public class FileRotator {
    private static final java.lang.String TAG = "FileRotator";
    private static final boolean LOGD = false;
    private final java.io.File mBasePath = null;
    private final java.lang.String mPrefix = null;
    private final long mRotateAgeMillis = 0L;
    private final long mDeleteAgeMillis = 0L;
    private static final java.lang.String SUFFIX_BACKUP = ".backup";
    private static final java.lang.String SUFFIX_NO_BACKUP = ".no_backup";
    public FileRotator(java.io.File p0, java.lang.String p1, long p2, long p3) {}
    public void deleteAll() {}
    public void dumpAll(java.io.OutputStream p0) throws java.io.IOException {}
    public void rewriteActive(com.android.internal.util.FileRotator.Rewriter p0, long p1) throws java.io.IOException {}
    @java.lang.Deprecated
    public void combineActive(com.android.internal.util.FileRotator.Reader p0, com.android.internal.util.FileRotator.Writer p1, long p2) throws java.io.IOException {}
    public void rewriteAll(com.android.internal.util.FileRotator.Rewriter p0) throws java.io.IOException {}
    private void rewriteSingle(com.android.internal.util.FileRotator.Rewriter p0, java.lang.String p1) throws java.io.IOException {}
    public void readMatching(com.android.internal.util.FileRotator.Reader p0, long p1, long p2) throws java.io.IOException {}
    private java.lang.String getActiveName(long p0) { return null; }
    public void maybeRotate(long p0) {}
    private static void readFile(java.io.File p0, com.android.internal.util.FileRotator.Reader p1) throws java.io.IOException {}
    private static void writeFile(java.io.File p0, com.android.internal.util.FileRotator.Writer p1) throws java.io.IOException {}
    private static java.io.IOException rethrowAsIoException(java.lang.Throwable p0) throws java.io.IOException { return null; }

    public static interface Writer {
        public void write(java.io.OutputStream p0) throws java.io.IOException;
    }

    public static interface Rewriter extends com.android.internal.util.FileRotator.Reader, com.android.internal.util.FileRotator.Writer {
        public void reset();
        public boolean shouldWrite();
    }

    public static interface Reader {
        public void read(java.io.InputStream p0) throws java.io.IOException;
    }

    private static class FileInfo {
        public final java.lang.String prefix = null;
        public long startMillis;
        public long endMillis;
        public FileInfo(java.lang.String p0) {}
        public boolean parse(java.lang.String p0) { return false; }
        public java.lang.String build() { return null; }
        public boolean isActive() { return false; }
    }
}
