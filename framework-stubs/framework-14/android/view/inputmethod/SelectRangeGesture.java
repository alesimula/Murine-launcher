package android.view.inputmethod;

public final class SelectRangeGesture extends android.view.inputmethod.PreviewableHandwritingGesture implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.inputmethod.SelectRangeGesture> CREATOR = null;
    @android.view.inputmethod.HandwritingGesture.Granularity
    public int getGranularity() { return 0; }
    public android.graphics.RectF getSelectionStartArea() { return null; }
    public android.graphics.RectF getSelectionEndArea() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.view.inputmethod.SelectRangeGesture.Builder setGranularity(int p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.view.inputmethod.SelectRangeGesture.Builder setSelectionStartArea(android.graphics.RectF p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.view.inputmethod.SelectRangeGesture.Builder setSelectionEndArea(android.graphics.RectF p0) { return null; }
        public android.view.inputmethod.SelectRangeGesture.Builder setFallbackText(java.lang.String p0) { return null; }
        public android.view.inputmethod.SelectRangeGesture build() { return null; }
    }
}
