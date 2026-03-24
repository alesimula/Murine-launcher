package com.android.internal.os;

public class ProcessCpuTracker {
    private static final java.lang.String TAG = "ProcessCpuTracker";
    private static final boolean DEBUG = false;
    private static final boolean localLOGV = false;
    private static final int[] PROCESS_STATS_FORMAT = null;
    static final int PROCESS_STAT_MINOR_FAULTS = 0;
    static final int PROCESS_STAT_MAJOR_FAULTS = 1;
    static final int PROCESS_STAT_UTIME = 2;
    static final int PROCESS_STAT_STIME = 3;
    private final long[] mProcessStatsData = null;
    private final long[] mSinglePidStatsData = null;
    private static final int[] PROCESS_FULL_STATS_FORMAT = null;
    static final int PROCESS_FULL_STAT_MINOR_FAULTS = 1;
    static final int PROCESS_FULL_STAT_MAJOR_FAULTS = 2;
    static final int PROCESS_FULL_STAT_UTIME = 3;
    static final int PROCESS_FULL_STAT_STIME = 4;
    static final int PROCESS_FULL_STAT_VSIZE = 5;
    private final java.lang.String[] mProcessFullStatsStringData = null;
    private final long[] mProcessFullStatsData = null;
    private static final int[] SYSTEM_CPU_FORMAT = null;
    private final long[] mSystemCpuData = null;
    private static final int[] LOAD_AVERAGE_FORMAT = null;
    private final float[] mLoadAverageData = null;
    private final boolean mIncludeThreads = false;
    private final long mJiffyMillis = 0L;
    private float mLoad1;
    private float mLoad5;
    private float mLoad15;
    private long mCurrentSampleTime;
    private long mLastSampleTime;
    private long mCurrentSampleRealTime;
    private long mLastSampleRealTime;
    private long mCurrentSampleWallTime;
    private long mLastSampleWallTime;
    private long mBaseUserTime;
    private long mBaseSystemTime;
    private long mBaseIoWaitTime;
    private long mBaseIrqTime;
    private long mBaseSoftIrqTime;
    private long mBaseIdleTime;
    private int mRelUserTime;
    private int mRelSystemTime;
    private int mRelIoWaitTime;
    private int mRelIrqTime;
    private int mRelSoftIrqTime;
    private int mRelIdleTime;
    private boolean mRelStatsAreGood;
    private int[] mCurPids;
    private int[] mCurThreadPids;
    private final java.util.ArrayList<com.android.internal.os.ProcessCpuTracker.Stats> mProcStats = null;
    private final java.util.ArrayList<com.android.internal.os.ProcessCpuTracker.Stats> mWorkingProcs = null;
    private boolean mWorkingProcsSorted;
    private boolean mFirst;
    private static final java.util.Comparator<com.android.internal.os.ProcessCpuTracker.Stats> sLoadComparator = null;
    @android.annotation.UnsupportedAppUsage
    public ProcessCpuTracker(boolean p0) {}
    public void onLoadChanged(float p0, float p1, float p2) {}
    public int onMeasureProcessName(java.lang.String p0) { return 0; }
    public void init() {}
    @android.annotation.UnsupportedAppUsage
    public void update() {}
    private int[] collectStats(java.lang.String p0, int p1, boolean p2, int[] p3, java.util.ArrayList<com.android.internal.os.ProcessCpuTracker.Stats> p4) { return null; }
    public long getCpuTimeForPid(int p0) { return 0L; }
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
    @android.annotation.UnsupportedAppUsage
    public final int countWorkingStats() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public final com.android.internal.os.ProcessCpuTracker.Stats getWorkingStats(int p0) { return null; }
    public final java.lang.String printCurrentLoad() { return null; }
    public final java.lang.String printCurrentState(long p0) { return null; }
    private void printRatio(java.io.PrintWriter p0, long p1, long p2) {}
    private void printProcessCPU(java.io.PrintWriter p0, java.lang.String p1, int p2, java.lang.String p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, int p11) {}
    private void getName(com.android.internal.os.ProcessCpuTracker.Stats p0, java.lang.String p1) {}

    public static class Stats {
        public final int pid = 0;
        public final int uid = 0;
        final java.lang.String statFile = null;
        final java.lang.String cmdlineFile = null;
        final java.lang.String threadsDir = null;
        final java.util.ArrayList<com.android.internal.os.ProcessCpuTracker.Stats> threadStats = null;
        final java.util.ArrayList<com.android.internal.os.ProcessCpuTracker.Stats> workingThreads = null;
        public com.android.internal.os.BatteryStatsImpl.Uid.Proc batteryStats;
        public boolean interesting;
        public java.lang.String baseName;
        @android.annotation.UnsupportedAppUsage
        public java.lang.String name;
        public int nameWidth;
        public long vsize;
        public long base_uptime;
        @android.annotation.UnsupportedAppUsage
        public long rel_uptime;
        public long base_utime;
        public long base_stime;
        @android.annotation.UnsupportedAppUsage
        public int rel_utime;
        @android.annotation.UnsupportedAppUsage
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
        private static int getUid(java.lang.String p0) { return 0; }
    }

    public static interface FilterStats {
        public boolean needed(com.android.internal.os.ProcessCpuTracker.Stats p0);
    }
}
