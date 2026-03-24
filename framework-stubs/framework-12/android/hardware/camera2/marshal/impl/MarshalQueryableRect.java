package android.hardware.camera2.marshal.impl;

public class MarshalQueryableRect implements android.hardware.camera2.marshal.MarshalQueryable<android.graphics.Rect> {
    private static final int SIZE = 16;
    public MarshalQueryableRect() {}
    public android.hardware.camera2.marshal.Marshaler<android.graphics.Rect> createMarshaler(android.hardware.camera2.utils.TypeReference<android.graphics.Rect> p0, int p1) { return null; }
    public boolean isTypeMappingSupported(android.hardware.camera2.utils.TypeReference<android.graphics.Rect> p0, int p1) { return false; }

    private class MarshalerRect extends android.hardware.camera2.marshal.Marshaler<android.graphics.Rect> {
        protected MarshalerRect(android.hardware.camera2.utils.TypeReference<android.graphics.Rect> p0, int p1) { super(null, null, 0); }
        public void marshal(android.graphics.Rect p0, java.nio.ByteBuffer p1) {}
        public android.graphics.Rect unmarshal(java.nio.ByteBuffer p0) { return null; }
        public int getNativeSize() { return 0; }
    }
}
