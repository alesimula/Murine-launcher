package android.companion.virtualdevice.flags;

public final class FeatureFlagsImpl implements android.companion.virtualdevice.flags.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean cameraDeviceAwareness() { return false; }
    public boolean deviceAwareDrm() { return false; }
    public boolean deviceAwareRecordAudioPermission() { return false; }
    public boolean intentInterceptionActionMatchingFix() { return false; }
    public boolean metricsCollection() { return false; }
    public boolean virtualCameraServiceDiscovery() { return false; }
    public boolean virtualDisplayMultiWindowModeSupport() { return false; }
}
