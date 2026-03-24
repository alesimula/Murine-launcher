package android.webkit;

public final class FeatureFlagsImpl implements android.webkit.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean deprecateStartSafeBrowsing() { return false; }
    public boolean fileSystemAccess() { return false; }
    public boolean mainlineApis() { return false; }
    public boolean updateServiceIpcWrapper() { return false; }
    public boolean updateServiceV2() { return false; }
    public boolean useBEntryPoint() { return false; }
    public boolean userAgentReduction() { return false; }
}
