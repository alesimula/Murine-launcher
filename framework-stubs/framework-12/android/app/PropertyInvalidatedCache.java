package android.app;

public abstract class PropertyInvalidatedCache<Query extends java.lang.Object, Result extends java.lang.Object> {
    private static final int NONCE_UNSET = 0;
    private static final int NONCE_DISABLED = 1;
    private static final int NONCE_CORKED = 2;
    private static final int NONCE_RESERVED = 3;
    private static final java.lang.String[] sNonceName = null;
    private static final java.lang.String TAG = "PropertyInvalidatedCache";
    private static final boolean DEBUG = false;
    private static final boolean VERIFY = false;
    private static final boolean DETAILED = false;
    private long mHits;
    private long mMisses;
    private long[] mSkips;
    private long mMissOverflow;
    private long mHighWaterMark;
    private long mClears;
    private static final java.util.HashMap<java.lang.String, java.lang.Long> sInvalidates = null;
    private static final java.util.HashMap<java.lang.String, java.lang.Long> sCorkedInvalidates = null;
    private static boolean sEnabled;
    private static final java.lang.Object sCorkLock = null;
    private static final java.util.HashMap<java.lang.String, java.lang.Integer> sCorks = null;
    private static final java.util.HashSet<java.lang.String> sDisabledKeys = null;
    private static final java.util.WeakHashMap<android.app.PropertyInvalidatedCache, java.lang.Void> sCaches = null;
    private final java.lang.Object mLock = null;
    private final java.lang.String mPropertyName = null;
    private volatile android.os.SystemProperties.Handle mPropertyHandle;
    private final java.lang.String mCacheName = null;
    private final java.util.LinkedHashMap<Query, Result> mCache = null;
    private long mLastSeenNonce;
    private boolean mDisabled;
    private final int mMaxEntries = 0;
    public PropertyInvalidatedCache(int p0, java.lang.String p1) {}
    public PropertyInvalidatedCache(int p0, java.lang.String p1, java.lang.String p2) {}
    public final void clear() {}
    protected abstract Result recompute(Query p0);
    protected boolean bypass(Query p0) { return false; }
    protected boolean debugCompareQueryResults(Result p0, Result p1) { return false; }
    protected Result refresh(Result p0, Query p1) { return null; }
    private long getCurrentNonce() { return 0L; }
    public final void disableInstance() {}
    public static final void disableLocal(java.lang.String p0) {}
    public final void disableLocal() {}
    public final boolean isDisabledLocal() { return false; }
    public Result query(Query p0) { return null; }
    public final void disableSystemWide() {}
    public static void disableSystemWide(java.lang.String p0) {}
    public final void invalidateCache() {}
    public static void invalidateCache(java.lang.String p0) {}
    private static void invalidateCacheLocked(java.lang.String p0) {}
    public static void corkInvalidations(java.lang.String p0) {}
    public static void uncorkInvalidations(java.lang.String p0) {}
    protected Result maybeCheckConsistency(Query p0, Result p1) { return null; }
    public java.lang.String cacheName() { return null; }
    public java.lang.String queryToString(Query p0) { return null; }
    public static void disableForTestMode() {}
    public boolean getDisabledState() { return false; }
    public static java.util.ArrayList<android.app.PropertyInvalidatedCache> getActiveCaches() { return null; }
    public static java.util.ArrayList<java.util.Map.Entry<java.lang.String, java.lang.Integer>> getActiveCorks() { return null; }
    private void dumpContents(java.io.PrintWriter p0, java.lang.String[] p1) {}
    public static void dumpCacheInfo(java.io.FileDescriptor p0, java.lang.String[] p1) {}

    public static final class AutoCorker {
        public static final int DEFAULT_AUTO_CORK_DELAY_MS = 50;
        private final java.lang.String mPropertyName = null;
        private final int mAutoCorkDelayMs = 0;
        private final java.lang.Object mLock = null;
        private long mUncorkDeadlineMs;
        private android.os.Handler mHandler;
        public AutoCorker(java.lang.String p0) {}
        public AutoCorker(java.lang.String p0, int p1) {}
        public void autoCork() {}
        private void handleMessage(android.os.Message p0) {}
        private android.os.Handler getHandlerLocked() { return null; }
    }

    private static final class NoPreloadHolder {
        private static final java.util.concurrent.atomic.AtomicLong sNextNonce = null;
        private NoPreloadHolder() {}
        public static long next() { return 0L; }
    }
}
