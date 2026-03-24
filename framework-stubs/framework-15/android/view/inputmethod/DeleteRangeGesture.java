package android.view.inputmethod;

public final class DeleteRangeGesture extends android.view.inputmethod.PreviewableHandwritingGesture implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.inputmethod.DeleteRangeGesture> CREATOR = null;
    public int getGranularity() { return 0; }
    @android.annotation.NonNull
    public android.graphics.RectF getDeletionStartArea() { return null; }
    @android.annotation.NonNull
    public android.graphics.RectF getDeletionEndArea() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.view.inputmethod.DeleteRangeGesture.Builder setGranularity(int p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.view.inputmethod.DeleteRangeGesture.Builder setDeletionStartArea(android.graphics.RectF p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.view.inputmethod.DeleteRangeGesture.Builder setDeletionEndArea(android.graphics.RectF p0) { return null; }
        @android.annotation.NonNull
        public android.view.inputmethod.DeleteRangeGesture.Builder setFallbackText(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.view.inputmethod.DeleteRangeGesture build() { return null; }
    }
}
