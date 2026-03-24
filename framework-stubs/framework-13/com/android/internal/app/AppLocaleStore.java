package com.android.internal.app;

class AppLocaleStore {
    AppLocaleStore() {}
    public static com.android.internal.app.AppLocaleStore.AppLocaleResult getAppSupportedLocales(android.content.Context p0, java.lang.String p1) { return null; }

    static class AppLocaleResult {
        com.android.internal.app.AppLocaleStore.AppLocaleResult.LocaleStatus mLocaleStatus;
        java.util.HashSet<java.util.Locale> mAppSupportedLocales;
        public AppLocaleResult(com.android.internal.app.AppLocaleStore.AppLocaleResult.LocaleStatus p0, java.util.HashSet<java.util.Locale> p1) {}

        static enum LocaleStatus {
            UNKNOWN_FAILURE,
            NO_SUPPORTED_LANGUAGE_IN_APP,
            ASSET_LOCALE_IS_EMPTY,
            GET_SUPPORTED_LANGUAGE_FROM_LOCAL_CONFIG,
            GET_SUPPORTED_LANGUAGE_FROM_ASSET;
        }
    }
}
