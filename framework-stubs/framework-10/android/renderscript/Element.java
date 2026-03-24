package android.renderscript;

public class Element extends android.renderscript.BaseObj {
    int mSize;
    android.renderscript.Element[] mElements;
    java.lang.String[] mElementNames;
    int[] mArraySizes;
    int[] mOffsetInBytes;
    int[] mVisibleElementMap;
    android.renderscript.Element.DataType mType;
    android.renderscript.Element.DataKind mKind;
    boolean mNormalized;
    int mVectorSize;
    private void updateVisibleSubElements() {}
    public int getBytesSize() { return 0; }
    public int getVectorSize() { return 0; }
    public boolean isComplex() { return false; }
    public int getSubElementCount() { return 0; }
    public android.renderscript.Element getSubElement(int p0) { return null; }
    public java.lang.String getSubElementName(int p0) { return null; }
    public int getSubElementArraySize(int p0) { return 0; }
    public int getSubElementOffsetBytes(int p0) { return 0; }
    public android.renderscript.Element.DataType getDataType() { return null; }
    public android.renderscript.Element.DataKind getDataKind() { return null; }
    public static android.renderscript.Element BOOLEAN(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element U8(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element I8(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element U16(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element I16(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element U32(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element I32(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element U64(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element I64(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element F16(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element F32(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element F64(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element ELEMENT(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element TYPE(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element ALLOCATION(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element SAMPLER(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element SCRIPT(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element MESH(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element PROGRAM_FRAGMENT(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element PROGRAM_VERTEX(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element PROGRAM_RASTER(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element PROGRAM_STORE(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element FONT(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element A_8(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element RGB_565(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element RGB_888(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element RGBA_5551(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element RGBA_4444(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element RGBA_8888(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element F16_2(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element F16_3(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element F16_4(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element F32_2(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element F32_3(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element F32_4(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element F64_2(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element F64_3(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element F64_4(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element U8_2(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element U8_3(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element U8_4(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element I8_2(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element I8_3(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element I8_4(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element U16_2(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element U16_3(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element U16_4(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element I16_2(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element I16_3(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element I16_4(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element U32_2(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element U32_3(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element U32_4(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element I32_2(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element I32_3(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element I32_4(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element U64_2(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element U64_3(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element U64_4(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element I64_2(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element I64_3(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element I64_4(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element YUV(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element MATRIX_4X4(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element MATRIX4X4(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element MATRIX_3X3(android.renderscript.RenderScript p0) { return null; }
    public static android.renderscript.Element MATRIX_2X2(android.renderscript.RenderScript p0) { return null; }
    Element(long p0, android.renderscript.RenderScript p1, android.renderscript.Element[] p2, java.lang.String[] p3, int[] p4) { super(0L, null); }
    Element(long p0, android.renderscript.RenderScript p1, android.renderscript.Element.DataType p2, android.renderscript.Element.DataKind p3, boolean p4, int p5) { super(0L, null); }
    Element(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    void updateFromNative() {}
    @android.annotation.UnsupportedAppUsage
    static android.renderscript.Element createUser(android.renderscript.RenderScript p0, android.renderscript.Element.DataType p1) { return null; }
    public static android.renderscript.Element createVector(android.renderscript.RenderScript p0, android.renderscript.Element.DataType p1, int p2) { return null; }
    public static android.renderscript.Element createPixel(android.renderscript.RenderScript p0, android.renderscript.Element.DataType p1, android.renderscript.Element.DataKind p2) { return null; }
    public boolean isCompatible(android.renderscript.Element p0) { return false; }

    public static enum DataType {
        NONE,
        FLOAT_16,
        FLOAT_32,
        FLOAT_64,
        SIGNED_8,
        SIGNED_16,
        SIGNED_32,
        SIGNED_64,
        UNSIGNED_8,
        UNSIGNED_16,
        UNSIGNED_32,
        UNSIGNED_64,
        BOOLEAN,
        UNSIGNED_5_6_5,
        UNSIGNED_5_5_5_1,
        UNSIGNED_4_4_4_4,
        MATRIX_4X4,
        MATRIX_3X3,
        MATRIX_2X2,
        RS_ELEMENT,
        RS_TYPE,
        RS_ALLOCATION,
        RS_SAMPLER,
        RS_SCRIPT,
        RS_MESH,
        RS_PROGRAM_FRAGMENT,
        RS_PROGRAM_VERTEX,
        RS_PROGRAM_RASTER,
        RS_PROGRAM_STORE,
        RS_FONT;
        int mID;
        int mSize;
        private DataType() {}
    }

    public static enum DataKind {
        USER,
        PIXEL_L,
        PIXEL_A,
        PIXEL_LA,
        PIXEL_RGB,
        PIXEL_RGBA,
        PIXEL_DEPTH,
        PIXEL_YUV;
        int mID;
        private DataKind() {}
    }

    public static class Builder {
        android.renderscript.RenderScript mRS;
        android.renderscript.Element[] mElements;
        java.lang.String[] mElementNames;
        int[] mArraySizes;
        int mCount;
        int mSkipPadding;
        public Builder(android.renderscript.RenderScript p0) {}
        public android.renderscript.Element.Builder add(android.renderscript.Element p0, java.lang.String p1, int p2) { return null; }
        public android.renderscript.Element.Builder add(android.renderscript.Element p0, java.lang.String p1) { return null; }
        public android.renderscript.Element create() { return null; }
    }
}
