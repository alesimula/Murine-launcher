package android.icu.text;

public abstract class TimeZoneNames implements java.io.Serializable {
    TimeZoneNames() {}
    public static android.icu.text.TimeZoneNames getInstance(android.icu.util.ULocale p0) { return null; }
    public static android.icu.text.TimeZoneNames getInstance(java.util.Locale p0) { return null; }
    public static android.icu.text.TimeZoneNames getTZDBInstance(android.icu.util.ULocale p0) { return null; }
    public abstract java.util.Set<java.lang.String> getAvailableMetaZoneIDs();
    public abstract java.util.Set<java.lang.String> getAvailableMetaZoneIDs(java.lang.String p0);
    public abstract java.lang.String getMetaZoneID(java.lang.String p0, long p1);
    public abstract java.lang.String getReferenceZoneID(java.lang.String p0, java.lang.String p1);
    public abstract java.lang.String getMetaZoneDisplayName(java.lang.String p0, android.icu.text.TimeZoneNames.NameType p1);
    public final java.lang.String getDisplayName(java.lang.String p0, android.icu.text.TimeZoneNames.NameType p1, long p2) { return null; }
    public abstract java.lang.String getTimeZoneDisplayName(java.lang.String p0, android.icu.text.TimeZoneNames.NameType p1);
    public java.lang.String getExemplarLocationName(java.lang.String p0) { return null; }

    public static enum NameType {
        LONG_GENERIC,
        LONG_STANDARD,
        LONG_DAYLIGHT,
        SHORT_GENERIC,
        SHORT_STANDARD,
        SHORT_DAYLIGHT,
        EXEMPLAR_LOCATION;
        private NameType() {}
    }
}
