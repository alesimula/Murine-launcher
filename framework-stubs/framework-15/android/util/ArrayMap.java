package android.util;

public final class ArrayMap<K extends java.lang.Object, V extends java.lang.Object> implements java.util.Map<K, V> {
    static final int[] EMPTY_IMMUTABLE_INTS = null;
    public static final android.util.ArrayMap EMPTY = null;
    static java.lang.Object[] mBaseCache;
    static int mBaseCacheSize;
    static java.lang.Object[] mTwiceBaseCache;
    static int mTwiceBaseCacheSize;
    int[] mHashes;
    java.lang.Object[] mArray;
    int mSize;
    int indexOf(java.lang.Object p0, int p1) { return 0; }
    int indexOfNull() { return 0; }
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
    public void append(K p0, V p1) {}
    public void validate() {}
    public void putAll(android.util.ArrayMap<? extends K, ? extends V> p0) {}
    public V remove(java.lang.Object p0) { return null; }
    public V removeAt(int p0) { return null; }
    public int size() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean containsAll(java.util.Collection<?> p0) { return false; }
    public void forEach(java.util.function.BiConsumer<? super K, ? super V> p0) {}
    public void putAll(java.util.Map<? extends K, ? extends V> p0) {}
    public boolean removeAll(java.util.Collection<?> p0) { return false; }
    public void replaceAll(java.util.function.BiFunction<? super K, ? super V, ? extends V> p0) {}
    public boolean retainAll(java.util.Collection<?> p0) { return false; }
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() { return null; }
    public java.util.Set<K> keySet() { return null; }
    public java.util.Collection<V> values() { return null; }
}
