package android.content.rollback;

@android.annotation.SystemApi
public final class PackageRollbackInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.content.rollback.PackageRollbackInfo> CREATOR = null;
    public java.lang.String getPackageName() { return null; }
    public android.content.pm.VersionedPackage getVersionRolledBackFrom() { return null; }
    public android.content.pm.VersionedPackage getVersionRolledBackTo() { return null; }
    public void addPendingBackup(int p0) {}
    public java.util.List<java.lang.Integer> getPendingBackups() { return null; }
    public java.util.ArrayList<android.content.rollback.PackageRollbackInfo.RestoreInfo> getPendingRestores() { return null; }
    public android.content.rollback.PackageRollbackInfo.RestoreInfo getRestoreInfo(int p0) { return null; }
    public void removeRestoreInfo(android.content.rollback.PackageRollbackInfo.RestoreInfo p0) {}
    public boolean isApex() { return false; }
    public int getRollbackDataPolicy() { return 0; }
    public boolean isApkInApex() { return false; }
    public java.util.List<java.lang.Integer> getSnapshottedUsers() { return null; }
    public void removePendingBackup(int p0) {}
    public void removePendingRestoreInfo(int p0) {}
    public PackageRollbackInfo(android.content.pm.VersionedPackage p0, android.content.pm.VersionedPackage p1, java.util.List<java.lang.Integer> p2, java.util.ArrayList<android.content.rollback.PackageRollbackInfo.RestoreInfo> p3, boolean p4, boolean p5, java.util.List<java.lang.Integer> p6) {}
    public PackageRollbackInfo(android.content.pm.VersionedPackage p0, android.content.pm.VersionedPackage p1, java.util.List<java.lang.Integer> p2, java.util.ArrayList<android.content.rollback.PackageRollbackInfo.RestoreInfo> p3, boolean p4, boolean p5, java.util.List<java.lang.Integer> p6, int p7) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class RestoreInfo {
        public final int userId = 0;
        public final int appId = 0;
        public final java.lang.String seInfo = null;
        public RestoreInfo(int p0, int p1, java.lang.String p2) {}
    }
}
