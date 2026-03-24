package android.content.rollback;

@android.annotation.SystemApi
public final class RollbackInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.rollback.RollbackInfo> CREATOR = null;
    public RollbackInfo(int p0, java.util.List<android.content.rollback.PackageRollbackInfo> p1, boolean p2, java.util.List<android.content.pm.VersionedPackage> p3, int p4, int p5) {}
    public RollbackInfo(int p0, java.util.List<android.content.rollback.PackageRollbackInfo> p1, boolean p2, java.util.List<android.content.pm.VersionedPackage> p3, int p4) {}
    public int getRollbackId() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.content.rollback.PackageRollbackInfo> getPackages() { return null; }
    public boolean isStaged() { return false; }
    public int getCommittedSessionId() { return 0; }
    public void setCommittedSessionId(int p0) {}
    @android.annotation.NonNull
    public java.util.List<android.content.pm.VersionedPackage> getCausePackages() { return null; }
    @android.annotation.FlaggedApi("android.content.pm.recoverability_detection")
    public int getRollbackImpactLevel() { return 0; }
    public void setRollbackImpactLevel(int p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
