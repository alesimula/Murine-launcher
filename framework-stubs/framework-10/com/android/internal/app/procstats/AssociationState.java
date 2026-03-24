package com.android.internal.app.procstats;

public final class AssociationState {
    private static final java.lang.String TAG = "ProcessStats";
    private static final boolean DEBUG = false;
    private final com.android.internal.app.procstats.ProcessStats mProcessStats = null;
    private final com.android.internal.app.procstats.ProcessStats.PackageState mPackageState = null;
    private final java.lang.String mProcessName = null;
    private final java.lang.String mName = null;
    private final android.util.ArrayMap<com.android.internal.app.procstats.AssociationState.SourceKey, com.android.internal.app.procstats.AssociationState.SourceState> mSources = null;
    private final com.android.internal.app.procstats.AssociationState.SourceKey mTmpSourceKey = null;
    private com.android.internal.app.procstats.ProcessState mProc;
    private int mNumActive;
    public AssociationState(com.android.internal.app.procstats.ProcessStats p0, com.android.internal.app.procstats.ProcessStats.PackageState p1, java.lang.String p2, java.lang.String p3, com.android.internal.app.procstats.ProcessState p4) {}
    public int getUid() { return 0; }
    public java.lang.String getPackage() { return null; }
    public java.lang.String getProcessName() { return null; }
    public java.lang.String getName() { return null; }
    public com.android.internal.app.procstats.ProcessState getProcess() { return null; }
    public void setProcess(com.android.internal.app.procstats.ProcessState p0) {}
    public com.android.internal.app.procstats.AssociationState.SourceState startSource(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    public void add(com.android.internal.app.procstats.AssociationState p0) {}
    public boolean isInUse() { return false; }
    public void resetSafely(long p0) {}
    public void writeToParcel(com.android.internal.app.procstats.ProcessStats p0, android.os.Parcel p1, long p2) {}
    public java.lang.String readFromParcel(com.android.internal.app.procstats.ProcessStats p0, android.os.Parcel p1, int p2) { return null; }
    public void commitStateTime(long p0) {}
    public boolean hasProcessOrPackage(java.lang.String p0) { return false; }
    public void dumpStats(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, long p4, long p5, java.lang.String p6, boolean p7, boolean p8) {}
    void dumpActiveDurationSummary(java.io.PrintWriter p0, com.android.internal.app.procstats.AssociationState.SourceState p1, long p2, long p3, boolean p4) {}
    long dumpTime(java.io.PrintWriter p0, java.lang.String p1, com.android.internal.app.procstats.AssociationState.SourceState p2, long p3, long p4, boolean p5, boolean p6) { return 0L; }
    public void dumpTimesCheckin(java.io.PrintWriter p0, java.lang.String p1, int p2, long p3, java.lang.String p4, long p5) {}
    public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1, long p2) {}
    public java.lang.String toString() { return null; }

    public final class SourceState {
        final com.android.internal.app.procstats.AssociationState.SourceKey mKey = null;
        int mProcStateSeq;
        int mProcState;
        boolean mInTrackingList;
        int mNesting;
        int mCount;
        long mStartUptime;
        long mDuration;
        long mTrackingUptime;
        int mActiveCount;
        int mActiveProcState;
        long mActiveStartUptime;
        long mActiveDuration;
        com.android.internal.app.procstats.DurationsTable mDurations;
        SourceState(com.android.internal.app.procstats.AssociationState p0, com.android.internal.app.procstats.AssociationState.SourceKey p1) {}
        public com.android.internal.app.procstats.AssociationState getAssociationState() { return null; }
        public java.lang.String getProcessName() { return null; }
        public int getUid() { return 0; }
        public void trackProcState(int p0, int p1, long p2) {}
        public void stop() {}
        void startActive(long p0) {}
        void stopActive(long p0) {}
        void makeDurations() {}
        void stopTracking(long p0) {}
        public java.lang.String toString() { return null; }
    }

    private static final class SourceKey {
        int mUid;
        java.lang.String mProcess;
        java.lang.String mPackage;
        SourceKey(int p0, java.lang.String p1, java.lang.String p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}
