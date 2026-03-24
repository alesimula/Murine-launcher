package android.content.pm;

public class PackageUserState {
    private static final boolean DEBUG = false;
    private static final java.lang.String LOG_TAG = "PackageUserState";
    public long ceDataInode;
    public boolean installed;
    public boolean stopped;
    public boolean notLaunched;
    public boolean hidden;
    public int distractionFlags;
    public boolean suspended;
    public java.lang.String suspendingPackage;
    public android.content.pm.SuspendDialogInfo dialogInfo;
    public android.os.PersistableBundle suspendedAppExtras;
    public android.os.PersistableBundle suspendedLauncherExtras;
    public boolean instantApp;
    public boolean virtualPreload;
    public int enabled;
    public java.lang.String lastDisableAppCaller;
    public int domainVerificationStatus;
    public int appLinkGeneration;
    public int categoryHint;
    public int installReason;
    public java.lang.String harmfulAppWarning;
    public android.util.ArraySet<java.lang.String> disabledComponents;
    public android.util.ArraySet<java.lang.String> enabledComponents;
    public java.lang.String[] overlayPaths;
    @android.annotation.UnsupportedAppUsage
    public PackageUserState() {}
    public PackageUserState(android.content.pm.PackageUserState p0) {}
    public boolean isAvailable(int p0) { return false; }
    public boolean isMatch(android.content.pm.ComponentInfo p0, int p1) { return false; }
    private boolean reportIfDebug(boolean p0, int p1) { return false; }
    public boolean isEnabled(android.content.pm.ComponentInfo p0, int p1) { return false; }
    public final boolean equals(java.lang.Object p0) { return false; }
}
