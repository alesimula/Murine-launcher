package com.android.internal.app;

public class LocaleStore {
    public LocaleStore() {}
    public static void updateSimCountries(android.content.Context p0) {}
    public static com.android.internal.app.LocaleStore.LocaleInfo getAppActivatedLocaleInfo(android.content.Context p0, java.lang.String p1, boolean p2) { return null; }
    public static java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> transformImeLanguageTagToLocaleInfo(java.util.List<android.view.inputmethod.InputMethodSubtype> p0) { return null; }
    public static java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> getSystemCurrentLocales() { return null; }
    public static com.android.internal.app.LocaleStore.LocaleInfo getSystemDefaultLocaleInfo(boolean p0) { return null; }
    public static void fillCache(android.content.Context p0) {}
    public static java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> getLevelLocales(android.content.Context p0, java.util.Set<java.lang.String> p1, com.android.internal.app.LocaleStore.LocaleInfo p2, boolean p3) { return null; }
    public static java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> getLevelLocales(android.content.Context p0, java.util.Set<java.lang.String> p1, com.android.internal.app.LocaleStore.LocaleInfo p2, boolean p3, android.os.LocaleList p4) { return null; }
    public static java.util.HashMap<java.lang.String, com.android.internal.app.LocaleStore.LocaleInfo> convertExplicitLocales(android.os.LocaleList p0, java.util.Collection<com.android.internal.app.LocaleStore.LocaleInfo> p1) { return null; }
    public static com.android.internal.app.LocaleStore.LocaleInfo getLocaleInfo(java.util.Locale p0) { return null; }
    public static com.android.internal.app.LocaleStore.LocaleInfo fromLocale(java.util.Locale p0) { return null; }

    public static class LocaleInfo implements java.io.Serializable {
        public static final int SUGGESTION_TYPE_NONE = 0;
        public static final int SUGGESTION_TYPE_SIM = 1;
        public static final int SUGGESTION_TYPE_CFG = 2;
        public static final int SUGGESTION_TYPE_CURRENT = 4;
        public static final int SUGGESTION_TYPE_SYSTEM_LANGUAGE = 8;
        public static final int SUGGESTION_TYPE_OTHER_APP_LANGUAGE = 16;
        public static final int SUGGESTION_TYPE_IME_LANGUAGE = 32;
        public static final int SUGGESTION_TYPE_SYSTEM_AVAILABLE_LANGUAGE = 64;
        public int mSuggestionFlags;
        public boolean hasNumberingSystems() { return false; }
        public java.lang.String toString() { return null; }
        public java.util.Locale getLocale() { return null; }
        public java.util.Locale getParent() { return null; }
        public java.lang.String getId() { return null; }
        public boolean isTranslated() { return false; }
        public void setTranslated(boolean p0) {}
        public boolean isSuggested() { return false; }
        public boolean isSuggestionOfType(int p0) { return false; }
        public void extendSuggestionOfType(int p0) {}
        public java.lang.String getFullNameNative() { return null; }
        public java.lang.String getFullCountryNameNative() { return null; }
        java.lang.String getFullCountryNameInUiLanguage() { return null; }
        public java.lang.String getFullNameInUiLanguage() { return null; }
        java.lang.String getLabel(boolean p0) { return null; }
        java.lang.String getNumberingSystem() { return null; }
        java.lang.String getContentDescription(boolean p0) { return null; }
        public boolean getChecked() { return false; }
        public void setChecked(boolean p0) {}
        public boolean isAppCurrentLocale() { return false; }
        public boolean isSystemLocale() { return false; }
        public boolean isInCurrentSystemLocales() { return false; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface SuggestionType {
        }
    }
}
