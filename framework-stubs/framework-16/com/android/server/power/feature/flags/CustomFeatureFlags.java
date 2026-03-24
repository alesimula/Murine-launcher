package com.android.server.power.feature.flags;

public class CustomFeatureFlags implements com.android.server.power.feature.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.server.power.feature.flags.FeatureFlags>> p0) {}
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
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.server.power.feature.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
