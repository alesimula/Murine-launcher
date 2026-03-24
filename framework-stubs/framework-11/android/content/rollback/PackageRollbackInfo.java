package android.content.rollback;

@android.annotation.SystemApi
public final class PackageRollbackInfo implements android.os.Parcelable {
    private final android.content.pm.VersionedPackage mVersionRolledBackFrom = null;
    private final android.content.pm.VersionedPackage mVersionRolledBackTo = null;
    private final android.util.IntArray mPendingBackups = null;
    private final java.util.ArrayList<android.content.rollback.PackageRollbackInfo.RestoreInfo> mPendingRestores = null;
    private final boolean mIsApex = false;
    private final boolean mIsApkInApex = false;
    private final android.util.IntArray mSnapshottedUsers = null;
    private final android.util.SparseLongArray mCeSnapshotInodes = null;
    private final int mRollbackDataPolicy = 0;
    public static final android.os.Parcelable.Creator<android.content.rollback.PackageRollbackInfo> CREATOR = null;
    public java.lang.String getPackageName() { return null; }
    public android.content.pm.VersionedPackage getVersionRolledBackFrom() { return null; }
    public android.content.pm.VersionedPackage getVersionRolledBackTo() { return null; }
    public void addPendingBackup(int p0) {}
    public android.util.IntArray getPendingBackups() { return null; }
    public java.util.ArrayList<android.content.rollback.PackageRollbackInfo.RestoreInfo> getPendingRestores() { return null; }
    public android.content.rollback.PackageRollbackInfo.RestoreInfo getRestoreInfo(int p0) { return null; }
    public void removeRestoreInfo(android.content.rollback.PackageRollbackInfo.RestoreInfo p0) {}
    public boolean isApex() { return false; }
    public int getRollbackDataPolicy() { return 0; }
    public boolean isApkInApex() { return false; }
    public android.util.IntArray getSnapshottedUsers() { return null; }
    public android.util.SparseLongArray getCeSnapshotInodes() { return null; }
    public void putCeSnapshotInode(int p0, long p1) {}
    public void removePendingBackup(int p0) {}
    public void removePendingRestoreInfo(int p0) {}
    public PackageRollbackInfo(android.content.pm.VersionedPackage p0, android.content.pm.VersionedPackage p1, android.util.IntArray p2, java.util.ArrayList<android.content.rollback.PackageRollbackInfo.RestoreInfo> p3, boolean p4, boolean p5, android.util.IntArray p6, android.util.SparseLongArray p7) {}
    public PackageRollbackInfo(android.content.pm.VersionedPackage p0, android.content.pm.VersionedPackage p1, android.util.IntArray p2, java.util.ArrayList<android.content.rollback.PackageRollbackInfo.RestoreInfo> p3, boolean p4, boolean p5, android.util.IntArray p6, android.util.SparseLongArray p7, int p8) {}
    private PackageRollbackInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class RestoreInfo {
        public final int userId = 0;
        public final int appId = 0;
        public final java.lang.String seInfo = null;
        public RestoreInfo(int p0, int p1, java.lang.String p2) {}
    }
}
