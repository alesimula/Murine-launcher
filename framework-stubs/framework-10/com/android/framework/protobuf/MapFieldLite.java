package com.android.framework.protobuf;

public final class MapFieldLite<K extends java.lang.Object, V extends java.lang.Object> implements com.android.framework.protobuf.MutabilityOracle {
    private com.android.framework.protobuf.MapFieldLite.MutatabilityAwareMap<K, V> mapData;
    private boolean isMutable;
    private static final com.android.framework.protobuf.MapFieldLite EMPTY_MAP_FIELD = null;
    private MapFieldLite(java.util.Map<K, V> p0) {}
    public static <K extends java.lang.Object, V extends java.lang.Object> com.android.framework.protobuf.MapFieldLite<K, V> emptyMapField() { return null; }
    public static <K extends java.lang.Object, V extends java.lang.Object> com.android.framework.protobuf.MapFieldLite<K, V> newMapField() { return null; }
    public java.util.Map<K, V> getMap() { return null; }
    public java.util.Map<K, V> getMutableMap() { return null; }
    public void mergeFrom(com.android.framework.protobuf.MapFieldLite<K, V> p0) {}
    public void clear() {}
    private static boolean equals(java.lang.Object p0, java.lang.Object p1) { return false; }
    static <K extends java.lang.Object, V extends java.lang.Object> boolean equals(java.util.Map<K, V> p0, java.util.Map<K, V> p1) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    private static int calculateHashCodeForObject(java.lang.Object p0) { return 0; }
    static <K extends java.lang.Object, V extends java.lang.Object> int calculateHashCodeForMap(java.util.Map<K, V> p0) { return 0; }
    public int hashCode() { return 0; }
    private static java.lang.Object copy(java.lang.Object p0) { return null; }
    static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> copy(java.util.Map<K, V> p0) { return null; }
    public com.android.framework.protobuf.MapFieldLite<K, V> copy() { return null; }
    public void makeImmutable() {}
    public boolean isMutable() { return false; }
    public void ensureMutable() {}

    private static class MutatabilityAwareSet<E extends java.lang.Object> implements java.util.Set<E> {
        private final com.android.framework.protobuf.MutabilityOracle mutabilityOracle = null;
        private final java.util.Set<E> delegate = null;
        MutatabilityAwareSet(com.android.framework.protobuf.MutabilityOracle p0, java.util.Set<E> p1) {}
        public int size() { return 0; }
        public boolean isEmpty() { return false; }
        public boolean contains(java.lang.Object p0) { return false; }
        public java.util.Iterator<E> iterator() { return null; }
        public java.lang.Object[] toArray() { return null; }
        public <T extends java.lang.Object> T[] toArray(T[] p0) { return null; }
        public boolean add(E p0) { return false; }
        public boolean remove(java.lang.Object p0) { return false; }
        public boolean containsAll(java.util.Collection<?> p0) { return false; }
        public boolean addAll(java.util.Collection<? extends E> p0) { return false; }
        public boolean retainAll(java.util.Collection<?> p0) { return false; }
        public boolean removeAll(java.util.Collection<?> p0) { return false; }
        public void clear() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    static class MutatabilityAwareMap<K extends java.lang.Object, V extends java.lang.Object> implements java.util.Map<K, V> {
        private final com.android.framework.protobuf.MutabilityOracle mutabilityOracle = null;
        private final java.util.Map<K, V> delegate = null;
        MutatabilityAwareMap(com.android.framework.protobuf.MutabilityOracle p0, java.util.Map<K, V> p1) {}
        public int size() { return 0; }
        public boolean isEmpty() { return false; }
        public boolean containsKey(java.lang.Object p0) { return false; }
        public boolean containsValue(java.lang.Object p0) { return false; }
        public V get(java.lang.Object p0) { return null; }
        public V put(K p0, V p1) { return null; }
        public V remove(java.lang.Object p0) { return null; }
        public void putAll(java.util.Map<? extends K, ? extends V> p0) {}
        public void clear() {}
        public java.util.Set<K> keySet() { return null; }
        public java.util.Collection<V> values() { return null; }
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    private static class MutatabilityAwareIterator<E extends java.lang.Object> implements java.util.Iterator<E> {
        private final com.android.framework.protobuf.MutabilityOracle mutabilityOracle = null;
        private final java.util.Iterator<E> delegate = null;
        MutatabilityAwareIterator(com.android.framework.protobuf.MutabilityOracle p0, java.util.Iterator<E> p1) {}
        public boolean hasNext() { return false; }
        public E next() { return null; }
        public void remove() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    private static class MutatabilityAwareCollection<E extends java.lang.Object> implements java.util.Collection<E> {
        private final com.android.framework.protobuf.MutabilityOracle mutabilityOracle = null;
        private final java.util.Collection<E> delegate = null;
        MutatabilityAwareCollection(com.android.framework.protobuf.MutabilityOracle p0, java.util.Collection<E> p1) {}
        public int size() { return 0; }
        public boolean isEmpty() { return false; }
        public boolean contains(java.lang.Object p0) { return false; }
        public java.util.Iterator<E> iterator() { return null; }
        public java.lang.Object[] toArray() { return null; }
        public <T extends java.lang.Object> T[] toArray(T[] p0) { return null; }
        public boolean add(E p0) { return false; }
        public boolean remove(java.lang.Object p0) { return false; }
        public boolean containsAll(java.util.Collection<?> p0) { return false; }
        public boolean addAll(java.util.Collection<? extends E> p0) { return false; }
        public boolean removeAll(java.util.Collection<?> p0) { return false; }
        public boolean retainAll(java.util.Collection<?> p0) { return false; }
        public void clear() {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
