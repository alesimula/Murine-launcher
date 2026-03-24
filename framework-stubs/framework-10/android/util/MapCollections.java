package android.util;

abstract class MapCollections<K extends java.lang.Object, V extends java.lang.Object> {
    android.util.MapCollections<K, V>.EntrySet mEntrySet;
    android.util.MapCollections<K, V>.KeySet mKeySet;
    android.util.MapCollections<K, V>.ValuesCollection mValues;
    MapCollections() {}
    public static <K extends java.lang.Object, V extends java.lang.Object> boolean containsAllHelper(java.util.Map<K, V> p0, java.util.Collection<?> p1) { return false; }
    public static <K extends java.lang.Object, V extends java.lang.Object> boolean removeAllHelper(java.util.Map<K, V> p0, java.util.Collection<?> p1) { return false; }
    public static <K extends java.lang.Object, V extends java.lang.Object> boolean retainAllHelper(java.util.Map<K, V> p0, java.util.Collection<?> p1) { return false; }
    public java.lang.Object[] toArrayHelper(int p0) { return null; }
    public <T extends java.lang.Object> T[] toArrayHelper(T[] p0, int p1) { return null; }
    public static <T extends java.lang.Object> boolean equalsSetHelper(java.util.Set<T> p0, java.lang.Object p1) { return false; }
    public java.util.Set<java.util.Map.Entry<K, V>> getEntrySet() { return null; }
    public java.util.Set<K> getKeySet() { return null; }
    public java.util.Collection<V> getValues() { return null; }
    protected abstract int colGetSize();
    protected abstract java.lang.Object colGetEntry(int p0, int p1);
    protected abstract int colIndexOfKey(java.lang.Object p0);
    protected abstract int colIndexOfValue(java.lang.Object p0);
    protected abstract java.util.Map<K, V> colGetMap();
    protected abstract void colPut(K p0, V p1);
    protected abstract V colSetValue(int p0, V p1);
    protected abstract void colRemoveAt(int p0);
    protected abstract void colClear();

    final class ValuesCollection implements java.util.Collection<V> {
        ValuesCollection(android.util.MapCollections p0) {}
        public boolean add(V p0) { return false; }
        public boolean addAll(java.util.Collection<? extends V> p0) { return false; }
        public void clear() {}
        public boolean contains(java.lang.Object p0) { return false; }
        public boolean containsAll(java.util.Collection<?> p0) { return false; }
        public boolean isEmpty() { return false; }
        public java.util.Iterator<V> iterator() { return null; }
        public boolean remove(java.lang.Object p0) { return false; }
        public boolean removeAll(java.util.Collection<?> p0) { return false; }
        public boolean retainAll(java.util.Collection<?> p0) { return false; }
        public int size() { return 0; }
        public java.lang.Object[] toArray() { return null; }
        public <T extends java.lang.Object> T[] toArray(T[] p0) { return null; }
    }

    final class MapIterator implements java.util.Iterator<java.util.Map.Entry<K, V>>, java.util.Map.Entry<K, V> {
        int mEnd;
        int mIndex;
        boolean mEntryValid;
        MapIterator(android.util.MapCollections p0) {}
        public boolean hasNext() { return false; }
        public java.util.Map.Entry<K, V> next() { return null; }
        public void remove() {}
        public K getKey() { return null; }
        public V getValue() { return null; }
        public V setValue(V p0) { return null; }
        public final boolean equals(java.lang.Object p0) { return false; }
        public final int hashCode() { return 0; }
        public final java.lang.String toString() { return null; }
    }

    final class KeySet implements java.util.Set<K> {
        KeySet(android.util.MapCollections p0) {}
        public boolean add(K p0) { return false; }
        public boolean addAll(java.util.Collection<? extends K> p0) { return false; }
        public void clear() {}
        public boolean contains(java.lang.Object p0) { return false; }
        public boolean containsAll(java.util.Collection<?> p0) { return false; }
        public boolean isEmpty() { return false; }
        public java.util.Iterator<K> iterator() { return null; }
        public boolean remove(java.lang.Object p0) { return false; }
        public boolean removeAll(java.util.Collection<?> p0) { return false; }
        public boolean retainAll(java.util.Collection<?> p0) { return false; }
        public int size() { return 0; }
        public java.lang.Object[] toArray() { return null; }
        public <T extends java.lang.Object> T[] toArray(T[] p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    final class EntrySet implements java.util.Set<java.util.Map.Entry<K, V>> {
        EntrySet(android.util.MapCollections p0) {}
        public boolean add(java.util.Map.Entry<K, V> p0) { return false; }
        public boolean addAll(java.util.Collection<? extends java.util.Map.Entry<K, V>> p0) { return false; }
        public void clear() {}
        public boolean contains(java.lang.Object p0) { return false; }
        public boolean containsAll(java.util.Collection<?> p0) { return false; }
        public boolean isEmpty() { return false; }
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() { return null; }
        public boolean remove(java.lang.Object p0) { return false; }
        public boolean removeAll(java.util.Collection<?> p0) { return false; }
        public boolean retainAll(java.util.Collection<?> p0) { return false; }
        public int size() { return 0; }
        public java.lang.Object[] toArray() { return null; }
        public <T extends java.lang.Object> T[] toArray(T[] p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    final class ArrayIterator<T extends java.lang.Object> implements java.util.Iterator<T> {
        final int mOffset = 0;
        int mSize;
        int mIndex;
        boolean mCanRemove;
        ArrayIterator(android.util.MapCollections p0, int p1) {}
        public boolean hasNext() { return false; }
        public T next() { return null; }
        public void remove() {}
    }
}
