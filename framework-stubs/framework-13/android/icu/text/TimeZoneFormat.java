package android.icu.text;

public class TimeZoneFormat extends android.icu.text.UFormat implements android.icu.util.Freezable<android.icu.text.TimeZoneFormat>, java.io.Serializable {
    protected TimeZoneFormat(android.icu.util.ULocale p0) { super(); }
    public static android.icu.text.TimeZoneFormat getInstance(android.icu.util.ULocale p0) { return null; }
    public static android.icu.text.TimeZoneFormat getInstance(java.util.Locale p0) { return null; }
    public android.icu.text.TimeZoneNames getTimeZoneNames() { return null; }
    public android.icu.text.TimeZoneFormat setTimeZoneNames(android.icu.text.TimeZoneNames p0) { return null; }
    public java.lang.String getGMTPattern() { return null; }
    public android.icu.text.TimeZoneFormat setGMTPattern(java.lang.String p0) { return null; }
    public java.lang.String getGMTOffsetPattern(android.icu.text.TimeZoneFormat.GMTOffsetPatternType p0) { return null; }
    public android.icu.text.TimeZoneFormat setGMTOffsetPattern(android.icu.text.TimeZoneFormat.GMTOffsetPatternType p0, java.lang.String p1) { return null; }
    public java.lang.String getGMTOffsetDigits() { return null; }
    public android.icu.text.TimeZoneFormat setGMTOffsetDigits(java.lang.String p0) { return null; }
    public java.lang.String getGMTZeroFormat() { return null; }
    public android.icu.text.TimeZoneFormat setGMTZeroFormat(java.lang.String p0) { return null; }
    public android.icu.text.TimeZoneFormat setDefaultParseOptions(java.util.EnumSet<android.icu.text.TimeZoneFormat.ParseOption> p0) { return null; }
    public java.util.EnumSet<android.icu.text.TimeZoneFormat.ParseOption> getDefaultParseOptions() { return null; }
    public final java.lang.String formatOffsetISO8601Basic(int p0, boolean p1, boolean p2, boolean p3) { return null; }
    public final java.lang.String formatOffsetISO8601Extended(int p0, boolean p1, boolean p2, boolean p3) { return null; }
    public java.lang.String formatOffsetLocalizedGMT(int p0) { return null; }
    public java.lang.String formatOffsetShortLocalizedGMT(int p0) { return null; }
    public final java.lang.String format(android.icu.text.TimeZoneFormat.Style p0, android.icu.util.TimeZone p1, long p2) { return null; }
    public java.lang.String format(android.icu.text.TimeZoneFormat.Style p0, android.icu.util.TimeZone p1, long p2, android.icu.util.Output<android.icu.text.TimeZoneFormat.TimeType> p3) { return null; }
    public final int parseOffsetISO8601(java.lang.String p0, java.text.ParsePosition p1) { return 0; }
    public int parseOffsetLocalizedGMT(java.lang.String p0, java.text.ParsePosition p1) { return 0; }
    public int parseOffsetShortLocalizedGMT(java.lang.String p0, java.text.ParsePosition p1) { return 0; }
    public android.icu.util.TimeZone parse(android.icu.text.TimeZoneFormat.Style p0, java.lang.String p1, java.text.ParsePosition p2, java.util.EnumSet<android.icu.text.TimeZoneFormat.ParseOption> p3, android.icu.util.Output<android.icu.text.TimeZoneFormat.TimeType> p4) { return null; }
    public android.icu.util.TimeZone parse(android.icu.text.TimeZoneFormat.Style p0, java.lang.String p1, java.text.ParsePosition p2, android.icu.util.Output<android.icu.text.TimeZoneFormat.TimeType> p3) { return null; }
    public final android.icu.util.TimeZone parse(java.lang.String p0, java.text.ParsePosition p1) { return null; }
    public final android.icu.util.TimeZone parse(java.lang.String p0) throws java.text.ParseException { return null; }
    public java.lang.StringBuffer format(java.lang.Object p0, java.lang.StringBuffer p1, java.text.FieldPosition p2) { return null; }
    public java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object p0) { return null; }
    public java.lang.Object parseObject(java.lang.String p0, java.text.ParsePosition p1) { return null; }
    public boolean isFrozen() { return false; }
    public android.icu.text.TimeZoneFormat freeze() { return null; }
    public android.icu.text.TimeZoneFormat cloneAsThawed() { return null; }

    public static enum GMTOffsetPatternType {
        POSITIVE_HM,
        POSITIVE_HMS,
        NEGATIVE_HM,
        NEGATIVE_HMS,
        POSITIVE_H,
        NEGATIVE_H;
        private GMTOffsetPatternType() {}
    }

    public static enum ParseOption {
        ALL_STYLES,
        TZ_DATABASE_ABBREVIATIONS;
        private ParseOption() {}
    }

    public static enum Style {
        GENERIC_LOCATION,
        GENERIC_LONG,
        GENERIC_SHORT,
        SPECIFIC_LONG,
        SPECIFIC_SHORT,
        LOCALIZED_GMT,
        LOCALIZED_GMT_SHORT,
        ISO_BASIC_SHORT,
        ISO_BASIC_LOCAL_SHORT,
        ISO_BASIC_FIXED,
        ISO_BASIC_LOCAL_FIXED,
        ISO_BASIC_FULL,
        ISO_BASIC_LOCAL_FULL,
        ISO_EXTENDED_FIXED,
        ISO_EXTENDED_LOCAL_FIXED,
        ISO_EXTENDED_FULL,
        ISO_EXTENDED_LOCAL_FULL,
        ZONE_ID,
        ZONE_ID_SHORT,
        EXEMPLAR_LOCATION;
        private Style() {}
    }

    public static enum TimeType {
        UNKNOWN,
        STANDARD,
        DAYLIGHT;
        private TimeType() {}
    }
}
