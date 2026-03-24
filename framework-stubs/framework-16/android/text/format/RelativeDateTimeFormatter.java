package android.text.format;

public final class RelativeDateTimeFormatter {
    public static final long SECOND_IN_MILLIS = 1000L;
    public static final long MINUTE_IN_MILLIS = 60000L;
    public static final long HOUR_IN_MILLIS = 3600000L;
    public static final long DAY_IN_MILLIS = 86400000L;
    public static final long WEEK_IN_MILLIS = 604800000L;
    public static final long YEAR_IN_MILLIS = 31449600000L;
    public static java.lang.String getRelativeTimeSpanString(java.util.Locale p0, java.util.TimeZone p1, long p2, long p3, long p4, int p5) { return null; }
    public static java.lang.String getRelativeTimeSpanString(java.util.Locale p0, java.util.TimeZone p1, long p2, long p3, long p4, int p5, android.icu.text.DisplayContext p6) { return null; }
    public static java.lang.String getRelativeDateTimeString(java.util.Locale p0, java.util.TimeZone p1, long p2, long p3, long p4, long p5, int p6) { return null; }

    static class FormatterCache extends android.util.LruCache<java.lang.String, android.icu.text.RelativeDateTimeFormatter> {
        FormatterCache() { super(0); }
    }
}
