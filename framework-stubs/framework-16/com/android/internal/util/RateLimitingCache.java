package com.android.internal.util;

public class RateLimitingCache<Value extends java.lang.Object> {
    public RateLimitingCache(long p0) {}
    public RateLimitingCache(long p0, int p1) {}
    protected long getTime() { return 0L; }
    public Value get(com.android.internal.util.RateLimitingCache.ValueFetcher<Value> p0) { return null; }

    class CachedValue {
        long timestamp;
        java.util.concurrent.atomic.AtomicInteger count;
        CachedValue(com.android.internal.util.RateLimitingCache p0) {}
    }

    public static interface ValueFetcher<V extends java.lang.Object> {
        public V fetchValue();
    }
}
