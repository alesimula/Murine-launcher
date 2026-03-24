package android.app;

public class JobSchedulerImpl extends android.app.job.JobScheduler {
    android.app.job.IJobScheduler mBinder;
    public JobSchedulerImpl(android.app.job.IJobScheduler p0) { super(); }
    public int schedule(android.app.job.JobInfo p0) { return 0; }
    public int enqueue(android.app.job.JobInfo p0, android.app.job.JobWorkItem p1) { return 0; }
    public int scheduleAsPackage(android.app.job.JobInfo p0, java.lang.String p1, int p2, java.lang.String p3) { return 0; }
    public void cancel(int p0) {}
    public void cancelAll() {}
    public java.util.List<android.app.job.JobInfo> getAllPendingJobs() { return null; }
    public android.app.job.JobInfo getPendingJob(int p0) { return null; }
    public java.util.List<android.app.job.JobInfo> getStartedJobs() { return null; }
    public java.util.List<android.app.job.JobSnapshot> getAllJobSnapshots() { return null; }
}
