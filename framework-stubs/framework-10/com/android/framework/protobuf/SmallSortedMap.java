package com.android.framework.protobuf;

class SmallSortedMap<K extends java.lang.Comparable<K>, V extends java.lang.Object> extends java.util.AbstractMap<K, V> {
    private final int maxArraySize = 0;
    private java.util.List<com.android.framework.protobuf.SmallSortedMap<K, V>.Entry> entryList;
    private java.util.Map<K, V> overflowEntries;
    private boolean isImmutable;
    private volatile com.android.framework.protobuf.SmallSortedMap<K, V>.EntrySet lazyEntrySet;
    static <FieldDescriptorType extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<FieldDescriptorType>> com.android.framework.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object> newFieldMap(int p0) { return null; }
    static <K extends java.lang.Comparable<K>, V extends java.lang.Object> com.android.framework.protobuf.SmallSortedMap<K, V> newInstanceForTest(int p0) { return null; }
    private SmallSortedMap(int p0) { super(); }
    public void makeImmutable() {}
    public boolean isImmutable() { return false; }
    public int getNumArrayEntries() { return 0; }
    public java.util.Map.Entry<K, V> getArrayEntryAt(int p0) { return null; }
    public int getNumOverflowEntries() { return 0; }
    public java.lang.Iterable<java.util.Map.Entry<K, V>> getOverflowEntries() { return null; }
    public int size() { return 0; }
    public boolean containsKey(java.lang.Object p0) { return false; }
    public V get(java.lang.Object p0) { return null; }
    public V put(K p0, V p1) { return null; }
    public void clear() {}
    public V remove(java.lang.Object p0) { return null; }
    private V removeArrayEntryAt(int p0) { return null; }
    private int binarySearchInArray(K p0) { return 0; }
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() { return null; }
    private void checkMutable() {}
    private java.util.SortedMap<K, V> getOverflowEntriesMutable() { return null; }
    private void ensureEntryArrayMutable() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    private class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        private EntrySet(com.android.framework.protobuf.SmallSortedMap p0) { super(); }
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() { return null; }
        public int size() { return 0; }
        public boolean contains(java.lang.Object p0) { return false; }
        public boolean add(java.util.Map.Entry<K, V> p0) { return false; }
        public boolean remove(java.lang.Object p0) { return false; }
        public void clear() {}
    }

    private class EntryIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private int pos;
        private boolean nextCalledBeforeRemove;
        private java.util.Iterator<java.util.Map.Entry<K, V>> lazyOverflowIterator;
        private EntryIterator(com.android.framework.protobuf.SmallSortedMap p0) {}
        public boolean hasNext() { return false; }
        public java.util.Map.Entry<K, V> next() { return null; }
        public void remove() {}
        private java.util.Iterator<java.util.Map.Entry<K, V>> getOverflowIterator() { return null; }
    }

    private class Entry implements java.util.Map.Entry<K, V>, java.lang.Comparable<com.android.framework.protobuf.SmallSortedMap<K, V>.Entry> {
        private final K key = null;
        private V value;
        Entry(java.util.Map.Entry<K, V> p0) {}
        Entry(K p0, V p1) {}
        public K getKey() { return null; }
        public V getValue() { return null; }
        public int compareTo(com.android.framework.protobuf.SmallSortedMap<K, V>.Entry p0) { return 0; }
        public V setValue(V p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        private boolean equals(java.lang.Object p0, java.lang.Object p1) { return false; }
    }

    private static class EmptySet {
        private static final java.util.Iterator<java.lang.Object> ITERATOR = null;
        private static final java.lang.Iterable<java.lang.Object> ITERABLE = null;
        private EmptySet() {}
        static <T extends java.lang.Object> java.lang.Iterable<T> iterable() { return null; }
    }
}
