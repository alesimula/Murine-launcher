package com.android.internal.camera.flags;

public interface FeatureFlags {
    public boolean aePriority();
    public boolean analytics24q3();
    public boolean cameraAeModeLowLightBoost();
    public boolean cameraDeviceSetup();
    public boolean cameraExtensionsCharacteristicsGet();
    public boolean cameraHeifGainmap();
    public boolean cameraHsumPermission();
    public boolean cameraManualFlashStrengthControl();
    public boolean cameraMultiClient();
    public boolean cameraPrivacyAllowlist();
    public boolean colorTemperature();
    public boolean concertMode();
    public boolean dataDeliveryPermissionChecks();
    public boolean depthJpegExtensions();
    public boolean desktopEffects();
    public boolean dumpsysRequestStreamIds();
    public boolean enableHalAbortFromCameraservicewatchdog();
    public boolean enableStreamReconfigurationForUnchangedStreams();
    public boolean extension10Bit();
    public boolean featureCombinationBaklava();
    public boolean featureCombinationQuery();
    public boolean fmqMetadata();
    public boolean injectSessionParams();
    public boolean mirrorModeSharedSurfaces();
    public boolean multiresolutionImagereaderUsageConfig();
    public boolean multiresolutionImagereaderUsagePublic();
    public boolean nightModeIndicator();
    public boolean outputConfigurationGetter();
    public boolean returnBuffersOutsideLocks();
    public boolean zoomMethod();
}
