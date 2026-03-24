package android.app.job;

public class JobParameters implements android.os.Parcelable {
    public static final int INTERNAL_STOP_REASON_UNKNOWN = -1;
    public static final int INTERNAL_STOP_REASON_CANCELED = 0;
    public static final int INTERNAL_STOP_REASON_CONSTRAINTS_NOT_SATISFIED = 1;
    public static final int INTERNAL_STOP_REASON_PREEMPT = 2;
    public static final int INTERNAL_STOP_REASON_TIMEOUT = 3;
    public static final int INTERNAL_STOP_REASON_DEVICE_IDLE = 4;
    public static final int INTERNAL_STOP_REASON_DEVICE_THERMAL = 5;
    public static final int INTERNAL_STOP_REASON_RESTRICTED_BUCKET = 6;
    public static final int INTERNAL_STOP_REASON_UNINSTALL = 7;
    public static final int INTERNAL_STOP_REASON_DATA_CLEARED = 8;
    public static final int INTERNAL_STOP_REASON_RTC_UPDATED = 9;
    public static final int INTERNAL_STOP_REASON_SUCCESSFUL_FINISH = 10;
    public static final int[] JOB_STOP_REASON_CODES = null;
    public static final int STOP_REASON_UNDEFINED = 0;
    public static final int STOP_REASON_CANCELLED_BY_APP = 1;
    public static final int STOP_REASON_PREEMPT = 2;
    public static final int STOP_REASON_TIMEOUT = 3;
    public static final int STOP_REASON_DEVICE_STATE = 4;
    public static final int STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW = 5;
    public static final int STOP_REASON_CONSTRAINT_CHARGING = 6;
    public static final int STOP_REASON_CONSTRAINT_CONNECTIVITY = 7;
    public static final int STOP_REASON_CONSTRAINT_DEVICE_IDLE = 8;
    public static final int STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW = 9;
    public static final int STOP_REASON_QUOTA = 10;
    public static final int STOP_REASON_BACKGROUND_RESTRICTION = 11;
    public static final int STOP_REASON_APP_STANDBY = 12;
    public static final int STOP_REASON_USER = 13;
    public static final int STOP_REASON_SYSTEM_PROCESSING = 14;
    public static final int STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED = 15;
    public static final android.os.Parcelable.Creator<android.app.job.JobParameters> CREATOR = null;
    public static java.lang.String getInternalReasonCodeDescription(int p0) { return null; }
    public static int[] getJobStopReasonCodes() { return null; }
    public JobParameters(android.os.IBinder p0, int p1, android.os.PersistableBundle p2, android.os.Bundle p3, android.content.ClipData p4, int p5, boolean p6, boolean p7, android.net.Uri[] p8, java.lang.String[] p9, android.net.Network p10) {}
    public int getJobId() { return 0; }
    public int getStopReason() { return 0; }
    public int getInternalStopReasonCode() { return 0; }
    public java.lang.String getDebugStopReason() { return null; }
    public android.os.PersistableBundle getExtras() { return null; }
    public android.os.Bundle getTransientExtras() { return null; }
    public android.content.ClipData getClipData() { return null; }
    public int getClipGrantFlags() { return 0; }
    public boolean isExpeditedJob() { return false; }
    public boolean isOverrideDeadlineExpired() { return false; }
    public android.net.Uri[] getTriggeredContentUris() { return null; }
    public java.lang.String[] getTriggeredContentAuthorities() { return null; }
    public android.net.Network getNetwork() { return null; }
    public android.app.job.JobWorkItem dequeueWork() { return null; }
    public void completeWork(android.app.job.JobWorkItem p0) {}
    public android.app.job.IJobCallback getCallback() { return null; }
    public void setStopReason(int p0, int p1, java.lang.String p2) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StopReason {
    }
}
