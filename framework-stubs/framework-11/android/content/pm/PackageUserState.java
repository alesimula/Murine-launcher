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
    public android.util.ArrayMap<java.lang.String, android.content.pm.PackageUserState.SuspendParams> suspendParams;
    public boolean instantApp;
    public boolean virtualPreload;
    public int enabled;
    public java.lang.String lastDisableAppCaller;
    public int domainVerificationStatus;
    public int appLinkGeneration;
    public int categoryHint;
    public int installReason;
    public int uninstallReason;
    public java.lang.String harmfulAppWarning;
    public android.util.ArraySet<java.lang.String> disabledComponents;
    public android.util.ArraySet<java.lang.String> enabledComponents;
    private java.lang.String[] overlayPaths;
    private android.util.ArrayMap<java.lang.String, java.lang.String[]> sharedLibraryOverlayPaths;
    private java.lang.String[] cachedOverlayPaths;
    private android.util.ArrayMap<android.content.ComponentName, android.util.Pair<java.lang.String, java.lang.Integer>> componentLabelIconOverrideMap;
    public PackageUserState() {}
    public PackageUserState(android.content.pm.PackageUserState p0) {}
    public java.lang.String[] getOverlayPaths() { return null; }
    public void setOverlayPaths(java.lang.String[] p0) {}
    public java.util.Map<java.lang.String, java.lang.String[]> getSharedLibraryOverlayPaths() { return null; }
    public void setSharedLibraryOverlayPaths(java.lang.String p0, java.lang.String[] p1) {}
    public boolean overrideLabelAndIcon(android.content.ComponentName p0, java.lang.String p1, java.lang.Integer p2) { return false; }
    public void resetOverrideComponentLabelIcon() {}
    public android.util.Pair<java.lang.String, java.lang.Integer> getOverrideLabelIconForComponent(android.content.ComponentName p0) { return null; }
    public boolean isAvailable(int p0) { return false; }
    public boolean isMatch(android.content.pm.ComponentInfo p0, int p1) { return false; }
    public boolean isMatch(boolean p0, boolean p1, android.content.pm.parsing.component.ParsedMainComponent p2, int p3) { return false; }
    public boolean isMatch(boolean p0, boolean p1, boolean p2, boolean p3, java.lang.String p4, int p5) { return false; }
    public boolean reportIfDebug(boolean p0, int p1) { return false; }
    public boolean isEnabled(android.content.pm.ComponentInfo p0, int p1) { return false; }
    public boolean isEnabled(boolean p0, android.content.pm.parsing.component.ParsedMainComponent p1, int p2) { return false; }
    public boolean isEnabled(boolean p0, boolean p1, java.lang.String p2, int p3) { return false; }
    public java.lang.String[] getAllOverlayPaths() { return null; }
    public final boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class SuspendParams {
        private static final java.lang.String TAG_DIALOG_INFO = "dialog-info";
        private static final java.lang.String TAG_APP_EXTRAS = "app-extras";
        private static final java.lang.String TAG_LAUNCHER_EXTRAS = "launcher-extras";
        public android.content.pm.SuspendDialogInfo dialogInfo;
        public android.os.PersistableBundle appExtras;
        public android.os.PersistableBundle launcherExtras;
        private SuspendParams() {}
        public static android.content.pm.PackageUserState.SuspendParams getInstanceOrNull(android.content.pm.SuspendDialogInfo p0, android.os.PersistableBundle p1, android.os.PersistableBundle p2) { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public void saveToXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
        public static android.content.pm.PackageUserState.SuspendParams restoreFromXml(org.xmlpull.v1.XmlPullParser p0) throws java.io.IOException { return null; }
    }
}
