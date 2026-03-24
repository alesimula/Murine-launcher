package android.hardware.camera2.marshal.impl;

public class MarshalQueryableEnum<T extends java.lang.Enum<T>> implements android.hardware.camera2.marshal.MarshalQueryable<T> {
    private static final java.lang.String TAG = null;
    private static final boolean DEBUG = false;
    private static final int UINT8_MIN = 0;
    private static final int UINT8_MAX = 255;
    private static final int UINT8_MASK = 255;
    private static final java.util.HashMap<java.lang.Class<? extends java.lang.Enum>, int[]> sEnumValues = null;
    public MarshalQueryableEnum() {}
    public android.hardware.camera2.marshal.Marshaler<T> createMarshaler(android.hardware.camera2.utils.TypeReference<T> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<T> p0, int p1) { return false; }
    public static <T extends java.lang.Enum<T>> void registerEnumValues(java.lang.Class<T> p0, int[] p1) {}
    private static <T extends java.lang.Enum<T>> int getEnumValue(T p0) { return 0; }
    private static <T extends java.lang.Enum<T>> T getEnumFromValue(java.lang.Class<T> p0, int p1) { return null; }

    private class MarshalerEnum extends android.hardware.camera2.marshal.Marshaler<T> {
        private final java.lang.Class<T> mClass = null;
        protected MarshalerEnum(android.hardware.camera2.utils.TypeReference<T> p0, int p1) { super(null, null, 0); }
        public void marshal(T p0, java.nio.ByteBuffer p1) {}
        public T unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
    }
}
