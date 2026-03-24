package com.android.net.module.util;

public class LruCacheWithExpiry<K extends java.lang.Object, V extends java.lang.Object> {
    public LruCacheWithExpiry(java.util.function.LongSupplier p0, long p1, int p2, java.util.function.Predicate<V> p3) {}
    @android.annotation.Nullable
    public V get(K p0) { return null; }
    @android.annotation.Nullable
    public V getOrCompute(K p0, java.util.function.Supplier<V> p1) { return null; }
    public void put(K p0, V p1) {}
    @android.annotation.Nullable
    public V putIfAbsent(K p0, V p1) { return null; }
    public void clear() {}

    private static class CacheValue<V extends java.lang.Object> {
        public final long timestamp = 0L;
        @android.annotation.NonNull
        public final V entry = null;
        CacheValue(long p0, V p1) {}
    }
}
