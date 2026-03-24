package com.android.internal.app;

public class LocaleStore {
    public LocaleStore() {}
    public static void updateSimCountries(android.content.Context p0) {}
    public static com.android.internal.app.LocaleStore.LocaleInfo getAppCurrentLocaleInfo(android.content.Context p0, java.lang.String p1) { return null; }
    public static java.util.List<com.android.internal.app.LocaleStore.LocaleInfo> getSystemCurrentLocaleInfo() { return null; }
    public static com.android.internal.app.LocaleStore.LocaleInfo getSystemDefaultLocaleInfo(boolean p0) { return null; }
    public static void fillCache(android.content.Context p0) {}
    public static java.util.Set<com.android.internal.app.LocaleStore.LocaleInfo> getLevelLocales(android.content.Context p0, java.util.Set<java.lang.String> p1, com.android.internal.app.LocaleStore.LocaleInfo p2, boolean p3) { return null; }
    public static com.android.internal.app.LocaleStore.LocaleInfo getLocaleInfo(java.util.Locale p0) { return null; }

    public static class LocaleInfo implements java.io.Serializable {
        public java.lang.String toString() { return null; }
        public java.util.Locale getLocale() { return null; }
        public java.util.Locale getParent() { return null; }
        public java.lang.String getId() { return null; }
        public boolean isTranslated() { return false; }
        public void setTranslated(boolean p0) {}
        boolean isSuggested() { return false; }
        public java.lang.String getFullNameNative() { return null; }
        java.lang.String getFullCountryNameNative() { return null; }
        java.lang.String getFullCountryNameInUiLanguage() { return null; }
        public java.lang.String getFullNameInUiLanguage() { return null; }
        java.lang.String getLabel(boolean p0) { return null; }
        java.lang.String getContentDescription(boolean p0) { return null; }
        public boolean getChecked() { return false; }
        public void setChecked(boolean p0) {}
        public boolean isAppCurrentLocale() { return false; }
        public boolean isSystemLocale() { return false; }
    }
}
