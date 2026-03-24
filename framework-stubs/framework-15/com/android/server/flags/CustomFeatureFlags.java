package com.android.server.flags;

public class CustomFeatureFlags implements com.android.server.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.server.flags.FeatureFlags>> p0) {}
    public boolean disableSystemCompaction() { return false; }
    public boolean enableOdpFeatureGuard() { return false; }
    public boolean newBugreportKeyboardShortcut() { return false; }
    public boolean pinWebview() { return false; }
    public boolean pkgTargetedBatteryChangedNotSticky() { return false; }
    public boolean skipHomeArtPins() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.server.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
