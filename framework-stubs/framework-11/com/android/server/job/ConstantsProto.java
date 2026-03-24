package com.android.server.job;

public final class ConstantsProto {
    public static final long MIN_READY_NON_ACTIVE_JOBS_COUNT = 1120986464285L;
    public static final long MAX_NON_ACTIVE_JOB_BATCH_DELAY_MS = 1112396529694L;
    public static final long HEAVY_USE_FACTOR = 1103806595080L;
    public static final long MODERATE_USE_FACTOR = 1103806595081L;
    public static final long FG_JOB_COUNT = 1120986464266L;
    public static final long BG_NORMAL_JOB_COUNT = 1120986464267L;
    public static final long BG_MODERATE_JOB_COUNT = 1120986464268L;
    public static final long BG_LOW_JOB_COUNT = 1120986464269L;
    public static final long BG_CRITICAL_JOB_COUNT = 1120986464270L;
    public static final long MIN_LINEAR_BACKOFF_TIME_MS = 1112396529681L;
    public static final long MIN_EXP_BACKOFF_TIME_MS = 1112396529682L;
    public static final long CONN_CONGESTION_DELAY_FRAC = 1103806595093L;
    public static final long CONN_PREFETCH_RELAX_FRAC = 1103806595094L;
    public static final long ENABLE_API_QUOTAS = 1133871366175L;
    public static final long API_QUOTA_SCHEDULE_COUNT = 1120986464288L;
    public static final long API_QUOTA_SCHEDULE_WINDOW_MS = 1112396529697L;
    public static final long API_QUOTA_SCHEDULE_THROW_EXCEPTION = 1133871366178L;
    public static final long API_QUOTA_SCHEDULE_RETURN_FAILURE_RESULT = 1133871366179L;
    public static final long QUOTA_CONTROLLER = 1146756268056L;
    public static final long TIME_CONTROLLER = 1146756268057L;
    public static final long MAX_JOB_COUNTS_SCREEN_ON = 1146756268058L;
    public static final long MAX_JOB_COUNTS_SCREEN_OFF = 1146756268059L;
    public static final long SCREEN_OFF_JOB_CONCURRENCY_INCREASE_DELAY_MS = 1120986464284L;
    public ConstantsProto() {}

    public final class QuotaController {
        public static final long ALLOWED_TIME_PER_PERIOD_MS = 1112396529665L;
        public static final long IN_QUOTA_BUFFER_MS = 1112396529666L;
        public static final long ACTIVE_WINDOW_SIZE_MS = 1112396529667L;
        public static final long WORKING_WINDOW_SIZE_MS = 1112396529668L;
        public static final long FREQUENT_WINDOW_SIZE_MS = 1112396529669L;
        public static final long RARE_WINDOW_SIZE_MS = 1112396529670L;
        public static final long RESTRICTED_WINDOW_SIZE_MS = 1112396529684L;
        public static final long MAX_EXECUTION_TIME_MS = 1112396529671L;
        public static final long MAX_JOB_COUNT_ACTIVE = 1120986464264L;
        public static final long MAX_JOB_COUNT_WORKING = 1120986464265L;
        public static final long MAX_JOB_COUNT_FREQUENT = 1120986464266L;
        public static final long MAX_JOB_COUNT_RARE = 1120986464267L;
        public static final long MAX_JOB_COUNT_RESTRICTED = 1120986464277L;
        public static final long RATE_LIMITING_WINDOW_MS = 1120986464275L;
        public static final long MAX_JOB_COUNT_PER_RATE_LIMITING_WINDOW = 1120986464268L;
        public static final long MAX_SESSION_COUNT_ACTIVE = 1120986464269L;
        public static final long MAX_SESSION_COUNT_WORKING = 1120986464270L;
        public static final long MAX_SESSION_COUNT_FREQUENT = 1120986464271L;
        public static final long MAX_SESSION_COUNT_RARE = 1120986464272L;
        public static final long MAX_SESSION_COUNT_RESTRICTED = 1120986464278L;
        public static final long MAX_SESSION_COUNT_PER_RATE_LIMITING_WINDOW = 1120986464273L;
        public static final long TIMING_SESSION_COALESCING_DURATION_MS = 1112396529682L;
        public static final long MIN_QUOTA_CHECK_DELAY_MS = 1112396529687L;
        public QuotaController(com.android.server.job.ConstantsProto p0) {}
    }

    public final class TimeController {
        public static final long USE_NON_WAKEUP_ALARM_FOR_DELAY = 1133871366146L;
        public TimeController(com.android.server.job.ConstantsProto p0) {}
    }
}
