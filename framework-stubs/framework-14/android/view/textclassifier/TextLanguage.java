package android.view.textclassifier;

public final class TextLanguage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.textclassifier.TextLanguage> CREATOR = null;
    static final android.view.textclassifier.TextLanguage EMPTY = null;
    public java.lang.String getId() { return null; }
    public int getLocaleHypothesisCount() { return 0; }
    public android.icu.util.ULocale getLocale(int p0) { return null; }
    public float getConfidenceScore(android.icu.util.ULocale p0) { return 0.0f; }
    public android.os.Bundle getExtras() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        public android.view.textclassifier.TextLanguage.Builder putLocale(android.icu.util.ULocale p0, float p1) { return null; }
        public android.view.textclassifier.TextLanguage.Builder setId(java.lang.String p0) { return null; }
        public android.view.textclassifier.TextLanguage.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.view.textclassifier.TextLanguage build() { return null; }
    }

    public static final class Request implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.textclassifier.TextLanguage.Request> CREATOR = null;
        public java.lang.CharSequence getText() { return null; }
        public java.lang.String getCallingPackageName() { return null; }
        public void setSystemTextClassifierMetadata(android.view.textclassifier.SystemTextClassifierMetadata p0) {}
        public android.view.textclassifier.SystemTextClassifierMetadata getSystemTextClassifierMetadata() { return null; }
        public android.os.Bundle getExtras() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static final class Builder {
            public Builder(java.lang.CharSequence p0) {}
            public android.view.textclassifier.TextLanguage.Request.Builder setExtras(android.os.Bundle p0) { return null; }
            public android.view.textclassifier.TextLanguage.Request build() { return null; }
        }
    }
}
