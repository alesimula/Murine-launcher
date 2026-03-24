package com.android.internal.http;

public final class HttpDateTime {
    private static final java.lang.String HTTP_DATE_RFC_REGEXP = "([0-9]{1,2})[- ]([A-Za-z]{3,9})[- ]([0-9]{2,4})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])";
    private static final java.lang.String HTTP_DATE_ANSIC_REGEXP = "[ ]([A-Za-z]{3,9})[ ]+([0-9]{1,2})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])[ ]([0-9]{2,4})";
    private static final java.util.regex.Pattern HTTP_DATE_RFC_PATTERN = null;
    private static final java.util.regex.Pattern HTTP_DATE_ANSIC_PATTERN = null;
    public HttpDateTime() {}
    @android.annotation.UnsupportedAppUsage
    public static long parse(java.lang.String p0) throws java.lang.IllegalArgumentException { return 0L; }
    private static int getDate(java.lang.String p0) { return 0; }
    private static int getMonth(java.lang.String p0) { return 0; }
    private static int getYear(java.lang.String p0) { return 0; }
    private static com.android.internal.http.HttpDateTime.TimeOfDay getTime(java.lang.String p0) { return null; }

    private static class TimeOfDay {
        int hour;
        int minute;
        int second;
        TimeOfDay(int p0, int p1, int p2) {}
    }
}
