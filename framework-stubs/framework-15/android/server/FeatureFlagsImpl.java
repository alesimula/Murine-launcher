package android.server;

public final class FeatureFlagsImpl implements android.server.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean removeTextService() { return false; }
    public boolean telemetryApisService() { return false; }
}
