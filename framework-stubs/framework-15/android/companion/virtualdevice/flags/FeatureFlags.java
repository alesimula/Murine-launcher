package android.companion.virtualdevice.flags;

public interface FeatureFlags {
    public boolean cameraDeviceAwareness();
    public boolean deviceAwareDrm();
    public boolean deviceAwareRecordAudioPermission();
    public boolean intentInterceptionActionMatchingFix();
    public boolean metricsCollection();
    public boolean virtualCameraServiceDiscovery();
    public boolean virtualDisplayMultiWindowModeSupport();
}
