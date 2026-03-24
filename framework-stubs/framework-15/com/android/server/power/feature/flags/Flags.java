package com.android.server.power.feature.flags;

public final class Flags {
    public static final java.lang.String FLAG_ENABLE_EARLY_SCREEN_TIMEOUT_DETECTOR = "com.android.server.power.feature.flags.enable_early_screen_timeout_detector";
    public static final java.lang.String FLAG_IMPROVE_WAKELOCK_LATENCY = "com.android.server.power.feature.flags.improve_wakelock_latency";
    public Flags() {}
    public static boolean enableEarlyScreenTimeoutDetector() { return false; }
    public static boolean improveWakelockLatency() { return false; }
}
