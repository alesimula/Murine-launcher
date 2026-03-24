package android.content.pm.pkg;

@java.lang.Deprecated
public interface FrameworkPackageUserState {
    public static final android.content.pm.pkg.FrameworkPackageUserState DEFAULT = null;
    public android.content.pm.overlay.OverlayPaths getAllOverlayPaths();
    public long getCeDataInode();
    public java.util.Set<java.lang.String> getDisabledComponents();
    public int getDistractionFlags();
    public java.util.Set<java.lang.String> getEnabledComponents();
    public int getEnabledState();
    public java.lang.String getHarmfulAppWarning();
    public int getInstallReason();
    public java.lang.String getLastDisableAppCaller();
    public android.content.pm.overlay.OverlayPaths getOverlayPaths();
    public java.util.Map<java.lang.String, android.content.pm.overlay.OverlayPaths> getSharedLibraryOverlayPaths();
    public int getUninstallReason();
    public boolean isComponentEnabled(java.lang.String p0);
    public boolean isComponentDisabled(java.lang.String p0);
    public boolean isHidden();
    public boolean isInstalled();
    public boolean isInstantApp();
    public boolean isNotLaunched();
    public boolean isStopped();
    public boolean isSuspended();
    public boolean isVirtualPreload();
    public java.lang.String getSplashScreenTheme();
}
