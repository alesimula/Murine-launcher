package com.android.server.job;

public final class JobSchedulerServiceDumpProto {
    public static final long SETTINGS = 1146756268033L;
    public static final long IN_THERMAL = 1133871366163L;
    public static final long STARTED_USERS = 2220498092034L;
    public static final long REGISTERED_JOBS = 2246267895811L;
    public static final long CONTROLLERS = 2246267895812L;
    public static final long PRIORITY_OVERRIDES = 2246267895813L;
    public static final long BACKING_UP_UIDS = 2220498092038L;
    public static final long HISTORY = 1146756268039L;
    public static final long PACKAGE_TRACKER = 1146756268040L;
    public static final long PENDING_JOBS = 2246267895817L;
    public static final long ACTIVE_JOBS = 2246267895818L;
    public static final long IS_READY_TO_ROCK = 1133871366155L;
    public static final long REPORTED_ACTIVE = 1133871366156L;
    public static final long MAX_ACTIVE_JOBS = 1120986464269L;
    public static final long CONCURRENCY_MANAGER = 1146756268052L;
    public static final long PERSIST_STATS = 1146756268053L;
    public static final long QUOTA_TRACKER = 1146756268054L;
    public JobSchedulerServiceDumpProto() {}

    public final class ActiveJob {
        public static final long INACTIVE = 1146756268033L;
        public static final long RUNNING = 1146756268034L;
        public ActiveJob(com.android.server.job.JobSchedulerServiceDumpProto p0) {}

        public final class InactiveJob {
            public static final long TIME_SINCE_STOPPED_MS = 1112396529665L;
            public static final long STOPPED_REASON = 1138166333442L;
            public InactiveJob(com.android.server.job.JobSchedulerServiceDumpProto.ActiveJob p0) {}
        }

        public final class RunningJob {
            public static final long INFO = 1146756268033L;
            public static final long RUNNING_DURATION_MS = 1112396529666L;
            public static final long TIME_UNTIL_TIMEOUT_MS = 1112396529667L;
            public static final long DUMP = 1146756268036L;
            public static final long EVALUATED_PRIORITY = 1172526071813L;
            public static final long TIME_SINCE_MADE_ACTIVE_MS = 1112396529670L;
            public static final long PENDING_DURATION_MS = 1112396529671L;
            public RunningJob(com.android.server.job.JobSchedulerServiceDumpProto.ActiveJob p0) {}
        }
    }

    public final class JobRestriction {
        public static final long REASON = 1159641169921L;
        public static final long IS_RESTRICTING = 1133871366146L;
        public JobRestriction(com.android.server.job.JobSchedulerServiceDumpProto p0) {}
    }

    public final class PendingJob {
        public static final long INFO = 1146756268033L;
        public static final long DUMP = 1146756268034L;
        public static final long EVALUATED_PRIORITY = 1172526071811L;
        public static final long PENDING_DURATION_MS = 1112396529668L;
        public PendingJob(com.android.server.job.JobSchedulerServiceDumpProto p0) {}
    }

    public final class PriorityOverride {
        public static final long UID = 1120986464257L;
        public static final long OVERRIDE_VALUE = 1172526071810L;
        public PriorityOverride(com.android.server.job.JobSchedulerServiceDumpProto p0) {}
    }

    public final class RegisteredJob {
        public static final long INFO = 1146756268033L;
        public static final long DUMP = 1146756268034L;
        public static final long IS_JOB_READY_TO_BE_EXECUTED = 1133871366154L;
        public static final long IS_JOB_READY = 1133871366147L;
        public static final long ARE_USERS_STARTED = 1133871366148L;
        public static final long IS_JOB_RESTRICTED = 1133871366155L;
        public static final long IS_JOB_PENDING = 1133871366149L;
        public static final long IS_JOB_CURRENTLY_ACTIVE = 1133871366150L;
        public static final long IS_UID_BACKING_UP = 1133871366151L;
        public static final long IS_COMPONENT_USABLE = 1133871366152L;
        public static final long RESTRICTIONS = 2246267895820L;
        public RegisteredJob(com.android.server.job.JobSchedulerServiceDumpProto p0) {}
    }
}
