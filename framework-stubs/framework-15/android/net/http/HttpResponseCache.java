package android.net.http;

public final class HttpResponseCache extends java.net.ResponseCache implements java.io.Closeable {
    public static android.net.http.HttpResponseCache getInstalled() { return null; }
    public static synchronized android.net.http.HttpResponseCache install(java.io.File p0, long p1) throws java.io.IOException { return null; }
    public java.net.CacheResponse get(java.net.URI p0, java.lang.String p1, java.util.Map<java.lang.String, java.util.List<java.lang.String>> p2) throws java.io.IOException { return null; }
    public java.net.CacheRequest put(java.net.URI p0, java.net.URLConnection p1) throws java.io.IOException { return null; }
    public long size() { return 0L; }
    public long maxSize() { return 0L; }
    public void flush() {}
    public int getNetworkCount() { return 0; }
    public int getHitCount() { return 0; }
    public int getRequestCount() { return 0; }
    public void close() throws java.io.IOException {}
    public void delete() throws java.io.IOException {}
    public com.android.okhttp.internalandroidapi.HasCacheHolder.CacheHolder getCacheHolder() { return null; }
}
