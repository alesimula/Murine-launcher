package android.view.textclassifier;

public final class TextLanguage implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.view.textclassifier.TextLanguage> CREATOR = null;
    static final android.view.textclassifier.TextLanguage EMPTY = null;
    private final java.lang.String mId = null;
    private final android.view.textclassifier.EntityConfidence mEntityConfidence = null;
    private final android.os.Bundle mBundle = null;
    private TextLanguage(java.lang.String p0, android.view.textclassifier.EntityConfidence p1, android.os.Bundle p2) {}
    public java.lang.String getId() { return null; }
    public int getLocaleHypothesisCount() { return 0; }
    public android.icu.util.ULocale getLocale(int p0) { return null; }
    public float getConfidenceScore(android.icu.util.ULocale p0) { return 0.0f; }
    public android.os.Bundle getExtras() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private static android.view.textclassifier.TextLanguage readFromParcel(android.os.Parcel p0) { return null; }

    public static final class Builder {
        private java.lang.String mId;
        private final java.util.Map<java.lang.String, java.lang.Float> mEntityConfidenceMap = null;
        private android.os.Bundle mBundle;
        public Builder() {}
        public android.view.textclassifier.TextLanguage.Builder putLocale(android.icu.util.ULocale p0, float p1) { return null; }
        public android.view.textclassifier.TextLanguage.Builder setId(java.lang.String p0) { return null; }
        public android.view.textclassifier.TextLanguage.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.view.textclassifier.TextLanguage build() { return null; }
    }

    public static final class Request implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.textclassifier.TextLanguage.Request> CREATOR = null;
        private final java.lang.CharSequence mText = null;
        private final android.os.Bundle mExtra = null;
        private android.view.textclassifier.SystemTextClassifierMetadata mSystemTcMetadata;
        private Request(java.lang.CharSequence p0, android.os.Bundle p1) {}
        public java.lang.CharSequence getText() { return null; }
        public java.lang.String getCallingPackageName() { return null; }
        public void setSystemTextClassifierMetadata(android.view.textclassifier.SystemTextClassifierMetadata p0) {}
        public android.view.textclassifier.SystemTextClassifierMetadata getSystemTextClassifierMetadata() { return null; }
        public android.os.Bundle getExtras() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        private static android.view.textclassifier.TextLanguage.Request readFromParcel(android.os.Parcel p0) { return null; }

        public static final class Builder {
            private final java.lang.CharSequence mText = null;
            private android.os.Bundle mBundle;
            public Builder(java.lang.CharSequence p0) {}
            public android.view.textclassifier.TextLanguage.Request.Builder setExtras(android.os.Bundle p0) { return null; }
            public android.view.textclassifier.TextLanguage.Request build() { return null; }
        }
    }
}
