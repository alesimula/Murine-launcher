package android.util;

public class TimeUtils {
    private static java.text.SimpleDateFormat sLoggingFormat;
    public static final java.text.SimpleDateFormat sDumpDateFormat = null;
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_DAY = 86400;
    public static final long NANOS_PER_MS = 1000000L;
    private static final java.lang.Object sFormatSync = null;
    private static char[] sFormatStr;
    private static char[] sTmpFormatStr;
    public TimeUtils() {}
    public static java.util.TimeZone getTimeZone(int p0, boolean p1, long p2, java.lang.String p3) { return null; }
    private static android.icu.util.TimeZone getIcuTimeZone(int p0, boolean p1, long p2, java.lang.String p3) { return null; }
    public static java.util.List<java.lang.String> getTimeZoneIdsForCountryCode(java.lang.String p0) { return null; }
    public static java.lang.String getTimeZoneDatabaseVersion() { return null; }
    private static int accumField(int p0, int p1, boolean p2, int p3) { return 0; }
    private static int printFieldLocked(char[] p0, int p1, char p2, int p3, boolean p4, int p5) { return 0; }
    private static int formatDurationLocked(long p0, int p1) { return 0; }
    public static void formatDuration(long p0, java.lang.StringBuilder p1) {}
    public static void formatDuration(long p0, java.lang.StringBuilder p1, int p2) {}
    public static void formatDuration(long p0, java.io.PrintWriter p1, int p2) {}
    public static java.lang.String formatDuration(long p0) { return null; }
    public static void formatDuration(long p0, java.io.PrintWriter p1) {}
    public static void formatDuration(long p0, long p1, java.io.PrintWriter p2) {}
    public static java.lang.String formatUptime(long p0) { return null; }
    public static java.lang.String formatRealtime(long p0) { return null; }
    public static java.lang.String formatTime(long p0, long p1) { return null; }
    public static java.lang.String logTimeOfDay(long p0) { return null; }
    public static java.lang.String formatForLogging(long p0) { return null; }
    public static void dumpTime(java.io.PrintWriter p0, long p1) {}
    public static boolean isTimeBetween(java.time.LocalTime p0, java.time.LocalTime p1, java.time.LocalTime p2) { return false; }
    public static void dumpTimeWithDelta(java.io.PrintWriter p0, long p1, long p2) {}
}
