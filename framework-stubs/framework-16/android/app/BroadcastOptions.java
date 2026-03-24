package android.app;

public class BroadcastOptions extends android.app.ComponentOptions {
    public static final long CHANGE_INVALID = -9223372036854775808L;
    public static final long CHANGE_ALWAYS_ENABLED = 209888056L;
    public static final long CHANGE_ALWAYS_DISABLED = 210856463L;
    public static final java.lang.String KEY_REQUIRE_ALL_OF_PERMISSIONS = "android:broadcast.requireAllOfPermissions";
    public static final java.lang.String KEY_REQUIRE_NONE_OF_PERMISSIONS = "android:broadcast.requireNoneOfPermissions";
    @java.lang.Deprecated
    public static final int TEMPORARY_WHITELIST_TYPE_FOREGROUND_SERVICE_ALLOWED = 0;
    @java.lang.Deprecated
    public static final int TEMPORARY_WHITELIST_TYPE_FOREGROUND_SERVICE_NOT_ALLOWED = 1;
    public static final int DELIVERY_GROUP_POLICY_ALL = 0;
    public static final int DELIVERY_GROUP_POLICY_MOST_RECENT = 1;
    public static final int DELIVERY_GROUP_POLICY_MERGED = 2;
    public static final int DEFERRAL_POLICY_DEFAULT = 0;
    public static final int DEFERRAL_POLICY_NONE = 1;
    public static final int DEFERRAL_POLICY_UNTIL_ACTIVE = 2;
    @android.annotation.NonNull
    public static android.app.BroadcastOptions makeBasic() { return null; }
    public BroadcastOptions() { super(); }
    public BroadcastOptions(android.os.Bundle p0) { super(); }
    @android.annotation.NonNull
    public static android.app.BroadcastOptions makeWithDeferUntilActive(boolean p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.CHANGE_DEVICE_IDLE_TEMP_WHITELIST", "android.permission.START_ACTIVITIES_FROM_BACKGROUND", "android.permission.START_FOREGROUND_SERVICES_FROM_BACKGROUND"})
    public void setTemporaryAppWhitelistDuration(long p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission(anyOf={"android.permission.CHANGE_DEVICE_IDLE_TEMP_WHITELIST", "android.permission.START_ACTIVITIES_FROM_BACKGROUND", "android.permission.START_FOREGROUND_SERVICES_FROM_BACKGROUND"})
    public void setTemporaryAppAllowlist(long p0, int p1, int p2, java.lang.String p3) {}
    public long getTemporaryAppAllowlistDuration() { return 0L; }
    public int getTemporaryAppAllowlistType() { return 0; }
    public int getTemporaryAppAllowlistReasonCode() { return 0; }
    @android.annotation.Nullable
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
    @android.annotation.SystemApi
    public void setDontSendToRestrictedApps(boolean p0) {}
    public boolean isDontSendToRestrictedApps() { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.START_ACTIVITIES_FROM_BACKGROUND")
    public void setBackgroundActivityStartsAllowed(boolean p0) {}
    @java.lang.Deprecated
    public boolean allowsBackgroundActivityStarts() { return false; }
    @android.annotation.SystemApi
    public void setRequireAllOfPermissions(java.lang.String[] p0) {}
    @android.annotation.SystemApi
    public void setRequireNoneOfPermissions(java.lang.String[] p0) {}
    @android.annotation.SystemApi
    public void setRequireCompatChange(long p0, boolean p1) {}
    @android.annotation.SystemApi
    public void clearRequireCompatChange() {}
    public void setAlarmBroadcast(boolean p0) {}
    public boolean isAlarmBroadcast() { return false; }
    @android.annotation.NonNull
    public android.app.BroadcastOptions setShareIdentityEnabled(boolean p0) { return null; }
    public boolean isShareIdentityEnabled() { return false; }
    public boolean isPushMessagingBroadcast() { return false; }
    public boolean isPushMessagingOverQuotaBroadcast() { return false; }
    public long getRequireCompatChangeId() { return 0L; }
    public boolean testRequireCompatChange(int p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ACCESS_BROADCAST_RESPONSE_STATS")
    public void recordResponseEventWhileInBackground(long p0) {}
    public long getIdForResponseEvent() { return 0L; }
    @android.annotation.NonNull
    public android.app.BroadcastOptions setDeferralPolicy(int p0) { return null; }
    public int getDeferralPolicy() { return 0; }
    public void clearDeferralPolicy() {}
    @android.annotation.NonNull
    public android.app.BroadcastOptions setDeliveryGroupPolicy(int p0) { return null; }
    public int getDeliveryGroupPolicy() { return 0; }
    public void clearDeliveryGroupPolicy() {}
    @android.annotation.NonNull
    public android.app.BroadcastOptions setDeliveryGroupMatchingKey(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.Nullable
    public java.lang.String getDeliveryGroupMatchingKey() { return null; }
    @android.annotation.Nullable
    public java.lang.String getDeliveryGroupMatchingNamespaceFragment() { return null; }
    @android.annotation.Nullable
    public java.lang.String getDeliveryGroupMatchingKeyFragment() { return null; }
    public void clearDeliveryGroupMatchingKey() {}
    @android.annotation.NonNull
    public android.app.BroadcastOptions setDeliveryGroupMatchingFilter(android.content.IntentFilter p0) { return null; }
    @android.annotation.Nullable
    public android.content.IntentFilter getDeliveryGroupMatchingFilter() { return null; }
    public void clearDeliveryGroupMatchingFilter() {}
    @android.annotation.NonNull
    public android.app.BroadcastOptions setDeliveryGroupExtrasMerger(android.os.BundleMerger p0) { return null; }
    @android.annotation.Nullable
    public android.os.BundleMerger getDeliveryGroupExtrasMerger() { return null; }
    public void clearDeliveryGroupExtrasMerger() {}
    @android.annotation.RequiresPermission("android.permission.BROADCAST_OPTION_INTERACTIVE")
    @android.annotation.NonNull
    public android.app.BroadcastOptions setInteractive(boolean p0) { return null; }
    @android.annotation.RequiresPermission("android.permission.BROADCAST_OPTION_INTERACTIVE")
    public boolean isInteractive() { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public void setPendingIntentBackgroundActivityLaunchAllowed(boolean p0) {}
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public boolean isPendingIntentBackgroundActivityLaunchAllowed() { return false; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public android.app.BroadcastOptions setPendingIntentBackgroundActivityStartMode(int p0) { return null; }
    @android.annotation.SystemApi
    public int getPendingIntentBackgroundActivityStartMode() { return 0; }
    @android.annotation.NonNull
    public android.app.BroadcastOptions setDebugLogEnabled(boolean p0) { return null; }
    public boolean isDebugLogEnabled() { return false; }
    @android.annotation.NonNull
    public android.os.Bundle toBundle() { return null; }
    @android.annotation.NonNull
    public static android.app.BroadcastOptions fromBundle(android.os.Bundle p0) { return null; }
    @android.annotation.Nullable
    public static android.app.BroadcastOptions fromBundleNullable(android.os.Bundle p0) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeferralPolicy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeliveryGroupPolicy {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Flags {
    }
}
