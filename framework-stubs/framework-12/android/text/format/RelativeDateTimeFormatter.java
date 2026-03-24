package android.text.format;

public final class RelativeDateTimeFormatter {
    public static final long SECOND_IN_MILLIS = 1000L;
    public static final long MINUTE_IN_MILLIS = 60000L;
    public static final long HOUR_IN_MILLIS = 3600000L;
    public static final long DAY_IN_MILLIS = 86400000L;
    public static final long WEEK_IN_MILLIS = 604800000L;
    public static final long YEAR_IN_MILLIS = 31449600000L;
    private static final int DAY_IN_MS = 86400000;
    private static final int EPOCH_JULIAN_DAY = 2440588;
    private static final android.text.format.RelativeDateTimeFormatter.FormatterCache CACHED_FORMATTERS = null;
    private RelativeDateTimeFormatter() {}
    public static java.lang.String getRelativeTimeSpanString(java.util.Locale p0, java.util.TimeZone p1, long p2, long p3, long p4, int p5) { return null; }
    public static java.lang.String getRelativeTimeSpanString(java.util.Locale p0, java.util.TimeZone p1, long p2, long p3, long p4, int p5, android.icu.text.DisplayContext p6) { return null; }
    private static java.lang.String getRelativeTimeSpanString(android.icu.util.ULocale p0, android.icu.util.TimeZone p1, long p2, long p3, long p4, int p5, android.icu.text.DisplayContext p6) { return null; }
    public static java.lang.String getRelativeDateTimeString(java.util.Locale p0, java.util.TimeZone p1, long p2, long p3, long p4, long p5, int p6) { return null; }
    private static android.icu.text.RelativeDateTimeFormatter getFormatter(android.icu.util.ULocale p0, android.icu.text.RelativeDateTimeFormatter.Style p1, android.icu.text.DisplayContext p2) { return null; }
    private static int dayDistance(android.icu.util.TimeZone p0, long p1, long p2) { return 0; }
    private static int julianDay(android.icu.util.TimeZone p0, long p1) { return 0; }

    static class FormatterCache extends android.util.LruCache<java.lang.String, android.icu.text.RelativeDateTimeFormatter> {
        FormatterCache() { super(0); }
    }
}
