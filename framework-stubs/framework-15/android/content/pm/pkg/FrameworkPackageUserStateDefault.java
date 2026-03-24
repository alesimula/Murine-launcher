package android.content.pm.pkg;

@java.lang.Deprecated
class FrameworkPackageUserStateDefault implements android.content.pm.pkg.FrameworkPackageUserState {
    FrameworkPackageUserStateDefault() {}
    public int getEnabledState() { return 0; }
    public int getInstallReason() { return 0; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.String, android.content.pm.overlay.OverlayPaths> getSharedLibraryOverlayPaths() { return null; }
    public int getUninstallReason() { return 0; }
    public boolean isInstalled() { return false; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getDisabledComponents() { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getEnabledComponents() { return null; }
    public long getCeDataInode() { return 0L; }
    public int getDistractionFlags() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getHarmfulAppWarning() { return null; }
    @android.annotation.Nullable
    public java.lang.String getLastDisableAppCaller() { return null; }
    @android.annotation.Nullable
    public android.content.pm.overlay.OverlayPaths getOverlayPaths() { return null; }
    public boolean isHidden() { return false; }
    public boolean isInstantApp() { return false; }
    public boolean isNotLaunched() { return false; }
    public boolean isStopped() { return false; }
    public boolean isSuspended() { return false; }
    public boolean isVirtualPreload() { return false; }
    @android.annotation.Nullable
    public java.lang.String getSplashScreenTheme() { return null; }
    public boolean isComponentEnabled(java.lang.String p0) { return false; }
    public boolean isComponentDisabled(java.lang.String p0) { return false; }
    @android.annotation.Nullable
    public android.content.pm.overlay.OverlayPaths getAllOverlayPaths() { return null; }
}
