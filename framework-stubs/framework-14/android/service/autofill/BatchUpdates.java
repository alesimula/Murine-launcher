package android.service.autofill;

public final class BatchUpdates implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.autofill.BatchUpdates> CREATOR = null;
    public java.util.ArrayList<android.util.Pair<java.lang.Integer, android.service.autofill.InternalTransformation>> getTransformations() { return null; }
    public android.widget.RemoteViews getUpdates() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        public Builder() {}
        public android.service.autofill.BatchUpdates.Builder updateTemplate(android.widget.RemoteViews p0) { return null; }
        public android.service.autofill.BatchUpdates.Builder transformChild(int p0, android.service.autofill.Transformation p1) { return null; }
        public android.service.autofill.BatchUpdates build() { return null; }
    }
}
