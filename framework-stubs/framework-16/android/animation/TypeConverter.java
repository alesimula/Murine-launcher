package android.animation;

public abstract class TypeConverter<T extends java.lang.Object, V extends java.lang.Object> {
    public TypeConverter(java.lang.Class<T> p0, java.lang.Class<V> p1) {}
    java.lang.Class<V> getTargetType() { return null; }
    java.lang.Class<T> getSourceType() { return null; }
    public abstract V convert(T p0);
}
