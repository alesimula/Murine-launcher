package android.app;

public class PropertyInvalidatedCache<Query extends java.lang.Object, Result extends java.lang.Object> {
    public static final java.lang.String MODULE_TEST = "test";
    public static final java.lang.String MODULE_SYSTEM = "system_server";
    public static final java.lang.String MODULE_BLUETOOTH = "bluetooth";
    public static final java.lang.String MODULE_TELEPHONY = "telephony";
    static final java.lang.String NAME_CONTAINS = "-name-has=";
    static final java.lang.String NAME_LIKE = "-name-like=";
    static final java.lang.String PROPERTY_CONTAINS = "-property-has=";
    static final java.lang.String PROPERTY_LIKE = "-property-like=";
    @android.annotation.NonNull
    public static java.lang.String createPropertyName(java.lang.String p0, java.lang.String p1) { return null; }
    public PropertyInvalidatedCache(int p0, java.lang.String p1) {}
    public PropertyInvalidatedCache(int p0, java.lang.String p1, java.lang.String p2) {}
    public PropertyInvalidatedCache(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.app.PropertyInvalidatedCache.QueryHandler<Query, Result> p4) {}
    public static void setTestMode(boolean p0) {}
    public void testPropertyName() {}
    public final void clear() {}
    public Result recompute(Query p0) { return null; }
    public boolean bypass(Query p0) { return false; }
    public boolean resultEquals(Result p0, Result p1) { return false; }
    protected Result refresh(Result p0, Query p1) { return null; }
    public final void disableInstance() {}
    public final void forgetDisableLocal() {}
    public void disableLocal() {}
    public void disableForCurrentProcess() {}
    public static void disableForCurrentProcess(java.lang.String p0) {}
    public final boolean isDisabled() { return false; }
    @android.annotation.Nullable
    public Result query(Query p0) { return null; }
    public final void disableSystemWide() {}
    public void invalidateCache() {}
    public static void invalidateCache(java.lang.String p0, java.lang.String p1) {}
    public static void invalidateCache(java.lang.String p0) {}
    public static void corkInvalidations(java.lang.String p0) {}
    public static void uncorkInvalidations(java.lang.String p0) {}
    @android.annotation.NonNull
    public final java.lang.String cacheName() { return null; }
    @android.annotation.NonNull
    public final java.lang.String propertyName() { return null; }
    @android.annotation.NonNull
    protected java.lang.String queryToString(Query p0) { return null; }
    public static void disableForTestMode() {}
    public boolean getDisabledState() { return false; }
    public int size() { return 0; }
    public static void dumpCacheInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) {}
    public static void onTrimMemory() {}

    public static final class AutoCorker {
        public static final int DEFAULT_AUTO_CORK_DELAY_MS = 50;
        public AutoCorker(java.lang.String p0) {}
        public AutoCorker(java.lang.String p0, int p1) {}
        public void autoCork() {}
    }

    private static class DefaultComputer<Query extends java.lang.Object, Result extends java.lang.Object> extends android.app.PropertyInvalidatedCache.QueryHandler<Query, Result> {
        final android.app.PropertyInvalidatedCache<Query, Result> mCache = null;
        DefaultComputer(android.app.PropertyInvalidatedCache<Query, Result> p0) { super(); }
        public Result apply(Query p0) { return null; }
    }

    private static final class NoPreloadHolder {
        public static long next() { return 0L; }
    }

    public static abstract class QueryHandler<Q extends java.lang.Object, R extends java.lang.Object> {
        public QueryHandler() {}
        @android.annotation.Nullable
        public abstract R apply(Q p0);
        public boolean shouldBypassCache(Q p0) { return false; }
    }
}
