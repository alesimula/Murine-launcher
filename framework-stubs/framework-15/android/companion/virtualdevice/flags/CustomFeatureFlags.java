package android.companion.virtualdevice.flags;

public class CustomFeatureFlags implements android.companion.virtualdevice.flags.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.companion.virtualdevice.flags.FeatureFlags>> p0) {}
    public boolean cameraDeviceAwareness() { return false; }
    public boolean deviceAwareDrm() { return false; }
    public boolean deviceAwareRecordAudioPermission() { return false; }
    public boolean intentInterceptionActionMatchingFix() { return false; }
    public boolean metricsCollection() { return false; }
    public boolean virtualCameraServiceDiscovery() { return false; }
    public boolean virtualDisplayMultiWindowModeSupport() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.companion.virtualdevice.flags.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}
