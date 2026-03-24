package com.android.internal.app.procstats;

public final class ProcessState {
    static final int[] PROCESS_STATE_TO_STATE = null;
    public static final java.util.Comparator<com.android.internal.app.procstats.ProcessState> COMPARATOR = null;
    public int tmpNumInUse;
    public com.android.internal.app.procstats.ProcessState tmpFoundSubProc;
    android.util.ArrayMap<com.android.internal.app.procstats.AssociationState.SourceKey, com.android.internal.app.procstats.AssociationState.SourceState> mCommonSources;
    public ProcessState(com.android.internal.app.procstats.ProcessStats p0, java.lang.String p1, int p2, long p3, java.lang.String p4) {}
    public ProcessState(com.android.internal.app.procstats.ProcessState p0, java.lang.String p1, int p2, long p3, java.lang.String p4, long p5) {}
    public com.android.internal.app.procstats.ProcessState clone(long p0) { return null; }
    public java.lang.String getName() { return null; }
    public com.android.internal.app.procstats.ProcessState getCommonProcess() { return null; }
    public void makeStandalone() {}
    public java.lang.String getPackage() { return null; }
    public int getUid() { return 0; }
    public long getVersion() { return 0L; }
    public boolean isMultiPackage() { return false; }
    public void setMultiPackage(boolean p0) {}
    public int getDurationsBucketCount() { return 0; }
    public void add(com.android.internal.app.procstats.ProcessState p0) {}
    public void resetSafely(long p0) {}
    public void makeDead() {}
    public void writeToParcel(android.os.Parcel p0, long p1) {}
    boolean readFromParcel(android.os.Parcel p0, int p1, boolean p2) { return false; }
    public void makeActive() {}
    public void makeInactive() {}
    public boolean isInUse() { return false; }
    public boolean isActive() { return false; }
    public boolean hasAnyData() { return false; }
    public void setState(int p0, int p1, long p2, android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.ProcessStats.ProcessStateHolder> p3) {}
    public void setCombinedState(int p0, long p1) {}
    public int getCombinedState() { return 0; }
    public void commitStateTime(long p0) {}
    public void incActiveServices(java.lang.String p0) {}
    public void decActiveServices(java.lang.String p0) {}
    public void incStartedServices(int p0, long p1, java.lang.String p2) {}
    public void decStartedServices(int p0, long p1, java.lang.String p2) {}
    public void addPss(long p0, long p1, long p2, boolean p3, int p4, long p5, android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.ProcessStats.ProcessStateHolder> p6) {}
    public void reportExcessiveCpu(android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.ProcessStats.ProcessStateHolder> p0) {}
    public void reportCachedKill(android.util.ArrayMap<java.lang.String, com.android.internal.app.procstats.ProcessStats.ProcessStateHolder> p0, long p1) {}
    public com.android.internal.app.procstats.ProcessState pullFixedProc(java.lang.String p0) { return null; }
    public long getTotalRunningDuration(long p0) { return 0L; }
    public long getDuration(int p0, long p1) { return 0L; }
    public long getPssSampleCount(int p0) { return 0L; }
    public long getPssMinimum(int p0) { return 0L; }
    public long getPssAverage(int p0) { return 0L; }
    public long getPssMaximum(int p0) { return 0L; }
    public long getPssUssMinimum(int p0) { return 0L; }
    public long getPssUssAverage(int p0) { return 0L; }
    public long getPssUssMaximum(int p0) { return 0L; }
    public long getPssRssMinimum(int p0) { return 0L; }
    public long getPssRssAverage(int p0) { return 0L; }
    public long getPssRssMaximum(int p0) { return 0L; }
    com.android.internal.app.procstats.AssociationState.SourceState getOrCreateSourceState(com.android.internal.app.procstats.AssociationState.SourceKey p0) { return null; }
    public void aggregatePss(com.android.internal.app.procstats.ProcessStats.TotalMemoryUseCollection p0, long p1) {}
    public long computeProcessTimeLocked(int[] p0, int[] p1, int[] p2, long p3) { return 0L; }
    public void dumpSummary(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, int[] p3, int[] p4, int[] p5, long p6, long p7) {}
    public void dumpProcessState(java.io.PrintWriter p0, java.lang.String p1, int[] p2, int[] p3, int[] p4, long p5) {}
    public void dumpPss(java.io.PrintWriter p0, java.lang.String p1, int[] p2, int[] p3, int[] p4, long p5) {}
    public static void dumpPssSamples(java.io.PrintWriter p0, long[] p1, int p2) {}
    void dumpInternalLocked(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, long p3, long p4, boolean p5) {}
    public void computeProcessData(com.android.internal.app.procstats.ProcessStats.ProcessDataCollection p0, long p1) {}
    public void dumpCsv(java.io.PrintWriter p0, boolean p1, int[] p2, boolean p3, int[] p4, boolean p5, int[] p6, long p7) {}
    public void dumpPackageProcCheckin(java.io.PrintWriter p0, java.lang.String p1, int p2, long p3, java.lang.String p4, long p5) {}
    public void dumpProcCheckin(java.io.PrintWriter p0, java.lang.String p1, int p2, long p3) {}
    public void dumpAllStateCheckin(java.io.PrintWriter p0, long p1) {}
    public void dumpAllPssCheckin(java.io.PrintWriter p0) {}
    public static void dumpPssSamplesCheckin(java.io.PrintWriter p0, long[] p1, int p2) {}
    public java.lang.String toString() { return null; }
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1, java.lang.String p2, int p3, long p4) {}
    static void writeCompressedProcessName(android.util.proto.ProtoOutputStream p0, long p1, java.lang.String p2, java.lang.String p3, boolean p4) {}
    public void dumpStateDurationToStatsd(int p0, com.android.internal.app.procstats.ProcessStats p1, com.android.internal.app.procstats.StatsEventOutput p2) {}
    public void dumpAggregatedProtoForStatsd(android.util.proto.ProtoOutputStream p0, long p1, java.lang.String p2, int p3, long p4, com.android.internal.app.ProcessMap<android.util.ArraySet<com.android.internal.app.procstats.ProcessStats.PackageState>> p5, android.util.SparseArray<android.util.ArraySet<java.lang.String>> p6) {}

    static class PssAggr {
        long pss;
        long samples;
        PssAggr() {}
        void add(long p0, long p1) {}
    }
}
