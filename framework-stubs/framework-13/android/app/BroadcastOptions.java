package android.app;

@android.annotation.SystemApi
public class BroadcastOptions extends android.app.ComponentOptions {
    public static final long CHANGE_INVALID = -9223372036854775808L;
    public static final long CHANGE_ALWAYS_ENABLED = 209888056L;
    public static final long CHANGE_ALWAYS_DISABLED = 210856463L;
    public static final java.lang.String KEY_REQUIRE_ALL_OF_PERMISSIONS = "android:broadcast.requireAllOfPermissions";
    public static final java.lang.String KEY_REQUIRE_NONE_OF_PERMISSIONS = "android:broadcast.requireNoneOfPermissions";
    public static final java.lang.String KEY_ALARM_BROADCAST = "android:broadcast.is_alarm";
    @java.lang.Deprecated
    public static final int TEMPORARY_WHITELIST_TYPE_FOREGROUND_SERVICE_ALLOWED = 0;
    @java.lang.Deprecated
    public static final int TEMPORARY_WHITELIST_TYPE_FOREGROUND_SERVICE_NOT_ALLOWED = 1;
    public static android.app.BroadcastOptions makeBasic() { return null; }
    public BroadcastOptions(android.os.Bundle p0) { super(); }
    @java.lang.Deprecated
    @android.annotation.RequiresPermission(anyOf={"android.permission.CHANGE_DEVICE_IDLE_TEMP_WHITELIST", "android.permission.START_ACTIVITIES_FROM_BACKGROUND", "android.permission.START_FOREGROUND_SERVICES_FROM_BACKGROUND"})
    public void setTemporaryAppWhitelistDuration(long p0) {}
    @android.annotation.RequiresPermission(anyOf={"android.permission.CHANGE_DEVICE_IDLE_TEMP_WHITELIST", "android.permission.START_ACTIVITIES_FROM_BACKGROUND", "android.permission.START_FOREGROUND_SERVICES_FROM_BACKGROUND"})
    public void setTemporaryAppAllowlist(long p0, int p1, int p2, java.lang.String p3) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public void setPendingIntentBackgroundActivityLaunchAllowed(boolean p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
    public boolean isPendingIntentBackgroundActivityLaunchAllowed() { return false; }
    public long getTemporaryAppAllowlistDuration() { return 0L; }
    public int getTemporaryAppAllowlistType() { return 0; }
    public int getTemporaryAppAllowlistReasonCode() { return 0; }
    public java.lang.String getTemporaryAppAllowlistReason() { return null; }
    @java.lang.Deprecated
    public void setMinManifestReceiverApiLevel(int p0) {}
    @java.lang.Deprecated
    public int getMinManifestReceiverApiLevel() { return 0; }
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @java.lang.Deprecated
    public void setMaxManifestReceiverApiLevel(int p0) {}
    @android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
    @java.lang.Deprecated
    public int getMaxManifestReceiverApiLevel() { return 0; }
    public void setDontSendToRestrictedApps(boolean p0) {}
    public boolean isDontSendToRestrictedApps() { return false; }
    @android.annotation.RequiresPermission("android.permission.START_ACTIVITIES_FROM_BACKGROUND")
    public void setBackgroundActivityStartsAllowed(boolean p0) {}
    public boolean allowsBackgroundActivityStarts() { return false; }
    @android.annotation.SystemApi
    public void setRequireAllOfPermissions(java.lang.String[] p0) {}
    @android.annotation.SystemApi
    public void setRequireNoneOfPermissions(java.lang.String[] p0) {}
    public void setRequireCompatChange(long p0, boolean p1) {}
    public void clearRequireCompatChange() {}
    public void setAlarmBroadcast(boolean p0) {}
    public boolean isAlarmBroadcast() { return false; }
    public boolean isPushMessagingBroadcast() { return false; }
    public boolean isPushMessagingOverQuotaBroadcast() { return false; }
    public long getRequireCompatChangeId() { return 0L; }
    public boolean testRequireCompatChange(int p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RESPONSE_STATS")
    public void recordResponseEventWhileInBackground(long p0) {}
    public long getIdForResponseEvent() { return 0L; }
    public android.os.Bundle toBundle() { return null; }
}
