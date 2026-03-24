package android.service.autofill;

public final class CustomDescription implements android.os.Parcelable {
    private final android.widget.RemoteViews mPresentation = null;
    private final java.util.ArrayList<android.util.Pair<java.lang.Integer, android.service.autofill.InternalTransformation>> mTransformations = null;
    private final java.util.ArrayList<android.util.Pair<android.service.autofill.InternalValidator, android.service.autofill.BatchUpdates>> mUpdates = null;
    private final android.util.SparseArray<android.service.autofill.InternalOnClickAction> mActions = null;
    public static final android.os.Parcelable.Creator<android.service.autofill.CustomDescription> CREATOR = null;
    private CustomDescription(android.service.autofill.CustomDescription.Builder p0) {}
    public android.widget.RemoteViews getPresentation() { return null; }
    public java.util.ArrayList<android.util.Pair<java.lang.Integer, android.service.autofill.InternalTransformation>> getTransformations() { return null; }
    public java.util.ArrayList<android.util.Pair<android.service.autofill.InternalValidator, android.service.autofill.BatchUpdates>> getUpdates() { return null; }
    public android.util.SparseArray<android.service.autofill.InternalOnClickAction> getActions() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private final android.widget.RemoteViews mPresentation = null;
        private boolean mDestroyed;
        private java.util.ArrayList<android.util.Pair<java.lang.Integer, android.service.autofill.InternalTransformation>> mTransformations;
        private java.util.ArrayList<android.util.Pair<android.service.autofill.InternalValidator, android.service.autofill.BatchUpdates>> mUpdates;
        private android.util.SparseArray<android.service.autofill.InternalOnClickAction> mActions;
        public Builder(android.widget.RemoteViews p0) {}
        public android.service.autofill.CustomDescription.Builder addChild(int p0, android.service.autofill.Transformation p1) { return null; }
        public android.service.autofill.CustomDescription.Builder batchUpdate(android.service.autofill.Validator p0, android.service.autofill.BatchUpdates p1) { return null; }
        public android.service.autofill.CustomDescription.Builder addOnClickAction(int p0, android.service.autofill.OnClickAction p1) { return null; }
        public android.service.autofill.CustomDescription build() { return null; }
        private void throwIfDestroyed() {}
    }
}
