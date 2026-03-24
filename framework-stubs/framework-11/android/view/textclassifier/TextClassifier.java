package android.view.textclassifier;

public interface TextClassifier {
    public static final java.lang.String LOG_TAG = "androidtc";
    public static final int LOCAL = 0;
    public static final int SYSTEM = 1;
    public static final int DEFAULT_SYSTEM = 2;
    public static final java.lang.String TYPE_UNKNOWN = "";
    public static final java.lang.String TYPE_OTHER = "other";
    public static final java.lang.String TYPE_EMAIL = "email";
    public static final java.lang.String TYPE_PHONE = "phone";
    public static final java.lang.String TYPE_ADDRESS = "address";
    public static final java.lang.String TYPE_URL = "url";
    public static final java.lang.String TYPE_DATE = "date";
    public static final java.lang.String TYPE_DATE_TIME = "datetime";
    public static final java.lang.String TYPE_FLIGHT_NUMBER = "flight";
    public static final java.lang.String TYPE_DICTIONARY = "dictionary";
    public static final java.lang.String HINT_TEXT_IS_EDITABLE = "android.text_is_editable";
    public static final java.lang.String HINT_TEXT_IS_NOT_EDITABLE = "android.text_is_not_editable";
    public static final java.lang.String WIDGET_TYPE_TEXTVIEW = "textview";
    public static final java.lang.String WIDGET_TYPE_EDITTEXT = "edittext";
    public static final java.lang.String WIDGET_TYPE_UNSELECTABLE_TEXTVIEW = "nosel-textview";
    public static final java.lang.String WIDGET_TYPE_WEBVIEW = "webview";
    public static final java.lang.String WIDGET_TYPE_EDIT_WEBVIEW = "edit-webview";
    public static final java.lang.String WIDGET_TYPE_CUSTOM_TEXTVIEW = "customview";
    public static final java.lang.String WIDGET_TYPE_CUSTOM_EDITTEXT = "customedit";
    public static final java.lang.String WIDGET_TYPE_CUSTOM_UNSELECTABLE_TEXTVIEW = "nosel-customview";
    public static final java.lang.String WIDGET_TYPE_NOTIFICATION = "notification";
    public static final java.lang.String WIDGET_TYPE_UNKNOWN = "unknown";
    public static final android.view.textclassifier.TextClassifier NO_OP = null;
    public static final java.lang.String EXTRA_FROM_TEXT_CLASSIFIER = "android.view.textclassifier.extra.FROM_TEXT_CLASSIFIER";
    public static java.lang.String typeToString(int p0) { return null; }
    default public android.view.textclassifier.TextSelection suggestSelection(android.view.textclassifier.TextSelection.Request p0) { return null; }
    default public android.view.textclassifier.TextSelection suggestSelection(java.lang.CharSequence p0, int p1, int p2, android.os.LocaleList p3) { return null; }
    default public android.view.textclassifier.TextClassification classifyText(android.view.textclassifier.TextClassification.Request p0) { return null; }
    default public android.view.textclassifier.TextClassification classifyText(java.lang.CharSequence p0, int p1, int p2, android.os.LocaleList p3) { return null; }
    default public android.view.textclassifier.TextLinks generateLinks(android.view.textclassifier.TextLinks.Request p0) { return null; }
    default public int getMaxGenerateLinksTextLength() { return 0; }
    default public android.view.textclassifier.TextLanguage detectLanguage(android.view.textclassifier.TextLanguage.Request p0) { return null; }
    default public android.view.textclassifier.ConversationActions suggestConversationActions(android.view.textclassifier.ConversationActions.Request p0) { return null; }
    default public void onSelectionEvent(android.view.textclassifier.SelectionEvent p0) {}
    default public void onTextClassifierEvent(android.view.textclassifier.TextClassifierEvent p0) {}
    default public void destroy() {}
    default public boolean isDestroyed() { return false; }
    default public void dump(com.android.internal.util.IndentingPrintWriter p0) {}

    public static final class EntityConfig implements android.os.Parcelable {
        private final java.util.List<java.lang.String> mIncludedTypes = null;
        private final java.util.List<java.lang.String> mExcludedTypes = null;
        private final java.util.List<java.lang.String> mHints = null;
        private final boolean mIncludeTypesFromTextClassifier = false;
        public static final android.os.Parcelable.Creator<android.view.textclassifier.TextClassifier.EntityConfig> CREATOR = null;
        private EntityConfig(java.util.List<java.lang.String> p0, java.util.List<java.lang.String> p1, java.util.List<java.lang.String> p2, boolean p3) {}
        private EntityConfig(android.os.Parcel p0) {}
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        @java.lang.Deprecated
        public static android.view.textclassifier.TextClassifier.EntityConfig createWithHints(java.util.Collection<java.lang.String> p0) { return null; }
        @java.lang.Deprecated
        public static android.view.textclassifier.TextClassifier.EntityConfig create(java.util.Collection<java.lang.String> p0, java.util.Collection<java.lang.String> p1, java.util.Collection<java.lang.String> p2) { return null; }
        @java.lang.Deprecated
        public static android.view.textclassifier.TextClassifier.EntityConfig createWithExplicitEntityList(java.util.Collection<java.lang.String> p0) { return null; }
        public java.util.Collection<java.lang.String> resolveEntityListModifications(java.util.Collection<java.lang.String> p0) { return null; }
        public java.util.Collection<java.lang.String> getHints() { return null; }
        public boolean shouldIncludeTypesFromTextClassifier() { return false; }
        public int describeContents() { return 0; }

        public static final class Builder {
            private java.util.Collection<java.lang.String> mIncludedTypes;
            private java.util.Collection<java.lang.String> mExcludedTypes;
            private java.util.Collection<java.lang.String> mHints;
            private boolean mIncludeTypesFromTextClassifier;
            public Builder() {}
            public android.view.textclassifier.TextClassifier.EntityConfig.Builder setIncludedTypes(java.util.Collection<java.lang.String> p0) { return null; }
            public android.view.textclassifier.TextClassifier.EntityConfig.Builder setExcludedTypes(java.util.Collection<java.lang.String> p0) { return null; }
            public android.view.textclassifier.TextClassifier.EntityConfig.Builder includeTypesFromTextClassifier(boolean p0) { return null; }
            public android.view.textclassifier.TextClassifier.EntityConfig.Builder setHints(java.util.Collection<java.lang.String> p0) { return null; }
            public android.view.textclassifier.TextClassifier.EntityConfig build() { return null; }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EntityType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Hints {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TextClassifierType {
    }

    public static final class Utils {
        private static final java.text.BreakIterator WORD_ITERATOR = null;
        public Utils() {}
        static void checkArgument(java.lang.CharSequence p0, int p1, int p2) {}
        static boolean checkTextLength(java.lang.CharSequence p0, int p1) { return false; }
        public static java.lang.String getSubString(java.lang.String p0, int p1, int p2, int p3) { return null; }
        public static android.view.textclassifier.TextLinks generateLegacyLinks(android.view.textclassifier.TextLinks.Request p0) { return null; }
        private static void addLinks(android.view.textclassifier.TextLinks.Builder p0, java.lang.String p1, java.lang.String p2) {}
        private static int linkMask(java.lang.String p0) { return 0; }
        private static java.util.Map<java.lang.String, java.lang.Float> entityScores(java.lang.String p0) { return null; }
        static void checkMainThread() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface WidgetType {
    }
}
