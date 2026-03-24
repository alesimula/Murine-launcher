package com.android.internal.hidden_from_bootclasspath.com.android.server.flags;

public class CustomFeatureFlags implements com.android.internal.hidden_from_bootclasspath.com.android.server.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.server.flags.FeatureFlags>> p0) {}
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
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.internal.hidden_from_bootclasspath.com.android.server.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
