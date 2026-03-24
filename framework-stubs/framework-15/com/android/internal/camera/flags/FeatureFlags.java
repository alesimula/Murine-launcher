package com.android.internal.camera.flags;

public interface FeatureFlags {
    public boolean analytics24q3();
    public boolean cachePermissionServices();
    public boolean calculatePerfOverrideDuringSessionSupport();
    public boolean cameraAeModeLowLightBoost();
    public boolean cameraDeviceSetup();
    public boolean cameraExtensionsCharacteristicsGet();
    public boolean cameraHsumPermission();
    public boolean cameraManualFlashStrengthControl();
    public boolean cameraPrivacyAllowlist();
    public boolean checkSessionSupportBeforeSessionChar();
    public boolean concertMode();
    public boolean concertModeApi();
    public boolean delayLazyHalInstantiation();
    public boolean extension10Bit();
    public boolean featureCombinationQuery();
    public boolean injectSessionParams();
    public boolean lazyAidlWaitForService();
    public boolean logUltrawideUsage();
    public boolean logZoomOverrideUsage();
    public boolean multiResRawReprocessing();
    public boolean multiresolutionImagereaderUsageConfig();
    public boolean realtimePriorityBump();
    public boolean returnBuffersOutsideLocks();
    public boolean sessionHalBufManager();
    public boolean singleThreadExecutor();
    public boolean surfaceIpc();
    public boolean surfaceLeakFix();
    public boolean useRoBoardApiLevelForVndkVersion();
    public boolean useSystemApiForVndkVersion();
    public boolean watchForegroundChanges();
}
