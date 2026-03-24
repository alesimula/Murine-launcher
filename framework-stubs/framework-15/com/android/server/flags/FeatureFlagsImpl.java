package com.android.server.flags;

public final class FeatureFlagsImpl implements com.android.server.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean disableSystemCompaction() { return false; }
    public boolean enableOdpFeatureGuard() { return false; }
    public boolean newBugreportKeyboardShortcut() { return false; }
    public boolean pinWebview() { return false; }
    public boolean pkgTargetedBatteryChangedNotSticky() { return false; }
    public boolean skipHomeArtPins() { return false; }
}
