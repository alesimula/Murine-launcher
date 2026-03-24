package android.content;

public class SyncStats implements android.os.Parcelable {
    public long numAuthExceptions;
    public long numIoExceptions;
    public long numParseExceptions;
    public long numConflictDetectedExceptions;
    public long numInserts;
    public long numUpdates;
    public long numDeletes;
    public long numEntries;
    public long numSkippedEntries;
    public static final android.os.Parcelable.Creator<android.content.SyncStats> CREATOR = null;
    public SyncStats() {}
    public SyncStats(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public void clear() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
