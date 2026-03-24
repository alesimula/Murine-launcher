package android.service.autofill;

public final class CharSequenceTransformation extends android.service.autofill.InternalTransformation implements android.service.autofill.Transformation, android.os.Parcelable {
    private static final java.lang.String TAG = "CharSequenceTransformation";
    private final java.util.LinkedHashMap<android.view.autofill.AutofillId, android.util.Pair<java.util.regex.Pattern, java.lang.String>> mFields = null;
    public static final android.os.Parcelable.Creator<android.service.autofill.CharSequenceTransformation> CREATOR = null;
    private CharSequenceTransformation(android.service.autofill.CharSequenceTransformation.Builder p0) { super(); }
    public void apply(android.service.autofill.ValueFinder p0, android.widget.RemoteViews p1, int p2) throws java.lang.Exception {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private final java.util.LinkedHashMap<android.view.autofill.AutofillId, android.util.Pair<java.util.regex.Pattern, java.lang.String>> mFields = null;
        private boolean mDestroyed;
        public Builder(android.view.autofill.AutofillId p0, java.util.regex.Pattern p1, java.lang.String p2) {}
        public android.service.autofill.CharSequenceTransformation.Builder addField(android.view.autofill.AutofillId p0, java.util.regex.Pattern p1, java.lang.String p2) { return null; }
        public android.service.autofill.CharSequenceTransformation build() { return null; }
        private void throwIfDestroyed() {}
    }
}
