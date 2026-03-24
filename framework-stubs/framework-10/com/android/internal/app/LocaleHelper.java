package com.android.internal.app;

public class LocaleHelper {
    public LocaleHelper() {}
    public static java.lang.String toSentenceCase(java.lang.String p0, java.util.Locale p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String normalizeForSearch(java.lang.String p0, java.util.Locale p1) { return null; }
    private static boolean shouldUseDialectName(java.util.Locale p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String getDisplayName(java.util.Locale p0, java.util.Locale p1, boolean p2) { return null; }
    public static java.lang.String getDisplayName(java.util.Locale p0, boolean p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String getDisplayCountry(java.util.Locale p0, java.util.Locale p1) { return null; }
    public static java.lang.String getDisplayCountry(java.util.Locale p0) { return null; }
    public static java.lang.String getDisplayLocaleList(android.os.LocaleList p0, java.util.Locale p1, int p2) { return null; }
    public static java.util.Locale addLikelySubtags(java.util.Locale p0) { return null; }

    public static final class LocaleInfoComparator implements java.util.Comparator<com.android.internal.app.LocaleStore.LocaleInfo> {
        private final java.text.Collator mCollator = null;
        private final boolean mCountryMode = false;
        private static final java.lang.String PREFIX_ARABIC = "ال";
        @android.annotation.UnsupportedAppUsage
        public LocaleInfoComparator(java.util.Locale p0, boolean p1) {}
        private java.lang.String removePrefixForCompare(java.util.Locale p0, java.lang.String p1) { return null; }
        @android.annotation.UnsupportedAppUsage
        public int compare(com.android.internal.app.LocaleStore.LocaleInfo p0, com.android.internal.app.LocaleStore.LocaleInfo p1) { return 0; }
    }
}
