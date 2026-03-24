package android.net.http;

public abstract class HttpEngine {
    HttpEngine() {}
    public void bindToNetwork(android.net.Network p0) {}
    @android.annotation.NonNull
    public abstract java.net.URLStreamHandlerFactory createUrlStreamHandlerFactory();
    @android.annotation.NonNull
    public static java.lang.String getVersionString() { return null; }
    @android.annotation.NonNull
    public abstract android.net.http.BidirectionalStream.Builder newBidirectionalStreamBuilder(java.lang.String p0, java.util.concurrent.Executor p1, android.net.http.BidirectionalStream.Callback p2);
    @android.annotation.NonNull
    public abstract android.net.http.UrlRequest.Builder newUrlRequestBuilder(java.lang.String p0, java.util.concurrent.Executor p1, android.net.http.UrlRequest.Callback p2);
    @android.annotation.NonNull
    public abstract java.net.URLConnection openConnection(java.net.URL p0) throws java.io.IOException;
    @android.annotation.FlaggedApi("android.net.http.preload_httpengine_in_zygote")
    public static void preload() {}
    public abstract void shutdown();

    public static class Builder {
        public static final int HTTP_CACHE_DISABLED = 0;
        public static final int HTTP_CACHE_DISK = 3;
        public static final int HTTP_CACHE_DISK_NO_HTTP = 2;
        public static final int HTTP_CACHE_IN_MEMORY = 1;
        public Builder(android.content.Context p0) {}
        @android.annotation.NonNull
        public android.net.http.HttpEngine.Builder addPublicKeyPins(java.lang.String p0, java.util.Set<byte[]> p1, boolean p2, java.time.Instant p3) { return null; }
        @android.annotation.NonNull
        public android.net.http.HttpEngine.Builder addQuicHint(java.lang.String p0, int p1, int p2) { return null; }
        @android.annotation.NonNull
        public android.net.http.HttpEngine build() { return null; }
        @android.annotation.NonNull
        public java.lang.String getDefaultUserAgent() { return null; }
        @android.annotation.NonNull
        public android.net.http.HttpEngine.Builder setConnectionMigrationOptions(android.net.http.ConnectionMigrationOptions p0) { return null; }
        @android.annotation.NonNull
        public android.net.http.HttpEngine.Builder setDnsOptions(android.net.http.DnsOptions p0) { return null; }
        @android.annotation.NonNull
        public android.net.http.HttpEngine.Builder setEnableBrotli(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.http.HttpEngine.Builder setEnableHttp2(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.http.HttpEngine.Builder setEnableHttpCache(int p0, long p1) { return null; }
        @android.annotation.NonNull
        public android.net.http.HttpEngine.Builder setEnablePublicKeyPinningBypassForLocalTrustAnchors(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.http.HttpEngine.Builder setEnableQuic(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.net.http.HttpEngine.Builder setQuicOptions(android.net.http.QuicOptions p0) { return null; }
        @android.annotation.NonNull
        public android.net.http.HttpEngine.Builder setStoragePath(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.net.http.HttpEngine.Builder setUserAgent(java.lang.String p0) { return null; }
    }
}
