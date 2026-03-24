package android.filterfw.core;

public class FrameFormat {
    public static final int TYPE_UNSPECIFIED = 0;
    public static final int TYPE_BIT = 1;
    public static final int TYPE_BYTE = 2;
    public static final int TYPE_INT16 = 3;
    public static final int TYPE_INT32 = 4;
    public static final int TYPE_FLOAT = 5;
    public static final int TYPE_DOUBLE = 6;
    public static final int TYPE_POINTER = 7;
    public static final int TYPE_OBJECT = 8;
    public static final int TARGET_UNSPECIFIED = 0;
    public static final int TARGET_SIMPLE = 1;
    public static final int TARGET_NATIVE = 2;
    public static final int TARGET_GPU = 3;
    public static final int TARGET_VERTEXBUFFER = 4;
    public static final int TARGET_RS = 5;
    public static final int SIZE_UNSPECIFIED = 0;
    public static final int BYTES_PER_SAMPLE_UNSPECIFIED = 1;
    protected static final int SIZE_UNKNOWN = -1;
    protected int mBaseType;
    protected int mBytesPerSample;
    protected int mSize;
    protected int mTarget;
    protected int[] mDimensions;
    protected android.filterfw.core.KeyValueMap mMetaData;
    protected java.lang.Class mObjectClass;
    protected FrameFormat() {}
    public FrameFormat(int p0, int p1) {}
    public static android.filterfw.core.FrameFormat unspecified() { return null; }
    public int getBaseType() { return 0; }
    public boolean isBinaryDataType() { return false; }
    public int getBytesPerSample() { return 0; }
    public int getValuesPerSample() { return 0; }
    public int getTarget() { return 0; }
    public int[] getDimensions() { return null; }
    public int getDimension(int p0) { return 0; }
    public int getDimensionCount() { return 0; }
    public boolean hasMetaKey(java.lang.String p0) { return false; }
    public boolean hasMetaKey(java.lang.String p0, java.lang.Class p1) { return false; }
    public java.lang.Object getMetaValue(java.lang.String p0) { return null; }
    public int getNumberOfDimensions() { return 0; }
    public int getLength() { return 0; }
    public int getWidth() { return 0; }
    public int getHeight() { return 0; }
    public int getDepth() { return 0; }
    public int getSize() { return 0; }
    public java.lang.Class getObjectClass() { return null; }
    public android.filterfw.core.MutableFrameFormat mutableCopy() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean isCompatibleWith(android.filterfw.core.FrameFormat p0) { return false; }
    public boolean mayBeCompatibleWith(android.filterfw.core.FrameFormat p0) { return false; }
    public static int bytesPerSampleOf(int p0) { return 0; }
    public static java.lang.String dimensionsToString(int[] p0) { return null; }
    public static java.lang.String baseTypeToString(int p0) { return null; }
    public static java.lang.String targetToString(int p0) { return null; }
    public static java.lang.String metaDataToString(android.filterfw.core.KeyValueMap p0) { return null; }
    public static int readTargetString(java.lang.String p0) { return 0; }
    public java.lang.String toString() { return null; }
    private void initDefaults() {}
    int calcSize(int[] p0) { return 0; }
    boolean isReplaceableBy(android.filterfw.core.FrameFormat p0) { return false; }
}
