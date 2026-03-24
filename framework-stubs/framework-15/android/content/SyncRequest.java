package android.content;

public class SyncRequest implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.SyncRequest> CREATOR = null;
    public boolean isPeriodic() { return false; }
    public boolean isExpedited() { return false; }
    public boolean isScheduledAsExpeditedJob() { return false; }
    public android.accounts.Account getAccount() { return null; }
    public java.lang.String getProvider() { return null; }
    public android.os.Bundle getBundle() { return null; }
    public long getSyncFlexTime() { return 0L; }
    public long getSyncRunTime() { return 0L; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected SyncRequest(android.content.SyncRequest.Builder p0) {}

    public static class Builder {
        public Builder() {}
        public android.content.SyncRequest.Builder syncOnce() { return null; }
        public android.content.SyncRequest.Builder syncPeriodic(long p0, long p1) { return null; }
        public android.content.SyncRequest.Builder setDisallowMetered(boolean p0) { return null; }
        public android.content.SyncRequest.Builder setRequiresCharging(boolean p0) { return null; }
        public android.content.SyncRequest.Builder setSyncAdapter(android.accounts.Account p0, java.lang.String p1) { return null; }
        public android.content.SyncRequest.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.content.SyncRequest.Builder setNoRetry(boolean p0) { return null; }
        public android.content.SyncRequest.Builder setIgnoreSettings(boolean p0) { return null; }
        public android.content.SyncRequest.Builder setIgnoreBackoff(boolean p0) { return null; }
        public android.content.SyncRequest.Builder setManual(boolean p0) { return null; }
        public android.content.SyncRequest.Builder setExpedited(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.content.SyncRequest.Builder setScheduleAsExpeditedJob(boolean p0) { return null; }
        public android.content.SyncRequest build() { return null; }
    }
}
