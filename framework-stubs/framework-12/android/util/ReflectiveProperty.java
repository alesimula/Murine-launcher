package android.util;

class ReflectiveProperty<T extends java.lang.Object, V extends java.lang.Object> extends android.util.Property<T, V> {
    private static final java.lang.String PREFIX_GET = "get";
    private static final java.lang.String PREFIX_IS = "is";
    private static final java.lang.String PREFIX_SET = "set";
    private java.lang.reflect.Method mSetter;
    private java.lang.reflect.Method mGetter;
    private java.lang.reflect.Field mField;
    public ReflectiveProperty(java.lang.Class<T> p0, java.lang.Class<V> p1, java.lang.String p2) { super(null, null); }
    private boolean typesMatch(java.lang.Class<V> p0, java.lang.Class p1) { return false; }
    public void set(T p0, V p1) {}
    public V get(T p0) { return null; }
    public boolean isReadOnly() { return false; }
}
