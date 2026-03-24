package com.android.internal.app;

public class IntentForwarderActivity extends android.app.Activity {
    public static java.lang.String TAG;
    public static java.lang.String FORWARD_INTENT_TO_PARENT;
    public static java.lang.String FORWARD_INTENT_TO_MANAGED_PROFILE;
    public static final java.lang.String EXTRA_SKIP_USER_CONFIRMATION = "com.android.internal.app.EXTRA_SKIP_USER_CONFIRMATION";
    protected java.util.concurrent.ExecutorService mExecutorService;
    public IntentForwarderActivity() { super(); }
    protected void onDestroy() {}
    protected void onCreate(android.os.Bundle p0) {}
    static android.content.Intent canForward(android.content.Intent p0, int p1, int p2, android.content.pm.IPackageManager p3, android.content.ContentResolver p4) { return null; }
    protected com.android.internal.logging.MetricsLogger getMetricsLogger() { return null; }
    protected com.android.internal.app.IntentForwarderActivity.Injector createInjector() { return null; }

    public static interface Injector {
        public android.content.pm.IPackageManager getIPackageManager();
        public android.os.UserManager getUserManager();
        public android.content.pm.PackageManager getPackageManager();
        public java.util.concurrent.CompletableFuture<android.content.pm.ResolveInfo> resolveActivityAsUser(android.content.Intent p0, int p1, int p2);
        public void showToast(java.lang.String p0, int p1);
    }

    private class InjectorImpl implements com.android.internal.app.IntentForwarderActivity.Injector {
        public android.content.pm.IPackageManager getIPackageManager() { return null; }
        public android.os.UserManager getUserManager() { return null; }
        public android.content.pm.PackageManager getPackageManager() { return null; }
        @android.annotation.Nullable
        public java.util.concurrent.CompletableFuture<android.content.pm.ResolveInfo> resolveActivityAsUser(android.content.Intent p0, int p1, int p2) { return null; }
        public void showToast(java.lang.String p0, int p1) {}
    }
}
