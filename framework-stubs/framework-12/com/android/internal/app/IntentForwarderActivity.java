package com.android.internal.app;

public class IntentForwarderActivity extends android.app.Activity {
    public static java.lang.String TAG;
    public static java.lang.String FORWARD_INTENT_TO_PARENT;
    public static java.lang.String FORWARD_INTENT_TO_MANAGED_PROFILE;
    private static final java.util.Set<java.lang.String> ALLOWED_TEXT_MESSAGE_SCHEMES = null;
    private static final java.lang.String TEL_SCHEME = "tel";
    private static final android.content.ComponentName RESOLVER_COMPONENT_NAME = null;
    private com.android.internal.app.IntentForwarderActivity.Injector mInjector;
    private com.android.internal.logging.MetricsLogger mMetricsLogger;
    protected java.util.concurrent.ExecutorService mExecutorService;
    public IntentForwarderActivity() { super(); }
    protected void onDestroy() {}
    protected void onCreate(android.os.Bundle p0) {}
    private boolean isIntentForwarderResolveInfo(android.content.pm.ResolveInfo p0) { return false; }
    private boolean isResolverActivityResolveInfo(android.content.pm.ResolveInfo p0) { return false; }
    private void maybeShowDisclosure(android.content.Intent p0, android.content.pm.ResolveInfo p1, int p2) {}
    private void startActivityAsCaller(android.content.Intent p0, int p1) {}
    private void launchChooserActivityWithCorrectTab(android.content.Intent p0, java.lang.String p1) {}
    private void launchResolverActivityWithCorrectTab(android.content.Intent p0, java.lang.String p1, android.content.Intent p2, int p3, int p4) {}
    private int findSelectedProfile(java.lang.String p0) { return 0; }
    private boolean shouldShowDisclosure(android.content.pm.ResolveInfo p0, android.content.Intent p1) { return false; }
    private boolean isDeviceProvisioned() { return false; }
    private boolean isTextMessageIntent(android.content.Intent p0) { return false; }
    private boolean isDialerIntent(android.content.Intent p0) { return false; }
    private boolean isViewActionIntent(android.content.Intent p0) { return false; }
    private boolean isTargetResolverOrChooserActivity(android.content.pm.ActivityInfo p0) { return false; }
    static android.content.Intent canForward(android.content.Intent p0, int p1, int p2, android.content.pm.IPackageManager p3, android.content.ContentResolver p4) { return null; }
    private int getManagedProfile() { return 0; }
    private int getProfileParent() { return 0; }
    private static void sanitizeIntent(android.content.Intent p0) {}
    protected com.android.internal.logging.MetricsLogger getMetricsLogger() { return null; }
    protected com.android.internal.app.IntentForwarderActivity.Injector createInjector() { return null; }

    public static interface Injector {
        public android.content.pm.IPackageManager getIPackageManager();
        public android.os.UserManager getUserManager();
        public android.content.pm.PackageManager getPackageManager();
        public java.util.concurrent.CompletableFuture<android.content.pm.ResolveInfo> resolveActivityAsUser(android.content.Intent p0, int p1, int p2);
        public void showToast(int p0, int p1);
    }

    private class InjectorImpl implements com.android.internal.app.IntentForwarderActivity.Injector {
        private InjectorImpl(com.android.internal.app.IntentForwarderActivity p0) {}
        public android.content.pm.IPackageManager getIPackageManager() { return null; }
        public android.os.UserManager getUserManager() { return null; }
        public android.content.pm.PackageManager getPackageManager() { return null; }
        public java.util.concurrent.CompletableFuture<android.content.pm.ResolveInfo> resolveActivityAsUser(android.content.Intent p0, int p1, int p2) { return null; }
        public void showToast(int p0, int p1) {}
    }
}
