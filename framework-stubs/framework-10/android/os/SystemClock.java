package android.os;

public final class SystemClock {
    private static final java.lang.String TAG = "SystemClock";
    @android.annotation.UnsupportedAppUsage
    private SystemClock() {}
    public static void sleep(long p0) {}
    public static boolean setCurrentTimeMillis(long p0) { return false; }
    public static native long uptimeMillis();
    @java.lang.Deprecated
    public static java.time.Clock uptimeMillisClock() { return null; }
    public static java.time.Clock uptimeClock() { return null; }
    public static native long elapsedRealtime();
    public static java.time.Clock elapsedRealtimeClock() { return null; }
    public static native long elapsedRealtimeNanos();
    public static native long currentThreadTimeMillis();
    @android.annotation.UnsupportedAppUsage
    public static native long currentThreadTimeMicro();
    @android.annotation.UnsupportedAppUsage
    public static native long currentTimeMicro();
    public static long currentNetworkTimeMillis() { return 0L; }
    public static java.time.Clock currentNetworkTimeClock() { return null; }
    public static java.time.Clock currentGnssTimeClock() { return null; }
}
