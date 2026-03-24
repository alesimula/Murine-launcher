package com.android.framework.protobuf;

class SmallSortedMap<K extends java.lang.Comparable<K>, V extends java.lang.Object> extends java.util.AbstractMap<K, V> {
    static <FieldDescriptorType extends com.android.framework.protobuf.FieldSet.FieldDescriptorLite<FieldDescriptorType>> com.android.framework.protobuf.SmallSortedMap<FieldDescriptorType, java.lang.Object> newFieldMap(int p0) { return null; }
    static <K extends java.lang.Comparable<K>, V extends java.lang.Object> com.android.framework.protobuf.SmallSortedMap<K, V> newInstanceForTest(int p0) { return null; }
    public void makeImmutable() {}
    public boolean isImmutable() { return false; }
    public int getNumArrayEntries() { return 0; }
    public java.util.Map.Entry<K, V> getArrayEntryAt(int p0) { return null; }
    public int getNumOverflowEntries() { return 0; }
    public java.lang.Iterable<java.util.Map.Entry<K, V>> getOverflowEntries() { return null; }
    java.lang.Iterable<java.util.Map.Entry<K, V>> getOverflowEntriesDescending() { return null; }
    public int size() { return 0; }
    public boolean containsKey(java.lang.Object p0) { return false; }
    public V get(java.lang.Object p0) { return null; }
    public V put(K p0, V p1) { return null; }
    public void clear() {}
    public V remove(java.lang.Object p0) { return null; }
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() { return null; }
    java.util.Set<java.util.Map.Entry<K, V>> descendingEntrySet() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    private class DescendingEntryIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        public boolean hasNext() { return false; }
        public java.util.Map.Entry<K, V> next() { return null; }
        public void remove() {}
    }

    private class DescendingEntrySet extends com.android.framework.protobuf.SmallSortedMap<K, V>.EntrySet {
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() { return null; }
    }

    private static class EmptySet {
        static <T extends java.lang.Object> java.lang.Iterable<T> iterable() { return null; }
    }

    private class Entry implements java.util.Map.Entry<K, V>, java.lang.Comparable<com.android.framework.protobuf.SmallSortedMap<K, V>.Entry> {
        Entry(java.util.Map.Entry<K, V> p0) {}
        Entry(K p0, V p1) {}
        public K getKey() { return null; }
        public V getValue() { return null; }
        public int compareTo(com.android.framework.protobuf.SmallSortedMap<K, V>.Entry p0) { return 0; }
        public V setValue(V p0) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    private class EntryIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        public boolean hasNext() { return false; }
        public java.util.Map.Entry<K, V> next() { return null; }
        public void remove() {}
    }

    private class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() { return null; }
        public int size() { return 0; }
        public boolean contains(java.lang.Object p0) { return false; }
        public boolean add(java.util.Map.Entry<K, V> p0) { return false; }
        public boolean remove(java.lang.Object p0) { return false; }
        public void clear() {}
    }
}
