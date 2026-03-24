package com.android.server.display.feature.flags;

public class CustomFeatureFlags implements com.android.server.display.feature.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<com.android.server.display.feature.flags.FeatureFlags>> p0) {}
    public boolean alwaysRotateDisplayDevice() { return false; }
    public boolean autoBrightnessModes() { return false; }
    public boolean backUpSmoothDisplayAndForcePeakRefreshRate() { return false; }
    public boolean brightnessIntRangeUserPerception() { return false; }
    public boolean brightnessWearBedtimeModeClamper() { return false; }
    public boolean enableAdaptiveToneImprovements1() { return false; }
    public boolean enableAdaptiveToneImprovements2() { return false; }
    public boolean enableConnectedDisplayErrorHandling() { return false; }
    public boolean enableConnectedDisplayManagement() { return false; }
    public boolean enableDisplayOffload() { return false; }
    public boolean enableDisplayResolutionRangeVoting() { return false; }
    public boolean enableDisplaysRefreshRatesSynchronization() { return false; }
    public boolean enableHdrClamper() { return false; }
    public boolean enableModeLimitForExternalDisplay() { return false; }
    public boolean enableNbmController() { return false; }
    public boolean enablePeakRefreshRatePhysicalLimit() { return false; }
    public boolean enablePixelAnisotropyCorrection() { return false; }
    public boolean enablePortInDisplayLayout() { return false; }
    public boolean enablePowerThrottlingClamper() { return false; }
    public boolean enableRestrictDisplayModes() { return false; }
    public boolean enableSynthetic60hzModes() { return false; }
    public boolean enableUserPreferredModeVote() { return false; }
    public boolean enableVsyncLowLightVote() { return false; }
    public boolean enableVsyncLowPowerVote() { return false; }
    public boolean evenDimmer() { return false; }
    public boolean fastHdrTransitions() { return false; }
    public boolean idleScreenRefreshRateTimeout() { return false; }
    public boolean ignoreAppPreferredRefreshRateRequest() { return false; }
    public boolean offloadControlsDozeAutoBrightness() { return false; }
    public boolean offloadDozeOverrideHoldsWakelock() { return false; }
    public boolean refactorDisplayPowerController() { return false; }
    public boolean refreshRateVotingTelemetry() { return false; }
    public boolean resolutionBackupRestore() { return false; }
    public boolean sensorBasedBrightnessThrottling() { return false; }
    public boolean useFusionProxSensor() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<com.android.server.display.feature.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
