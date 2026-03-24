package com.android.server.flags;

public final class FeatureFlagsImpl implements com.android.server.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean certpininstallerRemoval() { return false; }
    public boolean datetimeNotifications() { return false; }
    public boolean disableSystemCompaction() { return false; }
    public boolean earlyDataManagerInit() { return false; }
    public boolean keystoreInMemoryCleanup() { return false; }
    public boolean modifierShortcutManagerMultiuser() { return false; }
    public boolean pinGlobalQuota() { return false; }
    public boolean pinWebview() { return false; }
    public boolean pkgTargetedBatteryChangedNotSticky() { return false; }
    public boolean rateLimitBatteryChangedBroadcast() { return false; }
}
