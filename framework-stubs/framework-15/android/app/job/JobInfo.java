package android.app.job;

public class JobInfo implements android.os.Parcelable {
    public static final long DISALLOW_DEADLINES_FOR_PREFETCH_JOBS = 194532703L;
    public static final long THROW_ON_INVALID_PRIORITY_VALUE = 140852299L;
    public static final long REJECT_NEGATIVE_NETWORK_ESTIMATES = 253665015L;
    public static final long ENFORCE_MINIMUM_TIME_WINDOWS = 311402873L;
    public static final long REJECT_NEGATIVE_DELAYS_AND_DEADLINES = 323349338L;
    public static final int NETWORK_TYPE_NONE = 0;
    public static final int NETWORK_TYPE_ANY = 1;
    public static final int NETWORK_TYPE_UNMETERED = 2;
    public static final int NETWORK_TYPE_NOT_ROAMING = 3;
    public static final int NETWORK_TYPE_CELLULAR = 4;
    @java.lang.Deprecated
    public static final int NETWORK_TYPE_METERED = 4;
    public static final int NETWORK_BYTES_UNKNOWN = -1;
    public static final long DEFAULT_INITIAL_BACKOFF_MILLIS = 30000L;
    public static final long MAX_BACKOFF_DELAY_MILLIS = 18000000L;
    public static final int BACKOFF_POLICY_LINEAR = 0;
    public static final int BACKOFF_POLICY_EXPONENTIAL = 1;
    public static final long MIN_BACKOFF_MILLIS = 10000L;
    public static final int DEFAULT_BACKOFF_POLICY = 1;
    public static final int PRIORITY_MIN = 100;
    public static final int PRIORITY_LOW = 200;
    public static final int PRIORITY_DEFAULT = 300;
    public static final int PRIORITY_HIGH = 400;
    public static final int PRIORITY_MAX = 500;
    public static final int BIAS_DEFAULT = 0;
    public static final int BIAS_SYNC_EXPEDITED = 10;
    public static final int BIAS_SYNC_INITIALIZATION = 20;
    public static final int BIAS_BOUND_FOREGROUND_SERVICE = 30;
    public static final int PRIORITY_FOREGROUND_APP = 30;
    public static final int BIAS_FOREGROUND_SERVICE = 35;
    public static final int PRIORITY_FOREGROUND_SERVICE = 35;
    public static final int BIAS_TOP_APP = 40;
    public static final int BIAS_ADJ_OFTEN_RUNNING = -40;
    public static final int BIAS_ADJ_ALWAYS_RUNNING = -80;
    public static final int FLAG_WILL_BE_FOREGROUND = 1;
    public static final int FLAG_IMPORTANT_WHILE_FOREGROUND = 2;
    public static final int FLAG_PREFETCH = 4;
    public static final int FLAG_EXEMPT_FROM_APP_STANDBY = 8;
    public static final int FLAG_EXPEDITED = 16;
    public static final int FLAG_USER_INITIATED = 32;
    public static final int CONSTRAINT_FLAG_CHARGING = 1;
    public static final int CONSTRAINT_FLAG_BATTERY_NOT_LOW = 2;
    public static final int CONSTRAINT_FLAG_DEVICE_IDLE = 4;
    public static final int CONSTRAINT_FLAG_STORAGE_NOT_LOW = 8;
    public static final int MAX_NUM_DEBUG_TAGS = 32;
    public static final int MAX_DEBUG_TAG_LENGTH = 127;
    public static final int MAX_TRACE_TAG_LENGTH = 127;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.job.JobInfo> CREATOR = null;
    public static final long getMinPeriodMillis() { return 0L; }
    public static final long getMinFlexMillis() { return 0L; }
    public static final long getMinBackoffMillis() { return 0L; }
    public int getId() { return 0; }
    @android.annotation.NonNull
    public android.os.PersistableBundle getExtras() { return null; }
    @android.annotation.NonNull
    public android.os.Bundle getTransientExtras() { return null; }
    @android.annotation.Nullable
    public android.content.ClipData getClipData() { return null; }
    public int getClipGrantFlags() { return 0; }
    @android.annotation.NonNull
    public android.content.ComponentName getService() { return null; }
    public int getBias() { return 0; }
    public int getPriority() { return 0; }
    public int getFlags() { return 0; }
    public boolean isExemptedFromAppStandby() { return false; }
    public boolean isRequireCharging() { return false; }
    public boolean isRequireBatteryNotLow() { return false; }
    public boolean isRequireDeviceIdle() { return false; }
    public boolean isRequireStorageNotLow() { return false; }
    public int getConstraintFlags() { return 0; }
    @android.annotation.Nullable
    public android.app.job.JobInfo.TriggerContentUri[] getTriggerContentUris() { return null; }
    public long getTriggerContentUpdateDelay() { return 0L; }
    public long getTriggerContentMaxDelay() { return 0L; }
    @java.lang.Deprecated
    public int getNetworkType() { return 0; }
    @android.annotation.Nullable
    public android.net.NetworkRequest getRequiredNetwork() { return null; }
    public long getEstimatedNetworkDownloadBytes() { return 0L; }
    public long getEstimatedNetworkUploadBytes() { return 0L; }
    public long getMinimumNetworkChunkBytes() { return 0L; }
    public long getMinLatencyMillis() { return 0L; }
    public long getMaxExecutionDelayMillis() { return 0L; }
    public boolean isPeriodic() { return false; }
    public boolean isPersisted() { return false; }
    public long getIntervalMillis() { return 0L; }
    public long getFlexMillis() { return 0L; }
    public long getInitialBackoffMillis() { return 0L; }
    public int getBackoffPolicy() { return 0; }
    @android.annotation.FlaggedApi("android.app.job.job_debug_info_apis")
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getDebugTags() { return null; }
    @android.annotation.NonNull
    public android.util.ArraySet<java.lang.String> getDebugTagsArraySet() { return null; }
    @android.annotation.FlaggedApi("android.app.job.job_debug_info_apis")
    @android.annotation.Nullable
    public java.lang.String getTraceTag() { return null; }
    public boolean isExpedited() { return false; }
    public boolean isUserInitiated() { return false; }
    public boolean isImportantWhileForeground() { return false; }
    public boolean isPrefetch() { return false; }
    public boolean hasEarlyConstraint() { return false; }
    public boolean hasLateConstraint() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public final void enforceValidity(boolean p0, boolean p1, boolean p2, boolean p3) {}
    @android.annotation.NonNull
    public static java.lang.String validateDebugTag(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public static java.lang.String validateTraceTag(java.lang.String p0) { return null; }
    public static java.lang.String getBiasString(int p0) { return null; }
    public static java.lang.String getPriorityString(int p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BackoffPolicy {
    }

    public static final class Builder {
        public Builder(int p0, android.content.ComponentName p1) {}
        public Builder(android.app.job.JobInfo p0) {}
        @android.annotation.FlaggedApi("android.app.job.job_debug_info_apis")
        @android.annotation.NonNull
        public android.app.job.JobInfo.Builder addDebugTag(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public void addDebugTags(java.util.Set<java.lang.String> p0) {}
        @android.annotation.FlaggedApi("android.app.job.job_debug_info_apis")
        @android.annotation.SuppressLint("BuilderSetStyle")
        @android.annotation.NonNull
        public android.app.job.JobInfo.Builder removeDebugTag(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        @android.annotation.RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
        public android.app.job.JobInfo.Builder setBias(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.job.JobInfo.Builder setPriority(int p0) { return null; }
        public android.app.job.JobInfo.Builder setFlags(int p0) { return null; }
        public android.app.job.JobInfo.Builder setExtras(android.os.PersistableBundle p0) { return null; }
        public android.app.job.JobInfo.Builder setTransientExtras(android.os.Bundle p0) { return null; }
        public android.app.job.JobInfo.Builder setClipData(android.content.ClipData p0, int p1) { return null; }
        public android.app.job.JobInfo.Builder setRequiredNetworkType(int p0) { return null; }
        public android.app.job.JobInfo.Builder setRequiredNetwork(android.net.NetworkRequest p0) { return null; }
        public android.app.job.JobInfo.Builder setEstimatedNetworkBytes(long p0, long p1) { return null; }
        @android.annotation.NonNull
        public android.app.job.JobInfo.Builder setMinimumNetworkChunkBytes(long p0) { return null; }
        public android.app.job.JobInfo.Builder setRequiresCharging(boolean p0) { return null; }
        public android.app.job.JobInfo.Builder setRequiresBatteryNotLow(boolean p0) { return null; }
        public android.app.job.JobInfo.Builder setRequiresDeviceIdle(boolean p0) { return null; }
        public android.app.job.JobInfo.Builder setRequiresStorageNotLow(boolean p0) { return null; }
        public android.app.job.JobInfo.Builder addTriggerContentUri(android.app.job.JobInfo.TriggerContentUri p0) { return null; }
        public android.app.job.JobInfo.Builder setTriggerContentUpdateDelay(long p0) { return null; }
        public android.app.job.JobInfo.Builder setTriggerContentMaxDelay(long p0) { return null; }
        public android.app.job.JobInfo.Builder setPeriodic(long p0) { return null; }
        public android.app.job.JobInfo.Builder setPeriodic(long p0, long p1) { return null; }
        public android.app.job.JobInfo.Builder setMinimumLatency(long p0) { return null; }
        public android.app.job.JobInfo.Builder setOverrideDeadline(long p0) { return null; }
        public android.app.job.JobInfo.Builder setBackoffCriteria(long p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.app.job.JobInfo.Builder setExpedited(boolean p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.RUN_USER_INITIATED_JOBS")
        @android.annotation.NonNull
        public android.app.job.JobInfo.Builder setUserInitiated(boolean p0) { return null; }
        @java.lang.Deprecated
        public android.app.job.JobInfo.Builder setImportantWhileForeground(boolean p0) { return null; }
        public android.app.job.JobInfo.Builder setPrefetch(boolean p0) { return null; }
        @android.annotation.RequiresPermission("android.permission.RECEIVE_BOOT_COMPLETED")
        public android.app.job.JobInfo.Builder setPersisted(boolean p0) { return null; }
        @android.annotation.FlaggedApi("android.app.job.job_debug_info_apis")
        @android.annotation.NonNull
        public android.app.job.JobInfo.Builder setTraceTag(java.lang.String p0) { return null; }
        public android.app.job.JobInfo build() { return null; }
        public android.app.job.JobInfo build(boolean p0, boolean p1, boolean p2, boolean p3) { return null; }
        public java.lang.String summarize() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface NetworkType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Priority {
    }

    public static final class TriggerContentUri implements android.os.Parcelable {
        public static final int FLAG_NOTIFY_FOR_DESCENDANTS = 1;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.app.job.JobInfo.TriggerContentUri> CREATOR = null;
        public TriggerContentUri(android.net.Uri p0, int p1) {}
        public android.net.Uri getUri() { return null; }
        public int getFlags() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Flags {
        }
    }
}
