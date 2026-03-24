package android.service.autofill;

public final class CharSequenceTransformation extends android.service.autofill.InternalTransformation implements android.service.autofill.Transformation, android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.autofill.CharSequenceTransformation> CREATOR = null;
    public void apply(android.service.autofill.ValueFinder p0, android.widget.RemoteViews p1, int p2) throws java.lang.Exception {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        public Builder(android.view.autofill.AutofillId p0, java.util.regex.Pattern p1, java.lang.String p2) {}
        public android.service.autofill.CharSequenceTransformation.Builder addField(android.view.autofill.AutofillId p0, java.util.regex.Pattern p1, java.lang.String p2) { return null; }
        public android.service.autofill.CharSequenceTransformation build() { return null; }
    }
}
