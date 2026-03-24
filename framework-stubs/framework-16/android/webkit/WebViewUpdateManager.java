package android.webkit;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
@android.annotation.FlaggedApi("android.webkit.update_service_ipc_wrapper")
public final class WebViewUpdateManager {
    public WebViewUpdateManager(android.webkit.IWebViewUpdateService p0) {}
    @android.annotation.SuppressLint("ManagerLookup")
    @android.annotation.NonNull
    public static android.webkit.WebViewUpdateManager getInstance() { return null; }
    @android.annotation.NonNull
    public android.webkit.WebViewProviderResponse waitForAndGetProvider() { return null; }
    @android.annotation.Nullable
    public android.content.pm.PackageInfo getCurrentWebViewPackage() { return null; }
    @android.annotation.SuppressLint({"ParcelableList", "ArrayReturn"})
    @android.annotation.NonNull
    public android.webkit.WebViewProviderInfo[] getAllWebViewPackages() { return null; }
    @android.annotation.SuppressLint({"ParcelableList", "ArrayReturn"})
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS")
    @android.annotation.NonNull
    public android.webkit.WebViewProviderInfo[] getValidWebViewPackages() { return null; }
    @android.annotation.Nullable
    public java.lang.String getCurrentWebViewPackageName() { return null; }
    @android.annotation.RequiresPermission("android.permission.WRITE_SECURE_SETTINGS")
    @android.annotation.Nullable
    public java.lang.String changeProviderAndSetting(java.lang.String p0) { return null; }
    void notifyRelroCreationCompleted() {}
    @android.annotation.FlaggedApi("android.webkit.update_service_v2")
    @android.annotation.NonNull
    public android.webkit.WebViewProviderInfo getDefaultWebViewPackage() { return null; }
}
