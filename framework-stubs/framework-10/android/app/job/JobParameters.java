package android.app.job;

public class JobParameters implements android.os.Parcelable {
    public static final int REASON_CANCELED = 0;
    public static final int REASON_CONSTRAINTS_NOT_SATISFIED = 1;
    public static final int REASON_PREEMPT = 2;
    public static final int REASON_TIMEOUT = 3;
    public static final int REASON_DEVICE_IDLE = 4;
    public static final int REASON_DEVICE_THERMAL = 5;
    @android.annotation.UnsupportedAppUsage
    private final int jobId = 0;
    private final android.os.PersistableBundle extras = null;
    private final android.os.Bundle transientExtras = null;
    private final android.content.ClipData clipData = null;
    private final int clipGrantFlags = 0;
    @android.annotation.UnsupportedAppUsage
    private final android.os.IBinder callback = null;
    private final boolean overrideDeadlineExpired = false;
    private final android.net.Uri[] mTriggeredContentUris = null;
    private final java.lang.String[] mTriggeredContentAuthorities = null;
    private final android.net.Network network = null;
    private int stopReason;
    private java.lang.String debugStopReason;
    public static final android.os.Parcelable.Creator<android.app.job.JobParameters> CREATOR = null;
    public static java.lang.String getReasonName(int p0) { return null; }
    public JobParameters(android.os.IBinder p0, int p1, android.os.PersistableBundle p2, android.os.Bundle p3, android.content.ClipData p4, int p5, boolean p6, android.net.Uri[] p7, java.lang.String[] p8, android.net.Network p9) {}
    public int getJobId() { return 0; }
    public int getStopReason() { return 0; }
    public java.lang.String getDebugStopReason() { return null; }
    public android.os.PersistableBundle getExtras() { return null; }
    public android.os.Bundle getTransientExtras() { return null; }
    public android.content.ClipData getClipData() { return null; }
    public int getClipGrantFlags() { return 0; }
    public boolean isOverrideDeadlineExpired() { return false; }
    public android.net.Uri[] getTriggeredContentUris() { return null; }
    public java.lang.String[] getTriggeredContentAuthorities() { return null; }
    public android.net.Network getNetwork() { return null; }
    public android.app.job.JobWorkItem dequeueWork() { return null; }
    public void completeWork(android.app.job.JobWorkItem p0) {}
    @android.annotation.UnsupportedAppUsage
    public android.app.job.IJobCallback getCallback() { return null; }
    private JobParameters(android.os.Parcel p0) {}
    public void setStopReason(int p0, java.lang.String p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
