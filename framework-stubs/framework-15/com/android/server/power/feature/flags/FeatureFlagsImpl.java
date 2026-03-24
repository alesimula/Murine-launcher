package com.android.server.power.feature.flags;

public final class FeatureFlagsImpl implements com.android.server.power.feature.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean enableEarlyScreenTimeoutDetector() { return false; }
    public boolean improveWakelockLatency() { return false; }
}
