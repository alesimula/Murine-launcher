package android.view.inputmethod;

public final class InsertGesture extends android.view.inputmethod.HandwritingGesture implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.inputmethod.InsertGesture> CREATOR = null;
    @android.annotation.NonNull
    public java.lang.String getTextToInsert() { return null; }
    @android.annotation.NonNull
    public android.graphics.PointF getInsertionPoint() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.view.inputmethod.InsertGesture.Builder setTextToInsert(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.view.inputmethod.InsertGesture.Builder setInsertionPoint(android.graphics.PointF p0) { return null; }
        @android.annotation.NonNull
        public android.view.inputmethod.InsertGesture.Builder setFallbackText(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.view.inputmethod.InsertGesture build() { return null; }
    }
}
