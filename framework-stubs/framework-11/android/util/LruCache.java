package android.util;

public class LruCache<K extends java.lang.Object, V extends java.lang.Object> {
    private final java.util.LinkedHashMap<K, V> map = null;
    private int size;
    private int maxSize;
    private int putCount;
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private int missCount;
    public LruCache(int p0) {}
    public void resize(int p0) {}
    public final V get(K p0) { return null; }
    public final V put(K p0, V p1) { return null; }
    public void trimToSize(int p0) {}
    public final V remove(K p0) { return null; }
    protected void entryRemoved(boolean p0, K p1, V p2, V p3) {}
    protected V create(K p0) { return null; }
    private int safeSizeOf(K p0, V p1) { return 0; }
    protected int sizeOf(K p0, V p1) { return 0; }
    public final void evictAll() {}
    public final synchronized int size() { return 0; }
    public final synchronized int maxSize() { return 0; }
    public final synchronized int hitCount() { return 0; }
    public final synchronized int missCount() { return 0; }
    public final synchronized int createCount() { return 0; }
    public final synchronized int putCount() { return 0; }
    public final synchronized int evictionCount() { return 0; }
    public final synchronized java.util.Map<K, V> snapshot() { return null; }
    public final synchronized java.lang.String toString() { return null; }
}
