package android.webkit;

@java.lang.Deprecated
public final class CacheManager {
    public CacheManager() {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static java.io.File getCacheFileBaseDir() { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static boolean cacheDisabled() { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static boolean startCacheTransaction() { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static boolean endCacheTransaction() { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static android.webkit.CacheManager.CacheResult getCacheFile(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1) { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static void saveCacheFile(java.lang.String p0, android.webkit.CacheManager.CacheResult p1) {}
    @android.annotation.UnsupportedAppUsage
    static void saveCacheFile(java.lang.String p0, long p1, android.webkit.CacheManager.CacheResult p2) {}

    @java.lang.Deprecated
    public static class CacheResult {
        @android.annotation.UnsupportedAppUsage
        int httpStatusCode;
        @android.annotation.UnsupportedAppUsage
        long contentLength;
        @android.annotation.UnsupportedAppUsage
        long expires;
        @android.annotation.UnsupportedAppUsage
        java.lang.String expiresString;
        @android.annotation.UnsupportedAppUsage
        java.lang.String localPath;
        @android.annotation.UnsupportedAppUsage
        java.lang.String lastModified;
        @android.annotation.UnsupportedAppUsage
        java.lang.String etag;
        @android.annotation.UnsupportedAppUsage
        java.lang.String mimeType;
        @android.annotation.UnsupportedAppUsage
        java.lang.String location;
        @android.annotation.UnsupportedAppUsage
        java.lang.String encoding;
        @android.annotation.UnsupportedAppUsage
        java.lang.String contentdisposition;
        @android.annotation.UnsupportedAppUsage
        java.lang.String crossDomain;
        @android.annotation.UnsupportedAppUsage
        java.io.InputStream inStream;
        @android.annotation.UnsupportedAppUsage
        java.io.OutputStream outStream;
        @android.annotation.UnsupportedAppUsage
        java.io.File outFile;
        public CacheResult() {}
        @android.annotation.UnsupportedAppUsage
        public int getHttpStatusCode() { return 0; }
        @android.annotation.UnsupportedAppUsage
        public long getContentLength() { return 0L; }
        @android.annotation.UnsupportedAppUsage
        public java.lang.String getLocalPath() { return null; }
        @android.annotation.UnsupportedAppUsage
        public long getExpires() { return 0L; }
        @android.annotation.UnsupportedAppUsage
        public java.lang.String getExpiresString() { return null; }
        @android.annotation.UnsupportedAppUsage
        public java.lang.String getLastModified() { return null; }
        @android.annotation.UnsupportedAppUsage
        public java.lang.String getETag() { return null; }
        @android.annotation.UnsupportedAppUsage
        public java.lang.String getMimeType() { return null; }
        @android.annotation.UnsupportedAppUsage
        public java.lang.String getLocation() { return null; }
        @android.annotation.UnsupportedAppUsage
        public java.lang.String getEncoding() { return null; }
        @android.annotation.UnsupportedAppUsage
        public java.lang.String getContentDisposition() { return null; }
        @android.annotation.UnsupportedAppUsage
        public java.io.InputStream getInputStream() { return null; }
        @android.annotation.UnsupportedAppUsage
        public java.io.OutputStream getOutputStream() { return null; }
        @android.annotation.UnsupportedAppUsage
        public void setInputStream(java.io.InputStream p0) {}
        @android.annotation.UnsupportedAppUsage
        public void setEncoding(java.lang.String p0) {}
        public void setContentLength(long p0) {}
    }
}
