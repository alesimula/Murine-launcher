package android.content.pm;

public abstract class CrossProfileAppsInternal {
    public CrossProfileAppsInternal() {}
    public abstract boolean verifyPackageHasInteractAcrossProfilePermission(java.lang.String p0, int p1) throws android.content.pm.PackageManager.NameNotFoundException;
    public abstract boolean verifyUidHasInteractAcrossProfilePermission(java.lang.String p0, int p1);
    public abstract java.util.List<android.os.UserHandle> getTargetUserProfiles(java.lang.String p0, int p1);
}
