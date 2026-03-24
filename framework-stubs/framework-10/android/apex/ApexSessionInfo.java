package android.apex;

public class ApexSessionInfo implements android.os.Parcelable {
    public int sessionId;
    public boolean isUnknown;
    public boolean isVerified;
    public boolean isStaged;
    public boolean isActivated;
    public boolean isRollbackInProgress;
    public boolean isActivationFailed;
    public boolean isSuccess;
    public boolean isRolledBack;
    public boolean isRollbackFailed;
    public static final android.os.Parcelable.Creator<android.apex.ApexSessionInfo> CREATOR = null;
    public ApexSessionInfo() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
