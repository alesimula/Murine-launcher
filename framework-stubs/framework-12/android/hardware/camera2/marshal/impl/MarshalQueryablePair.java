package android.hardware.camera2.marshal.impl;

public class MarshalQueryablePair<T1 extends java.lang.Object, T2 extends java.lang.Object> implements android.hardware.camera2.marshal.MarshalQueryable<android.util.Pair<T1, T2>> {
    public MarshalQueryablePair() {}
    public android.hardware.camera2.marshal.Marshaler<android.util.Pair<T1, T2>> createMarshaler(android.hardware.camera2.utils.TypeReference<android.util.Pair<T1, T2>> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<android.util.Pair<T1, T2>> p0, int p1) { return false; }

    private class MarshalerPair extends android.hardware.camera2.marshal.Marshaler<android.util.Pair<T1, T2>> {
        private final java.lang.Class<? super android.util.Pair<T1, T2>> mClass = null;
        private final java.lang.reflect.Constructor<android.util.Pair<T1, T2>> mConstructor = null;
        private final android.hardware.camera2.marshal.Marshaler<T1> mNestedTypeMarshalerFirst = null;
        private final android.hardware.camera2.marshal.Marshaler<T2> mNestedTypeMarshalerSecond = null;
        protected MarshalerPair(android.hardware.camera2.utils.TypeReference<android.util.Pair<T1, T2>> p0, int p1) { super(null, null, 0); }
        public void marshal(android.util.Pair<T1, T2> p0, java.nio.ByteBuffer p1) {}
        public android.util.Pair<T1, T2> unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
        public int calculateMarshalSize(android.util.Pair<T1, T2> p0) { return 0; }
    }
}
