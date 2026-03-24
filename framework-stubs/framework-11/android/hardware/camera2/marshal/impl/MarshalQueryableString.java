package android.hardware.camera2.marshal.impl;

public class MarshalQueryableString implements android.hardware.camera2.marshal.MarshalQueryable<java.lang.String> {
    private static final java.lang.String TAG = null;
    private static final boolean DEBUG = false;
    private static final byte NUL = 0;
    public MarshalQueryableString() {}
    public android.hardware.camera2.marshal.Marshaler<java.lang.String> createMarshaler(android.hardware.camera2.utils.TypeReference<java.lang.String> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<java.lang.String> p0, int p1) { return false; }

    private class MarshalerString extends android.hardware.camera2.marshal.Marshaler<java.lang.String> {
        protected MarshalerString(android.hardware.camera2.utils.TypeReference<java.lang.String> p0, int p1) { super(null, null, 0); }
        public void marshal(java.lang.String p0, java.nio.ByteBuffer p1) {}
        public int calculateMarshalSize(java.lang.String p0) { return 0; }
        public java.lang.String unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
    }

    private static class PreloadHolder {
        public static final java.nio.charset.Charset UTF8_CHARSET = null;
        private PreloadHolder() {}
    }
}
