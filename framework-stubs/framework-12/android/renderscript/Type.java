package android.renderscript;

@java.lang.Deprecated
public class Type extends android.renderscript.BaseObj {
    int mDimX;
    int mDimY;
    int mDimZ;
    boolean mDimMipmaps;
    boolean mDimFaces;
    int mDimYuv;
    int mElementCount;
    android.renderscript.Element mElement;
    int[] mArrays;
    static final int mMaxArrays = 4;
    public android.renderscript.Element getElement() { return null; }
    public int getX() { return 0; }
    public int getY() { return 0; }
    public int getZ() { return 0; }
    public int getYuv() { return 0; }
    public boolean hasMipmaps() { return false; }
    public boolean hasFaces() { return false; }
    public int getCount() { return 0; }
    public int getArray(int p0) { return 0; }
    public int getArrayCount() { return 0; }
    void calcElementCount() {}
    Type(long p0, android.renderscript.RenderScript p1) { super(0L, null); }
    void updateFromNative() {}
    public static android.renderscript.Type createX(android.renderscript.RenderScript p0, android.renderscript.Element p1, int p2) { return null; }
    public static android.renderscript.Type createXY(android.renderscript.RenderScript p0, android.renderscript.Element p1, int p2, int p3) { return null; }
    public static android.renderscript.Type createXYZ(android.renderscript.RenderScript p0, android.renderscript.Element p1, int p2, int p3, int p4) { return null; }

    public static class Builder {
        android.renderscript.RenderScript mRS;
        int mDimX;
        int mDimY;
        int mDimZ;
        boolean mDimMipmaps;
        boolean mDimFaces;
        int mYuv;
        int[] mArray;
        android.renderscript.Element mElement;
        public Builder(android.renderscript.RenderScript p0, android.renderscript.Element p1) {}
        public android.renderscript.Type.Builder setX(int p0) { return null; }
        public android.renderscript.Type.Builder setY(int p0) { return null; }
        public android.renderscript.Type.Builder setZ(int p0) { return null; }
        public android.renderscript.Type.Builder setArray(int p0, int p1) { return null; }
        public android.renderscript.Type.Builder setMipmaps(boolean p0) { return null; }
        public android.renderscript.Type.Builder setFaces(boolean p0) { return null; }
        public android.renderscript.Type.Builder setYuvFormat(int p0) { return null; }
        public android.renderscript.Type create() { return null; }
    }

    public static enum CubemapFace {
        POSITIVE_X,
        NEGATIVE_X,
        POSITIVE_Y,
        NEGATIVE_Y,
        POSITIVE_Z,
        NEGATIVE_Z,
        POSITVE_X,
        POSITVE_Y,
        POSITVE_Z;
        int mID;
        private CubemapFace() {}
    }
}
