package android.text.format;

public class DateFormat {
    @java.lang.Deprecated
    public static final char QUOTE = '\'';
    @java.lang.Deprecated
    public static final char AM_PM = 'a';
    @java.lang.Deprecated
    public static final char CAPITAL_AM_PM = 'A';
    @java.lang.Deprecated
    public static final char DATE = 'd';
    @java.lang.Deprecated
    public static final char DAY = 'E';
    @java.lang.Deprecated
    public static final char HOUR = 'h';
    @java.lang.Deprecated
    public static final char HOUR_OF_DAY = 'k';
    @java.lang.Deprecated
    public static final char MINUTE = 'm';
    @java.lang.Deprecated
    public static final char MONTH = 'M';
    @java.lang.Deprecated
    public static final char STANDALONE_MONTH = 'L';
    @java.lang.Deprecated
    public static final char SECONDS = 's';
    @java.lang.Deprecated
    public static final char TIME_ZONE = 'z';
    @java.lang.Deprecated
    public static final char YEAR = 'y';
    static final long DISALLOW_DUPLICATE_FIELD_IN_SKELETON = 170233598L;
    public DateFormat() {}
    public static boolean is24HourFormat(android.content.Context p0) { return false; }
    public static boolean is24HourFormat(android.content.Context p0, int p1) { return false; }
    public static boolean is24HourLocale(java.util.Locale p0) { return false; }
    public static java.lang.String getBestDateTimePattern(java.util.Locale p0, java.lang.String p1) { return null; }
    public static java.text.DateFormat getTimeFormat(android.content.Context p0) { return null; }
    public static java.lang.String getTimeFormatString(android.content.Context p0) { return null; }
    public static java.lang.String getTimeFormatString(android.content.Context p0, int p1) { return null; }
    public static java.text.DateFormat getDateFormat(android.content.Context p0) { return null; }
    public static java.text.DateFormat getLongDateFormat(android.content.Context p0) { return null; }
    public static java.text.DateFormat getMediumDateFormat(android.content.Context p0) { return null; }
    public static char[] getDateFormatOrder(android.content.Context p0) { return null; }
    public static char[] getDateFormatOrder(java.lang.String p0) { return null; }
    public static java.lang.CharSequence format(java.lang.CharSequence p0, long p1) { return null; }
    public static java.lang.CharSequence format(java.lang.CharSequence p0, java.util.Date p1) { return null; }
    public static boolean hasSeconds(java.lang.CharSequence p0) { return false; }
    public static boolean hasDesignator(java.lang.CharSequence p0, char p1) { return false; }
    public static java.lang.CharSequence format(java.lang.CharSequence p0, java.util.Calendar p1) { return null; }
    public static int appendQuotedText(android.text.SpannableStringBuilder p0, int p1) { return 0; }
    public static android.icu.text.DateFormatSymbols getIcuDateFormatSymbols(java.util.Locale p0) { return null; }
}
