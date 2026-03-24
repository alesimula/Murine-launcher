package android.app.job;

public final class Flags {
    public static final java.lang.String FLAG_BACKUP_JOBS_EXEMPTION = "android.app.job.backup_jobs_exemption";
    public static final java.lang.String FLAG_ENFORCE_MINIMUM_TIME_WINDOWS = "android.app.job.enforce_minimum_time_windows";
    public static final java.lang.String FLAG_JOB_DEBUG_INFO_APIS = "android.app.job.job_debug_info_apis";
    public Flags() {}
    public static boolean backupJobsExemption() { return false; }
    public static boolean enforceMinimumTimeWindows() { return false; }
    public static boolean jobDebugInfoApis() { return false; }
}
