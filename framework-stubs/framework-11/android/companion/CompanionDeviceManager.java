package android.companion;

public final class CompanionDeviceManager {
    private static final boolean DEBUG = false;
    private static final java.lang.String LOG_TAG = "CompanionDeviceManager";
    public static final java.lang.String EXTRA_DEVICE = "android.companion.extra.DEVICE";
    public static final java.lang.String COMPANION_DEVICE_DISCOVERY_PACKAGE_NAME = "com.android.companiondevicemanager";
    private final android.companion.ICompanionDeviceManager mService = null;
    private final android.content.Context mContext = null;
    public CompanionDeviceManager(android.companion.ICompanionDeviceManager p0, android.content.Context p1) {}
    public void associate(android.companion.AssociationRequest p0, android.companion.CompanionDeviceManager.Callback p1, android.os.Handler p2) {}
    public java.util.List<java.lang.String> getAssociations() { return null; }
    public void disassociate(java.lang.String p0) {}
    public void requestNotificationAccess(android.content.ComponentName p0) {}
    public boolean hasNotificationAccess(android.content.ComponentName p0) { return false; }
    @android.annotation.SystemApi
    public boolean isDeviceAssociatedForWifiConnection(java.lang.String p0, android.net.MacAddress p1, android.os.UserHandle p2) { return false; }
    private boolean checkFeaturePresent() { return false; }
    private android.app.Activity getActivity() { return null; }
    private java.lang.String getCallingPackage() { return null; }

    public static abstract class Callback {
        public Callback() {}
        public abstract void onDeviceFound(android.content.IntentSender p0);
        public abstract void onFailure(java.lang.CharSequence p0);
    }

    private class CallbackProxy extends android.companion.IFindDeviceCallback.Stub implements android.app.Application.ActivityLifecycleCallbacks {
        private android.companion.CompanionDeviceManager.Callback mCallback;
        private android.os.Handler mHandler;
        private android.companion.AssociationRequest mRequest;
        final java.lang.Object mLock = null;
        private CallbackProxy(android.companion.CompanionDeviceManager p0, android.companion.AssociationRequest p1, android.companion.CompanionDeviceManager.Callback p2, android.os.Handler p3) { super(); }
        public void onSuccess(android.app.PendingIntent p0) {}
        public void onFailure(java.lang.CharSequence p0) {}
        <T extends java.lang.Object> void lockAndPost(java.util.function.BiConsumer<android.companion.CompanionDeviceManager.Callback, T> p0, T p1) {}
        public void onActivityDestroyed(android.app.Activity p0) {}
        public void onActivityCreated(android.app.Activity p0, android.os.Bundle p1) {}
        public void onActivityStarted(android.app.Activity p0) {}
        public void onActivityResumed(android.app.Activity p0) {}
        public void onActivityPaused(android.app.Activity p0) {}
        public void onActivityStopped(android.app.Activity p0) {}
        public void onActivitySaveInstanceState(android.app.Activity p0, android.os.Bundle p1) {}
    }
}
