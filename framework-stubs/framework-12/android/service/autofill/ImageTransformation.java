package android.service.autofill;

public final class ImageTransformation extends android.service.autofill.InternalTransformation implements android.service.autofill.Transformation, android.os.Parcelable {
    private static final java.lang.String TAG = "ImageTransformation";
    private final android.view.autofill.AutofillId mId = null;
    private final java.util.ArrayList<android.service.autofill.ImageTransformation.Option> mOptions = null;
    public static final android.os.Parcelable.Creator<android.service.autofill.ImageTransformation> CREATOR = null;
    private ImageTransformation(android.service.autofill.ImageTransformation.Builder p0) { super(); }
    public void apply(android.service.autofill.ValueFinder p0, android.widget.RemoteViews p1, int p2) throws java.lang.Exception {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private final android.view.autofill.AutofillId mId = null;
        private final java.util.ArrayList<android.service.autofill.ImageTransformation.Option> mOptions = null;
        private boolean mDestroyed;
        @java.lang.Deprecated
        public Builder(android.view.autofill.AutofillId p0, java.util.regex.Pattern p1, int p2) {}
        public Builder(android.view.autofill.AutofillId p0, java.util.regex.Pattern p1, int p2, java.lang.CharSequence p3) {}
        @java.lang.Deprecated
        public android.service.autofill.ImageTransformation.Builder addOption(java.util.regex.Pattern p0, int p1) { return null; }
        public android.service.autofill.ImageTransformation.Builder addOption(java.util.regex.Pattern p0, int p1, java.lang.CharSequence p2) { return null; }
        private void addOptionInternal(java.util.regex.Pattern p0, int p1, java.lang.CharSequence p2) {}
        public android.service.autofill.ImageTransformation build() { return null; }
        private void throwIfDestroyed() {}
    }

    private static final class Option {
        public final java.util.regex.Pattern pattern = null;
        public final int resId = 0;
        public final java.lang.CharSequence contentDescription = null;
        Option(java.util.regex.Pattern p0, int p1, java.lang.CharSequence p2) {}
    }
}
