package android.content;

public final class SyncResult implements android.os.Parcelable {
    public final boolean syncAlreadyInProgress = false;
    public boolean tooManyDeletions;
    public boolean tooManyRetries;
    public boolean databaseError;
    public boolean fullSyncRequested;
    public boolean partialSyncUnavailable;
    public boolean moreRecordsToGet;
    public long delayUntil;
    public final android.content.SyncStats stats = null;
    public static final android.content.SyncResult ALREADY_IN_PROGRESS = null;
    public static final android.os.Parcelable.Creator<android.content.SyncResult> CREATOR = null;
    public SyncResult() {}
    private SyncResult(boolean p0) {}
    private SyncResult(android.os.Parcel p0) {}
    public boolean hasHardError() { return false; }
    public boolean hasSoftError() { return false; }
    public boolean hasError() { return false; }
    public boolean madeSomeProgress() { return false; }
    public void clear() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public java.lang.String toDebugString() { return null; }
}
