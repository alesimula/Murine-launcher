package com.android.internal.os;

public class KernelMemoryBandwidthStats {
    private static final java.lang.String TAG = "KernelMemoryBandwidthStats";
    private static final java.lang.String mSysfsFile = "/sys/kernel/memory_state_time/show_stat";
    private static final boolean DEBUG = false;
    protected final android.util.LongSparseLongArray mBandwidthEntries = null;
    private boolean mStatsDoNotExist;
    public KernelMemoryBandwidthStats() {}
    public void updateStats() {}
    public void parseStats(java.io.BufferedReader p0) throws java.io.IOException {}
    public android.util.LongSparseLongArray getBandwidthEntries() { return null; }
}
