package com.android.internal.os;

public class ProcessCpuTracker {
    static final int PROCESS_STAT_MINOR_FAULTS = 0;
    static final int PROCESS_STAT_MAJOR_FAULTS = 1;
    static final int PROCESS_STAT_UTIME = 2;
    static final int PROCESS_STAT_STIME = 3;
    static final int PROCESS_FULL_STAT_MINOR_FAULTS = 1;
    static final int PROCESS_FULL_STAT_MAJOR_FAULTS = 2;
    static final int PROCESS_FULL_STAT_UTIME = 3;
    static final int PROCESS_FULL_STAT_STIME = 4;
    static final int PROCESS_FULL_STAT_VSIZE = 5;
    static final int PROCESS_SCHEDSTAT_CPU_TIME = 0;
    static final int PROCESS_SCHEDSTAT_CPU_DELAY_TIME = 1;
    public ProcessCpuTracker(boolean p0) {}
    public void onLoadChanged(float p0, float p1, float p2) {}
    public int onMeasureProcessName(java.lang.String p0) { return 0; }
    public void init() {}
    public void update() {}
    public long getCpuTimeForPid(int p0) { return 0L; }
    public long getCpuDelayTimeForPid(int p0) { return 0L; }
    public final int getLastUserTime() { return 0; }
    public final int getLastSystemTime() { return 0; }
    public final int getLastIoWaitTime() { return 0; }
    public final int getLastIrqTime() { return 0; }
    public final int getLastSoftIrqTime() { return 0; }
    public final int getLastIdleTime() { return 0; }
    public final boolean hasGoodLastStats() { return false; }
    public final float getTotalCpuPercent() { return 0.0f; }
    final void buildWorkingProcs() {}
    public final int countStats() { return 0; }
    public final com.android.internal.os.ProcessCpuTracker.Stats getStats(int p0) { return null; }
    public final java.util.List<com.android.internal.os.ProcessCpuTracker.Stats> getStats(com.android.internal.os.ProcessCpuTracker.FilterStats p0) { return null; }
    public final int countWorkingStats() { return 0; }
    public final com.android.internal.os.ProcessCpuTracker.Stats getWorkingStats(int p0) { return null; }
    public final void dumpProto(java.io.FileDescriptor p0) {}
    public final java.lang.String printCurrentLoad() { return null; }
    public final java.lang.String printCurrentState(long p0) { return null; }
    public final java.lang.String printCurrentState(long p0, int p1) { return null; }

    public static interface FilterStats {
        public boolean needed(com.android.internal.os.ProcessCpuTracker.Stats p0);
    }

    public static class Stats {
        public final int pid = 0;
        public final int uid = 0;
        final java.lang.String statFile = null;
        final java.lang.String cmdlineFile = null;
        final java.lang.String threadsDir = null;
        final java.util.ArrayList<com.android.internal.os.ProcessCpuTracker.Stats> threadStats = null;
        final java.util.ArrayList<com.android.internal.os.ProcessCpuTracker.Stats> workingThreads = null;
        public android.os.BatteryStats.Uid.Proc batteryStats;
        public boolean interesting;
        public java.lang.String baseName;
        public java.lang.String name;
        public int nameWidth;
        public long vsize;
        public long base_uptime;
        public long rel_uptime;
        public long base_utime;
        public long base_stime;
        public int rel_utime;
        public int rel_stime;
        public long base_minfaults;
        public long base_majfaults;
        public int rel_minfaults;
        public int rel_majfaults;
        public boolean active;
        public boolean working;
        public boolean added;
        public boolean removed;
        Stats(int p0, int p1, boolean p2) {}
    }
}
