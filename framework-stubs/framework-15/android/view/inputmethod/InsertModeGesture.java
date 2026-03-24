package android.view.inputmethod;

public final class InsertModeGesture extends android.view.inputmethod.CancellableHandwritingGesture implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.inputmethod.InsertModeGesture> CREATOR = null;
    @android.annotation.NonNull
    public android.os.CancellationSignal getCancellationSignal() { return null; }
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
        public android.view.inputmethod.InsertModeGesture.Builder setInsertionPoint(android.graphics.PointF p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.view.inputmethod.InsertModeGesture.Builder setCancellationSignal(android.os.CancellationSignal p0) { return null; }
        @android.annotation.NonNull
        public android.view.inputmethod.InsertModeGesture.Builder setFallbackText(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.view.inputmethod.InsertModeGesture build() { return null; }
    }
}
