package android.util;

public final class ArrayMap<K extends java.lang.Object, V extends java.lang.Object> implements java.util.Map<K, V> {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "ArrayMap";
    private static final boolean CONCURRENT_MODIFICATION_EXCEPTIONS = true;
    private static final int BASE_SIZE = 4;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private static final int CACHE_SIZE = 10;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    static final int[] EMPTY_IMMUTABLE_INTS = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public static final android.util.ArrayMap EMPTY = null;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    static java.lang.Object[] mBaseCache;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    static int mBaseCacheSize;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    static java.lang.Object[] mTwiceBaseCache;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    static int mTwiceBaseCacheSize;
    final boolean mIdentityHashCode = false;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    int[] mHashes;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    java.lang.Object[] mArray;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    int mSize;
    android.util.MapCollections<K, V> mCollections;
    private static int binarySearchHashes(int[] p0, int p1, int p2) { return 0; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    int indexOf(java.lang.Object p0, int p1) { return 0; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    int indexOfNull() { return 0; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private void allocArrays(int p0) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private static void freeArrays(int[] p0, java.lang.Object[] p1, int p2) {}
    public ArrayMap() {}
    public ArrayMap(int p0) {}
    public ArrayMap(int p0, boolean p1) {}
    public ArrayMap(android.util.ArrayMap<K, V> p0) {}
    public void clear() {}
    public void erase() {}
    public void ensureCapacity(int p0) {}
    public boolean containsKey(java.lang.Object p0) { return false; }
    public int indexOfKey(java.lang.Object p0) { return 0; }
    public int indexOfValue(java.lang.Object p0) { return 0; }
    public boolean containsValue(java.lang.Object p0) { return false; }
    public V get(java.lang.Object p0) { return null; }
    public K keyAt(int p0) { return null; }
    public V valueAt(int p0) { return null; }
    public V setValueAt(int p0, V p1) { return null; }
    public boolean isEmpty() { return false; }
    public V put(K p0, V p1) { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public void append(K p0, V p1) {}
    public void validate() {}
    public void putAll(android.util.ArrayMap<? extends K, ? extends V> p0) {}
    public V remove(java.lang.Object p0) { return null; }
    public V removeAt(int p0) { return null; }
    public int size() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    private android.util.MapCollections<K, V> getCollection() { return null; }
    public boolean containsAll(java.util.Collection<?> p0) { return false; }
    public void putAll(java.util.Map<? extends K, ? extends V> p0) {}
    public boolean removeAll(java.util.Collection<?> p0) { return false; }
    public boolean retainAll(java.util.Collection<?> p0) { return false; }
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() { return null; }
    public java.util.Set<K> keySet() { return null; }
    public java.util.Collection<V> values() { return null; }
}
