package android.text.format;

public class DateUtils {
    private static final java.lang.Object sLock = null;
    private static android.content.res.Configuration sLastConfig;
    private static java.lang.String sElapsedFormatMMSS;
    private static java.lang.String sElapsedFormatHMMSS;
    public static final long SECOND_IN_MILLIS = 1000L;
    public static final long MINUTE_IN_MILLIS = 60000L;
    public static final long HOUR_IN_MILLIS = 3600000L;
    public static final long DAY_IN_MILLIS = 86400000L;
    public static final long WEEK_IN_MILLIS = 604800000L;
    @java.lang.Deprecated
    public static final long YEAR_IN_MILLIS = 31449600000L;
    public static final int FORMAT_SHOW_TIME = 1;
    public static final int FORMAT_SHOW_WEEKDAY = 2;
    public static final int FORMAT_SHOW_YEAR = 4;
    public static final int FORMAT_NO_YEAR = 8;
    public static final int FORMAT_SHOW_DATE = 16;
    public static final int FORMAT_NO_MONTH_DAY = 32;
    @java.lang.Deprecated
    public static final int FORMAT_12HOUR = 64;
    @java.lang.Deprecated
    public static final int FORMAT_24HOUR = 128;
    @java.lang.Deprecated
    public static final int FORMAT_CAP_AMPM = 256;
    public static final int FORMAT_NO_NOON = 512;
    @java.lang.Deprecated
    public static final int FORMAT_CAP_NOON = 1024;
    public static final int FORMAT_NO_MIDNIGHT = 2048;
    @java.lang.Deprecated
    public static final int FORMAT_CAP_MIDNIGHT = 4096;
    @java.lang.Deprecated
    public static final int FORMAT_UTC = 8192;
    public static final int FORMAT_ABBREV_TIME = 16384;
    public static final int FORMAT_ABBREV_WEEKDAY = 32768;
    public static final int FORMAT_ABBREV_MONTH = 65536;
    public static final int FORMAT_NUMERIC_DATE = 131072;
    public static final int FORMAT_ABBREV_RELATIVE = 262144;
    public static final int FORMAT_ABBREV_ALL = 524288;
    @java.lang.Deprecated
    public static final int FORMAT_CAP_NOON_MIDNIGHT = 5120;
    @java.lang.Deprecated
    public static final int FORMAT_NO_NOON_MIDNIGHT = 2560;
    @java.lang.Deprecated
    public static final java.lang.String HOUR_MINUTE_24 = "%H:%M";
    public static final java.lang.String MONTH_FORMAT = "%B";
    @java.lang.Deprecated
    public static final java.lang.String ABBREV_MONTH_FORMAT = "%b";
    public static final java.lang.String NUMERIC_MONTH_FORMAT = "%m";
    public static final java.lang.String MONTH_DAY_FORMAT = "%-d";
    public static final java.lang.String YEAR_FORMAT = "%Y";
    public static final java.lang.String YEAR_FORMAT_TWO_DIGITS = "%g";
    public static final java.lang.String WEEKDAY_FORMAT = "%A";
    public static final java.lang.String ABBREV_WEEKDAY_FORMAT = "%a";
    @java.lang.Deprecated
    public static final int[] sameYearTable = null;
    @java.lang.Deprecated
    public static final int[] sameMonthTable = null;
    @java.lang.Deprecated
    public static final int LENGTH_LONG = 10;
    @java.lang.Deprecated
    public static final int LENGTH_MEDIUM = 20;
    @java.lang.Deprecated
    public static final int LENGTH_SHORT = 30;
    @java.lang.Deprecated
    public static final int LENGTH_SHORTER = 40;
    @java.lang.Deprecated
    public static final int LENGTH_SHORTEST = 50;
    private static android.text.format.Time sNowTime;
    private static android.text.format.Time sThenTime;
    public DateUtils() {}
    @java.lang.Deprecated
    public static java.lang.String getDayOfWeekString(int p0, int p1) { return null; }
    @java.lang.Deprecated
    public static java.lang.String getAMPMString(int p0) { return null; }
    @java.lang.Deprecated
    public static java.lang.String getMonthString(int p0, int p1) { return null; }
    public static java.lang.CharSequence getRelativeTimeSpanString(long p0) { return null; }
    public static java.lang.CharSequence getRelativeTimeSpanString(long p0, long p1, long p2) { return null; }
    public static java.lang.CharSequence getRelativeTimeSpanString(long p0, long p1, long p2, int p3) { return null; }
    public static java.lang.CharSequence getRelativeDateTimeString(android.content.Context p0, long p1, long p2, long p3, int p4) { return null; }
    private static void initFormatStrings() {}
    private static void initFormatStringsLocked() {}
    public static java.lang.CharSequence formatDuration(long p0) { return null; }
    public static java.lang.CharSequence formatDuration(long p0, int p1) { return null; }
    public static java.lang.String formatElapsedTime(long p0) { return null; }
    public static java.lang.String formatElapsedTime(java.lang.StringBuilder p0, long p1) { return null; }
    public static final java.lang.CharSequence formatSameDayTime(long p0, long p1, int p2, int p3) { return null; }
    public static boolean isToday(long p0) { return false; }
    private static boolean isSameDate(long p0, long p1) { return false; }
    public static java.lang.String formatDateRange(android.content.Context p0, long p1, long p2, int p3) { return null; }
    public static java.util.Formatter formatDateRange(android.content.Context p0, java.util.Formatter p1, long p2, long p3, int p4) { return null; }
    public static java.util.Formatter formatDateRange(android.content.Context p0, java.util.Formatter p1, long p2, long p3, int p4, java.lang.String p5) { return null; }
    public static java.lang.String formatDateTime(android.content.Context p0, long p1, int p2) { return null; }
    public static java.lang.CharSequence getRelativeTimeSpanString(android.content.Context p0, long p1, boolean p2) { return null; }
    public static java.lang.CharSequence getRelativeTimeSpanString(android.content.Context p0, long p1) { return null; }
}
