package android.app;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
@android.annotation.FlaggedApi("android.app.bic_client")
public final class BackgroundInstallControlManager {
    BackgroundInstallControlManager(android.content.Context p0) {}
    @android.annotation.SystemApi
    @android.annotation.FlaggedApi("android.app.bic_client")
    @android.annotation.RequiresPermission("android.permission.GET_BACKGROUND_INSTALLED_PACKAGES")
    @android.annotation.NonNull
    public java.util.List<android.content.pm.PackageInfo> getBackgroundInstalledPackages(long p0) { return null; }
}
