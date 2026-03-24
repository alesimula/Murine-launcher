package com.android.internal.app.procstats;

public final class UidState {
    public UidState(com.android.internal.app.procstats.ProcessStats p0, int p1) {}
    public com.android.internal.app.procstats.UidState clone() { return null; }
    public void updateCombinedState(int p0, long p1) {}
    public void updateCombinedState(long p0) {}
    public int getCombinedState() { return 0; }
    public void commitStateTime(long p0) {}
    public void resetSafely(long p0) {}
    public boolean isInUse() { return false; }
    public boolean hasPackage(java.lang.String p0) { return false; }
    public void add(com.android.internal.app.procstats.UidState p0) {}
    void addProcess(com.android.internal.app.procstats.ProcessState p0) {}
    void addProcess(com.android.internal.app.procstats.ProcessState p0, long p1) {}
    void removeProcess(com.android.internal.app.procstats.ProcessState p0, long p1) {}
    public int getDurationsBucketCount() { return 0; }
    public long getTotalRunningDuration(long p0) { return 0L; }
    public long getDuration(int p0, long p1) { return 0L; }
    public long[] getAggregatedDurationsInStates() { return null; }
    void writeToParcel(android.os.Parcel p0, long p1) {}
    boolean readFromParcel(android.os.Parcel p0) { return false; }
    public java.lang.String toString() { return null; }
    void dumpState(java.io.PrintWriter p0, java.lang.String p1, int[] p2, int[] p3, int[] p4, long p5) {}
}
