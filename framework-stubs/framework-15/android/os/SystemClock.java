package android.os;

public final class SystemClock {
    public static void sleep(long p0) {}
    public static boolean setCurrentTimeMillis(long p0) { return false; }
    public static native long uptimeMillis();
    public static long uptimeMillis$ravenwood() { return 0L; }
    @android.annotation.FlaggedApi("android.os.adpf_gpu_report_actual_work_duration")
    public static native long uptimeNanos();
    public static long uptimeNanos$ravenwood() { return 0L; }
    @android.annotation.NonNull
    public static java.time.Clock uptimeClock() { return null; }
    public static native long elapsedRealtime();
    public static long elapsedRealtime$ravenwood() { return 0L; }
    @android.annotation.NonNull
    public static java.time.Clock elapsedRealtimeClock() { return null; }
    public static native long elapsedRealtimeNanos();
    public static long elapsedRealtimeNanos$ravenwood() { return 0L; }
    public static native long currentThreadTimeMillis();
    public static native long currentThreadTimeMicro();
    public static native long currentTimeMicro();
    public static long currentTimeMicro$ravenwood() { return 0L; }
    public static long currentNetworkTimeMillis() { return 0L; }
    @android.annotation.NonNull
    public static java.time.Clock currentNetworkTimeClock() { return null; }
    @android.annotation.NonNull
    public static java.time.Clock currentGnssTimeClock() { return null; }
}
