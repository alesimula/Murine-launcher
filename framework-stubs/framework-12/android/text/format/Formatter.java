package android.text.format;

public final class Formatter {
    public static final int FLAG_SHORTER = 1;
    public static final int FLAG_CALCULATE_ROUNDED = 2;
    public static final int FLAG_SI_UNITS = 4;
    public static final int FLAG_IEC_UNITS = 8;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int MILLIS_PER_MINUTE = 60000;
    public Formatter() {}
    private static java.util.Locale localeFromContext(android.content.Context p0) { return null; }
    private static java.lang.String bidiWrap(android.content.Context p0, java.lang.String p1) { return null; }
    public static java.lang.String formatFileSize(android.content.Context p0, long p1) { return null; }
    public static java.lang.String formatFileSize(android.content.Context p0, long p1, int p2) { return null; }
    public static java.lang.String formatShortFileSize(android.content.Context p0, long p1) { return null; }
    public static android.text.format.Formatter.BytesResult formatBytes(android.content.res.Resources p0, long p1, int p2) { return null; }
    @java.lang.Deprecated
    public static java.lang.String formatIpAddress(int p0) { return null; }
    public static java.lang.String formatShortElapsedTime(android.content.Context p0, long p1) { return null; }
    public static java.lang.String formatShortElapsedTimeRoundingUpToMinutes(android.content.Context p0, long p1) { return null; }

    public static class BytesResult {
        public final java.lang.String value = null;
        public final java.lang.String units = null;
        public final long roundedBytes = 0L;
        public BytesResult(java.lang.String p0, java.lang.String p1, long p2) {}
    }
}
