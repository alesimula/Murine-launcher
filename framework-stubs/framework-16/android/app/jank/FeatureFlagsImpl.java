package android.app.jank;

public final class FeatureFlagsImpl implements android.app.jank.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean detailedAppJankMetricsApi() { return false; }
    public boolean detailedAppJankMetricsLoggingEnabled() { return false; }
    public boolean viewrootChoreographer() { return false; }
}
