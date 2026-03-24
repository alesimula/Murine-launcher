package android.app.usage;

public final class FeatureFlagsImpl implements android.app.usage.FeatureFlags {
    public FeatureFlagsImpl() {}
    public boolean disableIdleCheck() { return false; }
    public boolean filterBasedEventQueryApi() { return false; }
    public boolean getAppBytesByDataTypeApi() { return false; }
    public boolean reportUsageStatsPermission() { return false; }
    public boolean useDedicatedHandlerThread() { return false; }
    public boolean useParceledList() { return false; }
    public boolean userInteractionTypeApi() { return false; }
}
