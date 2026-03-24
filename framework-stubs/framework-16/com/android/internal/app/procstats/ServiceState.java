package com.android.internal.app.procstats;

public final class ServiceState {
    public static final int SERVICE_RUN = 0;
    public static final int SERVICE_STARTED = 1;
    public static final int SERVICE_BOUND = 2;
    public static final int SERVICE_EXEC = 3;
    public static final int SERVICE_FOREGROUND = 4;
    public static final int SERVICE_COUNT = 5;
    public ServiceState(com.android.internal.app.procstats.ProcessStats p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, com.android.internal.app.procstats.ProcessState p4) {}
    public java.lang.String getPackage() { return null; }
    public java.lang.String getProcessName() { return null; }
    public java.lang.String getName() { return null; }
    public com.android.internal.app.procstats.ProcessState getProcess() { return null; }
    public void setProcess(com.android.internal.app.procstats.ProcessState p0) {}
    public void setMemFactor(int p0, long p1) {}
    public void applyNewOwner(java.lang.Object p0) {}
    public void clearCurrentOwner(java.lang.Object p0, boolean p1) {}
    public boolean isInUse() { return false; }
    public boolean isRestarting() { return false; }
    public void add(com.android.internal.app.procstats.ServiceState p0) {}
    public void resetSafely(long p0) {}
    public void writeToParcel(android.os.Parcel p0, long p1) {}
    public boolean readFromParcel(android.os.Parcel p0) { return false; }
    public void commitStateTime(long p0) {}
    public void setStarted(boolean p0, int p1, long p2) {}
    public void setRestarting(boolean p0, int p1, long p2) {}
    public void updateStartedState(int p0, long p1) {}
    public void setBound(boolean p0, int p1, long p2) {}
    public void setExecuting(boolean p0, int p1, long p2) {}
    public void setForeground(boolean p0, int p1, long p2) {}
    public long getDuration(int p0, int p1, long p2, int p3, long p4) { return 0L; }
    public void dumpStats(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, long p4, long p5, boolean p6, boolean p7) {}
    public long dumpTime(java.io.PrintWriter p0, java.lang.String p1, int p2, int p3, long p4, long p5) { return 0L; }
    long dumpTimeInternal(java.io.PrintWriter p0, java.lang.String p1, int p2, int p3, long p4, long p5, boolean p6) { return 0L; }
    public void dumpTimesCheckin(java.io.PrintWriter p0, java.lang.String p1, int p2, long p3, java.lang.String p4, long p5) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1, long p2) {}
    public void writeTypeToProto(android.util.proto.ProtoOutputStream p0, long p1, int p2, int p3, int p4, int p5, long p6, long p7) {}
    public java.lang.String toString() { return null; }
}
