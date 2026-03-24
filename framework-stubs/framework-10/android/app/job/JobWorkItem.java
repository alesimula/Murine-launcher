package android.app.job;

public final class JobWorkItem implements android.os.Parcelable {
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    final android.content.Intent mIntent = null;
    final long mNetworkDownloadBytes = 0L;
    final long mNetworkUploadBytes = 0L;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    int mDeliveryCount;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    int mWorkId;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    java.lang.Object mGrants;
    public static final android.os.Parcelable.Creator<android.app.job.JobWorkItem> CREATOR = null;
    public JobWorkItem(android.content.Intent p0) {}
    @java.lang.Deprecated
    public JobWorkItem(android.content.Intent p0, long p1) {}
    public JobWorkItem(android.content.Intent p0, long p1, long p2) {}
    public android.content.Intent getIntent() { return null; }
    @java.lang.Deprecated
    public long getEstimatedNetworkBytes() { return 0L; }
    public long getEstimatedNetworkDownloadBytes() { return 0L; }
    public long getEstimatedNetworkUploadBytes() { return 0L; }
    public int getDeliveryCount() { return 0; }
    public void bumpDeliveryCount() {}
    public void setWorkId(int p0) {}
    public int getWorkId() { return 0; }
    public void setGrants(java.lang.Object p0) {}
    public java.lang.Object getGrants() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    JobWorkItem(android.os.Parcel p0) {}
}
