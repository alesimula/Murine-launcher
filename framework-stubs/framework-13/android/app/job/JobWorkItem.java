package android.app.job;

public final class JobWorkItem implements android.os.Parcelable {
    final android.content.Intent mIntent = null;
    int mDeliveryCount;
    int mWorkId;
    java.lang.Object mGrants;
    public static final android.os.Parcelable.Creator<android.app.job.JobWorkItem> CREATOR = null;
    public JobWorkItem(android.content.Intent p0) {}
    public JobWorkItem(android.content.Intent p0, long p1, long p2) {}
    public JobWorkItem(android.content.Intent p0, long p1, long p2, long p3) {}
    public android.content.Intent getIntent() { return null; }
    public long getEstimatedNetworkDownloadBytes() { return 0L; }
    public long getEstimatedNetworkUploadBytes() { return 0L; }
    public long getMinimumNetworkChunkBytes() { return 0L; }
    public int getDeliveryCount() { return 0; }
    public void bumpDeliveryCount() {}
    public void setWorkId(int p0) {}
    public int getWorkId() { return 0; }
    public void setGrants(java.lang.Object p0) {}
    public java.lang.Object getGrants() { return null; }
    public java.lang.String toString() { return null; }
    public void enforceValidity() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    JobWorkItem(android.os.Parcel p0) {}
}
