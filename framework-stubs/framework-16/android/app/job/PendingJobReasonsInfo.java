package android.app.job;

@android.annotation.FlaggedApi("android.app.job.get_pending_job_reasons_history_api")
public final class PendingJobReasonsInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.job.PendingJobReasonsInfo> CREATOR = null;
    public PendingJobReasonsInfo(long p0, int[] p1) {}
    public long getTimestampMillis() { return 0L; }
    @android.annotation.NonNull
    public int[] getPendingJobReasons() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
