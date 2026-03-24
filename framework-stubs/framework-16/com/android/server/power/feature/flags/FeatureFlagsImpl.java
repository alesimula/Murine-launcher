package com.android.server.power.feature.flags;

public final class FeatureFlagsImpl implements com.android.server.power.feature.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean disableFrozenProcessWakelocks() { return false; }
    public boolean enableAppWakelockDataSource() { return false; }
    public boolean enableEarlyScreenTimeoutDetector() { return false; }
    public boolean enableScreenTimeoutPolicyListenerApi() { return false; }
    public boolean forceDisableWakelocks() { return false; }
    public boolean improveWakelockLatency() { return false; }
    public boolean moveWscLoggingToNotifier() { return false; }
    public boolean perDisplayWakeByTouch() { return false; }
    public boolean policyReasonInDisplayPowerRequest() { return false; }
    public boolean wakelockAttributionViaWorkchain() { return false; }
}
