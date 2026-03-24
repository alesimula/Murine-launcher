package android.view.inputmethod;

public final class CursorAnchorInfo implements android.os.Parcelable {
    public static final int FLAG_HAS_VISIBLE_REGION = 1;
    public static final int FLAG_HAS_INVISIBLE_REGION = 2;
    public static final int FLAG_IS_RTL = 4;
    public static final android.os.Parcelable.Creator<android.view.inputmethod.CursorAnchorInfo> CREATOR = null;
    public CursorAnchorInfo(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public static android.view.inputmethod.CursorAnchorInfo createForAdditionalParentMatrix(android.view.inputmethod.CursorAnchorInfo p0, android.graphics.Matrix p1) { return null; }
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
    public java.util.List<android.graphics.RectF> getVisibleLineBounds() { return null; }
    public android.view.inputmethod.EditorBoundsInfo getEditorBoundsInfo() { return null; }
    public android.view.inputmethod.TextAppearanceInfo getTextAppearanceInfo() { return null; }
    public android.graphics.Matrix getMatrix() { return null; }
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder() {}
        public android.view.inputmethod.CursorAnchorInfo.Builder setSelectionRange(int p0, int p1) { return null; }
        public android.view.inputmethod.CursorAnchorInfo.Builder setComposingText(int p0, java.lang.CharSequence p1) { return null; }
        public android.view.inputmethod.CursorAnchorInfo.Builder setInsertionMarkerLocation(float p0, float p1, float p2, float p3, int p4) { return null; }
        public android.view.inputmethod.CursorAnchorInfo.Builder addCharacterBounds(int p0, float p1, float p2, float p3, float p4, int p5) { return null; }
        public android.view.inputmethod.CursorAnchorInfo.Builder setEditorBoundsInfo(android.view.inputmethod.EditorBoundsInfo p0) { return null; }
        public android.view.inputmethod.CursorAnchorInfo.Builder setMatrix(android.graphics.Matrix p0) { return null; }
        public android.view.inputmethod.CursorAnchorInfo.Builder setTextAppearanceInfo(android.view.inputmethod.TextAppearanceInfo p0) { return null; }
        public android.view.inputmethod.CursorAnchorInfo.Builder addVisibleLineBounds(float p0, float p1, float p2, float p3) { return null; }
        public android.view.inputmethod.CursorAnchorInfo.Builder clearVisibleLineBounds() { return null; }
        public android.view.inputmethod.CursorAnchorInfo build() { return null; }
        public void reset() {}
    }
}
