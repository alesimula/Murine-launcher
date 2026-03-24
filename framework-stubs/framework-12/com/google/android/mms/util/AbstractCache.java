package com.google.android.mms.util;

public abstract class AbstractCache<K extends java.lang.Object, V extends java.lang.Object> {
    private static final java.lang.String TAG = "AbstractCache";
    private static final boolean DEBUG = false;
    private static final boolean LOCAL_LOGV = false;
    private static final int MAX_CACHED_ITEMS = 500;
    private final java.util.HashMap<K, com.google.android.mms.util.AbstractCache.CacheEntry<V>> mCacheMap = null;
    protected AbstractCache() {}
    public boolean put(K p0, V p1) { return false; }
    public V get(K p0) { return null; }
    public V purge(K p0) { return null; }
    public void purgeAll() {}
    public int size() { return 0; }

    private static class CacheEntry<V extends java.lang.Object> {
        int hit;
        V value;
        private CacheEntry() {}
    }
}
