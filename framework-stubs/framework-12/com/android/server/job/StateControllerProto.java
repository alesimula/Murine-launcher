package com.android.server.job;

public final class StateControllerProto {
    public static final long BACKGROUND = 1146756268033L;
    public static final long BATTERY = 1146756268034L;
    public static final long CONNECTIVITY = 1146756268035L;
    public static final long CONTENT_OBSERVER = 1146756268036L;
    public static final long DEVICE_IDLE = 1146756268037L;
    public static final long IDLE = 1146756268038L;
    public static final long QUOTA = 1146756268041L;
    public static final long STORAGE = 1146756268039L;
    public static final long TIME = 1146756268040L;
    public StateControllerProto() {}

    public final class BackgroundJobsController {
        public static final long APP_STATE_TRACKER = 1146756268033L;
        public static final long TRACKED_JOBS = 2246267895810L;
        public BackgroundJobsController(com.android.server.job.StateControllerProto p0) {}

        public final class TrackedJob {
            public static final long INFO = 1146756268033L;
            public static final long SOURCE_UID = 1120986464258L;
            public static final long SOURCE_PACKAGE_NAME = 1138166333443L;
            public static final long IS_IN_FOREGROUND = 1133871366148L;
            public static final long IS_WHITELISTED = 1133871366149L;
            public static final long CAN_RUN_ANY_IN_BACKGROUND = 1133871366150L;
            public static final long ARE_CONSTRAINTS_SATISFIED = 1133871366151L;
            public TrackedJob(com.android.server.job.StateControllerProto.BackgroundJobsController p0) {}
        }
    }

    public final class BatteryController {
        public static final long IS_ON_STABLE_POWER = 1133871366145L;
        public static final long IS_BATTERY_NOT_LOW = 1133871366146L;
        public static final long IS_MONITORING = 1133871366147L;
        public static final long LAST_BROADCAST_SEQUENCE_NUMBER = 1120986464260L;
        public static final long TRACKED_JOBS = 2246267895813L;
        public BatteryController(com.android.server.job.StateControllerProto p0) {}

        public final class TrackedJob {
            public static final long INFO = 1146756268033L;
            public static final long SOURCE_UID = 1120986464258L;
            public TrackedJob(com.android.server.job.StateControllerProto.BatteryController p0) {}
        }
    }

    public final class ConnectivityController {
        public static final long TRACKED_JOBS = 2246267895810L;
        public static final long REQUESTED_STANDBY_EXCEPTION_UIDS = 2220498092035L;
        public static final long AVAILABLE_NETWORKS = 2246267895812L;
        public ConnectivityController(com.android.server.job.StateControllerProto p0) {}

        public final class TrackedJob {
            public static final long INFO = 1146756268033L;
            public static final long SOURCE_UID = 1120986464258L;
            public static final long REQUIRED_NETWORK = 1146756268035L;
            public TrackedJob(com.android.server.job.StateControllerProto.ConnectivityController p0) {}
        }
    }

    public final class ContentObserverController {
        public static final long TRACKED_JOBS = 2246267895809L;
        public static final long OBSERVERS = 2246267895810L;
        public ContentObserverController(com.android.server.job.StateControllerProto p0) {}

        public final class Observer {
            public static final long USER_ID = 1120986464257L;
            public static final long TRIGGERS = 2246267895810L;
            public Observer(com.android.server.job.StateControllerProto.ContentObserverController p0) {}

            public final class TriggerContentData {
                public static final long URI = 1138166333441L;
                public static final long FLAGS = 1120986464258L;
                public static final long JOBS = 2246267895811L;
                public TriggerContentData(com.android.server.job.StateControllerProto.ContentObserverController.Observer p0) {}

                public final class JobInstance {
                    public static final long INFO = 1146756268033L;
                    public static final long SOURCE_UID = 1120986464258L;
                    public static final long TRIGGER_CONTENT_UPDATE_DELAY_MS = 1112396529667L;
                    public static final long TRIGGER_CONTENT_MAX_DELAY_MS = 1112396529668L;
                    public static final long CHANGED_AUTHORITIES = 2237677961221L;
                    public static final long CHANGED_URIS = 2237677961222L;
                    public JobInstance(com.android.server.job.StateControllerProto.ContentObserverController.Observer.TriggerContentData p0) {}
                }
            }
        }

        public final class TrackedJob {
            public static final long INFO = 1146756268033L;
            public static final long SOURCE_UID = 1120986464258L;
            public TrackedJob(com.android.server.job.StateControllerProto.ContentObserverController p0) {}
        }
    }

    public final class DeviceIdleJobsController {
        public static final long IS_DEVICE_IDLE_MODE = 1133871366145L;
        public static final long TRACKED_JOBS = 2246267895810L;
        public DeviceIdleJobsController(com.android.server.job.StateControllerProto p0) {}

        public final class TrackedJob {
            public static final long INFO = 1146756268033L;
            public static final long SOURCE_UID = 1120986464258L;
            public static final long SOURCE_PACKAGE_NAME = 1138166333443L;
            public static final long ARE_CONSTRAINTS_SATISFIED = 1133871366148L;
            public static final long IS_DOZE_WHITELISTED = 1133871366149L;
            public static final long IS_ALLOWED_IN_DOZE = 1133871366150L;
            public TrackedJob(com.android.server.job.StateControllerProto.DeviceIdleJobsController p0) {}
        }
    }

    public final class IdleController {
        public static final long IS_IDLE = 1133871366145L;
        public static final long TRACKED_JOBS = 2246267895810L;
        public static final long IDLENESS_TRACKER = 1146756268035L;
        public IdleController(com.android.server.job.StateControllerProto p0) {}

        public final class IdlenessTracker {
            public static final long DEVICE_IDLENESS_TRACKER = 1146756268033L;
            public static final long CAR_IDLENESS_TRACKER = 1146756268034L;
            public IdlenessTracker(com.android.server.job.StateControllerProto.IdleController p0) {}

            public final class CarIdlenessTracker {
                public static final long IS_IDLE = 1133871366145L;
                public static final long IS_GARAGE_MODE_ON = 1133871366146L;
                public CarIdlenessTracker(com.android.server.job.StateControllerProto.IdleController.IdlenessTracker p0) {}
            }

            public final class DeviceIdlenessTracker {
                public static final long IS_IDLE = 1133871366145L;
                public static final long IS_SCREEN_ON = 1133871366146L;
                public static final long IS_DOCK_IDLE = 1133871366147L;
                public static final long PROJECTION_ACTIVE = 1133871366149L;
                public DeviceIdlenessTracker(com.android.server.job.StateControllerProto.IdleController.IdlenessTracker p0) {}
            }
        }

        public final class TrackedJob {
            public static final long INFO = 1146756268033L;
            public static final long SOURCE_UID = 1120986464258L;
            public TrackedJob(com.android.server.job.StateControllerProto.IdleController p0) {}
        }
    }

    public final class QuotaController {
        public static final long IS_CHARGING = 1133871366145L;
        public static final long ELAPSED_REALTIME = 1112396529670L;
        public static final long FOREGROUND_UIDS = 2220498092035L;
        public static final long TRACKED_JOBS = 2246267895812L;
        public static final long PACKAGE_STATS = 2246267895813L;
        public static final long UID_TO_PACKAGE_CACHE = 2246267895815L;
        public static final long IN_QUOTA_ALARM_LISTENER = 1146756268040L;
        public QuotaController(com.android.server.job.StateControllerProto p0) {}

        public final class AlarmListener {
            public static final long IS_WAITING = 1133871366145L;
            public static final long TRIGGER_TIME_ELAPSED = 1112396529666L;
            public AlarmListener(com.android.server.job.StateControllerProto.QuotaController p0) {}
        }

        public final class ExecutionStats {
            public static final long STANDBY_BUCKET = 1159641169921L;
            public static final long EXPIRATION_TIME_ELAPSED = 1112396529666L;
            public static final long WINDOW_SIZE_MS = 1112396529667L;
            public static final long JOB_COUNT_LIMIT = 1120986464270L;
            public static final long SESSION_COUNT_LIMIT = 1120986464271L;
            public static final long EXECUTION_TIME_IN_WINDOW_MS = 1112396529668L;
            public static final long BG_JOB_COUNT_IN_WINDOW = 1120986464261L;
            public static final long EXECUTION_TIME_IN_MAX_PERIOD_MS = 1112396529670L;
            public static final long BG_JOB_COUNT_IN_MAX_PERIOD = 1120986464263L;
            public static final long SESSION_COUNT_IN_WINDOW = 1120986464267L;
            public static final long IN_QUOTA_TIME_ELAPSED = 1112396529672L;
            public static final long JOB_COUNT_EXPIRATION_TIME_ELAPSED = 1112396529673L;
            public static final long JOB_COUNT_IN_RATE_LIMITING_WINDOW = 1120986464266L;
            public static final long SESSION_COUNT_EXPIRATION_TIME_ELAPSED = 1112396529676L;
            public static final long SESSION_COUNT_IN_RATE_LIMITING_WINDOW = 1120986464269L;
            public ExecutionStats(com.android.server.job.StateControllerProto.QuotaController p0) {}
        }

        public final class InQuotaAlarmListener {
            public static final long TRIGGER_TIME_ELAPSED = 1112396529665L;
            public static final long ALARMS = 2246267895810L;
            public InQuotaAlarmListener(com.android.server.job.StateControllerProto.QuotaController p0) {}

            public final class Alarm {
                public static final long PKG = 1146756268033L;
                public static final long IN_QUOTA_TIME_ELAPSED = 1112396529666L;
                public Alarm(com.android.server.job.StateControllerProto.QuotaController.InQuotaAlarmListener p0) {}
            }
        }

        public final class Package {
            public static final long USER_ID = 1120986464257L;
            public static final long NAME = 1138166333442L;
            public Package(com.android.server.job.StateControllerProto.QuotaController p0) {}
        }

        public final class PackageStats {
            public static final long PKG = 1146756268033L;
            public static final long TIMER = 1146756268034L;
            public static final long SAVED_SESSIONS = 2246267895811L;
            public static final long EXECUTION_STATS = 2246267895812L;
            public static final long FG_JOB_TIMER = 1146756268038L;
            public PackageStats(com.android.server.job.StateControllerProto.QuotaController p0) {}
        }

        public final class Timer {
            public static final long PKG = 1146756268033L;
            public static final long IS_ACTIVE = 1133871366146L;
            public static final long START_TIME_ELAPSED = 1112396529667L;
            public static final long BG_JOB_COUNT = 1120986464260L;
            public static final long RUNNING_JOBS = 2246267895813L;
            public Timer(com.android.server.job.StateControllerProto.QuotaController p0) {}
        }

        public final class TimingSession {
            public static final long START_TIME_ELAPSED = 1112396529665L;
            public static final long END_TIME_ELAPSED = 1112396529666L;
            public static final long BG_JOB_COUNT = 1120986464259L;
            public TimingSession(com.android.server.job.StateControllerProto.QuotaController p0) {}
        }

        public final class TopAppTimer {
            public static final long PKG = 1146756268033L;
            public static final long IS_ACTIVE = 1133871366146L;
            public static final long START_TIME_ELAPSED = 1112396529667L;
            public static final long ACTIVITY_COUNT = 1120986464260L;
            public TopAppTimer(com.android.server.job.StateControllerProto.QuotaController p0) {}
        }

        public final class TrackedJob {
            public static final long INFO = 1146756268033L;
            public static final long SOURCE_UID = 1120986464258L;
            public static final long EFFECTIVE_STANDBY_BUCKET = 1159641169923L;
            public static final long IS_TOP_STARTED_JOB = 1133871366148L;
            public static final long HAS_QUOTA = 1133871366149L;
            public static final long REMAINING_QUOTA_MS = 1112396529670L;
            public static final long IS_REQUESTED_FOREGROUND_JOB = 1133871366151L;
            public static final long IS_WITHIN_FG_JOB_QUOTA = 1133871366152L;
            public TrackedJob(com.android.server.job.StateControllerProto.QuotaController p0) {}
        }

        public final class UidPackageMapping {
            public static final long UID = 1120986464257L;
            public static final long PACKAGE_NAMES = 2237677961218L;
            public UidPackageMapping(com.android.server.job.StateControllerProto.QuotaController p0) {}
        }
    }

    public final class StorageController {
        public static final long IS_STORAGE_NOT_LOW = 1133871366145L;
        public static final long LAST_BROADCAST_SEQUENCE_NUMBER = 1120986464258L;
        public static final long TRACKED_JOBS = 2246267895811L;
        public StorageController(com.android.server.job.StateControllerProto p0) {}

        public final class TrackedJob {
            public static final long INFO = 1146756268033L;
            public static final long SOURCE_UID = 1120986464258L;
            public TrackedJob(com.android.server.job.StateControllerProto.StorageController p0) {}
        }
    }

    public final class TimeController {
        public static final long NOW_ELAPSED_REALTIME = 1112396529665L;
        public static final long TIME_UNTIL_NEXT_DELAY_ALARM_MS = 1112396529666L;
        public static final long TIME_UNTIL_NEXT_DEADLINE_ALARM_MS = 1112396529667L;
        public static final long TRACKED_JOBS = 2246267895812L;
        public TimeController(com.android.server.job.StateControllerProto p0) {}

        public final class TrackedJob {
            public static final long INFO = 1146756268033L;
            public static final long SOURCE_UID = 1120986464258L;
            public static final long HAS_TIMING_DELAY_CONSTRAINT = 1133871366147L;
            public static final long DELAY_TIME_REMAINING_MS = 1112396529668L;
            public static final long HAS_DEADLINE_CONSTRAINT = 1133871366149L;
            public static final long TIME_REMAINING_UNTIL_DEADLINE_MS = 1112396529670L;
            public TrackedJob(com.android.server.job.StateControllerProto.TimeController p0) {}
        }
    }
}
