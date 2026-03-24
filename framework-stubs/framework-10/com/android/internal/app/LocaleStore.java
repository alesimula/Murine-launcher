package com.android.internal.app;

public class LocaleStore {
    private static final java.util.HashMap<java.lang.String, com.android.internal.app.LocaleStore.LocaleInfo> sLocaleCache = null;
    private static boolean sFullyInitialized;
    public LocaleStore() {}
    private static java.util.Set<java.lang.String> getSimCountries(android.content.Context p0) { return null; }
    public static void updateSimCountries(android.content.Context p0) {}
    private static void addSuggestedLocalesForRegion(java.util.Locale p0) {}
    @android.annotation.UnsupportedAppUsage
    public static void fillCache(android.content.Context p0) {}
    private static int getLevel(java.util.Set<java.lang.String> p0, com.android.internal.app.LocaleStore.LocaleInfo p1, boolean p2) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> getLevelLocales(android.content.Context p0, java.util.Set<java.lang.String> p1, com.android.internal.app.LocaleStore.LocaleInfo p2, boolean p3) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static com.android.internal.app.LocaleStore.LocaleInfo getLocaleInfo(java.util.Locale p0) { return null; }

    public static class LocaleInfo implements java.io.Serializable {
        private static final int SUGGESTION_TYPE_NONE = 0;
        private static final int SUGGESTION_TYPE_SIM = 1;
        private static final int SUGGESTION_TYPE_CFG = 2;
        private final java.util.Locale mLocale = null;
        private final java.util.Locale mParent = null;
        private final java.lang.String mId = null;
        private boolean mIsTranslated;
        private boolean mIsPseudo;
        private boolean mIsChecked;
        private int mSuggestionFlags;
        private java.lang.String mFullNameNative;
        private java.lang.String mFullCountryNameNative;
        private java.lang.String mLangScriptKey;
        private LocaleInfo(java.util.Locale p0) {}
        private LocaleInfo(java.lang.String p0) {}
        private static java.util.Locale getParent(java.util.Locale p0) { return null; }
        public java.lang.String toString() { return null; }
        @android.annotation.UnsupportedAppUsage
        public java.util.Locale getLocale() { return null; }
        @android.annotation.UnsupportedAppUsage
        public java.util.Locale getParent() { return null; }
        @android.annotation.UnsupportedAppUsage
        public java.lang.String getId() { return null; }
        public boolean isTranslated() { return false; }
        public void setTranslated(boolean p0) {}
        boolean isSuggested() { return false; }
        private boolean isSuggestionOfType(int p0) { return false; }
        @android.annotation.UnsupportedAppUsage
        public java.lang.String getFullNameNative() { return null; }
        java.lang.String getFullCountryNameNative() { return null; }
        java.lang.String getFullCountryNameInUiLanguage() { return null; }
        @android.annotation.UnsupportedAppUsage
        public java.lang.String getFullNameInUiLanguage() { return null; }
        private java.lang.String getLangScriptKey() { return null; }
        java.lang.String getLabel(boolean p0) { return null; }
        java.lang.String getContentDescription(boolean p0) { return null; }
        public boolean getChecked() { return false; }
        public void setChecked(boolean p0) {}
    }
}
