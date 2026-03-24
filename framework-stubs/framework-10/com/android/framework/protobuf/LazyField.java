package com.android.framework.protobuf;

public class LazyField extends com.android.framework.protobuf.LazyFieldLite {
    private final com.android.framework.protobuf.MessageLite defaultInstance = null;
    public LazyField(com.android.framework.protobuf.MessageLite p0, com.android.framework.protobuf.ExtensionRegistryLite p1, com.android.framework.protobuf.ByteString p2) { super(); }
    public boolean containsDefaultInstance() { return false; }
    public com.android.framework.protobuf.MessageLite getValue() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }

    static class LazyIterator<K extends java.lang.Object> implements java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> {
        private java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> iterator;
        public LazyIterator(java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> p0) {}
        public boolean hasNext() { return false; }
        public java.util.Map.Entry<K, java.lang.Object> next() { return null; }
        public void remove() {}
    }

    static class LazyEntry<K extends java.lang.Object> implements java.util.Map.Entry<K, java.lang.Object> {
        private java.util.Map.Entry<K, com.android.framework.protobuf.LazyField> entry;
        private LazyEntry(java.util.Map.Entry<K, com.android.framework.protobuf.LazyField> p0) {}
        public K getKey() { return null; }
        public java.lang.Object getValue() { return null; }
        public com.android.framework.protobuf.LazyField getField() { return null; }
        public java.lang.Object setValue(java.lang.Object p0) { return null; }
    }
}
