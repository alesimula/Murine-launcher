package com.android.server.job;

public interface JobSchedulerInternal {
    public java.util.List<android.app.job.JobInfo> getSystemScheduledPendingJobs();
    public void cancelJobsForUid(int p0, java.lang.String p1);
    public void addBackingUpUid(int p0);
    public void removeBackingUpUid(int p0);
    public void clearAllBackingUpUids();
    public java.lang.String getMediaBackupPackage();
    public void reportAppUsage(java.lang.String p0, int p1);
    public com.android.server.job.JobSchedulerInternal.JobStorePersistStats getPersistStats();

    public static class JobStorePersistStats {
        public int countAllJobsLoaded;
        public int countSystemServerJobsLoaded;
        public int countSystemSyncManagerJobsLoaded;
        public int countAllJobsSaved;
        public int countSystemServerJobsSaved;
        public int countSystemSyncManagerJobsSaved;
        public JobStorePersistStats() {}
        public JobStorePersistStats(com.android.server.job.JobSchedulerInternal.JobStorePersistStats p0) {}
        public java.lang.String toString() { return null; }
        public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    }
}
