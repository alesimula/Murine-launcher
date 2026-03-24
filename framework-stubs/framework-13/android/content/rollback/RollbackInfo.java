package android.content.rollback;

@android.annotation.SystemApi
public final class RollbackInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.rollback.RollbackInfo> CREATOR = null;
    public RollbackInfo(int p0, java.util.List<android.content.rollback.PackageRollbackInfo> p1, boolean p2, java.util.List<android.content.pm.VersionedPackage> p3, int p4) {}
    public int getRollbackId() { return 0; }
    public java.util.List<android.content.rollback.PackageRollbackInfo> getPackages() { return null; }
    public boolean isStaged() { return false; }
    public int getCommittedSessionId() { return 0; }
    public void setCommittedSessionId(int p0) {}
    public java.util.List<android.content.pm.VersionedPackage> getCausePackages() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
