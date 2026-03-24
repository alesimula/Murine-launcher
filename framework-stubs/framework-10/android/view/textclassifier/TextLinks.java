package android.view.textclassifier;

public final class TextLinks implements android.os.Parcelable {
    public static final int STATUS_LINKS_APPLIED = 0;
    public static final int STATUS_NO_LINKS_FOUND = 1;
    public static final int STATUS_NO_LINKS_APPLIED = 2;
    public static final int STATUS_DIFFERENT_TEXT = 3;
    public static final int STATUS_UNSUPPORTED_CHARACTER = 4;
    public static final int APPLY_STRATEGY_IGNORE = 0;
    public static final int APPLY_STRATEGY_REPLACE = 1;
    private final java.lang.String mFullText = null;
    private final java.util.List<android.view.textclassifier.TextLinks.TextLink> mLinks = null;
    private final android.os.Bundle mExtras = null;
    public static final android.os.Parcelable.Creator<android.view.textclassifier.TextLinks> CREATOR = null;
    private TextLinks(java.lang.String p0, java.util.ArrayList<android.view.textclassifier.TextLinks.TextLink> p1, android.os.Bundle p2) {}
    public java.lang.String getText() { return null; }
    public java.util.Collection<android.view.textclassifier.TextLinks.TextLink> getLinks() { return null; }
    public android.os.Bundle getExtras() { return null; }
    public int apply(android.text.Spannable p0, int p1, java.util.function.Function<android.view.textclassifier.TextLinks.TextLink, android.view.textclassifier.TextLinks.TextLinkSpan> p2) { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private TextLinks(android.os.Parcel p0) {}

    public static class TextLinkSpan extends android.text.style.ClickableSpan {
        public static final int INVOCATION_METHOD_UNSPECIFIED = -1;
        public static final int INVOCATION_METHOD_TOUCH = 0;
        public static final int INVOCATION_METHOD_KEYBOARD = 1;
        private final android.view.textclassifier.TextLinks.TextLink mTextLink = null;
        public TextLinkSpan(android.view.textclassifier.TextLinks.TextLink p0) { super(); }
        public void onClick(android.view.View p0) {}
        public final void onClick(android.view.View p0, int p1) {}
        public final android.view.textclassifier.TextLinks.TextLink getTextLink() { return null; }
        public final java.lang.String getUrl() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface InvocationMethod {
        }
    }

    public static final class TextLink implements android.os.Parcelable {
        private final android.view.textclassifier.EntityConfidence mEntityScores = null;
        private final int mStart = 0;
        private final int mEnd = 0;
        private final android.os.Bundle mExtras = null;
        private final android.text.style.URLSpan mUrlSpan = null;
        public static final android.os.Parcelable.Creator<android.view.textclassifier.TextLinks.TextLink> CREATOR = null;
        private TextLink(int p0, int p1, android.view.textclassifier.EntityConfidence p2, android.os.Bundle p3, android.text.style.URLSpan p4) {}
        public int getStart() { return 0; }
        public int getEnd() { return 0; }
        public int getEntityCount() { return 0; }
        public java.lang.String getEntity(int p0) { return null; }
        public float getConfidenceScore(java.lang.String p0) { return 0.0f; }
        public android.os.Bundle getExtras() { return null; }
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        private static android.view.textclassifier.TextLinks.TextLink readFromParcel(android.os.Parcel p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }

    public static final class Request implements android.os.Parcelable {
        private final java.lang.CharSequence mText = null;
        private final android.os.LocaleList mDefaultLocales = null;
        private final android.view.textclassifier.TextClassifier.EntityConfig mEntityConfig = null;
        private final boolean mLegacyFallback = false;
        private java.lang.String mCallingPackageName;
        private final android.os.Bundle mExtras = null;
        public static final android.os.Parcelable.Creator<android.view.textclassifier.TextLinks.Request> CREATOR = null;
        private Request(java.lang.CharSequence p0, android.os.LocaleList p1, android.view.textclassifier.TextClassifier.EntityConfig p2, boolean p3, android.os.Bundle p4) {}
        public java.lang.CharSequence getText() { return null; }
        public android.os.LocaleList getDefaultLocales() { return null; }
        public android.view.textclassifier.TextClassifier.EntityConfig getEntityConfig() { return null; }
        public boolean isLegacyFallback() { return false; }
        public void setCallingPackageName(java.lang.String p0) {}
        public java.lang.String getCallingPackageName() { return null; }
        public android.os.Bundle getExtras() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        private static android.view.textclassifier.TextLinks.Request readFromParcel(android.os.Parcel p0) { return null; }

        public static final class Builder {
            private final java.lang.CharSequence mText = null;
            private android.os.LocaleList mDefaultLocales;
            private android.view.textclassifier.TextClassifier.EntityConfig mEntityConfig;
            private boolean mLegacyFallback;
            private android.os.Bundle mExtras;
            public Builder(java.lang.CharSequence p0) {}
            public android.view.textclassifier.TextLinks.Request.Builder setDefaultLocales(android.os.LocaleList p0) { return null; }
            public android.view.textclassifier.TextLinks.Request.Builder setEntityConfig(android.view.textclassifier.TextClassifier.EntityConfig p0) { return null; }
            public android.view.textclassifier.TextLinks.Request.Builder setLegacyFallback(boolean p0) { return null; }
            public android.view.textclassifier.TextLinks.Request.Builder setExtras(android.os.Bundle p0) { return null; }
            public android.view.textclassifier.TextLinks.Request build() { return null; }
        }
    }

    public static final class Builder {
        private final java.lang.String mFullText = null;
        private final java.util.ArrayList<android.view.textclassifier.TextLinks.TextLink> mLinks = null;
        private android.os.Bundle mExtras;
        public Builder(java.lang.String p0) {}
        public android.view.textclassifier.TextLinks.Builder addLink(int p0, int p1, java.util.Map<java.lang.String, java.lang.Float> p2) { return null; }
        public android.view.textclassifier.TextLinks.Builder addLink(int p0, int p1, java.util.Map<java.lang.String, java.lang.Float> p2, android.os.Bundle p3) { return null; }
        android.view.textclassifier.TextLinks.Builder addLink(int p0, int p1, java.util.Map<java.lang.String, java.lang.Float> p2, android.text.style.URLSpan p3) { return null; }
        private android.view.textclassifier.TextLinks.Builder addLink(int p0, int p1, java.util.Map<java.lang.String, java.lang.Float> p2, android.os.Bundle p3, android.text.style.URLSpan p4) { return null; }
        public android.view.textclassifier.TextLinks.Builder clearTextLinks() { return null; }
        public android.view.textclassifier.TextLinks.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.view.textclassifier.TextLinks build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ApplyStrategy {
    }
}
