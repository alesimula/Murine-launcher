package android.app.job;

public class JobSnapshot implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.job.JobSnapshot> CREATOR = null;
    public JobSnapshot(android.app.job.JobInfo p0, int p1, boolean p2) {}
    public JobSnapshot(android.os.Parcel p0) {}
    public android.app.job.JobInfo getJobInfo() { return null; }
    public boolean isRunnable() { return false; }
    public boolean isChargingSatisfied() { return false; }
    public boolean isBatteryNotLowSatisfied() { return false; }
    public boolean isRequireDeviceIdleSatisfied() { return false; }
    public boolean isRequireStorageNotLowSatisfied() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
