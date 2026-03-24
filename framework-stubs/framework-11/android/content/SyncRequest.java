package android.content;

public class SyncRequest implements android.os.Parcelable {
    private static final java.lang.String TAG = "SyncRequest";
    private final android.accounts.Account mAccountToSync = null;
    private final java.lang.String mAuthority = null;
    private final android.os.Bundle mExtras = null;
    private final boolean mDisallowMetered = false;
    private final long mSyncFlexTimeSecs = 0L;
    private final long mSyncRunTimeSecs = 0L;
    private final boolean mIsPeriodic = false;
    private final boolean mIsAuthority = false;
    private final boolean mIsExpedited = false;
    public static final android.os.Parcelable.Creator<android.content.SyncRequest> CREATOR = null;
    public boolean isPeriodic() { return false; }
    public boolean isExpedited() { return false; }
    public android.accounts.Account getAccount() { return null; }
    public java.lang.String getProvider() { return null; }
    public android.os.Bundle getBundle() { return null; }
    public long getSyncFlexTime() { return 0L; }
    public long getSyncRunTime() { return 0L; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private SyncRequest(android.os.Parcel p0) {}
    protected SyncRequest(android.content.SyncRequest.Builder p0) {}

    public static class Builder {
        private static final int SYNC_TYPE_UNKNOWN = 0;
        private static final int SYNC_TYPE_PERIODIC = 1;
        private static final int SYNC_TYPE_ONCE = 2;
        private static final int SYNC_TARGET_UNKNOWN = 0;
        private static final int SYNC_TARGET_ADAPTER = 2;
        private long mSyncFlexTimeSecs;
        private long mSyncRunTimeSecs;
        private android.os.Bundle mCustomExtras;
        private android.os.Bundle mSyncConfigExtras;
        private boolean mDisallowMetered;
        private int mSyncType;
        private int mSyncTarget;
        private boolean mIsManual;
        private boolean mNoRetry;
        private boolean mIgnoreBackoff;
        private boolean mIgnoreSettings;
        private boolean mExpedited;
        private android.accounts.Account mAccount;
        private java.lang.String mAuthority;
        private boolean mRequiresCharging;
        public Builder() {}
        public android.content.SyncRequest.Builder syncOnce() { return null; }
        public android.content.SyncRequest.Builder syncPeriodic(long p0, long p1) { return null; }
        private void setupInterval(long p0, long p1) {}
        public android.content.SyncRequest.Builder setDisallowMetered(boolean p0) { return null; }
        public android.content.SyncRequest.Builder setRequiresCharging(boolean p0) { return null; }
        public android.content.SyncRequest.Builder setSyncAdapter(android.accounts.Account p0, java.lang.String p1) { return null; }
        public android.content.SyncRequest.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.content.SyncRequest.Builder setNoRetry(boolean p0) { return null; }
        public android.content.SyncRequest.Builder setIgnoreSettings(boolean p0) { return null; }
        public android.content.SyncRequest.Builder setIgnoreBackoff(boolean p0) { return null; }
        public android.content.SyncRequest.Builder setManual(boolean p0) { return null; }
        public android.content.SyncRequest.Builder setExpedited(boolean p0) { return null; }
        public android.content.SyncRequest build() { return null; }
    }
}
