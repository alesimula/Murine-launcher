package android.hardware.location;

@android.annotation.SystemApi
public final class ContextHubManager {
    public static final java.lang.String EXTRA_CLIENT_AUTHORIZATION_STATE = "android.hardware.location.extra.CLIENT_AUTHORIZATION_STATE";
    public static final java.lang.String EXTRA_CONTEXT_HUB_INFO = "android.hardware.location.extra.CONTEXT_HUB_INFO";
    public static final java.lang.String EXTRA_EVENT_TYPE = "android.hardware.location.extra.EVENT_TYPE";
    public static final java.lang.String EXTRA_NANOAPP_ID = "android.hardware.location.extra.NANOAPP_ID";
    public static final java.lang.String EXTRA_NANOAPP_ABORT_CODE = "android.hardware.location.extra.NANOAPP_ABORT_CODE";
    public static final java.lang.String EXTRA_MESSAGE = "android.hardware.location.extra.MESSAGE";
    public static final int AUTHORIZATION_DENIED = 0;
    public static final int AUTHORIZATION_DENIED_GRACE_PERIOD = 1;
    public static final int AUTHORIZATION_GRANTED = 2;
    public static final int EVENT_NANOAPP_LOADED = 0;
    public static final int EVENT_NANOAPP_UNLOADED = 1;
    public static final int EVENT_NANOAPP_ENABLED = 2;
    public static final int EVENT_NANOAPP_DISABLED = 3;
    public static final int EVENT_NANOAPP_ABORTED = 4;
    public static final int EVENT_NANOAPP_MESSAGE = 5;
    public static final int EVENT_HUB_RESET = 6;
    public static final int EVENT_CLIENT_AUTHORIZATION = 7;
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public int[] getContextHubHandles() { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public android.hardware.location.ContextHubInfo getContextHubInfo(int p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public int loadNanoApp(int p0, android.hardware.location.NanoApp p1) { return 0; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public int unloadNanoApp(int p0) { return 0; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public android.hardware.location.NanoAppInstanceInfo getNanoAppInstanceInfo(int p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public int[] findNanoAppOnHub(int p0, android.hardware.location.NanoAppFilter p1) { return null; }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public int sendMessage(int p0, int p1, android.hardware.location.ContextHubMessage p2) { return 0; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public java.util.List<android.hardware.location.ContextHubInfo> getContextHubs() { return null; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public android.hardware.location.ContextHubTransaction<java.lang.Void> loadNanoApp(android.hardware.location.ContextHubInfo p0, android.hardware.location.NanoAppBinary p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public android.hardware.location.ContextHubTransaction<java.lang.Void> unloadNanoApp(android.hardware.location.ContextHubInfo p0, long p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public android.hardware.location.ContextHubTransaction<java.lang.Void> enableNanoApp(android.hardware.location.ContextHubInfo p0, long p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public android.hardware.location.ContextHubTransaction<java.lang.Void> disableNanoApp(android.hardware.location.ContextHubInfo p0, long p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public android.hardware.location.ContextHubTransaction<java.util.List<android.hardware.location.NanoAppState>> queryNanoApps(android.hardware.location.ContextHubInfo p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.SuppressLint("RequiresPermission")
    public int registerCallback(android.hardware.location.ContextHubManager.Callback p0) { return 0; }
    @java.lang.Deprecated
    public int registerCallback(android.hardware.location.ContextHubManager.ICallback p0) { return 0; }
    @java.lang.Deprecated
    @android.annotation.SuppressLint("RequiresPermission")
    public int registerCallback(android.hardware.location.ContextHubManager.Callback p0, android.os.Handler p1) { return 0; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public android.hardware.location.ContextHubClient createClient(android.content.Context p0, android.hardware.location.ContextHubInfo p1, java.util.concurrent.Executor p2, android.hardware.location.ContextHubClientCallback p3) { return null; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public android.hardware.location.ContextHubClient createClient(android.hardware.location.ContextHubInfo p0, android.hardware.location.ContextHubClientCallback p1, java.util.concurrent.Executor p2) { return null; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public android.hardware.location.ContextHubClient createClient(android.hardware.location.ContextHubInfo p0, android.hardware.location.ContextHubClientCallback p1) { return null; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public android.hardware.location.ContextHubClient createClient(android.content.Context p0, android.hardware.location.ContextHubInfo p1, android.app.PendingIntent p2, long p3) { return null; }
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXT_HUB")
    public android.hardware.location.ContextHubClient createClient(android.hardware.location.ContextHubInfo p0, android.app.PendingIntent p1, long p2) { return null; }
    @java.lang.Deprecated
    @android.annotation.SuppressLint("RequiresPermission")
    public int unregisterCallback(android.hardware.location.ContextHubManager.Callback p0) { return 0; }
    @java.lang.Deprecated
    public synchronized int unregisterCallback(android.hardware.location.ContextHubManager.ICallback p0) { return 0; }
    public ContextHubManager(android.content.Context p0, android.os.Looper p1) throws android.os.ServiceManager.ServiceNotFoundException {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AuthorizationState {
    }

    @java.lang.Deprecated
    public static abstract class Callback {
        protected Callback() {}
        public abstract void onMessageReceipt(int p0, int p1, android.hardware.location.ContextHubMessage p2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Event {
    }

    @java.lang.Deprecated
    public static interface ICallback {
        public void onMessageReceipt(int p0, int p1, android.hardware.location.ContextHubMessage p2);
    }
}
