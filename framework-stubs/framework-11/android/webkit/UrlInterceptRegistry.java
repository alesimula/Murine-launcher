package android.webkit;

@java.lang.Deprecated
public final class UrlInterceptRegistry {
    private static final java.lang.String LOGTAG = "intercept";
    private static boolean mDisabled;
    private static java.util.LinkedList mHandlerList;
    public UrlInterceptRegistry() {}
    private static synchronized java.util.LinkedList getHandlers() { return null; }
    @java.lang.Deprecated
    public static synchronized void setUrlInterceptDisabled(boolean p0) {}
    @java.lang.Deprecated
    public static synchronized boolean urlInterceptDisabled() { return false; }
    @java.lang.Deprecated
    public static synchronized boolean registerHandler(android.webkit.UrlInterceptHandler p0) { return false; }
    @java.lang.Deprecated
    public static synchronized boolean unregisterHandler(android.webkit.UrlInterceptHandler p0) { return false; }
    @java.lang.Deprecated
    public static synchronized android.webkit.CacheManager.CacheResult getSurrogate(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1) { return null; }
    @java.lang.Deprecated
    public static synchronized android.webkit.PluginData getPluginData(java.lang.String p0, java.util.Map<java.lang.String, java.lang.String> p1) { return null; }
}
