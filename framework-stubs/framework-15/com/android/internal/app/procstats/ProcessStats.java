package com.android.internal.app.procstats;

public final class ProcessStats implements android.os.Parcelable {
    public static final java.lang.String TAG = "ProcessStats";
    static final boolean DEBUG = false;
    static final boolean DEBUG_PARCEL = false;
    public static final java.lang.String SERVICE_NAME = "procstats";
    public static long COMMIT_PERIOD;
    public static long COMMIT_UPTIME_PERIOD;
    public static final int STATE_NOTHING = -1;
    public static final int STATE_PERSISTENT = 0;
    public static final int STATE_TOP = 1;
    public static final int STATE_BOUND_TOP = 2;
    public static final int STATE_FGS = 3;
    public static final int STATE_BOUND_FGS = 4;
    public static final int STATE_IMPORTANT_FOREGROUND = 5;
    public static final int STATE_IMPORTANT_BACKGROUND = 6;
    public static final int STATE_BACKUP = 7;
    public static final int STATE_SERVICE = 8;
    public static final int STATE_SERVICE_RESTARTING = 9;
    public static final int STATE_RECEIVER = 10;
    public static final int STATE_HEAVY_WEIGHT = 11;
    public static final int STATE_HOME = 12;
    public static final int STATE_LAST_ACTIVITY = 13;
    public static final int STATE_CACHED = 14;
    public static final int STATE_FROZEN = 15;
    public static final int STATE_COUNT = 16;
    public static final int PSS_SAMPLE_COUNT = 0;
    public static final int PSS_MINIMUM = 1;
    public static final int PSS_AVERAGE = 2;
    public static final int PSS_MAXIMUM = 3;
    public static final int PSS_USS_MINIMUM = 4;
    public static final int PSS_USS_AVERAGE = 5;
    public static final int PSS_USS_MAXIMUM = 6;
    public static final int PSS_RSS_MINIMUM = 7;
    public static final int PSS_RSS_AVERAGE = 8;
    public static final int PSS_RSS_MAXIMUM = 9;
    public static final int PSS_COUNT = 10;
    public static final int SYS_MEM_USAGE_SAMPLE_COUNT = 0;
    public static final int SYS_MEM_USAGE_CACHED_MINIMUM = 1;
    public static final int SYS_MEM_USAGE_CACHED_AVERAGE = 2;
    public static final int SYS_MEM_USAGE_CACHED_MAXIMUM = 3;
    public static final int SYS_MEM_USAGE_FREE_MINIMUM = 4;
    public static final int SYS_MEM_USAGE_FREE_AVERAGE = 5;
    public static final int SYS_MEM_USAGE_FREE_MAXIMUM = 6;
    public static final int SYS_MEM_USAGE_ZRAM_MINIMUM = 7;
    public static final int SYS_MEM_USAGE_ZRAM_AVERAGE = 8;
    public static final int SYS_MEM_USAGE_ZRAM_MAXIMUM = 9;
    public static final int SYS_MEM_USAGE_KERNEL_MINIMUM = 10;
    public static final int SYS_MEM_USAGE_KERNEL_AVERAGE = 11;
    public static final int SYS_MEM_USAGE_KERNEL_MAXIMUM = 12;
    public static final int SYS_MEM_USAGE_NATIVE_MINIMUM = 13;
    public static final int SYS_MEM_USAGE_NATIVE_AVERAGE = 14;
    public static final int SYS_MEM_USAGE_NATIVE_MAXIMUM = 15;
    public static final int SYS_MEM_USAGE_COUNT = 16;
    public static final int ADJ_NOTHING = -1;
    public static final int ADJ_MEM_FACTOR_NORMAL = 0;
    public static final int ADJ_MEM_FACTOR_MODERATE = 1;
    public static final int ADJ_MEM_FACTOR_LOW = 2;
    public static final int ADJ_MEM_FACTOR_CRITICAL = 3;
    public static final int ADJ_MEM_FACTOR_COUNT = 4;
    public static final int ADJ_SCREEN_MOD = 4;
    public static final int ADJ_SCREEN_OFF = 0;
    public static final int ADJ_SCREEN_ON = 4;
    public static final int ADJ_COUNT = 8;
    public static final int FLAG_COMPLETE = 1;
    public static final int FLAG_SHUTDOWN = 2;
    public static final int FLAG_SYSPROPS = 4;
    public static final int ADD_PSS_INTERNAL_SINGLE = 0;
    public static final int ADD_PSS_INTERNAL_ALL_MEM = 1;
    public static final int ADD_PSS_INTERNAL_ALL_POLL = 2;
    public static final int ADD_PSS_EXTERNAL = 3;
    public static final int ADD_PSS_EXTERNAL_SLOW = 4;
    public static final int[] ALL_MEM_ADJ = null;
    public static final int[] ALL_SCREEN_ADJ = null;
    public static final int[] NON_CACHED_PROC_STATES = null;
    public static final int[] BACKGROUND_PROC_STATES = null;
    public static final int[] ALL_PROC_STATES = null;
    public static final int REPORT_PROC_STATS = 1;
    public static final int REPORT_PKG_PROC_STATS = 2;
    public static final int REPORT_PKG_SVC_STATS = 4;
    public static final int REPORT_PKG_ASC_STATS = 8;
    public static final int REPORT_PKG_STATS = 14;
    public static final int REPORT_UID_STATS = 16;
    public static final int REPORT_ALL = 31;
    public static final int[] OPTIONS = null;
    public static final java.lang.String[] OPTIONS_STR = null;
    public java.lang.String mReadError;
    public java.lang.String mTimePeriodStartClockStr;
    public int mFlags;
    public final com.android.internal.app.ProcessMap<android.util.LongSparseArray<com.android.internal.app.procstats.ProcessStats.PackageState>> mPackages = null;
    public final com.android.internal.app.ProcessMap<com.android.internal.app.procstats.ProcessState> mProcesses = null;
    public final android.util.SparseArray<com.android.internal.app.procstats.UidState> mUidStates = null;
    public final java.util.ArrayList<com.android.internal.app.procstats.AssociationState.SourceState> mTrackingAssociations = null;
    public final long[] mMemFactorDurations = null;
    public int mMemFactor;
    public long mStartTime;
    public int mNumAggregated;
    public long mTimePeriodStartClock;
    public long mTimePeriodStartRealtime;
    public long mTimePeriodEndRealtime;
    public long mTimePeriodStartUptime;
    public long mTimePeriodEndUptime;
    java.lang.String mRuntime;
    boolean mRunning;
    boolean mHasSwappedOutPss;
    public long mInternalSinglePssCount;
    public long mInternalSinglePssTime;
    public long mInternalAllMemPssCount;
    public long mInternalAllMemPssTime;
    public long mInternalAllPollPssCount;
    public long mInternalAllPollPssTime;
    public long mExternalPssCount;
    public long mExternalPssTime;
    public long mExternalSlowPssCount;
    public long mExternalSlowPssTime;
    public final com.android.internal.app.procstats.SparseMappingTable mTableData = null;
    public final long[] mSysMemUsageArgs = null;
    public final com.android.internal.app.procstats.SysMemUsageTable mSysMemUsage = null;
    android.util.ArrayMap<java.lang.String, java.lang.Integer> mCommonStringToIndex;
    java.util.ArrayList<java.lang.String> mIndexToCommonString;
    public static final android.os.Parcelable.Creator<com.android.internal.app.procstats.ProcessStats> CREATOR = null;
    static final int[] BAD_TABLE = null;
    static final java.util.Comparator<com.android.internal.app.procstats.ProcessStats.AssociationDumpContainer> ASSOCIATION_COMPARATOR = null;
    public ProcessStats(boolean p0) {}
    public ProcessStats(android.os.Parcel p0) {}
    public ProcessStats() {}
    public void add(com.android.internal.app.procstats.ProcessStats p0) {}
    public void addSysMemUsage(long p0, long p1, long p2, long p3, long p4) {}
    public void computeTotalMemoryUse(com.android.internal.app.procstats.ProcessStats.TotalMemoryUseCollection p0, long p1) {}
    public void reset() {}
    public void resetSafely() {}
    public boolean evaluateSystemProperties(boolean p0) { return false; }
    public void updateFragmentation() {}
    void writeCommonString(android.os.Parcel p0, java.lang.String p1) {}
    java.lang.String readCommonString(android.os.Parcel p0, int p1) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcel(android.os.Parcel p0, long p1, int p2) {}
    static byte[] readFully(java.io.InputStream p0, int[] p1) throws java.io.IOException { return null; }
    public void read(java.io.InputStream p0) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public com.android.internal.app.procstats.ProcessStats.PackageState getPackageStateLocked(java.lang.String p0, int p1, long p2) { return null; }
    public com.android.internal.app.procstats.ProcessState getProcessStateLocked(java.lang.String p0, int p1, long p2, java.lang.String p3) { return null; }
    public com.android.internal.app.procstats.ProcessState getProcessStateLocked(com.android.internal.app.procstats.ProcessStats.PackageState p0, java.lang.String p1) { return null; }
    public com.android.internal.app.procstats.ServiceState getServiceStateLocked(java.lang.String p0, int p1, long p2, java.lang.String p3, java.lang.String p4) { return null; }
    public com.android.internal.app.procstats.AssociationState getAssociationStateLocked(java.lang.String p0, int p1, long p2, java.lang.String p3, java.lang.String p4) { return null; }
    public void updateTrackingAssociationsLocked(int p0, long p1) {}
    public void dumpLocked(java.io.PrintWriter p0, java.lang.String p1, long p2, boolean p3, boolean p4, boolean p5, boolean p6, int p7) {}
    public void dumpSummaryLocked(java.io.PrintWriter p0, java.lang.String p1, long p2, boolean p3) {}
    long printMemoryCategory(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, double p3, long p4, long p5, int p6) { return 0L; }
    void dumpTotalsLocked(java.io.PrintWriter p0, long p1) {}
    void dumpFilteredSummaryLocked(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int[] p4, int[] p5, int[] p6, int[] p7, long p8, long p9, java.lang.String p10, boolean p11) {}
    public java.util.ArrayList<com.android.internal.app.procstats.ProcessState> collectProcessesLocked(int[] p0, int[] p1, int[] p2, int[] p3, long p4, java.lang.String p5, boolean p6) { return null; }
    public void dumpCheckinLocked(java.io.PrintWriter p0, java.lang.String p1, int p2) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1, int p2) {}
    public void dumpAggregatedProtoForStatsd(android.util.proto.ProtoOutputStream[] p0, long p1) {}
    void forEachProcess(java.util.function.Consumer<com.android.internal.app.procstats.ProcessState> p0) {}
    void forEachAssociation(com.android.internal.util.function.QuintConsumer<com.android.internal.app.procstats.AssociationState, java.lang.Integer, java.lang.String, com.android.internal.app.procstats.AssociationState.SourceKey, com.android.internal.app.procstats.AssociationState.SourceState> p0) {}
    public void dumpProcessState(int p0, com.android.internal.app.procstats.StatsEventOutput p1) {}
    public void dumpProcessAssociation(int p0, com.android.internal.app.procstats.StatsEventOutput p1) {}
    public void dumpFilteredAssociationStatesProtoForProc(android.util.proto.ProtoOutputStream p0, long p1, long p2, com.android.internal.app.procstats.ProcessState p3, android.util.SparseArray<android.util.ArraySet<java.lang.String>> p4) {}

    final class AssociationDumpContainer {
        final com.android.internal.app.procstats.AssociationState mState = null;
        java.util.ArrayList<android.util.Pair<com.android.internal.app.procstats.AssociationState.SourceKey, com.android.internal.app.procstats.AssociationState.SourceDumpContainer>> mSources;
        long mTotalTime;
        long mActiveTime;
        AssociationDumpContainer(com.android.internal.app.procstats.ProcessStats p0, com.android.internal.app.procstats.AssociationState p1) {}
    }

    public static final class PackageState {
        public final com.android.internal.app.procstats.ProcessStats mProcessStats = null;
        public final android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.ProcessState> mProcesses = null;
        public final android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.ServiceState> mServices = null;
        public final android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.AssociationState> mAssociations = null;
        public final java.lang.String mPackageName = null;
        public final int mUid = 0;
        public final long mVersionCode = 0L;
        public PackageState(com.android.internal.app.procstats.ProcessStats p0, java.lang.String p1, int p2, long p3) {}
        public com.android.internal.app.procstats.AssociationState getAssociationStateLocked(com.android.internal.app.procstats.ProcessState p0, java.lang.String p1) { return null; }
        public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1, long p2, int p3) {}
    }

    public static final class ProcessDataCollection {
        final int[] screenStates = null;
        final int[] memStates = null;
        final int[] procStates = null;
        public long totalTime;
        public long numPss;
        public long minPss;
        public long avgPss;
        public long maxPss;
        public long minUss;
        public long avgUss;
        public long maxUss;
        public long minRss;
        public long avgRss;
        public long maxRss;
        public ProcessDataCollection(int[] p0, int[] p1, int[] p2) {}
        void print(java.io.PrintWriter p0, long p1, boolean p2) {}
    }

    public static final class ProcessStateHolder {
        public final long appVersion = 0L;
        public com.android.internal.app.procstats.ProcessState state;
        public com.android.internal.app.procstats.ProcessStats.PackageState pkg;
        public ProcessStateHolder(long p0) {}
    }

    public static class TotalMemoryUseCollection {
        final int[] screenStates = null;
        final int[] memStates = null;
        public long totalTime;
        public long[] processStatePss;
        public double[] processStateWeight;
        public long[] processStateTime;
        public int[] processStateSamples;
        public long[] sysMemUsage;
        public double sysMemCachedWeight;
        public double sysMemFreeWeight;
        public double sysMemZRamWeight;
        public double sysMemKernelWeight;
        public double sysMemNativeWeight;
        public int sysMemSamples;
        public boolean hasSwappedOutPss;
        public TotalMemoryUseCollection(int[] p0, int[] p1) {}
    }
}
