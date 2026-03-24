package com.android.internal.os;

public class DebugStore {
    public DebugStore() {}
    public static void setDebugStoreNative(com.android.internal.os.DebugStore.DebugStoreNative p0) {}
    public static void recordScheduleServiceStart(int p0, android.content.Intent p1) {}
    public static long recordServiceStart(int p0) { return 0L; }
    public static void recordScheduleServiceCreate(int p0, android.content.pm.ServiceInfo p1) {}
    public static long recordServiceCreate(int p0) { return 0L; }
    public static void recordScheduleServiceBind(int p0, android.content.Intent p1) {}
    public static long recordServiceBind(int p0) { return 0L; }
    public static void recordScheduleBroadcastReceive(int p0, android.content.Intent p1) {}
    public static long recordBroadcastReceive(int p0, java.lang.String p1) { return 0L; }
    public static void recordScheduleBroadcastReceiveReg(int p0, android.content.Intent p1) {}
    public static long recordBroadcastReceiveReg(int p0, java.lang.String p1) { return 0L; }
    public static void recordGoAsync(int p0) {}
    public static void recordFinish(int p0) {}
    public static void recordScheduleBindApplication() {}
    public static long recordBindApplication() { return 0L; }
    public static void recordScheduleStartJob(int p0, int p1, java.lang.String p2) {}
    public static long recordStartJob(int p0) { return 0L; }
    public static void recordScheduleStopJob(int p0, int p1, java.lang.String p2) {}
    public static long recordStopJob(int p0) { return 0L; }
    public static void recordLongLooperMessage(int p0, java.lang.String p1, long p2) {}
    public static void recordEventEnd(long p0) {}

    public static interface DebugStoreNative {
        public long beginEvent(java.lang.String p0, java.util.List<java.lang.String> p1);
        public void endEvent(long p0, java.util.List<java.lang.String> p1);
        public void recordEvent(java.lang.String p0, java.util.List<java.lang.String> p1);
    }

    private static class DebugStoreNativeImpl implements com.android.internal.os.DebugStore.DebugStoreNative {
        public long beginEvent(java.lang.String p0, java.util.List<java.lang.String> p1) { return 0L; }
        public void endEvent(long p0, java.util.List<java.lang.String> p1) {}
        public void recordEvent(java.lang.String p0, java.util.List<java.lang.String> p1) {}
    }
}
