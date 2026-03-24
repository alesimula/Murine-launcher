package android.text.format;

public final class DateUtilsBridge {
    public DateUtilsBridge() {}
    public static android.icu.util.TimeZone icuTimeZone(java.util.TimeZone p0) { return null; }
    public static android.icu.util.Calendar createIcuCalendar(android.icu.util.TimeZone p0, android.icu.util.ULocale p1, long p2) { return null; }
    public static java.lang.String toSkeleton(android.icu.util.Calendar p0, int p1) { return null; }
    public static java.lang.String toSkeleton(android.icu.util.Calendar p0, android.icu.util.Calendar p1, int p2) { return null; }
    public static int dayDistance(android.icu.util.Calendar p0, android.icu.util.Calendar p1) { return 0; }
    public static boolean isDisplayMidnightUsingSkeleton(android.icu.util.Calendar p0) { return false; }
    private static boolean onTheHour(android.icu.util.Calendar p0) { return false; }
    private static boolean fallOnDifferentDates(android.icu.util.Calendar p0, android.icu.util.Calendar p1) { return false; }
    private static boolean fallInSameMonth(android.icu.util.Calendar p0, android.icu.util.Calendar p1) { return false; }
    private static boolean fallInSameYear(android.icu.util.Calendar p0, android.icu.util.Calendar p1) { return false; }
    private static boolean isThisYear(android.icu.util.Calendar p0) { return false; }
}
