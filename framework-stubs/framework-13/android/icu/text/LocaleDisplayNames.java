package android.icu.text;

public abstract class LocaleDisplayNames {
    LocaleDisplayNames() {}
    public static android.icu.text.LocaleDisplayNames getInstance(android.icu.util.ULocale p0) { return null; }
    public static android.icu.text.LocaleDisplayNames getInstance(java.util.Locale p0) { return null; }
    public static android.icu.text.LocaleDisplayNames getInstance(android.icu.util.ULocale p0, android.icu.text.LocaleDisplayNames.DialectHandling p1) { return null; }
    public static android.icu.text.LocaleDisplayNames getInstance(android.icu.util.ULocale p0, android.icu.text.DisplayContext... p1) { return null; }
    public static android.icu.text.LocaleDisplayNames getInstance(java.util.Locale p0, android.icu.text.DisplayContext... p1) { return null; }
    public abstract android.icu.util.ULocale getLocale();
    public abstract android.icu.text.LocaleDisplayNames.DialectHandling getDialectHandling();
    public abstract android.icu.text.DisplayContext getContext(android.icu.text.DisplayContext.Type p0);
    public abstract java.lang.String localeDisplayName(android.icu.util.ULocale p0);
    public abstract java.lang.String localeDisplayName(java.util.Locale p0);
    public abstract java.lang.String localeDisplayName(java.lang.String p0);
    public abstract java.lang.String languageDisplayName(java.lang.String p0);
    public abstract java.lang.String scriptDisplayName(java.lang.String p0);
    public abstract java.lang.String scriptDisplayName(int p0);
    public abstract java.lang.String regionDisplayName(java.lang.String p0);
    public abstract java.lang.String variantDisplayName(java.lang.String p0);
    public abstract java.lang.String keyDisplayName(java.lang.String p0);
    public abstract java.lang.String keyValueDisplayName(java.lang.String p0, java.lang.String p1);
    public java.util.List<android.icu.text.LocaleDisplayNames.UiListItem> getUiList(java.util.Set<android.icu.util.ULocale> p0, boolean p1, java.util.Comparator<java.lang.Object> p2) { return null; }
    public abstract java.util.List<android.icu.text.LocaleDisplayNames.UiListItem> getUiListCompareWholeItems(java.util.Set<android.icu.util.ULocale> p0, java.util.Comparator<android.icu.text.LocaleDisplayNames.UiListItem> p1);

    public static enum DialectHandling {
        STANDARD_NAMES,
        DIALECT_NAMES;
        private DialectHandling() {}
    }

    public static class UiListItem {
        public final android.icu.util.ULocale minimized = null;
        public final android.icu.util.ULocale modified = null;
        public final java.lang.String nameInDisplayLocale = null;
        public final java.lang.String nameInSelf = null;
        public UiListItem(android.icu.util.ULocale p0, android.icu.util.ULocale p1, java.lang.String p2, java.lang.String p3) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public static java.util.Comparator<android.icu.text.LocaleDisplayNames.UiListItem> getComparator(java.util.Comparator<java.lang.Object> p0, boolean p1) { return null; }
    }
}
