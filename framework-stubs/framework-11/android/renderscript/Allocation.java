package android.renderscript;

public class Allocation extends android.renderscript.BaseObj {
    private static final int MAX_NUMBER_IO_INPUT_ALLOC = 16;
    android.renderscript.Type mType;
    boolean mOwningType;
    android.graphics.Bitmap mBitmap;
    int mUsage;
    android.renderscript.Allocation mAdaptedAllocation;
    int mSize;
    android.renderscript.Allocation.MipmapControl mMipmapControl;
    long mTimeStamp;
    boolean mReadAllowed;
    boolean mWriteAllowed;
    boolean mAutoPadding;
    int mSelectedX;
    int mSelectedY;
    int mSelectedZ;
    int mSelectedLOD;
    int[] mSelectedArray;
    android.renderscript.Type.CubemapFace mSelectedFace;
    int mCurrentDimX;
    int mCurrentDimY;
    int mCurrentDimZ;
    int mCurrentCount;
    static java.util.HashMap<java.lang.Long, android.renderscript.Allocation> mAllocationMap;
    android.renderscript.Allocation.OnBufferAvailableListener mBufferNotifier;
    private android.view.Surface mGetSurfaceSurface;
    private java.nio.ByteBuffer mByteBuffer;
    private long mByteBufferStride;
    public static final int USAGE_SCRIPT = 1;
    public static final int USAGE_GRAPHICS_TEXTURE = 2;
    public static final int USAGE_GRAPHICS_VERTEX = 4;
    public static final int USAGE_GRAPHICS_CONSTANTS = 8;
    public static final int USAGE_GRAPHICS_RENDER_TARGET = 16;
    public static final int USAGE_IO_INPUT = 32;
    public static final int USAGE_IO_OUTPUT = 64;
    public static final int USAGE_SHARED = 128;
    static android.graphics.BitmapFactory.Options mBitmapOptions;
    private android.renderscript.Element.DataType validateObjectIsPrimitiveArray(java.lang.Object p0, boolean p1) { return null; }
    private long getIDSafe() { return 0L; }
    public android.renderscript.Element getElement() { return null; }
    public int getUsage() { return 0; }
    public android.renderscript.Allocation.MipmapControl getMipmap() { return null; }
    public void setAutoPadding(boolean p0) {}
    public int getBytesSize() { return 0; }
    private void updateCacheInfo(android.renderscript.Type p0) {}
    private void setBitmap(android.graphics.Bitmap p0) {}
    Allocation(long p0, android.renderscript.RenderScript p1, android.renderscript.Type p2, int p3) { super(0L, null); }
    Allocation(long p0, android.renderscript.RenderScript p1, android.renderscript.Type p2, boolean p3, int p4, android.renderscript.Allocation.MipmapControl p5) { super(0L, null); }
    protected void finalize() throws java.lang.Throwable {}
    private void validateIsInt64() {}
    private void validateIsInt32() {}
    private void validateIsInt16OrFloat16() {}
    private void validateIsInt8() {}
    private void validateIsFloat32() {}
    private void validateIsFloat64() {}
    private void validateIsObject() {}
    void updateFromNative() {}
    public android.renderscript.Type getType() { return null; }
    public void syncAll(int p0) {}
    public void ioSend() {}
    public void ioReceive() {}
    public void copyFrom(android.renderscript.BaseObj[] p0) {}
    private void validateBitmapFormat(android.graphics.Bitmap p0) {}
    private void validateBitmapSize(android.graphics.Bitmap p0) {}
    private void copyFromUnchecked(java.lang.Object p0, android.renderscript.Element.DataType p1, int p2) {}
    public void copyFromUnchecked(java.lang.Object p0) {}
    public void copyFromUnchecked(int[] p0) {}
    public void copyFromUnchecked(short[] p0) {}
    public void copyFromUnchecked(byte[] p0) {}
    public void copyFromUnchecked(float[] p0) {}
    public void copyFrom(java.lang.Object p0) {}
    public void copyFrom(int[] p0) {}
    public void copyFrom(short[] p0) {}
    public void copyFrom(byte[] p0) {}
    public void copyFrom(float[] p0) {}
    public void copyFrom(android.graphics.Bitmap p0) {}
    public void copyFrom(android.renderscript.Allocation p0) {}
    public void setFromFieldPacker(int p0, android.renderscript.FieldPacker p1) {}
    public void setFromFieldPacker(int p0, int p1, android.renderscript.FieldPacker p2) {}
    public void setFromFieldPacker(int p0, int p1, int p2, int p3, android.renderscript.FieldPacker p4) {}
    private void data1DChecks(int p0, int p1, int p2, int p3, boolean p4) {}
    public void generateMipmaps() {}
    private void copy1DRangeFromUnchecked(int p0, int p1, java.lang.Object p2, android.renderscript.Element.DataType p3, int p4) {}
    public void copy1DRangeFromUnchecked(int p0, int p1, java.lang.Object p2) {}
    public void copy1DRangeFromUnchecked(int p0, int p1, int[] p2) {}
    public void copy1DRangeFromUnchecked(int p0, int p1, short[] p2) {}
    public void copy1DRangeFromUnchecked(int p0, int p1, byte[] p2) {}
    public void copy1DRangeFromUnchecked(int p0, int p1, float[] p2) {}
    public void copy1DRangeFrom(int p0, int p1, java.lang.Object p2) {}
    public void copy1DRangeFrom(int p0, int p1, int[] p2) {}
    public void copy1DRangeFrom(int p0, int p1, short[] p2) {}
    public void copy1DRangeFrom(int p0, int p1, byte[] p2) {}
    public void copy1DRangeFrom(int p0, int p1, float[] p2) {}
    public void copy1DRangeFrom(int p0, int p1, android.renderscript.Allocation p2, int p3) {}
    private void validate2DRange(int p0, int p1, int p2, int p3) {}
    void copy2DRangeFromUnchecked(int p0, int p1, int p2, int p3, java.lang.Object p4, android.renderscript.Element.DataType p5, int p6) {}
    public void copy2DRangeFrom(int p0, int p1, int p2, int p3, java.lang.Object p4) {}
    public void copy2DRangeFrom(int p0, int p1, int p2, int p3, byte[] p4) {}
    public void copy2DRangeFrom(int p0, int p1, int p2, int p3, short[] p4) {}
    public void copy2DRangeFrom(int p0, int p1, int p2, int p3, int[] p4) {}
    public void copy2DRangeFrom(int p0, int p1, int p2, int p3, float[] p4) {}
    public void copy2DRangeFrom(int p0, int p1, int p2, int p3, android.renderscript.Allocation p4, int p5, int p6) {}
    public void copy2DRangeFrom(int p0, int p1, android.graphics.Bitmap p2) {}
    private void validate3DRange(int p0, int p1, int p2, int p3, int p4, int p5) {}
    private void copy3DRangeFromUnchecked(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.Object p6, android.renderscript.Element.DataType p7, int p8) {}
    public void copy3DRangeFrom(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.Object p6) {}
    public void copy3DRangeFrom(int p0, int p1, int p2, int p3, int p4, int p5, android.renderscript.Allocation p6, int p7, int p8, int p9) {}
    public void copyTo(android.graphics.Bitmap p0) {}
    private void copyTo(java.lang.Object p0, android.renderscript.Element.DataType p1, int p2) {}
    public void copyTo(java.lang.Object p0) {}
    public void copyTo(byte[] p0) {}
    public void copyTo(short[] p0) {}
    public void copyTo(int[] p0) {}
    public void copyTo(float[] p0) {}
    public void copyToFieldPacker(int p0, int p1, int p2, int p3, android.renderscript.FieldPacker p4) {}
    public synchronized void resize(int p0) {}
    private void copy1DRangeToUnchecked(int p0, int p1, java.lang.Object p2, android.renderscript.Element.DataType p3, int p4) {}
    public void copy1DRangeToUnchecked(int p0, int p1, java.lang.Object p2) {}
    public void copy1DRangeToUnchecked(int p0, int p1, int[] p2) {}
    public void copy1DRangeToUnchecked(int p0, int p1, short[] p2) {}
    public void copy1DRangeToUnchecked(int p0, int p1, byte[] p2) {}
    public void copy1DRangeToUnchecked(int p0, int p1, float[] p2) {}
    public void copy1DRangeTo(int p0, int p1, java.lang.Object p2) {}
    public void copy1DRangeTo(int p0, int p1, int[] p2) {}
    public void copy1DRangeTo(int p0, int p1, short[] p2) {}
    public void copy1DRangeTo(int p0, int p1, byte[] p2) {}
    public void copy1DRangeTo(int p0, int p1, float[] p2) {}
    void copy2DRangeToUnchecked(int p0, int p1, int p2, int p3, java.lang.Object p4, android.renderscript.Element.DataType p5, int p6) {}
    public void copy2DRangeTo(int p0, int p1, int p2, int p3, java.lang.Object p4) {}
    public void copy2DRangeTo(int p0, int p1, int p2, int p3, byte[] p4) {}
    public void copy2DRangeTo(int p0, int p1, int p2, int p3, short[] p4) {}
    public void copy2DRangeTo(int p0, int p1, int p2, int p3, int[] p4) {}
    public void copy2DRangeTo(int p0, int p1, int p2, int p3, float[] p4) {}
    private void copy3DRangeToUnchecked(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.Object p6, android.renderscript.Element.DataType p7, int p8) {}
    public void copy3DRangeTo(int p0, int p1, int p2, int p3, int p4, int p5, java.lang.Object p6) {}
    public static android.renderscript.Allocation createTyped(android.renderscript.RenderScript p0, android.renderscript.Type p1, android.renderscript.Allocation.MipmapControl p2, int p3) { return null; }
    public static android.renderscript.Allocation createTyped(android.renderscript.RenderScript p0, android.renderscript.Type p1, int p2) { return null; }
    public static android.renderscript.Allocation createTyped(android.renderscript.RenderScript p0, android.renderscript.Type p1) { return null; }
    public static android.renderscript.Allocation createSized(android.renderscript.RenderScript p0, android.renderscript.Element p1, int p2, int p3) { return null; }
    public static android.renderscript.Allocation createSized(android.renderscript.RenderScript p0, android.renderscript.Element p1, int p2) { return null; }
    static android.renderscript.Element elementFromBitmap(android.renderscript.RenderScript p0, android.graphics.Bitmap p1) { return null; }
    static android.renderscript.Type typeFromBitmap(android.renderscript.RenderScript p0, android.graphics.Bitmap p1, android.renderscript.Allocation.MipmapControl p2) { return null; }
    public static android.renderscript.Allocation createFromBitmap(android.renderscript.RenderScript p0, android.graphics.Bitmap p1, android.renderscript.Allocation.MipmapControl p2, int p3) { return null; }
    public java.nio.ByteBuffer getByteBuffer() { return null; }
    public static android.renderscript.Allocation[] createAllocations(android.renderscript.RenderScript p0, android.renderscript.Type p1, int p2, int p3) { return null; }
    static android.renderscript.Allocation createFromAllocation(android.renderscript.RenderScript p0, android.renderscript.Allocation p1) { return null; }
    void setupBufferQueue(int p0) {}
    void shareBufferQueue(android.renderscript.Allocation p0) {}
    public long getStride() { return 0L; }
    public long getTimeStamp() { return 0L; }
    public android.view.Surface getSurface() { return null; }
    public void setSurface(android.view.Surface p0) {}
    public static android.renderscript.Allocation createFromBitmap(android.renderscript.RenderScript p0, android.graphics.Bitmap p1) { return null; }
    public static android.renderscript.Allocation createCubemapFromBitmap(android.renderscript.RenderScript p0, android.graphics.Bitmap p1, android.renderscript.Allocation.MipmapControl p2, int p3) { return null; }
    public static android.renderscript.Allocation createCubemapFromBitmap(android.renderscript.RenderScript p0, android.graphics.Bitmap p1) { return null; }
    public static android.renderscript.Allocation createCubemapFromCubeFaces(android.renderscript.RenderScript p0, android.graphics.Bitmap p1, android.graphics.Bitmap p2, android.graphics.Bitmap p3, android.graphics.Bitmap p4, android.graphics.Bitmap p5, android.graphics.Bitmap p6, android.renderscript.Allocation.MipmapControl p7, int p8) { return null; }
    public static android.renderscript.Allocation createCubemapFromCubeFaces(android.renderscript.RenderScript p0, android.graphics.Bitmap p1, android.graphics.Bitmap p2, android.graphics.Bitmap p3, android.graphics.Bitmap p4, android.graphics.Bitmap p5, android.graphics.Bitmap p6) { return null; }
    public static android.renderscript.Allocation createFromBitmapResource(android.renderscript.RenderScript p0, android.content.res.Resources p1, int p2, android.renderscript.Allocation.MipmapControl p3, int p4) { return null; }
    public static android.renderscript.Allocation createFromBitmapResource(android.renderscript.RenderScript p0, android.content.res.Resources p1, int p2) { return null; }
    public static android.renderscript.Allocation createFromString(android.renderscript.RenderScript p0, java.lang.String p1, int p2) { return null; }
    public void setOnBufferAvailableListener(android.renderscript.Allocation.OnBufferAvailableListener p0) {}
    static void sendBufferNotification(long p0) {}
    public void destroy() {}

    public static enum MipmapControl {
        MIPMAP_NONE,
        MIPMAP_FULL,
        MIPMAP_ON_SYNC_TO_TEXTURE;
        int mID;
        private MipmapControl() {}
    }

    public static interface OnBufferAvailableListener {
        public void onBufferAvailable(android.renderscript.Allocation p0);
    }
}
