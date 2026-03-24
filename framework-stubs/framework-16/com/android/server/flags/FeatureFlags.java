package com.android.server.flags;

public interface FeatureFlags {
    public boolean certpininstallerRemoval();
    public boolean datetimeNotifications();
    public boolean disableSystemCompaction();
    public boolean earlyDataManagerInit();
    public boolean keystoreInMemoryCleanup();
    public boolean modifierShortcutManagerMultiuser();
    public boolean pinGlobalQuota();
    public boolean pinWebview();
    public boolean pkgTargetedBatteryChangedNotSticky();
    public boolean rateLimitBatteryChangedBroadcast();
}
