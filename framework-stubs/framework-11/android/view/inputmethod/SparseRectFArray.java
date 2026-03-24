package android.view.inputmethod;

public final class SparseRectFArray implements android.os.Parcelable {
    private final int[] mKeys = null;
    private final float[] mCoordinates = null;
    private final int[] mFlagsArray = null;
    public static final android.os.Parcelable.Creator<android.view.inputmethod.SparseRectFArray> CREATOR = null;
    public SparseRectFArray(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    private SparseRectFArray(android.view.inputmethod.SparseRectFArray.SparseRectFArrayBuilder p0) {}
    public android.graphics.RectF get(int p0) { return null; }
    public int getFlags(int p0, int p1) { return 0; }
    public int describeContents() { return 0; }

    public static final class SparseRectFArrayBuilder {
        private int mCount;
        private int[] mKeys;
        private float[] mCoordinates;
        private int[] mFlagsArray;
        private static int INITIAL_SIZE;
        public SparseRectFArrayBuilder() {}
        private void checkIndex(int p0) {}
        private void ensureBufferSize() {}
        public android.view.inputmethod.SparseRectFArray.SparseRectFArrayBuilder append(int p0, float p1, float p2, float p3, float p4, int p5) { return null; }
        public boolean isEmpty() { return false; }
        public android.view.inputmethod.SparseRectFArray build() { return null; }
        public void reset() {}
    }
}
