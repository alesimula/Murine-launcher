package com.android.server.power.feature.flags;

public interface FeatureFlags {
    public boolean disableFrozenProcessWakelocks();
    public boolean enableAppWakelockDataSource();
    public boolean enableEarlyScreenTimeoutDetector();
    public boolean enableScreenTimeoutPolicyListenerApi();
    public boolean forceDisableWakelocks();
    public boolean improveWakelockLatency();
    public boolean moveWscLoggingToNotifier();
    public boolean perDisplayWakeByTouch();
    public boolean policyReasonInDisplayPowerRequest();
    public boolean wakelockAttributionViaWorkchain();
}
