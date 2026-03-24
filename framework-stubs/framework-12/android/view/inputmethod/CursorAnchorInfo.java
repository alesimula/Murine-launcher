package android.view.inputmethod;

public final class CursorAnchorInfo implements android.os.Parcelable {
    private final int mHashCode = 0;
    private final int mSelectionStart = 0;
    private final int mSelectionEnd = 0;
    private final int mComposingTextStart = 0;
    private final java.lang.CharSequence mComposingText = null;
    private final int mInsertionMarkerFlags = 0;
    private final float mInsertionMarkerHorizontal = 0.0f;
    private final float mInsertionMarkerTop = 0.0f;
    private final float mInsertionMarkerBaseline = 0.0f;
    private final float mInsertionMarkerBottom = 0.0f;
    private final android.view.inputmethod.SparseRectFArray mCharacterBoundsArray = null;
    private final float[] mMatrixValues = null;
    public static final int FLAG_HAS_VISIBLE_REGION = 1;
    public static final int FLAG_HAS_INVISIBLE_REGION = 2;
    public static final int FLAG_IS_RTL = 4;
    public static final android.os.Parcelable.Creator<android.view.inputmethod.CursorAnchorInfo> CREATOR = null;
    public CursorAnchorInfo(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    private static boolean areSameFloatImpl(float p0, float p1) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    private CursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo.Builder p0) {}
    public int getSelectionStart() { return 0; }
    public int getSelectionEnd() { return 0; }
    public int getComposingTextStart() { return 0; }
    public java.lang.CharSequence getComposingText() { return null; }
    public int getInsertionMarkerFlags() { return 0; }
    public float getInsertionMarkerHorizontal() { return 0.0f; }
    public float getInsertionMarkerTop() { return 0.0f; }
    public float getInsertionMarkerBaseline() { return 0.0f; }
    public float getInsertionMarkerBottom() { return 0.0f; }
    public android.graphics.RectF getCharacterBounds(int p0) { return null; }
    public int getCharacterBoundsFlags(int p0) { return 0; }
    public android.graphics.Matrix getMatrix() { return null; }
    public int describeContents() { return 0; }

    public static final class Builder {
        private int mSelectionStart;
        private int mSelectionEnd;
        private int mComposingTextStart;
        private java.lang.CharSequence mComposingText;
        private float mInsertionMarkerHorizontal;
        private float mInsertionMarkerTop;
        private float mInsertionMarkerBaseline;
        private float mInsertionMarkerBottom;
        private int mInsertionMarkerFlags;
        private android.view.inputmethod.SparseRectFArray.SparseRectFArrayBuilder mCharacterBoundsArrayBuilder;
        private float[] mMatrixValues;
        private boolean mMatrixInitialized;
        public Builder() {}
        public android.view.inputmethod.CursorAnchorInfo.Builder setSelectionRange(int p0, int p1) { return null; }
        public android.view.inputmethod.CursorAnchorInfo.Builder setComposingText(int p0, java.lang.CharSequence p1) { return null; }
        public android.view.inputmethod.CursorAnchorInfo.Builder setInsertionMarkerLocation(float p0, float p1, float p2, float p3, int p4) { return null; }
        public android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(int p0, float p1, float p2, float p3, float p4, int p5) { return null; }
        public android.view.inputmethod.CursorAnchorInfo.Builder setMatrix(android.graphics.Matrix p0) { return null; }
        public android.view.inputmethod.CursorAnchorInfo build() { return null; }
        public void reset() {}
    }
}
