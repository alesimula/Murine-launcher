package android.app.usage;

public interface FeatureFlags {
    public boolean filterBasedEventQueryApi();
    public boolean getAppArtManagedBytes();
    public boolean getAppBytesByDataTypeApi();
    public boolean reportUsageStatsPermission();
    public boolean useDedicatedHandlerThread();
    public boolean useParceledList();
    public boolean userInteractionTypeApi();
}
