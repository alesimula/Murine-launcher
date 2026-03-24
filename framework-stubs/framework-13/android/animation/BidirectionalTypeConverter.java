package android.animation;

public abstract class BidirectionalTypeConverter<T extends java.lang.Object, V extends java.lang.Object> extends android.animation.TypeConverter<T, V> {
    public BidirectionalTypeConverter(java.lang.Class<T> p0, java.lang.Class<V> p1) { super(null, null); }
    public abstract T convertBack(V p0);
    public android.animation.BidirectionalTypeConverter<V, T> invert() { return null; }

    private static class InvertedConverter<From extends java.lang.Object, To extends java.lang.Object> extends android.animation.BidirectionalTypeConverter<From, To> {
        public InvertedConverter(android.animation.BidirectionalTypeConverter<To, From> p0) { super(null, null); }
        public From convertBack(To p0) { return null; }
        public To convert(From p0) { return null; }
    }
}
