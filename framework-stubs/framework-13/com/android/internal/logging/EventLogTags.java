package com.android.internal.logging;

public class EventLogTags {
    public static final int SYSUI_VIEW_VISIBILITY = 524287;
    public static final int SYSUI_ACTION = 524288;
    public static final int SYSUI_MULTI_ACTION = 524292;
    public static final int SYSUI_COUNT = 524290;
    public static final int SYSUI_HISTOGRAM = 524291;
    public static final int SYSUI_LATENCY = 36070;
    public static final int COMMIT_SYS_CONFIG_FILE = 525000;
    public static void writeSysuiViewVisibility(int p0, int p1) {}
    public static void writeSysuiAction(int p0, java.lang.String p1) {}
    public static void writeSysuiMultiAction(java.lang.Object[] p0) {}
    public static void writeSysuiCount(java.lang.String p0, int p1) {}
    public static void writeSysuiHistogram(java.lang.String p0, int p1) {}
    public static void writeSysuiLatency(int p0, int p1) {}
    public static void writeCommitSysConfigFile(java.lang.String p0, long p1) {}
}
