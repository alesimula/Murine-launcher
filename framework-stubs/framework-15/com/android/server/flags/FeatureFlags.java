package com.android.server.flags;

public interface FeatureFlags {
    public boolean disableSystemCompaction();
    public boolean enableOdpFeatureGuard();
    public boolean newBugreportKeyboardShortcut();
    public boolean pinWebview();
    public boolean pkgTargetedBatteryChangedNotSticky();
    public boolean skipHomeArtPins();
}
