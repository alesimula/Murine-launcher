package android.apex;

public class ApexSessionParams implements android.os.Parcelable {
    public int sessionId;
    public int[] childSessionIds;
    public boolean hasRollbackEnabled;
    public boolean isRollback;
    public int rollbackId;
    public static final android.os.Parcelable.Creator<android.apex.ApexSessionParams> CREATOR = null;
    public ApexSessionParams() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
