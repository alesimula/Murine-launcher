package com.android.internal.util;

public class PerfettoTrigger {
    private static final java.lang.String TAG = "PerfettoTrigger";
    private static final java.lang.String TRIGGER_COMMAND = "/system/bin/trigger_perfetto";
    private static final long THROTTLE_MILLIS = 60000L;
    private static volatile long sLastTriggerTime;
    public PerfettoTrigger() {}
    public static void trigger(java.lang.String p0) {}
}
