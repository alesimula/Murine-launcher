package com.android.server.display.feature.flags;

public interface FeatureFlags {
    public boolean alwaysRotateDisplayDevice();
    public boolean autoBrightnessModes();
    public boolean backUpSmoothDisplayAndForcePeakRefreshRate();
    public boolean brightnessIntRangeUserPerception();
    public boolean brightnessWearBedtimeModeClamper();
    public boolean enableAdaptiveToneImprovements1();
    public boolean enableAdaptiveToneImprovements2();
    public boolean enableConnectedDisplayErrorHandling();
    public boolean enableConnectedDisplayManagement();
    public boolean enableDisplayOffload();
    public boolean enableDisplayResolutionRangeVoting();
    public boolean enableDisplaysRefreshRatesSynchronization();
    public boolean enableHdrClamper();
    public boolean enableModeLimitForExternalDisplay();
    public boolean enableNbmController();
    public boolean enablePeakRefreshRatePhysicalLimit();
    public boolean enablePixelAnisotropyCorrection();
    public boolean enablePortInDisplayLayout();
    public boolean enablePowerThrottlingClamper();
    public boolean enableRestrictDisplayModes();
    public boolean enableSynthetic60hzModes();
    public boolean enableUserPreferredModeVote();
    public boolean enableVsyncLowLightVote();
    public boolean enableVsyncLowPowerVote();
    public boolean evenDimmer();
    public boolean fastHdrTransitions();
    public boolean idleScreenRefreshRateTimeout();
    public boolean ignoreAppPreferredRefreshRateRequest();
    public boolean offloadControlsDozeAutoBrightness();
    public boolean offloadDozeOverrideHoldsWakelock();
    public boolean refactorDisplayPowerController();
    public boolean refreshRateVotingTelemetry();
    public boolean resolutionBackupRestore();
    public boolean sensorBasedBrightnessThrottling();
    public boolean useFusionProxSensor();
}
