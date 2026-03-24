package com.android.org.conscrypt;

public final class FileClientSessionCache {
    public static final int MAX_SIZE = 12;
    static final java.util.Map<java.io.File, com.android.org.conscrypt.FileClientSessionCache.Impl> caches = null;
    public static synchronized com.android.org.conscrypt.SSLClientSessionCache usingDirectory(java.io.File p0) throws java.io.IOException { return null; }
    static synchronized void reset() {}

    static class CacheFile extends java.io.File {
        final java.lang.String name = null;
        long lastModified;
        CacheFile(java.io.File p0, java.lang.String p1) { super((java.lang.String)null); }
        public long lastModified() { return 0L; }
        public int compareTo(java.io.File p0) { return 0; }
    }

    static class Impl implements com.android.org.conscrypt.SSLClientSessionCache {
        final java.io.File directory = null;
        java.util.Map<java.lang.String, java.io.File> accessOrder;
        int size;
        java.lang.String[] initialFiles;
        Impl(java.io.File p0) throws java.io.IOException {}
        public synchronized byte[] getSessionData(java.lang.String p0, int p1) { return null; }
        static void logReadError(java.lang.String p0, java.io.File p1, java.lang.Throwable p2) {}
        public synchronized void putSessionData(javax.net.ssl.SSLSession p0, byte[] p1) {}
        static void logWriteError(java.lang.String p0, java.io.File p1, java.lang.Throwable p2) {}
    }
}
