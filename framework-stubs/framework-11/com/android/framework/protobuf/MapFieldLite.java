package com.android.framework.protobuf;

public final class MapFieldLite<K extends java.lang.Object, V extends java.lang.Object> extends java.util.LinkedHashMap<K, V> {
    private boolean isMutable;
    private static final com.android.framework.protobuf.MapFieldLite EMPTY_MAP_FIELD = null;
    private MapFieldLite() { super(); }
    private MapFieldLite(java.util.Map<K, V> p0) { super(); }
    public static <K extends java.lang.Object, V extends java.lang.Object> com.android.framework.protobuf.MapFieldLite<K, V> emptyMapField() { return null; }
    public void mergeFrom(com.android.framework.protobuf.MapFieldLite<K, V> p0) {}
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() { return null; }
    public void clear() {}
    public V put(K p0, V p1) { return null; }
    public V put(java.util.Map.Entry<K, V> p0) { return null; }
    public void putAll(java.util.Map<? extends K, ? extends V> p0) {}
    public V remove(java.lang.Object p0) { return null; }
    private static void checkForNullKeysAndValues(java.util.Map<?, ?> p0) {}
    private static boolean equals(java.lang.Object p0, java.lang.Object p1) { return false; }
    static <K extends java.lang.Object, V extends java.lang.Object> boolean equals(java.util.Map<K, V> p0, java.util.Map<K, V> p1) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    private static int calculateHashCodeForObject(java.lang.Object p0) { return 0; }
    static <K extends java.lang.Object, V extends java.lang.Object> int calculateHashCodeForMap(java.util.Map<K, V> p0) { return 0; }
    public int hashCode() { return 0; }
    private static java.lang.Object copy(java.lang.Object p0) { return null; }
    static <K extends java.lang.Object, V extends java.lang.Object> java.util.Map<K, V> copy(java.util.Map<K, V> p0) { return null; }
    public com.android.framework.protobuf.MapFieldLite<K, V> mutableCopy() { return null; }
    public void makeImmutable() {}
    public boolean isMutable() { return false; }
    private void ensureMutable() {}
}
