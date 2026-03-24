package android.service.autofill;

public final class CustomDescription implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.autofill.CustomDescription> CREATOR = null;
    @android.annotation.Nullable
    public android.widget.RemoteViews getPresentation() { return null; }
    @android.annotation.Nullable
    public java.util.ArrayList<android.util.Pair<java.lang.Integer, android.service.autofill.InternalTransformation>> getTransformations() { return null; }
    @android.annotation.Nullable
    public java.util.ArrayList<android.util.Pair<android.service.autofill.InternalValidator, android.service.autofill.BatchUpdates>> getUpdates() { return null; }
    @android.annotation.Nullable
    public android.util.SparseArray<android.service.autofill.InternalOnClickAction> getActions() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        public Builder(android.widget.RemoteViews p0) {}
        @android.annotation.NonNull
        public android.service.autofill.CustomDescription.Builder addChild(int p0, android.service.autofill.Transformation p1) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.CustomDescription.Builder batchUpdate(android.service.autofill.Validator p0, android.service.autofill.BatchUpdates p1) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.CustomDescription.Builder addOnClickAction(int p0, android.service.autofill.OnClickAction p1) { return null; }
        @android.annotation.NonNull
        public android.service.autofill.CustomDescription build() { return null; }
    }
}
