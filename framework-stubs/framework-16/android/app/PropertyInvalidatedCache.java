package android.app;

public class PropertyInvalidatedCache<Query extends java.lang.Object, Result extends java.lang.Object> {
    public static final java.lang.String MODULE_TEST = "test";
    public static final java.lang.String MODULE_SYSTEM = "system_server";
    public static final java.lang.String MODULE_BLUETOOTH = "bluetooth";
    public static final java.lang.String MODULE_TELEPHONY = "telephony";
    public static final java.lang.String MODULE_ADSERVICES = "adservices";
    static final int NONCE_UNSET = 0;
    static final java.lang.String NAME_CONTAINS = "-name-has=";
    static final java.lang.String NAME_LIKE = "-name-like=";
    static final java.lang.String PROPERTY_CONTAINS = "-property-has=";
    static final java.lang.String PROPERTY_LIKE = "-property-like=";
    static final java.lang.String BRIEF = "-brief";
    public static boolean separatePermissionNotificationsEnabled() { return false; }
    @android.annotation.NonNull
    public static java.lang.String createPropertyName(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.NonNull
    public static java.lang.String createSystemCacheKey(java.lang.String p0) { return null; }
    public android.app.PropertyInvalidatedCache.NonceWatcher getNonceWatcher() { return null; }
    public static android.app.PropertyInvalidatedCache.NonceWatcher getNonceWatcher(java.lang.String p0) { return null; }
    public long getNonce() { return 0L; }
    public PropertyInvalidatedCache(android.app.PropertyInvalidatedCache.Args p0, java.lang.String p1, android.app.PropertyInvalidatedCache.QueryHandler<Query, Result> p2) {}
    public static java.lang.String apiFromProperty(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public PropertyInvalidatedCache(int p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public PropertyInvalidatedCache(int p0, java.lang.String p1, java.lang.String p2) {}
    public PropertyInvalidatedCache(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.app.PropertyInvalidatedCache.QueryHandler<Query, Result> p4) {}
    public static void setTestMode(boolean p0) {}
    public void testPropertyName() {}
    public final void clear() {}
    public Result recompute(Query p0) { return null; }
    public boolean bypass(Query p0) { return false; }
    public void disableInstance() {}
    public void forgetDisableLocal() {}
    public void disableLocal() {}
    public void disableForCurrentProcess() {}
    public static void disableForCurrentProcess(java.lang.String p0) {}
    public boolean isDisabled() { return false; }
    @android.annotation.Nullable
    public Result query(Query p0) { return null; }
    public void disableSystemWide() {}
    public void invalidateCache() {}
    public void corkInvalidations() {}
    public void uncorkInvalidations() {}
    public static void invalidateCache(java.lang.String p0, java.lang.String p1) {}
    public static void invalidateCache(android.app.PropertyInvalidatedCache.Args p0) {}
    public static void invalidateCache(java.lang.String p0) {}
    public static void corkInvalidations(java.lang.String p0) {}
    public static void uncorkInvalidations(java.lang.String p0) {}
    @android.annotation.NonNull
    public final java.lang.String cacheName() { return null; }
    @android.annotation.NonNull
    protected java.lang.String queryToString(Query p0) { return null; }
    public static void disableForTestMode() {}
    public int size() { return 0; }
    public static void dumpCacheInfo(java.io.PrintWriter p0, java.lang.String[] p1) {}
    public static void dumpCacheInfo(android.os.ParcelFileDescriptor p0, java.lang.String[] p1) {}
    public void dumpCacheEntries(java.io.PrintWriter p0) {}

    public static final record Args(android.app.PropertyInvalidatedCache.Namespace mNamespace, java.lang.String mApi, int mMaxEntries, boolean mIsolateUids, boolean mTestMode, boolean mCacheNulls) {
        public static final int DEFAULT_MAX_ENTRIES = 32;
        public static final boolean DEFAULT_ISOLATE_UIDS = true;
        public static final boolean DEFAULT_CACHE_NULLS = false;
        public Args(android.app.PropertyInvalidatedCache.Namespace mNamespace, java.lang.String mApi, int mMaxEntries, boolean mIsolateUids, boolean mTestMode, boolean mCacheNulls) { this.mNamespace = mNamespace; this.mApi = mApi; this.mMaxEntries = mMaxEntries; this.mIsolateUids = mIsolateUids; this.mTestMode = mTestMode; this.mCacheNulls = mCacheNulls; }
        public Args(android.app.PropertyInvalidatedCache.Namespace p0) { this((android.app.PropertyInvalidatedCache.Namespace)null, (java.lang.String)null, 0, false, false, false); }
        public Args(java.lang.String p0) { this((android.app.PropertyInvalidatedCache.Namespace)null, (java.lang.String)null, 0, false, false, false); }
        public android.app.PropertyInvalidatedCache.Args api(java.lang.String p0) { return null; }
        public android.app.PropertyInvalidatedCache.Args maxEntries(int p0) { return null; }
        public android.app.PropertyInvalidatedCache.Args isolateUids(boolean p0) { return null; }
        public android.app.PropertyInvalidatedCache.Args testMode(boolean p0) { return null; }
        public android.app.PropertyInvalidatedCache.Args cacheNulls(boolean p0) { return null; }
        public final java.lang.String toString() { return null; }
        public final int hashCode() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        @android.annotation.NonNull
        public android.app.PropertyInvalidatedCache.Namespace mNamespace() { return null; }
        @android.annotation.Nullable
        public java.lang.String mApi() { return null; }
        public int mMaxEntries() { return 0; }
        public boolean mIsolateUids() { return false; }
        public boolean mTestMode() { return false; }
        public boolean mCacheNulls() { return false; }
    }

    public static final class AutoCorker {
        public static final int DEFAULT_AUTO_CORK_DELAY_MS = 50;
        public AutoCorker(java.lang.String p0) {}
        public AutoCorker(java.lang.String p0, int p1) {}
        public void autoCork() {}
    }

    private static final record CacheKey(android.app.PropertyInvalidatedCache.Namespace namespace, java.lang.String key) {
        public CacheKey(android.app.PropertyInvalidatedCache.Namespace namespace, java.lang.String key) { this.namespace = namespace; this.key = key; }
        @android.annotation.NonNull
        public java.lang.String toString() { return null; }
        public int compareTo(android.app.PropertyInvalidatedCache.CacheKey p0) { return 0; }
        public final int hashCode() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        @android.annotation.NonNull
        public android.app.PropertyInvalidatedCache.Namespace namespace() { return null; }
        @android.annotation.NonNull
        public java.lang.String key() { return null; }
    }

    private class CacheMap<Query extends java.lang.Object, Result extends java.lang.Object> {
        CacheMap(android.app.PropertyInvalidatedCache p0, boolean p1, boolean p2) {}
        Result get(Query p0) { return null; }
        boolean containsKey(Query p0) { return false; }
        void remove(Query p0) {}
        void put(Query p0, Result p1) {}
        int size() { return 0; }
        void clear() {}
        void dump(java.io.PrintWriter p0) {}
        void dumpDetailed(java.io.PrintWriter p0) {}
    }

    private static class DefaultComputer<Query extends java.lang.Object, Result extends java.lang.Object> extends android.app.PropertyInvalidatedCache.QueryHandler<Query, Result> {
        final android.app.PropertyInvalidatedCache<Query, Result> mCache = null;
        DefaultComputer(android.app.PropertyInvalidatedCache<Query, Result> p0) { super(); }
        public Result apply(Query p0) { return null; }
    }

    private static final record Namespace(java.lang.String mName) {
        public final java.lang.String toString() { return null; }
        public final int hashCode() { return 0; }
        public final boolean equals(java.lang.Object p0) { return false; }
        @android.annotation.NonNull
        public java.lang.String mName() { return null; }
    }

    private static final class NoPreloadHolder {
        public static long next() { return 0L; }
    }

    private static abstract class NonceHandler {
        final android.app.PropertyInvalidatedCache.CacheKey mId = null;
        protected final java.lang.Object mLock = null;
        protected long mShadowNonce;
        abstract long getNonceInternal();
        abstract void setNonceInternal(long p0);
        NonceHandler(android.app.PropertyInvalidatedCache.CacheKey p0) {}
        long getNonce() { return 0L; }
        void setNonce(long p0) {}
        void registerWatcher(java.util.concurrent.Semaphore p0) {}
        void unregisterWatcher(java.util.concurrent.Semaphore p0) {}
        void invalidate() {}
        void cork() {}
        void uncork() {}
        void disable() {}
        @android.annotation.NonNull
        java.lang.String getName() { return null; }
        void setTestMode(boolean p0) {}
        boolean isActive() { return false; }
        android.app.PropertyInvalidatedCache.NonceHandler.Stats getStats() { return null; }

        static final record Stats(int invalidated, int corkedInvalidates) {
            Stats(int invalidated, int corkedInvalidates) { this.invalidated = invalidated; this.corkedInvalidates = corkedInvalidates; }
            public final java.lang.String toString() { return null; }
            public final int hashCode() { return 0; }
            public final boolean equals(java.lang.Object p0) { return false; }
            public int invalidated() { return 0; }
            public int corkedInvalidates() { return 0; }
        }
    }

    private static class NonceLocal extends android.app.PropertyInvalidatedCache.NonceHandler {
        NonceLocal(android.app.PropertyInvalidatedCache.CacheKey p0) { super(null); }
        long getNonceInternal() { return 0L; }
        void setNonceInternal(long p0) {}
    }

    private static final class NonceSharedMem extends android.app.PropertyInvalidatedCache.NonceHandler {
        NonceSharedMem(android.app.PropertyInvalidatedCache.CacheKey p0) { super(null); }
        long getNonceInternal() { return 0L; }
        void setNonceInternal(long p0) {}
    }

    public static class NonceStore {
        public final int mMaxNonce = 0;
        public final int mMaxByte = 0;
        public static final int INVALID_NONCE_INDEX = -1;
        public NonceStore(long p0, boolean p1) {}
        static android.app.PropertyInvalidatedCache.NonceStore getInstance() { return null; }
        public int storeName(java.lang.String p0) { return 0; }
        public int getHandleForName(java.lang.String p0) { return 0; }
        public boolean setNonce(int p0, long p1) { return false; }
        public long getNonce(int p0) { return 0L; }
        public void dump(java.io.PrintWriter p0, java.lang.String p1, boolean p2) {}
    }

    private static final class NonceSysprop extends android.app.PropertyInvalidatedCache.NonceHandler {
        NonceSysprop(android.app.PropertyInvalidatedCache.CacheKey p0) { super(null); }
        long getNonceInternal() { return 0L; }
        void setNonceInternal(long p0) {}
    }

    public static class NonceWatcher implements java.lang.AutoCloseable {
        public void close() {}
        public long lastSeen() { return 0L; }
        public boolean isChanged() { return false; }
        public int waitForChange() throws java.lang.InterruptedException { return 0; }
        public int waitForChange(long p0, java.util.concurrent.TimeUnit p1) throws java.lang.InterruptedException { return 0; }
        public void wakeUp() {}
    }

    public static abstract class QueryHandler<Q extends java.lang.Object, R extends java.lang.Object> {
        public QueryHandler() {}
        @android.annotation.Nullable
        public abstract R apply(Q p0);
        public boolean shouldBypassCache(Q p0) { return false; }
    }
}
