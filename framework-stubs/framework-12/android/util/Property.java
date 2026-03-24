package android.util;

public abstract class Property<T extends java.lang.Object, V extends java.lang.Object> {
    private final java.lang.String mName = null;
    private final java.lang.Class<V> mType = null;
    public static <T extends java.lang.Object, V extends java.lang.Object> android.util.Property<T, V> of(java.lang.Class<T> p0, java.lang.Class<V> p1, java.lang.String p2) { return null; }
    public Property(java.lang.Class<V> p0, java.lang.String p1) {}
    public boolean isReadOnly() { return false; }
    public void set(T p0, V p1) {}
    public abstract V get(T p0);
    public java.lang.String getName() { return null; }
    public java.lang.Class<V> getType() { return null; }
}
