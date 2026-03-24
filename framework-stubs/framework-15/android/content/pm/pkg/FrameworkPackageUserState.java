package android.content.pm.pkg;

@java.lang.Deprecated
public interface FrameworkPackageUserState {
    public static final android.content.pm.pkg.FrameworkPackageUserState DEFAULT = null;
    @android.annotation.Nullable
    public android.content.pm.overlay.OverlayPaths getAllOverlayPaths();
    public long getCeDataInode();
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getDisabledComponents();
    public int getDistractionFlags();
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getEnabledComponents();
    public int getEnabledState();
    @android.annotation.Nullable
    public java.lang.String getHarmfulAppWarning();
    public int getInstallReason();
    @android.annotation.Nullable
    public java.lang.String getLastDisableAppCaller();
    @android.annotation.Nullable
    public android.content.pm.overlay.OverlayPaths getOverlayPaths();
    @android.annotation.NonNull
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
    @android.annotation.Nullable
    public java.lang.String getSplashScreenTheme();
}
