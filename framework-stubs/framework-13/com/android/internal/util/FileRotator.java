package com.android.internal.util;

public class FileRotator {
    public FileRotator(java.io.File p0, java.lang.String p1, long p2, long p3) {}
    public void deleteAll() {}
    public void dumpAll(java.io.OutputStream p0) throws java.io.IOException {}
    public void rewriteActive(com.android.internal.util.FileRotator.Rewriter p0, long p1) throws java.io.IOException {}
    @java.lang.Deprecated
    public void combineActive(com.android.internal.util.FileRotator.Reader p0, com.android.internal.util.FileRotator.Writer p1, long p2) throws java.io.IOException {}
    public void rewriteAll(com.android.internal.util.FileRotator.Rewriter p0) throws java.io.IOException {}
    public void rewriteSingle(com.android.internal.util.FileRotator.Rewriter p0, long p1, long p2) throws java.io.IOException {}
    public void readMatching(com.android.internal.util.FileRotator.Reader p0, long p1, long p2) throws java.io.IOException {}
    public void maybeRotate(long p0) {}

    private static class FileInfo {
        public final java.lang.String prefix = null;
        public long startMillis;
        public long endMillis;
        public FileInfo(java.lang.String p0) {}
        public boolean parse(java.lang.String p0) { return false; }
        public java.lang.String build() { return null; }
        public boolean isActive() { return false; }
    }

    public static interface Reader {
        public void read(java.io.InputStream p0) throws java.io.IOException;
    }

    public static interface Rewriter extends com.android.internal.util.FileRotator.Reader, com.android.internal.util.FileRotator.Writer {
        public void reset();
        public boolean shouldWrite();
    }

    public static interface Writer {
        public void write(java.io.OutputStream p0) throws java.io.IOException;
    }
}
