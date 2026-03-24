package com.android.framework.protobuf;

public final class Internal {
    static final java.nio.charset.Charset UTF_8 = null;
    static final java.nio.charset.Charset ISO_8859_1 = null;
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final byte[] EMPTY_BYTE_ARRAY = null;
    public static final java.nio.ByteBuffer EMPTY_BYTE_BUFFER = null;
    public static final com.android.framework.protobuf.CodedInputStream EMPTY_CODED_INPUT_STREAM = null;
    private Internal() {}
    public static java.lang.String stringDefaultValue(java.lang.String p0) { return null; }
    public static com.android.framework.protobuf.ByteString bytesDefaultValue(java.lang.String p0) { return null; }
    public static byte[] byteArrayDefaultValue(java.lang.String p0) { return null; }
    public static java.nio.ByteBuffer byteBufferDefaultValue(java.lang.String p0) { return null; }
    public static java.nio.ByteBuffer copyByteBuffer(java.nio.ByteBuffer p0) { return null; }
    public static boolean isValidUtf8(com.android.framework.protobuf.ByteString p0) { return false; }
    public static boolean isValidUtf8(byte[] p0) { return false; }
    public static byte[] toByteArray(java.lang.String p0) { return null; }
    public static java.lang.String toStringUtf8(byte[] p0) { return null; }
    public static int hashLong(long p0) { return 0; }
    public static int hashBoolean(boolean p0) { return 0; }
    public static int hashEnum(com.android.framework.protobuf.Internal.EnumLite p0) { return 0; }
    public static int hashEnumList(java.util.List<? extends com.android.framework.protobuf.Internal.EnumLite> p0) { return 0; }
    public static boolean equals(java.util.List<byte[]> p0, java.util.List<byte[]> p1) { return false; }
    public static int hashCode(java.util.List<byte[]> p0) { return 0; }
    public static int hashCode(byte[] p0) { return 0; }
    static int hashCode(byte[] p0, int p1, int p2) { return 0; }
    static int partialHash(int p0, byte[] p1, int p2, int p3) { return 0; }
    public static boolean equalsByteBuffer(java.nio.ByteBuffer p0, java.nio.ByteBuffer p1) { return false; }
    public static boolean equalsByteBuffer(java.util.List<java.nio.ByteBuffer> p0, java.util.List<java.nio.ByteBuffer> p1) { return false; }
    public static int hashCodeByteBuffer(java.util.List<java.nio.ByteBuffer> p0) { return 0; }
    public static int hashCodeByteBuffer(java.nio.ByteBuffer p0) { return 0; }
    public static <T extends com.android.framework.protobuf.MessageLite> T getDefaultInstance(java.lang.Class<T> p0) { return null; }

    public static interface ProtobufList<E extends java.lang.Object> extends java.util.List<E>, java.util.RandomAccess {
        public void makeImmutable();
        public boolean isModifiable();
        public com.android.framework.protobuf.Internal.ProtobufList<E> mutableCopyWithCapacity(int p0);
    }

    public static class MapAdapter<K extends java.lang.Object, V extends java.lang.Object, RealValue extends java.lang.Object> extends java.util.AbstractMap<K, V> {
        private final java.util.Map<K, RealValue> realMap = null;
        private final com.android.framework.protobuf.Internal.MapAdapter.Converter<RealValue, V> valueConverter = null;
        public static <T extends com.android.framework.protobuf.Internal.EnumLite> com.android.framework.protobuf.Internal.MapAdapter.Converter<java.lang.Integer, T> newEnumConverter(com.android.framework.protobuf.Internal.EnumLiteMap<T> p0, T p1) { return null; }
        public MapAdapter(java.util.Map<K, RealValue> p0, com.android.framework.protobuf.Internal.MapAdapter.Converter<RealValue, V> p1) { super(); }
        public V get(java.lang.Object p0) { return null; }
        public V put(K p0, V p1) { return null; }
        public java.util.Set<java.util.Map.Entry<K, V>> entrySet() { return null; }

        private class SetAdapter extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
            private final java.util.Set<java.util.Map.Entry<K, RealValue>> realSet = null;
            public SetAdapter(java.util.Set<java.util.Map.Entry<K, RealValue>> p0) { super(); }
            public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() { return null; }
            public int size() { return 0; }
        }

        private class IteratorAdapter implements java.util.Iterator<java.util.Map.Entry<K, V>> {
            private final java.util.Iterator<java.util.Map.Entry<K, RealValue>> realIterator = null;
            public IteratorAdapter(java.util.Iterator<java.util.Map.Entry<K, RealValue>> p0) {}
            public boolean hasNext() { return false; }
            public java.util.Map.Entry<K, V> next() { return null; }
            public void remove() {}
        }

        private class EntryAdapter implements java.util.Map.Entry<K, V> {
            private final java.util.Map.Entry<K, RealValue> realEntry = null;
            public EntryAdapter(java.util.Map.Entry<K, RealValue> p0) {}
            public K getKey() { return null; }
            public V getValue() { return null; }
            public V setValue(V p0) { return null; }
        }

        public static interface Converter<A extends java.lang.Object, B extends java.lang.Object> {
            public B doForward(A p0);
            public A doBackward(B p0);
        }
    }

    public static interface LongList extends com.android.framework.protobuf.Internal.ProtobufList<java.lang.Long> {
        public long getLong(int p0);
        public void addLong(long p0);
        public long setLong(int p0, long p1);
        public com.android.framework.protobuf.Internal.LongList mutableCopyWithCapacity(int p0);
    }

    public static class ListAdapter<F extends java.lang.Object, T extends java.lang.Object> extends java.util.AbstractList<T> {
        private final java.util.List<F> fromList = null;
        private final com.android.framework.protobuf.Internal.ListAdapter.Converter<F, T> converter = null;
        public ListAdapter(java.util.List<F> p0, com.android.framework.protobuf.Internal.ListAdapter.Converter<F, T> p1) { super(); }
        public T get(int p0) { return null; }
        public int size() { return 0; }

        public static interface Converter<F extends java.lang.Object, T extends java.lang.Object> {
            public T convert(F p0);
        }
    }

    public static interface IntList extends com.android.framework.protobuf.Internal.ProtobufList<java.lang.Integer> {
        public int getInt(int p0);
        public void addInt(int p0);
        public int setInt(int p0, int p1);
        public com.android.framework.protobuf.Internal.IntList mutableCopyWithCapacity(int p0);
    }

    public static interface FloatList extends com.android.framework.protobuf.Internal.ProtobufList<java.lang.Float> {
        public float getFloat(int p0);
        public void addFloat(float p0);
        public float setFloat(int p0, float p1);
        public com.android.framework.protobuf.Internal.FloatList mutableCopyWithCapacity(int p0);
    }

    public static interface EnumLiteMap<T extends com.android.framework.protobuf.Internal.EnumLite> {
        public T findValueByNumber(int p0);
    }

    public static interface EnumLite {
        public int getNumber();
    }

    public static interface DoubleList extends com.android.framework.protobuf.Internal.ProtobufList<java.lang.Double> {
        public double getDouble(int p0);
        public void addDouble(double p0);
        public double setDouble(int p0, double p1);
        public com.android.framework.protobuf.Internal.DoubleList mutableCopyWithCapacity(int p0);
    }

    public static interface BooleanList extends com.android.framework.protobuf.Internal.ProtobufList<java.lang.Boolean> {
        public boolean getBoolean(int p0);
        public void addBoolean(boolean p0);
        public boolean setBoolean(int p0, boolean p1);
        public com.android.framework.protobuf.Internal.BooleanList mutableCopyWithCapacity(int p0);
    }
}
