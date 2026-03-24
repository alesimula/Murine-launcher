package android.os;

@android.annotation.FlaggedApi("android.os.adpf_gpu_report_actual_work_duration")
public final class WorkDuration {
    long mActualTotalDurationNanos;
    long mWorkPeriodStartTimestampNanos;
    long mActualCpuDurationNanos;
    long mActualGpuDurationNanos;
    public WorkDuration() {}
    public WorkDuration(long p0, long p1, long p2, long p3) {}
    public void setActualTotalDurationNanos(long p0) {}
    public void setWorkPeriodStartTimestampNanos(long p0) {}
    public void setActualCpuDurationNanos(long p0) {}
    public void setActualGpuDurationNanos(long p0) {}
    public long getActualTotalDurationNanos() { return 0L; }
    public long getWorkPeriodStartTimestampNanos() { return 0L; }
    public long getActualCpuDurationNanos() { return 0L; }
    public long getActualGpuDurationNanos() { return 0L; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}
