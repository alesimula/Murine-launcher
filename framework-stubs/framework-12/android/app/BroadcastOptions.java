package android.app;

@android.annotation.SystemApi
public class BroadcastOptions {
    private long mTemporaryAppAllowlistDuration;
    private int mTemporaryAppAllowlistType;
    private int mTemporaryAppAllowlistReasonCode;
    private java.lang.String mTemporaryAppAllowlistReason;
    private int mMinManifestReceiverApiLevel;
    private int mMaxManifestReceiverApiLevel;
    private boolean mDontSendToRestrictedApps;
    private boolean mAllowBackgroundActivityStarts;
    private static final java.lang.String KEY_TEMPORARY_APP_ALLOWLIST_DURATION = "android:broadcast.temporaryAppAllowlistDuration";
    private static final java.lang.String KEY_TEMPORARY_APP_ALLOWLIST_TYPE = "android:broadcast.temporaryAppAllowlistType";
    private static final java.lang.String KEY_TEMPORARY_APP_ALLOWLIST_REASON_CODE = "android:broadcast.temporaryAppAllowlistReasonCode";
    private static final java.lang.String KEY_TEMPORARY_APP_ALLOWLIST_REASON = "android:broadcast.temporaryAppAllowlistReason";
    private static final java.lang.String KEY_MIN_MANIFEST_RECEIVER_API_LEVEL = "android:broadcast.minManifestReceiverApiLevel";
    private static final java.lang.String KEY_MAX_MANIFEST_RECEIVER_API_LEVEL = "android:broadcast.maxManifestReceiverApiLevel";
    private static final java.lang.String KEY_DONT_SEND_TO_RESTRICTED_APPS = "android:broadcast.dontSendToRestrictedApps";
    private static final java.lang.String KEY_ALLOW_BACKGROUND_ACTIVITY_STARTS = "android:broadcast.allowBackgroundActivityStarts";
    @java.lang.Deprecated
    public static final int TEMPORARY_WHITELIST_TYPE_FOREGROUND_SERVICE_ALLOWED = 0;
    @java.lang.Deprecated
    public static final int TEMPORARY_WHITELIST_TYPE_FOREGROUND_SERVICE_NOT_ALLOWED = 1;
    public static android.app.BroadcastOptions makeBasic() { return null; }
    private BroadcastOptions() {}
    public BroadcastOptions(android.os.Bundle p0) {}
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.CHANGE_DEVICE_IDLE_TEMP_WHITELIST", "android.permission.START_ACTIVITIES_FROM_BACKGROUND", "android.permission.START_FOREGROUND_SERVICES_FROM_BACKGROUND"})
    public void setTemporaryAppWhitelistDuration(long p0) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.CHANGE_DEVICE_IDLE_TEMP_WHITELIST", "android.permission.START_ACTIVITIES_FROM_BACKGROUND", "android.permission.START_FOREGROUND_SERVICES_FROM_BACKGROUND"})
    public void setTemporaryAppAllowlist(long p0, int p1, int p2, java.lang.String p3) {}
    private boolean isTemporaryAppAllowlistSet() { return false; }
    private void resetTemporaryAppAllowlist() {}
    public long getTemporaryAppAllowlistDuration() { return 0L; }
    public int getTemporaryAppAllowlistType() { return 0; }
    public int getTemporaryAppAllowlistReasonCode() { return 0; }
    public java.lang.String getTemporaryAppAllowlistReason() { return null; }
    public void setMinManifestReceiverApiLevel(int p0) {}
    public int getMinManifestReceiverApiLevel() { return 0; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public void setMaxManifestReceiverApiLevel(int p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    public int getMaxManifestReceiverApiLevel() { return 0; }
    public void setDontSendToRestrictedApps(boolean p0) {}
    public boolean isDontSendToRestrictedApps() { return false; }
    @android.annotation.RequiresPermission("android.permission.START_ACTIVITIES_FROM_BACKGROUND")
    public void setBackgroundActivityStartsAllowed(boolean p0) {}
    public boolean allowsBackgroundActivityStarts() { return false; }
    public android.os.Bundle toBundle() { return null; }
}
